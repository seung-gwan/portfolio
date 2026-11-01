import sys


class Node:
    def __init__(self, number):
        self.number = number
        self.left = None
        self.right = None
        self.up = None


def insert(root, number):
    if root is None:
        new_node = Node(number)
        return new_node

    if number < root.number:
        root.left = insert(root.left, number)
        root.left.up = root
    else:
        root.right = insert(root.right, number)
        root.right.up = root

    return root


def main():
    nums = list(map(int, sys.stdin.readline().split()))
    if len(nums) == 1:
        return print("거리 : 0")

    root = Node(nums[0])
    seen = {nums[0]}
    for number in nums[1:]:
        if number in seen:
            return
        seen.add(number)
        insert(root, number)

    # 최솟값에서 루트로 이어지는 경로
    path_to_min = []
    node = root
    while node:
        path_to_min.append(node.number)
        if not node.left:
            break
        node = node.left
    path_to_min = path_to_min[::-1]

    # 루트의 오른쪽부터 최댓값까지 이어지는 경로
    path_to_max = []
    node = root.right
    while node:
        path_to_max.append(node.number)
        if not node.right:
            break
        node = node.right

    full_path = path_to_min + path_to_max
    print(f"경로 : {'-'.join(map(str, full_path))}, 거리 : {len(full_path)-1}")


main()

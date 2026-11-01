# 학교 문자열 실습: 문자 코드에 1을 더하고 빼는 변환입니다.
Str = input("문자열을 입력하세요 : ")
StrList = []

for i in Str:
    num = ord(i) + 1
    char = chr(num)
    StrList.append(char)

text = ""
for i in StrList:
    text += i

print("암호화된 문장 : ", text)

Str1 = input("복호화할 문장을 입력하세요 : ")
Str1List = []

for i in Str1:
    num = ord(i) - 1
    char = chr(num)
    Str1List.append(char)

text1 = ""
for i in Str1List:
    text1 += i

print("복호화된 문장 : ", text1)

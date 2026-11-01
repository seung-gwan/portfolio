using UnityEngine;

// 학교 Car_Game 실습의 입력·이동 스크립트입니다.
public class CarController : MonoBehaviour
{
    Vector2 StartPos;
    Vector2 EndPos;
    float MovePos;

    void Start()
    {
        Application.targetFrameRate = 60;
    }

    void Update()
    {
        if (Input.GetMouseButtonDown(0))
        {
            this.StartPos = Input.mousePosition;
        }
        else if (Input.GetMouseButtonUp(0))
        {
            this.EndPos = Input.mousePosition;
            this.MovePos = this.EndPos.x - this.StartPos.x;
        }

        transform.Translate(this.MovePos / 2000, 0, 0);
        MovePos *= 0.98f;
    }
}

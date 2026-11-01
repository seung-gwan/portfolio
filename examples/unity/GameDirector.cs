using UnityEngine;
using TMPro;
using UnityEngine.UIElements;
using Unity.VisualScripting;

// 학교 Car_Game 실습의 거리 UI 스크립트입니다.
public class GameDirector : MonoBehaviour
{
    GameObject car;
    GameObject flag;
    GameObject distance;

    void Start()
    {
        car = GameObject.Find("car");
        flag = GameObject.Find("flag");
        distance = GameObject.Find("Distance");
    }

    void Update()
    {
        float length = this.flag.transform.position.x - this.car.transform.position.x;
        if (length >= 0)
        {
            this.distance.GetComponent<TextMeshProUGUI>().text =
                "Distance : " + length.ToString("F2") + "m";
        }
        else
        {
            this.distance.GetComponent<TextMeshProUGUI>().text = "Game Over";
        }
    }
}

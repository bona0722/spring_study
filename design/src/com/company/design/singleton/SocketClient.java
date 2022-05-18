package com.company.design.singleton;

public class SocketClient {
    //singleton은 자기 자신을 객체로 가지고 있어야 한다. static 메소드니까 자기 자신도 static이어야 함
    private static SocketClient socketClient = null;

    //(핵심) default 생성자를 막음
    //singleton은 기본 생성자를 private로 막아줘야 한다.
    //막지 않고 public으로 한 다음 new 객체를 만들면 a와 b class가 다르게 나온다.
    //false가 떨어짐. 직접 aclass bclass에서 생성하다 보니까 다름. 단 하나의 객체가 아니다!
    //막아두고 자신만 사용할 수 있도록 해둬야 true 나옴
    private SocketClient(){}

    //객체 자체는 자기 자신을 리턴할 수 있도록 SockteClient를 리턴하도록 적어줘야 함
    //바깥에서는 static 메소드이기 때문에 getInstance()메소드에 접근이 가능하다.
    public static SocketClient getInstance(){
        if(socketClient == null){ //자신의 객체가 없으면(null) 생성해줌
            socketClient = new SocketClient();
        }
        return socketClient; //있으면 있는 걸 리턴해줌
    }

    public void connect(){
        System.out.println("connect");
    }
}
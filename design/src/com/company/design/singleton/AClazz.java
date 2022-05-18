package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        // 기본생성자에서 초기화. default생성자 막아놨으니 getInstance이용해서 할당 받음
        this.socketClient = SocketClient.getInstance();
        //SocketClient socketClient = new SocketClient(); //SocketClient에서 생성하는 게 아닌 새로운 객체를 새엇ㅇ
    }

    //return 해주는 get 메소드
    public SocketClient getSocketClient() {
        return this.socketClient;

    }
}

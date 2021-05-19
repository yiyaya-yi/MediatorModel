package Med;

/**抽象聊天室类**/
public abstract class AbstractChatroom {
         //注册同事对象的方法
          public abstract void register(Member member);
          public abstract void sendText(String from,String to,String message);
          public abstract void sendImage(String from,String to,String image);
}

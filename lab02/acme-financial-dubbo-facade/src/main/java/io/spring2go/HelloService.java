package io.spring2go;

public interface HelloService {

    String sayHello(String name);
    
    /**
     * 从数据库查询 推荐
     * @return
     */
    String getRatings(Long id);

}
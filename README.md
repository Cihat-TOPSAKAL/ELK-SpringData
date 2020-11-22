## Elasticsearch Kurulumu

* Elasticsearc'ü X-Pack ile kulanmak istiyorsanız 
Tutorial Folder'ı altında bulunan 
 [X-Pack](https://github.com/Cihat-TOPSAKAL/ELK-SpringData/blob/master/tutorial/X-Pack.md)
 Kurulumunu yapmalısınız.
 
* X-Pack kullanmadan kuruluma devam etmek için aşağıdaki adımları izleyiniz.

1. Elasticsearch Folder'ının altında bulunan 
"elasticsearch.yml" File'ını güncelleyin.

        cluster.name: <docker-cluster-name>
 
2. application.properties'de aşadaki alanları ortamınıza göre güncelleyiniz.
    * Elasticsearch 
    
          spring.data.elasticsearch.cluster-name=<docker-cluster-name>
     
    * Mysql 
    
          spring.datasource.username= <mysql-username>
          spring.datasource.password= <mysql-password>
       
3. docker-compose.yml'ı çalıştırın.

        docker-compose up 
        or
        docker-compose up -d



  

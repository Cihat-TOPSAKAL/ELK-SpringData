## Elasticsearch Kurulumu

* Elasticsearc'ü X-Pack ile kullanmak istiyorsanız 
Tutorial Folder'ı altında bulunan 
 [X-Pack](https://cihattpskl.medium.com/elastic-stack-ile-x-pack-security-docker-8814fa8fa879)
 Kurulumunu yapmalısınız.
 
* X-Pack kullanmadan kuruluma devam etmek için aşağıdaki adımları izleyiniz.

1. Elasticsearch Folder'ının altında bulunan 
"elasticsearch.yml" File'ını güncelleyin.

        cluster.name: <your-docker-cluster-name>
 
2. application.properties'de aşadaki alanları ortamınıza göre güncelleyiniz.
    * Elasticsearch 
    
          spring.data.elasticsearch.cluster-name=<your-docker-cluster-name>
     
    * Mysql 
    
          spring.datasource.username= <your-mysql-username>
          spring.datasource.password= <your-mysql-password>
3. docker-compose.yml'ı güncelleyin.
    
        environment:
              MYSQL_ROOT_PASSWORD: <your-mysql-root-password>
              MYSQL_DATABASE: <your-mysql-database>
              MYSQL_USER: <your-mysql-username>
              MYSQL_PASSWORD: <your-mysql-password>

4. run.sh'ı çalıştırın.
   
       $ sh run.sh



  

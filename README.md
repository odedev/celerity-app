# Celerity App

+ [Apache Velocity](https://velocity.apache.org/)
+ [Eclipse JGit](https://www.eclipse.org/jgit/)
+ [Mybatis-PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)
+ [H2](https://h2database.com/html/main.html)

### 几个嵌入式数据库的对比
| 特性                        | H2     | 	Derby | 	HSQLDB  | 	MySQL | 	PostgreSQL |
|---------------------------|--------|--------|----------|--------|-------------|
| Pure Java                 | 	Yes   | 	Yes   | 	Yes     | 	No    | 	No         |
| Memory Mode               | 	Yes   | 	No    | 	Yes     | 	No    | 	No         |
| Transaction Isolation     | 	Yes   | 	Yes   | 	No      | 	Yes   | 	Yes        |
| Cost Based Optimizer      | 	Yes   | 	Yes   | 	No      | 	Yes   | 	Yes        |
| Encrypted Database        | 	Yes   | 	Yes   | 	No      | 	No    | 	No         |
| ODBC Driver               | 	Yes   | 	No    | 	No      | 	Yes   | 	Yes        |
| Fulltext Search           | 	Yes   | 	No    | 	No      | 	Yes   | 	Yes        |
| Multi Version Concurrency | 	Yes   | 	No    | 	No      | 	No    | 	Yes        |
| Footprint (jar/dll size)  | 	~1 MB | 	~2 MB | 	~600 KB | 	~4 MB | 	~6 MB      |

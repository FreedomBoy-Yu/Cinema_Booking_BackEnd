
# Cinema Booking Backend

此專案為電影院票務系統的後端應用程式，基於 Java 和 Spring Boot 開發，並使用 MyBatis 與資料庫進行溝通。

## 功能描述

- 使用者管理（註冊、登入）
- 電影院與電影資訊管理
- 票務預訂與訂單查詢

## 技術棧

- **後端框架**: Spring Boot
- **持久層框架**: MyBatis
- **資料庫**: MySQL（支援其他 SQL 資料庫）
- **構建工具**: Maven

## 環境需求

- **Java**: JDK 17 或以上
- **Maven**: 3.8.1 或以上
- **資料庫**: MySQL 5.7 或以上
- **開發工具**: Eclipse 或 IntelliJ IDEA

## MyBatis 配置

1. **Mapper Interface 與 XML 文件**
   - 在 `src/main/resources/mapper` 中定義了 MyBatis 的 XML 映射文件。
   - 在 `src/main/java/.../mapper` 中定義了對應的 Java Mapper 接口。

2. **SQL 配置文件**
   - 每個功能模組的 SQL 查詢語句均定義在 `*.xml` 映射文件中，例如 `UserMapper.xml`。

3. **資料來源配置**
   - 在 `application.properties` 或 `application.yml` 中配置資料庫連接。
   - MyBatis 與 Spring Boot 的整合通過 `@MapperScan` 自動掃描 Mapper。

範例配置 (`application.properties`):
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cinema_booking
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

mybatis.mapper-locations=classpath:mapper/*.xml
```

## 如何運行

1. **克隆專案**
   ```bash
   git clone <repository-url>
   cd Cinema_Booking_BackEnd
   ```

2. **設定資料庫**
   - 建立資料庫並匯入必要的表結構與資料。
   - 修改 `application.properties` 中的資料庫連線配置。

3. **啟動應用**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **訪問應用**
   - 預設運行在 [http://localhost:8080](http://localhost:8080)。

## 專案結構

```
Cinema_Booking_BackEnd/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.mapper/       # MyBatis Mapper 接口
│   │   │   ├── com.example.service/      # 服務層
│   │   │   ├── com.example.controller/   # 控制器層
│   │   ├── resources/
│   │       ├── mapper/                   # MyBatis 映射 XML 文件
│   │       ├── application.properties    # 配置檔案
├── pom.xml                               # Maven 配置檔案
```

## 範例代碼

**UserMapper.java**
```java
@Mapper
public interface UserMapper {
    User findUserById(@Param("id") int id);
    void insertUser(User user);
}
```

**UserMapper.xml**
```xml
<mapper namespace="com.example.mapper.UserMapper">
    <select id="findUserById" resultType="User">
        SELECT * FROM users WHERE id = #{id}
    </select>
    <insert id="insertUser" parameterType="User">
        INSERT INTO users (username, password, email) VALUES (#{username}, #{password}, #{email})
    </insert>
</mapper>
```

## 開發貢獻

歡迎參與開發，提交 Issue 或 Pull Request。


package utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    // @Bean(name = "ordersDataSource")
    // public DataSource ordersDataSource() {
    //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
    //     dataSource.setDriverClassName("org.postgresql.Driver");
    //     dataSource.setUrl("jdbc:postgresql://localhost:5433/ms_orders");
    //     dataSource.setUsername("java");
    //     dataSource.setPassword("java123");
    //     return dataSource;
    // }

    @Bean(name = "productsDataSource")
    public DataSource productsDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5431/ms_products");
        dataSource.setUsername("java");
        dataSource.setPassword("java123");
        return dataSource;
    }
}
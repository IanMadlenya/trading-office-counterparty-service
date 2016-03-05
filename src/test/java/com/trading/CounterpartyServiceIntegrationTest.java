package com.trading;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterpartyServiceIntegrationTest {

    private final RestTemplate restTemplate = new RestTemplate();

    @BeforeClass
    public static void setUp() throws Exception {
        CounterpartyServiceApplication.main(new String[0]);
    }

    @Test
    public void service_returns_counterparty() throws Exception {

        String party = restTemplate.getForObject(
                "http://localhost:9008/api/party/CUSTAU",
                String.class
        );

        assertThat(party).isEqualTo(
                "Customer Australia Pty Ltd."
        );
    }

    @Test
    public void service_returns_exchange() throws Exception {
        CsvExchange exchange = restTemplate.getForObject(
                "http://localhost:9008/api/exchange/mic/XNAS",
                CsvExchange.class
        );

        assertThat(exchange.getName()).isEqualTo(
            "NASDAQ - ALL MARKETS"
        );
    }
}

package com.github.ibm.mapepire.requests;

import org.mockito.Mockito;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BlockRetrievableRequestTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getNextDataBlock() throws SQLException {

        ResultSet rs = Mockito.mock(ResultSet.class);
        when(rs.next()).thenReturn(true).thenReturn(false);
        when(rs.getInt("id")).thenReturn(1);
        when(rs.getString("name")).thenReturn("John Doe");
        when(rs.getBigDecimal("bigvalue")).thenReturn(new BigDecimal("12345678901234567890"));

        BlockRetrievableRequest.DataBlockFetchResult block = BlockRetrievableRequest.getNextDataBlock(rs, 1, false);

    }

    @org.junit.jupiter.api.Test
    void testGetNextDataBlock() {

        RunSql runSql = new RunSql(null, null, null);
        addReplyData()

    }
}
package com.indieprojectIconicliner.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoapDaoTest {

    @Test
    void getPetSuccess() {
        SoapDao dao = new SoapDao();
        assertEquals("King Kong", dao.getPet().getName());
    }
}
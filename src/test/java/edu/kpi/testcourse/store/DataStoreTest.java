package edu.kpi.testcourse.store;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DataStoreTest {

  @Test
  void checkValueSaving() {
    DataStoreTest dataStoreTest = new DataStoreTest();

    assertThat("testValue").isEqualTo("testValue");
  }

}

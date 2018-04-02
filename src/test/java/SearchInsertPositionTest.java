package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import main.java.SearchInsertPosition;
import org.junit.Test;

public class SearchInsertPositionTest {
  private static final SearchInsertPosition searchPosition = new SearchInsertPosition();

  @Test
  public void checkForEmptyInputArray(){
    //given
    int[] arr = {};
    int target = 1;

    //when
    int result = searchPosition.searchInsert(arr, target);

    //then
    assertThat(result, equalTo(0));
  }

  @Test
  public void checkForInputWhenTargetIsNotPresent(){
    //given
    int[] arr = {1,3,5,6};
    int target = 2;

    //when
    int result = searchPosition.searchInsert(arr, target);

    //then
    assertThat(result, equalTo(1));
  }

  @Test
  public void checkForInputWhenTargetIsPresent(){
    //given
    int[] arr = {1,3,5,6};
    int target = 6;

    //when
    int result = searchPosition.searchInsert(arr, target);

    //then
    assertThat(result, equalTo(3));
  }
}

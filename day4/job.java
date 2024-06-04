package day4;

import java.sql.ResultSet;

public class job {
  int job_id;
  String job_title;
  int min_salary;
  int max_salary;

  public int getJob_id() {
    return job_id;
  }

  public void setJob_id(int job_id) {
    this.job_id = job_id;
  }

  public String getJob_title() {
    return job_title;
  }

  public void setJob_title(String job_title) {
    this.job_title = job_title;
  }

  public int getMin_salary() {
    return min_salary;
  }

  public void setMin_salary(int min_salary) {
    this.min_salary = min_salary;
  }

  public int getMax_salary() {
    return max_salary;
  }

  public void setMax_salary(int max_salary) {
    this.max_salary = max_salary;
  }

  public job(int job_id, int max_salary, int min_salary, String job_title) {
    this.job_id = job_id;
    this.max_salary = max_salary;
    this.min_salary = min_salary;
    this.job_title = job_title;
  }



}

package com.freesme.filter_pattern;

import java.util.List;
//‘标准’ 接口
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}
package lk.w3Academy.asset.course.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  CourseEmployeeStatus {
    COCO("Course Coordinator"),
    LP("Lecture Panel");
    private final String courseEmployeeStatus;
}

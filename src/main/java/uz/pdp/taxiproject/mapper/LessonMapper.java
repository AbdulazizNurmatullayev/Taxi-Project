package uz.pdp.taxiproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.imv.lmssystem.dto.LessonDTO;
import uz.imv.lmssystem.entity.Lesson;

@Mapper(componentModel = "spring")
public interface LessonMapper {
    @Mapping(target = "teacherName", source = "group.teacher.name")
    @Mapping(target = "teacherSurname", source = "group.teacher.surname")
    @Mapping(target = "groupName", source = "group.name")
    @Mapping(target = "courseName", source = "group.course.name")
    LessonDTO toDTO(Lesson lessons);

}

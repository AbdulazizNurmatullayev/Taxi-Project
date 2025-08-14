package uz.pdp.taxiproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import uz.imv.lmssystem.dto.CourseDTO;
import uz.imv.lmssystem.entity.Course;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CourseMapper {
    CourseDTO toDTO(Course course);

    List<CourseDTO> toDTO(List<Course> courses);

    Course toEntity(CourseDTO dto);

    void updateEntity(CourseDTO dto, @MappingTarget Course entity);

}
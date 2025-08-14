package uz.pdp.taxiproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import uz.imv.lmssystem.dto.PaymentDTO;
import uz.imv.lmssystem.entity.Payment;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {
    @Mapping(target = "studentName", source = "student.name")
    @Mapping(target = "studentSurname", source = "student.surname")
    @Mapping(target = "employeeName", source = "cashier.name")
    @Mapping(target = "employeeSurname", source = "cashier.surname")
    PaymentDTO toDto(Payment payment);


    List<PaymentDTO> toDTO(List<Payment> paymentList);

}
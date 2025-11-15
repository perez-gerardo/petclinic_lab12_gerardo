package com.gerardo.petclinic.mapper;

import com.gerardo.petclinic.dtos.OwnerDTO;
import com.gerardo.petclinic.entities.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface OwnerMapper {

	OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

	Owner mapToEntity(OwnerDTO ownerDTO);

	OwnerDTO mapToDto(Owner owner);

	List<OwnerDTO> mapToDtoList(List<Owner> ownerList);

	List<Owner> mapToEntityList(List<OwnerDTO> ownerDTOList);

}


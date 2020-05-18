package com.company.isucorp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

	private Integer reservationId;
	private Integer	contactId;
	private String name;
	private String contactType;
	private String birthDate;
	private String phoneNumber;
	private String editorData;

}

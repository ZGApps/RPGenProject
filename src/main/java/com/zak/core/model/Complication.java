package com.zak.core.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="complications")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Complication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String contents;

	public Complication(String contents) {
		super();
		this.contents = contents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complication other = (Complication) obj;
		return Objects.equals(contents, other.contents) && id == other.id;
	}

	@Override
	public String toString() {
		return "Complication [id=" + id + ", contents=" + contents + "]";
	}

	
}

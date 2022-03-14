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
@Table(name="characters")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CharacterData{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String contents;

	public CharacterData(String contents) {
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
		CharacterData other = (CharacterData) obj;
		return Objects.equals(contents, other.contents) && id == other.id;
	}

	@Override
	public String toString() {
		return "Character [id=" + id + ", contents=" + contents + "]";
	}

	
	

}

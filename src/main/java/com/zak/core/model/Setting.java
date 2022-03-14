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
@Table(name="settings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Setting {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String contents;

	public Setting(String contents) {
		super();
		this.contents = contents;
	}

	
	@Override
	public String toString() {
		return "Setting [id=" + id + ", contents=" + contents + "]";
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
		Setting other = (Setting) obj;
		return Objects.equals(contents, other.contents) && id == other.id;
	}

	
	
}

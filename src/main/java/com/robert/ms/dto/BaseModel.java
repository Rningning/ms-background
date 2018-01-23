package com.robert.ms.dto;

import java.lang.reflect.Field;

public abstract class BaseModel {
	@Override
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
		sb.append("{");
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				sb.append(field.getName());
				sb.append("=");
				sb.append(field.get(this));
				sb.append(",");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		sb.delete(sb.length() - 1, sb.length());
		sb.append("}");
		return sb.toString();
	}
}

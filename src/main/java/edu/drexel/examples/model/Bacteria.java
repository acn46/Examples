package edu.drexel.examples.model;

public class Bacteria {
	
	private String name;
	private int taxId;
	private String lineage;
	private int bacteriaCount;
	private double proportionAll;
	private double proportionClassified;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public String getLineage() {
		return lineage;
	}
	public void setLineage(String lineage) {
		this.lineage = lineage;
	}
	public int getBacteriaCount() {
		return bacteriaCount;
	}
	public void setBacteriaCount(int bacteriaCount) {
		this.bacteriaCount = bacteriaCount;
	}
	public double getProportionAll() {
		return proportionAll;
	}
	public void setProportionAll(double proportionAll) {
		this.proportionAll = proportionAll;
	}
	public double getProportionClassified() {
		return proportionClassified;
	}
	public void setProportionClassified(double proportionClassified) {
		this.proportionClassified = proportionClassified;
	}
	@Override
	public String toString() {
		return "Bacteria [name=" + name + ", taxId=" + taxId + ", lineage=" + lineage + ", bacteriaCount="
				+ bacteriaCount + ", proportionAll=" + proportionAll + ", proportionClassified=" + proportionClassified
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + taxId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bacteria other = (Bacteria) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (taxId != other.taxId)
			return false;
		return true;
	}

}

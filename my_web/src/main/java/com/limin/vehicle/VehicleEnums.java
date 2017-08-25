package com.limin.vehicle;

public class VehicleEnums{
	public enum LicenceColor{
		BLUE(1,"蓝色"),
		YELLOW(2,"黄色"),
		FARM_YELLOW(3,"农黄"),
		GREEN(4,"绿色"),
		BLACK(5,"黑色"),
		WHITE(6,"白色");

		LicenceColor(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (LicenceColor e:LicenceColor.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}

		public static int getColorValue(String name){
			for (LicenceColor e:LicenceColor.values())
				if (e.getName().equals(name))
					return e.getValue();
			return 0;
		}
	}

	public enum IsPrivate{
		NO(0,"否"),
		YES(1,"是");

		IsPrivate(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (IsPrivate e:IsPrivate.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}
	}

	public enum Status{
		OK(0,"正常"),
		CANCEL(1,"注销"),
		WAIT_CHECK(2,"待审核"),
		CHECK_FAIL(3,"审核失败");

		Status(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (Status e:Status.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}
	}

	public enum CreateType{
		MANAGE(1,"管理"),
		ENT(2,"企业"),
		OWNER(3,"车主");

		CreateType(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (CreateType e:CreateType.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}
	}

	public enum IsOtherPlace{
		NO(0,"否"),
		YES(1,"是");

		IsOtherPlace(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (IsOtherPlace e:IsOtherPlace.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}
	}

	public enum SyncFlag{
		NO(0,"否"),
		YES(1,"是");

		SyncFlag(int value,String name) {this.value=value; this.name=name;}
		private final int value;
		private final String name;
		public byte getValue() { return (byte)value; }
		public String getName() { return name; }
		public static String getDesc(byte value)
		{
			for (SyncFlag e:SyncFlag.values())
				if (e.getValue()==value)
					return e.getName();
			return "";
		}
	}

}

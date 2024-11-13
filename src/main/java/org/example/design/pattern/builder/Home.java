package org.example.design.pattern.builder;

import lombok.ToString;

@ToString
public class Home {
	private int walls;
	private int doors;
	private int windows;
	private boolean hasGarden;
	private boolean hasHeating;
	private boolean hasGarage;
	private boolean hasSwimPool;

	// Home의 생성자는 private으로 외부에서 직접 호출하지 못하게 한다.
	private Home() {}

	// Builder 클래스
	public static class Builder {
		// 필수 필드들
		private final int walls;
		private final int doors;
		private final int windows;

		// 선택적 필드들 (기본값 false)
		private boolean hasGarden = false;
		private boolean hasHeating = false;
		private boolean hasGarage = false;
		private boolean hasSwimPool = false;

		// 필수 필드들은 Builder 생성자를 통해 설정
		public Builder(int walls, int doors, int windows) {
			this.walls = walls;
			this.doors = doors;
			this.windows = windows;
		}

		// 선택적 필드를 위한 메서드들
		public Builder hasGarden(boolean hasGarden) {
			this.hasGarden = hasGarden;
			return this;
		}

		public Builder hasHeating(boolean hasHeating) {
			this.hasHeating = hasHeating;
			return this;
		}

		public Builder hasGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
			return this;
		}

		public Builder hasSwimPool(boolean hasSwimPool) {
			this.hasSwimPool = hasSwimPool;
			return this;
		}

		// 최종적으로 Home 객체를 반환하는 build 메서드
		public Home build() {
			Home home = new Home();
			home.walls = this.walls;
			home.doors = this.doors;
			home.windows = this.windows;
			home.hasGarden = this.hasGarden;
			home.hasHeating = this.hasHeating;
			home.hasGarage = this.hasGarage;
			home.hasSwimPool = this.hasSwimPool;
			return home;
		}
	}
}
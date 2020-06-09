package io.scalecube.utils;

import java.util.UUID;

public final class MaskUtil {

  private MaskUtil() {
    // Do not instantiate
  }

  /**
   * Mask sensitive data by replacing part of string with an asterisk symbol.
   *
   * @param data sensitive data to be masked
   * @return masked data
   */
  public static String mask(String data) {
    if (data == null || data.isEmpty() || data.length() < 5) {
      return "*****";
    }

    return data.replace(data.substring(2, data.length() - 2), "***");
  }

  public static String mask(UUID data) {
    return data != null ? mask(data.toString()) : null;
  }
}

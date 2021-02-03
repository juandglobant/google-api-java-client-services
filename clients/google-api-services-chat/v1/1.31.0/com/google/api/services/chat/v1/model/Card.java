/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chat.v1.model;

/**
 * A card is a UI element that can contain UI widgets such as texts, images.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Card extends com.google.api.client.json.GenericJson {

  /**
   * The actions of this card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CardAction> cardActions;

  /**
   * The header of the card. A header usually contains a title and an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CardHeader header;

  /**
   * Name of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Sections are separated by a line divider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Section> sections;

  /**
   * The actions of this card.
   * @return value or {@code null} for none
   */
  public java.util.List<CardAction> getCardActions() {
    return cardActions;
  }

  /**
   * The actions of this card.
   * @param cardActions cardActions or {@code null} for none
   */
  public Card setCardActions(java.util.List<CardAction> cardActions) {
    this.cardActions = cardActions;
    return this;
  }

  /**
   * The header of the card. A header usually contains a title and an image.
   * @return value or {@code null} for none
   */
  public CardHeader getHeader() {
    return header;
  }

  /**
   * The header of the card. A header usually contains a title and an image.
   * @param header header or {@code null} for none
   */
  public Card setHeader(CardHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Name of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the card.
   * @param name name or {@code null} for none
   */
  public Card setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Sections are separated by a line divider.
   * @return value or {@code null} for none
   */
  public java.util.List<Section> getSections() {
    return sections;
  }

  /**
   * Sections are separated by a line divider.
   * @param sections sections or {@code null} for none
   */
  public Card setSections(java.util.List<Section> sections) {
    this.sections = sections;
    return this;
  }

  @Override
  public Card set(String fieldName, Object value) {
    return (Card) super.set(fieldName, value);
  }

  @Override
  public Card clone() {
    return (Card) super.clone();
  }

}

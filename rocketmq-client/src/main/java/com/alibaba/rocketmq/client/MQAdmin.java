/**
 * $Id: MQAdmin.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.client;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.MessageExt;
import com.alibaba.rocketmq.common.MessageQueue;
import com.alibaba.rocketmq.common.TopicFilterType;
import com.alibaba.rocketmq.remoting.exception.RemotingException;


/**
 * MQ������ӿ�
 * 
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 */
public interface MQAdmin {
    /**
     * ����topic
     * 
     * @param key
     *            ����Metaq��ά��Ա����
     * @param newTopic
     *            Ҫ��������topic
     * @param queueNum
     *            ��topic������
     * @param order
     *            �Ƿ����ϸ��˳����Ϣ
     * @throws MQClientException
     */
    public void createTopic(final String key, final String newTopic, final int queueNum,
            final TopicFilterType topicFilterType, final boolean order) throws MQClientException;


    /**
     * ����ʱ���ѯ��Ӧ��offset����ȷ������
     * 
     * @param mq
     *            Meta����
     * @param timestamp
     *            ������ʽʱ���
     * @return ָ��ʱ���Ӧ��offset
     * @throws MQClientException
     */
    public long searchOffset(final MessageQueue mq, final long timestamp) throws MQClientException;


    /**
     * ���������ѯMeta�������Offset PS: ���Offset�޶�Ӧ��Ϣ����1����Ϣ
     * 
     * @param mq
     *            Meta����
     * @return Meta���е����Offset
     * @throws MQClientException
     */
    public long getMaxOffset(final MessageQueue mq) throws MQClientException;


    /**
     * ���������ѯMeta������СOffset PS: ��СOffset�ж�Ӧ��Ϣ
     * 
     * @param mq
     *            Meta����
     * @return Meta���е���СOffset
     * @throws MQClientException
     */
    public long getMinOffset(final MessageQueue mq) throws MQClientException;


    /**
     * ���������ѯMeta���б����������Ϣ��Ӧ�Ĵ洢ʱ��
     * 
     * @param mq
     *            Meta����
     * @return ������Ϣ��Ӧ�Ĵ洢ʱ�䣬��ȷ������
     * @throws MQClientException
     */
    public long getEarliestMsgStoreTime(final MessageQueue mq) throws MQClientException;


    /**
     * ������ϢID���ӷ�������ȡ��������Ϣ
     * 
     * @param msgId
     * @return ������Ϣ
     * @throws InterruptedException
     * @throws MQBrokerException
     * @throws RemotingException
     * @throws MQClientException
     */
    public MessageExt viewMessage(final String msgId) throws RemotingException, MQBrokerException,
            InterruptedException, MQClientException;


    /**
     * ������ϢKey��ѯ��Ϣ
     * 
     * @param topic
     *            ��Ϣ����
     * @param key
     *            ��Ϣ�ؼ���
     * @param maxNum
     *            ��ѯ�������
     * @param begin
     *            ��ʼʱ���
     * @param end
     *            ����ʱ���
     * @return ��ѯ���
     * @throws MQClientException
     * @throws InterruptedException
     */
    public QueryResult queryMessage(final String topic, final String key, final int maxNum, final long begin,
            final long end) throws MQClientException, InterruptedException;
}
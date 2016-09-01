/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.tesoreria.util.BancoFormaPagoConstantesFunciones;
import com.bydan.erp.tesoreria.util.BancoFormaPagoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.BancoFormaPagoParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.BancoFormaPagoBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.BancoFormaPagoJInternalFrame;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.BancoFormaPagoDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class BancoFormaPagoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,BancoFormaPagoConstantesFunciones.LABEL_ID
										,BancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA
										,BancoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL
										,BancoFormaPagoConstantesFunciones.LABEL_IDEJERCICIO
										,BancoFormaPagoConstantesFunciones.LABEL_IDPERIODO
										,BancoFormaPagoConstantesFunciones.LABEL_IDFACTURA
										,BancoFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGO
										,BancoFormaPagoConstantesFunciones.LABEL_IDTIPOBANCOFORMAPAGO
										,BancoFormaPagoConstantesFunciones.LABEL_NOMBREBANCO
										,BancoFormaPagoConstantesFunciones.LABEL_NOMBREGIRADOR
										,BancoFormaPagoConstantesFunciones.LABEL_FECHAVENCE
										,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCUENTABANCO
										,BancoFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE
										,BancoFormaPagoConstantesFunciones.LABEL_VALORMONTO
										,BancoFormaPagoConstantesFunciones.LABEL_IDANIO
										,BancoFormaPagoConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<BancoFormaPago> bancoformapagos;
	  	 
	    //NO SE UTILIZA
	    public BancoFormaPagoModel(List<BancoFormaPago> bancoformapagos,JInternalFrameBase jInternalFrameBase) {
	    	this.bancoformapagos=bancoformapagos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public BancoFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.bancoformapagos=new ArrayList<BancoFormaPago>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.bancoformapagos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.bancoformapagos.get(rowIndex).getIsSelected();
	            
				case 1: return this.bancoformapagos.get(rowIndex).getId();
				case 2: return this.bancoformapagos.get(rowIndex).getid_empresa();
				case 3: return this.bancoformapagos.get(rowIndex).getid_sucursal();
				case 4: return this.bancoformapagos.get(rowIndex).getid_ejercicio();
				case 5: return this.bancoformapagos.get(rowIndex).getid_periodo();
				case 6: return this.bancoformapagos.get(rowIndex).getid_factura();
				case 7: return this.bancoformapagos.get(rowIndex).getid_deta_forma_pago();
				case 8: return this.bancoformapagos.get(rowIndex).getid_tipo_banco_forma_pago();
				case 9: return this.bancoformapagos.get(rowIndex).getnombre_banco();
				case 10: return this.bancoformapagos.get(rowIndex).getnombre_girador();
				case 11: return this.bancoformapagos.get(rowIndex).getfecha_vence();
				case 12: return this.bancoformapagos.get(rowIndex).getnumero_cuenta_banco();
				case 13: return this.bancoformapagos.get(rowIndex).getnumero_cheque();
				case 14: return this.bancoformapagos.get(rowIndex).getvalor_monto();
				case 15: return this.bancoformapagos.get(rowIndex).getid_anio();
				case 16: return this.bancoformapagos.get(rowIndex).getid_mes();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Date.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return Double.class;
				case 15: return Long.class;
				case 16: return Long.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	BancoFormaPago bancoformapago = this.bancoformapagos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame=(BancoFormaPagoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {bancoformapago.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {bancoformapago.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {bancoformapago.setid_empresa((Long) value);bancoformapago.setempresa_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {bancoformapago.setid_sucursal((Long) value);bancoformapago.setsucursal_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {bancoformapago.setid_ejercicio((Long) value);bancoformapago.setejercicio_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {bancoformapago.setid_periodo((Long) value);bancoformapago.setperiodo_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {bancoformapago.setid_factura((Long) value);bancoformapago.setfactura_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {bancoformapago.setid_deta_forma_pago((Long) value);bancoformapago.setdetaformapago_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualDetaFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {bancoformapago.setid_tipo_banco_forma_pago((Long) value);bancoformapago.settipobancoformapago_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualTipoBancoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {bancoformapago.setnombre_banco((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {bancoformapago.setnombre_girador((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {bancoformapago.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {bancoformapago.setnumero_cuenta_banco((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {bancoformapago.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {bancoformapago.setvalor_monto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {bancoformapago.setid_anio((Long) value);bancoformapago.setanio_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {bancoformapago.setid_mes((Long) value);bancoformapago.setmes_descripcion(bancoformapagoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public BancoFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private BancoFormaPagoDetalleFormJInternalFrame bancoformapagoJInternalFrame=null;
		
		public BancoFormaPagoModel(BancoFormaPagoDetalleFormJInternalFrame bancoformapagoJInternalFrame) {
			this.bancoformapagoJInternalFrame=bancoformapagoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago();
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago())) {
				componentTab=this.bancoformapagoJInternalFrame.getjButtonEliminarToolBarBancoFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.getjButtonEliminarToolBarBancoFormaPago())) {
				componentTab=this.bancoformapagoJInternalFrame.getjButtonCancelarToolBarBancoFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.getjButtonCancelarToolBarBancoFormaPago())) {
				componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_empresaBancoFormaPago;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_mesBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jComboBoxTiposAccionesFormularioBancoFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxTiposAccionesFormularioBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jButtonEliminarBancoFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jButtonEliminarBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jButtonActualizarBancoFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jButtonActualizarBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jButtonCancelarBancoFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_empresaBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_sucursalBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_sucursalBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_ejercicioBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_ejercicioBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_periodoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_periodoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_facturaBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_facturaBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_deta_forma_pagoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_deta_forma_pagoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnombre_bancoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnombre_bancoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextAreanombre_giradorBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextAreanombre_giradorBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jDateChooserfecha_venceBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jDateChooserfecha_venceBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnumero_cuenta_bancoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnumero_cuenta_bancoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnumero_chequeBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnumero_chequeBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldvalor_montoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldvalor_montoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_anioBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_anioBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_mesBancoFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago();
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.getjButtonEliminarToolBarBancoFormaPago())) {
				componentTab=this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.getjButtonCancelarToolBarBancoFormaPago())) {
				componentTab=this.bancoformapagoJInternalFrame.getjButtonEliminarToolBarBancoFormaPago();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_empresaBancoFormaPago)) {
				
				componentTab=this.bancoformapagoJInternalFrame.getjButtonCancelarToolBarBancoFormaPago();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxTiposAccionesFormularioBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_mesBancoFormaPago;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jButtonEliminarBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jComboBoxTiposAccionesFormularioBancoFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jButtonActualizarBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jButtonEliminarBancoFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jButtonCancelarBancoFormaPago)) {
				componentTab=this.bancoformapagoJInternalFrame.jButtonActualizarBancoFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_sucursalBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_empresaBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_ejercicioBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_sucursalBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_periodoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_ejercicioBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_facturaBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_periodoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_deta_forma_pagoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_facturaBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_deta_forma_pagoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnombre_bancoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_tipo_banco_forma_pagoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextAreanombre_giradorBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnombre_bancoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jDateChooserfecha_venceBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextAreanombre_giradorBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnumero_cuenta_bancoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jDateChooserfecha_venceBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldnumero_chequeBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnumero_cuenta_bancoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jTextFieldvalor_montoBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldnumero_chequeBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_anioBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jTextFieldvalor_montoBancoFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.bancoformapagoJInternalFrame.jComboBoxid_mesBancoFormaPago)) {
			componentTab=this.bancoformapagoJInternalFrame.jComboBoxid_anioBancoFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.bancoformapagoJInternalFrame.getjButtonActualizarToolBarBancoFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.bancoformapagoJInternalFrame.getjButtonCancelarToolBarBancoFormaPago();
			
			
			return componentTab;		
		}
		
		public BancoFormaPagoDetalleFormJInternalFrame getbancoformapagoJInternalFrame() {
			return this.bancoformapagoJInternalFrame;
		}
		
		public void setbancoformapagoJInternalFrame(BancoFormaPagoDetalleFormJInternalFrame bancoformapagoJInternalFrame) {
			this.bancoformapagoJInternalFrame=bancoformapagoJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}

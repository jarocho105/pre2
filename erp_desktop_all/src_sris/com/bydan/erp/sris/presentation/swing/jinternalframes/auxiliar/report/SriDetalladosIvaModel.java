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
package com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.sris.util.SriDetalladosIvaConstantesFunciones;
import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaBeanSwingJInternalFrame;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaJInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriDetalladosIvaDetalleFormJInternalFrame;

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



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class SriDetalladosIvaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SriDetalladosIvaConstantesFunciones.LABEL_ID
										,SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE
										,SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO
										,SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO
										,SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION
										,SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE
										,SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE
										,SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA
										,SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA
										,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA
										,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA
										,SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO
										,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA
										,SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO
										};
	   
	    public List<SriDetalladosIva> sridetalladosivas;
	  	 
	    //NO SE UTILIZA
	    public SriDetalladosIvaModel(List<SriDetalladosIva> sridetalladosivas,JInternalFrameBase jInternalFrameBase) {
	    	this.sridetalladosivas=sridetalladosivas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SriDetalladosIvaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.sridetalladosivas=new ArrayList<SriDetalladosIva>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.sridetalladosivas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.sridetalladosivas.get(rowIndex).getIsSelected();
	            
				case 1: return this.sridetalladosivas.get(rowIndex).getId();
				case 2: return this.sridetalladosivas.get(rowIndex).getnombre_tipo_comprobante();
				case 3: return this.sridetalladosivas.get(rowIndex).getruc_dato();
				case 4: return this.sridetalladosivas.get(rowIndex).getnumero_documento();
				case 5: return this.sridetalladosivas.get(rowIndex).getfecha_emision();
				case 6: return this.sridetalladosivas.get(rowIndex).getfecha_registro_contable();
				case 7: return this.sridetalladosivas.get(rowIndex).getnumero_serie();
				case 8: return this.sridetalladosivas.get(rowIndex).gettotal_iva();
				case 9: return this.sridetalladosivas.get(rowIndex).gettotal_sin_iva();
				case 10: return this.sridetalladosivas.get(rowIndex).getid_tipo_iva();
				case 11: return this.sridetalladosivas.get(rowIndex).getid_tipo_retencion_iva();
				case 12: return this.sridetalladosivas.get(rowIndex).gettransfe_iva_retenido();
				case 13: return this.sridetalladosivas.get(rowIndex).getid_tipo_retencion_iva_presta();
				case 14: return this.sridetalladosivas.get(rowIndex).getpresta_iva_retenido();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return Date.class;
				case 6: return Date.class;
				case 7: return String.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Double.class;
				case 13: return Long.class;
				case 14: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	SriDetalladosIva sridetalladosiva = this.sridetalladosivas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SriDetalladosIvaBeanSwingJInternalFrame sridetalladosivaBeanSwingJInternalFrame=(SriDetalladosIvaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {sridetalladosiva.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {sridetalladosiva.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {sridetalladosiva.setnombre_tipo_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {sridetalladosiva.setruc_dato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {sridetalladosiva.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {sridetalladosiva.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {sridetalladosiva.setfecha_registro_contable((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {sridetalladosiva.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {sridetalladosiva.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {sridetalladosiva.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {sridetalladosiva.setid_tipo_iva((Long) value);sridetalladosiva.settipoiva_descripcion(sridetalladosivaBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {sridetalladosiva.setid_tipo_retencion_iva((Long) value);sridetalladosiva.settiporetencioniva_descripcion(sridetalladosivaBeanSwingJInternalFrame.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {sridetalladosiva.settransfe_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {sridetalladosiva.setid_tipo_retencion_iva_presta((Long) value);sridetalladosiva.settiporetencionivapresta_descripcion(sridetalladosivaBeanSwingJInternalFrame.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {sridetalladosiva.setpresta_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SriDetalladosIvaModel(JInternalFrameBase jInternalFrameBase) {
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
		private SriDetalladosIvaDetalleFormJInternalFrame sridetalladosivaJInternalFrame=null;
		
		public SriDetalladosIvaModel(SriDetalladosIvaDetalleFormJInternalFrame sridetalladosivaJInternalFrame) {
			this.sridetalladosivaJInternalFrame=sridetalladosivaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva();
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva())) {
				componentTab=this.sridetalladosivaJInternalFrame.getjButtonEliminarToolBarSriDetalladosIva();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.getjButtonEliminarToolBarSriDetalladosIva())) {
				componentTab=this.sridetalladosivaJInternalFrame.getjButtonCancelarToolBarSriDetalladosIva();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.getjButtonCancelarToolBarSriDetalladosIva())) {
				componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_periodo_declaraSriDetalladosIva;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldpresta_iva_retenidoSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jComboBoxTiposAccionesFormularioSriDetalladosIva;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxTiposAccionesFormularioSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jButtonEliminarSriDetalladosIva;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jButtonEliminarSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jButtonActualizarSriDetalladosIva;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jButtonActualizarSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jButtonCancelarSriDetalladosIva;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_periodo_declaraSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_comprobanteSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_comprobanteSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldrucSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldrucSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextAreanombre_tipo_comprobanteSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextAreanombre_tipo_comprobanteSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldruc_datoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldruc_datoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldnumero_documentoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldnumero_documentoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jDateChooserfecha_emisionSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jDateChooserfecha_emisionSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jDateChooserfecha_registro_contableSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jDateChooserfecha_registro_contableSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldnumero_serieSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldnumero_serieSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtotal_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtotal_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtotal_sin_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtotal_sin_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtransfe_iva_retenidoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtransfe_iva_retenidoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldpresta_iva_retenidoSriDetalladosIva;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva();
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.getjButtonEliminarToolBarSriDetalladosIva())) {
				componentTab=this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.getjButtonCancelarToolBarSriDetalladosIva())) {
				componentTab=this.sridetalladosivaJInternalFrame.getjButtonEliminarToolBarSriDetalladosIva();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_periodo_declaraSriDetalladosIva)) {
				
				componentTab=this.sridetalladosivaJInternalFrame.getjButtonCancelarToolBarSriDetalladosIva();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxTiposAccionesFormularioSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jTextFieldpresta_iva_retenidoSriDetalladosIva;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jButtonEliminarSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jComboBoxTiposAccionesFormularioSriDetalladosIva;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jButtonActualizarSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jButtonEliminarSriDetalladosIva;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jButtonCancelarSriDetalladosIva)) {
				componentTab=this.sridetalladosivaJInternalFrame.jButtonActualizarSriDetalladosIva;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_comprobanteSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_periodo_declaraSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldrucSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_comprobanteSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextAreanombre_tipo_comprobanteSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldrucSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldruc_datoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextAreanombre_tipo_comprobanteSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldnumero_documentoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldruc_datoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jDateChooserfecha_emisionSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldnumero_documentoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jDateChooserfecha_registro_contableSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jDateChooserfecha_emisionSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldnumero_serieSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jDateChooserfecha_registro_contableSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtotal_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldnumero_serieSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtotal_sin_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtotal_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtotal_sin_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_ivaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldtransfe_iva_retenidoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_ivaSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jTextFieldtransfe_iva_retenidoSriDetalladosIva;
			return componentTab;
		}

		if(component!=null && component.equals(this.sridetalladosivaJInternalFrame.jTextFieldpresta_iva_retenidoSriDetalladosIva)) {
			componentTab=this.sridetalladosivaJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.sridetalladosivaJInternalFrame.getjButtonActualizarToolBarSriDetalladosIva();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.sridetalladosivaJInternalFrame.getjButtonCancelarToolBarSriDetalladosIva();
			
			
			return componentTab;		
		}
		
		public SriDetalladosIvaDetalleFormJInternalFrame getsridetalladosivaJInternalFrame() {
			return this.sridetalladosivaJInternalFrame;
		}
		
		public void setsridetalladosivaJInternalFrame(SriDetalladosIvaDetalleFormJInternalFrame sridetalladosivaJInternalFrame) {
			this.sridetalladosivaJInternalFrame=sridetalladosivaJInternalFrame;
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

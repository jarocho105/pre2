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

//import com.bydan.erp.sris.util.SriComprasConstantesFunciones;
import com.bydan.erp.sris.util.report.SriComprasParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriComprasParameterGeneral;

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

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriComprasBeanSwingJInternalFrame;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriComprasJInternalFrame;

import com.bydan.erp.sris.presentation.swing.jinternalframes.report.SriComprasDetalleFormJInternalFrame;

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
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class SriComprasModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SriComprasConstantesFunciones.LABEL_ID
										,SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE
										,SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE
										,SriComprasConstantesFunciones.LABEL_RUCDATO
										,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO
										,SriComprasConstantesFunciones.LABEL_FECHAEMISION
										,SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE
										,SriComprasConstantesFunciones.LABEL_NUMEROSERIE
										,SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,SriComprasConstantesFunciones.LABEL_BIENESIVA
										,SriComprasConstantesFunciones.LABEL_SERVICIONIVA
										,SriComprasConstantesFunciones.LABEL_TOTALIVA
										,SriComprasConstantesFunciones.LABEL_BIENESSINIVA
										,SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA
										,SriComprasConstantesFunciones.LABEL_TOTALSINIVA
										,SriComprasConstantesFunciones.LABEL_IDTIPOIVA
										,SriComprasConstantesFunciones.LABEL_MONTOIVA
										,SriComprasConstantesFunciones.LABEL_MONTOICE
										,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER
										,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA
										,SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO
										,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER
										,SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA
										,SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO
										,SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD
										,SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE
										,SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE
										};
	   
	    public List<SriCompras> sricomprass;
	  	 
	    //NO SE UTILIZA
	    public SriComprasModel(List<SriCompras> sricomprass,JInternalFrameBase jInternalFrameBase) {
	    	this.sricomprass=sricomprass;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SriComprasModel(JInternalFrameBase jInternalFrameBase) {
	    	this.sricomprass=new ArrayList<SriCompras>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.sricomprass.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.sricomprass.get(rowIndex).getIsSelected();
	            
				case 1: return this.sricomprass.get(rowIndex).getId();
				case 2: return this.sricomprass.get(rowIndex).getnombre_tipo_comprobante();
				case 3: return this.sricomprass.get(rowIndex).getnombre_completo_cliente();
				case 4: return this.sricomprass.get(rowIndex).getruc_dato();
				case 5: return this.sricomprass.get(rowIndex).getnumero_documento();
				case 6: return this.sricomprass.get(rowIndex).getfecha_emision();
				case 7: return this.sricomprass.get(rowIndex).getfecha_registro_contable();
				case 8: return this.sricomprass.get(rowIndex).getnumero_serie();
				case 9: return this.sricomprass.get(rowIndex).getnumero_autorizacion();
				case 10: return this.sricomprass.get(rowIndex).getbienes_iva();
				case 11: return this.sricomprass.get(rowIndex).getservicion_iva();
				case 12: return this.sricomprass.get(rowIndex).gettotal_iva();
				case 13: return this.sricomprass.get(rowIndex).getbienes_sin_iva();
				case 14: return this.sricomprass.get(rowIndex).getservicios_sin_iva();
				case 15: return this.sricomprass.get(rowIndex).gettotal_sin_iva();
				case 16: return this.sricomprass.get(rowIndex).getid_tipo_iva();
				case 17: return this.sricomprass.get(rowIndex).getmonto_iva();
				case 18: return this.sricomprass.get(rowIndex).getmonto_ice();
				case 19: return this.sricomprass.get(rowIndex).gettransfe_iva_retener();
				case 20: return this.sricomprass.get(rowIndex).getid_tipo_retencion_iva();
				case 21: return this.sricomprass.get(rowIndex).gettransfe_iva_retenido();
				case 22: return this.sricomprass.get(rowIndex).getpresta_iva_retener();
				case 23: return this.sricomprass.get(rowIndex).getid_tipo_retencion_iva_presta();
				case 24: return this.sricomprass.get(rowIndex).getpresta_iva_retenido();
				case 25: return this.sricomprass.get(rowIndex).getfecha_caducidad();
				case 26: return this.sricomprass.get(rowIndex).getcodigo_asiento_contable();
				case 27: return this.sricomprass.get(rowIndex).getnumero_documento_contable();	            
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
				case 5: return String.class;
				case 6: return Date.class;
				case 7: return Date.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Long.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Long.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Long.class;
				case 24: return Double.class;
				case 25: return Date.class;
				case 26: return String.class;
				case 27: return String.class;	            
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
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	SriCompras sricompras = this.sricomprass.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SriComprasBeanSwingJInternalFrame sricomprasBeanSwingJInternalFrame=(SriComprasBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {sricompras.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {sricompras.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {sricompras.setnombre_tipo_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {sricompras.setnombre_completo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {sricompras.setruc_dato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {sricompras.setnumero_documento((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {sricompras.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {sricompras.setfecha_registro_contable((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {sricompras.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {sricompras.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {sricompras.setbienes_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {sricompras.setservicion_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {sricompras.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {sricompras.setbienes_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {sricompras.setservicios_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {sricompras.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {sricompras.setid_tipo_iva((Long) value);sricompras.settipoiva_descripcion(sricomprasBeanSwingJInternalFrame.getActualTipoIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {sricompras.setmonto_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {sricompras.setmonto_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {sricompras.settransfe_iva_retener((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {sricompras.setid_tipo_retencion_iva((Long) value);sricompras.settiporetencioniva_descripcion(sricomprasBeanSwingJInternalFrame.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {sricompras.settransfe_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {sricompras.setpresta_iva_retener((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {sricompras.setid_tipo_retencion_iva_presta((Long) value);sricompras.settiporetencionivapresta_descripcion(sricomprasBeanSwingJInternalFrame.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {sricompras.setpresta_iva_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {sricompras.setfecha_caducidad((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {sricompras.setcodigo_asiento_contable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {sricompras.setnumero_documento_contable((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SriComprasModel(JInternalFrameBase jInternalFrameBase) {
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
		private SriComprasDetalleFormJInternalFrame sricomprasJInternalFrame=null;
		
		public SriComprasModel(SriComprasDetalleFormJInternalFrame sricomprasJInternalFrame) {
			this.sricomprasJInternalFrame=sricomprasJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras();
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras())) {
				componentTab=this.sricomprasJInternalFrame.getjButtonEliminarToolBarSriCompras();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.getjButtonEliminarToolBarSriCompras())) {
				componentTab=this.sricomprasJInternalFrame.getjButtonCancelarToolBarSriCompras();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.getjButtonCancelarToolBarSriCompras())) {
				componentTab=this.sricomprasJInternalFrame.jComboBoxid_empresaSriCompras;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_documento_contableSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jComboBoxTiposAccionesFormularioSriCompras;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxTiposAccionesFormularioSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jButtonEliminarSriCompras;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jButtonEliminarSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jButtonActualizarSriCompras;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jButtonActualizarSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jButtonCancelarSriCompras;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_empresaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_periodo_declaraSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_periodo_declaraSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_clienteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_clienteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldrucSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldrucSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextAreanombre_tipo_comprobanteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextAreanombre_tipo_comprobanteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextAreanombre_completo_clienteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextAreanombre_completo_clienteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldruc_datoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldruc_datoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_documentoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_documentoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_emisionSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_emisionSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_registro_contableSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_registro_contableSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_serieSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_serieSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_autorizacionSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_autorizacionSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldbienes_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldbienes_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldservicion_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldservicion_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtotal_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtotal_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldbienes_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldbienes_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldservicios_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldservicios_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtotal_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtotal_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldmonto_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldmonto_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldmonto_iceSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldmonto_iceSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenerSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenerSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenidoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenidoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenerSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenerSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenidoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenidoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_caducidadSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_caducidadSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldcodigo_asiento_contableSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldcodigo_asiento_contableSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_documento_contableSriCompras;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras();
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.getjButtonEliminarToolBarSriCompras())) {
				componentTab=this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.getjButtonCancelarToolBarSriCompras())) {
				componentTab=this.sricomprasJInternalFrame.getjButtonEliminarToolBarSriCompras();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_empresaSriCompras)) {
				
				componentTab=this.sricomprasJInternalFrame.getjButtonCancelarToolBarSriCompras();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxTiposAccionesFormularioSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_documento_contableSriCompras;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jButtonEliminarSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jComboBoxTiposAccionesFormularioSriCompras;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jButtonActualizarSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jButtonEliminarSriCompras;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.sricomprasJInternalFrame.jButtonCancelarSriCompras)) {
				componentTab=this.sricomprasJInternalFrame.jButtonActualizarSriCompras;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_periodo_declaraSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_empresaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_clienteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_periodo_declaraSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldrucSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_clienteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextAreanombre_tipo_comprobanteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldrucSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextAreanombre_completo_clienteSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextAreanombre_tipo_comprobanteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldruc_datoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextAreanombre_completo_clienteSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_documentoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldruc_datoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_emisionSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_documentoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_registro_contableSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_emisionSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_serieSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_registro_contableSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_autorizacionSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_serieSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldbienes_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldnumero_autorizacionSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldservicion_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldbienes_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtotal_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldservicion_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldbienes_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtotal_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldservicios_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldbienes_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtotal_sin_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldservicios_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtotal_sin_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldmonto_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldmonto_iceSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldmonto_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenerSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldmonto_iceSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_ivaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenerSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenidoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_ivaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenerSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldtransfe_iva_retenidoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenerSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenidoSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jComboBoxid_tipo_retencion_iva_prestaSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jDateChooserfecha_caducidadSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldpresta_iva_retenidoSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldcodigo_asiento_contableSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jDateChooserfecha_caducidadSriCompras;
			return componentTab;
		}

		if(component!=null && component.equals(this.sricomprasJInternalFrame.jTextFieldnumero_documento_contableSriCompras)) {
			componentTab=this.sricomprasJInternalFrame.jTextFieldcodigo_asiento_contableSriCompras;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.sricomprasJInternalFrame.getjButtonActualizarToolBarSriCompras();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.sricomprasJInternalFrame.getjButtonCancelarToolBarSriCompras();
			
			
			return componentTab;		
		}
		
		public SriComprasDetalleFormJInternalFrame getsricomprasJInternalFrame() {
			return this.sricomprasJInternalFrame;
		}
		
		public void setsricomprasJInternalFrame(SriComprasDetalleFormJInternalFrame sricomprasJInternalFrame) {
			this.sricomprasJInternalFrame=sricomprasJInternalFrame;
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

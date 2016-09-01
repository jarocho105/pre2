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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.puntoventa.util.ComprobanteTarjetaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteTarjetaParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteTarjetaBeanSwingJInternalFrame;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteTarjetaJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteTarjetaDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.puntoventa.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ComprobanteTarjetaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ComprobanteTarjetaConstantesFunciones.LABEL_ID
										,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECAJA
										,ComprobanteTarjetaConstantesFunciones.LABEL_SECUENCIAL
										,ComprobanteTarjetaConstantesFunciones.LABEL_FECHA
										,ComprobanteTarjetaConstantesFunciones.LABEL_CODIGOCLIENTE
										,ComprobanteTarjetaConstantesFunciones.LABEL_NOMBRECLIENTE
										,ComprobanteTarjetaConstantesFunciones.LABEL_SUBTOTAL
										,ComprobanteTarjetaConstantesFunciones.LABEL_IVA
										,ComprobanteTarjetaConstantesFunciones.LABEL_DESCUENTO
										,ComprobanteTarjetaConstantesFunciones.LABEL_FINANCIAMIENTO
										,ComprobanteTarjetaConstantesFunciones.LABEL_FLETE
										,ComprobanteTarjetaConstantesFunciones.LABEL_ICE
										,ComprobanteTarjetaConstantesFunciones.LABEL_TOTAL
										,ComprobanteTarjetaConstantesFunciones.LABEL_VALOR
										,ComprobanteTarjetaConstantesFunciones.LABEL_FECHAFORMAPAGO
										,ComprobanteTarjetaConstantesFunciones.LABEL_NUMERO
										,ComprobanteTarjetaConstantesFunciones.LABEL_TARJETAHABIENTE
										,ComprobanteTarjetaConstantesFunciones.LABEL_AUTORIZACION
										,ComprobanteTarjetaConstantesFunciones.LABEL_VOUCHER
										,ComprobanteTarjetaConstantesFunciones.LABEL_LOTE
										};
	   
	    public List<ComprobanteTarjeta> comprobantetarjetas;
	  	 
	    //NO SE UTILIZA
	    public ComprobanteTarjetaModel(List<ComprobanteTarjeta> comprobantetarjetas,JInternalFrameBase jInternalFrameBase) {
	    	this.comprobantetarjetas=comprobantetarjetas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ComprobanteTarjetaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.comprobantetarjetas=new ArrayList<ComprobanteTarjeta>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.comprobantetarjetas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.comprobantetarjetas.get(rowIndex).getIsSelected();
	            
				case 1: return this.comprobantetarjetas.get(rowIndex).getId();
				case 2: return this.comprobantetarjetas.get(rowIndex).getnombre_caja();
				case 3: return this.comprobantetarjetas.get(rowIndex).getsecuencial();
				case 4: return this.comprobantetarjetas.get(rowIndex).getfecha();
				case 5: return this.comprobantetarjetas.get(rowIndex).getcodigo_cliente();
				case 6: return this.comprobantetarjetas.get(rowIndex).getnombre_cliente();
				case 7: return this.comprobantetarjetas.get(rowIndex).getsubtotal();
				case 8: return this.comprobantetarjetas.get(rowIndex).getiva();
				case 9: return this.comprobantetarjetas.get(rowIndex).getdescuento();
				case 10: return this.comprobantetarjetas.get(rowIndex).getfinanciamiento();
				case 11: return this.comprobantetarjetas.get(rowIndex).getflete();
				case 12: return this.comprobantetarjetas.get(rowIndex).getice();
				case 13: return this.comprobantetarjetas.get(rowIndex).gettotal();
				case 14: return this.comprobantetarjetas.get(rowIndex).getvalor();
				case 15: return this.comprobantetarjetas.get(rowIndex).getfecha_forma_pago();
				case 16: return this.comprobantetarjetas.get(rowIndex).getnumero();
				case 17: return this.comprobantetarjetas.get(rowIndex).gettarjeta_habiente();
				case 18: return this.comprobantetarjetas.get(rowIndex).getautorizacion();
				case 19: return this.comprobantetarjetas.get(rowIndex).getvoucher();
				case 20: return this.comprobantetarjetas.get(rowIndex).getlote();	            
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
				case 4: return Date.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return Double.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Date.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ComprobanteTarjeta comprobantetarjeta = this.comprobantetarjetas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ComprobanteTarjetaBeanSwingJInternalFrame comprobantetarjetaBeanSwingJInternalFrame=(ComprobanteTarjetaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {comprobantetarjeta.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {comprobantetarjeta.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {comprobantetarjeta.setnombre_caja((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {comprobantetarjeta.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {comprobantetarjeta.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {comprobantetarjeta.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {comprobantetarjeta.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {comprobantetarjeta.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {comprobantetarjeta.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {comprobantetarjeta.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {comprobantetarjeta.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {comprobantetarjeta.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {comprobantetarjeta.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {comprobantetarjeta.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {comprobantetarjeta.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {comprobantetarjeta.setfecha_forma_pago((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {comprobantetarjeta.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {comprobantetarjeta.settarjeta_habiente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {comprobantetarjeta.setautorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {comprobantetarjeta.setvoucher((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {comprobantetarjeta.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ComprobanteTarjetaModel(JInternalFrameBase jInternalFrameBase) {
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
		private ComprobanteTarjetaDetalleFormJInternalFrame comprobantetarjetaJInternalFrame=null;
		
		public ComprobanteTarjetaModel(ComprobanteTarjetaDetalleFormJInternalFrame comprobantetarjetaJInternalFrame) {
			this.comprobantetarjetaJInternalFrame=comprobantetarjetaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta();
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta())) {
				componentTab=this.comprobantetarjetaJInternalFrame.getjButtonEliminarToolBarComprobanteTarjeta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.getjButtonEliminarToolBarComprobanteTarjeta())) {
				componentTab=this.comprobantetarjetaJInternalFrame.getjButtonCancelarToolBarComprobanteTarjeta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.getjButtonCancelarToolBarComprobanteTarjeta())) {
				componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_empresaComprobanteTarjeta;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldloteComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteTarjeta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jButtonEliminarComprobanteTarjeta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jButtonEliminarComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jButtonActualizarComprobanteTarjeta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jButtonActualizarComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jButtonCancelarComprobanteTarjeta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_empresaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_sucursalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_sucursalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_cajaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_cajaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_inicioComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_inicioComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_finComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_finComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreanombre_cajaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreanombre_cajaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldsecuencialComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldsecuencialComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfechaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfechaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldcodigo_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldcodigo_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreanombre_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreanombre_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldsubtotalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldsubtotalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldivaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldivaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFielddescuentoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFielddescuentoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldfinanciamientoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldfinanciamientoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldfleteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldfleteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldiceComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldiceComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldtotalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldtotalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldvalorComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldvalorComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_forma_pagoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_forma_pagoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldnumeroComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldnumeroComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreatarjeta_habienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreatarjeta_habienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreaautorizacionComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreaautorizacionComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldvoucherComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldvoucherComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldloteComprobanteTarjeta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta();
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.getjButtonEliminarToolBarComprobanteTarjeta())) {
				componentTab=this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.getjButtonCancelarToolBarComprobanteTarjeta())) {
				componentTab=this.comprobantetarjetaJInternalFrame.getjButtonEliminarToolBarComprobanteTarjeta();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_empresaComprobanteTarjeta)) {
				
				componentTab=this.comprobantetarjetaJInternalFrame.getjButtonCancelarToolBarComprobanteTarjeta();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldloteComprobanteTarjeta;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jButtonEliminarComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteTarjeta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jButtonActualizarComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jButtonEliminarComprobanteTarjeta;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jButtonCancelarComprobanteTarjeta)) {
				componentTab=this.comprobantetarjetaJInternalFrame.jButtonActualizarComprobanteTarjeta;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_sucursalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_empresaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_sucursalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jComboBoxid_cajaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_inicioComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jComboBoxid_cajaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_finComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_inicioComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreanombre_cajaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_finComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldsecuencialComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreanombre_cajaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfechaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldsecuencialComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldcodigo_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfechaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreanombre_clienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldcodigo_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldsubtotalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreanombre_clienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldivaComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldsubtotalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFielddescuentoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldivaComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldfinanciamientoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFielddescuentoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldfleteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldfinanciamientoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldiceComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldfleteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldtotalComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldiceComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldvalorComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldtotalComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jDateChooserfecha_forma_pagoComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldvalorComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldnumeroComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jDateChooserfecha_forma_pagoComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreatarjeta_habienteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldnumeroComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextAreaautorizacionComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreatarjeta_habienteComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldvoucherComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextAreaautorizacionComprobanteTarjeta;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobantetarjetaJInternalFrame.jTextFieldloteComprobanteTarjeta)) {
			componentTab=this.comprobantetarjetaJInternalFrame.jTextFieldvoucherComprobanteTarjeta;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobantetarjetaJInternalFrame.getjButtonActualizarToolBarComprobanteTarjeta();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobantetarjetaJInternalFrame.getjButtonCancelarToolBarComprobanteTarjeta();
			
			
			return componentTab;		
		}
		
		public ComprobanteTarjetaDetalleFormJInternalFrame getcomprobantetarjetaJInternalFrame() {
			return this.comprobantetarjetaJInternalFrame;
		}
		
		public void setcomprobantetarjetaJInternalFrame(ComprobanteTarjetaDetalleFormJInternalFrame comprobantetarjetaJInternalFrame) {
			this.comprobantetarjetaJInternalFrame=comprobantetarjetaJInternalFrame;
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

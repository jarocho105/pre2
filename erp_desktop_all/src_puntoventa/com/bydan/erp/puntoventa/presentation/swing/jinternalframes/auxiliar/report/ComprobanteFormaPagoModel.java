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

//import com.bydan.erp.puntoventa.util.ComprobanteFormaPagoConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoParameterGeneral;

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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteFormaPagoBeanSwingJInternalFrame;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteFormaPagoJInternalFrame;

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.ComprobanteFormaPagoDetalleFormJInternalFrame;

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

public class ComprobanteFormaPagoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ComprobanteFormaPagoConstantesFunciones.LABEL_ID
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA
										,ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL
										,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA
										,ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE
										,ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL
										,ComprobanteFormaPagoConstantesFunciones.LABEL_IVA
										,ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO
										,ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO
										,ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE
										,ComprobanteFormaPagoConstantesFunciones.LABEL_ICE
										,ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL
										,ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO
										,ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR
										,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE
										,ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO
										,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA
										,ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION
										,ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE
										};
	   
	    public List<ComprobanteFormaPago> comprobanteformapagos;
	  	 
	    //NO SE UTILIZA
	    public ComprobanteFormaPagoModel(List<ComprobanteFormaPago> comprobanteformapagos,JInternalFrameBase jInternalFrameBase) {
	    	this.comprobanteformapagos=comprobanteformapagos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ComprobanteFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.comprobanteformapagos=new ArrayList<ComprobanteFormaPago>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.comprobanteformapagos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.comprobanteformapagos.get(rowIndex).getIsSelected();
	            
				case 1: return this.comprobanteformapagos.get(rowIndex).getId();
				case 2: return this.comprobanteformapagos.get(rowIndex).getnombre_caja();
				case 3: return this.comprobanteformapagos.get(rowIndex).getsecuencial();
				case 4: return this.comprobanteformapagos.get(rowIndex).getfecha();
				case 5: return this.comprobanteformapagos.get(rowIndex).getcodigo_cliente();
				case 6: return this.comprobanteformapagos.get(rowIndex).getnombre_cliente();
				case 7: return this.comprobanteformapagos.get(rowIndex).getsubtotal();
				case 8: return this.comprobanteformapagos.get(rowIndex).getiva();
				case 9: return this.comprobanteformapagos.get(rowIndex).getdescuento();
				case 10: return this.comprobanteformapagos.get(rowIndex).getfinanciamiento();
				case 11: return this.comprobanteformapagos.get(rowIndex).getflete();
				case 12: return this.comprobanteformapagos.get(rowIndex).getice();
				case 13: return this.comprobanteformapagos.get(rowIndex).gettotal();
				case 14: return this.comprobanteformapagos.get(rowIndex).gettipo();
				case 15: return this.comprobanteformapagos.get(rowIndex).getvalor();
				case 16: return this.comprobanteformapagos.get(rowIndex).getfecha_forma_pago();
				case 17: return this.comprobanteformapagos.get(rowIndex).getnumero_cuenta();
				case 18: return this.comprobanteformapagos.get(rowIndex).getnumero_cheque();
				case 19: return this.comprobanteformapagos.get(rowIndex).getgirador();
				case 20: return this.comprobanteformapagos.get(rowIndex).getnumero_dias_plazo();
				case 21: return this.comprobanteformapagos.get(rowIndex).getnumero_tarjeta();
				case 22: return this.comprobanteformapagos.get(rowIndex).getautorizacion();
				case 23: return this.comprobanteformapagos.get(rowIndex).getlote();	            
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
				case 14: return String.class;
				case 15: return Double.class;
				case 16: return Date.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return Integer.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ComprobanteFormaPago comprobanteformapago = this.comprobanteformapagos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ComprobanteFormaPagoBeanSwingJInternalFrame comprobanteformapagoBeanSwingJInternalFrame=(ComprobanteFormaPagoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {comprobanteformapago.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {comprobanteformapago.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {comprobanteformapago.setnombre_caja((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {comprobanteformapago.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {comprobanteformapago.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {comprobanteformapago.setcodigo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {comprobanteformapago.setnombre_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {comprobanteformapago.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {comprobanteformapago.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {comprobanteformapago.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {comprobanteformapago.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {comprobanteformapago.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {comprobanteformapago.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {comprobanteformapago.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {comprobanteformapago.settipo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {comprobanteformapago.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {comprobanteformapago.setfecha_forma_pago((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {comprobanteformapago.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {comprobanteformapago.setnumero_cheque((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {comprobanteformapago.setgirador((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {comprobanteformapago.setnumero_dias_plazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {comprobanteformapago.setnumero_tarjeta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {comprobanteformapago.setautorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {comprobanteformapago.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ComprobanteFormaPagoModel(JInternalFrameBase jInternalFrameBase) {
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
		private ComprobanteFormaPagoDetalleFormJInternalFrame comprobanteformapagoJInternalFrame=null;
		
		public ComprobanteFormaPagoModel(ComprobanteFormaPagoDetalleFormJInternalFrame comprobanteformapagoJInternalFrame) {
			this.comprobanteformapagoJInternalFrame=comprobanteformapagoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago();
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago())) {
				componentTab=this.comprobanteformapagoJInternalFrame.getjButtonEliminarToolBarComprobanteFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.getjButtonEliminarToolBarComprobanteFormaPago())) {
				componentTab=this.comprobanteformapagoJInternalFrame.getjButtonCancelarToolBarComprobanteFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.getjButtonCancelarToolBarComprobanteFormaPago())) {
				componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_empresaComprobanteFormaPago;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldloteComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jButtonEliminarComprobanteFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jButtonEliminarComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jButtonActualizarComprobanteFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jButtonActualizarComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jButtonCancelarComprobanteFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_empresaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_sucursalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_sucursalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_cajaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_cajaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_inicioComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_inicioComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_finComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_finComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreanombre_cajaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreanombre_cajaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldsecuencialComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldsecuencialComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfechaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfechaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldcodigo_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldcodigo_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreanombre_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreanombre_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldsubtotalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldsubtotalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldivaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldivaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFielddescuentoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFielddescuentoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldfinanciamientoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldfinanciamientoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldfleteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldfleteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldiceComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldiceComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldtotalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldtotalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldtipoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldtipoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldvalorComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldvalorComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_forma_pagoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_forma_pagoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_cuentaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_cuentaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_chequeComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_chequeComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreagiradorComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreagiradorComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_dias_plazoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_dias_plazoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_tarjetaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_tarjetaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreaautorizacionComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreaautorizacionComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldloteComprobanteFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago();
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.getjButtonEliminarToolBarComprobanteFormaPago())) {
				componentTab=this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.getjButtonCancelarToolBarComprobanteFormaPago())) {
				componentTab=this.comprobanteformapagoJInternalFrame.getjButtonEliminarToolBarComprobanteFormaPago();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_empresaComprobanteFormaPago)) {
				
				componentTab=this.comprobanteformapagoJInternalFrame.getjButtonCancelarToolBarComprobanteFormaPago();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldloteComprobanteFormaPago;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jButtonEliminarComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxTiposAccionesFormularioComprobanteFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jButtonActualizarComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jButtonEliminarComprobanteFormaPago;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jButtonCancelarComprobanteFormaPago)) {
				componentTab=this.comprobanteformapagoJInternalFrame.jButtonActualizarComprobanteFormaPago;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_sucursalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_empresaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_sucursalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jComboBoxid_cajaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_inicioComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jComboBoxid_cajaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_finComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_inicioComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreanombre_cajaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_finComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldsecuencialComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreanombre_cajaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfechaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldsecuencialComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldcodigo_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfechaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreanombre_clienteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldcodigo_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldsubtotalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreanombre_clienteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldivaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldsubtotalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFielddescuentoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldivaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldfinanciamientoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFielddescuentoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldfleteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldfinanciamientoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldiceComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldfleteComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldtotalComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldiceComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldtipoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldtotalComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldvalorComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldtipoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jDateChooserfecha_forma_pagoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldvalorComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_cuentaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jDateChooserfecha_forma_pagoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_chequeComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_cuentaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreagiradorComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_chequeComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_dias_plazoComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreagiradorComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldnumero_tarjetaComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_dias_plazoComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextAreaautorizacionComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextFieldnumero_tarjetaComprobanteFormaPago;
			return componentTab;
		}

		if(component!=null && component.equals(this.comprobanteformapagoJInternalFrame.jTextFieldloteComprobanteFormaPago)) {
			componentTab=this.comprobanteformapagoJInternalFrame.jTextAreaautorizacionComprobanteFormaPago;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobanteformapagoJInternalFrame.getjButtonActualizarToolBarComprobanteFormaPago();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.comprobanteformapagoJInternalFrame.getjButtonCancelarToolBarComprobanteFormaPago();
			
			
			return componentTab;		
		}
		
		public ComprobanteFormaPagoDetalleFormJInternalFrame getcomprobanteformapagoJInternalFrame() {
			return this.comprobanteformapagoJInternalFrame;
		}
		
		public void setcomprobanteformapagoJInternalFrame(ComprobanteFormaPagoDetalleFormJInternalFrame comprobanteformapagoJInternalFrame) {
			this.comprobanteformapagoJInternalFrame=comprobanteformapagoJInternalFrame;
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

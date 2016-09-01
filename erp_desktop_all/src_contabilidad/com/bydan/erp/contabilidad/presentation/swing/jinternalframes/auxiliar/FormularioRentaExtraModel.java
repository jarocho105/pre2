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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.contabilidad.util.FormularioRentaExtraConstantesFunciones;
import com.bydan.erp.contabilidad.util.FormularioRentaExtraParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FormularioRentaExtraParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FormularioRentaExtraBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FormularioRentaExtraJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FormularioRentaExtraDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FormularioRentaExtraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FormularioRentaExtraConstantesFunciones.LABEL_ID
										,FormularioRentaExtraConstantesFunciones.LABEL_IDEMPRESA
										,FormularioRentaExtraConstantesFunciones.LABEL_IDEJERCICIO
										,FormularioRentaExtraConstantesFunciones.LABEL_IDPERIODO
										,FormularioRentaExtraConstantesFunciones.LABEL_IDDATOFORMULARIORENTA
										,FormularioRentaExtraConstantesFunciones.LABEL_IDFORMAPAGO
										,FormularioRentaExtraConstantesFunciones.LABEL_IDBANCO
										,FormularioRentaExtraConstantesFunciones.LABEL_PAGOPREVIO
										,FormularioRentaExtraConstantesFunciones.LABEL_INTERESMORA
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORMULTA
										,FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO1
										,FormularioRentaExtraConstantesFunciones.LABEL_FORMAPAGO2
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO1
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO2
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO3
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMERONOTACREDITO4
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO1
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO2
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO3
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORNOTACREDITO4
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE1
										,FormularioRentaExtraConstantesFunciones.LABEL_NUMEROCOMPROBANTE2
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE1
										,FormularioRentaExtraConstantesFunciones.LABEL_VALORCOMPROBANTE2
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR301
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR303
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR305
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR307
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR351
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR355
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR357
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR359
										,FormularioRentaExtraConstantesFunciones.LABEL_VALOR361
										};
	   
	    public List<FormularioRentaExtra> formulariorentaextras;
	  	 
	    //NO SE UTILIZA
	    public FormularioRentaExtraModel(List<FormularioRentaExtra> formulariorentaextras,JInternalFrameBase jInternalFrameBase) {
	    	this.formulariorentaextras=formulariorentaextras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FormularioRentaExtraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.formulariorentaextras=new ArrayList<FormularioRentaExtra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.formulariorentaextras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.formulariorentaextras.get(rowIndex).getIsSelected();
	            
				case 1: return this.formulariorentaextras.get(rowIndex).getId();
				case 2: return this.formulariorentaextras.get(rowIndex).getid_empresa();
				case 3: return this.formulariorentaextras.get(rowIndex).getid_ejercicio();
				case 4: return this.formulariorentaextras.get(rowIndex).getid_periodo();
				case 5: return this.formulariorentaextras.get(rowIndex).getid_dato_formulario_renta();
				case 6: return this.formulariorentaextras.get(rowIndex).getid_forma_pago();
				case 7: return this.formulariorentaextras.get(rowIndex).getid_banco();
				case 8: return this.formulariorentaextras.get(rowIndex).getpago_previo();
				case 9: return this.formulariorentaextras.get(rowIndex).getinteres_mora();
				case 10: return this.formulariorentaextras.get(rowIndex).getvalor_multa();
				case 11: return this.formulariorentaextras.get(rowIndex).getforma_pago1();
				case 12: return this.formulariorentaextras.get(rowIndex).getforma_pago2();
				case 13: return this.formulariorentaextras.get(rowIndex).getnumero_nota_credito1();
				case 14: return this.formulariorentaextras.get(rowIndex).getnumero_nota_credito2();
				case 15: return this.formulariorentaextras.get(rowIndex).getnumero_nota_credito3();
				case 16: return this.formulariorentaextras.get(rowIndex).getnumero_nota_credito4();
				case 17: return this.formulariorentaextras.get(rowIndex).getvalor_nota_credito1();
				case 18: return this.formulariorentaextras.get(rowIndex).getvalor_nota_credito2();
				case 19: return this.formulariorentaextras.get(rowIndex).getvalor_nota_credito3();
				case 20: return this.formulariorentaextras.get(rowIndex).getvalor_nota_credito4();
				case 21: return this.formulariorentaextras.get(rowIndex).getnumero_comprobante1();
				case 22: return this.formulariorentaextras.get(rowIndex).getnumero_comprobante2();
				case 23: return this.formulariorentaextras.get(rowIndex).getvalor_comprobante1();
				case 24: return this.formulariorentaextras.get(rowIndex).getvalor_comprobante2();
				case 25: return this.formulariorentaextras.get(rowIndex).getvalor301();
				case 26: return this.formulariorentaextras.get(rowIndex).getvalor303();
				case 27: return this.formulariorentaextras.get(rowIndex).getvalor305();
				case 28: return this.formulariorentaextras.get(rowIndex).getvalor307();
				case 29: return this.formulariorentaextras.get(rowIndex).getvalor351();
				case 30: return this.formulariorentaextras.get(rowIndex).getvalor355();
				case 31: return this.formulariorentaextras.get(rowIndex).getvalor357();
				case 32: return this.formulariorentaextras.get(rowIndex).getvalor359();
				case 33: return this.formulariorentaextras.get(rowIndex).getvalor361();	            
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
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Double.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Double.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;	            
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
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	FormularioRentaExtra formulariorentaextra = this.formulariorentaextras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame=(FormularioRentaExtraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {formulariorentaextra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {formulariorentaextra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {formulariorentaextra.setid_empresa((Long) value);formulariorentaextra.setempresa_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {formulariorentaextra.setid_ejercicio((Long) value);formulariorentaextra.setejercicio_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {formulariorentaextra.setid_periodo((Long) value);formulariorentaextra.setperiodo_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {formulariorentaextra.setid_dato_formulario_renta((Long) value);formulariorentaextra.setdatoformulariorenta_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualDatoFormularioRentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {formulariorentaextra.setid_forma_pago((Long) value);formulariorentaextra.setformapago_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {formulariorentaextra.setid_banco((Long) value);formulariorentaextra.setbanco_descripcion(formulariorentaextraBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {formulariorentaextra.setpago_previo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {formulariorentaextra.setinteres_mora((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {formulariorentaextra.setvalor_multa((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {formulariorentaextra.setforma_pago1((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {formulariorentaextra.setforma_pago2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {formulariorentaextra.setnumero_nota_credito1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {formulariorentaextra.setnumero_nota_credito2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {formulariorentaextra.setnumero_nota_credito3((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {formulariorentaextra.setnumero_nota_credito4((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {formulariorentaextra.setvalor_nota_credito1((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {formulariorentaextra.setvalor_nota_credito2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {formulariorentaextra.setvalor_nota_credito3((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {formulariorentaextra.setvalor_nota_credito4((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {formulariorentaextra.setnumero_comprobante1((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {formulariorentaextra.setnumero_comprobante2((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {formulariorentaextra.setvalor_comprobante1((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {formulariorentaextra.setvalor_comprobante2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {formulariorentaextra.setvalor301((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {formulariorentaextra.setvalor303((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {formulariorentaextra.setvalor305((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {formulariorentaextra.setvalor307((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {formulariorentaextra.setvalor351((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {formulariorentaextra.setvalor355((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {formulariorentaextra.setvalor357((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {formulariorentaextra.setvalor359((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {formulariorentaextra.setvalor361((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FormularioRentaExtraModel(JInternalFrameBase jInternalFrameBase) {
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
		private FormularioRentaExtraDetalleFormJInternalFrame formulariorentaextraJInternalFrame=null;
		
		public FormularioRentaExtraModel(FormularioRentaExtraDetalleFormJInternalFrame formulariorentaextraJInternalFrame) {
			this.formulariorentaextraJInternalFrame=formulariorentaextraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra();
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra())) {
				componentTab=this.formulariorentaextraJInternalFrame.getjButtonEliminarToolBarFormularioRentaExtra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.getjButtonEliminarToolBarFormularioRentaExtra())) {
				componentTab=this.formulariorentaextraJInternalFrame.getjButtonCancelarToolBarFormularioRentaExtra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.getjButtonCancelarToolBarFormularioRentaExtra())) {
				componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_empresaFormularioRentaExtra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor361FormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jComboBoxTiposAccionesFormularioFormularioRentaExtra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxTiposAccionesFormularioFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jButtonEliminarFormularioRentaExtra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jButtonEliminarFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jButtonActualizarFormularioRentaExtra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jButtonActualizarFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jButtonCancelarFormularioRentaExtra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_empresaFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_ejercicioFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_ejercicioFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_periodoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_periodoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_dato_formulario_rentaFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_dato_formulario_rentaFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_forma_pagoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_forma_pagoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_bancoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_bancoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldpago_previoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldpago_previoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldinteres_moraFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldinteres_moraFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_multaFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_multaFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldforma_pago1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldforma_pago1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldforma_pago2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldforma_pago2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito3FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito3FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito4FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito4FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito3FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito3FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito4FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito4FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor301FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor301FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor303FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor303FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor305FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor305FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor307FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor307FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor351FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor351FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor355FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor355FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor357FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor357FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor359FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor359FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor361FormularioRentaExtra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra();
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.getjButtonEliminarToolBarFormularioRentaExtra())) {
				componentTab=this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.getjButtonCancelarToolBarFormularioRentaExtra())) {
				componentTab=this.formulariorentaextraJInternalFrame.getjButtonEliminarToolBarFormularioRentaExtra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_empresaFormularioRentaExtra)) {
				
				componentTab=this.formulariorentaextraJInternalFrame.getjButtonCancelarToolBarFormularioRentaExtra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxTiposAccionesFormularioFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor361FormularioRentaExtra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jButtonEliminarFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jComboBoxTiposAccionesFormularioFormularioRentaExtra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jButtonActualizarFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jButtonEliminarFormularioRentaExtra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jButtonCancelarFormularioRentaExtra)) {
				componentTab=this.formulariorentaextraJInternalFrame.jButtonActualizarFormularioRentaExtra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_ejercicioFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_empresaFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_periodoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_ejercicioFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_dato_formulario_rentaFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_periodoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_forma_pagoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_dato_formulario_rentaFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jComboBoxid_bancoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_forma_pagoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldpago_previoFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jComboBoxid_bancoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldinteres_moraFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldpago_previoFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_multaFormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldinteres_moraFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldforma_pago1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_multaFormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldforma_pago2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldforma_pago1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldforma_pago2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito3FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito4FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito3FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_nota_credito4FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito3FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito4FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito3FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_nota_credito4FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante1FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldnumero_comprobante2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante2FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante1FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor301FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor_comprobante2FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor303FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor301FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor305FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor303FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor307FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor305FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor351FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor307FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor355FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor351FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor357FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor355FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor359FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor357FormularioRentaExtra;
			return componentTab;
		}

		if(component!=null && component.equals(this.formulariorentaextraJInternalFrame.jTextFieldvalor361FormularioRentaExtra)) {
			componentTab=this.formulariorentaextraJInternalFrame.jTextFieldvalor359FormularioRentaExtra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.formulariorentaextraJInternalFrame.getjButtonActualizarToolBarFormularioRentaExtra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.formulariorentaextraJInternalFrame.getjButtonCancelarToolBarFormularioRentaExtra();
			
			
			return componentTab;		
		}
		
		public FormularioRentaExtraDetalleFormJInternalFrame getformulariorentaextraJInternalFrame() {
			return this.formulariorentaextraJInternalFrame;
		}
		
		public void setformulariorentaextraJInternalFrame(FormularioRentaExtraDetalleFormJInternalFrame formulariorentaextraJInternalFrame) {
			this.formulariorentaextraJInternalFrame=formulariorentaextraJInternalFrame;
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

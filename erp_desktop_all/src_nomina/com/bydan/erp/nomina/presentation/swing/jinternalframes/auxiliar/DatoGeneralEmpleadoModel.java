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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.nomina.util.DatoGeneralEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.DatoGeneralEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.DatoGeneralEmpleadoParameterGeneral;

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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DatoGeneralEmpleadoBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DatoGeneralEmpleadoJInternalFrame;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.DatoGeneralEmpleadoDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DatoGeneralEmpleadoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_ID
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDNUMEROPATRONAL
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOAFILIACION
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CARNETIESS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_SECTORIALIESS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPAIS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPROVINCIA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDCANTON
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPARROQUIA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHANACIMIENTO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHAFALLECE
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOREVALUACION
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROHORAS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALORHORA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_SALARIO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDMONEDA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCONTRATO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR1
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR2
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR3
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR4
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR5
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR6
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CONAPORTASEGUROSOCIAL
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CONRECIBEHORASEXTRAS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CONDESCUENTOIMPUESTOS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_PENSIONALIMENTICIA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CONPAGOPORHORAS
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_CONANTICIPO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOLIBRETAMILI
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_LIBRETAMILITAR
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDBANCO
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCUENTA
										,DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOSANGRE
										};
	   
	    public List<DatoGeneralEmpleado> datogeneralempleados;
	  	 
	    //NO SE UTILIZA
	    public DatoGeneralEmpleadoModel(List<DatoGeneralEmpleado> datogeneralempleados,JInternalFrameBase jInternalFrameBase) {
	    	this.datogeneralempleados=datogeneralempleados;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DatoGeneralEmpleadoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.datogeneralempleados=new ArrayList<DatoGeneralEmpleado>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.datogeneralempleados.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.datogeneralempleados.get(rowIndex).getIsSelected();
	            
				case 1: return this.datogeneralempleados.get(rowIndex).getId();
				case 2: return this.datogeneralempleados.get(rowIndex).getid_numero_patronal();
				case 3: return this.datogeneralempleados.get(rowIndex).getid_tipo_afiliacion();
				case 4: return this.datogeneralempleados.get(rowIndex).getcarnet_iess();
				case 5: return this.datogeneralempleados.get(rowIndex).getsectorial_iess();
				case 6: return this.datogeneralempleados.get(rowIndex).getid_pais();
				case 7: return this.datogeneralempleados.get(rowIndex).getid_provincia();
				case 8: return this.datogeneralempleados.get(rowIndex).getid_canton();
				case 9: return this.datogeneralempleados.get(rowIndex).getid_parroquia();
				case 10: return this.datogeneralempleados.get(rowIndex).getfecha_nacimiento();
				case 11: return this.datogeneralempleados.get(rowIndex).getfecha_fallece();
				case 12: return this.datogeneralempleados.get(rowIndex).getvalor_evaluacion();
				case 13: return this.datogeneralempleados.get(rowIndex).getnumero_horas();
				case 14: return this.datogeneralempleados.get(rowIndex).getvalor_hora();
				case 15: return this.datogeneralempleados.get(rowIndex).getsalario();
				case 16: return this.datogeneralempleados.get(rowIndex).getid_moneda();
				case 17: return this.datogeneralempleados.get(rowIndex).getnumero_contrato();
				case 18: return this.datogeneralempleados.get(rowIndex).getid_tipo_contrato();
				case 19: return this.datogeneralempleados.get(rowIndex).getvalor1();
				case 20: return this.datogeneralempleados.get(rowIndex).getvalor2();
				case 21: return this.datogeneralempleados.get(rowIndex).getvalor3();
				case 22: return this.datogeneralempleados.get(rowIndex).getvalor4();
				case 23: return this.datogeneralempleados.get(rowIndex).getvalor5();
				case 24: return this.datogeneralempleados.get(rowIndex).getvalor6();
				case 25: return this.datogeneralempleados.get(rowIndex).getcon_aporta_seguro_social();
				case 26: return this.datogeneralempleados.get(rowIndex).getcon_recibe_horas_extras();
				case 27: return this.datogeneralempleados.get(rowIndex).getcon_descuento_impuestos();
				case 28: return this.datogeneralempleados.get(rowIndex).getpension_alimenticia();
				case 29: return this.datogeneralempleados.get(rowIndex).getcon_pago_por_horas();
				case 30: return this.datogeneralempleados.get(rowIndex).getcon_anticipo();
				case 31: return this.datogeneralempleados.get(rowIndex).getid_tipo_libreta_mili();
				case 32: return this.datogeneralempleados.get(rowIndex).getlibreta_militar();
				case 33: return this.datogeneralempleados.get(rowIndex).getid_tipo_grupo_forma_pago();
				case 34: return this.datogeneralempleados.get(rowIndex).getid_banco();
				case 35: return this.datogeneralempleados.get(rowIndex).getid_tipo_cuenta_banco_global();
				case 36: return this.datogeneralempleados.get(rowIndex).getnumero_cuenta();
				case 37: return this.datogeneralempleados.get(rowIndex).getid_tipo_sangre();	            
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
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Date.class;
				case 11: return Date.class;
				case 12: return Double.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return Long.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Boolean.class;
				case 26: return Boolean.class;
				case 27: return Boolean.class;
				case 28: return Double.class;
				case 29: return Boolean.class;
				case 30: return Boolean.class;
				case 31: return Long.class;
				case 32: return String.class;
				case 33: return Long.class;
				case 34: return Long.class;
				case 35: return Long.class;
				case 36: return String.class;
				case 37: return Long.class;	            
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
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DatoGeneralEmpleado datogeneralempleado = this.datogeneralempleados.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=(DatoGeneralEmpleadoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {datogeneralempleado.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {datogeneralempleado.setId((Long) value);datogeneralempleado.setempleado_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {datogeneralempleado.setid_numero_patronal((Long) value);datogeneralempleado.setnumeropatronal_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualNumeroPatronalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {datogeneralempleado.setid_tipo_afiliacion((Long) value);datogeneralempleado.settipoafiliacion_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoAfiliacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {datogeneralempleado.setcarnet_iess((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {datogeneralempleado.setsectorial_iess((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {datogeneralempleado.setid_pais((Long) value);datogeneralempleado.setpais_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {datogeneralempleado.setid_provincia((Long) value);datogeneralempleado.setprovincia_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualProvinciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {datogeneralempleado.setid_canton((Long) value);datogeneralempleado.setcanton_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualCantonForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {datogeneralempleado.setid_parroquia((Long) value);datogeneralempleado.setparroquia_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualParroquiaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {datogeneralempleado.setfecha_nacimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {datogeneralempleado.setfecha_fallece((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {datogeneralempleado.setvalor_evaluacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {datogeneralempleado.setnumero_horas((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {datogeneralempleado.setvalor_hora((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {datogeneralempleado.setsalario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {datogeneralempleado.setid_moneda((Long) value);datogeneralempleado.setmoneda_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {datogeneralempleado.setnumero_contrato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {datogeneralempleado.setid_tipo_contrato((Long) value);datogeneralempleado.settipocontrato_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoContratoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {datogeneralempleado.setvalor1((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {datogeneralempleado.setvalor2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {datogeneralempleado.setvalor3((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {datogeneralempleado.setvalor4((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {datogeneralempleado.setvalor5((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {datogeneralempleado.setvalor6((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {datogeneralempleado.setcon_aporta_seguro_social((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {datogeneralempleado.setcon_recibe_horas_extras((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {datogeneralempleado.setcon_descuento_impuestos((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {datogeneralempleado.setpension_alimenticia((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {datogeneralempleado.setcon_pago_por_horas((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {datogeneralempleado.setcon_anticipo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {datogeneralempleado.setid_tipo_libreta_mili((Long) value);datogeneralempleado.settipolibretamili_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoLibretaMiliForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {datogeneralempleado.setlibreta_militar((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {datogeneralempleado.setid_tipo_grupo_forma_pago((Long) value);datogeneralempleado.settipogrupoformapago_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoGrupoFormaPagoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {datogeneralempleado.setid_banco((Long) value);datogeneralempleado.setbanco_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualBancoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {datogeneralempleado.setid_tipo_cuenta_banco_global((Long) value);datogeneralempleado.settipocuentabancoglobal_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoCuentaBancoGlobalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {datogeneralempleado.setnumero_cuenta((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {datogeneralempleado.setid_tipo_sangre((Long) value);datogeneralempleado.settiposangre_descripcion(datogeneralempleadoBeanSwingJInternalFrame.getActualTipoSangreForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DatoGeneralEmpleadoModel(JInternalFrameBase jInternalFrameBase) {
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
		private DatoGeneralEmpleadoDetalleFormJInternalFrame datogeneralempleadoJInternalFrame=null;
		
		public DatoGeneralEmpleadoModel(DatoGeneralEmpleadoDetalleFormJInternalFrame datogeneralempleadoJInternalFrame) {
			this.datogeneralempleadoJInternalFrame=datogeneralempleadoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado();
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado())) {
				componentTab=this.datogeneralempleadoJInternalFrame.getjButtonEliminarToolBarDatoGeneralEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.getjButtonEliminarToolBarDatoGeneralEmpleado())) {
				componentTab=this.datogeneralempleadoJInternalFrame.getjButtonCancelarToolBarDatoGeneralEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.getjButtonCancelarToolBarDatoGeneralEmpleado())) {
				componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_numero_patronalDatoGeneralEmpleado;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_sangreDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jButtonEliminarDatoGeneralEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jButtonEliminarDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jButtonActualizarDatoGeneralEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jButtonActualizarDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jButtonCancelarDatoGeneralEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_numero_patronalDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_afiliacionDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_afiliacionDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldcarnet_iessDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldcarnet_iessDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldsectorial_iessDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldsectorial_iessDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_paisDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_paisDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_provinciaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_provinciaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_cantonDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_cantonDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_parroquiaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_parroquiaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jDateChooserfecha_nacimientoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jDateChooserfecha_nacimientoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jDateChooserfecha_falleceDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jDateChooserfecha_falleceDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor_evaluacionDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor_evaluacionDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_horasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_horasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor_horaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor_horaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldsalarioDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldsalarioDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_monedaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_monedaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_contratoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_contratoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_contratoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_contratoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor1DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor1DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor2DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor2DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor3DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor3DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor4DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor4DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor5DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor5DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor6DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor6DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldpension_alimenticiaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldpension_alimenticiaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_pago_por_horasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_pago_por_horasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_anticipoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_anticipoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldlibreta_militarDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldlibreta_militarDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_bancoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_bancoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_cuentaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_cuentaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_sangreDatoGeneralEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado();
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.getjButtonEliminarToolBarDatoGeneralEmpleado())) {
				componentTab=this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.getjButtonCancelarToolBarDatoGeneralEmpleado())) {
				componentTab=this.datogeneralempleadoJInternalFrame.getjButtonEliminarToolBarDatoGeneralEmpleado();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_numero_patronalDatoGeneralEmpleado)) {
				
				componentTab=this.datogeneralempleadoJInternalFrame.getjButtonCancelarToolBarDatoGeneralEmpleado();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_sangreDatoGeneralEmpleado;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jButtonEliminarDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jButtonActualizarDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jButtonEliminarDatoGeneralEmpleado;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jButtonCancelarDatoGeneralEmpleado)) {
				componentTab=this.datogeneralempleadoJInternalFrame.jButtonActualizarDatoGeneralEmpleado;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_afiliacionDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_numero_patronalDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldcarnet_iessDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_afiliacionDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldsectorial_iessDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldcarnet_iessDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_paisDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldsectorial_iessDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_provinciaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_paisDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_cantonDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_provinciaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_parroquiaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_cantonDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jDateChooserfecha_nacimientoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_parroquiaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jDateChooserfecha_falleceDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jDateChooserfecha_nacimientoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor_evaluacionDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jDateChooserfecha_falleceDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_horasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor_evaluacionDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor_horaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_horasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldsalarioDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor_horaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_monedaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldsalarioDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_contratoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_monedaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_contratoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_contratoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor1DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_contratoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor2DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor1DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor3DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor2DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor4DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor3DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor5DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor4DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldvalor6DatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor5DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldvalor6DatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldpension_alimenticiaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_pago_por_horasDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldpension_alimenticiaDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jCheckBoxcon_anticipoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_pago_por_horasDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jCheckBoxcon_anticipoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldlibreta_militarDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldlibreta_militarDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_bancoDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_bancoDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jTextFieldnumero_cuentaDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado;
			return componentTab;
		}

		if(component!=null && component.equals(this.datogeneralempleadoJInternalFrame.jComboBoxid_tipo_sangreDatoGeneralEmpleado)) {
			componentTab=this.datogeneralempleadoJInternalFrame.jTextFieldnumero_cuentaDatoGeneralEmpleado;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.datogeneralempleadoJInternalFrame.getjButtonActualizarToolBarDatoGeneralEmpleado();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.datogeneralempleadoJInternalFrame.getjButtonCancelarToolBarDatoGeneralEmpleado();
			
			
			return componentTab;		
		}
		
		public DatoGeneralEmpleadoDetalleFormJInternalFrame getdatogeneralempleadoJInternalFrame() {
			return this.datogeneralempleadoJInternalFrame;
		}
		
		public void setdatogeneralempleadoJInternalFrame(DatoGeneralEmpleadoDetalleFormJInternalFrame datogeneralempleadoJInternalFrame) {
			this.datogeneralempleadoJInternalFrame=datogeneralempleadoJInternalFrame;
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

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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.NegocioClienteConstantesFunciones;
import com.bydan.erp.cartera.util.NegocioClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.NegocioClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.NegocioClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.NegocioClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.NegocioClienteDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class NegocioClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,NegocioClienteConstantesFunciones.LABEL_ID
										,NegocioClienteConstantesFunciones.LABEL_IDEMPRESA
										,NegocioClienteConstantesFunciones.LABEL_IDCLIENTE
										,NegocioClienteConstantesFunciones.LABEL_NOMBREQUIENSEFACTURA
										,NegocioClienteConstantesFunciones.LABEL_FAX
										,NegocioClienteConstantesFunciones.LABEL_RUC
										,NegocioClienteConstantesFunciones.LABEL_TELEFONO
										,NegocioClienteConstantesFunciones.LABEL_NOMBRELOCAL
										,NegocioClienteConstantesFunciones.LABEL_EMAIL
										,NegocioClienteConstantesFunciones.LABEL_DIRECCION
										,NegocioClienteConstantesFunciones.LABEL_ESLOCALPROPIO
										,NegocioClienteConstantesFunciones.LABEL_NUMEROANIOS
										,NegocioClienteConstantesFunciones.LABEL_NUMEROMESES
										,NegocioClienteConstantesFunciones.LABEL_IDTIPOUBICACIONNEGOCIO
										,NegocioClienteConstantesFunciones.LABEL_EMPLEADOSFIJOS
										,NegocioClienteConstantesFunciones.LABEL_EMPLEADOTEMPORALES
										,NegocioClienteConstantesFunciones.LABEL_EMPLEADOSTOTAL
										,NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCONTADO
										,NegocioClienteConstantesFunciones.LABEL_PORCENTAJEVENTASCREDITO
										,NegocioClienteConstantesFunciones.LABEL_PLAZODIAS
										,NegocioClienteConstantesFunciones.LABEL_NUMEROCLIENTES
										,NegocioClienteConstantesFunciones.LABEL_MONTOMAXIMOVENTASMENSUAL
										,NegocioClienteConstantesFunciones.LABEL_MONTOMINIMOVENTASMENSUAL
										,NegocioClienteConstantesFunciones.LABEL_ESENEROALTO
										,NegocioClienteConstantesFunciones.LABEL_ESFEBREROALTO
										,NegocioClienteConstantesFunciones.LABEL_ESMARZOALTO
										,NegocioClienteConstantesFunciones.LABEL_ESABRILALTO
										,NegocioClienteConstantesFunciones.LABEL_ESMAYOALTO
										,NegocioClienteConstantesFunciones.LABEL_ESJUNIOALTO
										,NegocioClienteConstantesFunciones.LABEL_ESJULIOALTO
										,NegocioClienteConstantesFunciones.LABEL_ESAGOSTOALTO
										,NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREALTO
										,NegocioClienteConstantesFunciones.LABEL_ESOCTUBREALTO
										,NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREALTO
										,NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREALTO
										,NegocioClienteConstantesFunciones.LABEL_ESENEROBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESFEBREROBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESMARZOBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESABRILBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESMAYOBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESJUNIOBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESJULIOBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESAGOSTOBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESSEPTIEMBREBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESOCTUBREBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESNOVIEMBREBAJO
										,NegocioClienteConstantesFunciones.LABEL_ESDICIEMBREBAJO
										,NegocioClienteConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<NegocioCliente> negocioclientes;
	  	 
	    //NO SE UTILIZA
	    public NegocioClienteModel(List<NegocioCliente> negocioclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.negocioclientes=negocioclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public NegocioClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.negocioclientes=new ArrayList<NegocioCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.negocioclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.negocioclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.negocioclientes.get(rowIndex).getId();
				case 2: return this.negocioclientes.get(rowIndex).getid_empresa();
				case 3: return this.negocioclientes.get(rowIndex).getid_cliente();
				case 4: return this.negocioclientes.get(rowIndex).getnombre_quien_se_factura();
				case 5: return this.negocioclientes.get(rowIndex).getfax();
				case 6: return this.negocioclientes.get(rowIndex).getruc();
				case 7: return this.negocioclientes.get(rowIndex).gettelefono();
				case 8: return this.negocioclientes.get(rowIndex).getnombre_local();
				case 9: return this.negocioclientes.get(rowIndex).gete_mail();
				case 10: return this.negocioclientes.get(rowIndex).getdireccion();
				case 11: return this.negocioclientes.get(rowIndex).getes_local_propio();
				case 12: return this.negocioclientes.get(rowIndex).getnumero_anios();
				case 13: return this.negocioclientes.get(rowIndex).getnumero_meses();
				case 14: return this.negocioclientes.get(rowIndex).getid_tipo_ubicacion_negocio();
				case 15: return this.negocioclientes.get(rowIndex).getempleados_fijos();
				case 16: return this.negocioclientes.get(rowIndex).getempleado_temporales();
				case 17: return this.negocioclientes.get(rowIndex).getempleados_total();
				case 18: return this.negocioclientes.get(rowIndex).getporcentaje_ventas_contado();
				case 19: return this.negocioclientes.get(rowIndex).getporcentaje_ventas_credito();
				case 20: return this.negocioclientes.get(rowIndex).getplazo_dias();
				case 21: return this.negocioclientes.get(rowIndex).getnumero_clientes();
				case 22: return this.negocioclientes.get(rowIndex).getmonto_maximo_ventas_mensual();
				case 23: return this.negocioclientes.get(rowIndex).getmonto_minimo_ventas_mensual();
				case 24: return this.negocioclientes.get(rowIndex).getes_enero_alto();
				case 25: return this.negocioclientes.get(rowIndex).getes_febrero_alto();
				case 26: return this.negocioclientes.get(rowIndex).getes_marzo_alto();
				case 27: return this.negocioclientes.get(rowIndex).getes_abril_alto();
				case 28: return this.negocioclientes.get(rowIndex).getes_mayo_alto();
				case 29: return this.negocioclientes.get(rowIndex).getes_junio_alto();
				case 30: return this.negocioclientes.get(rowIndex).getes_julio_alto();
				case 31: return this.negocioclientes.get(rowIndex).getes_agosto_alto();
				case 32: return this.negocioclientes.get(rowIndex).getes_septiembre_alto();
				case 33: return this.negocioclientes.get(rowIndex).getes_octubre_alto();
				case 34: return this.negocioclientes.get(rowIndex).getes_noviembre_alto();
				case 35: return this.negocioclientes.get(rowIndex).getes_diciembre_alto();
				case 36: return this.negocioclientes.get(rowIndex).getes_enero_bajo();
				case 37: return this.negocioclientes.get(rowIndex).getes_febrero_bajo();
				case 38: return this.negocioclientes.get(rowIndex).getes_marzo_bajo();
				case 39: return this.negocioclientes.get(rowIndex).getes_abril_bajo();
				case 40: return this.negocioclientes.get(rowIndex).getes_mayo_bajo();
				case 41: return this.negocioclientes.get(rowIndex).getes_junio_bajo();
				case 42: return this.negocioclientes.get(rowIndex).getes_julio_bajo();
				case 43: return this.negocioclientes.get(rowIndex).getes_agosto_bajo();
				case 44: return this.negocioclientes.get(rowIndex).getes_septiembre_bajo();
				case 45: return this.negocioclientes.get(rowIndex).getes_octubre_bajo();
				case 46: return this.negocioclientes.get(rowIndex).getes_noviembre_bajo();
				case 47: return this.negocioclientes.get(rowIndex).getes_diciembre_bajo();
				case 48: return this.negocioclientes.get(rowIndex).getdescripcion();	            
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
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return Boolean.class;
				case 12: return Integer.class;
				case 13: return Integer.class;
				case 14: return Long.class;
				case 15: return Integer.class;
				case 16: return Integer.class;
				case 17: return Integer.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Integer.class;
				case 21: return Integer.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Boolean.class;
				case 25: return Boolean.class;
				case 26: return Boolean.class;
				case 27: return Boolean.class;
				case 28: return Boolean.class;
				case 29: return Boolean.class;
				case 30: return Boolean.class;
				case 31: return Boolean.class;
				case 32: return Boolean.class;
				case 33: return Boolean.class;
				case 34: return Boolean.class;
				case 35: return Boolean.class;
				case 36: return Boolean.class;
				case 37: return Boolean.class;
				case 38: return Boolean.class;
				case 39: return Boolean.class;
				case 40: return Boolean.class;
				case 41: return Boolean.class;
				case 42: return Boolean.class;
				case 43: return Boolean.class;
				case 44: return Boolean.class;
				case 45: return Boolean.class;
				case 46: return Boolean.class;
				case 47: return Boolean.class;
				case 48: return String.class;	            
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
				case 38: return true;
				case 39: return true;
				case 40: return true;
				case 41: return true;
				case 42: return true;
				case 43: return true;
				case 44: return true;
				case 45: return true;
				case 46: return true;
				case 47: return true;
				case 48: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	NegocioCliente negociocliente = this.negocioclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			NegocioClienteBeanSwingJInternalFrame negocioclienteBeanSwingJInternalFrame=(NegocioClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {negociocliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {negociocliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {negociocliente.setid_empresa((Long) value);negociocliente.setempresa_descripcion(negocioclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {negociocliente.setid_cliente((Long) value);negociocliente.setcliente_descripcion(negocioclienteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {negociocliente.setnombre_quien_se_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {negociocliente.setfax((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {negociocliente.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {negociocliente.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {negociocliente.setnombre_local((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {negociocliente.sete_mail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {negociocliente.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {negociocliente.setes_local_propio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {negociocliente.setnumero_anios((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {negociocliente.setnumero_meses((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {negociocliente.setid_tipo_ubicacion_negocio((Long) value);negociocliente.settipoubicacionnegocio_descripcion(negocioclienteBeanSwingJInternalFrame.getActualTipoUbicacionNegocioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {negociocliente.setempleados_fijos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {negociocliente.setempleado_temporales((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {negociocliente.setempleados_total((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {negociocliente.setporcentaje_ventas_contado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {negociocliente.setporcentaje_ventas_credito((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {negociocliente.setplazo_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {negociocliente.setnumero_clientes((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {negociocliente.setmonto_maximo_ventas_mensual((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {negociocliente.setmonto_minimo_ventas_mensual((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {negociocliente.setes_enero_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {negociocliente.setes_febrero_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {negociocliente.setes_marzo_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {negociocliente.setes_abril_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {negociocliente.setes_mayo_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {negociocliente.setes_junio_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {negociocliente.setes_julio_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {negociocliente.setes_agosto_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {negociocliente.setes_septiembre_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {negociocliente.setes_octubre_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {negociocliente.setes_noviembre_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {negociocliente.setes_diciembre_alto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {negociocliente.setes_enero_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {negociocliente.setes_febrero_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {negociocliente.setes_marzo_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {negociocliente.setes_abril_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {negociocliente.setes_mayo_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {negociocliente.setes_junio_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {negociocliente.setes_julio_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {negociocliente.setes_agosto_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {negociocliente.setes_septiembre_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {negociocliente.setes_octubre_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {negociocliente.setes_noviembre_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {negociocliente.setes_diciembre_bajo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {negociocliente.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public NegocioClienteModel(JInternalFrameBase jInternalFrameBase) {
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
		private NegocioClienteDetalleFormJInternalFrame negocioclienteJInternalFrame=null;
		
		public NegocioClienteModel(NegocioClienteDetalleFormJInternalFrame negocioclienteJInternalFrame) {
			this.negocioclienteJInternalFrame=negocioclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente();
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente())) {
				componentTab=this.negocioclienteJInternalFrame.getjButtonEliminarToolBarNegocioCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.getjButtonEliminarToolBarNegocioCliente())) {
				componentTab=this.negocioclienteJInternalFrame.getjButtonCancelarToolBarNegocioCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.getjButtonCancelarToolBarNegocioCliente())) {
				componentTab=this.negocioclienteJInternalFrame.jComboBoxid_empresaNegocioCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreadescripcionNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jComboBoxTiposAccionesFormularioNegocioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxTiposAccionesFormularioNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jButtonEliminarNegocioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jButtonEliminarNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jButtonActualizarNegocioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jButtonActualizarNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jButtonCancelarNegocioCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_empresaNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jComboBoxid_clienteNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_clienteNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreanombre_quien_se_facturaNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreanombre_quien_se_facturaNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldfaxNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldfaxNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldrucNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldrucNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldtelefonoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldtelefonoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreanombre_localNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreanombre_localNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFielde_mailNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFielde_mailNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreadireccionNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreadireccionNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_local_propioNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_local_propioNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_aniosNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_aniosNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_mesesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_mesesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jComboBoxid_tipo_ubicacion_negocioNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_tipo_ubicacion_negocioNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleados_fijosNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleados_fijosNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleado_temporalesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleado_temporalesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleados_totalNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleados_totalNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_contadoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_contadoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_creditoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_creditoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldplazo_diasNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldplazo_diasNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_clientesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_clientesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldmonto_maximo_ventas_mensualNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldmonto_maximo_ventas_mensualNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldmonto_minimo_ventas_mensualNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldmonto_minimo_ventas_mensualNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_enero_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_enero_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_febrero_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_febrero_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_marzo_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_marzo_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_abril_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_abril_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_mayo_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_mayo_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_junio_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_junio_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_julio_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_julio_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_agosto_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_agosto_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_octubre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_octubre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_enero_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_enero_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_febrero_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_febrero_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_marzo_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_marzo_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_abril_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_abril_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_mayo_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_mayo_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_junio_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_junio_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_julio_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_julio_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_agosto_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_agosto_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_octubre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_octubre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreadescripcionNegocioCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente();
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.getjButtonEliminarToolBarNegocioCliente())) {
				componentTab=this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.getjButtonCancelarToolBarNegocioCliente())) {
				componentTab=this.negocioclienteJInternalFrame.getjButtonEliminarToolBarNegocioCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_empresaNegocioCliente)) {
				
				componentTab=this.negocioclienteJInternalFrame.getjButtonCancelarToolBarNegocioCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxTiposAccionesFormularioNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jTextAreadescripcionNegocioCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jButtonEliminarNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jComboBoxTiposAccionesFormularioNegocioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jButtonActualizarNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jButtonEliminarNegocioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.negocioclienteJInternalFrame.jButtonCancelarNegocioCliente)) {
				componentTab=this.negocioclienteJInternalFrame.jButtonActualizarNegocioCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_clienteNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jComboBoxid_empresaNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreanombre_quien_se_facturaNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jComboBoxid_clienteNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldfaxNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreanombre_quien_se_facturaNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldrucNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldfaxNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldtelefonoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldrucNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreanombre_localNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldtelefonoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFielde_mailNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreanombre_localNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreadireccionNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFielde_mailNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_local_propioNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextAreadireccionNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_aniosNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_local_propioNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_mesesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_aniosNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jComboBoxid_tipo_ubicacion_negocioNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_mesesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleados_fijosNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jComboBoxid_tipo_ubicacion_negocioNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleado_temporalesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleados_fijosNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldempleados_totalNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleado_temporalesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_contadoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldempleados_totalNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_creditoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_contadoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldplazo_diasNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldporcentaje_ventas_creditoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldnumero_clientesNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldplazo_diasNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldmonto_maximo_ventas_mensualNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldnumero_clientesNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextFieldmonto_minimo_ventas_mensualNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldmonto_maximo_ventas_mensualNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_enero_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jTextFieldmonto_minimo_ventas_mensualNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_febrero_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_enero_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_marzo_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_febrero_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_abril_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_marzo_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_mayo_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_abril_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_junio_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_mayo_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_julio_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_junio_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_agosto_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_julio_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_agosto_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_octubre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_octubre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_altoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_enero_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_altoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_febrero_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_enero_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_marzo_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_febrero_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_abril_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_marzo_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_mayo_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_abril_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_junio_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_mayo_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_julio_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_junio_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_agosto_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_julio_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_agosto_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_octubre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_septiembre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_octubre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_bajoNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_noviembre_bajoNegocioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.negocioclienteJInternalFrame.jTextAreadescripcionNegocioCliente)) {
			componentTab=this.negocioclienteJInternalFrame.jCheckBoxes_diciembre_bajoNegocioCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.negocioclienteJInternalFrame.getjButtonActualizarToolBarNegocioCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.negocioclienteJInternalFrame.getjButtonCancelarToolBarNegocioCliente();
			
			
			return componentTab;		
		}
		
		public NegocioClienteDetalleFormJInternalFrame getnegocioclienteJInternalFrame() {
			return this.negocioclienteJInternalFrame;
		}
		
		public void setnegocioclienteJInternalFrame(NegocioClienteDetalleFormJInternalFrame negocioclienteJInternalFrame) {
			this.negocioclienteJInternalFrame=negocioclienteJInternalFrame;
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

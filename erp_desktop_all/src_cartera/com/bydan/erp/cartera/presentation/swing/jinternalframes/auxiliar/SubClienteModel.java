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

import com.bydan.erp.cartera.util.SubClienteConstantesFunciones;
import com.bydan.erp.cartera.util.SubClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.SubClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.SubClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.SubClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.SubClienteDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class SubClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,SubClienteConstantesFunciones.LABEL_ID
										,SubClienteConstantesFunciones.LABEL_IDEMPRESA
										,SubClienteConstantesFunciones.LABEL_IDCLIENTE
										,SubClienteConstantesFunciones.LABEL_IDSUCURSAL
										,SubClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION
										,SubClienteConstantesFunciones.LABEL_IDENTIFICACION
										,SubClienteConstantesFunciones.LABEL_RUC
										,SubClienteConstantesFunciones.LABEL_NOMBRE
										,SubClienteConstantesFunciones.LABEL_APELLIDO
										,SubClienteConstantesFunciones.LABEL_NOMBRECOMPLETO
										,SubClienteConstantesFunciones.LABEL_DIRECCION
										,SubClienteConstantesFunciones.LABEL_TELEFONO
										,SubClienteConstantesFunciones.LABEL_NUMEROCELULAR
										,SubClienteConstantesFunciones.LABEL_MAIL
										,SubClienteConstantesFunciones.LABEL_FECHANACIMIENTO
										,SubClienteConstantesFunciones.LABEL_FECHA
										,SubClienteConstantesFunciones.LABEL_OBSERVACION
										,SubClienteConstantesFunciones.LABEL_IDPAIS
										,SubClienteConstantesFunciones.LABEL_IDCIUDAD
										,SubClienteConstantesFunciones.LABEL_IDZONA
										,SubClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD
										,SubClienteConstantesFunciones.LABEL_IDTIPOGENERO
										,SubClienteConstantesFunciones.LABEL_IDESTADOCIVIL
										,SubClienteConstantesFunciones.LABEL_IDESTADOLEGAL
										,SubClienteConstantesFunciones.LABEL_IDTIPONIVELEDU
										,SubClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA
										,SubClienteConstantesFunciones.LABEL_IDCUENTACONTABLE
										,SubClienteConstantesFunciones.LABEL_NUMEROCARGA
										,SubClienteConstantesFunciones.LABEL_LIMITECREDITO
										,SubClienteConstantesFunciones.LABEL_DESCUENTO
										,SubClienteConstantesFunciones.LABEL_CODIGOCONTRATO
										,SubClienteConstantesFunciones.LABEL_VALORCONTRATO
										,SubClienteConstantesFunciones.LABEL_FECHAINICIO
										,SubClienteConstantesFunciones.LABEL_FECHAFIN
										,SubClienteConstantesFunciones.LABEL_PLAZO
										};
	   
	    public List<SubCliente> subclientes;
	  	 
	    //NO SE UTILIZA
	    public SubClienteModel(List<SubCliente> subclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.subclientes=subclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public SubClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.subclientes=new ArrayList<SubCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.subclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.subclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.subclientes.get(rowIndex).getId();
				case 2: return this.subclientes.get(rowIndex).getid_empresa();
				case 3: return this.subclientes.get(rowIndex).getid_cliente();
				case 4: return this.subclientes.get(rowIndex).getid_sucursal();
				case 5: return this.subclientes.get(rowIndex).getid_tipo_identificacion();
				case 6: return this.subclientes.get(rowIndex).getidentificacion();
				case 7: return this.subclientes.get(rowIndex).getruc();
				case 8: return this.subclientes.get(rowIndex).getnombre();
				case 9: return this.subclientes.get(rowIndex).getapellido();
				case 10: return this.subclientes.get(rowIndex).getnombre_completo();
				case 11: return this.subclientes.get(rowIndex).getdireccion();
				case 12: return this.subclientes.get(rowIndex).gettelefono();
				case 13: return this.subclientes.get(rowIndex).getnumero_celular();
				case 14: return this.subclientes.get(rowIndex).getmail();
				case 15: return this.subclientes.get(rowIndex).getfecha_nacimiento();
				case 16: return this.subclientes.get(rowIndex).getfechao();
				case 17: return this.subclientes.get(rowIndex).getobservacion();
				case 18: return this.subclientes.get(rowIndex).getid_pais();
				case 19: return this.subclientes.get(rowIndex).getid_ciudad();
				case 20: return this.subclientes.get(rowIndex).getid_zona();
				case 21: return this.subclientes.get(rowIndex).getid_pais_nacionalidad();
				case 22: return this.subclientes.get(rowIndex).getid_tipo_genero();
				case 23: return this.subclientes.get(rowIndex).getid_estado_civil();
				case 24: return this.subclientes.get(rowIndex).getid_estado_legal();
				case 25: return this.subclientes.get(rowIndex).getid_tipo_nivel_edu();
				case 26: return this.subclientes.get(rowIndex).getpath_imagen_firma();
				case 27: return this.subclientes.get(rowIndex).getid_cuenta_contable();
				case 28: return this.subclientes.get(rowIndex).getnumero_carga();
				case 29: return this.subclientes.get(rowIndex).getlimite_credito();
				case 30: return this.subclientes.get(rowIndex).getdescuento();
				case 31: return this.subclientes.get(rowIndex).getcodigo_contrato();
				case 32: return this.subclientes.get(rowIndex).getvalor_contrato();
				case 33: return this.subclientes.get(rowIndex).getfecha_inicio();
				case 34: return this.subclientes.get(rowIndex).getfecha_fin();
				case 35: return this.subclientes.get(rowIndex).getplazo();	            
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
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return Date.class;
				case 16: return Date.class;
				case 17: return String.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return String.class;
				case 27: return Long.class;
				case 28: return Integer.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return String.class;
				case 32: return Double.class;
				case 33: return Date.class;
				case 34: return Date.class;
				case 35: return Integer.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	SubCliente subcliente = this.subclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=(SubClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {subcliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {subcliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {subcliente.setid_empresa((Long) value);subcliente.setempresa_descripcion(subclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {subcliente.setid_cliente((Long) value);subcliente.setcliente_descripcion(subclienteBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {subcliente.setid_sucursal((Long) value);subcliente.setsucursal_descripcion(subclienteBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {subcliente.setid_tipo_identificacion((Long) value);subcliente.settipoidentificacion_descripcion(subclienteBeanSwingJInternalFrame.getActualTipoIdentificacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {subcliente.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {subcliente.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {subcliente.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {subcliente.setapellido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {subcliente.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {subcliente.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {subcliente.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {subcliente.setnumero_celular((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {subcliente.setmail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {subcliente.setfecha_nacimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {subcliente.setfechao((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {subcliente.setobservacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {subcliente.setid_pais((Long) value);subcliente.setpais_descripcion(subclienteBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {subcliente.setid_ciudad((Long) value);subcliente.setciudad_descripcion(subclienteBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {subcliente.setid_zona((Long) value);subcliente.setzona_descripcion(subclienteBeanSwingJInternalFrame.getActualZonaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {subcliente.setid_pais_nacionalidad((Long) value);subcliente.setpaisnacionalidad_descripcion(subclienteBeanSwingJInternalFrame.getActualPaisNacionalidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {subcliente.setid_tipo_genero((Long) value);subcliente.settipogenero_descripcion(subclienteBeanSwingJInternalFrame.getActualTipoGeneroForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {subcliente.setid_estado_civil((Long) value);subcliente.setestadocivil_descripcion(subclienteBeanSwingJInternalFrame.getActualEstadoCivilForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {subcliente.setid_estado_legal((Long) value);subcliente.setestadolegal_descripcion(subclienteBeanSwingJInternalFrame.getActualEstadoLegalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {subcliente.setid_tipo_nivel_edu((Long) value);subcliente.settiponiveledu_descripcion(subclienteBeanSwingJInternalFrame.getActualTipoNivelEduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {subcliente.setpath_imagen_firma((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {subcliente.setid_cuenta_contable((Long) value);subcliente.setcuentacontable_descripcion(subclienteBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {subcliente.setnumero_carga((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {subcliente.setlimite_credito((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {subcliente.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {subcliente.setcodigo_contrato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {subcliente.setvalor_contrato((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {subcliente.setfecha_inicio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {subcliente.setfecha_fin((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {subcliente.setplazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public SubClienteModel(JInternalFrameBase jInternalFrameBase) {
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
		private SubClienteDetalleFormJInternalFrame subclienteJInternalFrame=null;
		
		public SubClienteModel(SubClienteDetalleFormJInternalFrame subclienteJInternalFrame) {
			this.subclienteJInternalFrame=subclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente();
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente())) {
				componentTab=this.subclienteJInternalFrame.getjButtonEliminarToolBarSubCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.getjButtonEliminarToolBarSubCliente())) {
				componentTab=this.subclienteJInternalFrame.getjButtonCancelarToolBarSubCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.getjButtonCancelarToolBarSubCliente())) {
				componentTab=this.subclienteJInternalFrame.jComboBoxid_empresaSubCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldplazoSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jComboBoxTiposAccionesFormularioSubCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxTiposAccionesFormularioSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jButtonEliminarSubCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jButtonEliminarSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jButtonActualizarSubCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jButtonActualizarSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jButtonCancelarSubCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_empresaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_clienteSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_clienteSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_sucursalSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_sucursalSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_identificacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_identificacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldidentificacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldidentificacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldrucSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldrucSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreanombreSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreanombreSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreaapellidoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreaapellidoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreadireccionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreadireccionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreatelefonoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreatelefonoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreanumero_celularSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreanumero_celularSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreamailSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreamailSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_nacimientoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_nacimientoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfechaoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfechaoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreaobservacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreaobservacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_paisSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_paisSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_ciudadSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_ciudadSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_zonaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_zonaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_pais_nacionalidadSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_pais_nacionalidadSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_generoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_generoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_estado_civilSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_estado_civilSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_estado_legalSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_estado_legalSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_nivel_eduSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_nivel_eduSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreapath_imagen_firmaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreapath_imagen_firmaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_cuenta_contableSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_cuenta_contableSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldnumero_cargaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldnumero_cargaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldlimite_creditoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldlimite_creditoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFielddescuentoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFielddescuentoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldcodigo_contratoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldcodigo_contratoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldvalor_contratoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldvalor_contratoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_inicioSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_inicioSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_finSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_finSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldplazoSubCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente();
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.getjButtonEliminarToolBarSubCliente())) {
				componentTab=this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.getjButtonCancelarToolBarSubCliente())) {
				componentTab=this.subclienteJInternalFrame.getjButtonEliminarToolBarSubCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_empresaSubCliente)) {
				
				componentTab=this.subclienteJInternalFrame.getjButtonCancelarToolBarSubCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxTiposAccionesFormularioSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jTextFieldplazoSubCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jButtonEliminarSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jComboBoxTiposAccionesFormularioSubCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jButtonActualizarSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jButtonEliminarSubCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.subclienteJInternalFrame.jButtonCancelarSubCliente)) {
				componentTab=this.subclienteJInternalFrame.jButtonActualizarSubCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_clienteSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_empresaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_sucursalSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_clienteSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_identificacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_sucursalSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldidentificacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_identificacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldrucSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldidentificacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreanombreSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldrucSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreaapellidoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreanombreSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreadireccionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreaapellidoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreatelefonoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreadireccionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreanumero_celularSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreatelefonoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreamailSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreanumero_celularSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_nacimientoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreamailSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfechaoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_nacimientoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreaobservacionSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfechaoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_paisSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreaobservacionSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_ciudadSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_paisSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_zonaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_ciudadSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_pais_nacionalidadSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_zonaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_generoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_pais_nacionalidadSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_estado_civilSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_generoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_estado_legalSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_estado_civilSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_tipo_nivel_eduSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_estado_legalSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextAreapath_imagen_firmaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_tipo_nivel_eduSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jComboBoxid_cuenta_contableSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextAreapath_imagen_firmaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldnumero_cargaSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jComboBoxid_cuenta_contableSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldlimite_creditoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldnumero_cargaSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFielddescuentoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldlimite_creditoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldcodigo_contratoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFielddescuentoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldvalor_contratoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldcodigo_contratoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_inicioSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jTextFieldvalor_contratoSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jDateChooserfecha_finSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_inicioSubCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.subclienteJInternalFrame.jTextFieldplazoSubCliente)) {
			componentTab=this.subclienteJInternalFrame.jDateChooserfecha_finSubCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.subclienteJInternalFrame.getjButtonActualizarToolBarSubCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.subclienteJInternalFrame.getjButtonCancelarToolBarSubCliente();
			
			
			return componentTab;		
		}
		
		public SubClienteDetalleFormJInternalFrame getsubclienteJInternalFrame() {
			return this.subclienteJInternalFrame;
		}
		
		public void setsubclienteJInternalFrame(SubClienteDetalleFormJInternalFrame subclienteJInternalFrame) {
			this.subclienteJInternalFrame=subclienteJInternalFrame;
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

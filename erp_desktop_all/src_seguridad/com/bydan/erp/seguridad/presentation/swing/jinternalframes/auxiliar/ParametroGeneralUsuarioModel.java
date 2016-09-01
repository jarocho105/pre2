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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.seguridad.util.ParametroGeneralUsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.ParametroGeneralUsuarioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ParametroGeneralUsuarioParameterGeneral;

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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.ParametroGeneralUsuarioBeanSwingJInternalFrame;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.ParametroGeneralUsuarioJInternalFrame;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.ParametroGeneralUsuarioDetalleFormJInternalFrame;

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



import com.bydan.erp.contabilidad.business.entity.*;


import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ParametroGeneralUsuarioModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_ID
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEMPRESA
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDSUCURSAL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEJERCICIO
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDPERIODO
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMONEDA
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_FECHASISTEMA
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDANIO
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMES
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_DIA
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOVISUAL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDO
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOBORDE
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOCONTROL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFUENTE
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLNORMAL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLRELACION
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLMANUAL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLTODORELACION
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONGUARDARRELACIONES
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMENSAJECONFIRMACION
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONBOTONESTOOLBAR
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPOGENERAL
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPORELACIONES
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOEXPORTAR
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPODELIMITER
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCABECERA
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCAMPOVERSION
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_PATHEXPORTAR
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARVENTANAS
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARPORUSUARIO
										,ParametroGeneralUsuarioConstantesFunciones.LABEL_CONCARGARPORPARTE
										};
	   
	    public List<ParametroGeneralUsuario> parametrogeneralusuarios;
	  	 
	    //NO SE UTILIZA
	    public ParametroGeneralUsuarioModel(List<ParametroGeneralUsuario> parametrogeneralusuarios,JInternalFrameBase jInternalFrameBase) {
	    	this.parametrogeneralusuarios=parametrogeneralusuarios;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ParametroGeneralUsuarioModel(JInternalFrameBase jInternalFrameBase) {
	    	this.parametrogeneralusuarios=new ArrayList<ParametroGeneralUsuario>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.parametrogeneralusuarios.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.parametrogeneralusuarios.get(rowIndex).getIsSelected();
	            
				case 1: return this.parametrogeneralusuarios.get(rowIndex).getId();
				case 2: return this.parametrogeneralusuarios.get(rowIndex).getid_empresa();
				case 3: return this.parametrogeneralusuarios.get(rowIndex).getid_sucursal();
				case 4: return this.parametrogeneralusuarios.get(rowIndex).getid_ejercicio();
				case 5: return this.parametrogeneralusuarios.get(rowIndex).getid_periodo();
				case 6: return this.parametrogeneralusuarios.get(rowIndex).getid_moneda();
				case 7: return this.parametrogeneralusuarios.get(rowIndex).getfecha_sistema();
				case 8: return this.parametrogeneralusuarios.get(rowIndex).getid_anio();
				case 9: return this.parametrogeneralusuarios.get(rowIndex).getid_mes();
				case 10: return this.parametrogeneralusuarios.get(rowIndex).getdia();
				case 11: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_visual();
				case 12: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_fondo();
				case 13: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_fondo_borde();
				case 14: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_fondo_control();
				case 15: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_fuente();
				case 16: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_tamanio_control_normal();
				case 17: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_tamanio_control_relacion();
				case 18: return this.parametrogeneralusuarios.get(rowIndex).getcon_tamanio_control_manual();
				case 19: return this.parametrogeneralusuarios.get(rowIndex).getcon_tamanio_control_todo_relacion();
				case 20: return this.parametrogeneralusuarios.get(rowIndex).getcon_guardar_relaciones();
				case 21: return this.parametrogeneralusuarios.get(rowIndex).getcon_mensaje_confirmacion();
				case 22: return this.parametrogeneralusuarios.get(rowIndex).getcon_botones_tool_bar();
				case 23: return this.parametrogeneralusuarios.get(rowIndex).getcon_mostrar_acciones_campo_general();
				case 24: return this.parametrogeneralusuarios.get(rowIndex).getcon_mostrar_acciones_campo_relaciones();
				case 25: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_exportar();
				case 26: return this.parametrogeneralusuarios.get(rowIndex).getid_tipo_delimiter();
				case 27: return this.parametrogeneralusuarios.get(rowIndex).getcon_exportar_cabecera();
				case 28: return this.parametrogeneralusuarios.get(rowIndex).getcon_exportar_campo_version();
				case 29: return this.parametrogeneralusuarios.get(rowIndex).getpath_exportar();
				case 30: return this.parametrogeneralusuarios.get(rowIndex).getcon_precargar_ventanas();
				case 31: return this.parametrogeneralusuarios.get(rowIndex).getcon_precargar_por_usuario();
				case 32: return this.parametrogeneralusuarios.get(rowIndex).getcon_cargar_por_parte();	            
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
				case 7: return Date.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Integer.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;
				case 23: return Boolean.class;
				case 24: return Boolean.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Boolean.class;
				case 28: return Boolean.class;
				case 29: return String.class;
				case 30: return Boolean.class;
				case 31: return Boolean.class;
				case 32: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ParametroGeneralUsuario parametrogeneralusuario = this.parametrogeneralusuarios.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ParametroGeneralUsuarioBeanSwingJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame=(ParametroGeneralUsuarioBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {parametrogeneralusuario.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {parametrogeneralusuario.setId((Long) value);parametrogeneralusuario.setusuario_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {parametrogeneralusuario.setid_empresa((Long) value);parametrogeneralusuario.setempresa_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {parametrogeneralusuario.setid_sucursal((Long) value);parametrogeneralusuario.setsucursal_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {parametrogeneralusuario.setid_ejercicio((Long) value);parametrogeneralusuario.setejercicio_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {parametrogeneralusuario.setid_periodo((Long) value);parametrogeneralusuario.setperiodo_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {parametrogeneralusuario.setid_moneda((Long) value);parametrogeneralusuario.setmoneda_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {parametrogeneralusuario.setfecha_sistema((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {parametrogeneralusuario.setid_anio((Long) value);parametrogeneralusuario.setanio_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {parametrogeneralusuario.setid_mes((Long) value);parametrogeneralusuario.setmes_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {parametrogeneralusuario.setdia((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {parametrogeneralusuario.setid_tipo_visual((Long) value);parametrogeneralusuario.settipovisual_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoVisualForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {parametrogeneralusuario.setid_tipo_fondo((Long) value);parametrogeneralusuario.settipofondo_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoFondoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {parametrogeneralusuario.setid_tipo_fondo_borde((Long) value);parametrogeneralusuario.settipofondoborde_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoFondoBordeForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {parametrogeneralusuario.setid_tipo_fondo_control((Long) value);parametrogeneralusuario.settipofondocontrol_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoFondoControlForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {parametrogeneralusuario.setid_tipo_fuente((Long) value);parametrogeneralusuario.settipofuente_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoFuenteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {parametrogeneralusuario.setid_tipo_tamanio_control_normal((Long) value);parametrogeneralusuario.settipotamaniocontrolnormal_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoTamanioControlNormalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {parametrogeneralusuario.setid_tipo_tamanio_control_relacion((Long) value);parametrogeneralusuario.settipotamaniocontrolrelacion_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoTamanioControlRelacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {parametrogeneralusuario.setcon_tamanio_control_manual((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {parametrogeneralusuario.setcon_tamanio_control_todo_relacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {parametrogeneralusuario.setcon_guardar_relaciones((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {parametrogeneralusuario.setcon_mensaje_confirmacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {parametrogeneralusuario.setcon_botones_tool_bar((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {parametrogeneralusuario.setcon_mostrar_acciones_campo_general((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {parametrogeneralusuario.setcon_mostrar_acciones_campo_relaciones((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {parametrogeneralusuario.setid_tipo_exportar((Long) value);parametrogeneralusuario.settipoexportar_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoExportarForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {parametrogeneralusuario.setid_tipo_delimiter((Long) value);parametrogeneralusuario.settipodelimiter_descripcion(parametrogeneralusuarioBeanSwingJInternalFrame.getActualTipoDelimiterForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {parametrogeneralusuario.setcon_exportar_cabecera((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {parametrogeneralusuario.setcon_exportar_campo_version((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {parametrogeneralusuario.setpath_exportar((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {parametrogeneralusuario.setcon_precargar_ventanas((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {parametrogeneralusuario.setcon_precargar_por_usuario((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {parametrogeneralusuario.setcon_cargar_por_parte((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ParametroGeneralUsuarioDetalleFormJInternalFrame parametrogeneralusuarioJInternalFrame=null;
		
		public ParametroGeneralUsuarioModel(ParametroGeneralUsuarioDetalleFormJInternalFrame parametrogeneralusuarioJInternalFrame) {
			this.parametrogeneralusuarioJInternalFrame=parametrogeneralusuarioJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario();
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario())) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonEliminarToolBarParametroGeneralUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.getjButtonEliminarToolBarParametroGeneralUsuario())) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonCancelarToolBarParametroGeneralUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.getjButtonCancelarToolBarParametroGeneralUsuario())) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_empresaParametroGeneralUsuario;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_cargar_por_parteParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxTiposAccionesFormularioParametroGeneralUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxTiposAccionesFormularioParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jButtonEliminarParametroGeneralUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jButtonEliminarParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jButtonActualizarParametroGeneralUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jButtonActualizarParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jButtonCancelarParametroGeneralUsuario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_empresaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_sucursalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_sucursalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_ejercicioParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_ejercicioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_periodoParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_periodoParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_monedaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_monedaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jDateChooserfecha_sistemaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jDateChooserfecha_sistemaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_anioParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_anioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_mesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_mesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jTextFielddiaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jTextFielddiaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_visualParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_visualParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondoParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondoParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_controlParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_controlParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fuenteParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fuenteParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_guardar_relacionesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_guardar_relacionesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_botones_tool_barParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_botones_tool_barParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_exportarParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_exportarParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_delimiterParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_delimiterParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jTextAreapath_exportarParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jTextAreapath_exportarParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_ventanasParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_ventanasParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_cargar_por_parteParametroGeneralUsuario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario();
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.getjButtonEliminarToolBarParametroGeneralUsuario())) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.getjButtonCancelarToolBarParametroGeneralUsuario())) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonEliminarToolBarParametroGeneralUsuario();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_empresaParametroGeneralUsuario)) {
				
				componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonCancelarToolBarParametroGeneralUsuario();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxTiposAccionesFormularioParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_cargar_por_parteParametroGeneralUsuario;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jButtonEliminarParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxTiposAccionesFormularioParametroGeneralUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jButtonActualizarParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jButtonEliminarParametroGeneralUsuario;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jButtonCancelarParametroGeneralUsuario)) {
				componentTab=this.parametrogeneralusuarioJInternalFrame.jButtonActualizarParametroGeneralUsuario;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_sucursalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_empresaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_ejercicioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_sucursalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_periodoParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_ejercicioParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_monedaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_periodoParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jDateChooserfecha_sistemaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_monedaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_anioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jDateChooserfecha_sistemaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_mesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_anioParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jTextFielddiaParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_mesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_visualParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jTextFielddiaParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondoParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_visualParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondoParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_controlParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fuenteParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fondo_controlParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_fuenteParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_guardar_relacionesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_guardar_relacionesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_botones_tool_barParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_botones_tool_barParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_exportarParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_delimiterParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_exportarParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jComboBoxid_tipo_delimiterParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jTextAreapath_exportarParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_ventanasParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jTextAreapath_exportarParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_ventanasParametroGeneralUsuario;
			return componentTab;
		}

		if(component!=null && component.equals(this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_cargar_por_parteParametroGeneralUsuario)) {
			componentTab=this.parametrogeneralusuarioJInternalFrame.jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonActualizarToolBarParametroGeneralUsuario();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.parametrogeneralusuarioJInternalFrame.getjButtonCancelarToolBarParametroGeneralUsuario();
			
			
			return componentTab;		
		}
		
		public ParametroGeneralUsuarioDetalleFormJInternalFrame getparametrogeneralusuarioJInternalFrame() {
			return this.parametrogeneralusuarioJInternalFrame;
		}
		
		public void setparametrogeneralusuarioJInternalFrame(ParametroGeneralUsuarioDetalleFormJInternalFrame parametrogeneralusuarioJInternalFrame) {
			this.parametrogeneralusuarioJInternalFrame=parametrogeneralusuarioJInternalFrame;
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

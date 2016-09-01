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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.HobbyClienteConstantesFunciones;
import com.bydan.erp.cartera.util.HobbyClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.HobbyClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.HobbyClienteBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
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
import java.util.Collections;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
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

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HobbyClienteBeanSwingJInternalFrame extends HobbyClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HobbyClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HobbyCliente> hobbyclienteValidator = new ClassValidator<HobbyCliente>(HobbyCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HobbyCliente hobbycliente;	
	public HobbyCliente hobbyclienteAux;
	public HobbyCliente hobbyclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HobbyCliente hobbyclienteTotales;
	public Long idHobbyClienteActual;
	public Long iIdNuevoHobbyCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboHobby="";

	public List<Hobby> hobbysForeignKey;

	public List<Hobby> gethobbysForeignKey() {
		return hobbysForeignKey;
	}

	public void sethobbysForeignKey(List<Hobby> hobbysForeignKey) {
		this.hobbysForeignKey = hobbysForeignKey;
	}

	//OBJETO FK ACTUAL
	public Hobby hobbyForeignKey;

	public Hobby gethobbyForeignKey() {
		return hobbyForeignKey;
	}

	public void sethobbyForeignKey(Hobby hobbyForeignKey) {
		this.hobbyForeignKey = hobbyForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoHobbyCliente;
	public Boolean isPermisoNuevoHobbyCliente;
	public Boolean isPermisoActualizarHobbyCliente;
	public Boolean isPermisoActualizarOriginalHobbyCliente;
	public Boolean isPermisoEliminarHobbyCliente;
	public Boolean isPermisoGuardarCambiosHobbyCliente;
	public Boolean isPermisoConsultaHobbyCliente;
	public Boolean isPermisoBusquedaHobbyCliente;
	public Boolean isPermisoReporteHobbyCliente;
	public Boolean isPermisoPaginacionMedioHobbyCliente;
	public Boolean isPermisoPaginacionAltoHobbyCliente;
	public Boolean isPermisoPaginacionTodoHobbyCliente;
	public Boolean isPermisoCopiarHobbyCliente;
	public Boolean isPermisoVerFormHobbyCliente;
	public Boolean isPermisoDuplicarHobbyCliente;
	public Boolean isPermisoOrdenHobbyCliente;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public HobbyClienteParameterReturnGeneral hobbyclienteReturnGeneral;
	public HobbyClienteParameterReturnGeneral hobbyclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHobbyCliente=false;
	public Boolean esParaAccionDesdeFormularioHobbyCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HobbyClienteSessionBeanAdditional hobbyclienteSessionBeanAdditional=null;
	
	public HobbyClienteSessionBeanAdditional getHobbyClienteSessionBeanAdditional() {
		return this.hobbyclienteSessionBeanAdditional;
	}
	
	public void setHobbyClienteSessionBeanAdditional(HobbyClienteSessionBeanAdditional hobbyclienteSessionBeanAdditional) {
		try {
			this.hobbyclienteSessionBeanAdditional=hobbyclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HobbyClienteBeanSwingJInternalFrameAdditional hobbyclienteBeanSwingJInternalFrameAdditional=null;
	//public class HobbyClienteBeanSwingJInternalFrame
	
	public HobbyClienteBeanSwingJInternalFrameAdditional getHobbyClienteBeanSwingJInternalFrameAdditional() {
		return this.hobbyclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setHobbyClienteBeanSwingJInternalFrameAdditional(HobbyClienteBeanSwingJInternalFrameAdditional hobbyclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.hobbyclienteBeanSwingJInternalFrameAdditional=hobbyclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HobbyClienteLogic hobbyclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HobbyCliente hobbyclienteBean;
	public HobbyClienteConstantesFunciones hobbyclienteConstantesFunciones;
	//public HobbyClienteParameterReturnGeneral hobbyclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public HobbyLogic hobbyLogic;
	
	//PARAMETROS
	
	
	//public List<HobbyCliente> hobbyclientes;	
	//public List<HobbyCliente> hobbyclientesEliminados;
	//public List<HobbyCliente> hobbyclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHobbyCliente=false;
	public Boolean isVisibilidadCeldaDuplicarHobbyCliente=true;
	public Boolean isVisibilidadCeldaCopiarHobbyCliente=true;
	public Boolean isVisibilidadCeldaVerFormHobbyCliente=true;
	public Boolean isVisibilidadCeldaOrdenHobbyCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
	public Boolean isVisibilidadCeldaModificarHobbyCliente=false;
	public Boolean isVisibilidadCeldaActualizarHobbyCliente=false;
	public Boolean isVisibilidadCeldaEliminarHobbyCliente=false;
	public Boolean isVisibilidadCeldaCancelarHobbyCliente=false;
	public Boolean isVisibilidadCeldaGuardarHobbyCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHobbyCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdHobby=false;
	
	public Long getiIdNuevoHobbyCliente() {
		return this.iIdNuevoHobbyCliente;
	}

	public void setiIdNuevoHobbyCliente(Long iIdNuevoHobbyCliente) {
		this.iIdNuevoHobbyCliente = iIdNuevoHobbyCliente;
	}
	
	public Long getidHobbyClienteActual() {
		return this.idHobbyClienteActual;
	}

	public void setidHobbyClienteActual(Long idHobbyClienteActual) {
		this.idHobbyClienteActual = idHobbyClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HobbyCliente gethobbycliente() {
		return this.hobbycliente;
	}

	public void sethobbycliente(HobbyCliente hobbycliente) {
		this.hobbycliente = hobbycliente;
	}
	
	public HobbyCliente gethobbyclienteAux() {
		return this.hobbyclienteAux;
	}

	public void sethobbyclienteAux(HobbyCliente hobbyclienteAux) {
		this.hobbyclienteAux = hobbyclienteAux;
	}				
	
	public HobbyCliente gethobbyclienteAnterior() {
		return this.hobbyclienteAnterior;
	}

	public void sethobbyclienteAnterior(HobbyCliente hobbyclienteAnterior) {
		this.hobbyclienteAnterior = hobbyclienteAnterior;
	}	
	
	public HobbyCliente gethobbyclienteTotales() {
		return this.hobbyclienteTotales;
	}

	public void sethobbyclienteTotales(HobbyCliente hobbyclienteTotales) {
		this.hobbyclienteTotales = hobbyclienteTotales;
	}	
	
	public HobbyCliente gethobbyclienteBean() {
		return this.hobbyclienteBean;
	}

	public void sethobbyclienteBean(HobbyCliente hobbyclienteBean) {
		this.hobbyclienteBean = hobbyclienteBean;
	}	
	
	public HobbyClienteParameterReturnGeneral gethobbyclienteReturnGeneral() {
		return this.hobbyclienteReturnGeneral;
	}

	public void sethobbyclienteReturnGeneral(HobbyClienteParameterReturnGeneral hobbyclienteReturnGeneral) {
		this.hobbyclienteReturnGeneral = hobbyclienteReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_hobbyFK_IdHobby=-1L;

	public Long getid_hobbyFK_IdHobby() {
		return this.id_hobbyFK_IdHobby;
	}

	public void setid_hobbyFK_IdHobby(Long id_hobbyFK_IdHobby) {
		this.id_hobbyFK_IdHobby = id_hobbyFK_IdHobby;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HobbyClienteLogic getHobbyClienteLogic()	{		
		return hobbyclienteLogic;
	}

	public void setHobbyClienteLogic(HobbyClienteLogic hobbyclienteLogic) {
		this.hobbyclienteLogic = hobbyclienteLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoHobbyCliente() {
		return isEsNuevoHobbyCliente;
	}

	public void setIsEsNuevoHobbyCliente(Boolean isEsNuevoHobbyCliente) {
		this.isEsNuevoHobbyCliente = isEsNuevoHobbyCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioHobbyCliente() {
		return esParaAccionDesdeFormularioHobbyCliente;
	}
	
	public void setEsParaAccionDesdeFormularioHobbyCliente(Boolean esParaAccionDesdeFormularioHobbyCliente) {
		this.esParaAccionDesdeFormularioHobbyCliente = esParaAccionDesdeFormularioHobbyCliente;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.hobbyclienteSessionBean==null) {
				this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(hobbyclienteSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.hobbyclienteSessionBean==null) {
				this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(hobbyclienteSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosHobbysForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.hobbysForeignKey=new ArrayList<Hobby>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			HobbyLogic hobbyLogic=new HobbyLogic();

			//hobbyLogic.getHobbyDataAccess().setIsForForeingKeyData(true);

			if(this.hobbyclienteSessionBean==null) {
				this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//hobbyLogic.getHobbyDataAccess().setIsForForeingKeyData(true);

					hobbyLogic.getTodosHobbysWithConnection(sFinalQuery,new Pagination());

					this.hobbysForeignKey=hobbyLogic.getHobbys();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaHobby(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.getEntityWithConnection(hobbyclienteSessionBean.getlidHobbyActual());
					this.hobbysForeignKey.add(hobbyLogic.getHobby());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.hobbycliente!=null) {
						this.hobbycliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHobbyCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHobbyClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaHobbyClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHobbyClienteGenerico!=null && jComboBoxid_empresaHobbyClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaHobbyClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.hobbycliente!=null) {
						this.hobbycliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteHobbyCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteHobbyCliente!=null) {
						jComboBoxid_clienteFK_IdClienteHobbyCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteHobbyCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteHobbyCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteHobbyCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteHobbyCliente.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteHobbyClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteHobbyClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteHobbyClienteGenerico!=null && jComboBoxid_clienteHobbyClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteHobbyClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualHobbyForeignKey(Long idHobbySeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(hobbyTemp!=null) {

					if(this.hobbycliente!=null) {
						this.hobbycliente.setHobby(hobbyTemp);
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setSelectedItem(hobbyTemp);
					}
				} else {
					//jComboBoxid_hobbyHobbyCliente.setSelectedItem(hobbyTemp);
					if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
						if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdHobby") || sFormularioTipoBusqueda.equals("Todos")){
					if(hobbyTemp!=null && jComboBoxid_hobbyFK_IdHobbyHobbyCliente!=null) {
						jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setSelectedItem(hobbyTemp);
					} else {
						if(jComboBoxid_hobbyFK_IdHobbyHobbyCliente!=null) {
							//jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setSelectedItem(hobbyTemp);
							if(jComboBoxid_hobbyFK_IdHobbyHobbyCliente.getItemCount()>0) {
								jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualHobbyForeignKeyDescripcion(Long idHobbySeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}


			sDescripcion=HobbyConstantesFunciones.getHobbyDescripcion(hobbyTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualHobbyForeignKeyGenerico(Long idHobbySeleccionado,JComboBox jComboBoxid_hobbyHobbyClienteGenerico)throws Exception
	{
		try
		{
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysForeignKey) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}

			if(hobbyTemp!=null) {
				jComboBoxid_hobbyHobbyClienteGenerico.setSelectedItem(hobbyTemp);
			} else {
				if(jComboBoxid_hobbyHobbyClienteGenerico!=null && jComboBoxid_hobbyHobbyClienteGenerico.getItemCount()>0) {
					jComboBoxid_hobbyHobbyClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HobbyCliente hobbycliente,JComboBox jComboBoxid_empresaHobbyClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHobbyClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHobbyClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				hobbycliente.setid_empresa(empresaAux.getId());
				hobbycliente.setempresa_descripcion(HobbyClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				hobbycliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(HobbyCliente hobbycliente,JComboBox jComboBoxid_clienteHobbyClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteHobbyClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteHobbyClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				hobbycliente.setid_cliente(clienteAux.getId());
				hobbycliente.setcliente_descripcion(HobbyClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				hobbycliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarHobbyForeignKey(HobbyCliente hobbycliente,JComboBox jComboBoxid_hobbyHobbyClienteGenerico)throws Exception
	{
		try
		{
			Hobby  hobbyAux=new Hobby();

			if(jComboBoxid_hobbyHobbyClienteGenerico==null) {
				hobbyAux=(Hobby)this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.getSelectedItem();
			} else {
				hobbyAux=(Hobby)jComboBoxid_hobbyHobbyClienteGenerico.getSelectedItem();
			}

			if(hobbyAux!=null && hobbyAux.getId()!=null) {
				hobbycliente.setid_hobby(hobbyAux.getId());
				hobbycliente.sethobby_descripcion(HobbyClienteConstantesFunciones.getHobbyDescripcion(hobbyAux));
				hobbycliente.setHobby(hobbyAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
					}

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
					}

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteHobbyCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteHobbyCliente.addItem(cliente);
							}
						}

						if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameHobbysForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingHobby=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.removeAllItems();

							for(Hobby hobby:this.hobbysForeignKey) {
								this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.addItem(hobby);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHobbyCliente!=null) { 
					}

					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdHobby") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.removeAllItems();

							for(Hobby hobby:this.hobbysForeignKey) {
								this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.addItem(hobby);
							}
						}

						if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteHobbyCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteHobbyCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameHobbyForeignKey(Hobby hobby,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setSelectedItem(hobby);
						}
					} else {
						if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setSelectedItem(hobby);
						} else {
							this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesHobbyCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HobbyClienteConstantesFunciones.refrescarForeignKeysDescripcionesHobbyCliente(this.hobbyclienteLogic.getHobbyClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HobbyClienteConstantesFunciones.refrescarForeignKeysDescripcionesHobbyCliente(this.hobbyclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Hobby.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//hobbyclienteLogic.setHobbyClientes(this.hobbyclientes);
			hobbyclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public HobbyClienteParameterReturnGeneral getHobbyClienteParameterGeneral() {
		return this.hobbyclienteParameterGeneral;
	}
	
	public void setHobbyClienteParameterGeneral(HobbyClienteParameterReturnGeneral hobbyclienteParameterGeneral) {
		this.hobbyclienteParameterGeneral = hobbyclienteParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoHobbyCliente() {
		return isPermisoTodoHobbyCliente;
	}

	public void setIsPermisoTodoHobbyCliente(Boolean isPermisoTodoHobbyCliente) {
		this.isPermisoTodoHobbyCliente = isPermisoTodoHobbyCliente;
	}

	public Boolean getIsPermisoNuevoHobbyCliente() {
		return isPermisoNuevoHobbyCliente;
	}

	public void setIsPermisoNuevoHobbyCliente(Boolean isPermisoNuevoHobbyCliente) {
		this.isPermisoNuevoHobbyCliente = isPermisoNuevoHobbyCliente;
	}

	public Boolean getIsPermisoActualizarHobbyCliente() {
		return isPermisoActualizarHobbyCliente;
	}

	public void setIsPermisoActualizarHobbyCliente(Boolean isPermisoActualizarHobbyCliente) {
		this.isPermisoActualizarHobbyCliente = isPermisoActualizarHobbyCliente;
	}

	public Boolean getIsPermisoEliminarHobbyCliente() {
		return isPermisoEliminarHobbyCliente;
	}

	public void setIsPermisoEliminarHobbyCliente(Boolean isPermisoEliminarHobbyCliente) {
		this.isPermisoEliminarHobbyCliente = isPermisoEliminarHobbyCliente;
	}

	public Boolean getIsPermisoGuardarCambiosHobbyCliente() {
		return isPermisoGuardarCambiosHobbyCliente;
	}

	public void setIsPermisoGuardarCambiosHobbyCliente(Boolean isPermisoGuardarCambiosHobbyCliente) {
		this.isPermisoGuardarCambiosHobbyCliente = isPermisoGuardarCambiosHobbyCliente;
	}
	
	public Boolean getIsPermisoConsultaHobbyCliente() {
		return isPermisoConsultaHobbyCliente;
	}

	public void setIsPermisoConsultaHobbyCliente(Boolean isPermisoConsultaHobbyCliente) {
		this.isPermisoConsultaHobbyCliente = isPermisoConsultaHobbyCliente;
	}

	public Boolean getIsPermisoBusquedaHobbyCliente() {
		return isPermisoBusquedaHobbyCliente;
	}

	public void setIsPermisoBusquedaHobbyCliente(Boolean isPermisoBusquedaHobbyCliente) {
		this.isPermisoBusquedaHobbyCliente = isPermisoBusquedaHobbyCliente;
	}

	public Boolean getIsPermisoReporteHobbyCliente() {
		return isPermisoReporteHobbyCliente;
	}

	public void setIsPermisoReporteHobbyCliente(Boolean isPermisoReporteHobbyCliente) {
		this.isPermisoReporteHobbyCliente = isPermisoReporteHobbyCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioHobbyCliente() {
		return isPermisoPaginacionMedioHobbyCliente;
	}

	public void setIsPermisoPaginacionMedioHobbyCliente(Boolean isPermisoPaginacionMedioHobbyCliente) {
		this.isPermisoPaginacionMedioHobbyCliente = isPermisoPaginacionMedioHobbyCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoHobbyCliente() {
		return isPermisoPaginacionTodoHobbyCliente;
	}

	public void setIsPermisoPaginacionTodoHobbyCliente(Boolean isPermisoPaginacionTodoHobbyCliente) {
		this.isPermisoPaginacionTodoHobbyCliente = isPermisoPaginacionTodoHobbyCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoHobbyCliente() {
		return isPermisoPaginacionAltoHobbyCliente;
	}

	public void setIsPermisoPaginacionAltoHobbyCliente(Boolean isPermisoPaginacionAltoHobbyCliente) {
		this.isPermisoPaginacionAltoHobbyCliente = isPermisoPaginacionAltoHobbyCliente;
	}
	
	public Boolean getIsPermisoCopiarHobbyCliente() {
		return isPermisoCopiarHobbyCliente;
	}

	public void setIsPermisoCopiarHobbyCliente(Boolean isPermisoCopiarHobbyCliente) {
		this.isPermisoCopiarHobbyCliente = isPermisoCopiarHobbyCliente;
	}
	
	public Boolean getIsPermisoVerFormHobbyCliente() {
		return isPermisoVerFormHobbyCliente;
	}

	public void setIsPermisoVerFormHobbyCliente(Boolean isPermisoVerFormHobbyCliente) {
		this.isPermisoVerFormHobbyCliente = isPermisoVerFormHobbyCliente;
	}
	
	public Boolean getIsPermisoDuplicarHobbyCliente() {
		return isPermisoDuplicarHobbyCliente;
	}

	public void setIsPermisoDuplicarHobbyCliente(Boolean isPermisoDuplicarHobbyCliente) {
		this.isPermisoDuplicarHobbyCliente = isPermisoDuplicarHobbyCliente;
	}
	
	public Boolean getIsPermisoOrdenHobbyCliente() {
		return isPermisoOrdenHobbyCliente;
	}

	public void setIsPermisoOrdenHobbyCliente(Boolean isPermisoOrdenHobbyCliente) {
		this.isPermisoOrdenHobbyCliente = isPermisoOrdenHobbyCliente;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoHobbyCliente() {
		return isVisibilidadCeldaNuevoHobbyCliente;
	}

	public void setIsVisibilidadCeldaNuevoHobbyCliente(Boolean isVisibilidadCeldaNuevoHobbyCliente) {
		this.isVisibilidadCeldaNuevoHobbyCliente = isVisibilidadCeldaNuevoHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHobbyCliente() {
		return isVisibilidadCeldaDuplicarHobbyCliente;
	}

	public void setIsVisibilidadCeldaDuplicarHobbyCliente(Boolean isVisibilidadCeldaDuplicarHobbyCliente) {
		this.isVisibilidadCeldaDuplicarHobbyCliente = isVisibilidadCeldaDuplicarHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHobbyCliente() {
		return isVisibilidadCeldaCopiarHobbyCliente;
	}

	public void setIsVisibilidadCeldaCopiarHobbyCliente(Boolean isVisibilidadCeldaCopiarHobbyCliente) {
		this.isVisibilidadCeldaCopiarHobbyCliente = isVisibilidadCeldaCopiarHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHobbyCliente() {
		return isVisibilidadCeldaVerFormHobbyCliente;
	}

	public void setIsVisibilidadCeldaVerFormHobbyCliente(Boolean isVisibilidadCeldaVerFormHobbyCliente) {
		this.isVisibilidadCeldaVerFormHobbyCliente = isVisibilidadCeldaVerFormHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHobbyCliente() {
		return isVisibilidadCeldaOrdenHobbyCliente;
	}

	public void setIsVisibilidadCeldaOrdenHobbyCliente(Boolean isVisibilidadCeldaOrdenHobbyCliente) {
		this.isVisibilidadCeldaOrdenHobbyCliente = isVisibilidadCeldaOrdenHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHobbyCliente() {
		return isVisibilidadCeldaNuevoRelacionesHobbyCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHobbyCliente(Boolean isVisibilidadCeldaNuevoRelacionesHobbyCliente) {
		this.isVisibilidadCeldaNuevoRelacionesHobbyCliente = isVisibilidadCeldaNuevoRelacionesHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHobbyCliente() {
		return isVisibilidadCeldaModificarHobbyCliente;
	}

	public void setIsVisibilidadCeldaModificarHobbyCliente(Boolean isVisibilidadCeldaModificarHobbyCliente) {
		this.isVisibilidadCeldaModificarHobbyCliente = isVisibilidadCeldaModificarHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHobbyCliente() {
		return isVisibilidadCeldaActualizarHobbyCliente;
	}

	public void setIsVisibilidadCeldaActualizarHobbyCliente(Boolean isVisibilidadCeldaActualizarHobbyCliente) {
		this.isVisibilidadCeldaActualizarHobbyCliente = isVisibilidadCeldaActualizarHobbyCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarHobbyCliente() {
		return isVisibilidadCeldaEliminarHobbyCliente;
	}

	public void setIsVisibilidadCeldaEliminarHobbyCliente(Boolean isVisibilidadCeldaEliminarHobbyCliente) {
		this.isVisibilidadCeldaEliminarHobbyCliente = isVisibilidadCeldaEliminarHobbyCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarHobbyCliente() {
		return isVisibilidadCeldaCancelarHobbyCliente;
	}

	public void setIsVisibilidadCeldaCancelarHobbyCliente(Boolean isVisibilidadCeldaCancelarHobbyCliente) {
		this.isVisibilidadCeldaCancelarHobbyCliente = isVisibilidadCeldaCancelarHobbyCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarHobbyCliente() {
		return isVisibilidadCeldaGuardarHobbyCliente;
	}

	public void setIsVisibilidadCeldaGuardarHobbyCliente(Boolean isVisibilidadCeldaGuardarHobbyCliente) {
		this.isVisibilidadCeldaGuardarHobbyCliente = isVisibilidadCeldaGuardarHobbyCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHobbyCliente() {
		return isVisibilidadCeldaGuardarCambiosHobbyCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHobbyCliente(Boolean isVisibilidadCeldaGuardarCambiosHobbyCliente) {
		this.isVisibilidadCeldaGuardarCambiosHobbyCliente = isVisibilidadCeldaGuardarCambiosHobbyCliente;
	}
		
	public HobbyClienteSessionBean gethobbyclienteSessionBean() {
		return this.hobbyclienteSessionBean;
	}
	
	public void sethobbyclienteSessionBean(HobbyClienteSessionBean hobbyclienteSessionBean) {
		this.hobbyclienteSessionBean=hobbyclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdHobby() {
		return this.isVisibilidadFK_IdHobby;
	}

	public void setisVisibilidadFK_IdHobby(Boolean isVisibilidadFK_IdHobby) {
		this.isVisibilidadFK_IdHobby=isVisibilidadFK_IdHobby;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(HobbyCliente hobbycliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(hobbycliente,null);
				this.setActualParaGuardarClienteForeignKey(hobbycliente,null);
				this.setActualParaGuardarHobbyForeignKey(hobbycliente,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(HobbyCliente hobbycliente,HobbyCliente hobbyclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHobbyCliente(hobbycliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		hobbyclienteAux.setId(hobbycliente.getId());
		hobbyclienteAux.setVersionRow(hobbycliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHobbyCliente();
		
			int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = hobbyclienteValidator.getInvalidValues(this.hobbycliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			hobbyclienteLogic.setDatosCliente(datosCliente);
			hobbyclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				hobbyclienteAux=new  HobbyCliente();
				
				hobbyclienteAux.setIsNew(true);
				hobbyclienteAux.setIsChanged(true);
				
				hobbyclienteAux.setHobbyClienteOriginal(this.hobbycliente);
				
				hobbyclienteAux.setId(this.hobbycliente.getId());	
				hobbyclienteAux.setVersionRow(this.hobbycliente.getVersionRow());	
				hobbyclienteAux.setid_empresa(this.hobbycliente.getid_empresa());	
				hobbyclienteAux.setid_cliente(this.hobbycliente.getid_cliente());	
				hobbyclienteAux.setid_hobby(this.hobbycliente.getid_hobby());	
				hobbyclienteAux.setdescripcion(this.hobbycliente.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyclienteAux,hobbyclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.saveHobbyClientes();//WithConnection
						//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);
					
					this.refrescarForeignKeysDescripcionesHobbyCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyclienteLogic.saveHobbyClienteRelaciones(hobbyclienteAux);//WithConnection
								//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(hobbyclienteAux,hobbyclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				hobbyclienteAux=new  HobbyCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.hobbyclienteSessionBean.getEsGuardarRelacionado() && this.hobbycliente.getId()>=0)) {
						
					hobbyclienteAux.setIsNew(false);
				}
				
				hobbyclienteAux.setIsDeleted(false);
			
				hobbyclienteAux.setId(this.hobbycliente.getId());	
				hobbyclienteAux.setVersionRow(this.hobbycliente.getVersionRow());	
				hobbyclienteAux.setid_empresa(this.hobbycliente.getid_empresa());	
				hobbyclienteAux.setid_cliente(this.hobbycliente.getid_cliente());	
				hobbyclienteAux.setid_hobby(this.hobbycliente.getid_hobby());	
				hobbyclienteAux.setdescripcion(this.hobbycliente.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyclienteAux,hobbyclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.saveHobbyClientes();//WithConnection
						//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);
					
					this.refrescarForeignKeysDescripcionesHobbyCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyclienteLogic.saveHobbyClienteRelaciones(hobbyclienteAux);//WithConnection
								//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(hobbyclienteAux,hobbyclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.hobbycliente,hobbyclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				hobbyclienteAux=new  HobbyCliente();
				
				hobbyclienteAux.setIsNew(false);
				hobbyclienteAux.setIsChanged(false);
				
				hobbyclienteAux.setIsDeleted(true);
				
				hobbyclienteAux.setId(this.hobbycliente.getId());	
				hobbyclienteAux.setVersionRow(this.hobbycliente.getVersionRow());	
				hobbyclienteAux.setid_empresa(this.hobbycliente.getid_empresa());	
				hobbyclienteAux.setid_cliente(this.hobbycliente.getid_cliente());	
				hobbyclienteAux.setid_hobby(this.hobbycliente.getid_hobby());	
				hobbyclienteAux.setdescripcion(this.hobbycliente.getdescripcion());	
				
				if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.hobbyclienteAux.getId()>=0) {	
						this.hobbyclientesEliminados.add(hobbyclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyclienteAux,hobbyclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.saveHobbyClientes();//WithConnection
						//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyclienteLogic.saveHobbyClienteRelaciones(hobbyclienteAux);//WithConnection
								//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(hobbyclienteAux,hobbyclienteLogic.getHobbyClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(hobbyclienteAux,hobbyclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getHobbyClientes().addAll(this.hobbyclientesEliminados);
					
					hobbyclienteLogic.saveHobbyClientes();//WithConnection
					//hobbyclienteLogic.getSetVersionRowHobbyClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHobbyCliente();
				
				this.hobbyclientesEliminados= new ArrayList<HobbyCliente>();		
			}
			
			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Hobby Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.hobbycliente=hobbyclienteAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessHobbyCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(HobbyCliente hobbyclienteLocal) throws Exception {
		
		if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HobbyCliente hobbyclienteLocal) throws Exception {	
		if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				hobbyclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				hobbyclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(HobbyDetalleFormJInternalFrame.class)) {
				HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrameLocal=(HobbyBeanSwingJInternalFrame) ((HobbyDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				hobbyBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoHobby(hobbyBeanSwingJInternalFrameLocal.gethobby(),true);
				hobbyBeanSwingJInternalFrameLocal.actualizarLista(hobbyBeanSwingJInternalFrameLocal.hobby,this.hobbysForeignKey);

				hobbyBeanSwingJInternalFrameLocal.actualizarRelaciones(hobbyBeanSwingJInternalFrameLocal.hobby);

				hobbyclienteLocal.setHobby(hobbyBeanSwingJInternalFrameLocal.hobby);

				this.addItemDefectoCombosForeignKeyHobby();
				this.cargarCombosFrameHobbysForeignKey("Formulario");
				this.setActualHobbyForeignKey(hobbyBeanSwingJInternalFrameLocal.hobby.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHobbyClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = hobbyclienteValidator.getInvalidValues(this.hobbycliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HobbyCliente hobbycliente,List<HobbyCliente> hobbyclientes) throws Exception {
		try	{		
			HobbyClienteConstantesFunciones.actualizarLista(hobbycliente,hobbyclientes,this.hobbyclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HobbyCliente hobbycliente,List<HobbyCliente> hobbyclientes) throws Exception {
		try	{			
			HobbyClienteConstantesFunciones.actualizarSelectedLista(hobbycliente,hobbyclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HobbyCliente> hobbyclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				hobbyclientesLocal=this.hobbyclienteLogic.getHobbyClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				hobbyclientesLocal=this.hobbyclientes;
			}
			//ARCHITECTURE
		
			for(HobbyCliente hobbyclienteLocal:hobbyclientesLocal) {
				if(this.permiteMantenimiento(hobbyclienteLocal) && hobbyclienteLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+HobbyClienteConstantesFunciones.getHobbyClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HobbyClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_empresaHobbyCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_clienteHobbyCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyClienteConstantesFunciones.IDHOBBY)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_hobbyHobbyCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyClienteConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabeldescripcionHobbyCliente,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_empresaHobbyCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_clienteHobbyCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobbyCliente.jLabelid_hobbyHobbyCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobbyCliente.jLabeldescripcionHobbyCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoHobbyCliente--;	
		
		
		this.hobbyclienteAux=new HobbyCliente();
		
		this.hobbyclienteAux.setId(this.iIdNuevoHobbyCliente);
		this.hobbyclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.hobbyclienteLogic.getHobbyClientes().add(this.hobbyclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.hobbyclientes.add(this.hobbyclienteAux);
		}
		//ARCHITECTURE
		
		this.hobbycliente=this.hobbyclienteAux;
		
		if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHobbyCliente(this.hobbycliente);
			this.setVariablesObjetoActualToFormularioForeignKeyHobbyCliente(this.hobbycliente);
		}
				
		//this.setDefaultControlesHobbyCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHobbyCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHobbyCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHobbyCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHobbyCliente(this.hobbyclienteBean,this.hobbycliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HobbyClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
			classes=HobbyClienteConstantesFunciones.getClassesRelationshipsOfHobbyCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.hobbyclienteReturnGeneral=hobbyclienteLogic.procesarEventosHobbyClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobbyclienteLogic.getHobbyClientes(),this.hobbycliente,this.hobbyclienteParameterGeneral,this.isEsNuevoHobbyCliente,classes);//this.hobbyclienteLogic.getHobbyCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHobbyCliente(this.hobbyclienteReturnGeneral,this.hobbyclienteBean,false);
		
		if(this.hobbyclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente());
		}
		
		if(this.hobbyclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente(),classes);//this.hobbyclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHobbyCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHobbyCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HobbyClienteBeanSwingJInternalFrameAdditional.RecargarFormHobbyCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHobbyCliente(false);
						
			if(hobbyclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobbyCliente();
			}
			
			this.actualizarVisualTableDatosHobbyCliente();
			
			this.jTableDatosHobbyCliente.setRowSelectionInterval(this.getIndiceNuevoHobbyCliente(), this.getIndiceNuevoHobbyCliente());
			
			this.seleccionarFilaTablaHobbyClienteActual();
						
			this.actualizarEstadoCeldasBotonesHobbyCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHobbyCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setEnabled(isHabilitar && this.hobbyclienteConstantesFunciones.activardescripcionHobbyCliente);	
		//
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setEnabled(isHabilitar && this.hobbyclienteConstantesFunciones.activarid_empresaHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setEnabled(isHabilitar && this.hobbyclienteConstantesFunciones.activarid_clienteHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setEnabled(isHabilitar && this.hobbyclienteConstantesFunciones.activarid_hobbyHobbyCliente);
	};
	
	public void setDefaultControlesHobbyCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHobbyCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.hobbyclienteSessionBean.setConGuardarRelaciones(true);			
			this.hobbyclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.setVisible(true);
			
					
		} else {
			//this.hobbyclienteSessionBean.setConGuardarRelaciones(false);			
			this.hobbyclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHobbyCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
				if(hobbyclienteAux.getId().equals(this.iIdNuevoHobbyCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclientes) {
				if(hobbyclienteAux.getId().equals(this.iIdNuevoHobbyCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualHobbyCliente(HobbyCliente hobbycliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
				if(hobbyclienteAux.getId().equals(hobbycliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclientes) {
				if(hobbyclienteAux.getId().equals(hobbycliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalHobbyCliente(HobbyCliente hobbyclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
				if(hobbyclienteAux.getHobbyClienteOriginal().getId().equals(hobbyclienteOriginal.getId())) {
					existe=true;
					hobbyclienteOriginal.setId(hobbyclienteAux.getId());
					hobbyclienteOriginal.setVersionRow(hobbyclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HobbyCliente hobbyclienteAux:this.hobbyclientes) {
				if(hobbyclienteAux.getHobbyClienteOriginal().getId().equals(hobbyclienteOriginal.getId())) {
					existe=true;
					hobbyclienteOriginal.setId(hobbyclienteAux.getId());
					hobbyclienteOriginal.setVersionRow(hobbyclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHobbyCliente(Boolean esParaCancelar) throws Exception {
		hobbyclientesAux=new ArrayList<HobbyCliente>();
		hobbyclienteAux=new HobbyCliente();
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
					if(hobbyclienteAux.getId()<0) {
						hobbyclientesAux.add(hobbyclienteAux);
					}		
				}
				this.iIdNuevoHobbyCliente=0L;
				this.hobbyclienteLogic.getHobbyClientes().removeAll(hobbyclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HobbyCliente hobbyclienteAux:this.hobbyclientes) {
					if(hobbyclienteAux.getId()<0) {
						hobbyclientesAux.add(hobbyclienteAux);
					}		
				}
				this.iIdNuevoHobbyCliente=0L;
				this.hobbyclientes.removeAll(hobbyclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHobbyCliente 
					&& this.hobbyclienteLogic.getHobbyClientes().size()>0
					) {
					hobbyclienteAux=this.hobbyclienteLogic.getHobbyClientes().get(this.hobbyclienteLogic.getHobbyClientes().size() - 1);
				
					if(hobbyclienteAux.getId()<0) {
						this.hobbyclienteLogic.getHobbyClientes().remove(hobbyclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHobbyCliente && this.hobbyclientes.size()>0) {
					hobbyclienteAux=this.hobbyclientes.get(this.hobbyclientes.size() - 1);
				
					if(hobbyclienteAux.getId()<0) {
						this.hobbyclientes.remove(hobbyclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHobbyCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(hobbycliente.getId()<0) {
				this.hobbyclienteLogic.getHobbyClientes().remove(this.hobbycliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(hobbycliente.getId()<0) {
				this.hobbyclientes.remove(this.hobbycliente);
			}
		}			
	}
	
	public void setEstadosInicialesHobbyCliente(List<HobbyCliente> hobbyclientesAux) throws Exception {
		HobbyClienteConstantesFunciones.setEstadosInicialesHobbyCliente(hobbyclientesAux);
	}
	
	public void setEstadosInicialesHobbyCliente(HobbyCliente hobbyclienteAux) throws Exception {
		HobbyClienteConstantesFunciones.setEstadosInicialesHobbyCliente(hobbyclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHobbyClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHobbyClienteActual()) {
				if(!this.isEsNuevoHobbyCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHobbyCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHobbyClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Hobby Cliente ?", "MANTENIMIENTO DE Hobby Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HobbyCliente hobbycliente) throws Exception {
		HobbyClienteConstantesFunciones.seleccionarAsignar(this.hobbycliente,hobbycliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHobbyCliente=this.isPermisoActualizarOriginalHobbyCliente;
			
			
			this.seleccionarAsignar(hobbycliente);
			
			

			idClienteActual=hobbycliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HobbyClienteConstantesFunciones.quitarEspaciosHobbyCliente(this.hobbycliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHobbyCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.hobbyclienteSessionBean.setsFuncionBusquedaRapida(this.hobbyclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHobbyCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHobbyCliente(esParaCancelar);				
				this.cancelarNuevoHobbyCliente(esParaCancelar);								
			}
			
			this.hobbycliente=new HobbyCliente();
			
			this.inicializarHobbyCliente();
			
			this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHobbyCliente() throws Exception {
		try {
			HobbyClienteConstantesFunciones.inicializarHobbyCliente(this.hobbycliente);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.hobbyclienteLogic.getHobbyClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHobbyClientes(String sAccionBusqueda,List<HobbyCliente> hobbyclientesParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="HobbyCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HobbyClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HobbyClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HobbyCliente"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Hobby Clientes");		
		parameters.put("busquedapor", HobbyClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHobbyCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HobbyClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HobbyClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHobbyCliente=new JRBeanArrayDataSource(HobbyClienteJInternalFrame.TraerHobbyClienteBeans(hobbyclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHobbyCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HobbyClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HobbyClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HobbyClienteBean.TraerHobbyClienteBeans(hobbyclientesParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHobbyClienteActionPerformed(null);
					//this.generarExcelReporteHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHobbyClientes(sAccionBusqueda,sTipoArchivoReporte,hobbyclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHobbyClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<HobbyCliente> hobbyclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HobbyClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHobbyCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HobbyCliente hobbycliente : hobbyclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HobbyClienteConstantesFunciones.generarExcelReporteDataHobbyCliente("NORMAL",row,workbook,hobbycliente,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHobbyCliente(String sTipo,Row row,Workbook workbook) {
		
		HobbyClienteConstantesFunciones.generarExcelReporteHeaderHobbyCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHobbyClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<HobbyCliente> hobbyclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HobbyClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HobbyCliente hobbycliente : hobbyclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HobbyClienteConstantesFunciones.getHobbyClienteDescripcion(hobbycliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobbycliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobbycliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyClienteConstantesFunciones.LABEL_IDHOBBY))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDHOBBY);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobbycliente.gethobby_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobbycliente.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHobbyClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<HobbyCliente> hobbyclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HobbyCliente> hobbyclientesRespaldo=null;
		
		classes=HobbyClienteConstantesFunciones.getClassesRelationshipsOfHobbyCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.hobbyclienteLogic.setDatosCliente(this.datosCliente);
		this.hobbyclienteLogic.setDatosDeep(this.datosDeep);
		this.hobbyclienteLogic.setIsConDeep(true);
		
		hobbyclientesRespaldo=this.hobbyclienteLogic.getHobbyClientes();
		
		this.hobbyclienteLogic.setHobbyClientes(hobbyclientesParaReportes);	
		this.hobbyclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		hobbyclientesParaReportes=this.hobbyclienteLogic.getHobbyClientes();
		this.hobbyclienteLogic.setHobbyClientes(hobbyclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HobbyClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHobbyCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HobbyCliente hobbycliente : hobbyclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHobbyCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HobbyClienteConstantesFunciones.generarExcelReporteDataHobbyCliente("NORMAL",row,workbook,hobbycliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HobbyClienteConstantesFunciones.getHobbyClienteDescripcion(hobbycliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHobbyCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHobbyCliente() throws Exception {		
		this.startProcessHobbyCliente(true);
	}
	
	public void startProcessHobbyCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHobbyCliente ,this.jPanelParametrosReportesHobbyCliente, this.jScrollPanelDatosHobbyCliente,this.jPanelPaginacionHobbyCliente, this.jScrollPanelDatosEdicionHobbyCliente, this.jPanelAccionesHobbyCliente,this.jPanelAccionesFormularioHobbyCliente,this.jmenuBarHobbyCliente,this.jmenuBarDetalleHobbyCliente,this.jTtoolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasHobbyCliente=this.jTabbedPaneBusquedasHobbyCliente; 
		
		final JPanel jPanelParametrosReportesHobbyCliente=this.jPanelParametrosReportesHobbyCliente;
		//final JScrollPane jScrollPanelDatosHobbyCliente=this.jScrollPanelDatosHobbyCliente;
		final JTable jTableDatosHobbyCliente=this.jTableDatosHobbyCliente;		
		final JPanel jPanelPaginacionHobbyCliente=this.jPanelPaginacionHobbyCliente;
		//final JScrollPane jScrollPanelDatosEdicionHobbyCliente=this.jScrollPanelDatosEdicionHobbyCliente;
		final JPanel jPanelAccionesHobbyCliente=this.jPanelAccionesHobbyCliente;
		
		JPanel jPanelCamposAuxiliarHobbyCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHobbyCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			jPanelCamposAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jPanelCamposHobbyCliente;
			jPanelAccionesFormularioAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jPanelAccionesFormularioHobbyCliente;
		}
		
		final JPanel jPanelCamposHobbyCliente=jPanelCamposAuxiliarHobbyCliente;
		final JPanel jPanelAccionesFormularioHobbyCliente=jPanelAccionesFormularioAuxiliarHobbyCliente;
		
		
		final JMenuBar jmenuBarHobbyCliente=this.jmenuBarHobbyCliente;
		final JToolBar jTtoolBarHobbyCliente=this.jTtoolBarHobbyCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHobbyCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHobbyCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			jmenuBarDetalleAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jmenuBarDetalleHobbyCliente;
			jTtoolBarDetalleAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jTtoolBarDetalleHobbyCliente;
		}
		
		final JMenuBar jmenuBarDetalleHobbyCliente=jmenuBarDetalleAuxiliarHobbyCliente;
		final JToolBar jTtoolBarDetalleHobbyCliente=jTtoolBarDetalleAuxiliarHobbyCliente;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHobbyCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHobbyCliente;
			processRunnable.jTableDatos=jTableDatosHobbyCliente;
			processRunnable.jPanelCampos=jPanelCamposHobbyCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionHobbyCliente;
			processRunnable.jPanelAcciones=jPanelAccionesHobbyCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHobbyCliente;
			
			
			processRunnable.jmenuBar=jmenuBarHobbyCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHobbyCliente;
			processRunnable.jTtoolBar=jTtoolBarHobbyCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHobbyCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHobbyCliente ,jPanelParametrosReportesHobbyCliente,jTableDatosHobbyCliente, /*jScrollPanelDatosHobbyCliente,*/jPanelCamposHobbyCliente,jPanelPaginacionHobbyCliente, /*jScrollPanelDatosEdicionHobbyCliente,*/ jPanelAccionesHobbyCliente,jPanelAccionesFormularioHobbyCliente,jmenuBarHobbyCliente,jmenuBarDetalleHobbyCliente,jTtoolBarHobbyCliente,jTtoolBarDetalleHobbyCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHobbyCliente ,jPanelParametrosReportesHobbyCliente, jScrollPanelDatosHobbyCliente,jPanelPaginacionHobbyCliente, jScrollPanelDatosEdicionHobbyCliente, jPanelAccionesHobbyCliente,jPanelAccionesFormularioHobbyCliente,jmenuBarHobbyCliente,jmenuBarDetalleHobbyCliente,jTtoolBarHobbyCliente,jTtoolBarDetalleHobbyCliente);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessHobbyCliente() {// throws Exception 
		this.finishProcessHobbyCliente(true);
	}
	
	public void finishProcessHobbyCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHobbyCliente ,this.jPanelParametrosReportesHobbyCliente, this.jScrollPanelDatosHobbyCliente,this.jPanelPaginacionHobbyCliente, this.jScrollPanelDatosEdicionHobbyCliente, this.jPanelAccionesHobbyCliente,this.jPanelAccionesFormularioHobbyCliente,this.jmenuBarHobbyCliente,this.jmenuBarDetalleHobbyCliente,this.jTtoolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasHobbyCliente=this.jTabbedPaneBusquedasHobbyCliente; 
		
		final JPanel jPanelParametrosReportesHobbyCliente=this.jPanelParametrosReportesHobbyCliente;
		//final JScrollPane jScrollPanelDatosHobbyCliente=this.jScrollPanelDatosHobbyCliente;
		final JTable jTableDatosHobbyCliente=this.jTableDatosHobbyCliente;		
		final JPanel jPanelPaginacionHobbyCliente=this.jPanelPaginacionHobbyCliente;
		//final JScrollPane jScrollPanelDatosEdicionHobbyCliente=this.jScrollPanelDatosEdicionHobbyCliente;
		final JPanel jPanelAccionesHobbyCliente=this.jPanelAccionesHobbyCliente;
		
		JPanel jPanelCamposAuxiliarHobbyCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHobbyCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			jPanelCamposAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jPanelCamposHobbyCliente;
			jPanelAccionesFormularioAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jPanelAccionesFormularioHobbyCliente;
		}
		
		final JPanel jPanelCamposHobbyCliente=jPanelCamposAuxiliarHobbyCliente;
		final JPanel jPanelAccionesFormularioHobbyCliente=jPanelAccionesFormularioAuxiliarHobbyCliente;
		
		
		final JMenuBar jmenuBarHobbyCliente=this.jmenuBarHobbyCliente;		
		final JToolBar jTtoolBarHobbyCliente=this.jTtoolBarHobbyCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarHobbyCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHobbyCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			jmenuBarDetalleAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jmenuBarDetalleHobbyCliente;
			jTtoolBarDetalleAuxiliarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jTtoolBarDetalleHobbyCliente;		
		}
		
		final JMenuBar jmenuBarDetalleHobbyCliente=jmenuBarDetalleAuxiliarHobbyCliente;
		final JToolBar jTtoolBarDetalleHobbyCliente=jTtoolBarDetalleAuxiliarHobbyCliente;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHobbyCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHobbyCliente;
			processRunnable.jTableDatos=jTableDatosHobbyCliente;
			processRunnable.jPanelCampos=jPanelCamposHobbyCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionHobbyCliente;
			processRunnable.jPanelAcciones=jPanelAccionesHobbyCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHobbyCliente;
			
			
			processRunnable.jmenuBar=jmenuBarHobbyCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHobbyCliente;
			processRunnable.jTtoolBar=jTtoolBarHobbyCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHobbyCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHobbyCliente ,jPanelParametrosReportesHobbyCliente, jTableDatosHobbyCliente,/*jScrollPanelDatosHobbyCliente,*/jPanelCamposHobbyCliente,jPanelPaginacionHobbyCliente, /*jScrollPanelDatosEdicionHobbyCliente,*/ jPanelAccionesHobbyCliente,jPanelAccionesFormularioHobbyCliente,jmenuBarHobbyCliente,jmenuBarDetalleHobbyCliente,jTtoolBarHobbyCliente,jTtoolBarDetalleHobbyCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHobbyCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHobbyCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHobbyCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHobbyCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHobbyCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHobbyCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHobbyCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHobbyCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHobbyCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.hobbyclienteConstantesFunciones.getsFinalQueryHobbyCliente();
		String  finalQueryPaginacionTodos=this.hobbyclienteConstantesFunciones.getsFinalQueryHobbyCliente();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=HobbyClienteConstantesFunciones.getArrayColumnasGlobalesNoHobbyCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HobbyClienteConstantesFunciones.getArrayColumnasGlobalesHobbyCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HobbyClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.hobbyclientesEliminados= new ArrayList<HobbyCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHobbyCliente();
		
				///*HobbyClienteSessionBean*/this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			
			if(this.hobbyclienteSessionBean==null) {
				this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=HobbyClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HobbyClienteConstantesFunciones.getClassesForeignKeysOfHobbyCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/hobbycliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			hobbyclientesAux= new ArrayList<HobbyCliente>();
			
				
			hobbyclienteLogic.setDatosCliente(this.datosCliente);
			hobbyclienteLogic.setDatosDeep(this.datosDeep);
			hobbyclienteLogic.setIsConDeep(true);
			
			
			hobbyclienteLogic.getHobbyClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					hobbyclienteLogic.getTodosHobbyClientes(finalQueryGlobal,pagination);
					
					//hobbyclienteLogic.getTodosHobbyClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(hobbyclienteLogic.getHobbyClientes()==null|| hobbyclienteLogic.getHobbyClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbyclientesAux= new ArrayList<HobbyCliente>();
							hobbyclientesAux.addAll(hobbyclienteLogic.getHobbyClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientesAux= new ArrayList<HobbyCliente>();
							hobbyclientesAux.addAll(hobbyclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbyclienteLogic.getTodosHobbyClientes(finalQueryGlobal+"",this.pagination);												
							
							//hobbyclienteLogic.getTodosHobbyClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHobbyClientes("Todos",hobbyclienteLogic.getHobbyClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());					
							hobbyclienteLogic.getHobbyClientes().addAll(hobbyclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientes=new ArrayList<HobbyCliente>();
							hobbyclientes.addAll(hobbyclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHobbyCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHobbyCliente=this.idActual;
				
				} else if(this.idHobbyClienteActual!=null && this.idHobbyClienteActual!=0L) {
					idHobbyCliente=idHobbyClienteActual;
				}
				
					
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndicePorId(idHobbyCliente);
				
				this.hobbyclientes=new ArrayList<HobbyCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					hobbyclienteLogic.getEntity(idHobbyCliente);
					
					//hobbyclienteLogic.getEntityWithConnection(idHobbyCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
					hobbyclienteLogic.getHobbyClientes().add(hobbyclienteLogic.getHobbyCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbyclientes=new ArrayList<HobbyCliente>();
					this.hobbyclientes.add(hobbycliente);
				}
				
				if(hobbyclienteLogic.getHobbyCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyclienteLogic.getHobbyClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyclienteLogic.getHobbyClientes()==null||hobbyclienteLogic.getHobbyClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbyclientes==null|| hobbyclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclientesAux=new ArrayList<HobbyCliente>();
						hobbyclientesAux.addAll(hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientesAux=new ArrayList<HobbyCliente>();
							hobbyclientesAux.addAll(hobbyclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyclienteLogic.getHobbyClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbyClientes("FK_IdCliente",hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbyClientes("FK_IdCliente",hobbyclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
						hobbyclienteLogic.getHobbyClientes().addAll(hobbyclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientes=new ArrayList<HobbyCliente>();
							hobbyclientes.addAll(hobbyclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyclienteLogic.getHobbyClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyclienteLogic.getHobbyClientes()==null||hobbyclienteLogic.getHobbyClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbyclientes==null|| hobbyclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclientesAux=new ArrayList<HobbyCliente>();
						hobbyclientesAux.addAll(hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientesAux=new ArrayList<HobbyCliente>();
							hobbyclientesAux.addAll(hobbyclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyclienteLogic.getHobbyClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbyClientes("FK_IdEmpresa",hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbyClientes("FK_IdEmpresa",hobbyclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
						hobbyclienteLogic.getHobbyClientes().addAll(hobbyclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientes=new ArrayList<HobbyCliente>();
							hobbyclientes.addAll(hobbyclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdHobby")) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyclienteLogic.getHobbyClientesFK_IdHobby(finalQueryGlobal,pagination,id_hobbyFK_IdHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyclienteLogic.getHobbyClientes()==null||hobbyclienteLogic.getHobbyClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbyclientes==null|| hobbyclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclientesAux=new ArrayList<HobbyCliente>();
						hobbyclientesAux.addAll(hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientesAux=new ArrayList<HobbyCliente>();
							hobbyclientesAux.addAll(hobbyclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyclienteLogic.getHobbyClientesFK_IdHobby(finalQueryGlobal,pagination,id_hobbyFK_IdHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyClienteConstantesFunciones.getDetalleIndiceFK_IdHobby(id_hobbyFK_IdHobby);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbyClientes("FK_IdHobby",hobbyclienteLogic.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbyClientes("FK_IdHobby",hobbyclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
						hobbyclienteLogic.getHobbyClientes().addAll(hobbyclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclientes=new ArrayList<HobbyCliente>();
							hobbyclientes.addAll(hobbyclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHobbyCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHobbyCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=hobbyclienteLogic.getHobbyClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbyclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=hobbyclienteLogic.getHobbyClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbyclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HobbyCliente hobbycliente) {
		Boolean permite=true;
		
		if(this.hobbycliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HobbyClienteConstantesFunciones.getOrderByListaHobbyCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HobbyClienteConstantesFunciones.getOrderByListaHobbyCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HobbyCliente hobbycliente:hobbyclienteLogic.getHobbyClientes()) {
				if(hobbycliente.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyclienteTotales=hobbycliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HobbyCliente hobbycliente:this.hobbyclientes) {
				if(hobbycliente.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyclienteTotales=hobbycliente;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.hobbyclienteAux=new HobbyCliente();
			this.hobbyclienteAux.setsType(Constantes2.S_TOTALES);
			this.hobbyclienteAux.setIsNew(false);
			this.hobbyclienteAux.setIsChanged(false);
			this.hobbyclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HobbyClienteConstantesFunciones.TotalizarValoresFilaHobbyCliente(this.hobbyclienteLogic.getHobbyClientes(),this.hobbyclienteAux);
				
				this.hobbyclienteLogic.getHobbyClientes().add(this.hobbyclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HobbyClienteConstantesFunciones.TotalizarValoresFilaHobbyCliente(this.hobbyclientes,this.hobbyclienteAux);
				
				this.hobbyclientes.add(this.hobbyclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		hobbyclienteTotales=new HobbyCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.hobbyclienteLogic.getHobbyClientes().remove(hobbyclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.hobbyclientes.remove(hobbyclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		hobbyclienteTotales=new HobbyCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HobbyCliente hobbycliente:hobbyclienteLogic.getHobbyClientes()) {
				if(hobbycliente.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyclienteTotales=hobbycliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HobbyClienteConstantesFunciones.TotalizarValoresFilaHobbyCliente(this.hobbyclienteLogic.getHobbyClientes(),hobbyclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HobbyCliente hobbycliente:this.hobbyclientes) {
				if(hobbycliente.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyclienteTotales=hobbycliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HobbyClienteConstantesFunciones.TotalizarValoresFilaHobbyCliente(this.hobbyclientes,hobbyclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHobbyClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHobbyClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHobbyClientesFK_IdHobby()throws Exception {
		try {
			sAccionBusqueda="FK_IdHobby";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHobbyClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyclienteLogic.getHobbyClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHobbyClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyclienteLogic.getHobbyClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHobbyClientesFK_IdHobby(String sFinalQuery,Long id_hobby)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyclienteLogic.getHobbyClientesFK_IdHobby(sFinalQuery,this.pagination,id_hobby);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosHobbyCliente() {
		this.isPermisoTodoHobbyCliente=false;
		this.isPermisoNuevoHobbyCliente=false;
		this.isPermisoActualizarHobbyCliente=false;
		this.isPermisoActualizarOriginalHobbyCliente=false;
		this.isPermisoEliminarHobbyCliente=false;
		this.isPermisoGuardarCambiosHobbyCliente=false;
		this.isPermisoConsultaHobbyCliente=false;
		this.isPermisoBusquedaHobbyCliente=false;
		this.isPermisoReporteHobbyCliente=false;		
		this.isPermisoOrdenHobbyCliente=false;		
		this.isPermisoPaginacionMedioHobbyCliente=false;		
		this.isPermisoPaginacionAltoHobbyCliente=false;
		this.isPermisoPaginacionTodoHobbyCliente=false;
		this.isPermisoCopiarHobbyCliente=false;		
		this.isPermisoVerFormHobbyCliente=false;		
		this.isPermisoDuplicarHobbyCliente=false;		
		this.isPermisoOrdenHobbyCliente=false;		
	}
	
	public void setPermisosUsuarioHobbyCliente(Boolean isPermiso) {
		this.isPermisoTodoHobbyCliente=isPermiso;
		this.isPermisoNuevoHobbyCliente=isPermiso;
		this.isPermisoActualizarHobbyCliente=isPermiso;
		this.isPermisoActualizarOriginalHobbyCliente=isPermiso;
		this.isPermisoEliminarHobbyCliente=isPermiso;
		this.isPermisoGuardarCambiosHobbyCliente=isPermiso;
		this.isPermisoConsultaHobbyCliente=isPermiso;
		this.isPermisoBusquedaHobbyCliente=isPermiso;
		this.isPermisoReporteHobbyCliente=isPermiso;
		this.isPermisoOrdenHobbyCliente=isPermiso;		
		this.isPermisoPaginacionMedioHobbyCliente=isPermiso;		
		this.isPermisoPaginacionAltoHobbyCliente=isPermiso;		
		this.isPermisoPaginacionTodoHobbyCliente=isPermiso;		
		this.isPermisoCopiarHobbyCliente=isPermiso;		
		this.isPermisoVerFormHobbyCliente=isPermiso;		
		this.isPermisoDuplicarHobbyCliente=isPermiso;
		this.isPermisoOrdenHobbyCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHobbyCliente(Boolean isPermiso) {
		//this.isPermisoTodoHobbyCliente=isPermiso;
		this.isPermisoNuevoHobbyCliente=isPermiso;
		this.isPermisoActualizarHobbyCliente=isPermiso;
		this.isPermisoActualizarOriginalHobbyCliente=isPermiso;
		this.isPermisoEliminarHobbyCliente=isPermiso;
		this.isPermisoGuardarCambiosHobbyCliente=isPermiso;
		//this.isPermisoConsultaHobbyCliente=isPermiso;
		//this.isPermisoBusquedaHobbyCliente=isPermiso;
		//this.isPermisoReporteHobbyCliente=isPermiso;
		//this.isPermisoOrdenHobbyCliente=isPermiso;		
		//this.isPermisoPaginacionMedioHobbyCliente=isPermiso;		
		//this.isPermisoPaginacionAltoHobbyCliente=isPermiso;		
		//this.isPermisoPaginacionTodoHobbyCliente=isPermiso;		
		//this.isPermisoCopiarHobbyCliente=isPermiso;		
		//this.isPermisoDuplicarHobbyCliente=isPermiso;
		//this.isPermisoOrdenHobbyCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHobbyClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HobbyClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebHobbyCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHobbyClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHobbyClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHobbyClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHobbyClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHobbyCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HobbyClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HobbyClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHobbyCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHobbyCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHobbyCliente=this.isPermisoActualizarHobbyCliente;
			this.isPermisoEliminarHobbyCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHobbyCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHobbyCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHobbyCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHobbyCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHobbyCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHobbyCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHobbyCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHobbyCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHobbyCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHobbyCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHobbyCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHobbyCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHobbyCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHobbyCliente.setToolTipText(this.jTableDatosHobbyCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHobbyCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHobbyCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HobbyClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(HobbyClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioHobbyCliente() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyHobbyClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.hobbysForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHobbyClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HobbyClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHobbyClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyHobbyListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyHobbyListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.hobbysForeignKey==null||this.hobbysForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=HobbyConstantesFunciones.getArrayColumnasGlobalesHobby(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HobbyConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=HobbyConstantesFunciones.SFINALQUERY;

				this.cargarCombosHobbysForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyHobbyClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HobbyClienteParameterReturnGeneral hobbyclienteReturnGeneral=new HobbyClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.hobbyclienteConstantesFunciones.cargarid_empresaHobbyCliente)
					 || (this.esRecargarFks && this.hobbyclienteConstantesFunciones.cargarid_empresaHobbyCliente)) {

					if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+hobbyclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.hobbyclienteConstantesFunciones.cargarid_clienteHobbyCliente)
					 || (this.esRecargarFks && this.hobbyclienteConstantesFunciones.cargarid_clienteHobbyCliente)) {

					if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+hobbyclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalHobby="";

				if(((this.hobbysForeignKey==null||this.hobbysForeignKey.size()<=0) && this.hobbyclienteConstantesFunciones.cargarid_hobbyHobbyCliente)
					 || (this.esRecargarFks && this.hobbyclienteConstantesFunciones.cargarid_hobbyHobbyCliente)) {

					if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=HobbyConstantesFunciones.getArrayColumnasGlobalesHobby(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalHobby=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HobbyConstantesFunciones.TABLENAME);

						finalQueryGlobalHobby=Funciones.GetFinalQueryAppend(finalQueryGlobalHobby, "");
						finalQueryGlobalHobby+=HobbyConstantesFunciones.SFINALQUERY;

						//this.cargarCombosHobbysForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalHobby=" WHERE " + ConstantesSql.ID + "="+hobbyclienteSessionBean.getlidHobbyActual();
					}
				} else {
					finalQueryGlobalHobby="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				hobbyclienteReturnGeneral=hobbyclienteLogic.cargarCombosLoteForeignKeyHobbyCliente(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalHobby);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=hobbyclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=hobbyclienteReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalHobby.equals("NONE")) {
				this.hobbysForeignKey=hobbyclienteReturnGeneral.gethobbysForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHobbyCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyHobby();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.hobbyclienteSessionBean==null) {
				this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyHobby()throws Exception {
		try {

			if(!this.hobbyclienteSessionBean.getisBusquedaDesdeForeignKeySesionHobby()) {
				Hobby hobby=new Hobby();
				HobbyConstantesFunciones.setHobbyDescripcion(hobby,Constantes.SMENSAJE_ESCOJA_OPCION);
				hobby.setId(null);

				if(!HobbyConstantesFunciones.ExisteEnLista(this.hobbysForeignKey,hobby,true)) {

					this.hobbysForeignKey.add(0,hobby);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyHobbyCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHobbyCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHobbyCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHobbyCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHobbyCliente(HobbyCliente hobbycliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(hobbycliente.getid_cliente(),false,"Formulario");
			this.setActualHobbyForeignKey(hobbycliente.getid_hobby(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHobbyCliente(HobbyCliente hobbycliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(hobbycliente.getCliente()!=null && !sTipoEvento.equals("id_clienteHobbyCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(hobbycliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHobbyCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.hobbyclienteConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualHobbyForeignKey(this.hobbyclienteConstantesFunciones.getid_hobby(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHobbyCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHobbyCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHobbyCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHobbyCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHobbyCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameHobbysForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHobbyCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameHobbysForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHobbyCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public HobbyClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HobbyClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HobbyClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.hobbyclienteSessionBean=new HobbyClienteSessionBean(); 
		this.hobbyclienteConstantesFunciones=new HobbyClienteConstantesFunciones(); 
		this.hobbyclienteBean=new HobbyCliente();//(this.hobbyclienteConstantesFunciones); 		
		this.hobbyclienteReturnGeneral=new HobbyClienteParameterReturnGeneral(); 
		
		this.hobbyclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbyclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HobbyClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HobbyClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HobbyClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHobbyCliente(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.hobbyclienteConstantesFunciones=new HobbyClienteConstantesFunciones(); 
			this.hobbyclienteBean=new HobbyCliente();//this.hobbyclienteConstantesFunciones); 			
			this.hobbyclienteReturnGeneral=new HobbyClienteParameterReturnGeneral(); 
		
			HobbyClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Hobby Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.hobbycliente=new HobbyCliente();
			this.hobbyclientes = new ArrayList<HobbyCliente>();
			this.hobbyclientesAux = new ArrayList<HobbyCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic=new HobbyClienteLogic();
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.hobbyclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.hobbyclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHobbyCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHobbyCliente);	
					}
					
					if(this.jInternalFrameImportacionHobbyCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHobbyCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHobbyCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHobbyCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHobbyCliente);
				this.jInternalFrameDetalleFormHobbyCliente.setVisible(false);
				this.jInternalFrameDetalleFormHobbyCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHobbyCliente);
					this.jInternalFrameReporteDinamicoHobbyCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoHobbyCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHobbyCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHobbyCliente);
					this.jInternalFrameImportacionHobbyCliente.setVisible(false);
					this.jInternalFrameImportacionHobbyCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHobbyCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHobbyCliente);
					this.jInternalFrameOrderByHobbyCliente.setVisible(false);
					this.jInternalFrameOrderByHobbyCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHobbyClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HobbyClienteConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.hobbyclienteReturnGeneral=new HobbyClienteParameterReturnGeneral();
			
			this.hobbyclienteParameterGeneral=new HobbyClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.hobbyclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(HobbyClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HobbyClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.hobbyclienteSessionBean.getEsGuardarRelacionado(),this.hobbyclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HobbyClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.hobbyclienteSessionBean.getEsGuardarRelacionado(),this.hobbyclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaDuplicarHobbyCliente=true;
			this.isVisibilidadCeldaCopiarHobbyCliente=true;
			this.isVisibilidadCeldaVerFormHobbyCliente=true;
			this.isVisibilidadCeldaOrdenHobbyCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=false;
			this.isVisibilidadCeldaGuardarHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdHobby=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHobbyCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHobbyCliente(false);
			
			this.setPermisosUsuarioHobbyCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.hobbyclienteSessionBean.getEsGuardarRelacionado() && this.hobbyclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHobbyClienteClasesRelacionadas();
			}
			
			if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHobbyClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHobbyCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHobbyCliente();
			}
			
			if(!this.isPermisoBusquedaHobbyCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHobbyCliente,this.isPermisoPaginacionMedioHobbyCliente,this.isPermisoPaginacionTodoHobbyCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HobbyClienteConstantesFunciones.getTiposSeleccionarHobbyCliente());
				
				this.tiposColumnasSelect=HobbyClienteConstantesFunciones.getTiposSeleccionarHobbyCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHobbyCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioHobbyCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioHobbyCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHobbyCliente() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.clienteLogic=new ClienteLogic();
			this.hobbyLogic=new HobbyLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				hobbyclienteImplementable= (HobbyClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HobbyClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				hobbyclienteImplementableHome= (HobbyClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HobbyClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.hobbyclientes= new ArrayList<HobbyCliente>();
			this.hobbyclientesEliminados= new ArrayList<HobbyCliente>();
						
			this.isEsNuevoHobbyCliente=false;
			this.esParaAccionDesdeFormularioHobbyCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.hobbysForeignKey=new ArrayList<Hobby>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHobbyCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHobbyCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HobbyClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HobbyClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHobbyCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHobbyCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHobbyCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHobbyCliente();
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHobbyCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHobbyCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHobbyCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHobbyCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HobbyCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHobbyCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHobbyCliente")) {
				iIndex=this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHobbyCliente();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyHobbyCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHobbyCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHobbyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHobbyClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHobbyCliente();
		
		this.cargarCombosFrameForeignKeyHobbyCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHobbyCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHobbyCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyHobby(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyHobbyListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyHobby();
				this.cargarCombosFrameHobbysForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaHobby(this.hobbysForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoHobbyClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			
			if(jTableDatosHobbyCliente.getRowCount()>=1) {
				jTableDatosHobbyCliente.removeRowSelectionInterval(0, jTableDatosHobbyCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoHobbyCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHobbyCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHobbyCliente(true);			
			//this.hobbycliente=new HobbyCliente();
			//this.hobbycliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobbyCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobbyCliente() ;
			
			if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobbyCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.hobbycliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);				
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HobbyCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHobbyClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHobbyCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHobbyCliente.getSelectedRows().length;			
			}
			
			hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHobbyCliente--;			
				//HobbyCliente hobbyclienteAux= new HobbyCliente();			
				//hobbyclienteAux.setId(this.iIdNuevoHobbyCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HobbyCliente hobbyclienteOrigen=new HobbyCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HobbyCliente hobbyclienteOrigen : hobbyclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							hobbyclienteOrigen =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyclienteOrigen =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHobbyCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.hobbycliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHobbyCliente(hobbyclienteOrigen,this.hobbycliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.hobbyclienteLogic.getHobbyClientes().add(this.hobbyclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.hobbyclientes.add(this.hobbyclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHobbyCliente(false);
				
				this.jTableDatosHobbyCliente.setRowSelectionInterval(this.getIndiceNuevoHobbyCliente(), this.getIndiceNuevoHobbyCliente());
				
				int iLastRow =  this.jTableDatosHobbyCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHobbyCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHobbyCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHobbyCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();									
		
			HobbyCliente hobbyclienteOrigen=new HobbyCliente();
			HobbyCliente hobbyclienteDestino=new HobbyCliente();
				
			hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHobbyCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || hobbyclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHobbyCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteOrigen =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						hobbyclienteOrigen =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyclienteDestino =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						hobbyclienteDestino =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				hobbyclienteOrigen =hobbyclientesSeleccionados.get(0);
				hobbyclienteDestino =hobbyclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHobbyCliente(hobbyclienteOrigen,hobbyclienteDestino,true,false);
				
				hobbyclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(hobbyclienteDestino,hobbyclienteLogic.getHobbyClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyclienteDestino,hobbyclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHobbyCliente(false);
				
				//this.jTableDatosHobbyCliente.setRowSelectionInterval(this.getIndiceNuevoHobbyCliente(), this.getIndiceNuevoHobbyCliente());
				
				int iLastRow =  this.jTableDatosHobbyCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHobbyCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHobbyCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHobbyCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHobbyCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHobbyCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHobbyCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHobbyCliente.setVisible(!isVisible);
			this.jPanelPaginacionHobbyCliente.setVisible(!isVisible);
			this.jPanelAccionesHobbyCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHobbyCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHobbyCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHobbyCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHobbyCliente();
			
			this.abrirFrameOrderByHobbyCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHobbyCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHobbyCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHobbyCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHobbyCliente.isMaximum()) {
					this.jInternalFrameDetalleFormHobbyCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHobbyCliente.setSize(this.jInternalFrameDetalleFormHobbyCliente.iWidthFormulario,this.jInternalFrameDetalleFormHobbyCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHobbyCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHobbyCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHobbyCliente.isMaximum()) {
						this.jInternalFrameDetalleFormHobbyCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHobbyCliente.jContentPaneDetalleHobbyCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHobbyCliente.jContentPaneDetalleHobbyCliente.getWidth(),HobbyClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHobbyCliente.jContentPaneDetalleHobbyCliente.getWidth(),HobbyClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHobbyCliente.jContentPaneDetalleHobbyCliente.getWidth(),HobbyClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHobbyCliente.setVisible(true);
	        this.jInternalFrameDetalleFormHobbyCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHobbyCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHobbyCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHobbyCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobbyCliente,false,this);
				} else {
					this.jInternalFrameOrderByHobbyCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobbyCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHobbyCliente);
				this.jInternalFrameOrderByHobbyCliente.setVisible(false);
				this.jInternalFrameOrderByHobbyCliente.setSelected(false);
				
				this.jInternalFrameOrderByHobbyCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHobbyCliente"));
				
				this.inicializarActualizarBindingTablaOrderByHobbyCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHobbyCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHobbyCliente==null) {
				
				this.jInternalFrameImportacionHobbyCliente=new ImportacionJInternalFrame(HobbyClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHobbyCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHobbyCliente);
				this.jInternalFrameImportacionHobbyCliente.setVisible(false);
				this.jInternalFrameImportacionHobbyCliente.setSelected(false);


				this.jInternalFrameImportacionHobbyCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHobbyCliente"));
				this.jInternalFrameImportacionHobbyCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHobbyCliente"));
				this.jInternalFrameImportacionHobbyCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHobbyCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHobbyCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHobbyCliente==null) {
				this.jInternalFrameReporteDinamicoHobbyCliente=new ReporteDinamicoJInternalFrame(HobbyClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHobbyCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHobbyCliente);
				this.jInternalFrameReporteDinamicoHobbyCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoHobbyCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobbyCliente"));
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobbyCliente"));
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobbyCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobbyCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHobbyCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHobbyCliente);
			
	       	this.jInternalFrameDetalleFormHobbyCliente.setVisible(false);
	        this.jInternalFrameDetalleFormHobbyCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormHobbyCliente.dispose();
			//this.jInternalFrameDetalleFormHobbyCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHobbyCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHobbyCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoHobbyCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHobbyCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHobbyCliente.setVisible(true);
	        this.jInternalFrameImportacionHobbyCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHobbyCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHobbyCliente.setVisible(true);
	        this.jInternalFrameOrderByHobbyCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHobbyCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHobbyCliente.setVisible(false);
	        this.jInternalFrameOrderByHobbyCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHobbyCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHobbyCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoHobbyCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHobbyCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHobbyCliente.setVisible(false);
	        this.jInternalFrameImportacionHobbyCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHobbyCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHobbyCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHobbyCliente(true);
			//this.isEsNuevoHobbyCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHobbyCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobbyCliente(false) ;
			
			if(hobbyclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobbyCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobbyCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHobbyClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHobbyCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHobbyCliente(true);
			//this.isEsNuevoHobbyCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.hobbycliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHobbyCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHobbyCliente(false) ;
			
			if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobbyCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobbyCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.hobbyclienteConstantesFunciones.cargarid_clienteHobbyCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingHobbyCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHobbyCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaHobby(List<Hobby> hobbysForeignKey)throws Exception{
		TableColumn tableColumnHobby=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_IDHOBBY));
		TableCellEditor tableCellEditorHobby =tableColumnHobby.getCellEditor();

		HobbyTableCell hobbyTableCellFk=(HobbyTableCell)tableCellEditorHobby;

		if(hobbyTableCellFk!=null) {
			hobbyTableCellFk.sethobbysForeignKey(hobbysForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHobbyCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//hobbyTableCellFk.setRowActual(intSelectedRow);
			//hobbyTableCellFk.sethobbysForeignKeyActual(hobbysForeignKey);
		//}


		if(hobbyTableCellFk!=null) {
			hobbyTableCellFk.RecargarHobbysForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHobbyCliente(false);
			
			//if(!this.isEsNuevoHobbyCliente) {								
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				
			}
			
			if(this.permiteMantenimiento(this.hobbycliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHobbyCliente=true;
					this.inicializarActualizarBindingTablaHobbyCliente(false);
					this.isEsNuevoHobbyCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHobbyCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHobbyCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHobbyCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobbyCliente(false);
				
				this.habilitarDeshabilitarControlesHobbyCliente(false);
			
												
				
				if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHobbyCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHobbyClienteActionPerformed(evt,hobbyclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHobbyCliente(this.hobbycliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHobbyCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,hobbyclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.hobbycliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				this.hobbycliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				this.hobbycliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.hobbycliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HobbyClienteModel) this.jTableDatosHobbyCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHobbyCliente=true;
				this.inicializarActualizarBindingTablaHobbyCliente(false);
				this.isEsNuevoHobbyCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHobbyCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobbyCliente(false);
				
				this.habilitarDeshabilitarControlesHobbyCliente(false);
				
				
				
				if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHobbyCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHobbyClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHobbyCliente.getRowCount()>=1) {
				jTableDatosHobbyCliente.removeRowSelectionInterval(0, jTableDatosHobbyCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHobbyCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHobbyCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobbyCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobbyCliente(false) ;
			
			this.isEsNuevoHobbyCliente=false;
			
			if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHobbyCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHobbyCliente(false);
				
				//SI ES MANUAL
				if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHobbyCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHobbyCliente--;			
			//HobbyCliente hobbyclienteAux= new HobbyCliente();			
			//hobbyclienteAux.setId(this.iIdNuevoHobbyCliente);
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHobbyCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
			
			this.hobbycliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.hobbyclienteLogic.getHobbyClientes().add(this.hobbyclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.hobbyclientes.add(this.hobbyclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHobbyCliente(false);
			
			this.jTableDatosHobbyCliente.setRowSelectionInterval(this.getIndiceNuevoHobbyCliente(), this.getIndiceNuevoHobbyCliente());
			
			int iLastRow =  this.jTableDatosHobbyCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHobbyCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHobbyCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHobbyCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobbyCliente(false);
			
			//SI ES MANUAL
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobbyCliente();
			}
			
			//this.abrirFrameTreeHobbyCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Hobby ClienteS ?", "MANTENIMIENTO DE Hobby Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHobbyCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHobbyCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.hobbyclienteReturnGeneral=hobbyclienteLogic.procesarImportacionHobbyClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.hobbyclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHobbyClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHobbyCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHobbyCliente.setFileImportacion(this.jInternalFrameImportacionHobbyCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHobbyCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHobbyCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHobbyCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHobbyCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		

		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HobbyClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HobbyClienteBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HobbyClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyClienteConstantesFunciones.LABEL_IDHOBBY:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Hobby_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Hobby_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Hobby_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Hobby_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyClienteConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoHobbyCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HobbyClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDHOBBY:
					sNombreCampoCategoria="id_hobby";
					break;

				case HobbyClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HobbyClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDHOBBY:
					sNombreCampoCategoriaValor="id_hobby";
					break;

				case HobbyClienteConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HobbyClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDHOBBY:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hobby",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_hobby");
					break;

				case HobbyClienteConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoHobbyClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("HobbyClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HobbyClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HobbyCliente hobbycliente:hobbyclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobbycliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(HobbyCliente hobbycliente:hobbyclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobbycliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyClienteConstantesFunciones.LABEL_IDHOBBY:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDHOBBY);
					iRow++;

					for(HobbyCliente hobbycliente:hobbyclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobbycliente.gethobby_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyClienteConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(HobbyCliente hobbycliente:hobbyclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobbycliente.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelHobbyCliente(row);				
			//	iRow++;
			//}				
			
			//for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHobbyCliente(hobbyclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobbyCliente(false);
			
			//SI ES MANUAL
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobbyCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobbyCliente(false);
			
			//SI ES MANUAL
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHobbyCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHobbyClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobbyCliente(false);
			
			//SI ES MANUAL
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHobbyCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHobbyCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHobbyCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHobbyCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHobbyCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHobbyCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHobbyCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosHobbyCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosHobbyCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHobbyCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHobbyCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHobbyCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHobbyCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHobbyCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHobbyCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHobbyCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHobbyCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHobbyCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHobbyCliente();
		
		this.inicializarActualizarBindingBotonesManualHobbyCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHobbyCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHobbyCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHobbyCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHobbyCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHobbyCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHobbyCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHobbyCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionNuevoHobbyCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionSinCerrarHobbyCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionSinMensajeHobbyCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHobbyCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHobbyCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHobbyCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
				this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionNuevoHobbyCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionSinCerrarHobbyCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHobbyCliente.jCheckBoxPostAccionSinMensajeHobbyCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHobbyCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHobbyCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHobbyCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHobbyCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHobbyCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHobbyCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHobbyCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHobbyCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHobbyCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHobbyCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHobbyCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHobbyCliente() throws Exception {
		try	{
			if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHobbyCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHobbyCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHobbyCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHobbyCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHobbyCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHobbyCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHobbyCliente.addItem(reporte);
			}
			
			
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHobbyCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHobbyCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHobbyCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHobbyCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHobbyCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHobbyCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHobbyCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobbyCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobbyCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
				this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
				this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHobbyCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHobbyCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHobbyCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHobbyCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHobbyCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHobbyCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteHobbyCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteHobbyCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.getSelectedItem()!=null){this.id_hobbyFK_IdHobby=((Hobby)this.jComboBoxid_hobbyFK_IdHobbyHobbyCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHobbyCliente(Boolean esInicializar) throws Exception {				
		if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHobbyCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHobbyCliente() throws Exception {
		this.inicializarActualizarBindingTablaHobbyCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHobbyCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHobbyClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHobbyCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=hobbyclienteLogic.getHobbyClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=hobbyclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHobbyCliente.setModel(new HobbyClienteModel(this.hobbyclienteLogic.getHobbyClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHobbyCliente.setModel(new HobbyClienteModel(this.hobbyclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHobbyCliente!=null && this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHobbyCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO,hobbyclienteConstantesFunciones.resaltarSeleccionarHobbyCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO,hobbyclienteConstantesFunciones.resaltarSeleccionarHobbyCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_ID));

		if(this.hobbyclienteConstantesFunciones.mostraridHobbyCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.hobbyclienteConstantesFunciones.resaltaridHobbyCliente,this.hobbyclienteConstantesFunciones.activaridHobbyCliente,this,true,"idHobbyCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyclienteConstantesFunciones.resaltaridHobbyCliente,this.hobbyclienteConstantesFunciones.activaridHobbyCliente,this,true,"idHobbyCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.hobbyclienteConstantesFunciones.mostrarid_empresaHobbyCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_empresaHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_empresaHobbyCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_empresaHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_empresaHobbyCliente,false,"id_empresaHobbyCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.hobbyclienteConstantesFunciones.mostrarid_clienteHobbyCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_clienteHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_clienteHobbyCliente));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_clienteHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_clienteHobbyCliente,true,"id_clienteHobbyCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_IDHOBBY));

		if(this.hobbyclienteConstantesFunciones.mostrarid_hobbyHobbyCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyClienteConstantesFunciones.LABEL_IDHOBBY,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new HobbyTableCell(this.hobbysForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_hobbyHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_hobbyHobbyCliente));
			tableColumn.setCellEditor(new HobbyTableCell(this.hobbysForeignKey,this.hobbyclienteConstantesFunciones.resaltarid_hobbyHobbyCliente,this,this.hobbyclienteConstantesFunciones.activarid_hobbyHobbyCliente,true,"id_hobbyHobbyCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,HobbyClienteConstantesFunciones.LABEL_DESCRIPCION));

		if(this.hobbyclienteConstantesFunciones.mostrardescripcionHobbyCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyClienteConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.hobbyclienteConstantesFunciones.resaltardescripcionHobbyCliente,this.hobbyclienteConstantesFunciones.activardescripcionHobbyCliente,this,true,"descripcionHobbyCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyclienteConstantesFunciones.resaltardescripcionHobbyCliente,this.hobbyclienteConstantesFunciones.activardescripcionHobbyCliente,this,true,"descripcionHobbyCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHobbyCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHobbyCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.hobbyclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHobbyCliente.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosHobbyCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHobbyCliente.moveColumn(this.jTableDatosHobbyCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHobbyCliente.moveColumn(this.jTableDatosHobbyCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHobbyCliente.moveColumn(this.jTableDatosHobbyCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHobbyCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHobbyCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHobbyCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHobbyCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHobbyCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHobbyCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHobbyCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHobbyCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=hobbyclienteLogic.getHobbyClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=hobbyclientes.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosHobbyCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHobbyCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHobbyCliente();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoHobbyCliente=false;
					
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
				if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHobbyCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHobbyCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHobbyCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.hobbycliente.getsType().equals("DUPLICADO")
				   || this.hobbycliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHobbyCliente=true;
				
				} else {
					this.isEsNuevoHobbyCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.hobbycliente.getId()>=0 && !this.hobbycliente.getIsNew()) {						
						this.isEsNuevoHobbyCliente=false;
						
					} else {
						this.isEsNuevoHobbyCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHobbyCliente(esRelaciones);						
				
				this.seleccionarHobbyCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.hobbycliente.getId()<0) {
					this.isEsNuevoHobbyCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHobbyCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHobbyCliente(evt,rowIndex);
				}	
				
				if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HobbyCliente: " + this.dDif); 
					}
				}								
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHobbyCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.hobbycliente)) {
					if(this.hobbycliente.getId()>0) {
						this.hobbycliente.setIsDeleted(true);
						
						this.hobbyclientesEliminados.add(this.hobbycliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.hobbyclienteLogic.getHobbyClientes().remove(this.hobbycliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.hobbyclientes.remove(this.hobbycliente);				
					}
					
					
					((HobbyClienteModel) this.jTableDatosHobbyCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHobbyCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHobbyCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHobbyCliente) {
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHobbyCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHobbyCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHobbyCliente(this.hobbycliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.hobbyclienteConstantesFunciones.cargarid_empresaHobbyCliente || this.hobbyclienteConstantesFunciones.event_dependid_empresaHobbyCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.hobbycliente.getid_empresa());
									//this.inicializarActualizarBindingHobbyCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(hobbycliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(hobbycliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.hobbycliente.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.hobbyclienteConstantesFunciones.cargarid_clienteHobbyCliente || this.hobbyclienteConstantesFunciones.event_dependid_clienteHobbyCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.hobbycliente.getid_cliente());
									//this.inicializarActualizarBindingHobbyCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(hobbycliente.getCliente()!=null) {
							this.clientesForeignKey.add(hobbycliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.hobbycliente.getid_cliente(),false,"Formulario");

					//Hobby
					if(!this.hobbyclienteConstantesFunciones.cargarid_hobbyHobbyCliente || this.hobbyclienteConstantesFunciones.event_dependid_hobbyHobbyCliente) {
						//this.cargarCombosHobbysForeignKeyLista(" where id="+this.hobbycliente.getid_hobby());
									//this.inicializarActualizarBindingHobbyCliente(false,false);
						this.hobbysForeignKey=new ArrayList<Hobby>();

						if(hobbycliente.getHobby()!=null) {
							this.hobbysForeignKey.add(hobbycliente.getHobby());
						}

						this.addItemDefectoCombosForeignKeyHobby();
						this.cargarCombosFrameHobbysForeignKey("Todos");
					}
					this.setActualHobbyForeignKey(this.hobbycliente.getid_hobby(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHobbyCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHobbyCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobbyCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHobbyCliente(HobbyCliente hobbycliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHobbyCliente(hobbycliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHobbyCliente(HobbyCliente hobbycliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHobbyCliente(hobbycliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHobbyCliente(hobbycliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHobbyCliente(hobbycliente);
	}
	
	public void setVariablesObjetoActualToFormularioHobbyCliente(HobbyCliente hobbycliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setText(hobbycliente.getId().toString());
			this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setText(hobbycliente.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HobbyCliente hobbyclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,hobbyclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HobbyCliente hobbyclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				hobbyclienteLocal=this.hobbycliente;
			} else {
				hobbyclienteLocal=this.hobbyclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(hobbyclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHobbyCliente(hobbyclienteLocal,true);
					
					if(hobbyclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(hobbyclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(hobbyclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHobbyCliente(HobbyCliente hobbycliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHobbyCliente(hobbycliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(hobbycliente);
	}
	
	public void setVariablesFormularioToObjetoActualHobbyCliente(HobbyCliente hobbycliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHobbyCliente(hobbycliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHobbyCliente(HobbyCliente hobbycliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.getText()==null || this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.getText()=="" || this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setText("0");
			}

			if(conColumnasBase) {hobbycliente.setId(Long.parseLong(this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabelIdHobbyCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			hobbycliente.setdescripcion(this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyClienteConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobbyCliente.jLabeldescripcionHobbyCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHobbyCliente(HobbyCliente hobbyclienteBean,HobbyCliente hobbycliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && hobbyclienteBean.getid_cliente()!=null && !hobbyclienteBean.getid_cliente().equals(-1L))) {hobbycliente.setid_cliente(hobbyclienteBean.getid_cliente());}
			if(conDefault || (!conDefault && hobbyclienteBean.getid_hobby()!=null && !hobbyclienteBean.getid_hobby().equals(-1L))) {hobbycliente.setid_hobby(hobbyclienteBean.getid_hobby());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHobbyCliente(HobbyCliente hobbyclienteOrigen,HobbyCliente hobbycliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && hobbyclienteOrigen.getId()!=null && !hobbyclienteOrigen.getId().equals(0L))) {hobbycliente.setId(hobbyclienteOrigen.getId());}}
			if(conDefault || (!conDefault && hobbyclienteOrigen.getid_cliente()!=null && !hobbyclienteOrigen.getid_cliente().equals(-1L))) {hobbycliente.setid_cliente(hobbyclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && hobbyclienteOrigen.getid_hobby()!=null && !hobbyclienteOrigen.getid_hobby().equals(-1L))) {hobbycliente.setid_hobby(hobbyclienteOrigen.getid_hobby());}
			if(conDefault || (!conDefault && hobbyclienteOrigen.getdescripcion()!=null && !hobbyclienteOrigen.getdescripcion().equals(""))) {hobbycliente.setdescripcion(hobbyclienteOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHobbyCliente(HobbyCliente hobbycliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setText(hobbycliente.getId().toString());
			this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setText(hobbycliente.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHobbyCliente(HobbyClienteBean hobbyclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setText(hobbyclienteBean.getId().toString());
			this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setText(hobbyclienteBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHobbyCliente(HobbyClienteParameterReturnGeneral hobbyclienteReturnGeneral,HobbyClienteBean hobbyclienteBean,Boolean conDefault) throws Exception { 
		try {
			HobbyCliente hobbyclienteLocal=new HobbyCliente();
			
			hobbyclienteLocal=hobbyclienteReturnGeneral.getHobbyCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && hobbyclienteLocal.getId()!=null && !hobbyclienteLocal.getId().equals(0L))) {hobbyclienteBean.setId(hobbyclienteLocal.getId());}}
			if(conDefault || (!conDefault && hobbyclienteLocal.getid_cliente()!=null && !hobbyclienteLocal.getid_cliente().equals(-1L))) {hobbyclienteBean.setid_cliente(hobbyclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && hobbyclienteLocal.getid_hobby()!=null && !hobbyclienteLocal.getid_hobby().equals(-1L))) {hobbyclienteBean.setid_hobby(hobbyclienteLocal.getid_hobby());}
			if(conDefault || (!conDefault && hobbyclienteLocal.getdescripcion()!=null && !hobbyclienteLocal.getdescripcion().equals(""))) {hobbyclienteBean.setdescripcion(hobbyclienteLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHobbyClienteGenerico(Long idHobbyClienteSeleccionado,JComboBox jComboBoxHobbyCliente,List<HobbyCliente> hobbyclientesLocal)throws Exception {
		try {
			HobbyCliente  hobbyclienteTemp=null;

			for(HobbyCliente hobbyclienteAux:hobbyclientesLocal) {
				if(hobbyclienteAux.getId()!=null && hobbyclienteAux.getId().equals(idHobbyClienteSeleccionado)) {
					hobbyclienteTemp=hobbyclienteAux;
					break;
				}
			}

			jComboBoxHobbyCliente.setSelectedItem(hobbyclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHobbyClienteGenerico(JComboBox jComboBoxHobbyCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHobbyCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHobbyCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHobbyCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHobbyCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobbycliente=(HobbyCliente) hobbyclienteLogic.getHobbyClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			hobbycliente =(HobbyCliente) hobbyclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!hobbycliente.getIsNew() && !hobbycliente.getIsChanged() && !hobbycliente.getIsDeleted()) {
				sDescripcion=hobbycliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=hobbycliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!hobbycliente.getIsNew() && !hobbycliente.getIsChanged() && !hobbycliente.getIsDeleted()) {
				sDescripcion=hobbycliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=hobbycliente.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Hobby")) {
			//sDescripcion=this.getActualHobbyForeignKeyDescripcion((Long)value);
			if(!hobbycliente.getIsNew() && !hobbycliente.getIsChanged() && !hobbycliente.getIsDeleted()) {
				sDescripcion=hobbycliente.gethobby_descripcion();
			} else {
				//sDescripcion=this.getActualHobbyForeignKeyDescripcion((Long)value);
				sDescripcion=hobbycliente.gethobby_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HobbyCliente hobbyclienteRow=new HobbyCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobbyclienteRow=(HobbyCliente) hobbyclienteLogic.getHobbyClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			hobbyclienteRow=(HobbyCliente) hobbyclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHobbyCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente));			
			this.jButtonDuplicarHobbyCliente.setVisible((this.isVisibilidadCeldaDuplicarHobbyCliente && this.isPermisoDuplicarHobbyCliente));			
			this.jButtonCopiarHobbyCliente.setVisible((this.isVisibilidadCeldaCopiarHobbyCliente && this.isPermisoCopiarHobbyCliente));
			this.jButtonVerFormHobbyCliente.setVisible((this.isVisibilidadCeldaVerFormHobbyCliente && this.isPermisoVerFormHobbyCliente));
			
			this.jButtonAbrirOrderByHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));			
			
			this.jButtonNuevoRelacionesHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobbyCliente && this.isPermisoNuevoHobbyCliente));			
			this.jButtonNuevoGuardarCambiosHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarHobbyCliente.setVisible((this.isVisibilidadCeldaModificarHobbyCliente && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.setVisible((this.isVisibilidadCeldaActualizarHobbyCliente && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.setVisible((this.isVisibilidadCeldaEliminarHobbyCliente && this.isPermisoEliminarHobbyCliente));
			this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.setVisible(this.isVisibilidadCeldaCancelarHobbyCliente);							
			this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente));						
			this.jButtonDuplicarToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaDuplicarHobbyCliente && this.isPermisoDuplicarHobbyCliente));						
			this.jButtonCopiarToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaCopiarHobbyCliente && this.isPermisoCopiarHobbyCliente));			
			this.jButtonVerFormToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaVerFormHobbyCliente && this.isPermisoVerFormHobbyCliente));			
			this.jButtonAbrirOrderByToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));
			this.jButtonNuevoRelacionesToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobbyCliente && this.isPermisoNuevoHobbyCliente));			
			this.jButtonNuevoGuardarCambiosToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));			
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaModificarHobbyCliente && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaActualizarHobbyCliente  && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaEliminarHobbyCliente && this.isPermisoEliminarHobbyCliente));
			this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarToolBarHobbyCliente.setVisible(this.isVisibilidadCeldaCancelarHobbyCliente);				
			this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente));			
			this.jMenuItemDuplicarHobbyCliente.setVisible((this.isVisibilidadCeldaDuplicarHobbyCliente && this.isPermisoDuplicarHobbyCliente));			
			this.jMenuItemCopiarHobbyCliente.setVisible((this.isVisibilidadCeldaCopiarHobbyCliente && this.isPermisoCopiarHobbyCliente));			
			this.jMenuItemVerFormHobbyCliente.setVisible((this.isVisibilidadCeldaVerFormHobbyCliente && this.isPermisoVerFormHobbyCliente));			
			this.jMenuItemAbrirOrderByHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));			
			//this.jMenuItemMostrarOcultarHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));
			this.jMenuItemDetalleAbrirOrderByHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));			
			//this.jMenuItemDetalleMostrarOcultarHobbyCliente.setVisible((this.isVisibilidadCeldaOrdenHobbyCliente && this.isPermisoOrdenHobbyCliente));			
			this.jMenuItemNuevoRelacionesHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobbyCliente && this.isPermisoNuevoHobbyCliente));			
			this.jMenuItemNuevoGuardarCambiosHobbyCliente.setVisible((this.isVisibilidadCeldaNuevoHobbyCliente && this.isPermisoNuevoHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));									
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemModificarHobbyCliente.setVisible((this.isVisibilidadCeldaModificarHobbyCliente && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemActualizarHobbyCliente.setVisible((this.isVisibilidadCeldaActualizarHobbyCliente && this.isPermisoActualizarHobbyCliente));	
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemEliminarHobbyCliente.setVisible((this.isVisibilidadCeldaEliminarHobbyCliente && this.isPermisoEliminarHobbyCliente));
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemCancelarHobbyCliente.setVisible(this.isVisibilidadCeldaCancelarHobbyCliente);				
			}
			
			this.jMenuItemGuardarCambiosHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));						
			this.jMenuItemGuardarCambiosTablaHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHobbyCliente=this.jButtonNuevoHobbyCliente.isVisible();
			this.isVisibilidadCeldaDuplicarHobbyCliente=this.jButtonDuplicarHobbyCliente.isVisible();
			this.isVisibilidadCeldaCopiarHobbyCliente=this.jButtonCopiarHobbyCliente.isVisible();
			this.isVisibilidadCeldaVerFormHobbyCliente=this.jButtonVerFormHobbyCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenHobbyCliente=this.jButtonAbrirOrderByHobbyCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=this.jButtonNuevoRelacionesHobbyCliente.isVisible();
			this.isVisibilidadCeldaModificarHobbyCliente=this.jButtonModificarHobbyCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.isVisibilidadCeldaActualizarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.isVisible();
			this.isVisibilidadCeldaEliminarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.isVisible();
			this.isVisibilidadCeldaCancelarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.isVisible();
			this.isVisibilidadCeldaGuardarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=this.jButtonGuardarCambiosTablaHobbyCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHobbyCliente=this.jButtonNuevoToolBarHobbyCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=this.jButtonNuevoRelacionesToolBarHobbyCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.isVisibilidadCeldaModificarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarToolBarHobbyCliente.isVisible();
			this.isVisibilidadCeldaActualizarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarToolBarHobbyCliente.isVisible();
			this.isVisibilidadCeldaEliminarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarToolBarHobbyCliente.isVisible();
			this.isVisibilidadCeldaCancelarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarToolBarHobbyCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHobbyCliente=this.jButtonGuardarCambiosToolBarHobbyCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=this.jButtonGuardarCambiosTablaToolBarHobbyCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHobbyCliente=this.jMenuItemNuevoHobbyCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=this.jMenuItemNuevoRelacionesHobbyCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.isVisibilidadCeldaModificarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jMenuItemModificarHobbyCliente.isVisible();
			this.isVisibilidadCeldaActualizarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jMenuItemActualizarHobbyCliente.isVisible();
			this.isVisibilidadCeldaEliminarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jMenuItemEliminarHobbyCliente.isVisible();
			this.isVisibilidadCeldaCancelarHobbyCliente=this.jInternalFrameDetalleFormHobbyCliente.jMenuItemCancelarHobbyCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHobbyCliente=this.jMenuItemGuardarCambiosHobbyCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=this.jMenuItemGuardarCambiosTablaHobbyCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHobbyCliente(Boolean esInicializar) {
		if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHobbyCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualHobbyCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHobbyCliente() {
		this.jButtonNuevoHobbyCliente.setVisible(this.isPermisoNuevoHobbyCliente);			
		this.jButtonDuplicarHobbyCliente.setVisible(this.isPermisoDuplicarHobbyCliente);			
		this.jButtonCopiarHobbyCliente.setVisible(this.isPermisoCopiarHobbyCliente);			
		this.jButtonVerFormHobbyCliente.setVisible(this.isPermisoVerFormHobbyCliente);			
		
		this.jButtonAbrirOrderByHobbyCliente.setVisible(this.isPermisoOrdenHobbyCliente);					
		
		this.jButtonNuevoRelacionesHobbyCliente.setVisible(this.isPermisoNuevoHobbyCliente);			
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarHobbyCliente.setVisible(this.isPermisoActualizarHobbyCliente);	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.setVisible(this.isPermisoActualizarHobbyCliente);	
			this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.setVisible(this.isPermisoEliminarHobbyCliente);
			this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.setVisible(this.isVisibilidadCeldaCancelarHobbyCliente);						
			this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.setVisible(this.isPermisoGuardarCambiosHobbyCliente);							
		}
		
		this.jButtonGuardarCambiosTablaHobbyCliente.setVisible(this.isPermisoActualizarHobbyCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHobbyCliente() {
		this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarHobbyCliente.setVisible(this.isPermisoActualizarHobbyCliente);	
		this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.setVisible(this.isPermisoActualizarHobbyCliente);	
		this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.setVisible(this.isPermisoEliminarHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.setVisible(this.isVisibilidadCeldaCancelarHobbyCliente);							
		this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.setVisible((this.isVisibilidadCeldaGuardarHobbyCliente && this.isPermisoGuardarCambiosHobbyCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHobbyCliente() {
		if(HobbyClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHobbyCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHobbyCliente() {
	}
	
	public void jTableDatosHobbyClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHobbyCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHobbyClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobbycliente==null) {
						this.hobbycliente = new HobbyCliente();
					}

					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				}

				if(this.hobbycliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.hobbycliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobbyCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHobbyClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHobbyCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHobbyCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHobbyCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.hobbyclienteLogic.getConnexion());

				if(this.hobbycliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.hobbycliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHobbyCliente=(TitledBorder)this.jScrollPanelDatosHobbyCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHobbyCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHobbyClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobbycliente==null) {
						this.hobbycliente = new HobbyCliente();
					}

					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				}

				if(this.hobbycliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.hobbycliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobbyCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteHobbyClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderHobbyCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosHobbyCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderHobbyCliente=(TitledBorder)this.jScrollPanelDatosHobbyCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderHobbyCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteHobbyClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebHobbyCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHobbyCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHobbyCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.hobbyclienteLogic.getConnexion());

				if(this.hobbycliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.hobbycliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHobbyCliente=(TitledBorder)this.jScrollPanelDatosHobbyCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderHobbyCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteHobbyClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobbycliente==null) {
						this.hobbycliente = new HobbyCliente();
					}

					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				}

				if(this.hobbycliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.hobbycliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobbyCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_hobbyHobbyClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisohobby=true;

			idTienePermisohobby=this.tienePermisosUsuarioEnPaginaWebHobbyCliente(HobbyConstantesFunciones.CLASSNAME);

			if(idTienePermisohobby) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHobbyCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHobbyCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);

				this.hobbyBeanSwingJInternalFrame=new HobbyBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.hobbyBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.hobbyBeanSwingJInternalFrame.getHobbyLogic().setConnexion(this.hobbyclienteLogic.getConnexion());

				if(this.hobbycliente.getid_hobby()!=null) {
					this.hobbyBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.hobbyBeanSwingJInternalFrame.setIdActual(this.hobbycliente.getid_hobby());
					this.hobbyBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.hobbyBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.hobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobby();
				}

				JInternalFrameBase jinternalFrame =this.hobbyBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHobbyCliente=(TitledBorder)this.jScrollPanelDatosHobbyCliente.getBorder();
				TitledBorder titledBorderhobby=(TitledBorder)this.hobbyBeanSwingJInternalFrame.jScrollPanelDatosHobby.getBorder();

				titledBorderhobby.setTitle(titledBorderHobbyCliente.getTitle() + " -> Hobby");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_hobbyHobbyClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobbycliente==null) {
						this.hobbycliente = new HobbyCliente();
					}

					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				}

				if(this.hobbycliente.getid_hobby()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_hobby = "+this.hobbycliente.getid_hobby().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobbyCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionHobbyClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.gethobbycliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobbycliente==null) {
						this.hobbycliente = new HobbyCliente();
					}

					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);
				}

				if(this.hobbycliente.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.hobbycliente.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobbyCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteHobbyClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobbyCliente(false,false);

			this.getHobbyClientesFK_IdCliente();

			this.inicializarActualizarBindingHobbyCliente(false);

			//if(HobbyClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobbyCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHobbyClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobbyCliente(false,false);

			this.getHobbyClientesFK_IdEmpresa();

			this.inicializarActualizarBindingHobbyCliente(false);

			//if(HobbyClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobbyCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdHobbyHobbyClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobbyCliente(false,false);

			this.getHobbyClientesFK_IdHobby();

			this.inicializarActualizarBindingHobbyCliente(false);

			//if(HobbyClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobbyCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHobbyCliente() {
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
			this.jInternalFrameDetalleFormHobbyCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormHobbyCliente.dispose();
			this.jInternalFrameDetalleFormHobbyCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
			this.jInternalFrameReporteDinamicoHobbyCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHobbyCliente.dispose();
			this.jInternalFrameReporteDinamicoHobbyCliente=null;
		}
		
		if(this.jInternalFrameImportacionHobbyCliente!=null) {
			this.jInternalFrameImportacionHobbyCliente.setVisible(false);	    			
			this.jInternalFrameImportacionHobbyCliente.dispose();
			this.jInternalFrameImportacionHobbyCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHobbyCliente();
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHobbyCliente")) {
				jButtonDuplicarHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHobbyCliente")) {
				jButtonCopiarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormHobbyCliente")) {
				jButtonVerFormHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHobbyCliente")) {
				jButtonDuplicarHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHobbyCliente")) {
				jButtonDuplicarHobbyClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHobbyCliente")) {
				jButtonModificarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHobbyCliente")) {
				jButtonModificarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHobbyCliente")) {
				jButtonModificarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHobbyCliente")) {
				jButtonActualizarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHobbyCliente")) {
				jButtonActualizarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHobbyCliente")) {
				jButtonActualizarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarHobbyCliente")) {
				jButtonEliminarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHobbyCliente")) {
				jButtonEliminarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHobbyCliente")) {
				jButtonEliminarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarHobbyCliente")) {
				jButtonCancelarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHobbyCliente")) {
				jButtonCancelarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHobbyCliente")) {
				jButtonCancelarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarHobbyCliente")) {
				jButtonCerrarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHobbyCliente")) {
				jButtonCerrarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHobbyCliente")) {
				jButtonCerrarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHobbyCliente")) {
				jButtonMostrarOcultarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHobbyCliente")) {
				jButtonCancelarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHobbyCliente")) {
				jButtonCopiarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHobbyCliente")) {
				jButtonVerFormHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHobbyCliente")) {
				jButtonCopiarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHobbyCliente")) {
				jButtonVerFormHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHobbyCliente")) {
				jButtonRecargarInformacionHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHobbyCliente")) {
				jButtonRecargarInformacionHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHobbyCliente")) {
				jButtonRecargarInformacionHobbyClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHobbyCliente")) {
				jButtonAnterioresHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHobbyCliente")) {
				jButtonAnterioresHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHobbyCliente")) {
				jButtonAnterioresHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHobbyCliente")) {
				jButtonSiguientesHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHobbyCliente")) {
				jButtonSiguientesHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHobbyCliente")) {
				jButtonSiguientesHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHobbyCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByHobbyCliente")) {
				jButtonAbrirOrderByHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHobbyCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarHobbyCliente")) {
				jButtonMostrarOcultarHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHobbyCliente")) {
				jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHobbyCliente")) {
				jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHobbyCliente")) {
				jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHobbyCliente")) {
				jButtonCerrarReporteDinamicoHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHobbyCliente")) {
				jButtonGenerarReporteDinamicoHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHobbyCliente")) {
				
				jButtonGenerarExcelReporteDinamicoHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHobbyCliente")) {
				jButtonCerrarImportacionHobbyClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHobbyCliente")) {
				
				jButtonGenerarImportacionHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHobbyCliente")) {
				
				jButtonAbrirImportacionHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHobbyCliente")) {
				jComboBoxTiposAccionesHobbyClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHobbyCliente")) {
				jComboBoxTiposRelacionesHobbyClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHobbyCliente")) {
				jComboBoxTiposAccionesHobbyClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHobbyCliente")) {
				
				jComboBoxTiposSeleccionarHobbyClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHobbyCliente")) {
				jTextFieldValorCampoGeneralHobbyClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHobbyCliente")) {
				jButtonAbrirOrderByHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHobbyCliente")) {
				jButtonAbrirOrderByHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHobbyCliente")) {
				jButtonCerrarOrderByHobbyClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHobbyClienteBusqueda")) {
				this.jButtonidHobbyClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHobbyClienteUpdate")) {
				this.jButtonid_empresaHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHobbyClienteBusqueda")) {
				this.jButtonid_empresaHobbyClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteHobbyCliente")) {
				this.jButtonid_clienteHobbyClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteHobbyClienteUpdate")) {
				this.jButtonid_clienteHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteHobbyClienteBusqueda")) {
				this.jButtonid_clienteHobbyClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_hobbyHobbyClienteUpdate")) {
				this.jButtonid_hobbyHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_hobbyHobbyClienteBusqueda")) {
				this.jButtonid_hobbyHobbyClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHobbyClienteBusqueda")) {
				this.jButtondescripcionHobbyClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteHobbyCliente")) {
				this.jButtonid_clienteHobbyClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteHobbyCliente")) {
				this.jButtonFK_IdClienteHobbyClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdHobbyHobbyCliente")) {
				this.jButtonFK_IdHobbyHobbyClienteActionPerformed(evt);
			}
			
			;
			
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHobbyCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HobbyCliente hobbyclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				hobbyclienteLocal=this.hobbycliente;
			} else {
				hobbyclienteLocal=this.hobbyclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
							
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
								
						
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
								
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
							
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
								
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHobbyCliente")) {
					jCheckBoxSeleccionarTodosHobbyClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHobbyCliente")) {
					jCheckBoxSeleccionadosHobbyClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHobbyCliente")) {
					
				}
				
				


				
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
												
				
				


				
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyClienteActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobbycliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobbycliente);
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HobbyCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HobbyCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyclienteAnterior =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHobbyCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHobbyClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHobbyCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.hobbycliente =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.hobbycliente =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.hobbycliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHobbyCliente")) {
				
				}
				
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHobbyCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHobbyCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHobbyCliente")) {
			
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHobbyCliente();
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			if(sTipo.equals("NuevoHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHobbyCliente")) {
				jButtonDuplicarHobbyClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHobbyCliente")) {
				jButtonCopiarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHobbyCliente")) {
				jButtonVerFormHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHobbyCliente")) {
				jButtonNuevoHobbyClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHobbyCliente")) {
				jButtonModificarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHobbyCliente")) {
				jButtonActualizarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHobbyCliente")) {
				jButtonEliminarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHobbyCliente")) {
				jButtonCancelarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHobbyCliente")) {
				jButtonCerrarHobbyClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHobbyCliente")) {
				jButtonGuardarCambiosHobbyClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHobbyCliente")) {
				jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHobbyCliente")) {
				jButtonAbrirOrderByHobbyClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHobbyCliente")) {
				jButtonRecargarInformacionHobbyClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHobbyCliente")) {
				jButtonAnterioresHobbyClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHobbyCliente")) {
				jButtonSiguientesHobbyClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHobbyClienteBusqueda")) {
				this.jButtonidHobbyClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHobbyClienteUpdate")) {
				this.jButtonid_empresaHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHobbyClienteBusqueda")) {
				this.jButtonid_empresaHobbyClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteHobbyCliente")) {
				this.jButtonid_clienteHobbyClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteHobbyClienteUpdate")) {
				this.jButtonid_clienteHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteHobbyClienteBusqueda")) {
				this.jButtonid_clienteHobbyClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_hobbyHobbyClienteUpdate")) {
				this.jButtonid_hobbyHobbyClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_hobbyHobbyClienteBusqueda")) {
				this.jButtonid_hobbyHobbyClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHobbyClienteBusqueda")) {
				this.jButtondescripcionHobbyClienteBusquedaActionPerformed(evt);
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHobbyCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHobbyCliente")) {
				closingInternalFrameHobbyCliente();
				
			} else if(sTipo.equals("jButtonCancelarHobbyCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormHobbyCliente = (JInternalFrameBase)evt.getSource();
	            	
	            HobbyClienteBeanSwingJInternalFrame jInternalFrameParent=(HobbyClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormHobbyCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHobbyClienteActionPerformed(null);
			}
			
			HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.hobbycliente,new Object(),this.hobbyclienteParameterGeneral,this.hobbyclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHobbyCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHobbyCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHobbyCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.hobbycliente)) {
			if(!esControlTabla) {
				if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);			
				}
				
				if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHobbyCliente(this.hobbycliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.hobbyclienteReturnGeneral=hobbyclienteLogic.procesarEventosHobbyClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbyclienteLogic.getHobbyClientes(),this.hobbycliente,this.hobbyclienteParameterGeneral,this.isEsNuevoHobbyCliente,classes);//this.hobbyclienteLogic.getHobbyCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHobbyCliente(this.hobbyclienteReturnGeneral,this.hobbyclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHobbyCliente(classes,this.hobbyclienteReturnGeneral,this.hobbyclienteBean,false);
					}
						
					if(this.hobbyclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente());	
					}
						
					if(this.hobbyclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente(),classes);//this.hobbyclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHobbyCliente(this.hobbycliente,classes);//this.hobbyclienteBean);									
				}
			
				if(HobbyClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHobbyCliente(this.hobbycliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHobbyCliente(this.hobbycliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.hobbyclienteAnterior!=null) {
						this.hobbycliente=this.hobbyclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.hobbyclienteReturnGeneral=hobbyclienteLogic.procesarEventosHobbyClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbyclienteLogic.getHobbyClientes(),this.hobbycliente,this.hobbyclienteParameterGeneral,this.isEsNuevoHobbyCliente,classes);//this.hobbyclienteLogic.getHobbyCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.hobbyclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.hobbyclienteReturnGeneral.getHobbyCliente(),hobbyclienteLogic.getHobbyClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.hobbyclienteReturnGeneral.getHobbyCliente(),this.hobbyclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHobbyCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosHobbyCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHobbyCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosHobbyCliente() throws Exception {
		
		HobbyClienteModel hobbyclienteModel=(HobbyClienteModel)this.jTableDatosHobbyCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobbyclienteModel.hobbyclientes=this.hobbyclienteLogic.getHobbyClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			hobbyclienteModel.hobbyclientes=this.hobbyclientes;
		}
		
		
		((HobbyClienteModel) this.jTableDatosHobbyCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHobbyCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethobbyclienteAnterior(),this.hobbyclienteLogic.getHobbyClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethobbyclienteAnterior(),this.hobbyclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHobbyCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHobbyCliente(HobbyCliente hobbycliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbycliente,new Object(),generalEntityParameterGeneral,this.hobbyclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HobbyClienteConstantesFunciones.getClassesRelationshipsOfHobbyCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HobbyClienteConstantesFunciones.getClassesRelationshipsFromStringsOfHobbyCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHobbyCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HobbyClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbycliente,new Object(),generalEntityParameterGeneral,this.hobbyclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHobbyCliente(HobbyClienteBean hobbyclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHobbyCliente(ArrayList<Classe> classes,HobbyClienteReturnGeneral hobbyclienteReturnGeneral,HobbyClienteBean hobbyclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHobbyCliente(HobbyCliente hobbycliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.hobbycliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHobbyCliente = new HobbyClienteDetalleFormJInternalFrame(jDesktopPane,this.hobbyclienteSessionBean.getConGuardarRelaciones(),this.hobbyclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.setVisible(false);
		this.jInternalFrameDetalleFormHobbyCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormHobbyCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHobbyCliente.hobbyclienteLogic=this.hobbyclienteLogic;
		
		this.cargarCombosFrameForeignKeyHobbyCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHobbyCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHobbyCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHobbyCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHobbyCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHobbyCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHobbyCliente"));
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarHobbyCliente.addActionListener(new ButtonActionListener(this,"ModificarHobbyCliente"));

		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarHobbyCliente"));
					
		this.jInternalFrameDetalleFormHobbyCliente.jMenuItemModificarHobbyCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarHobbyCliente"));		
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.addActionListener (new ButtonActionListener(this,"ActualizarHobbyCliente"));
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHobbyCliente"));
						
		this.jInternalFrameDetalleFormHobbyCliente.jMenuItemActualizarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHobbyCliente"));		
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.addActionListener (new ButtonActionListener(this,"EliminarHobbyCliente"));
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarHobbyCliente"));
								
		this.jInternalFrameDetalleFormHobbyCliente.jMenuItemEliminarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHobbyCliente"));		
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.addActionListener (new ButtonActionListener(this,"CancelarHobbyCliente"));
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarHobbyCliente"));
					
		this.jInternalFrameDetalleFormHobbyCliente.jMenuItemCancelarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHobbyCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jMenuItemDetalleCerrarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHobbyCliente"));		
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobbyCliente"));
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobbyCliente"));
		
		
		
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHobbyCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonidHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteBusqueda"));
		//jButtonid_clienteHobbyCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteHobbyClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyCliente.addActionListener(new ButtonActionListener(this,"id_clienteHobbyCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtondescripcionHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHobbyCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHobbyCliente"));
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHobbyCliente"));
		}
		
		this.jTableDatosHobbyCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHobbyCliente"));
		
		this.jTableDatosHobbyCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHobbyCliente"));
		
		this.jButtonNuevoHobbyCliente.addActionListener(new ButtonActionListener(this,"NuevoHobbyCliente"));
		
		this.jButtonDuplicarHobbyCliente.addActionListener(new ButtonActionListener(this,"DuplicarHobbyCliente"));
		
		this.jButtonCopiarHobbyCliente.addActionListener(new ButtonActionListener(this,"CopiarHobbyCliente"));
		
		this.jButtonVerFormHobbyCliente.addActionListener(new ButtonActionListener(this,"VerFormHobbyCliente"));
		
		
		this.jButtonNuevoToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarHobbyCliente"));
			
		this.jButtonDuplicarToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHobbyCliente"));
			
		this.jMenuItemNuevoHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHobbyCliente"));
			
		this.jMenuItemDuplicarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHobbyCliente"));		
		
		
		this.jButtonNuevoRelacionesHobbyCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHobbyCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHobbyCliente"));
			
		this.jMenuItemNuevoRelacionesHobbyCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHobbyCliente"));		
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarHobbyCliente.addActionListener(new ButtonActionListener(this,"ModificarHobbyCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonModificarToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarHobbyCliente"));
			
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemModificarHobbyCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarHobbyCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarHobbyCliente.addActionListener (new ButtonActionListener(this,"ActualizarHobbyCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonActualizarToolBarHobbyCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHobbyCliente"));
				
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemActualizarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHobbyCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarHobbyCliente.addActionListener (new ButtonActionListener(this,"EliminarHobbyCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonEliminarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarHobbyCliente"));
						
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemEliminarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHobbyCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarHobbyCliente.addActionListener (new ButtonActionListener(this,"CancelarHobbyCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonCancelarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarHobbyCliente"));
			
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemCancelarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHobbyCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHobbyCliente"));		
		
		
		this.jButtonCerrarHobbyCliente.addActionListener (new ButtonActionListener(this,"CerrarHobbyCliente"));
		
		
		this.jButtonCerrarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarHobbyCliente"));
			
		this.jMenuItemCerrarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHobbyCliente"));
			
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jMenuItemDetalleCerrarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHobbyCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosHobbyCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobbyCliente"));
		}
		
		this.jButtonCopiarToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarHobbyCliente"));
			
		this.jButtonVerFormToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarHobbyCliente"));
		
		this.jMenuItemGuardarCambiosHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHobbyCliente"));
			
		this.jMenuItemCopiarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHobbyCliente"));		
		
		this.jMenuItemVerFormHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHobbyCliente"));		
		
		
		this.jButtonGuardarCambiosTablaHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHobbyCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHobbyCliente"));
			
		this.jMenuItemGuardarCambiosTablaHobbyCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHobbyCliente"));		
		
		
		
		this.jButtonRecargarInformacionHobbyCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionHobbyCliente"));
					
		this.jButtonRecargarInformacionToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHobbyCliente"));
		
		this.jMenuItemRecargarInformacionHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHobbyCliente"));		
		
		
		
		this.jButtonAnterioresHobbyCliente.addActionListener (new ButtonActionListener(this,"AnterioresHobbyCliente"));
		
		
		this.jButtonAnterioresToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHobbyCliente"));
		
		this.jMenuItemAnterioresHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHobbyCliente"));		
		
		
		this.jButtonSiguientesHobbyCliente.addActionListener (new ButtonActionListener(this,"SiguientesHobbyCliente"));
		
		
		this.jButtonSiguientesToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHobbyCliente"));
			
		this.jMenuItemSiguientesHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHobbyCliente"));
			
		this.jMenuItemAbrirOrderByHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHobbyCliente"));
			
		this.jMenuItemMostrarOcultarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHobbyCliente"));
			
		this.jMenuItemDetalleAbrirOrderByHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHobbyCliente"));
			
		this.jMenuItemDetalleMostarOcultarHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHobbyCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosHobbyCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHobbyCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHobbyCliente"));
			
		this.jMenuItemNuevoGuardarCambiosHobbyCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHobbyCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHobbyCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHobbyCliente"));

		this.jCheckBoxSeleccionadosHobbyCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHobbyCliente"));
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHobbyCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesHobbyCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesHobbyCliente"));
			
		this.jComboBoxTiposAccionesHobbyCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesHobbyCliente"));
					
		this.jComboBoxTiposSeleccionarHobbyCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHobbyCliente"));
			
		this.jTextFieldValorCampoGeneralHobbyCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHobbyCliente"));		
		
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonidHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteBusqueda"));
		//jButtonid_clienteHobbyCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteHobbyClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyCliente.addActionListener(new ButtonActionListener(this,"id_clienteHobbyCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtondescripcionHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteHobbyCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteHobbyCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.addActionListener(new ButtonActionListener(this,"id_clienteHobbyCliente"));

			this.jButtonFK_IdHobbyHobbyCliente.addActionListener(new ButtonActionListener(this,"FK_IdHobbyHobbyCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHobbyCliente!=null) {
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobbyCliente"));
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobbyCliente"));
				this.jInternalFrameReporteDinamicoHobbyCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobbyCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoHobbyCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobbyCliente"));				
			//this.jButtonGenerarReporteDinamicoHobbyCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobbyCliente"));
			//this.jButtonGenerarExcelReporteDinamicoHobbyCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobbyCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHobbyCliente!=null) {
				this.jInternalFrameImportacionHobbyCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHobbyCliente"));
				this.jInternalFrameImportacionHobbyCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHobbyCliente"));
				this.jInternalFrameImportacionHobbyCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHobbyCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHobbyCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByHobbyCliente"));
			
			this.jButtonAbrirOrderByToolBarHobbyCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHobbyCliente"));			
			
			if(this.jInternalFrameOrderByHobbyCliente!=null) {
				this.jInternalFrameOrderByHobbyCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHobbyCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobbyCliente.jTabbedPaneRelacionesHobbyCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHobbyCliente"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameHobbyCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHobbyCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHobbyCliente = (JInternalFrameBase)event.getSource();
	            	
	            HobbyClienteBeanSwingJInternalFrame jInternalFrameParent=(HobbyClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormHobbyCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHobbyClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHobbyCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHobbyClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHobbyCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHobbyCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHobbyCliente";
		inputMap = this.jButtonNuevoHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHobbyClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHobbyCliente";
		inputMap = this.jButtonNuevoRelacionesHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHobbyClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHobbyCliente";
		inputMap = this.jButtonModificarHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHobbyCliente";
		inputMap = this.jButtonActualizarHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHobbyCliente";
		inputMap = this.jButtonEliminarHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHobbyCliente";
		inputMap = this.jButtonCancelarHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHobbyCliente";
		inputMap = this.jButtonCerrarHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHobbyCliente";
		inputMap = this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHobbyCliente.jButtonGuardarCambiosHobbyCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHobbyClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHobbyCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHobbyClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHobbyCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHobbyClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHobbyCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHobbyClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHobbyCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHobbyClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonidHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_empresaHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyClienteBusqueda"));
		//jButtonid_clienteHobbyCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteHobbyClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyCliente.addActionListener(new ButtonActionListener(this,"id_clienteHobbyCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteHobbyClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteUpdate.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtonid_hobbyHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_hobbyHobbyClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobbyCliente.jButtondescripcionHobbyClienteBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteHobbyCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteHobbyCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.addActionListener(new ButtonActionListener(this,"id_clienteHobbyCliente"));

		this.jButtonFK_IdHobbyHobbyCliente.addActionListener(new ButtonActionListener(this,"FK_IdHobbyHobbyCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHobbyCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHobbyClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHobbyClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHobbyCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHobbyCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
					hobbyclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HobbyCliente hobbyclienteAux:hobbyclientes) {
					hobbyclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHobbyClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
						hobbyclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HobbyCliente hobbyclienteAux:hobbyclientes) {
						hobbyclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HobbyCliente hobbyclienteAux:hobbyclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHobbyCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHobbyCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHobbyCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHobbyClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHobbyCliente.getSelectedRows();
			
			HobbyCliente hobbyclienteLocal=new HobbyCliente();
			
			//this.seleccionarTodosHobbyCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyclienteLocal =(HobbyCliente) this.hobbyclienteLogic.getHobbyClientes().toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					hobbyclienteLocal =(HobbyCliente) this.hobbyclientes.toArray()[this.jTableDatosHobbyCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				hobbyclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
						hobbyclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HobbyCliente hobbyclienteAux:hobbyclientes) {
						hobbyclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHobbyCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHobbyCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHobbyCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHobbyCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHobbyClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHobbyClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHobbyClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHobbyCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HobbyCliente hobbyclienteAux:this.hobbyclienteLogic.getHobbyClientes()) {
				
						if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							hobbyclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HobbyCliente hobbyclienteAux:hobbyclientes) {
					
						if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							hobbyclienteAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHobbyCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHobbyClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHobbyCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHobbyCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHobbyCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessHobbyCliente(conSplash);
				
					this.generarReporteHobbyClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHobbyClientesSeleccionados();
				//this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHobbyClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHobbyClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHobbyCliente();
				
				this.exportarHobbyClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHobbyClientes();
				//this.importarHobbyClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHobbyCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHobbyClientesSeleccionados();
				//this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Hobby Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHobbyCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHobbyCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHobbyCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(HobbyClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHobbyCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHobbyCliente(conSplash);
					
						//this.actualizarParametrosGeneralHobbyCliente();
						
						this.generarReporteProcesoAccionHobbyClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HobbyClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Hobby ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Hobby Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHobbyCliente();
				
						this.actualizarParametrosGeneralHobbyCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.hobbyclienteReturnGeneral=hobbyclienteLogic.procesarAccionHobbyClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.hobbyclienteLogic.getHobbyClientes(),this.hobbyclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHobbyClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHobbyCliente();
					
					HobbyClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHobbyClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHobbyCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHobbyCliente.jComboBoxTiposAccionesFormularioHobbyCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHobbyCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHobbyClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHobbyCliente();
			
			if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
			HobbyCliente hobbycliente=new HobbyCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHobbyCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHobbyCliente.getSelectedItem();
			
			
			
			
			hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(hobbyclientesSeleccionados.size()==1) {
				for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
					hobbycliente=hobbyclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHobbyCliente();
			
      		//this.finishProcessHobbyCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHobbyClienteReturnGeneral() throws Exception {
		if(this.hobbyclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.hobbyclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.hobbyclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.hobbyclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.hobbyclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.hobbyclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHobbyCliente(false);
		}
		
		if(this.hobbyclienteReturnGeneral.getConRetornoLista() || this.hobbyclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.hobbyclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.hobbyclienteLogic.setHobbyClientes(this.hobbyclienteReturnGeneral.getHobbyClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.hobbyclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.hobbyclienteLogic.setHobbyCliente(this.hobbyclienteReturnGeneral.getHobbyCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHobbyCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralHobbyCliente() throws Exception {
		
		
	}
	
	public ArrayList<HobbyCliente> getHobbyClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHobbyCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HobbyCliente hobbyclienteAux:hobbyclienteLogic.getHobbyClientes()) {
					if(hobbyclienteAux.getIsSelected()) {
						hobbyclientesSeleccionados.add(hobbyclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HobbyCliente hobbyclienteAux:this.hobbyclientes) {
					if(hobbyclienteAux.getIsSelected()) {
						hobbyclientesSeleccionados.add(hobbyclienteAux);				
					}
				}
			}
			
			if(hobbyclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						hobbyclientesSeleccionados.addAll(this.hobbyclienteLogic.getHobbyClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						hobbyclientesSeleccionados.addAll(this.hobbyclientes);				
					}
				}
			}
		} else {
			hobbyclientesSeleccionados.add(this.hobbycliente);
		}
		
		return hobbyclientesSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteHobbyClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHobbyClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHobbyClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHobbyClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHobbyClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Hobby Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHobbyClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHobbyCliente();
		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHobbyCliente();
		
		
		//this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados ,hobbyclienteImplementable,hobbyclienteImplementableHome);
	}
	
	public void mostrarImportacionHobbyClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHobbyCliente();
		
		this.abrirFrameImportacionHobbyCliente();		
		
			
		//this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados ,hobbyclienteImplementable,hobbyclienteImplementableHome);
	}
	
	public void importarHobbyClientes() throws Exception {		
	
	}
	
	public void exportarHobbyClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHobbyClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHobbyClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHobbyClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Hobby Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHobbyCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHobbyCliente(hobbyclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//hobbyclienteAux.setsDetalleGeneralEntityReporte(hobbyclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHobbyCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_IDHOBBY;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyClienteConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHobbyCliente(HobbyCliente hobbycliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=hobbycliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=hobbycliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobbycliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobbycliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobbycliente.gethobby_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobbycliente.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HobbyClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHobbyCliente(row);				
				iRow++;
			}				
			
			for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHobbyCliente(hobbyclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHobbyClientesSeleccionados() throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();		
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobbycliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("hobbyclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("hobbycliente");
			//elementRoot.appendChild(element);
		
			for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
				element = document.createElement("hobbycliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHobbyCliente(hobbyclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHobbyCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_IDHOBBY);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHobbyCliente(HobbyCliente hobbycliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(hobbycliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(hobbycliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(hobbycliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(hobbycliente.gethobby_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(hobbycliente.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlHobbyCliente(HobbyCliente hobbycliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HobbyClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(hobbycliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HobbyClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(hobbycliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HobbyClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(hobbycliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(HobbyClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(hobbycliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementhobby_descripcion = document.createElement(HobbyClienteConstantesFunciones.IDHOBBY);
		elementhobby_descripcion.appendChild(document.createTextNode(hobbycliente.gethobby_descripcion()));
		element.appendChild(elementhobby_descripcion);

		Element elementdescripcion = document.createElement(HobbyClienteConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(hobbycliente.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoHobbyClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HobbyCliente> hobbyclientesSeleccionados=new ArrayList<HobbyCliente>();
		
		hobbyclientesSeleccionados=this.getHobbyClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoHobbyCliente(hobbyclientesSeleccionados);
		
		this.generarReporteHobbyClientes("Todos",hobbyclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHobbyCliente(ArrayList<HobbyCliente> hobbyclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HobbyCliente hobbyclienteAux:hobbyclientesSeleccionados) {
				hobbyclienteAux.setsDetalleGeneralEntityReporte(hobbyclienteAux.toString());
			
				if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					hobbyclienteAux.setsDescripcionGeneralEntityReporte1(hobbyclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					hobbyclienteAux.setsDescripcionGeneralEntityReporte1(hobbyclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_IDHOBBY)) {
					existe=true;
					hobbyclienteAux.setsDescripcionGeneralEntityReporte1(hobbyclienteAux.gethobby_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					hobbyclienteAux.setsDescripcionGeneralEntityReporte1(hobbyclienteAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHobbyCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHobbyCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=true;
				this.isVisibilidadCeldaGuardarCambiosHobbyCliente=true;
			}
			
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=true;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=true;
			this.isVisibilidadCeldaEliminarHobbyCliente=true;
			this.isVisibilidadCeldaCancelarHobbyCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=true;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHobbyCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=true;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=true;
			this.isVisibilidadCeldaModificarHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
			this.isVisibilidadCeldaModificarHobbyCliente=true;
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
			this.isVisibilidadCeldaCancelarHobbyCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarHobbyCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HobbyClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHobbyCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=true;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=true;
		} else {
			this.actualizarEstadoPanelsHobbyCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHobbyCliente=false;
			//this.isVisibilidadCeldaVerFormHobbyCliente=false;
			this.isVisibilidadCeldaDuplicarHobbyCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!hobbyclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoHobbyCliente=false;
			this.isVisibilidadCeldaGuardarCambiosHobbyCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			if(!hobbyclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;												
			}
			
			this.jButtonCerrarHobbyCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHobbyCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.hobbycliente)) {
			this.isVisibilidadCeldaActualizarHobbyCliente=false;
			this.isVisibilidadCeldaEliminarHobbyCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHobbyCliente() {
	}
	
	public void actualizarEstadoPanelsHobbyCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHobbyCliente!=null) {
				this.jScrollPanelDatosEdicionHobbyCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobbyCliente!=null) {
				this.jScrollPanelDatosHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobbyCliente!=null) {
				this.jPanelPaginacionHobbyCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
					this.jTabbedPaneBusquedasHobbyCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobbyCliente!=null) {
				this.jTabbedPaneBusquedasHobbyCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHobbyCliente!=null) {
				this.jPanelParametrosReportesHobbyCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdClienteHobbyCliente);}

			this.isVisibilidadFK_IdHobby=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdHobbyHobbyCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdClienteHobbyCliente);}

			this.isVisibilidadFK_IdHobby=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdHobbyHobbyCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaHobby(Boolean isParaHobby){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaHobbyNegation=!isParaHobby;

			this.isVisibilidadFK_IdCliente=isParaHobbyNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdClienteHobbyCliente);}

			this.isVisibilidadFK_IdHobby=isParaHobby;
			if(!this.isVisibilidadFK_IdHobby) {this.jTabbedPaneBusquedasHobbyCliente.remove(jPanelFK_IdHobbyHobbyCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionHobbyClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(hobbyclienteSessionBean==null) {
				hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(hobbyclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.hobbyclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(HobbyClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionHobbyCliente(true);
			//clienteSessionBean.setlidHobbyClienteActual(this.idHobbyClienteActual);

			hobbyclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHobbyCliente(true);
			hobbyclienteSessionBean.setlIdHobbyClienteActualForeignKey(this.idHobbyClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HobbyClienteSessionBean hobbyclienteSessionBean=new HobbyClienteSessionBean();
		
		if(this.hobbyclienteSessionBean==null) {
			this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		}
		
		this.hobbyclienteSessionBean.setsUltimaBusquedaHobbyCliente(this.getsAccionBusqueda());
		this.hobbyclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.hobbyclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			hobbyclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			hobbyclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdHobby")) {
			hobbyclienteSessionBean.setid_hobby(this.getid_hobbyFK_IdHobby());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HobbyClienteSessionBean hobbyclienteSessionBean=new HobbyClienteSessionBean();
		
		if(this.hobbyclienteSessionBean==null) {
			this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		}
		
		if(this.hobbyclienteSessionBean.getsUltimaBusquedaHobbyCliente()!=null&&!this.hobbyclienteSessionBean.getsUltimaBusquedaHobbyCliente().equals("")) {
			this.setsAccionBusqueda(hobbyclienteSessionBean.getsUltimaBusquedaHobbyCliente());
			this.setiNumeroPaginacion(hobbyclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(hobbyclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(hobbyclienteSessionBean.getid_cliente());
				hobbyclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(hobbyclienteSessionBean.getid_empresa());
				hobbyclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdHobby")) {
				this.setid_hobbyFK_IdHobby(hobbyclienteSessionBean.getid_hobby());
				hobbyclienteSessionBean.setid_hobby(-1L);
			}
		}
		
		this.hobbyclienteSessionBean.setsUltimaBusquedaHobbyCliente("");
		this.hobbyclienteSessionBean.setiNumeroPaginacion(HobbyClienteConstantesFunciones.INUMEROPAGINACION);
		this.hobbyclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHobbyCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHobbyCliente() {
		this.updateBorderResaltarBusquedasFormularioHobbyCliente();
		this.updateVisibilidadBusquedasFormularioHobbyCliente();
		this.updateHabilitarBusquedasFormularioHobbyCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioHobbyCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHobbyCliente.getComponents().length>0) {
	

		if(this.hobbyclienteConstantesFunciones.resaltarFK_IdClienteHobbyCliente!=null) {
			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdClienteHobbyCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
				jPanel.setBorder(this.hobbyclienteConstantesFunciones.resaltarFK_IdClienteHobbyCliente);
			}
		}

		if(this.hobbyclienteConstantesFunciones.resaltarFK_IdHobbyHobbyCliente!=null) {
			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdHobbyHobbyCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
				jPanel.setBorder(this.hobbyclienteConstantesFunciones.resaltarFK_IdHobbyHobbyCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHobbyCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHobbyCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdClienteHobbyCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.hobbyclienteConstantesFunciones.mostrarFK_IdClienteHobbyCliente);
			if(!this.hobbyclienteConstantesFunciones.mostrarFK_IdClienteHobbyCliente && index>-1) {
				this.jTabbedPaneBusquedasHobbyCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdHobbyHobbyCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.hobbyclienteConstantesFunciones.mostrarFK_IdHobbyHobbyCliente);
			if(!this.hobbyclienteConstantesFunciones.mostrarFK_IdHobbyHobbyCliente && index>-1) {
				this.jTabbedPaneBusquedasHobbyCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHobbyCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHobbyCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdClienteHobbyCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.hobbyclienteConstantesFunciones.activarFK_IdClienteHobbyCliente);
				this.jTabbedPaneBusquedasHobbyCliente.setEnabledAt(index,this.hobbyclienteConstantesFunciones.activarFK_IdClienteHobbyCliente);
			}

			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdHobbyHobbyCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.hobbyclienteConstantesFunciones.activarFK_IdHobbyHobbyCliente);
				this.jTabbedPaneBusquedasHobbyCliente.setEnabledAt(index,this.hobbyclienteConstantesFunciones.activarFK_IdHobbyHobbyCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHobbyCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdClienteHobbyCliente);

			this.jTabbedPaneBusquedasHobbyCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);

			this.hobbyclienteConstantesFunciones.setResaltarFK_IdClienteHobbyCliente(resaltar);

			jPanel.setBorder(this.hobbyclienteConstantesFunciones.resaltarFK_IdClienteHobbyCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdHobby")) {
			index= this.jTabbedPaneBusquedasHobbyCliente.indexOfComponent(this.jPanelFK_IdHobbyHobbyCliente);

			this.jTabbedPaneBusquedasHobbyCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobbyCliente.getComponent(index);

			this.hobbyclienteConstantesFunciones.setResaltarFK_IdHobbyHobbyCliente(resaltar);

			jPanel.setBorder(this.hobbyclienteConstantesFunciones.resaltarFK_IdHobbyHobbyCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHobbyCliente.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioHobbyCliente() throws Exception {

		if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHobbyCliente();
		this.updateVisibilidadResaltarControlesFormularioHobbyCliente();
		this.updateHabilitarResaltarControlesFormularioHobbyCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioHobbyCliente() throws Exception {
		if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.hobbyclienteConstantesFunciones.resaltaridHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente!=null) {this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setBorder(this.hobbyclienteConstantesFunciones.resaltaridHobbyCliente);}
		if(this.hobbyclienteConstantesFunciones.resaltarid_empresaHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente!=null) {this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setBorder(this.hobbyclienteConstantesFunciones.resaltarid_empresaHobbyCliente);}
		if(this.hobbyclienteConstantesFunciones.resaltarid_clienteHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente!=null) {this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setBorder(this.hobbyclienteConstantesFunciones.resaltarid_clienteHobbyCliente);}
		if(this.hobbyclienteConstantesFunciones.resaltarid_hobbyHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente!=null) {this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setBorder(this.hobbyclienteConstantesFunciones.resaltarid_hobbyHobbyCliente);}
		if(this.hobbyclienteConstantesFunciones.resaltardescripcionHobbyCliente!=null && this.jInternalFrameDetalleFormHobbyCliente!=null) {this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setBorder(this.hobbyclienteConstantesFunciones.resaltardescripcionHobbyCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHobbyCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
	
		//this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostraridHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jPanelidHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostraridHobbyCliente);
		//this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_empresaHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jPanelid_empresaHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_empresaHobbyCliente);
		//this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_clienteHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jPanelid_clienteHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_clienteHobbyCliente);
			this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_clienteHobbyCliente);
		//this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_hobbyHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jPanelid_hobbyHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrarid_hobbyHobbyCliente);
		//this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrardescripcionHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jPaneldescripcionHobbyCliente.setVisible(this.hobbyclienteConstantesFunciones.mostrardescripcionHobbyCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHobbyCliente() throws Exception {
		if(this.jInternalFrameDetalleFormHobbyCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHobbyCliente!=null) {
	
		this.jInternalFrameDetalleFormHobbyCliente.jLabelidHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activaridHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_empresaHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activarid_empresaHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_clienteHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activarid_clienteHobbyCliente);
			this.jInternalFrameDetalleFormHobbyCliente.jButtonid_clienteHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activarid_clienteHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jComboBoxid_hobbyHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activarid_hobbyHobbyCliente);
		this.jInternalFrameDetalleFormHobbyCliente.jTextAreadescripcionHobbyCliente.setEnabled(this.hobbyclienteConstantesFunciones.activardescripcionHobbyCliente);
		}
	}
	
		
}
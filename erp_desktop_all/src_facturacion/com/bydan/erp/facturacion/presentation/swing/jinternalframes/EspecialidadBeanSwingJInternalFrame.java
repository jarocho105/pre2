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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.EspecialidadConstantesFunciones;
import com.bydan.erp.facturacion.util.EspecialidadParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EspecialidadParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EspecialidadBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EspecialidadBeanSwingJInternalFrame extends EspecialidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EspecialidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Especialidad> especialidadValidator = new ClassValidator<Especialidad>(Especialidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Especialidad especialidad;	
	public Especialidad especialidadAux;
	public Especialidad especialidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Especialidad especialidadTotales;
	public Long idEspecialidadActual;
	public Long iIdNuevoEspecialidad=0L;
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
	
	public Boolean isPermisoTodoEspecialidad;
	public Boolean isPermisoNuevoEspecialidad;
	public Boolean isPermisoActualizarEspecialidad;
	public Boolean isPermisoActualizarOriginalEspecialidad;
	public Boolean isPermisoEliminarEspecialidad;
	public Boolean isPermisoGuardarCambiosEspecialidad;
	public Boolean isPermisoConsultaEspecialidad;
	public Boolean isPermisoBusquedaEspecialidad;
	public Boolean isPermisoReporteEspecialidad;
	public Boolean isPermisoPaginacionMedioEspecialidad;
	public Boolean isPermisoPaginacionAltoEspecialidad;
	public Boolean isPermisoPaginacionTodoEspecialidad;
	public Boolean isPermisoCopiarEspecialidad;
	public Boolean isPermisoVerFormEspecialidad;
	public Boolean isPermisoDuplicarEspecialidad;
	public Boolean isPermisoOrdenEspecialidad;
	
	
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
	
	public EspecialidadParameterReturnGeneral especialidadReturnGeneral;
	public EspecialidadParameterReturnGeneral especialidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEspecialidad=false;
	public Boolean esParaAccionDesdeFormularioEspecialidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EspecialidadSessionBeanAdditional especialidadSessionBeanAdditional=null;
	
	public EspecialidadSessionBeanAdditional getEspecialidadSessionBeanAdditional() {
		return this.especialidadSessionBeanAdditional;
	}
	
	public void setEspecialidadSessionBeanAdditional(EspecialidadSessionBeanAdditional especialidadSessionBeanAdditional) {
		try {
			this.especialidadSessionBeanAdditional=especialidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EspecialidadBeanSwingJInternalFrameAdditional especialidadBeanSwingJInternalFrameAdditional=null;
	//public class EspecialidadBeanSwingJInternalFrame
	
	public EspecialidadBeanSwingJInternalFrameAdditional getEspecialidadBeanSwingJInternalFrameAdditional() {
		return this.especialidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setEspecialidadBeanSwingJInternalFrameAdditional(EspecialidadBeanSwingJInternalFrameAdditional especialidadBeanSwingJInternalFrameAdditional) {
		try {
			this.especialidadBeanSwingJInternalFrameAdditional=especialidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EspecialidadLogic especialidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Especialidad especialidadBean;
	public EspecialidadConstantesFunciones especialidadConstantesFunciones;
	//public EspecialidadParameterReturnGeneral especialidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Especialidad> especialidads;	
	//public List<Especialidad> especialidadsEliminados;
	//public List<Especialidad> especialidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEspecialidad=false;
	public Boolean isVisibilidadCeldaDuplicarEspecialidad=true;
	public Boolean isVisibilidadCeldaCopiarEspecialidad=true;
	public Boolean isVisibilidadCeldaVerFormEspecialidad=true;
	public Boolean isVisibilidadCeldaOrdenEspecialidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
	public Boolean isVisibilidadCeldaModificarEspecialidad=false;
	public Boolean isVisibilidadCeldaActualizarEspecialidad=false;
	public Boolean isVisibilidadCeldaEliminarEspecialidad=false;
	public Boolean isVisibilidadCeldaCancelarEspecialidad=false;
	public Boolean isVisibilidadCeldaGuardarEspecialidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEspecialidad=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEspecialidad() {
		return this.iIdNuevoEspecialidad;
	}

	public void setiIdNuevoEspecialidad(Long iIdNuevoEspecialidad) {
		this.iIdNuevoEspecialidad = iIdNuevoEspecialidad;
	}
	
	public Long getidEspecialidadActual() {
		return this.idEspecialidadActual;
	}

	public void setidEspecialidadActual(Long idEspecialidadActual) {
		this.idEspecialidadActual = idEspecialidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Especialidad getespecialidad() {
		return this.especialidad;
	}

	public void setespecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	public Especialidad getespecialidadAux() {
		return this.especialidadAux;
	}

	public void setespecialidadAux(Especialidad especialidadAux) {
		this.especialidadAux = especialidadAux;
	}				
	
	public Especialidad getespecialidadAnterior() {
		return this.especialidadAnterior;
	}

	public void setespecialidadAnterior(Especialidad especialidadAnterior) {
		this.especialidadAnterior = especialidadAnterior;
	}	
	
	public Especialidad getespecialidadTotales() {
		return this.especialidadTotales;
	}

	public void setespecialidadTotales(Especialidad especialidadTotales) {
		this.especialidadTotales = especialidadTotales;
	}	
	
	public Especialidad getespecialidadBean() {
		return this.especialidadBean;
	}

	public void setespecialidadBean(Especialidad especialidadBean) {
		this.especialidadBean = especialidadBean;
	}	
	
	public EspecialidadParameterReturnGeneral getespecialidadReturnGeneral() {
		return this.especialidadReturnGeneral;
	}

	public void setespecialidadReturnGeneral(EspecialidadParameterReturnGeneral especialidadReturnGeneral) {
		this.especialidadReturnGeneral = especialidadReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EspecialidadLogic getEspecialidadLogic()	{		
		return especialidadLogic;
	}

	public void setEspecialidadLogic(EspecialidadLogic especialidadLogic) {
		this.especialidadLogic = especialidadLogic;
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
	
	public Boolean getIsEsNuevoEspecialidad() {
		return isEsNuevoEspecialidad;
	}

	public void setIsEsNuevoEspecialidad(Boolean isEsNuevoEspecialidad) {
		this.isEsNuevoEspecialidad = isEsNuevoEspecialidad;
	}

	public Boolean getEsParaAccionDesdeFormularioEspecialidad() {
		return esParaAccionDesdeFormularioEspecialidad;
	}
	
	public void setEsParaAccionDesdeFormularioEspecialidad(Boolean esParaAccionDesdeFormularioEspecialidad) {
		this.esParaAccionDesdeFormularioEspecialidad = esParaAccionDesdeFormularioEspecialidad;
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

			if(this.especialidadSessionBean==null) {
				this.especialidadSessionBean=new EspecialidadSessionBean();
			}

			if(!this.especialidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(especialidadSessionBean.getlidEmpresaActual());
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

					if(this.especialidad!=null) {
						this.especialidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEspecialidad!=null) {
						this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEspecialidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEspecialidad!=null) {
						if(this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEspecialidadGenerico)throws Exception
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
				jComboBoxid_empresaEspecialidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEspecialidadGenerico!=null && jComboBoxid_empresaEspecialidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaEspecialidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Especialidad especialidad,JComboBox jComboBoxid_empresaEspecialidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEspecialidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEspecialidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				especialidad.setid_empresa(empresaAux.getId());
				especialidad.setempresa_descripcion(EspecialidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				especialidad.setEmpresa(empresaAux);			}
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

					if(!EspecialidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEspecialidad!=null) { 
							this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEspecialidad!=null) { 
					}

					if(!EspecialidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEspecialidad!=null) {
							this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEspecialidad!=null) {
							this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEspecialidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EspecialidadConstantesFunciones.refrescarForeignKeysDescripcionesEspecialidad(this.especialidadLogic.getEspecialidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EspecialidadConstantesFunciones.refrescarForeignKeysDescripcionesEspecialidad(this.especialidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//especialidadLogic.setEspecialidads(this.especialidads);
			especialidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EspecialidadParameterReturnGeneral getEspecialidadParameterGeneral() {
		return this.especialidadParameterGeneral;
	}
	
	public void setEspecialidadParameterGeneral(EspecialidadParameterReturnGeneral especialidadParameterGeneral) {
		this.especialidadParameterGeneral = especialidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEspecialidad() {
		return isPermisoTodoEspecialidad;
	}

	public void setIsPermisoTodoEspecialidad(Boolean isPermisoTodoEspecialidad) {
		this.isPermisoTodoEspecialidad = isPermisoTodoEspecialidad;
	}

	public Boolean getIsPermisoNuevoEspecialidad() {
		return isPermisoNuevoEspecialidad;
	}

	public void setIsPermisoNuevoEspecialidad(Boolean isPermisoNuevoEspecialidad) {
		this.isPermisoNuevoEspecialidad = isPermisoNuevoEspecialidad;
	}

	public Boolean getIsPermisoActualizarEspecialidad() {
		return isPermisoActualizarEspecialidad;
	}

	public void setIsPermisoActualizarEspecialidad(Boolean isPermisoActualizarEspecialidad) {
		this.isPermisoActualizarEspecialidad = isPermisoActualizarEspecialidad;
	}

	public Boolean getIsPermisoEliminarEspecialidad() {
		return isPermisoEliminarEspecialidad;
	}

	public void setIsPermisoEliminarEspecialidad(Boolean isPermisoEliminarEspecialidad) {
		this.isPermisoEliminarEspecialidad = isPermisoEliminarEspecialidad;
	}

	public Boolean getIsPermisoGuardarCambiosEspecialidad() {
		return isPermisoGuardarCambiosEspecialidad;
	}

	public void setIsPermisoGuardarCambiosEspecialidad(Boolean isPermisoGuardarCambiosEspecialidad) {
		this.isPermisoGuardarCambiosEspecialidad = isPermisoGuardarCambiosEspecialidad;
	}
	
	public Boolean getIsPermisoConsultaEspecialidad() {
		return isPermisoConsultaEspecialidad;
	}

	public void setIsPermisoConsultaEspecialidad(Boolean isPermisoConsultaEspecialidad) {
		this.isPermisoConsultaEspecialidad = isPermisoConsultaEspecialidad;
	}

	public Boolean getIsPermisoBusquedaEspecialidad() {
		return isPermisoBusquedaEspecialidad;
	}

	public void setIsPermisoBusquedaEspecialidad(Boolean isPermisoBusquedaEspecialidad) {
		this.isPermisoBusquedaEspecialidad = isPermisoBusquedaEspecialidad;
	}

	public Boolean getIsPermisoReporteEspecialidad() {
		return isPermisoReporteEspecialidad;
	}

	public void setIsPermisoReporteEspecialidad(Boolean isPermisoReporteEspecialidad) {
		this.isPermisoReporteEspecialidad = isPermisoReporteEspecialidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioEspecialidad() {
		return isPermisoPaginacionMedioEspecialidad;
	}

	public void setIsPermisoPaginacionMedioEspecialidad(Boolean isPermisoPaginacionMedioEspecialidad) {
		this.isPermisoPaginacionMedioEspecialidad = isPermisoPaginacionMedioEspecialidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoEspecialidad() {
		return isPermisoPaginacionTodoEspecialidad;
	}

	public void setIsPermisoPaginacionTodoEspecialidad(Boolean isPermisoPaginacionTodoEspecialidad) {
		this.isPermisoPaginacionTodoEspecialidad = isPermisoPaginacionTodoEspecialidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoEspecialidad() {
		return isPermisoPaginacionAltoEspecialidad;
	}

	public void setIsPermisoPaginacionAltoEspecialidad(Boolean isPermisoPaginacionAltoEspecialidad) {
		this.isPermisoPaginacionAltoEspecialidad = isPermisoPaginacionAltoEspecialidad;
	}
	
	public Boolean getIsPermisoCopiarEspecialidad() {
		return isPermisoCopiarEspecialidad;
	}

	public void setIsPermisoCopiarEspecialidad(Boolean isPermisoCopiarEspecialidad) {
		this.isPermisoCopiarEspecialidad = isPermisoCopiarEspecialidad;
	}
	
	public Boolean getIsPermisoVerFormEspecialidad() {
		return isPermisoVerFormEspecialidad;
	}

	public void setIsPermisoVerFormEspecialidad(Boolean isPermisoVerFormEspecialidad) {
		this.isPermisoVerFormEspecialidad = isPermisoVerFormEspecialidad;
	}
	
	public Boolean getIsPermisoDuplicarEspecialidad() {
		return isPermisoDuplicarEspecialidad;
	}

	public void setIsPermisoDuplicarEspecialidad(Boolean isPermisoDuplicarEspecialidad) {
		this.isPermisoDuplicarEspecialidad = isPermisoDuplicarEspecialidad;
	}
	
	public Boolean getIsPermisoOrdenEspecialidad() {
		return isPermisoOrdenEspecialidad;
	}

	public void setIsPermisoOrdenEspecialidad(Boolean isPermisoOrdenEspecialidad) {
		this.isPermisoOrdenEspecialidad = isPermisoOrdenEspecialidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEspecialidad() {
		return isVisibilidadCeldaNuevoEspecialidad;
	}

	public void setIsVisibilidadCeldaNuevoEspecialidad(Boolean isVisibilidadCeldaNuevoEspecialidad) {
		this.isVisibilidadCeldaNuevoEspecialidad = isVisibilidadCeldaNuevoEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEspecialidad() {
		return isVisibilidadCeldaDuplicarEspecialidad;
	}

	public void setIsVisibilidadCeldaDuplicarEspecialidad(Boolean isVisibilidadCeldaDuplicarEspecialidad) {
		this.isVisibilidadCeldaDuplicarEspecialidad = isVisibilidadCeldaDuplicarEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEspecialidad() {
		return isVisibilidadCeldaCopiarEspecialidad;
	}

	public void setIsVisibilidadCeldaCopiarEspecialidad(Boolean isVisibilidadCeldaCopiarEspecialidad) {
		this.isVisibilidadCeldaCopiarEspecialidad = isVisibilidadCeldaCopiarEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEspecialidad() {
		return isVisibilidadCeldaVerFormEspecialidad;
	}

	public void setIsVisibilidadCeldaVerFormEspecialidad(Boolean isVisibilidadCeldaVerFormEspecialidad) {
		this.isVisibilidadCeldaVerFormEspecialidad = isVisibilidadCeldaVerFormEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEspecialidad() {
		return isVisibilidadCeldaOrdenEspecialidad;
	}

	public void setIsVisibilidadCeldaOrdenEspecialidad(Boolean isVisibilidadCeldaOrdenEspecialidad) {
		this.isVisibilidadCeldaOrdenEspecialidad = isVisibilidadCeldaOrdenEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEspecialidad() {
		return isVisibilidadCeldaNuevoRelacionesEspecialidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEspecialidad(Boolean isVisibilidadCeldaNuevoRelacionesEspecialidad) {
		this.isVisibilidadCeldaNuevoRelacionesEspecialidad = isVisibilidadCeldaNuevoRelacionesEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEspecialidad() {
		return isVisibilidadCeldaModificarEspecialidad;
	}

	public void setIsVisibilidadCeldaModificarEspecialidad(Boolean isVisibilidadCeldaModificarEspecialidad) {
		this.isVisibilidadCeldaModificarEspecialidad = isVisibilidadCeldaModificarEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEspecialidad() {
		return isVisibilidadCeldaActualizarEspecialidad;
	}

	public void setIsVisibilidadCeldaActualizarEspecialidad(Boolean isVisibilidadCeldaActualizarEspecialidad) {
		this.isVisibilidadCeldaActualizarEspecialidad = isVisibilidadCeldaActualizarEspecialidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarEspecialidad() {
		return isVisibilidadCeldaEliminarEspecialidad;
	}

	public void setIsVisibilidadCeldaEliminarEspecialidad(Boolean isVisibilidadCeldaEliminarEspecialidad) {
		this.isVisibilidadCeldaEliminarEspecialidad = isVisibilidadCeldaEliminarEspecialidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarEspecialidad() {
		return isVisibilidadCeldaCancelarEspecialidad;
	}

	public void setIsVisibilidadCeldaCancelarEspecialidad(Boolean isVisibilidadCeldaCancelarEspecialidad) {
		this.isVisibilidadCeldaCancelarEspecialidad = isVisibilidadCeldaCancelarEspecialidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarEspecialidad() {
		return isVisibilidadCeldaGuardarEspecialidad;
	}

	public void setIsVisibilidadCeldaGuardarEspecialidad(Boolean isVisibilidadCeldaGuardarEspecialidad) {
		this.isVisibilidadCeldaGuardarEspecialidad = isVisibilidadCeldaGuardarEspecialidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEspecialidad() {
		return isVisibilidadCeldaGuardarCambiosEspecialidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEspecialidad(Boolean isVisibilidadCeldaGuardarCambiosEspecialidad) {
		this.isVisibilidadCeldaGuardarCambiosEspecialidad = isVisibilidadCeldaGuardarCambiosEspecialidad;
	}
		
	public EspecialidadSessionBean getespecialidadSessionBean() {
		return this.especialidadSessionBean;
	}
	
	public void setespecialidadSessionBean(EspecialidadSessionBean especialidadSessionBean) {
		this.especialidadSessionBean=especialidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEspecialidad(Especialidad especialidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(especialidad,null);
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
	
	public void bugActualizarReferenciaActual(Especialidad especialidad,Especialidad especialidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEspecialidad(especialidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		especialidadAux.setId(especialidad.getId());
		especialidadAux.setVersionRow(especialidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEspecialidad();
		
			int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = especialidadValidator.getInvalidValues(this.especialidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			especialidadLogic.setDatosCliente(datosCliente);
			especialidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				especialidadAux=new  Especialidad();
				
				especialidadAux.setIsNew(true);
				especialidadAux.setIsChanged(true);
				
				especialidadAux.setEspecialidadOriginal(this.especialidad);
				
				especialidadAux.setId(this.especialidad.getId());	
				especialidadAux.setVersionRow(this.especialidad.getVersionRow());	
				especialidadAux.setid_empresa(this.especialidad.getid_empresa());	
				especialidadAux.setcodigo(this.especialidad.getcodigo());	
				especialidadAux.setnombre(this.especialidad.getnombre());	
				especialidadAux.setdescripcion(this.especialidad.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.especialidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(especialidadAux,especialidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.especialidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.saveEspecialidads();//WithConnection
						//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);
					
					this.refrescarForeignKeysDescripcionesEspecialidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								especialidadLogic.saveEspecialidadRelaciones(especialidadAux);//WithConnection
								//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.especialidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(especialidadAux,especialidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				especialidadAux=new  Especialidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.especialidadSessionBean.getEsGuardarRelacionado() 
					|| (this.especialidadSessionBean.getEsGuardarRelacionado() && this.especialidad.getId()>=0)) {
						
					especialidadAux.setIsNew(false);
				}
				
				especialidadAux.setIsDeleted(false);
			
				especialidadAux.setId(this.especialidad.getId());	
				especialidadAux.setVersionRow(this.especialidad.getVersionRow());	
				especialidadAux.setid_empresa(this.especialidad.getid_empresa());	
				especialidadAux.setcodigo(this.especialidad.getcodigo());	
				especialidadAux.setnombre(this.especialidad.getnombre());	
				especialidadAux.setdescripcion(this.especialidad.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(especialidadAux,especialidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.especialidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.saveEspecialidads();//WithConnection
						//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);
					
					this.refrescarForeignKeysDescripcionesEspecialidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								especialidadLogic.saveEspecialidadRelaciones(especialidadAux);//WithConnection
								//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.especialidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(especialidadAux,especialidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.especialidad,especialidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				especialidadAux=new  Especialidad();
				
				especialidadAux.setIsNew(false);
				especialidadAux.setIsChanged(false);
				
				especialidadAux.setIsDeleted(true);
				
				especialidadAux.setId(this.especialidad.getId());	
				especialidadAux.setVersionRow(this.especialidad.getVersionRow());	
				especialidadAux.setid_empresa(this.especialidad.getid_empresa());	
				especialidadAux.setcodigo(this.especialidad.getcodigo());	
				especialidadAux.setnombre(this.especialidad.getnombre());	
				especialidadAux.setdescripcion(this.especialidad.getdescripcion());	
				
				if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.especialidadAux.getId()>=0) {	
						this.especialidadsEliminados.add(especialidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(especialidadAux,especialidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.especialidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.saveEspecialidads();//WithConnection
						//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								especialidadLogic.saveEspecialidadRelaciones(especialidadAux);//WithConnection
								//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
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
							if(this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.especialidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(especialidadAux,especialidadLogic.getEspecialidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(especialidadAux,especialidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getEspecialidads().addAll(this.especialidadsEliminados);
					
					especialidadLogic.saveEspecialidads();//WithConnection
					//especialidadLogic.getSetVersionRowEspecialidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEspecialidad();
				
				this.especialidadsEliminados= new ArrayList<Especialidad>();		
			}
			
			if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Especialidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.especialidad=especialidadAux;
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
      		//this.finishProcessEspecialidad();
      	}
		
	}	
	
	public void actualizarRelaciones(Especialidad especialidadLocal) throws Exception {
		
		if(this.especialidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Especialidad especialidadLocal) throws Exception {	
		if(this.especialidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				especialidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEspecialidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = especialidadValidator.getInvalidValues(this.especialidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Especialidad especialidad,List<Especialidad> especialidads) throws Exception {
		try	{		
			EspecialidadConstantesFunciones.actualizarLista(especialidad,especialidads,this.especialidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Especialidad especialidad,List<Especialidad> especialidads) throws Exception {
		try	{			
			EspecialidadConstantesFunciones.actualizarSelectedLista(especialidad,especialidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Especialidad> especialidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				especialidadsLocal=this.especialidadLogic.getEspecialidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				especialidadsLocal=this.especialidads;
			}
			//ARCHITECTURE
		
			for(Especialidad especialidadLocal:especialidadsLocal) {
				if(this.permiteMantenimiento(especialidadLocal) && especialidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EspecialidadConstantesFunciones.getEspecialidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EspecialidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelid_empresaEspecialidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EspecialidadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelcodigoEspecialidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EspecialidadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelnombreEspecialidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EspecialidadConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabeldescripcionEspecialidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEspecialidad.jLabelid_empresaEspecialidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEspecialidad.jLabelcodigoEspecialidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEspecialidad.jLabelnombreEspecialidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEspecialidad.jLabeldescripcionEspecialidad,"");
		
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
		this.iIdNuevoEspecialidad--;	
		
		
		this.especialidadAux=new Especialidad();
		
		this.especialidadAux.setId(this.iIdNuevoEspecialidad);
		this.especialidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.especialidadLogic.getEspecialidads().add(this.especialidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.especialidads.add(this.especialidadAux);
		}
		//ARCHITECTURE
		
		this.especialidad=this.especialidadAux;
		
		if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEspecialidad(this.especialidad);
			this.setVariablesObjetoActualToFormularioForeignKeyEspecialidad(this.especialidad);
		}
				
		//this.setDefaultControlesEspecialidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEspecialidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEspecialidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEspecialidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEspecialidad(this.especialidadBean,this.especialidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EspecialidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.especialidadSessionBean.getConGuardarRelaciones()) {
			classes=EspecialidadConstantesFunciones.getClassesRelationshipsOfEspecialidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.especialidadReturnGeneral=especialidadLogic.procesarEventosEspecialidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.especialidadLogic.getEspecialidads(),this.especialidad,this.especialidadParameterGeneral,this.isEsNuevoEspecialidad,classes);//this.especialidadLogic.getEspecialidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEspecialidad(this.especialidadReturnGeneral,this.especialidadBean,false);
		
		if(this.especialidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEspecialidad(this.especialidadReturnGeneral.getEspecialidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEspecialidad(this.especialidadReturnGeneral.getEspecialidad());
		}
		
		if(this.especialidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEspecialidad(this.especialidadReturnGeneral.getEspecialidad(),classes);//this.especialidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEspecialidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEspecialidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EspecialidadBeanSwingJInternalFrameAdditional.RecargarFormEspecialidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEspecialidad(false);
						
			if(especialidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEspecialidad();
			}
			
			this.actualizarVisualTableDatosEspecialidad();
			
			this.jTableDatosEspecialidad.setRowSelectionInterval(this.getIndiceNuevoEspecialidad(), this.getIndiceNuevoEspecialidad());
			
			this.seleccionarFilaTablaEspecialidadActual();
						
			this.actualizarEstadoCeldasBotonesEspecialidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEspecialidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setEnabled(isHabilitar && this.especialidadConstantesFunciones.activarcodigoEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setEnabled(isHabilitar && this.especialidadConstantesFunciones.activarnombreEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setEnabled(isHabilitar && this.especialidadConstantesFunciones.activardescripcionEspecialidad);	
		//
		this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setEnabled(isHabilitar && this.especialidadConstantesFunciones.activarid_empresaEspecialidad);
	};
	
	public void setDefaultControlesEspecialidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEspecialidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.especialidadSessionBean.setConGuardarRelaciones(true);			
			this.especialidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.setVisible(true);
			
					
		} else {
			//this.especialidadSessionBean.setConGuardarRelaciones(false);			
			this.especialidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEspecialidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
				if(especialidadAux.getId().equals(this.iIdNuevoEspecialidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Especialidad especialidadAux:this.especialidads) {
				if(especialidadAux.getId().equals(this.iIdNuevoEspecialidad)) {
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
	
	public int getIndiceActualEspecialidad(Especialidad especialidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
				if(especialidadAux.getId().equals(especialidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Especialidad especialidadAux:this.especialidads) {
				if(especialidadAux.getId().equals(especialidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEspecialidad(Especialidad especialidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
				if(especialidadAux.getEspecialidadOriginal().getId().equals(especialidadOriginal.getId())) {
					existe=true;
					especialidadOriginal.setId(especialidadAux.getId());
					especialidadOriginal.setVersionRow(especialidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Especialidad especialidadAux:this.especialidads) {
				if(especialidadAux.getEspecialidadOriginal().getId().equals(especialidadOriginal.getId())) {
					existe=true;
					especialidadOriginal.setId(especialidadAux.getId());
					especialidadOriginal.setVersionRow(especialidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEspecialidad(Boolean esParaCancelar) throws Exception {
		especialidadsAux=new ArrayList<Especialidad>();
		especialidadAux=new Especialidad();
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
					if(especialidadAux.getId()<0) {
						especialidadsAux.add(especialidadAux);
					}		
				}
				this.iIdNuevoEspecialidad=0L;
				this.especialidadLogic.getEspecialidads().removeAll(especialidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Especialidad especialidadAux:this.especialidads) {
					if(especialidadAux.getId()<0) {
						especialidadsAux.add(especialidadAux);
					}		
				}
				this.iIdNuevoEspecialidad=0L;
				this.especialidads.removeAll(especialidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEspecialidad 
					&& this.especialidadLogic.getEspecialidads().size()>0
					) {
					especialidadAux=this.especialidadLogic.getEspecialidads().get(this.especialidadLogic.getEspecialidads().size() - 1);
				
					if(especialidadAux.getId()<0) {
						this.especialidadLogic.getEspecialidads().remove(especialidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEspecialidad && this.especialidads.size()>0) {
					especialidadAux=this.especialidads.get(this.especialidads.size() - 1);
				
					if(especialidadAux.getId()<0) {
						this.especialidads.remove(especialidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEspecialidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(especialidad.getId()<0) {
				this.especialidadLogic.getEspecialidads().remove(this.especialidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(especialidad.getId()<0) {
				this.especialidads.remove(this.especialidad);
			}
		}			
	}
	
	public void setEstadosInicialesEspecialidad(List<Especialidad> especialidadsAux) throws Exception {
		EspecialidadConstantesFunciones.setEstadosInicialesEspecialidad(especialidadsAux);
	}
	
	public void setEstadosInicialesEspecialidad(Especialidad especialidadAux) throws Exception {
		EspecialidadConstantesFunciones.setEstadosInicialesEspecialidad(especialidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEspecialidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEspecialidadActual()) {
				if(!this.isEsNuevoEspecialidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEspecialidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEspecialidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Especialidad ?", "MANTENIMIENTO DE Especialidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Especialidad especialidad) throws Exception {
		EspecialidadConstantesFunciones.seleccionarAsignar(this.especialidad,especialidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEspecialidad=this.isPermisoActualizarOriginalEspecialidad;
			
			
			this.seleccionarAsignar(especialidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EspecialidadConstantesFunciones.quitarEspaciosEspecialidad(this.especialidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEspecialidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.especialidadSessionBean.setsFuncionBusquedaRapida(this.especialidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEspecialidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEspecialidad(esParaCancelar);				
				this.cancelarNuevoEspecialidad(esParaCancelar);								
			}
			
			this.especialidad=new Especialidad();
			
			this.inicializarEspecialidad();
			
			this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEspecialidad() throws Exception {
		try {
			EspecialidadConstantesFunciones.inicializarEspecialidad(this.especialidad);
			
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
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.especialidadLogic.getEspecialidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEspecialidads(String sAccionBusqueda,List<Especialidad> especialidadsParaReportes) throws Exception {
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
					sPathReporteFinal="Especialidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EspecialidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EspecialidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Especialidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Especialidads");		
		parameters.put("busquedapor", EspecialidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEspecialidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EspecialidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EspecialidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEspecialidad=new JRBeanArrayDataSource(EspecialidadJInternalFrame.TraerEspecialidadBeans(especialidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEspecialidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EspecialidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EspecialidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EspecialidadBean.TraerEspecialidadBeans(especialidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEspecialidadActionPerformed(null);
					//this.generarExcelReporteEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEspecialidads(sAccionBusqueda,sTipoArchivoReporte,especialidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEspecialidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Especialidad> especialidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Especialidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEspecialidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Especialidad especialidad : especialidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EspecialidadConstantesFunciones.generarExcelReporteDataEspecialidad("NORMAL",row,workbook,especialidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEspecialidad(String sTipo,Row row,Workbook workbook) {
		
		EspecialidadConstantesFunciones.generarExcelReporteHeaderEspecialidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEspecialidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Especialidad> especialidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Especialidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Especialidad especialidad : especialidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EspecialidadConstantesFunciones.getEspecialidadDescripcion(especialidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EspecialidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EspecialidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(especialidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EspecialidadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EspecialidadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(especialidad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EspecialidadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EspecialidadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(especialidad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EspecialidadConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EspecialidadConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(especialidad.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEspecialidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Especialidad> especialidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Especialidad> especialidadsRespaldo=null;
		
		classes=EspecialidadConstantesFunciones.getClassesRelationshipsOfEspecialidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.especialidadLogic.setDatosCliente(this.datosCliente);
		this.especialidadLogic.setDatosDeep(this.datosDeep);
		this.especialidadLogic.setIsConDeep(true);
		
		especialidadsRespaldo=this.especialidadLogic.getEspecialidads();
		
		this.especialidadLogic.setEspecialidads(especialidadsParaReportes);	
		this.especialidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		especialidadsParaReportes=this.especialidadLogic.getEspecialidads();
		this.especialidadLogic.setEspecialidads(especialidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Especialidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEspecialidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Especialidad especialidad : especialidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEspecialidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EspecialidadConstantesFunciones.generarExcelReporteDataEspecialidad("NORMAL",row,workbook,especialidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EspecialidadConstantesFunciones.getEspecialidadDescripcion(especialidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEspecialidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEspecialidad() throws Exception {		
		this.startProcessEspecialidad(true);
	}
	
	public void startProcessEspecialidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEspecialidad ,this.jPanelParametrosReportesEspecialidad, this.jScrollPanelDatosEspecialidad,this.jPanelPaginacionEspecialidad, this.jScrollPanelDatosEdicionEspecialidad, this.jPanelAccionesEspecialidad,this.jPanelAccionesFormularioEspecialidad,this.jmenuBarEspecialidad,this.jmenuBarDetalleEspecialidad,this.jTtoolBarEspecialidad,this.jTtoolBarDetalleEspecialidad);		
		
		final JTabbedPane jTabbedPaneBusquedasEspecialidad=this.jTabbedPaneBusquedasEspecialidad; 
		
		final JPanel jPanelParametrosReportesEspecialidad=this.jPanelParametrosReportesEspecialidad;
		//final JScrollPane jScrollPanelDatosEspecialidad=this.jScrollPanelDatosEspecialidad;
		final JTable jTableDatosEspecialidad=this.jTableDatosEspecialidad;		
		final JPanel jPanelPaginacionEspecialidad=this.jPanelPaginacionEspecialidad;
		//final JScrollPane jScrollPanelDatosEdicionEspecialidad=this.jScrollPanelDatosEdicionEspecialidad;
		final JPanel jPanelAccionesEspecialidad=this.jPanelAccionesEspecialidad;
		
		JPanel jPanelCamposAuxiliarEspecialidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEspecialidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			jPanelCamposAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jPanelCamposEspecialidad;
			jPanelAccionesFormularioAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jPanelAccionesFormularioEspecialidad;
		}
		
		final JPanel jPanelCamposEspecialidad=jPanelCamposAuxiliarEspecialidad;
		final JPanel jPanelAccionesFormularioEspecialidad=jPanelAccionesFormularioAuxiliarEspecialidad;
		
		
		final JMenuBar jmenuBarEspecialidad=this.jmenuBarEspecialidad;
		final JToolBar jTtoolBarEspecialidad=this.jTtoolBarEspecialidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEspecialidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEspecialidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			jmenuBarDetalleAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jmenuBarDetalleEspecialidad;
			jTtoolBarDetalleAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jTtoolBarDetalleEspecialidad;
		}
		
		final JMenuBar jmenuBarDetalleEspecialidad=jmenuBarDetalleAuxiliarEspecialidad;
		final JToolBar jTtoolBarDetalleEspecialidad=jTtoolBarDetalleAuxiliarEspecialidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEspecialidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEspecialidad;
			processRunnable.jTableDatos=jTableDatosEspecialidad;
			processRunnable.jPanelCampos=jPanelCamposEspecialidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionEspecialidad;
			processRunnable.jPanelAcciones=jPanelAccionesEspecialidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEspecialidad;
			
			
			processRunnable.jmenuBar=jmenuBarEspecialidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEspecialidad;
			processRunnable.jTtoolBar=jTtoolBarEspecialidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEspecialidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEspecialidad ,jPanelParametrosReportesEspecialidad,jTableDatosEspecialidad, /*jScrollPanelDatosEspecialidad,*/jPanelCamposEspecialidad,jPanelPaginacionEspecialidad, /*jScrollPanelDatosEdicionEspecialidad,*/ jPanelAccionesEspecialidad,jPanelAccionesFormularioEspecialidad,jmenuBarEspecialidad,jmenuBarDetalleEspecialidad,jTtoolBarEspecialidad,jTtoolBarDetalleEspecialidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEspecialidad ,jPanelParametrosReportesEspecialidad, jScrollPanelDatosEspecialidad,jPanelPaginacionEspecialidad, jScrollPanelDatosEdicionEspecialidad, jPanelAccionesEspecialidad,jPanelAccionesFormularioEspecialidad,jmenuBarEspecialidad,jmenuBarDetalleEspecialidad,jTtoolBarEspecialidad,jTtoolBarDetalleEspecialidad);
						
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
	
	public void finishProcessEspecialidad() {// throws Exception 
		this.finishProcessEspecialidad(true);
	}
	
	public void finishProcessEspecialidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEspecialidad ,this.jPanelParametrosReportesEspecialidad, this.jScrollPanelDatosEspecialidad,this.jPanelPaginacionEspecialidad, this.jScrollPanelDatosEdicionEspecialidad, this.jPanelAccionesEspecialidad,this.jPanelAccionesFormularioEspecialidad,this.jmenuBarEspecialidad,this.jmenuBarDetalleEspecialidad,this.jTtoolBarEspecialidad,this.jTtoolBarDetalleEspecialidad);		
		
		final JTabbedPane jTabbedPaneBusquedasEspecialidad=this.jTabbedPaneBusquedasEspecialidad; 
		
		final JPanel jPanelParametrosReportesEspecialidad=this.jPanelParametrosReportesEspecialidad;
		//final JScrollPane jScrollPanelDatosEspecialidad=this.jScrollPanelDatosEspecialidad;
		final JTable jTableDatosEspecialidad=this.jTableDatosEspecialidad;		
		final JPanel jPanelPaginacionEspecialidad=this.jPanelPaginacionEspecialidad;
		//final JScrollPane jScrollPanelDatosEdicionEspecialidad=this.jScrollPanelDatosEdicionEspecialidad;
		final JPanel jPanelAccionesEspecialidad=this.jPanelAccionesEspecialidad;
		
		JPanel jPanelCamposAuxiliarEspecialidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEspecialidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			jPanelCamposAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jPanelCamposEspecialidad;
			jPanelAccionesFormularioAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jPanelAccionesFormularioEspecialidad;
		}
		
		final JPanel jPanelCamposEspecialidad=jPanelCamposAuxiliarEspecialidad;
		final JPanel jPanelAccionesFormularioEspecialidad=jPanelAccionesFormularioAuxiliarEspecialidad;
		
		
		final JMenuBar jmenuBarEspecialidad=this.jmenuBarEspecialidad;		
		final JToolBar jTtoolBarEspecialidad=this.jTtoolBarEspecialidad;
				
		JMenuBar jmenuBarDetalleAuxiliarEspecialidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEspecialidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			jmenuBarDetalleAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jmenuBarDetalleEspecialidad;
			jTtoolBarDetalleAuxiliarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jTtoolBarDetalleEspecialidad;		
		}
		
		final JMenuBar jmenuBarDetalleEspecialidad=jmenuBarDetalleAuxiliarEspecialidad;
		final JToolBar jTtoolBarDetalleEspecialidad=jTtoolBarDetalleAuxiliarEspecialidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEspecialidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEspecialidad;
			processRunnable.jTableDatos=jTableDatosEspecialidad;
			processRunnable.jPanelCampos=jPanelCamposEspecialidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionEspecialidad;
			processRunnable.jPanelAcciones=jPanelAccionesEspecialidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEspecialidad;
			
			
			processRunnable.jmenuBar=jmenuBarEspecialidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEspecialidad;
			processRunnable.jTtoolBar=jTtoolBarEspecialidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEspecialidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEspecialidad ,jPanelParametrosReportesEspecialidad, jTableDatosEspecialidad,/*jScrollPanelDatosEspecialidad,*/jPanelCamposEspecialidad,jPanelPaginacionEspecialidad, /*jScrollPanelDatosEdicionEspecialidad,*/ jPanelAccionesEspecialidad,jPanelAccionesFormularioEspecialidad,jmenuBarEspecialidad,jmenuBarDetalleEspecialidad,jTtoolBarEspecialidad,jTtoolBarDetalleEspecialidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEspecialidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEspecialidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEspecialidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEspecialidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEspecialidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEspecialidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEspecialidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEspecialidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEspecialidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.especialidadConstantesFunciones.getsFinalQueryEspecialidad();
		String  finalQueryPaginacionTodos=this.especialidadConstantesFunciones.getsFinalQueryEspecialidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EspecialidadConstantesFunciones.getArrayColumnasGlobalesNoEspecialidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EspecialidadConstantesFunciones.getArrayColumnasGlobalesEspecialidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EspecialidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.especialidadsEliminados= new ArrayList<Especialidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEspecialidad();
		
				///*EspecialidadSessionBean*/this.especialidadSessionBean=new EspecialidadSessionBean();
			
			if(this.especialidadSessionBean==null) {
				this.especialidadSessionBean=new EspecialidadSessionBean();
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
					this.iNumeroPaginacion=EspecialidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EspecialidadConstantesFunciones.getClassesForeignKeysOfEspecialidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/especialidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			especialidadsAux= new ArrayList<Especialidad>();
			
				
			especialidadLogic.setDatosCliente(this.datosCliente);
			especialidadLogic.setDatosDeep(this.datosDeep);
			especialidadLogic.setIsConDeep(true);
			
			
			especialidadLogic.getEspecialidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					especialidadLogic.getTodosEspecialidads(finalQueryGlobal,pagination);
					
					//especialidadLogic.getTodosEspecialidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(especialidadLogic.getEspecialidads()==null|| especialidadLogic.getEspecialidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							especialidadsAux= new ArrayList<Especialidad>();
							especialidadsAux.addAll(especialidadLogic.getEspecialidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidadsAux= new ArrayList<Especialidad>();
							especialidadsAux.addAll(especialidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							especialidadLogic.getTodosEspecialidads(finalQueryGlobal+"",this.pagination);												
							
							//especialidadLogic.getTodosEspecialidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEspecialidads("Todos",especialidadLogic.getEspecialidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							especialidadLogic.setEspecialidads(new ArrayList<Especialidad>());					
							especialidadLogic.getEspecialidads().addAll(especialidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidads=new ArrayList<Especialidad>();
							especialidads.addAll(especialidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEspecialidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEspecialidad=this.idActual;
				
				} else if(this.idEspecialidadActual!=null && this.idEspecialidadActual!=0L) {
					idEspecialidad=idEspecialidadActual;
				}
				
					
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndicePorId(idEspecialidad);
				
				this.especialidads=new ArrayList<Especialidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					especialidadLogic.getEntity(idEspecialidad);
					
					//especialidadLogic.getEntityWithConnection(idEspecialidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					especialidadLogic.setEspecialidads(new ArrayList<Especialidad>());
					especialidadLogic.getEspecialidads().add(especialidadLogic.getEspecialidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.especialidads=new ArrayList<Especialidad>();
					this.especialidads.add(especialidad);
				}
				
				if(especialidadLogic.getEspecialidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					especialidadLogic.getEspecialidadsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=especialidadLogic.getEspecialidads()==null||especialidadLogic.getEspecialidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=especialidads==null|| especialidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadsAux=new ArrayList<Especialidad>();
						especialidadsAux.addAll(especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidadsAux=new ArrayList<Especialidad>();
							especialidadsAux.addAll(especialidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							especialidadLogic.getEspecialidadsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEspecialidads("BusquedaPorCodigo",especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEspecialidads("BusquedaPorCodigo",especialidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.setEspecialidads(new ArrayList<Especialidad>());
						especialidadLogic.getEspecialidads().addAll(especialidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidads=new ArrayList<Especialidad>();
							especialidads.addAll(especialidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					especialidadLogic.getEspecialidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=especialidadLogic.getEspecialidads()==null||especialidadLogic.getEspecialidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=especialidads==null|| especialidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadsAux=new ArrayList<Especialidad>();
						especialidadsAux.addAll(especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidadsAux=new ArrayList<Especialidad>();
							especialidadsAux.addAll(especialidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							especialidadLogic.getEspecialidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEspecialidads("BusquedaPorNombre",especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEspecialidads("BusquedaPorNombre",especialidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.setEspecialidads(new ArrayList<Especialidad>());
						especialidadLogic.getEspecialidads().addAll(especialidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidads=new ArrayList<Especialidad>();
							especialidads.addAll(especialidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					especialidadLogic.getEspecialidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=especialidadLogic.getEspecialidads()==null||especialidadLogic.getEspecialidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=especialidads==null|| especialidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadsAux=new ArrayList<Especialidad>();
						especialidadsAux.addAll(especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidadsAux=new ArrayList<Especialidad>();
							especialidadsAux.addAll(especialidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							especialidadLogic.getEspecialidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EspecialidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEspecialidads("FK_IdEmpresa",especialidadLogic.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEspecialidads("FK_IdEmpresa",especialidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadLogic.setEspecialidads(new ArrayList<Especialidad>());
						especialidadLogic.getEspecialidads().addAll(especialidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidads=new ArrayList<Especialidad>();
							especialidads.addAll(especialidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEspecialidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEspecialidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=especialidadLogic.getEspecialidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=especialidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=especialidadLogic.getEspecialidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=especialidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Especialidad especialidad) {
		Boolean permite=true;
		
		if(this.especialidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EspecialidadConstantesFunciones.getOrderByListaEspecialidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EspecialidadConstantesFunciones.getOrderByListaEspecialidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Especialidad especialidad:especialidadLogic.getEspecialidads()) {
				if(especialidad.getsType().equals(Constantes2.S_TOTALES)) {
					especialidadTotales=especialidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Especialidad especialidad:this.especialidads) {
				if(especialidad.getsType().equals(Constantes2.S_TOTALES)) {
					especialidadTotales=especialidad;
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
			this.especialidadAux=new Especialidad();
			this.especialidadAux.setsType(Constantes2.S_TOTALES);
			this.especialidadAux.setIsNew(false);
			this.especialidadAux.setIsChanged(false);
			this.especialidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EspecialidadConstantesFunciones.TotalizarValoresFilaEspecialidad(this.especialidadLogic.getEspecialidads(),this.especialidadAux);
				
				this.especialidadLogic.getEspecialidads().add(this.especialidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EspecialidadConstantesFunciones.TotalizarValoresFilaEspecialidad(this.especialidads,this.especialidadAux);
				
				this.especialidads.add(this.especialidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		especialidadTotales=new Especialidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.especialidadLogic.getEspecialidads().remove(especialidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.especialidads.remove(especialidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		especialidadTotales=new Especialidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Especialidad especialidad:especialidadLogic.getEspecialidads()) {
				if(especialidad.getsType().equals(Constantes2.S_TOTALES)) {
					especialidadTotales=especialidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EspecialidadConstantesFunciones.TotalizarValoresFilaEspecialidad(this.especialidadLogic.getEspecialidads(),especialidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Especialidad especialidad:this.especialidads) {
				if(especialidad.getsType().equals(Constantes2.S_TOTALES)) {
					especialidadTotales=especialidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EspecialidadConstantesFunciones.TotalizarValoresFilaEspecialidad(this.especialidads,especialidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEspecialidadsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEspecialidadsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEspecialidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEspecialidadsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					especialidadLogic.getEspecialidadsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEspecialidadsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					especialidadLogic.getEspecialidadsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEspecialidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					especialidadLogic.getEspecialidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEspecialidad() {
		this.isPermisoTodoEspecialidad=false;
		this.isPermisoNuevoEspecialidad=false;
		this.isPermisoActualizarEspecialidad=false;
		this.isPermisoActualizarOriginalEspecialidad=false;
		this.isPermisoEliminarEspecialidad=false;
		this.isPermisoGuardarCambiosEspecialidad=false;
		this.isPermisoConsultaEspecialidad=false;
		this.isPermisoBusquedaEspecialidad=false;
		this.isPermisoReporteEspecialidad=false;		
		this.isPermisoOrdenEspecialidad=false;		
		this.isPermisoPaginacionMedioEspecialidad=false;		
		this.isPermisoPaginacionAltoEspecialidad=false;
		this.isPermisoPaginacionTodoEspecialidad=false;
		this.isPermisoCopiarEspecialidad=false;		
		this.isPermisoVerFormEspecialidad=false;		
		this.isPermisoDuplicarEspecialidad=false;		
		this.isPermisoOrdenEspecialidad=false;		
	}
	
	public void setPermisosUsuarioEspecialidad(Boolean isPermiso) {
		this.isPermisoTodoEspecialidad=isPermiso;
		this.isPermisoNuevoEspecialidad=isPermiso;
		this.isPermisoActualizarEspecialidad=isPermiso;
		this.isPermisoActualizarOriginalEspecialidad=isPermiso;
		this.isPermisoEliminarEspecialidad=isPermiso;
		this.isPermisoGuardarCambiosEspecialidad=isPermiso;
		this.isPermisoConsultaEspecialidad=isPermiso;
		this.isPermisoBusquedaEspecialidad=isPermiso;
		this.isPermisoReporteEspecialidad=isPermiso;
		this.isPermisoOrdenEspecialidad=isPermiso;		
		this.isPermisoPaginacionMedioEspecialidad=isPermiso;		
		this.isPermisoPaginacionAltoEspecialidad=isPermiso;		
		this.isPermisoPaginacionTodoEspecialidad=isPermiso;		
		this.isPermisoCopiarEspecialidad=isPermiso;		
		this.isPermisoVerFormEspecialidad=isPermiso;		
		this.isPermisoDuplicarEspecialidad=isPermiso;
		this.isPermisoOrdenEspecialidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEspecialidad(Boolean isPermiso) {
		//this.isPermisoTodoEspecialidad=isPermiso;
		this.isPermisoNuevoEspecialidad=isPermiso;
		this.isPermisoActualizarEspecialidad=isPermiso;
		this.isPermisoActualizarOriginalEspecialidad=isPermiso;
		this.isPermisoEliminarEspecialidad=isPermiso;
		this.isPermisoGuardarCambiosEspecialidad=isPermiso;
		//this.isPermisoConsultaEspecialidad=isPermiso;
		//this.isPermisoBusquedaEspecialidad=isPermiso;
		//this.isPermisoReporteEspecialidad=isPermiso;
		//this.isPermisoOrdenEspecialidad=isPermiso;		
		//this.isPermisoPaginacionMedioEspecialidad=isPermiso;		
		//this.isPermisoPaginacionAltoEspecialidad=isPermiso;		
		//this.isPermisoPaginacionTodoEspecialidad=isPermiso;		
		//this.isPermisoCopiarEspecialidad=isPermiso;		
		//this.isPermisoDuplicarEspecialidad=isPermiso;
		//this.isPermisoOrdenEspecialidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEspecialidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EspecialidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEspecialidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEspecialidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEspecialidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEspecialidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEspecialidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEspecialidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EspecialidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EspecialidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEspecialidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEspecialidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEspecialidad=this.isPermisoActualizarEspecialidad;
			this.isPermisoEliminarEspecialidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEspecialidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEspecialidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEspecialidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEspecialidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEspecialidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEspecialidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEspecialidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEspecialidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEspecialidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEspecialidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEspecialidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEspecialidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEspecialidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEspecialidad.setToolTipText(this.jTableDatosEspecialidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEspecialidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEspecialidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EspecialidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EspecialidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEspecialidad() throws Exception {
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
	public void inicializarCombosForeignKeyEspecialidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEspecialidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EspecialidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEspecialidadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEspecialidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EspecialidadParameterReturnGeneral especialidadReturnGeneral=new EspecialidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.especialidadConstantesFunciones.cargarid_empresaEspecialidad)
					 || (this.esRecargarFks && this.especialidadConstantesFunciones.cargarid_empresaEspecialidad)) {

					if(!this.especialidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+especialidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				especialidadReturnGeneral=especialidadLogic.cargarCombosLoteForeignKeyEspecialidad(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=especialidadReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEspecialidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.especialidadSessionBean==null) {
				this.especialidadSessionBean=new EspecialidadSessionBean();
			}

			if(!this.especialidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyEspecialidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEspecialidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEspecialidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEspecialidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEspecialidad(Especialidad especialidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEspecialidad(Especialidad especialidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEspecialidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEspecialidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEspecialidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEspecialidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEspecialidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEspecialidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEspecialidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEspecialidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EspecialidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EspecialidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EspecialidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.especialidadSessionBean=new EspecialidadSessionBean(); 
		this.especialidadConstantesFunciones=new EspecialidadConstantesFunciones(); 
		this.especialidadBean=new Especialidad();//(this.especialidadConstantesFunciones); 		
		this.especialidadReturnGeneral=new EspecialidadParameterReturnGeneral(); 
		
		this.especialidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.especialidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EspecialidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EspecialidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EspecialidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEspecialidad(true);
			
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
			
			this.especialidadConstantesFunciones=new EspecialidadConstantesFunciones(); 
			this.especialidadBean=new Especialidad();//this.especialidadConstantesFunciones); 			
			this.especialidadReturnGeneral=new EspecialidadParameterReturnGeneral(); 
		
			EspecialidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Especialidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.especialidad=new Especialidad();
			this.especialidads = new ArrayList<Especialidad>();
			this.especialidadsAux = new ArrayList<Especialidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic=new EspecialidadLogic();
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			//this.especialidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.especialidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEspecialidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEspecialidad);	
					}
					
					if(this.jInternalFrameImportacionEspecialidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEspecialidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEspecialidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEspecialidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEspecialidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEspecialidad);
				this.jInternalFrameDetalleFormEspecialidad.setVisible(false);
				this.jInternalFrameDetalleFormEspecialidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEspecialidad);
					this.jInternalFrameReporteDinamicoEspecialidad.setVisible(false);
					this.jInternalFrameReporteDinamicoEspecialidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEspecialidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEspecialidad);
					this.jInternalFrameImportacionEspecialidad.setVisible(false);
					this.jInternalFrameImportacionEspecialidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEspecialidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEspecialidad);
					this.jInternalFrameOrderByEspecialidad.setVisible(false);
					this.jInternalFrameOrderByEspecialidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEspecialidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EspecialidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.especialidadReturnGeneral=new EspecialidadParameterReturnGeneral();
			
			this.especialidadParameterGeneral=new EspecialidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.especialidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EspecialidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EspecialidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.especialidadSessionBean.getEsGuardarRelacionado(),this.especialidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EspecialidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.especialidadSessionBean.getEsGuardarRelacionado(),this.especialidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaDuplicarEspecialidad=true;
			this.isVisibilidadCeldaCopiarEspecialidad=true;
			this.isVisibilidadCeldaVerFormEspecialidad=true;
			this.isVisibilidadCeldaOrdenEspecialidad=true;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=false;
			this.isVisibilidadCeldaGuardarEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEspecialidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEspecialidad(false);
			
			this.setPermisosUsuarioEspecialidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.especialidadSessionBean.getEsGuardarRelacionado() 
				|| (this.especialidadSessionBean.getEsGuardarRelacionado() && this.especialidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEspecialidadClasesRelacionadas();
			}
			
			if(this.especialidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEspecialidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEspecialidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEspecialidad();
			}
			
			if(!this.isPermisoBusquedaEspecialidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEspecialidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEspecialidad,this.isPermisoPaginacionMedioEspecialidad,this.isPermisoPaginacionTodoEspecialidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EspecialidadConstantesFunciones.getTiposSeleccionarEspecialidad());
				
				this.tiposColumnasSelect=EspecialidadConstantesFunciones.getTiposSeleccionarEspecialidad(true);
				
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
			//if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEspecialidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEspecialidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEspecialidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEspecialidad() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				especialidadImplementable= (EspecialidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EspecialidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				especialidadImplementableHome= (EspecialidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EspecialidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.especialidads= new ArrayList<Especialidad>();
			this.especialidadsEliminados= new ArrayList<Especialidad>();
						
			this.isEsNuevoEspecialidad=false;
			this.esParaAccionDesdeFormularioEspecialidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEspecialidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEspecialidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EspecialidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EspecialidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEspecialidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEspecialidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEspecialidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEspecialidad();
			}
			
			EspecialidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEspecialidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEspecialidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEspecialidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEspecialidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Especialidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEspecialidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEspecialidad")) {
				iIndex=this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEspecialidad();	
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
	
	public void cargarCombosForeignKeyEspecialidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEspecialidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEspecialidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEspecialidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEspecialidad();
		
		this.cargarCombosFrameForeignKeyEspecialidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEspecialidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEspecialidad();
		}
	}
	
	
	
	public void jButtonNuevoEspecialidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.especialidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			
			if(jTableDatosEspecialidad.getRowCount()>=1) {
				jTableDatosEspecialidad.removeRowSelectionInterval(0, jTableDatosEspecialidad.getRowCount()-1);						
			}
			
			this.isEsNuevoEspecialidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEspecialidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEspecialidad(true);			
			//this.especialidad=new Especialidad();
			//this.especialidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEspecialidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEspecialidad() ;
			
			if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEspecialidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.especialidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.especialidad);				
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			if(this.especialidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Especialidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEspecialidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEspecialidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEspecialidad.getSelectedRows().length;			
			}
			
			especialidadsSeleccionados=this.getEspecialidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEspecialidad--;			
				//Especialidad especialidadAux= new Especialidad();			
				//especialidadAux.setId(this.iIdNuevoEspecialidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Especialidad especialidadOrigen=new Especialidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Especialidad especialidadOrigen : especialidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							especialidadOrigen =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							especialidadOrigen =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEspecialidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.especialidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEspecialidad(especialidadOrigen,this.especialidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.especialidadLogic.getEspecialidads().add(this.especialidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.especialidads.add(this.especialidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEspecialidad(false);
				
				this.jTableDatosEspecialidad.setRowSelectionInterval(this.getIndiceNuevoEspecialidad(), this.getIndiceNuevoEspecialidad());
				
				int iLastRow =  this.jTableDatosEspecialidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEspecialidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEspecialidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEspecialidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();									
		
			Especialidad especialidadOrigen=new Especialidad();
			Especialidad especialidadDestino=new Especialidad();
				
			especialidadsSeleccionados=this.getEspecialidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEspecialidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || especialidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEspecialidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadOrigen =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						especialidadOrigen =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						especialidadDestino =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						especialidadDestino =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				especialidadOrigen =especialidadsSeleccionados.get(0);
				especialidadDestino =especialidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEspecialidad(especialidadOrigen,especialidadDestino,true,false);
				
				especialidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(especialidadDestino,especialidadLogic.getEspecialidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(especialidadDestino,especialidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEspecialidad(false);
				
				//this.jTableDatosEspecialidad.setRowSelectionInterval(this.getIndiceNuevoEspecialidad(), this.getIndiceNuevoEspecialidad());
				
				int iLastRow =  this.jTableDatosEspecialidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEspecialidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEspecialidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEspecialidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEspecialidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEspecialidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEspecialidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEspecialidad.setVisible(!isVisible);
			this.jPanelPaginacionEspecialidad.setVisible(!isVisible);
			this.jPanelAccionesEspecialidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEspecialidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEspecialidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEspecialidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEspecialidad();
			
			this.abrirFrameOrderByEspecialidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEspecialidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEspecialidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEspecialidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEspecialidad.isMaximum()) {
					this.jInternalFrameDetalleFormEspecialidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEspecialidad.setSize(this.jInternalFrameDetalleFormEspecialidad.iWidthFormulario,this.jInternalFrameDetalleFormEspecialidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEspecialidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEspecialidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEspecialidad.isMaximum()) {
						this.jInternalFrameDetalleFormEspecialidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEspecialidad.jContentPaneDetalleEspecialidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEspecialidad.jContentPaneDetalleEspecialidad.getWidth(),EspecialidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEspecialidad.jContentPaneDetalleEspecialidad.getWidth(),EspecialidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEspecialidad.jContentPaneDetalleEspecialidad.getWidth(),EspecialidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEspecialidad.setVisible(true);
	        this.jInternalFrameDetalleFormEspecialidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEspecialidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEspecialidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEspecialidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEspecialidad,false,this);
				} else {
					this.jInternalFrameOrderByEspecialidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEspecialidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEspecialidad);
				this.jInternalFrameOrderByEspecialidad.setVisible(false);
				this.jInternalFrameOrderByEspecialidad.setSelected(false);
				
				this.jInternalFrameOrderByEspecialidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEspecialidad"));
				
				this.inicializarActualizarBindingTablaOrderByEspecialidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEspecialidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEspecialidad==null) {
				
				this.jInternalFrameImportacionEspecialidad=new ImportacionJInternalFrame(EspecialidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEspecialidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEspecialidad);
				this.jInternalFrameImportacionEspecialidad.setVisible(false);
				this.jInternalFrameImportacionEspecialidad.setSelected(false);


				this.jInternalFrameImportacionEspecialidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEspecialidad"));
				this.jInternalFrameImportacionEspecialidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEspecialidad"));
				this.jInternalFrameImportacionEspecialidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEspecialidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEspecialidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEspecialidad==null) {
				this.jInternalFrameReporteDinamicoEspecialidad=new ReporteDinamicoJInternalFrame(EspecialidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEspecialidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEspecialidad);
				this.jInternalFrameReporteDinamicoEspecialidad.setVisible(false);
				this.jInternalFrameReporteDinamicoEspecialidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEspecialidad"));
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEspecialidad"));
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEspecialidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEspecialidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEspecialidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEspecialidad);
			
	       	this.jInternalFrameDetalleFormEspecialidad.setVisible(false);
	        this.jInternalFrameDetalleFormEspecialidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormEspecialidad.dispose();
			//this.jInternalFrameDetalleFormEspecialidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEspecialidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEspecialidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoEspecialidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEspecialidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEspecialidad.setVisible(true);
	        this.jInternalFrameImportacionEspecialidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEspecialidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEspecialidad.setVisible(true);
	        this.jInternalFrameOrderByEspecialidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEspecialidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEspecialidad.setVisible(false);
	        this.jInternalFrameOrderByEspecialidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEspecialidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEspecialidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoEspecialidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEspecialidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEspecialidad.setVisible(false);
	        this.jInternalFrameImportacionEspecialidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEspecialidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEspecialidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEspecialidad(true);
			//this.isEsNuevoEspecialidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEspecialidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEspecialidad(false) ;
			
			if(especialidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEspecialidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEspecialidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEspecialidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEspecialidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEspecialidad(true);
			//this.isEsNuevoEspecialidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.especialidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEspecialidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEspecialidad(false) ;
			
			if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEspecialidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEspecialidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEspecialidad(false);
			
			//if(!this.isEsNuevoEspecialidad) {								
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				
			}
			
			if(this.permiteMantenimiento(this.especialidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.especialidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEspecialidad=true;
					this.inicializarActualizarBindingTablaEspecialidad(false);
					this.isEsNuevoEspecialidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEspecialidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEspecialidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEspecialidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEspecialidad(false);
				
				this.habilitarDeshabilitarControlesEspecialidad(false);
			
												
				
				if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEspecialidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEspecialidadActionPerformed(evt,especialidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEspecialidad(this.especialidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEspecialidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,especialidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.especialidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEspecialidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				this.especialidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				this.especialidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.especialidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.especialidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EspecialidadModel) this.jTableDatosEspecialidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEspecialidad=true;
				this.inicializarActualizarBindingTablaEspecialidad(false);
				this.isEsNuevoEspecialidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEspecialidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEspecialidad(false);
				
				this.habilitarDeshabilitarControlesEspecialidad(false);
				
				
				
				if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEspecialidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEspecialidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEspecialidad.getRowCount()>=1) {
				jTableDatosEspecialidad.removeRowSelectionInterval(0, jTableDatosEspecialidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEspecialidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEspecialidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEspecialidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEspecialidad(false) ;
			
			this.isEsNuevoEspecialidad=false;
			
			if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEspecialidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEspecialidad(false);
				
				//SI ES MANUAL
				if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEspecialidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEspecialidad--;			
			//Especialidad especialidadAux= new Especialidad();			
			//especialidadAux.setId(this.iIdNuevoEspecialidad);
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEspecialidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
			
			this.especialidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.especialidadLogic.getEspecialidads().add(this.especialidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.especialidads.add(this.especialidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEspecialidad(false);
			
			this.jTableDatosEspecialidad.setRowSelectionInterval(this.getIndiceNuevoEspecialidad(), this.getIndiceNuevoEspecialidad());
			
			int iLastRow =  this.jTableDatosEspecialidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEspecialidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEspecialidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEspecialidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEspecialidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEspecialidad(false);
			
			//SI ES MANUAL
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEspecialidad();
			}
			
			//this.abrirFrameTreeEspecialidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEspecialidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EspecialidadS ?", "MANTENIMIENTO DE Especialidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEspecialidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEspecialidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.especialidadReturnGeneral=especialidadLogic.procesarImportacionEspecialidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.especialidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEspecialidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEspecialidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEspecialidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEspecialidad.setFileImportacion(this.jInternalFrameImportacionEspecialidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEspecialidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEspecialidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEspecialidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEspecialidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		

		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EspecialidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EspecialidadBaseDesign.jrxml";
			
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
			
			this.generarReporteEspecialidads("Todos",especialidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EspecialidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EspecialidadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EspecialidadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EspecialidadConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoEspecialidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EspecialidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EspecialidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EspecialidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EspecialidadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EspecialidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EspecialidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EspecialidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EspecialidadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EspecialidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EspecialidadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EspecialidadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EspecialidadConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEspecialidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Especialidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EspecialidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EspecialidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Especialidad especialidad:especialidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(especialidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EspecialidadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EspecialidadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Especialidad especialidad:especialidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(especialidad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EspecialidadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EspecialidadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Especialidad especialidad:especialidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(especialidad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EspecialidadConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EspecialidadConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Especialidad especialidad:especialidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(especialidad.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEspecialidad(row);				
			//	iRow++;
			//}				
			
			//for(Especialidad especialidadAux:especialidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEspecialidad(especialidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEspecialidad(false);
			
			//SI ES MANUAL
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEspecialidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEspecialidad(false);
			
			//SI ES MANUAL
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEspecialidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEspecialidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEspecialidad(false);
			
			//SI ES MANUAL
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEspecialidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEspecialidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEspecialidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEspecialidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEspecialidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEspecialidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEspecialidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosEspecialidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosEspecialidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEspecialidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEspecialidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEspecialidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEspecialidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEspecialidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEspecialidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEspecialidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEspecialidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EspecialidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEspecialidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEspecialidad();
		
		this.inicializarActualizarBindingBotonesManualEspecialidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEspecialidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEspecialidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEspecialidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEspecialidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEspecialidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEspecialidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEspecialidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEspecialidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionNuevoEspecialidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionSinCerrarEspecialidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionSinMensajeEspecialidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEspecialidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEspecialidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEspecialidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEspecialidad!=null) {
				this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionNuevoEspecialidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionSinCerrarEspecialidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEspecialidad.jCheckBoxPostAccionSinMensajeEspecialidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEspecialidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEspecialidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEspecialidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEspecialidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEspecialidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEspecialidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEspecialidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEspecialidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEspecialidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEspecialidad(Boolean esInicializar) throws Exception {
		try	{	
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEspecialidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEspecialidad() throws Exception {
		try	{
			if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEspecialidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEspecialidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEspecialidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEspecialidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEspecialidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEspecialidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEspecialidad.addItem(reporte);
			}
			
			
			if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEspecialidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEspecialidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEspecialidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEspecialidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEspecialidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEspecialidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEspecialidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEspecialidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEspecialidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
				this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
				this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEspecialidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEspecialidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEspecialidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEspecialidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEspecialidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEspecialidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoEspecialidad.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreEspecialidad.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEspecialidad(Boolean esInicializar) throws Exception {				
		if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEspecialidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEspecialidad() throws Exception {
		this.inicializarActualizarBindingTablaEspecialidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEspecialidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEspecialidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEspecialidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=especialidadLogic.getEspecialidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=especialidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEspecialidad.setModel(new EspecialidadModel(this.especialidadLogic.getEspecialidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEspecialidad.setModel(new EspecialidadModel(this.especialidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEspecialidad!=null && this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEspecialidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EspecialidadConstantesFunciones.SCLASSWEBTITULO,especialidadConstantesFunciones.resaltarSeleccionarEspecialidad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EspecialidadConstantesFunciones.SCLASSWEBTITULO,especialidadConstantesFunciones.resaltarSeleccionarEspecialidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,EspecialidadConstantesFunciones.LABEL_ID));

		if(this.especialidadConstantesFunciones.mostraridEspecialidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EspecialidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.especialidadConstantesFunciones.resaltaridEspecialidad,this.especialidadConstantesFunciones.activaridEspecialidad,this,true,"idEspecialidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.especialidadConstantesFunciones.resaltaridEspecialidad,this.especialidadConstantesFunciones.activaridEspecialidad,this,true,"idEspecialidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,EspecialidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.especialidadConstantesFunciones.mostrarid_empresaEspecialidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EspecialidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.especialidadConstantesFunciones.resaltarid_empresaEspecialidad,this,this.especialidadConstantesFunciones.activarid_empresaEspecialidad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.especialidadConstantesFunciones.resaltarid_empresaEspecialidad,this,this.especialidadConstantesFunciones.activarid_empresaEspecialidad,false,"id_empresaEspecialidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,EspecialidadConstantesFunciones.LABEL_CODIGO));

		if(this.especialidadConstantesFunciones.mostrarcodigoEspecialidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EspecialidadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.especialidadConstantesFunciones.resaltarcodigoEspecialidad,this.especialidadConstantesFunciones.activarcodigoEspecialidad,this,true,"codigoEspecialidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.especialidadConstantesFunciones.resaltarcodigoEspecialidad,this.especialidadConstantesFunciones.activarcodigoEspecialidad,this,true,"codigoEspecialidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,EspecialidadConstantesFunciones.LABEL_NOMBRE));

		if(this.especialidadConstantesFunciones.mostrarnombreEspecialidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EspecialidadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.especialidadConstantesFunciones.resaltarnombreEspecialidad,this.especialidadConstantesFunciones.activarnombreEspecialidad,this,true,"nombreEspecialidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.especialidadConstantesFunciones.resaltarnombreEspecialidad,this.especialidadConstantesFunciones.activarnombreEspecialidad,this,true,"nombreEspecialidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,EspecialidadConstantesFunciones.LABEL_DESCRIPCION));

		if(this.especialidadConstantesFunciones.mostrardescripcionEspecialidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EspecialidadConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.especialidadConstantesFunciones.resaltardescripcionEspecialidad,this.especialidadConstantesFunciones.activardescripcionEspecialidad,this,true,"descripcionEspecialidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.especialidadConstantesFunciones.resaltardescripcionEspecialidad,this.especialidadConstantesFunciones.activardescripcionEspecialidad,this,true,"descripcionEspecialidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EspecialidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.especialidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.especialidadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEspecialidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.especialidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.especialidadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEspecialidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEspecialidad && this.isPermisoGuardarCambiosEspecialidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.especialidadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.especialidadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEspecialidad.addColumn(tableColumn);
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
			
			this.jTableDatosEspecialidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEspecialidad && this.isPermisoGuardarCambiosEspecialidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEspecialidad && this.isPermisoGuardarCambiosEspecialidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEspecialidad.moveColumn(this.jTableDatosEspecialidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEspecialidad.moveColumn(this.jTableDatosEspecialidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEspecialidad.moveColumn(this.jTableDatosEspecialidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEspecialidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEspecialidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEspecialidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEspecialidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEspecialidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEspecialidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEspecialidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEspecialidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=especialidadLogic.getEspecialidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=especialidads.size()-1;
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
		//this.jTableDatosEspecialidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEspecialidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEspecialidad();
			
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
				
				//this.isEsNuevoEspecialidad=false;
					
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
				if(this.especialidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEspecialidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEspecialidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEspecialidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.especialidad.getsType().equals("DUPLICADO")
				   || this.especialidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEspecialidad=true;
				
				} else {
					this.isEsNuevoEspecialidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
					if(this.especialidad.getId()>=0 && !this.especialidad.getIsNew()) {						
						this.isEsNuevoEspecialidad=false;
						
					} else {
						this.isEsNuevoEspecialidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEspecialidad(esRelaciones);						
				
				this.seleccionarEspecialidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.especialidad.getId()<0) {
					this.isEsNuevoEspecialidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEspecialidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEspecialidad(evt,rowIndex);
				}	
				
				if(this.especialidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Especialidad: " + this.dDif); 
					}
				}								
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEspecialidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.especialidad)) {
					if(this.especialidad.getId()>0) {
						this.especialidad.setIsDeleted(true);
						
						this.especialidadsEliminados.add(this.especialidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.especialidadLogic.getEspecialidads().remove(this.especialidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.especialidads.remove(this.especialidad);				
					}
					
					
					((EspecialidadModel) this.jTableDatosEspecialidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEspecialidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEspecialidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEspecialidad) {
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEspecialidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEspecialidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEspecialidad(this.especialidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.especialidadConstantesFunciones.cargarid_empresaEspecialidad || this.especialidadConstantesFunciones.event_dependid_empresaEspecialidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.especialidad.getid_empresa());
									//this.inicializarActualizarBindingEspecialidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(especialidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(especialidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.especialidad.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEspecialidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEspecialidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEspecialidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEspecialidad(Especialidad especialidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEspecialidad(especialidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEspecialidad(Especialidad especialidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEspecialidad(especialidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEspecialidad(especialidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEspecialidad(especialidad);
	}
	
	public void setVariablesObjetoActualToFormularioEspecialidad(Especialidad especialidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setText(especialidad.getId().toString());
			this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setText(especialidad.getcodigo());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setText(especialidad.getnombre());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setText(especialidad.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Especialidad especialidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,especialidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Especialidad especialidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				especialidadLocal=this.especialidad;
			} else {
				especialidadLocal=this.especialidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(especialidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEspecialidad(especialidadLocal,true);
					
					if(especialidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(especialidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(especialidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEspecialidad(Especialidad especialidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEspecialidad(especialidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(especialidad);
	}
	
	public void setVariablesFormularioToObjetoActualEspecialidad(Especialidad especialidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEspecialidad(especialidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEspecialidad(Especialidad especialidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.getText()==null || this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.getText()=="" || this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.getText()=="Id") {
				this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setText("0");
			}

			if(conColumnasBase) {especialidad.setId(Long.parseLong(this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EspecialidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelIdEspecialidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			especialidad.setcodigo(this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EspecialidadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelcodigoEspecialidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			especialidad.setnombre(this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EspecialidadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabelnombreEspecialidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			especialidad.setdescripcion(this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EspecialidadConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEspecialidad.jLabeldescripcionEspecialidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEspecialidad(Especialidad especialidadBean,Especialidad especialidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEspecialidad(Especialidad especialidadOrigen,Especialidad especialidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && especialidadOrigen.getId()!=null && !especialidadOrigen.getId().equals(0L))) {especialidad.setId(especialidadOrigen.getId());}}
			if(conDefault || (!conDefault && especialidadOrigen.getcodigo()!=null && !especialidadOrigen.getcodigo().equals(""))) {especialidad.setcodigo(especialidadOrigen.getcodigo());}
			if(conDefault || (!conDefault && especialidadOrigen.getnombre()!=null && !especialidadOrigen.getnombre().equals(""))) {especialidad.setnombre(especialidadOrigen.getnombre());}
			if(conDefault || (!conDefault && especialidadOrigen.getdescripcion()!=null && !especialidadOrigen.getdescripcion().equals(""))) {especialidad.setdescripcion(especialidadOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEspecialidad(Especialidad especialidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setText(especialidad.getId().toString());
			this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setText(especialidad.getcodigo());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setText(especialidad.getnombre());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setText(especialidad.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEspecialidad(EspecialidadBean especialidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setText(especialidadBean.getId().toString());
			this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setText(especialidadBean.getcodigo());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setText(especialidadBean.getnombre());
			this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setText(especialidadBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEspecialidad(EspecialidadParameterReturnGeneral especialidadReturnGeneral,EspecialidadBean especialidadBean,Boolean conDefault) throws Exception { 
		try {
			Especialidad especialidadLocal=new Especialidad();
			
			especialidadLocal=especialidadReturnGeneral.getEspecialidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && especialidadLocal.getId()!=null && !especialidadLocal.getId().equals(0L))) {especialidadBean.setId(especialidadLocal.getId());}}
			if(conDefault || (!conDefault && especialidadLocal.getcodigo()!=null && !especialidadLocal.getcodigo().equals(""))) {especialidadBean.setcodigo(especialidadLocal.getcodigo());}
			if(conDefault || (!conDefault && especialidadLocal.getnombre()!=null && !especialidadLocal.getnombre().equals(""))) {especialidadBean.setnombre(especialidadLocal.getnombre());}
			if(conDefault || (!conDefault && especialidadLocal.getdescripcion()!=null && !especialidadLocal.getdescripcion().equals(""))) {especialidadBean.setdescripcion(especialidadLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEspecialidadGenerico(Long idEspecialidadSeleccionado,JComboBox jComboBoxEspecialidad,List<Especialidad> especialidadsLocal)throws Exception {
		try {
			Especialidad  especialidadTemp=null;

			for(Especialidad especialidadAux:especialidadsLocal) {
				if(especialidadAux.getId()!=null && especialidadAux.getId().equals(idEspecialidadSeleccionado)) {
					especialidadTemp=especialidadAux;
					break;
				}
			}

			jComboBoxEspecialidad.setSelectedItem(especialidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEspecialidadGenerico(JComboBox jComboBoxEspecialidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEspecialidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEspecialidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEspecialidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEspecialidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			especialidad=(Especialidad) especialidadLogic.getEspecialidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			especialidad =(Especialidad) especialidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!especialidad.getIsNew() && !especialidad.getIsChanged() && !especialidad.getIsDeleted()) {
				sDescripcion=especialidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=especialidad.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Especialidad especialidadRow=new Especialidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			especialidadRow=(Especialidad) especialidadLogic.getEspecialidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			especialidadRow=(Especialidad) especialidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEspecialidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad));			
			this.jButtonDuplicarEspecialidad.setVisible((this.isVisibilidadCeldaDuplicarEspecialidad && this.isPermisoDuplicarEspecialidad));			
			this.jButtonCopiarEspecialidad.setVisible((this.isVisibilidadCeldaCopiarEspecialidad && this.isPermisoCopiarEspecialidad));
			this.jButtonVerFormEspecialidad.setVisible((this.isVisibilidadCeldaVerFormEspecialidad && this.isPermisoVerFormEspecialidad));
			
			this.jButtonAbrirOrderByEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));			
			
			this.jButtonNuevoRelacionesEspecialidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEspecialidad && this.isPermisoNuevoEspecialidad));			
			this.jButtonNuevoGuardarCambiosEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad && this.isPermisoGuardarCambiosEspecialidad));
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonModificarEspecialidad.setVisible((this.isVisibilidadCeldaModificarEspecialidad && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.setVisible((this.isVisibilidadCeldaActualizarEspecialidad && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.setVisible((this.isVisibilidadCeldaEliminarEspecialidad && this.isPermisoEliminarEspecialidad));
			this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.setVisible(this.isVisibilidadCeldaCancelarEspecialidad);							
			this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.setVisible((this.isVisibilidadCeldaGuardarEspecialidad && this.isPermisoGuardarCambiosEspecialidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaEspecialidad.setVisible((this.isVisibilidadCeldaGuardarCambiosEspecialidad && this.isPermisoGuardarCambiosEspecialidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad));						
			this.jButtonDuplicarToolBarEspecialidad.setVisible((this.isVisibilidadCeldaDuplicarEspecialidad && this.isPermisoDuplicarEspecialidad));						
			this.jButtonCopiarToolBarEspecialidad.setVisible((this.isVisibilidadCeldaCopiarEspecialidad && this.isPermisoCopiarEspecialidad));			
			this.jButtonVerFormToolBarEspecialidad.setVisible((this.isVisibilidadCeldaVerFormEspecialidad && this.isPermisoVerFormEspecialidad));			
			this.jButtonAbrirOrderByToolBarEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));
			this.jButtonNuevoRelacionesToolBarEspecialidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEspecialidad && this.isPermisoNuevoEspecialidad));			
			this.jButtonNuevoGuardarCambiosToolBarEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad && this.isPermisoGuardarCambiosEspecialidad));			
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonModificarToolBarEspecialidad.setVisible((this.isVisibilidadCeldaModificarEspecialidad && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarToolBarEspecialidad.setVisible((this.isVisibilidadCeldaActualizarEspecialidad  && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarToolBarEspecialidad.setVisible((this.isVisibilidadCeldaEliminarEspecialidad && this.isPermisoEliminarEspecialidad));
			this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarToolBarEspecialidad.setVisible(this.isVisibilidadCeldaCancelarEspecialidad);				
			this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosToolBarEspecialidad.setVisible((this.isVisibilidadCeldaGuardarEspecialidad && this.isPermisoGuardarCambiosEspecialidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEspecialidad.setVisible((this.isVisibilidadCeldaGuardarCambiosEspecialidad && this.isPermisoGuardarCambiosEspecialidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad));			
			this.jMenuItemDuplicarEspecialidad.setVisible((this.isVisibilidadCeldaDuplicarEspecialidad && this.isPermisoDuplicarEspecialidad));			
			this.jMenuItemCopiarEspecialidad.setVisible((this.isVisibilidadCeldaCopiarEspecialidad && this.isPermisoCopiarEspecialidad));			
			this.jMenuItemVerFormEspecialidad.setVisible((this.isVisibilidadCeldaVerFormEspecialidad && this.isPermisoVerFormEspecialidad));			
			this.jMenuItemAbrirOrderByEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));			
			//this.jMenuItemMostrarOcultarEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));
			this.jMenuItemDetalleAbrirOrderByEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));			
			//this.jMenuItemDetalleMostrarOcultarEspecialidad.setVisible((this.isVisibilidadCeldaOrdenEspecialidad && this.isPermisoOrdenEspecialidad));			
			this.jMenuItemNuevoRelacionesEspecialidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesEspecialidad && this.isPermisoNuevoEspecialidad));			
			this.jMenuItemNuevoGuardarCambiosEspecialidad.setVisible((this.isVisibilidadCeldaNuevoEspecialidad && this.isPermisoNuevoEspecialidad && this.isPermisoGuardarCambiosEspecialidad));									
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemModificarEspecialidad.setVisible((this.isVisibilidadCeldaModificarEspecialidad && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemActualizarEspecialidad.setVisible((this.isVisibilidadCeldaActualizarEspecialidad && this.isPermisoActualizarEspecialidad));	
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemEliminarEspecialidad.setVisible((this.isVisibilidadCeldaEliminarEspecialidad && this.isPermisoEliminarEspecialidad));
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemCancelarEspecialidad.setVisible(this.isVisibilidadCeldaCancelarEspecialidad);				
			}
			
			this.jMenuItemGuardarCambiosEspecialidad.setVisible((this.isVisibilidadCeldaGuardarEspecialidad && this.isPermisoGuardarCambiosEspecialidad));						
			this.jMenuItemGuardarCambiosTablaEspecialidad.setVisible((this.isVisibilidadCeldaGuardarCambiosEspecialidad && this.isPermisoGuardarCambiosEspecialidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEspecialidad=this.jButtonNuevoEspecialidad.isVisible();
			this.isVisibilidadCeldaDuplicarEspecialidad=this.jButtonDuplicarEspecialidad.isVisible();
			this.isVisibilidadCeldaCopiarEspecialidad=this.jButtonCopiarEspecialidad.isVisible();
			this.isVisibilidadCeldaVerFormEspecialidad=this.jButtonVerFormEspecialidad.isVisible();
			
			this.isVisibilidadCeldaOrdenEspecialidad=this.jButtonAbrirOrderByEspecialidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=this.jButtonNuevoRelacionesEspecialidad.isVisible();
			this.isVisibilidadCeldaModificarEspecialidad=this.jButtonModificarEspecialidad.isVisible();
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.isVisibilidadCeldaActualizarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.isVisible();
			this.isVisibilidadCeldaEliminarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.isVisible();
			this.isVisibilidadCeldaCancelarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.isVisible();
			this.isVisibilidadCeldaGuardarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=this.jButtonGuardarCambiosTablaEspecialidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEspecialidad=this.jButtonNuevoToolBarEspecialidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=this.jButtonNuevoRelacionesToolBarEspecialidad.isVisible();
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.isVisibilidadCeldaModificarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonModificarToolBarEspecialidad.isVisible();
			this.isVisibilidadCeldaActualizarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarToolBarEspecialidad.isVisible();
			this.isVisibilidadCeldaEliminarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarToolBarEspecialidad.isVisible();
			this.isVisibilidadCeldaCancelarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarToolBarEspecialidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEspecialidad=this.jButtonGuardarCambiosToolBarEspecialidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=this.jButtonGuardarCambiosTablaToolBarEspecialidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEspecialidad=this.jMenuItemNuevoEspecialidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=this.jMenuItemNuevoRelacionesEspecialidad.isVisible();
			
			if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.isVisibilidadCeldaModificarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jMenuItemModificarEspecialidad.isVisible();
			this.isVisibilidadCeldaActualizarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jMenuItemActualizarEspecialidad.isVisible();
			this.isVisibilidadCeldaEliminarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jMenuItemEliminarEspecialidad.isVisible();
			this.isVisibilidadCeldaCancelarEspecialidad=this.jInternalFrameDetalleFormEspecialidad.jMenuItemCancelarEspecialidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEspecialidad=this.jMenuItemGuardarCambiosEspecialidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=this.jMenuItemGuardarCambiosTablaEspecialidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEspecialidad(Boolean esInicializar) {
		if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.especialidadSessionBean.getConGuardarRelaciones()) {
				//if(this.especialidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEspecialidad();
			}
			
			this.inicializarActualizarBindingBotonesManualEspecialidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEspecialidad() {
		this.jButtonNuevoEspecialidad.setVisible(this.isPermisoNuevoEspecialidad);			
		this.jButtonDuplicarEspecialidad.setVisible(this.isPermisoDuplicarEspecialidad);			
		this.jButtonCopiarEspecialidad.setVisible(this.isPermisoCopiarEspecialidad);			
		this.jButtonVerFormEspecialidad.setVisible(this.isPermisoVerFormEspecialidad);			
		
		this.jButtonAbrirOrderByEspecialidad.setVisible(this.isPermisoOrdenEspecialidad);					
		
		this.jButtonNuevoRelacionesEspecialidad.setVisible(this.isPermisoNuevoEspecialidad);			
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonModificarEspecialidad.setVisible(this.isPermisoActualizarEspecialidad);	
			this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.setVisible(this.isPermisoActualizarEspecialidad);	
			this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.setVisible(this.isPermisoEliminarEspecialidad);
			this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.setVisible(this.isVisibilidadCeldaCancelarEspecialidad);						
			this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.setVisible(this.isPermisoGuardarCambiosEspecialidad);							
		}
		
		this.jButtonGuardarCambiosTablaEspecialidad.setVisible(this.isPermisoActualizarEspecialidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEspecialidad() {
		this.jInternalFrameDetalleFormEspecialidad.jButtonModificarEspecialidad.setVisible(this.isPermisoActualizarEspecialidad);	
		this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.setVisible(this.isPermisoActualizarEspecialidad);	
		this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.setVisible(this.isPermisoEliminarEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.setVisible(this.isVisibilidadCeldaCancelarEspecialidad);							
		this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.setVisible((this.isVisibilidadCeldaGuardarEspecialidad && this.isPermisoGuardarCambiosEspecialidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEspecialidad() {
		if(EspecialidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEspecialidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEspecialidad() {
	}
	
	public void jTableDatosEspecialidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEspecialidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEspecialidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.especialidad==null) {
						this.especialidad = new Especialidad();
					}

					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				}

				if(this.especialidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.especialidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEspecialidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEspecialidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEspecialidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEspecialidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEspecialidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.especialidadLogic.getConnexion());

				if(this.especialidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.especialidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEspecialidad=(TitledBorder)this.jScrollPanelDatosEspecialidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEspecialidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEspecialidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.especialidad==null) {
						this.especialidad = new Especialidad();
					}

					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				}

				if(this.especialidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.especialidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEspecialidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEspecialidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.especialidad==null) {
						this.especialidad = new Especialidad();
					}

					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				}

				if(this.especialidad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.especialidad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEspecialidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEspecialidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.especialidad==null) {
						this.especialidad = new Especialidad();
					}

					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				}

				if(this.especialidad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.especialidad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEspecialidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEspecialidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.getespecialidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.especialidad==null) {
						this.especialidad = new Especialidad();
					}

					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);
				}

				if(this.especialidad.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.especialidad.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEspecialidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoEspecialidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEspecialidad(false,false);

			this.getEspecialidadsBusquedaPorCodigo();

			this.inicializarActualizarBindingEspecialidad(false);

			//if(EspecialidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEspecialidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreEspecialidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEspecialidad(false,false);

			this.getEspecialidadsBusquedaPorNombre();

			this.inicializarActualizarBindingEspecialidad(false);

			//if(EspecialidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEspecialidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEspecialidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEspecialidad(false,false);

			this.getEspecialidadsFK_IdEmpresa();

			this.inicializarActualizarBindingEspecialidad(false);

			//if(EspecialidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEspecialidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.especialidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEspecialidad() {
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
			this.jInternalFrameDetalleFormEspecialidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormEspecialidad.dispose();
			this.jInternalFrameDetalleFormEspecialidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
			this.jInternalFrameReporteDinamicoEspecialidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEspecialidad.dispose();
			this.jInternalFrameReporteDinamicoEspecialidad=null;
		}
		
		if(this.jInternalFrameImportacionEspecialidad!=null) {
			this.jInternalFrameImportacionEspecialidad.setVisible(false);	    			
			this.jInternalFrameImportacionEspecialidad.dispose();
			this.jInternalFrameImportacionEspecialidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEspecialidad();
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEspecialidad")) {
				jButtonDuplicarEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEspecialidad")) {
				jButtonCopiarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormEspecialidad")) {
				jButtonVerFormEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEspecialidad")) {
				jButtonDuplicarEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEspecialidad")) {
				jButtonDuplicarEspecialidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEspecialidad")) {
				jButtonModificarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEspecialidad")) {
				jButtonModificarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEspecialidad")) {
				jButtonModificarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEspecialidad")) {
				jButtonActualizarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEspecialidad")) {
				jButtonActualizarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEspecialidad")) {
				jButtonActualizarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarEspecialidad")) {
				jButtonEliminarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEspecialidad")) {
				jButtonEliminarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEspecialidad")) {
				jButtonEliminarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarEspecialidad")) {
				jButtonCancelarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEspecialidad")) {
				jButtonCancelarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEspecialidad")) {
				jButtonCancelarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarEspecialidad")) {
				jButtonCerrarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEspecialidad")) {
				jButtonCerrarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEspecialidad")) {
				jButtonCerrarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEspecialidad")) {
				jButtonMostrarOcultarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEspecialidad")) {
				jButtonCancelarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEspecialidad")) {
				jButtonCopiarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEspecialidad")) {
				jButtonVerFormEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEspecialidad")) {
				jButtonCopiarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEspecialidad")) {
				jButtonVerFormEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEspecialidad")) {
				jButtonRecargarInformacionEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEspecialidad")) {
				jButtonRecargarInformacionEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEspecialidad")) {
				jButtonRecargarInformacionEspecialidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEspecialidad")) {
				jButtonAnterioresEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEspecialidad")) {
				jButtonAnterioresEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEspecialidad")) {
				jButtonAnterioresEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEspecialidad")) {
				jButtonSiguientesEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEspecialidad")) {
				jButtonSiguientesEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEspecialidad")) {
				jButtonSiguientesEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEspecialidad") || sTipo.equals("MenuItemDetalleAbrirOrderByEspecialidad")) {
				jButtonAbrirOrderByEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEspecialidad") || sTipo.equals("MenuItemDetalleMostrarOcultarEspecialidad")) {
				jButtonMostrarOcultarEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEspecialidad")) {
				jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEspecialidad")) {
				jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEspecialidad")) {
				jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEspecialidad")) {
				jButtonCerrarReporteDinamicoEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEspecialidad")) {
				jButtonGenerarReporteDinamicoEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEspecialidad")) {
				
				jButtonGenerarExcelReporteDinamicoEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEspecialidad")) {
				jButtonCerrarImportacionEspecialidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEspecialidad")) {
				
				jButtonGenerarImportacionEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEspecialidad")) {
				
				jButtonAbrirImportacionEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEspecialidad")) {
				jComboBoxTiposAccionesEspecialidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEspecialidad")) {
				jComboBoxTiposRelacionesEspecialidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEspecialidad")) {
				jComboBoxTiposAccionesEspecialidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEspecialidad")) {
				
				jComboBoxTiposSeleccionarEspecialidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEspecialidad")) {
				jTextFieldValorCampoGeneralEspecialidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEspecialidad")) {
				jButtonAbrirOrderByEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEspecialidad")) {
				jButtonAbrirOrderByEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEspecialidad")) {
				jButtonCerrarOrderByEspecialidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEspecialidadBusqueda")) {
				this.jButtonidEspecialidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEspecialidadUpdate")) {
				this.jButtonid_empresaEspecialidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEspecialidadBusqueda")) {
				this.jButtonid_empresaEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEspecialidadBusqueda")) {
				this.jButtoncodigoEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEspecialidadBusqueda")) {
				this.jButtonnombreEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEspecialidadBusqueda")) {
				this.jButtondescripcionEspecialidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoEspecialidad")) {
				this.jButtonBusquedaPorCodigoEspecialidadActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreEspecialidad")) {
				this.jButtonBusquedaPorNombreEspecialidadActionPerformed(evt);
			}
			
			;
			
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEspecialidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Especialidad especialidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				especialidadLocal=this.especialidad;
			} else {
				especialidadLocal=this.especialidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
							
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
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
			
			


			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
								
						
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
								
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
							
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
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
			
			


			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
								
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEspecialidad")) {
					jCheckBoxSeleccionarTodosEspecialidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEspecialidad")) {
					jCheckBoxSeleccionadosEspecialidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEspecialidad")) {
					
				}
				
				


				
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
												
				
				


				
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
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
			
			


			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEspecialidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.especialidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.especialidad);
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
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
				
				


				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Especialidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Especialidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEspecialidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.especialidadAnterior =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.especialidadAnterior =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEspecialidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEspecialidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEspecialidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.especialidad =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.especialidad =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.especialidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEspecialidad")) {
				
				}
				
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEspecialidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEspecialidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEspecialidad")) {
			
			}
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEspecialidad();
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			if(sTipo.equals("NuevoEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEspecialidad")) {
				jButtonDuplicarEspecialidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEspecialidad")) {
				jButtonCopiarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEspecialidad")) {
				jButtonVerFormEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEspecialidad")) {
				jButtonNuevoEspecialidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEspecialidad")) {
				jButtonModificarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEspecialidad")) {
				jButtonActualizarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEspecialidad")) {
				jButtonEliminarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEspecialidad")) {
				jButtonCancelarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEspecialidad")) {
				jButtonCerrarEspecialidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEspecialidad")) {
				jButtonGuardarCambiosEspecialidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEspecialidad")) {
				jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEspecialidad")) {
				jButtonAbrirOrderByEspecialidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEspecialidad")) {
				jButtonRecargarInformacionEspecialidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEspecialidad")) {
				jButtonAnterioresEspecialidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEspecialidad")) {
				jButtonSiguientesEspecialidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEspecialidadBusqueda")) {
				this.jButtonidEspecialidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEspecialidadUpdate")) {
				this.jButtonid_empresaEspecialidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEspecialidadBusqueda")) {
				this.jButtonid_empresaEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEspecialidadBusqueda")) {
				this.jButtoncodigoEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEspecialidadBusqueda")) {
				this.jButtonnombreEspecialidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEspecialidadBusqueda")) {
				this.jButtondescripcionEspecialidadBusquedaActionPerformed(evt);
			}
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEspecialidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEspecialidad")) {
				closingInternalFrameEspecialidad();
				
			} else if(sTipo.equals("jButtonCancelarEspecialidad")) {
				JInternalFrameBase jInternalFrameDetalleFormEspecialidad = (JInternalFrameBase)evt.getSource();
	            	
	            EspecialidadBeanSwingJInternalFrame jInternalFrameParent=(EspecialidadBeanSwingJInternalFrame)jInternalFrameDetalleFormEspecialidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEspecialidadActionPerformed(null);
			}
			
			EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.especialidad,new Object(),this.especialidadParameterGeneral,this.especialidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEspecialidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEspecialidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEspecialidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.especialidad)) {
			if(!esControlTabla) {
				if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);			
				}
				
				if(this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEspecialidad(this.especialidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.especialidadReturnGeneral=especialidadLogic.procesarEventosEspecialidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.especialidadLogic.getEspecialidads(),this.especialidad,this.especialidadParameterGeneral,this.isEsNuevoEspecialidad,classes);//this.especialidadLogic.getEspecialidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEspecialidad(this.especialidadReturnGeneral,this.especialidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEspecialidad(classes,this.especialidadReturnGeneral,this.especialidadBean,false);
					}
						
					if(this.especialidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEspecialidad(this.especialidadReturnGeneral.getEspecialidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEspecialidad(this.especialidadReturnGeneral.getEspecialidad());	
					}
						
					if(this.especialidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEspecialidad(this.especialidadReturnGeneral.getEspecialidad(),classes);//this.especialidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEspecialidad(this.especialidad,classes);//this.especialidadBean);									
				}
			
				if(EspecialidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEspecialidad(this.especialidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEspecialidad(this.especialidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.especialidadAnterior!=null) {
						this.especialidad=this.especialidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.especialidadReturnGeneral=especialidadLogic.procesarEventosEspecialidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.especialidadLogic.getEspecialidads(),this.especialidad,this.especialidadParameterGeneral,this.isEsNuevoEspecialidad,classes);//this.especialidadLogic.getEspecialidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.especialidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.especialidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.especialidadReturnGeneral.getEspecialidad(),especialidadLogic.getEspecialidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.especialidadReturnGeneral.getEspecialidad(),this.especialidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEspecialidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosEspecialidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEspecialidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosEspecialidad() throws Exception {
		
		EspecialidadModel especialidadModel=(EspecialidadModel)this.jTableDatosEspecialidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			especialidadModel.especialidads=this.especialidadLogic.getEspecialidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			especialidadModel.especialidads=this.especialidads;
		}
		
		
		((EspecialidadModel) this.jTableDatosEspecialidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEspecialidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getespecialidadAnterior(),this.especialidadLogic.getEspecialidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getespecialidadAnterior(),this.especialidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEspecialidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEspecialidad(Especialidad especialidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
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
										
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.especialidad,new Object(),generalEntityParameterGeneral,this.especialidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.especialidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EspecialidadConstantesFunciones.getClassesRelationshipsOfEspecialidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EspecialidadConstantesFunciones.getClassesRelationshipsFromStringsOfEspecialidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEspecialidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EspecialidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.especialidad,new Object(),generalEntityParameterGeneral,this.especialidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEspecialidad(EspecialidadBean especialidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEspecialidad(ArrayList<Classe> classes,EspecialidadReturnGeneral especialidadReturnGeneral,EspecialidadBean especialidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEspecialidad(Especialidad especialidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.especialidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEspecialidad = new EspecialidadDetalleFormJInternalFrame(jDesktopPane,this.especialidadSessionBean.getConGuardarRelaciones(),this.especialidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.setVisible(false);
		this.jInternalFrameDetalleFormEspecialidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormEspecialidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEspecialidad.especialidadLogic=this.especialidadLogic;
		
		this.cargarCombosFrameForeignKeyEspecialidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEspecialidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEspecialidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEspecialidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEspecialidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEspecialidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEspecialidad"));
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonModificarEspecialidad.addActionListener(new ButtonActionListener(this,"ModificarEspecialidad"));

		
		this.jInternalFrameDetalleFormEspecialidad.jButtonModificarToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarEspecialidad"));
					
		this.jInternalFrameDetalleFormEspecialidad.jMenuItemModificarEspecialidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarEspecialidad"));		
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.addActionListener (new ButtonActionListener(this,"ActualizarEspecialidad"));
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEspecialidad"));
						
		this.jInternalFrameDetalleFormEspecialidad.jMenuItemActualizarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEspecialidad"));		
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.addActionListener (new ButtonActionListener(this,"EliminarEspecialidad"));
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarEspecialidad"));
								
		this.jInternalFrameDetalleFormEspecialidad.jMenuItemEliminarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEspecialidad"));		
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.addActionListener (new ButtonActionListener(this,"CancelarEspecialidad"));
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarEspecialidad"));
					
		this.jInternalFrameDetalleFormEspecialidad.jMenuItemCancelarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEspecialidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jMenuItemDetalleCerrarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEspecialidad"));		
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEspecialidad"));
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEspecialidad"));
		
		
		
		this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEspecialidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonidEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"idEspecialidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtoncodigoEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonnombreEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtondescripcionEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEspecialidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEspecialidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEspecialidad"));
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEspecialidad"));
		}
		
		this.jTableDatosEspecialidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEspecialidad"));
		
		this.jTableDatosEspecialidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEspecialidad"));
		
		this.jButtonNuevoEspecialidad.addActionListener(new ButtonActionListener(this,"NuevoEspecialidad"));
		
		this.jButtonDuplicarEspecialidad.addActionListener(new ButtonActionListener(this,"DuplicarEspecialidad"));
		
		this.jButtonCopiarEspecialidad.addActionListener(new ButtonActionListener(this,"CopiarEspecialidad"));
		
		this.jButtonVerFormEspecialidad.addActionListener(new ButtonActionListener(this,"VerFormEspecialidad"));
		
		
		this.jButtonNuevoToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarEspecialidad"));
			
		this.jButtonDuplicarToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEspecialidad"));
			
		this.jMenuItemNuevoEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEspecialidad"));
			
		this.jMenuItemDuplicarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEspecialidad"));		
		
		
		this.jButtonNuevoRelacionesEspecialidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEspecialidad"));
		
		
		this.jButtonNuevoRelacionesToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEspecialidad"));
			
		this.jMenuItemNuevoRelacionesEspecialidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEspecialidad"));		
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonModificarEspecialidad.addActionListener(new ButtonActionListener(this,"ModificarEspecialidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonModificarToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarEspecialidad"));
			
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemModificarEspecialidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarEspecialidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarEspecialidad.addActionListener (new ButtonActionListener(this,"ActualizarEspecialidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonActualizarToolBarEspecialidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEspecialidad"));
				
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemActualizarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEspecialidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarEspecialidad.addActionListener (new ButtonActionListener(this,"EliminarEspecialidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonEliminarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarEspecialidad"));
						
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemEliminarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEspecialidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarEspecialidad.addActionListener (new ButtonActionListener(this,"CancelarEspecialidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonCancelarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarEspecialidad"));
			
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemCancelarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEspecialidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEspecialidad"));		
		
		
		this.jButtonCerrarEspecialidad.addActionListener (new ButtonActionListener(this,"CerrarEspecialidad"));
		
		
		this.jButtonCerrarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarEspecialidad"));
			
		this.jMenuItemCerrarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEspecialidad"));
			
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jMenuItemDetalleCerrarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEspecialidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosEspecialidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEspecialidad"));
		}
		
		this.jButtonCopiarToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarEspecialidad"));
			
		this.jButtonVerFormToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarEspecialidad"));
		
		this.jMenuItemGuardarCambiosEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEspecialidad"));
			
		this.jMenuItemCopiarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEspecialidad"));		
		
		this.jMenuItemVerFormEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEspecialidad"));		
		
		
		this.jButtonGuardarCambiosTablaEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEspecialidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEspecialidad"));
			
		this.jMenuItemGuardarCambiosTablaEspecialidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEspecialidad"));		
		
		
		
		this.jButtonRecargarInformacionEspecialidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionEspecialidad"));
					
		this.jButtonRecargarInformacionToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEspecialidad"));
		
		this.jMenuItemRecargarInformacionEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEspecialidad"));		
		
		
		
		this.jButtonAnterioresEspecialidad.addActionListener (new ButtonActionListener(this,"AnterioresEspecialidad"));
		
		
		this.jButtonAnterioresToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEspecialidad"));
		
		this.jMenuItemAnterioresEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEspecialidad"));		
		
		
		this.jButtonSiguientesEspecialidad.addActionListener (new ButtonActionListener(this,"SiguientesEspecialidad"));
		
		
		this.jButtonSiguientesToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEspecialidad"));
			
		this.jMenuItemSiguientesEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEspecialidad"));
			
		this.jMenuItemAbrirOrderByEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEspecialidad"));
			
		this.jMenuItemMostrarOcultarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEspecialidad"));
			
		this.jMenuItemDetalleAbrirOrderByEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEspecialidad"));
			
		this.jMenuItemDetalleMostarOcultarEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEspecialidad"));		
		
		
		this.jButtonNuevoGuardarCambiosEspecialidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEspecialidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEspecialidad"));
			
		this.jMenuItemNuevoGuardarCambiosEspecialidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEspecialidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEspecialidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEspecialidad"));

		this.jCheckBoxSeleccionadosEspecialidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEspecialidad"));
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEspecialidad"));
		}
		
		
		this.jComboBoxTiposRelacionesEspecialidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesEspecialidad"));
			
		this.jComboBoxTiposAccionesEspecialidad.addActionListener (new ButtonActionListener(this,"TiposAccionesEspecialidad"));
					
		this.jComboBoxTiposSeleccionarEspecialidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEspecialidad"));
			
		this.jTextFieldValorCampoGeneralEspecialidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEspecialidad"));		
		
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonidEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"idEspecialidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtoncodigoEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonnombreEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtondescripcionEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEspecialidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoEspecialidad.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoEspecialidad"));

			this.jButtonBusquedaPorNombreEspecialidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEspecialidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEspecialidad!=null) {
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEspecialidad"));
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEspecialidad"));
				this.jInternalFrameReporteDinamicoEspecialidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEspecialidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoEspecialidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEspecialidad"));				
			//this.jButtonGenerarReporteDinamicoEspecialidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEspecialidad"));
			//this.jButtonGenerarExcelReporteDinamicoEspecialidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEspecialidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEspecialidad!=null) {
				this.jInternalFrameImportacionEspecialidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEspecialidad"));
				this.jInternalFrameImportacionEspecialidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEspecialidad"));
				this.jInternalFrameImportacionEspecialidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEspecialidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEspecialidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByEspecialidad"));
			
			this.jButtonAbrirOrderByToolBarEspecialidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEspecialidad"));			
			
			if(this.jInternalFrameOrderByEspecialidad!=null) {
				this.jInternalFrameOrderByEspecialidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEspecialidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEspecialidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEspecialidad.jTabbedPaneRelacionesEspecialidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEspecialidad"));
		
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
            		closingInternalFrameEspecialidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEspecialidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEspecialidad = (JInternalFrameBase)event.getSource();
	            	
	            EspecialidadBeanSwingJInternalFrame jInternalFrameParent=(EspecialidadBeanSwingJInternalFrame)jInternalFrameDetalleFormEspecialidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEspecialidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEspecialidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEspecialidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEspecialidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEspecialidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEspecialidad";
		inputMap = this.jButtonNuevoEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEspecialidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEspecialidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEspecialidad";
		inputMap = this.jButtonNuevoRelacionesEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEspecialidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEspecialidad";
		inputMap = this.jButtonModificarEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEspecialidad";
		inputMap = this.jButtonActualizarEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEspecialidad";
		inputMap = this.jButtonEliminarEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEspecialidad";
		inputMap = this.jButtonCancelarEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEspecialidad";
		inputMap = this.jButtonCerrarEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEspecialidad";
		inputMap = this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEspecialidad.jButtonGuardarCambiosEspecialidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEspecialidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEspecialidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEspecialidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEspecialidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEspecialidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEspecialidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEspecialidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEspecialidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEspecialidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonidEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"idEspecialidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonid_empresaEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtoncodigoEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtonnombreEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreEspecialidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEspecialidad.jButtondescripcionEspecialidadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEspecialidadBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoEspecialidad.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoEspecialidad"));

		this.jButtonBusquedaPorNombreEspecialidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEspecialidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEspecialidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEspecialidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEspecialidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEspecialidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEspecialidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
					especialidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Especialidad especialidadAux:especialidads) {
					especialidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEspecialidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEspecialidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
						especialidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Especialidad especialidadAux:especialidads) {
						especialidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Especialidad especialidadAux:especialidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEspecialidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEspecialidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEspecialidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEspecialidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEspecialidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEspecialidad.getSelectedRows();
			
			Especialidad especialidadLocal=new Especialidad();
			
			//this.seleccionarTodosEspecialidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					especialidadLocal =(Especialidad) this.especialidadLogic.getEspecialidads().toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					especialidadLocal =(Especialidad) this.especialidads.toArray()[this.jTableDatosEspecialidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				especialidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
						especialidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Especialidad especialidadAux:especialidads) {
						especialidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEspecialidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEspecialidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEspecialidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEspecialidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEspecialidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEspecialidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEspecialidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEspecialidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEspecialidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Especialidad especialidadAux:this.especialidadLogic.getEspecialidads()) {
				
						if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							especialidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							especialidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							especialidadAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Especialidad especialidadAux:especialidads) {
					
						if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							especialidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							especialidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							especialidadAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEspecialidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEspecialidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEspecialidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEspecialidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEspecialidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEspecialidad) {				
					conSplash=true;//false;										
					
					//this.startProcessEspecialidad(conSplash);
				
					this.generarReporteEspecialidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEspecialidadsSeleccionados();
				//this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEspecialidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEspecialidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEspecialidad();
				
				this.exportarEspecialidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEspecialidads();
				//this.importarEspecialidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEspecialidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEspecialidadsSeleccionados();
				//this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Especialidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEspecialidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEspecialidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEspecialidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
				}	
			} 			
			else if(EspecialidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEspecialidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEspecialidad(conSplash);
					
						//this.actualizarParametrosGeneralEspecialidad();
						
						this.generarReporteProcesoAccionEspecialidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EspecialidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EspecialidadS SELECCIONADOS?", "MANTENIMIENTO DE Especialidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEspecialidad();
				
						this.actualizarParametrosGeneralEspecialidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.especialidadReturnGeneral=especialidadLogic.procesarAccionEspecialidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.especialidadLogic.getEspecialidads(),this.especialidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEspecialidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEspecialidad();
					
					EspecialidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEspecialidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEspecialidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEspecialidad.jComboBoxTiposAccionesFormularioEspecialidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEspecialidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEspecialidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEspecialidad();
			
			if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
			Especialidad especialidad=new Especialidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEspecialidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEspecialidad.getSelectedItem();
			
			
			
			
			especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(especialidadsSeleccionados.size()==1) {
				for(Especialidad especialidadAux:especialidadsSeleccionados) {
					especialidad=especialidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEspecialidad();
			
      		//this.finishProcessEspecialidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEspecialidadReturnGeneral() throws Exception {
		if(this.especialidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.especialidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.especialidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.especialidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.especialidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.especialidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEspecialidad(false);
		}
		
		if(this.especialidadReturnGeneral.getConRetornoLista() || this.especialidadReturnGeneral.getConRetornoObjeto()) {
			if(this.especialidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.especialidadLogic.setEspecialidads(this.especialidadReturnGeneral.getEspecialidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.especialidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.especialidadLogic.setEspecialidad(this.especialidadReturnGeneral.getEspecialidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEspecialidad(false);
		}
	}
	
	public void actualizarParametrosGeneralEspecialidad() throws Exception {
		
		
	}
	
	public ArrayList<Especialidad> getEspecialidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEspecialidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Especialidad especialidadAux:especialidadLogic.getEspecialidads()) {
					if(especialidadAux.getIsSelected()) {
						especialidadsSeleccionados.add(especialidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Especialidad especialidadAux:this.especialidads) {
					if(especialidadAux.getIsSelected()) {
						especialidadsSeleccionados.add(especialidadAux);				
					}
				}
			}
			
			if(especialidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						especialidadsSeleccionados.addAll(this.especialidadLogic.getEspecialidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						especialidadsSeleccionados.addAll(this.especialidads);				
					}
				}
			}
		} else {
			especialidadsSeleccionados.add(this.especialidad);
		}
		
		return especialidadsSeleccionados;
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
	
	public void generarReporteEspecialidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEspecialidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEspecialidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEspecialidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEspecialidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Especialidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEspecialidads("Todos",especialidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEspecialidads("Todos",especialidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEspecialidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEspecialidads("Todos",especialidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEspecialidad();
		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEspecialidad();
		
		
		//this.generarReporteEspecialidads("Todos",especialidadsSeleccionados ,especialidadImplementable,especialidadImplementableHome);
	}
	
	public void mostrarImportacionEspecialidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEspecialidad();
		
		this.abrirFrameImportacionEspecialidad();		
		
			
		//this.generarReporteEspecialidads("Todos",especialidadsSeleccionados ,especialidadImplementable,especialidadImplementableHome);
	}
	
	public void importarEspecialidads() throws Exception {		
	
	}
	
	public void exportarEspecialidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEspecialidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEspecialidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEspecialidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Especialidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEspecialidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Especialidad especialidadAux:especialidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEspecialidad(especialidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//especialidadAux.setsDetalleGeneralEntityReporte(especialidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEspecialidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EspecialidadConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEspecialidad(Especialidad especialidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=especialidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=especialidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=especialidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=especialidad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=especialidad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=especialidad.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Especialidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEspecialidad(row);				
				iRow++;
			}				
			
			for(Especialidad especialidadAux:especialidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEspecialidad(especialidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEspecialidadsSeleccionados() throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();		
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"especialidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("especialidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("especialidad");
			//elementRoot.appendChild(element);
		
			for(Especialidad especialidadAux:especialidadsSeleccionados) {
				element = document.createElement("especialidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEspecialidad(especialidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especialidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEspecialidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EspecialidadConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEspecialidad(Especialidad especialidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(especialidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(especialidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(especialidad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(especialidad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(especialidad.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEspecialidad(Especialidad especialidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EspecialidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(especialidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EspecialidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(especialidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EspecialidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(especialidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(EspecialidadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(especialidad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EspecialidadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(especialidad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(EspecialidadConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(especialidad.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEspecialidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Especialidad> especialidadsSeleccionados=new ArrayList<Especialidad>();
		
		especialidadsSeleccionados=this.getEspecialidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEspecialidad(especialidadsSeleccionados);
		
		this.generarReporteEspecialidads("Todos",especialidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEspecialidad(ArrayList<Especialidad> especialidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Especialidad especialidadAux:especialidadsSeleccionados) {
				especialidadAux.setsDetalleGeneralEntityReporte(especialidadAux.toString());
			
				if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					especialidadAux.setsDescripcionGeneralEntityReporte1(especialidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					especialidadAux.setsDescripcionGeneralEntityReporte1(especialidadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					especialidadAux.setsDescripcionGeneralEntityReporte1(especialidadAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EspecialidadConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					especialidadAux.setsDescripcionGeneralEntityReporte1(especialidadAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EspecialidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEspecialidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEspecialidad=true;
				this.isVisibilidadCeldaNuevoRelacionesEspecialidad=true;
				this.isVisibilidadCeldaGuardarCambiosEspecialidad=true;
			}
			
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=true;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=true;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=true;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=true;
			this.isVisibilidadCeldaEliminarEspecialidad=true;
			this.isVisibilidadCeldaCancelarEspecialidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=true;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=true;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEspecialidad=true;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=true;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=true;
			this.isVisibilidadCeldaModificarEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=true;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
			this.isVisibilidadCeldaModificarEspecialidad=true;
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
			this.isVisibilidadCeldaCancelarEspecialidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				} else {
					this.isVisibilidadCeldaGuardarEspecialidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EspecialidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEspecialidad=true;
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=true;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=true;
		} else {
			this.actualizarEstadoPanelsEspecialidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEspecialidad=false;
			//this.isVisibilidadCeldaVerFormEspecialidad=false;
			this.isVisibilidadCeldaDuplicarEspecialidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!especialidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
		} else {
			this.isVisibilidadCeldaNuevoEspecialidad=false;
			this.isVisibilidadCeldaGuardarCambiosEspecialidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(especialidadSessionBean.getEsGuardarRelacionado()) {
			if(!especialidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;												
			}
			
			this.jButtonCerrarEspecialidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEspecialidad=false;
		}
		
		if(!this.permiteMantenimiento(this.especialidad)) {
			this.isVisibilidadCeldaActualizarEspecialidad=false;
			this.isVisibilidadCeldaEliminarEspecialidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEspecialidad() {
	}
	
	public void actualizarEstadoPanelsEspecialidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEspecialidad!=null) {
				this.jScrollPanelDatosEdicionEspecialidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEspecialidad!=null) {
				this.jScrollPanelDatosEspecialidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionEspecialidad!=null) {
				this.jPanelPaginacionEspecialidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.especialidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEspecialidad!=null) {
					this.jTabbedPaneBusquedasEspecialidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.especialidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEspecialidad!=null) {
				this.jTabbedPaneBusquedasEspecialidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEspecialidad!=null) {
				this.jPanelParametrosReportesEspecialidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasEspecialidad.remove(jPanelBusquedaPorCodigoEspecialidad);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEspecialidad.remove(jPanelBusquedaPorNombreEspecialidad);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EspecialidadSessionBean especialidadSessionBean=new EspecialidadSessionBean();
		
		if(this.especialidadSessionBean==null) {
			this.especialidadSessionBean=new EspecialidadSessionBean();
		}
		
		this.especialidadSessionBean.setsUltimaBusquedaEspecialidad(this.getsAccionBusqueda());
		this.especialidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.especialidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			especialidadSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			especialidadSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			especialidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EspecialidadSessionBean especialidadSessionBean=new EspecialidadSessionBean();
		
		if(this.especialidadSessionBean==null) {
			this.especialidadSessionBean=new EspecialidadSessionBean();
		}
		
		if(this.especialidadSessionBean.getsUltimaBusquedaEspecialidad()!=null&&!this.especialidadSessionBean.getsUltimaBusquedaEspecialidad().equals("")) {
			this.setsAccionBusqueda(especialidadSessionBean.getsUltimaBusquedaEspecialidad());
			this.setiNumeroPaginacion(especialidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(especialidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(especialidadSessionBean.getcodigo());
				especialidadSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(especialidadSessionBean.getnombre());
				especialidadSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(especialidadSessionBean.getid_empresa());
				especialidadSessionBean.setid_empresa(-1L);
			}
		}
		
		this.especialidadSessionBean.setsUltimaBusquedaEspecialidad("");
		this.especialidadSessionBean.setiNumeroPaginacion(EspecialidadConstantesFunciones.INUMEROPAGINACION);
		this.especialidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEspecialidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEspecialidad() {
		this.updateBorderResaltarBusquedasFormularioEspecialidad();
		this.updateVisibilidadBusquedasFormularioEspecialidad();
		this.updateHabilitarBusquedasFormularioEspecialidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioEspecialidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEspecialidad.getComponents().length>0) {
	

		if(this.especialidadConstantesFunciones.resaltarBusquedaPorCodigoEspecialidad!=null) {
			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorCodigoEspecialidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
				jPanel.setBorder(this.especialidadConstantesFunciones.resaltarBusquedaPorCodigoEspecialidad);
			}
		}

		if(this.especialidadConstantesFunciones.resaltarBusquedaPorNombreEspecialidad!=null) {
			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorNombreEspecialidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
				jPanel.setBorder(this.especialidadConstantesFunciones.resaltarBusquedaPorNombreEspecialidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEspecialidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEspecialidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorCodigoEspecialidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.especialidadConstantesFunciones.mostrarBusquedaPorCodigoEspecialidad);
			if(!this.especialidadConstantesFunciones.mostrarBusquedaPorCodigoEspecialidad && index>-1) {
				this.jTabbedPaneBusquedasEspecialidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorNombreEspecialidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.especialidadConstantesFunciones.mostrarBusquedaPorNombreEspecialidad);
			if(!this.especialidadConstantesFunciones.mostrarBusquedaPorNombreEspecialidad && index>-1) {
				this.jTabbedPaneBusquedasEspecialidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEspecialidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEspecialidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorCodigoEspecialidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.especialidadConstantesFunciones.activarBusquedaPorCodigoEspecialidad);
				this.jTabbedPaneBusquedasEspecialidad.setEnabledAt(index,this.especialidadConstantesFunciones.activarBusquedaPorCodigoEspecialidad);
			}

			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorNombreEspecialidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.especialidadConstantesFunciones.activarBusquedaPorNombreEspecialidad);
				this.jTabbedPaneBusquedasEspecialidad.setEnabledAt(index,this.especialidadConstantesFunciones.activarBusquedaPorNombreEspecialidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEspecialidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorCodigoEspecialidad);

			this.jTabbedPaneBusquedasEspecialidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);

			this.especialidadConstantesFunciones.setResaltarBusquedaPorCodigoEspecialidad(resaltar);

			jPanel.setBorder(this.especialidadConstantesFunciones.resaltarBusquedaPorCodigoEspecialidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasEspecialidad.indexOfComponent(this.jPanelBusquedaPorNombreEspecialidad);

			this.jTabbedPaneBusquedasEspecialidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEspecialidad.getComponent(index);

			this.especialidadConstantesFunciones.setResaltarBusquedaPorNombreEspecialidad(resaltar);

			jPanel.setBorder(this.especialidadConstantesFunciones.resaltarBusquedaPorNombreEspecialidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEspecialidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEspecialidad() throws Exception {

		if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEspecialidad();
		this.updateVisibilidadResaltarControlesFormularioEspecialidad();
		this.updateHabilitarResaltarControlesFormularioEspecialidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioEspecialidad() throws Exception {
		if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.especialidadConstantesFunciones.resaltaridEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad!=null) {this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setBorder(this.especialidadConstantesFunciones.resaltaridEspecialidad);}
		if(this.especialidadConstantesFunciones.resaltarid_empresaEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad!=null) {this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setBorder(this.especialidadConstantesFunciones.resaltarid_empresaEspecialidad);}
		if(this.especialidadConstantesFunciones.resaltarcodigoEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad!=null) {this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setBorder(this.especialidadConstantesFunciones.resaltarcodigoEspecialidad);}
		if(this.especialidadConstantesFunciones.resaltarnombreEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad!=null) {this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setBorder(this.especialidadConstantesFunciones.resaltarnombreEspecialidad);}
		if(this.especialidadConstantesFunciones.resaltardescripcionEspecialidad!=null && this.jInternalFrameDetalleFormEspecialidad!=null) {this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setBorder(this.especialidadConstantesFunciones.resaltardescripcionEspecialidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEspecialidad() throws Exception {		
		if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
	
		//this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setVisible(this.especialidadConstantesFunciones.mostraridEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jPanelidEspecialidad.setVisible(this.especialidadConstantesFunciones.mostraridEspecialidad);
		//this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarid_empresaEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jPanelid_empresaEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarid_empresaEspecialidad);
		//this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarcodigoEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jPanelcodigoEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarcodigoEspecialidad);
		//this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarnombreEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jPanelnombreEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrarnombreEspecialidad);
		//this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrardescripcionEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jPaneldescripcionEspecialidad.setVisible(this.especialidadConstantesFunciones.mostrardescripcionEspecialidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEspecialidad() throws Exception {
		if(this.jInternalFrameDetalleFormEspecialidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEspecialidad!=null) {
	
		this.jInternalFrameDetalleFormEspecialidad.jLabelidEspecialidad.setEnabled(this.especialidadConstantesFunciones.activaridEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jComboBoxid_empresaEspecialidad.setEnabled(this.especialidadConstantesFunciones.activarid_empresaEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jTextFieldcodigoEspecialidad.setEnabled(this.especialidadConstantesFunciones.activarcodigoEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jTextAreanombreEspecialidad.setEnabled(this.especialidadConstantesFunciones.activarnombreEspecialidad);
		this.jInternalFrameDetalleFormEspecialidad.jTextAreadescripcionEspecialidad.setEnabled(this.especialidadConstantesFunciones.activardescripcionEspecialidad);
		}
	}
	
		
}
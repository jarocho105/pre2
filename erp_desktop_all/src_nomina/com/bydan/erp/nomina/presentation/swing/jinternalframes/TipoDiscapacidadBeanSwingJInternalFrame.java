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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoDiscapacidadConstantesFunciones;
import com.bydan.erp.nomina.util.TipoDiscapacidadParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoDiscapacidadParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoDiscapacidadBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TipoDiscapacidadBeanSwingJInternalFrame extends TipoDiscapacidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDiscapacidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDiscapacidad> tipodiscapacidadValidator = new ClassValidator<TipoDiscapacidad>(TipoDiscapacidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDiscapacidad tipodiscapacidad;	
	public TipoDiscapacidad tipodiscapacidadAux;
	public TipoDiscapacidad tipodiscapacidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDiscapacidad tipodiscapacidadTotales;
	public Long idTipoDiscapacidadActual;
	public Long iIdNuevoTipoDiscapacidad=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoDisca=false;

	public Boolean getIsTienePermisosEmpleadoDisca() {
		return isTienePermisosEmpleadoDisca;
	}

	public void setIsTienePermisosEmpleadoDisca(Boolean isTienePermisosEmpleadoDisca) {
		this.isTienePermisosEmpleadoDisca= isTienePermisosEmpleadoDisca;
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
	
	public Boolean isPermisoTodoTipoDiscapacidad;
	public Boolean isPermisoNuevoTipoDiscapacidad;
	public Boolean isPermisoActualizarTipoDiscapacidad;
	public Boolean isPermisoActualizarOriginalTipoDiscapacidad;
	public Boolean isPermisoEliminarTipoDiscapacidad;
	public Boolean isPermisoGuardarCambiosTipoDiscapacidad;
	public Boolean isPermisoConsultaTipoDiscapacidad;
	public Boolean isPermisoBusquedaTipoDiscapacidad;
	public Boolean isPermisoReporteTipoDiscapacidad;
	public Boolean isPermisoPaginacionMedioTipoDiscapacidad;
	public Boolean isPermisoPaginacionAltoTipoDiscapacidad;
	public Boolean isPermisoPaginacionTodoTipoDiscapacidad;
	public Boolean isPermisoCopiarTipoDiscapacidad;
	public Boolean isPermisoVerFormTipoDiscapacidad;
	public Boolean isPermisoDuplicarTipoDiscapacidad;
	public Boolean isPermisoOrdenTipoDiscapacidad;
	
	
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
	
	public TipoDiscapacidadParameterReturnGeneral tipodiscapacidadReturnGeneral;
	public TipoDiscapacidadParameterReturnGeneral tipodiscapacidadParameterGeneral;
	
	

	public EmpleadoDiscaLogic empleadodiscaLogic=null;

	public EmpleadoDiscaLogic getEmpleadoDiscaLogic() {
		return empleadodiscaLogic;
	}

	public void setEmpleadoDiscaLogic(EmpleadoDiscaLogic empleadodiscaLogic) {
		this.empleadodiscaLogic = empleadodiscaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDiscapacidad=false;
	public Boolean esParaAccionDesdeFormularioTipoDiscapacidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDiscapacidadLogic tipodiscapacidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDiscapacidad tipodiscapacidadBean;
	public TipoDiscapacidadConstantesFunciones tipodiscapacidadConstantesFunciones;
	//public TipoDiscapacidadParameterReturnGeneral tipodiscapacidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDiscapacidad> tipodiscapacidads;	
	//public List<TipoDiscapacidad> tipodiscapacidadsEliminados;
	//public List<TipoDiscapacidad> tipodiscapacidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDiscapacidad=true;
	public Boolean isVisibilidadCeldaCopiarTipoDiscapacidad=true;
	public Boolean isVisibilidadCeldaVerFormTipoDiscapacidad=true;
	public Boolean isVisibilidadCeldaOrdenTipoDiscapacidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaModificarTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaActualizarTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaEliminarTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaCancelarTipoDiscapacidad=false;
	public Boolean isVisibilidadCeldaGuardarTipoDiscapacidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDiscapacidad() {
		return this.iIdNuevoTipoDiscapacidad;
	}

	public void setiIdNuevoTipoDiscapacidad(Long iIdNuevoTipoDiscapacidad) {
		this.iIdNuevoTipoDiscapacidad = iIdNuevoTipoDiscapacidad;
	}
	
	public Long getidTipoDiscapacidadActual() {
		return this.idTipoDiscapacidadActual;
	}

	public void setidTipoDiscapacidadActual(Long idTipoDiscapacidadActual) {
		this.idTipoDiscapacidadActual = idTipoDiscapacidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDiscapacidad gettipodiscapacidad() {
		return this.tipodiscapacidad;
	}

	public void settipodiscapacidad(TipoDiscapacidad tipodiscapacidad) {
		this.tipodiscapacidad = tipodiscapacidad;
	}
	
	public TipoDiscapacidad gettipodiscapacidadAux() {
		return this.tipodiscapacidadAux;
	}

	public void settipodiscapacidadAux(TipoDiscapacidad tipodiscapacidadAux) {
		this.tipodiscapacidadAux = tipodiscapacidadAux;
	}				
	
	public TipoDiscapacidad gettipodiscapacidadAnterior() {
		return this.tipodiscapacidadAnterior;
	}

	public void settipodiscapacidadAnterior(TipoDiscapacidad tipodiscapacidadAnterior) {
		this.tipodiscapacidadAnterior = tipodiscapacidadAnterior;
	}	
	
	public TipoDiscapacidad gettipodiscapacidadTotales() {
		return this.tipodiscapacidadTotales;
	}

	public void settipodiscapacidadTotales(TipoDiscapacidad tipodiscapacidadTotales) {
		this.tipodiscapacidadTotales = tipodiscapacidadTotales;
	}	
	
	public TipoDiscapacidad gettipodiscapacidadBean() {
		return this.tipodiscapacidadBean;
	}

	public void settipodiscapacidadBean(TipoDiscapacidad tipodiscapacidadBean) {
		this.tipodiscapacidadBean = tipodiscapacidadBean;
	}	
	
	public TipoDiscapacidadParameterReturnGeneral gettipodiscapacidadReturnGeneral() {
		return this.tipodiscapacidadReturnGeneral;
	}

	public void settipodiscapacidadReturnGeneral(TipoDiscapacidadParameterReturnGeneral tipodiscapacidadReturnGeneral) {
		this.tipodiscapacidadReturnGeneral = tipodiscapacidadReturnGeneral;
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
	
	
	public TipoDiscapacidadLogic getTipoDiscapacidadLogic()	{		
		return tipodiscapacidadLogic;
	}

	public void setTipoDiscapacidadLogic(TipoDiscapacidadLogic tipodiscapacidadLogic) {
		this.tipodiscapacidadLogic = tipodiscapacidadLogic;
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
	
	public Boolean getIsEsNuevoTipoDiscapacidad() {
		return isEsNuevoTipoDiscapacidad;
	}

	public void setIsEsNuevoTipoDiscapacidad(Boolean isEsNuevoTipoDiscapacidad) {
		this.isEsNuevoTipoDiscapacidad = isEsNuevoTipoDiscapacidad;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDiscapacidad() {
		return esParaAccionDesdeFormularioTipoDiscapacidad;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDiscapacidad(Boolean esParaAccionDesdeFormularioTipoDiscapacidad) {
		this.esParaAccionDesdeFormularioTipoDiscapacidad = esParaAccionDesdeFormularioTipoDiscapacidad;
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

			if(this.tipodiscapacidadSessionBean==null) {
				this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
			}

			if(!this.tipodiscapacidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodiscapacidadSessionBean.getlidEmpresaActual());
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

					if(this.tipodiscapacidad!=null) {
						this.tipodiscapacidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
						this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDiscapacidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
						if(this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDiscapacidadGenerico)throws Exception
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
				jComboBoxid_empresaTipoDiscapacidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDiscapacidadGenerico!=null && jComboBoxid_empresaTipoDiscapacidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDiscapacidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDiscapacidad tipodiscapacidad,JComboBox jComboBoxid_empresaTipoDiscapacidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDiscapacidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDiscapacidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodiscapacidad.setid_empresa(empresaAux.getId());
				tipodiscapacidad.setempresa_descripcion(TipoDiscapacidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodiscapacidad.setEmpresa(empresaAux);			}
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

					if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { 
							this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { 
					}

					if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
							this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
							this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDiscapacidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDiscapacidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoDiscapacidad(this.tipodiscapacidadLogic.getTipoDiscapacidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDiscapacidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoDiscapacidad(this.tipodiscapacidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodiscapacidadLogic.setTipoDiscapacidads(this.tipodiscapacidads);
			tipodiscapacidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDiscapacidadParameterReturnGeneral getTipoDiscapacidadParameterGeneral() {
		return this.tipodiscapacidadParameterGeneral;
	}
	
	public void setTipoDiscapacidadParameterGeneral(TipoDiscapacidadParameterReturnGeneral tipodiscapacidadParameterGeneral) {
		this.tipodiscapacidadParameterGeneral = tipodiscapacidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDiscapacidad() {
		return isPermisoTodoTipoDiscapacidad;
	}

	public void setIsPermisoTodoTipoDiscapacidad(Boolean isPermisoTodoTipoDiscapacidad) {
		this.isPermisoTodoTipoDiscapacidad = isPermisoTodoTipoDiscapacidad;
	}

	public Boolean getIsPermisoNuevoTipoDiscapacidad() {
		return isPermisoNuevoTipoDiscapacidad;
	}

	public void setIsPermisoNuevoTipoDiscapacidad(Boolean isPermisoNuevoTipoDiscapacidad) {
		this.isPermisoNuevoTipoDiscapacidad = isPermisoNuevoTipoDiscapacidad;
	}

	public Boolean getIsPermisoActualizarTipoDiscapacidad() {
		return isPermisoActualizarTipoDiscapacidad;
	}

	public void setIsPermisoActualizarTipoDiscapacidad(Boolean isPermisoActualizarTipoDiscapacidad) {
		this.isPermisoActualizarTipoDiscapacidad = isPermisoActualizarTipoDiscapacidad;
	}

	public Boolean getIsPermisoEliminarTipoDiscapacidad() {
		return isPermisoEliminarTipoDiscapacidad;
	}

	public void setIsPermisoEliminarTipoDiscapacidad(Boolean isPermisoEliminarTipoDiscapacidad) {
		this.isPermisoEliminarTipoDiscapacidad = isPermisoEliminarTipoDiscapacidad;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDiscapacidad() {
		return isPermisoGuardarCambiosTipoDiscapacidad;
	}

	public void setIsPermisoGuardarCambiosTipoDiscapacidad(Boolean isPermisoGuardarCambiosTipoDiscapacidad) {
		this.isPermisoGuardarCambiosTipoDiscapacidad = isPermisoGuardarCambiosTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoConsultaTipoDiscapacidad() {
		return isPermisoConsultaTipoDiscapacidad;
	}

	public void setIsPermisoConsultaTipoDiscapacidad(Boolean isPermisoConsultaTipoDiscapacidad) {
		this.isPermisoConsultaTipoDiscapacidad = isPermisoConsultaTipoDiscapacidad;
	}

	public Boolean getIsPermisoBusquedaTipoDiscapacidad() {
		return isPermisoBusquedaTipoDiscapacidad;
	}

	public void setIsPermisoBusquedaTipoDiscapacidad(Boolean isPermisoBusquedaTipoDiscapacidad) {
		this.isPermisoBusquedaTipoDiscapacidad = isPermisoBusquedaTipoDiscapacidad;
	}

	public Boolean getIsPermisoReporteTipoDiscapacidad() {
		return isPermisoReporteTipoDiscapacidad;
	}

	public void setIsPermisoReporteTipoDiscapacidad(Boolean isPermisoReporteTipoDiscapacidad) {
		this.isPermisoReporteTipoDiscapacidad = isPermisoReporteTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDiscapacidad() {
		return isPermisoPaginacionMedioTipoDiscapacidad;
	}

	public void setIsPermisoPaginacionMedioTipoDiscapacidad(Boolean isPermisoPaginacionMedioTipoDiscapacidad) {
		this.isPermisoPaginacionMedioTipoDiscapacidad = isPermisoPaginacionMedioTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDiscapacidad() {
		return isPermisoPaginacionTodoTipoDiscapacidad;
	}

	public void setIsPermisoPaginacionTodoTipoDiscapacidad(Boolean isPermisoPaginacionTodoTipoDiscapacidad) {
		this.isPermisoPaginacionTodoTipoDiscapacidad = isPermisoPaginacionTodoTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDiscapacidad() {
		return isPermisoPaginacionAltoTipoDiscapacidad;
	}

	public void setIsPermisoPaginacionAltoTipoDiscapacidad(Boolean isPermisoPaginacionAltoTipoDiscapacidad) {
		this.isPermisoPaginacionAltoTipoDiscapacidad = isPermisoPaginacionAltoTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoCopiarTipoDiscapacidad() {
		return isPermisoCopiarTipoDiscapacidad;
	}

	public void setIsPermisoCopiarTipoDiscapacidad(Boolean isPermisoCopiarTipoDiscapacidad) {
		this.isPermisoCopiarTipoDiscapacidad = isPermisoCopiarTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoVerFormTipoDiscapacidad() {
		return isPermisoVerFormTipoDiscapacidad;
	}

	public void setIsPermisoVerFormTipoDiscapacidad(Boolean isPermisoVerFormTipoDiscapacidad) {
		this.isPermisoVerFormTipoDiscapacidad = isPermisoVerFormTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoDuplicarTipoDiscapacidad() {
		return isPermisoDuplicarTipoDiscapacidad;
	}

	public void setIsPermisoDuplicarTipoDiscapacidad(Boolean isPermisoDuplicarTipoDiscapacidad) {
		this.isPermisoDuplicarTipoDiscapacidad = isPermisoDuplicarTipoDiscapacidad;
	}
	
	public Boolean getIsPermisoOrdenTipoDiscapacidad() {
		return isPermisoOrdenTipoDiscapacidad;
	}

	public void setIsPermisoOrdenTipoDiscapacidad(Boolean isPermisoOrdenTipoDiscapacidad) {
		this.isPermisoOrdenTipoDiscapacidad = isPermisoOrdenTipoDiscapacidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDiscapacidad() {
		return isVisibilidadCeldaNuevoTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaNuevoTipoDiscapacidad(Boolean isVisibilidadCeldaNuevoTipoDiscapacidad) {
		this.isVisibilidadCeldaNuevoTipoDiscapacidad = isVisibilidadCeldaNuevoTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDiscapacidad() {
		return isVisibilidadCeldaDuplicarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDiscapacidad(Boolean isVisibilidadCeldaDuplicarTipoDiscapacidad) {
		this.isVisibilidadCeldaDuplicarTipoDiscapacidad = isVisibilidadCeldaDuplicarTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDiscapacidad() {
		return isVisibilidadCeldaCopiarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaCopiarTipoDiscapacidad(Boolean isVisibilidadCeldaCopiarTipoDiscapacidad) {
		this.isVisibilidadCeldaCopiarTipoDiscapacidad = isVisibilidadCeldaCopiarTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDiscapacidad() {
		return isVisibilidadCeldaVerFormTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaVerFormTipoDiscapacidad(Boolean isVisibilidadCeldaVerFormTipoDiscapacidad) {
		this.isVisibilidadCeldaVerFormTipoDiscapacidad = isVisibilidadCeldaVerFormTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDiscapacidad() {
		return isVisibilidadCeldaOrdenTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaOrdenTipoDiscapacidad(Boolean isVisibilidadCeldaOrdenTipoDiscapacidad) {
		this.isVisibilidadCeldaOrdenTipoDiscapacidad = isVisibilidadCeldaOrdenTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDiscapacidad() {
		return isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDiscapacidad(Boolean isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad = isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDiscapacidad() {
		return isVisibilidadCeldaModificarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaModificarTipoDiscapacidad(Boolean isVisibilidadCeldaModificarTipoDiscapacidad) {
		this.isVisibilidadCeldaModificarTipoDiscapacidad = isVisibilidadCeldaModificarTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDiscapacidad() {
		return isVisibilidadCeldaActualizarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaActualizarTipoDiscapacidad(Boolean isVisibilidadCeldaActualizarTipoDiscapacidad) {
		this.isVisibilidadCeldaActualizarTipoDiscapacidad = isVisibilidadCeldaActualizarTipoDiscapacidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDiscapacidad() {
		return isVisibilidadCeldaEliminarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaEliminarTipoDiscapacidad(Boolean isVisibilidadCeldaEliminarTipoDiscapacidad) {
		this.isVisibilidadCeldaEliminarTipoDiscapacidad = isVisibilidadCeldaEliminarTipoDiscapacidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDiscapacidad() {
		return isVisibilidadCeldaCancelarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaCancelarTipoDiscapacidad(Boolean isVisibilidadCeldaCancelarTipoDiscapacidad) {
		this.isVisibilidadCeldaCancelarTipoDiscapacidad = isVisibilidadCeldaCancelarTipoDiscapacidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDiscapacidad() {
		return isVisibilidadCeldaGuardarTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaGuardarTipoDiscapacidad(Boolean isVisibilidadCeldaGuardarTipoDiscapacidad) {
		this.isVisibilidadCeldaGuardarTipoDiscapacidad = isVisibilidadCeldaGuardarTipoDiscapacidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDiscapacidad() {
		return isVisibilidadCeldaGuardarCambiosTipoDiscapacidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDiscapacidad(Boolean isVisibilidadCeldaGuardarCambiosTipoDiscapacidad) {
		this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad = isVisibilidadCeldaGuardarCambiosTipoDiscapacidad;
	}
		
	public TipoDiscapacidadSessionBean gettipodiscapacidadSessionBean() {
		return this.tipodiscapacidadSessionBean;
	}
	
	public void settipodiscapacidadSessionBean(TipoDiscapacidadSessionBean tipodiscapacidadSessionBean) {
		this.tipodiscapacidadSessionBean=tipodiscapacidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodiscapacidad,null);
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
	
	public void bugActualizarReferenciaActual(TipoDiscapacidad tipodiscapacidad,TipoDiscapacidad tipodiscapacidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDiscapacidad(tipodiscapacidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodiscapacidadAux.setId(tipodiscapacidad.getId());
		tipodiscapacidadAux.setVersionRow(tipodiscapacidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDiscapacidad();
		
			int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodiscapacidadValidator.getInvalidValues(this.tipodiscapacidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodiscapacidadLogic.setDatosCliente(datosCliente);
			tipodiscapacidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodiscapacidadAux=new  TipoDiscapacidad();
				
				tipodiscapacidadAux.setIsNew(true);
				tipodiscapacidadAux.setIsChanged(true);
				
				tipodiscapacidadAux.setTipoDiscapacidadOriginal(this.tipodiscapacidad);
				
				tipodiscapacidadAux.setId(this.tipodiscapacidad.getId());	
				tipodiscapacidadAux.setVersionRow(this.tipodiscapacidad.getVersionRow());	
				tipodiscapacidadAux.setid_empresa(this.tipodiscapacidad.getid_empresa());	
				tipodiscapacidadAux.setnombre(this.tipodiscapacidad.getnombre());	
				tipodiscapacidadAux.setporcentaje_inicial(this.tipodiscapacidad.getporcentaje_inicial());	
				tipodiscapacidadAux.setporcentaje_final(this.tipodiscapacidad.getporcentaje_final());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodiscapacidadAux,tipodiscapacidadLogic.getTipoDiscapacidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodiscapacidadAux,tipodiscapacidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadLogic.saveTipoDiscapacidads();//WithConnection
						//tipodiscapacidadLogic.getSetVersionRowTipoDiscapacidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodiscapacidad,tipodiscapacidadAux);
					
					this.refrescarForeignKeysDescripcionesTipoDiscapacidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodiscapacidadAux=new  TipoDiscapacidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() && this.tipodiscapacidad.getId()>=0)) {
						
					tipodiscapacidadAux.setIsNew(false);
				}
				
				tipodiscapacidadAux.setIsDeleted(false);
			
				tipodiscapacidadAux.setId(this.tipodiscapacidad.getId());	
				tipodiscapacidadAux.setVersionRow(this.tipodiscapacidad.getVersionRow());	
				tipodiscapacidadAux.setid_empresa(this.tipodiscapacidad.getid_empresa());	
				tipodiscapacidadAux.setnombre(this.tipodiscapacidad.getnombre());	
				tipodiscapacidadAux.setporcentaje_inicial(this.tipodiscapacidad.getporcentaje_inicial());	
				tipodiscapacidadAux.setporcentaje_final(this.tipodiscapacidad.getporcentaje_final());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodiscapacidadAux,tipodiscapacidadLogic.getTipoDiscapacidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodiscapacidadAux,tipodiscapacidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadLogic.saveTipoDiscapacidads();//WithConnection
						//tipodiscapacidadLogic.getSetVersionRowTipoDiscapacidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodiscapacidad,tipodiscapacidadAux);
					
					this.refrescarForeignKeysDescripcionesTipoDiscapacidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodiscapacidadAux=new  TipoDiscapacidad();
				
				tipodiscapacidadAux.setIsNew(false);
				tipodiscapacidadAux.setIsChanged(false);
				
				tipodiscapacidadAux.setIsDeleted(true);
				
				tipodiscapacidadAux.setId(this.tipodiscapacidad.getId());	
				tipodiscapacidadAux.setVersionRow(this.tipodiscapacidad.getVersionRow());	
				tipodiscapacidadAux.setid_empresa(this.tipodiscapacidad.getid_empresa());	
				tipodiscapacidadAux.setnombre(this.tipodiscapacidad.getnombre());	
				tipodiscapacidadAux.setporcentaje_inicial(this.tipodiscapacidad.getporcentaje_inicial());	
				tipodiscapacidadAux.setporcentaje_final(this.tipodiscapacidad.getporcentaje_final());	
				
				if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodiscapacidadAux.getId()>=0) {	
						this.tipodiscapacidadsEliminados.add(tipodiscapacidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodiscapacidadAux,tipodiscapacidadLogic.getTipoDiscapacidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodiscapacidadAux,tipodiscapacidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadLogic.saveTipoDiscapacidads();//WithConnection
						//tipodiscapacidadLogic.getSetVersionRowTipoDiscapacidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodiscapacidadAux.setEmpleadoDiscas(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaLogic.getEmpleadoDiscas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodiscapacidadAux,tipodiscapacidadLogic.getTipoDiscapacidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodiscapacidadAux,tipodiscapacidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getTipoDiscapacidads().addAll(this.tipodiscapacidadsEliminados);
					
					tipodiscapacidadLogic.saveTipoDiscapacidads();//WithConnection
					//tipodiscapacidadLogic.getSetVersionRowTipoDiscapacidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDiscapacidad();
				
				this.tipodiscapacidadsEliminados= new ArrayList<TipoDiscapacidad>();		
			}
			
			if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Discapacidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodiscapacidad=tipodiscapacidadAux;
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
      		//this.finishProcessTipoDiscapacidad();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDiscapacidad tipodiscapacidadLocal) throws Exception {
		
		if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodiscapacidadLocal.setEmpleadoDiscas(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaLogic.getEmpleadoDiscas());
			
			} else {
			
				tipodiscapacidadLocal.setEmpleadoDiscas(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDiscapacidad tipodiscapacidadLocal) throws Exception {	
		if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodiscapacidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDiscapacidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodiscapacidadValidator.getInvalidValues(this.tipodiscapacidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDiscapacidad tipodiscapacidad,List<TipoDiscapacidad> tipodiscapacidads) throws Exception {
		try	{		
			TipoDiscapacidadConstantesFunciones.actualizarLista(tipodiscapacidad,tipodiscapacidads,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDiscapacidad tipodiscapacidad,List<TipoDiscapacidad> tipodiscapacidads) throws Exception {
		try	{			
			TipoDiscapacidadConstantesFunciones.actualizarSelectedLista(tipodiscapacidad,tipodiscapacidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDiscapacidad> tipodiscapacidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodiscapacidadsLocal=this.tipodiscapacidadLogic.getTipoDiscapacidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodiscapacidadsLocal=this.tipodiscapacidads;
			}
			//ARCHITECTURE
		
			for(TipoDiscapacidad tipodiscapacidadLocal:tipodiscapacidadsLocal) {
				if(this.permiteMantenimiento(tipodiscapacidadLocal) && tipodiscapacidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDiscapacidadConstantesFunciones.getTipoDiscapacidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDiscapacidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelid_empresaTipoDiscapacidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDiscapacidadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelnombreTipoDiscapacidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDiscapacidadConstantesFunciones.PORCENTAJEINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_inicialTipoDiscapacidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDiscapacidadConstantesFunciones.PORCENTAJEFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_finalTipoDiscapacidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelid_empresaTipoDiscapacidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelnombreTipoDiscapacidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_inicialTipoDiscapacidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_finalTipoDiscapacidad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoDisca")) {
			if(this.tipodiscapacidad==null) {
				this.tipodiscapacidad= new TipoDiscapacidad();
			}

			if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDiscapacidad
				this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);

				this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.getempleadodisca().setTipoDiscapacidad(this.tipodiscapacidad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDiscapacidad--;	
		
		
		this.tipodiscapacidadAux=new TipoDiscapacidad();
		
		this.tipodiscapacidadAux.setId(this.iIdNuevoTipoDiscapacidad);
		this.tipodiscapacidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodiscapacidadLogic.getTipoDiscapacidads().add(this.tipodiscapacidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodiscapacidads.add(this.tipodiscapacidadAux);
		}
		//ARCHITECTURE
		
		this.tipodiscapacidad=this.tipodiscapacidadAux;
		
		if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidad);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDiscapacidad(this.tipodiscapacidad);
		}
				
		//this.setDefaultControlesTipoDiscapacidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDiscapacidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDiscapacidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDiscapacidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDiscapacidad(this.tipodiscapacidadBean,this.tipodiscapacidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
			classes=TipoDiscapacidadConstantesFunciones.getClassesRelationshipsOfTipoDiscapacidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodiscapacidadReturnGeneral=tipodiscapacidadLogic.procesarEventosTipoDiscapacidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodiscapacidadLogic.getTipoDiscapacidads(),this.tipodiscapacidad,this.tipodiscapacidadParameterGeneral,this.isEsNuevoTipoDiscapacidad,classes);//this.tipodiscapacidadLogic.getTipoDiscapacidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDiscapacidad(this.tipodiscapacidadReturnGeneral,this.tipodiscapacidadBean,false);
		
		if(this.tipodiscapacidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad());
		}
		
		if(this.tipodiscapacidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad(),classes);//this.tipodiscapacidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDiscapacidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDiscapacidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDiscapacidad(false);
						
			if(tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.getEsGuardarRelacionado() && EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoDiscaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDiscapacidad();
			}
			
			this.actualizarVisualTableDatosTipoDiscapacidad();
			
			this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(this.getIndiceNuevoTipoDiscapacidad(), this.getIndiceNuevoTipoDiscapacidad());
			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
						
			this.actualizarEstadoCeldasBotonesTipoDiscapacidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDiscapacidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setEnabled(isHabilitar && this.tipodiscapacidadConstantesFunciones.activarnombreTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setEnabled(isHabilitar && this.tipodiscapacidadConstantesFunciones.activarporcentaje_inicialTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setEnabled(isHabilitar && this.tipodiscapacidadConstantesFunciones.activarporcentaje_finalTipoDiscapacidad);	
		//
		this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setEnabled(isHabilitar && this.tipodiscapacidadConstantesFunciones.activarid_empresaTipoDiscapacidad);
	};
	
	public void setDefaultControlesTipoDiscapacidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDiscapacidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodiscapacidadSessionBean.setConGuardarRelaciones(true);			
			this.tipodiscapacidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodiscapacidadSessionBean.setConGuardarRelaciones(false);			
			this.tipodiscapacidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDiscapacidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
				if(tipodiscapacidadAux.getId().equals(this.iIdNuevoTipoDiscapacidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidads) {
				if(tipodiscapacidadAux.getId().equals(this.iIdNuevoTipoDiscapacidad)) {
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
	
	public int getIndiceActualTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
				if(tipodiscapacidadAux.getId().equals(tipodiscapacidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidads) {
				if(tipodiscapacidadAux.getId().equals(tipodiscapacidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDiscapacidad(TipoDiscapacidad tipodiscapacidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
				if(tipodiscapacidadAux.getTipoDiscapacidadOriginal().getId().equals(tipodiscapacidadOriginal.getId())) {
					existe=true;
					tipodiscapacidadOriginal.setId(tipodiscapacidadAux.getId());
					tipodiscapacidadOriginal.setVersionRow(tipodiscapacidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidads) {
				if(tipodiscapacidadAux.getTipoDiscapacidadOriginal().getId().equals(tipodiscapacidadOriginal.getId())) {
					existe=true;
					tipodiscapacidadOriginal.setId(tipodiscapacidadAux.getId());
					tipodiscapacidadOriginal.setVersionRow(tipodiscapacidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDiscapacidad(Boolean esParaCancelar) throws Exception {
		tipodiscapacidadsAux=new ArrayList<TipoDiscapacidad>();
		tipodiscapacidadAux=new TipoDiscapacidad();
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
					if(tipodiscapacidadAux.getId()<0) {
						tipodiscapacidadsAux.add(tipodiscapacidadAux);
					}		
				}
				this.iIdNuevoTipoDiscapacidad=0L;
				this.tipodiscapacidadLogic.getTipoDiscapacidads().removeAll(tipodiscapacidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidads) {
					if(tipodiscapacidadAux.getId()<0) {
						tipodiscapacidadsAux.add(tipodiscapacidadAux);
					}		
				}
				this.iIdNuevoTipoDiscapacidad=0L;
				this.tipodiscapacidads.removeAll(tipodiscapacidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDiscapacidad 
					&& this.tipodiscapacidadLogic.getTipoDiscapacidads().size()>0
					) {
					tipodiscapacidadAux=this.tipodiscapacidadLogic.getTipoDiscapacidads().get(this.tipodiscapacidadLogic.getTipoDiscapacidads().size() - 1);
				
					if(tipodiscapacidadAux.getId()<0) {
						this.tipodiscapacidadLogic.getTipoDiscapacidads().remove(tipodiscapacidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDiscapacidad && this.tipodiscapacidads.size()>0) {
					tipodiscapacidadAux=this.tipodiscapacidads.get(this.tipodiscapacidads.size() - 1);
				
					if(tipodiscapacidadAux.getId()<0) {
						this.tipodiscapacidads.remove(tipodiscapacidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDiscapacidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodiscapacidad.getId()<0) {
				this.tipodiscapacidadLogic.getTipoDiscapacidads().remove(this.tipodiscapacidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodiscapacidad.getId()<0) {
				this.tipodiscapacidads.remove(this.tipodiscapacidad);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDiscapacidad(List<TipoDiscapacidad> tipodiscapacidadsAux) throws Exception {
		TipoDiscapacidadConstantesFunciones.setEstadosInicialesTipoDiscapacidad(tipodiscapacidadsAux);
	}
	
	public void setEstadosInicialesTipoDiscapacidad(TipoDiscapacidad tipodiscapacidadAux) throws Exception {
		TipoDiscapacidadConstantesFunciones.setEstadosInicialesTipoDiscapacidad(tipodiscapacidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDiscapacidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDiscapacidadActual()) {
				if(!this.isEsNuevoTipoDiscapacidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDiscapacidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDiscapacidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Discapacidad ?", "MANTENIMIENTO DE Tipo Discapacidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDiscapacidad tipodiscapacidad) throws Exception {
		TipoDiscapacidadConstantesFunciones.seleccionarAsignar(this.tipodiscapacidad,tipodiscapacidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDiscapacidad=this.isPermisoActualizarOriginalTipoDiscapacidad;
			
			
			this.seleccionarAsignar(tipodiscapacidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDiscapacidadConstantesFunciones.quitarEspaciosTipoDiscapacidad(this.tipodiscapacidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDiscapacidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodiscapacidadSessionBean.setsFuncionBusquedaRapida(this.tipodiscapacidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDiscapacidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDiscapacidad(esParaCancelar);				
				this.cancelarNuevoTipoDiscapacidad(esParaCancelar);								
			}
			
			this.tipodiscapacidad=new TipoDiscapacidad();
			
			this.inicializarTipoDiscapacidad();
			
			this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDiscapacidad() throws Exception {
		try {
			TipoDiscapacidadConstantesFunciones.inicializarTipoDiscapacidad(this.tipodiscapacidad);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodiscapacidadLogic.getTipoDiscapacidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDiscapacidads(String sAccionBusqueda,List<TipoDiscapacidad> tipodiscapacidadsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDiscapacidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDiscapacidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDiscapacidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDiscapacidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Discapacidades");		
		parameters.put("busquedapor", TipoDiscapacidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoDisca.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDiscapacidadLogic tipodiscapacidadLogicAuxiliar=new TipoDiscapacidadLogic();
					tipodiscapacidadLogicAuxiliar.setDatosCliente(tipodiscapacidadLogic.getDatosCliente());				
					tipodiscapacidadLogicAuxiliar.setTipoDiscapacidads(tipodiscapacidadsParaReportes);
					
					tipodiscapacidadLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDiscapacidadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodiscapacidadsParaReportes=tipodiscapacidadLogicAuxiliar.getTipoDiscapacidads();
					
					//tipodiscapacidadLogic.getNewConnexionToDeep();
					
					//for (TipoDiscapacidad tipodiscapacidad:tipodiscapacidadsParaReportes) {
					//	tipodiscapacidadLogic.deepLoad(tipodiscapacidad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodiscapacidadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodiscapacidadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoDisca = AuxiliarReportes.class.getResourceAsStream("EmpleadoDiscaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadodisca", reportFileEmpleadoDisca);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDiscapacidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDiscapacidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDiscapacidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDiscapacidad=new JRBeanArrayDataSource(TipoDiscapacidadJInternalFrame.TraerTipoDiscapacidadBeans(tipodiscapacidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDiscapacidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDiscapacidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDiscapacidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDiscapacidadBean.TraerTipoDiscapacidadBeans(tipodiscapacidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidadActionPerformed(null);
					//this.generarExcelReporteTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDiscapacidads(sAccionBusqueda,sTipoArchivoReporte,tipodiscapacidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDiscapacidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDiscapacidad> tipodiscapacidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDiscapacidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDiscapacidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDiscapacidad tipodiscapacidad : tipodiscapacidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDiscapacidadConstantesFunciones.generarExcelReporteDataTipoDiscapacidad("NORMAL",row,workbook,tipodiscapacidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDiscapacidad(String sTipo,Row row,Workbook workbook) {
		
		TipoDiscapacidadConstantesFunciones.generarExcelReporteHeaderTipoDiscapacidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDiscapacidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDiscapacidad> tipodiscapacidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDiscapacidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDiscapacidad tipodiscapacidad : tipodiscapacidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDiscapacidadConstantesFunciones.getTipoDiscapacidadDescripcion(tipodiscapacidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodiscapacidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodiscapacidad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodiscapacidad.getporcentaje_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodiscapacidad.getporcentaje_final());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDiscapacidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDiscapacidad> tipodiscapacidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDiscapacidad> tipodiscapacidadsRespaldo=null;
		
		classes=TipoDiscapacidadConstantesFunciones.getClassesRelationshipsOfTipoDiscapacidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodiscapacidadLogic.setDatosCliente(this.datosCliente);
		this.tipodiscapacidadLogic.setDatosDeep(this.datosDeep);
		this.tipodiscapacidadLogic.setIsConDeep(true);
		
		tipodiscapacidadsRespaldo=this.tipodiscapacidadLogic.getTipoDiscapacidads();
		
		this.tipodiscapacidadLogic.setTipoDiscapacidads(tipodiscapacidadsParaReportes);	
		this.tipodiscapacidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodiscapacidadsParaReportes=this.tipodiscapacidadLogic.getTipoDiscapacidads();
		this.tipodiscapacidadLogic.setTipoDiscapacidads(tipodiscapacidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDiscapacidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDiscapacidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDiscapacidad tipodiscapacidad : tipodiscapacidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDiscapacidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDiscapacidadConstantesFunciones.generarExcelReporteDataTipoDiscapacidad("NORMAL",row,workbook,tipodiscapacidad,cellStyleDataAux);
		
			
			


				//EmpleadoDisca
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodiscapacidad.getEmpleadoDiscas()!=null && tipodiscapacidad.getEmpleadoDiscas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoDiscaConstantesFunciones.generarExcelReporteHeaderEmpleadoDisca("RELACIONADO",row,workbook);
				}

				if(tipodiscapacidad.getEmpleadoDiscas()!=null) {
					i2=0;
					for(EmpleadoDisca empleadodisca : tipodiscapacidad.getEmpleadoDiscas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoDiscaConstantesFunciones.generarExcelReporteDataEmpleadoDisca("RELACIONADO",row,workbook,empleadodisca,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDiscapacidadConstantesFunciones.getTipoDiscapacidadDescripcion(tipodiscapacidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDiscapacidad() throws Exception {		
		this.startProcessTipoDiscapacidad(true);
	}
	
	public void startProcessTipoDiscapacidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDiscapacidad ,this.jPanelParametrosReportesTipoDiscapacidad, this.jScrollPanelDatosTipoDiscapacidad,this.jPanelPaginacionTipoDiscapacidad, this.jScrollPanelDatosEdicionTipoDiscapacidad, this.jPanelAccionesTipoDiscapacidad,this.jPanelAccionesFormularioTipoDiscapacidad,this.jmenuBarTipoDiscapacidad,this.jmenuBarDetalleTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDiscapacidad=this.jTabbedPaneBusquedasTipoDiscapacidad; 
		
		final JPanel jPanelParametrosReportesTipoDiscapacidad=this.jPanelParametrosReportesTipoDiscapacidad;
		//final JScrollPane jScrollPanelDatosTipoDiscapacidad=this.jScrollPanelDatosTipoDiscapacidad;
		final JTable jTableDatosTipoDiscapacidad=this.jTableDatosTipoDiscapacidad;		
		final JPanel jPanelPaginacionTipoDiscapacidad=this.jPanelPaginacionTipoDiscapacidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoDiscapacidad=this.jScrollPanelDatosEdicionTipoDiscapacidad;
		final JPanel jPanelAccionesTipoDiscapacidad=this.jPanelAccionesTipoDiscapacidad;
		
		JPanel jPanelCamposAuxiliarTipoDiscapacidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDiscapacidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			jPanelCamposAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelCamposTipoDiscapacidad;
			jPanelAccionesFormularioAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelAccionesFormularioTipoDiscapacidad;
		}
		
		final JPanel jPanelCamposTipoDiscapacidad=jPanelCamposAuxiliarTipoDiscapacidad;
		final JPanel jPanelAccionesFormularioTipoDiscapacidad=jPanelAccionesFormularioAuxiliarTipoDiscapacidad;
		
		
		final JMenuBar jmenuBarTipoDiscapacidad=this.jmenuBarTipoDiscapacidad;
		final JToolBar jTtoolBarTipoDiscapacidad=this.jTtoolBarTipoDiscapacidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDiscapacidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDiscapacidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			jmenuBarDetalleAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jmenuBarDetalleTipoDiscapacidad;
			jTtoolBarDetalleAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jTtoolBarDetalleTipoDiscapacidad;
		}
		
		final JMenuBar jmenuBarDetalleTipoDiscapacidad=jmenuBarDetalleAuxiliarTipoDiscapacidad;
		final JToolBar jTtoolBarDetalleTipoDiscapacidad=jTtoolBarDetalleAuxiliarTipoDiscapacidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDiscapacidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDiscapacidad;
			processRunnable.jTableDatos=jTableDatosTipoDiscapacidad;
			processRunnable.jPanelCampos=jPanelCamposTipoDiscapacidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDiscapacidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDiscapacidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDiscapacidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDiscapacidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDiscapacidad;
			processRunnable.jTtoolBar=jTtoolBarTipoDiscapacidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDiscapacidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDiscapacidad ,jPanelParametrosReportesTipoDiscapacidad,jTableDatosTipoDiscapacidad, /*jScrollPanelDatosTipoDiscapacidad,*/jPanelCamposTipoDiscapacidad,jPanelPaginacionTipoDiscapacidad, /*jScrollPanelDatosEdicionTipoDiscapacidad,*/ jPanelAccionesTipoDiscapacidad,jPanelAccionesFormularioTipoDiscapacidad,jmenuBarTipoDiscapacidad,jmenuBarDetalleTipoDiscapacidad,jTtoolBarTipoDiscapacidad,jTtoolBarDetalleTipoDiscapacidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDiscapacidad ,jPanelParametrosReportesTipoDiscapacidad, jScrollPanelDatosTipoDiscapacidad,jPanelPaginacionTipoDiscapacidad, jScrollPanelDatosEdicionTipoDiscapacidad, jPanelAccionesTipoDiscapacidad,jPanelAccionesFormularioTipoDiscapacidad,jmenuBarTipoDiscapacidad,jmenuBarDetalleTipoDiscapacidad,jTtoolBarTipoDiscapacidad,jTtoolBarDetalleTipoDiscapacidad);
						
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
	
	public void finishProcessTipoDiscapacidad() {// throws Exception 
		this.finishProcessTipoDiscapacidad(true);
	}
	
	public void finishProcessTipoDiscapacidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDiscapacidad ,this.jPanelParametrosReportesTipoDiscapacidad, this.jScrollPanelDatosTipoDiscapacidad,this.jPanelPaginacionTipoDiscapacidad, this.jScrollPanelDatosEdicionTipoDiscapacidad, this.jPanelAccionesTipoDiscapacidad,this.jPanelAccionesFormularioTipoDiscapacidad,this.jmenuBarTipoDiscapacidad,this.jmenuBarDetalleTipoDiscapacidad,this.jTtoolBarTipoDiscapacidad,this.jTtoolBarDetalleTipoDiscapacidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDiscapacidad=this.jTabbedPaneBusquedasTipoDiscapacidad; 
		
		final JPanel jPanelParametrosReportesTipoDiscapacidad=this.jPanelParametrosReportesTipoDiscapacidad;
		//final JScrollPane jScrollPanelDatosTipoDiscapacidad=this.jScrollPanelDatosTipoDiscapacidad;
		final JTable jTableDatosTipoDiscapacidad=this.jTableDatosTipoDiscapacidad;		
		final JPanel jPanelPaginacionTipoDiscapacidad=this.jPanelPaginacionTipoDiscapacidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoDiscapacidad=this.jScrollPanelDatosEdicionTipoDiscapacidad;
		final JPanel jPanelAccionesTipoDiscapacidad=this.jPanelAccionesTipoDiscapacidad;
		
		JPanel jPanelCamposAuxiliarTipoDiscapacidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDiscapacidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			jPanelCamposAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelCamposTipoDiscapacidad;
			jPanelAccionesFormularioAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelAccionesFormularioTipoDiscapacidad;
		}
		
		final JPanel jPanelCamposTipoDiscapacidad=jPanelCamposAuxiliarTipoDiscapacidad;
		final JPanel jPanelAccionesFormularioTipoDiscapacidad=jPanelAccionesFormularioAuxiliarTipoDiscapacidad;
		
		
		final JMenuBar jmenuBarTipoDiscapacidad=this.jmenuBarTipoDiscapacidad;		
		final JToolBar jTtoolBarTipoDiscapacidad=this.jTtoolBarTipoDiscapacidad;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDiscapacidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDiscapacidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			jmenuBarDetalleAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jmenuBarDetalleTipoDiscapacidad;
			jTtoolBarDetalleAuxiliarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jTtoolBarDetalleTipoDiscapacidad;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDiscapacidad=jmenuBarDetalleAuxiliarTipoDiscapacidad;
		final JToolBar jTtoolBarDetalleTipoDiscapacidad=jTtoolBarDetalleAuxiliarTipoDiscapacidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDiscapacidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDiscapacidad;
			processRunnable.jTableDatos=jTableDatosTipoDiscapacidad;
			processRunnable.jPanelCampos=jPanelCamposTipoDiscapacidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDiscapacidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDiscapacidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDiscapacidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDiscapacidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDiscapacidad;
			processRunnable.jTtoolBar=jTtoolBarTipoDiscapacidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDiscapacidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDiscapacidad ,jPanelParametrosReportesTipoDiscapacidad, jTableDatosTipoDiscapacidad,/*jScrollPanelDatosTipoDiscapacidad,*/jPanelCamposTipoDiscapacidad,jPanelPaginacionTipoDiscapacidad, /*jScrollPanelDatosEdicionTipoDiscapacidad,*/ jPanelAccionesTipoDiscapacidad,jPanelAccionesFormularioTipoDiscapacidad,jmenuBarTipoDiscapacidad,jmenuBarDetalleTipoDiscapacidad,jTtoolBarTipoDiscapacidad,jTtoolBarDetalleTipoDiscapacidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDiscapacidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDiscapacidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDiscapacidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDiscapacidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDiscapacidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDiscapacidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDiscapacidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDiscapacidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDiscapacidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodiscapacidadConstantesFunciones.getsFinalQueryTipoDiscapacidad();
		String  finalQueryPaginacionTodos=this.tipodiscapacidadConstantesFunciones.getsFinalQueryTipoDiscapacidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDiscapacidadConstantesFunciones.getArrayColumnasGlobalesNoTipoDiscapacidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDiscapacidadConstantesFunciones.getArrayColumnasGlobalesTipoDiscapacidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDiscapacidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodiscapacidadsEliminados= new ArrayList<TipoDiscapacidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDiscapacidad();
		
				///*TipoDiscapacidadSessionBean*/this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
			
			if(this.tipodiscapacidadSessionBean==null) {
				this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
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
					this.iNumeroPaginacion=TipoDiscapacidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDiscapacidadConstantesFunciones.getClassesForeignKeysOfTipoDiscapacidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodiscapacidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodiscapacidadsAux= new ArrayList<TipoDiscapacidad>();
			
				
			tipodiscapacidadLogic.setDatosCliente(this.datosCliente);
			tipodiscapacidadLogic.setDatosDeep(this.datosDeep);
			tipodiscapacidadLogic.setIsConDeep(true);
			
			
			tipodiscapacidadLogic.getTipoDiscapacidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodiscapacidadLogic.getTodosTipoDiscapacidads(finalQueryGlobal,pagination);
					
					//tipodiscapacidadLogic.getTodosTipoDiscapacidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodiscapacidadLogic.getTipoDiscapacidads()==null|| tipodiscapacidadLogic.getTipoDiscapacidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodiscapacidadsAux= new ArrayList<TipoDiscapacidad>();
							tipodiscapacidadsAux.addAll(tipodiscapacidadLogic.getTipoDiscapacidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodiscapacidadsAux= new ArrayList<TipoDiscapacidad>();
							tipodiscapacidadsAux.addAll(tipodiscapacidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodiscapacidadLogic.getTodosTipoDiscapacidads(finalQueryGlobal+"",this.pagination);												
							
							//tipodiscapacidadLogic.getTodosTipoDiscapacidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadLogic.getTipoDiscapacidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodiscapacidadLogic.setTipoDiscapacidads(new ArrayList<TipoDiscapacidad>());					
							tipodiscapacidadLogic.getTipoDiscapacidads().addAll(tipodiscapacidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodiscapacidads=new ArrayList<TipoDiscapacidad>();
							tipodiscapacidads.addAll(tipodiscapacidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDiscapacidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDiscapacidad=this.idActual;
				
				} else if(this.idTipoDiscapacidadActual!=null && this.idTipoDiscapacidadActual!=0L) {
					idTipoDiscapacidad=idTipoDiscapacidadActual;
				}
				
					
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndicePorId(idTipoDiscapacidad);
				
				this.tipodiscapacidads=new ArrayList<TipoDiscapacidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodiscapacidadLogic.getEntity(idTipoDiscapacidad);
					
					//tipodiscapacidadLogic.getEntityWithConnection(idTipoDiscapacidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodiscapacidadLogic.setTipoDiscapacidads(new ArrayList<TipoDiscapacidad>());
					tipodiscapacidadLogic.getTipoDiscapacidads().add(tipodiscapacidadLogic.getTipoDiscapacidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodiscapacidads=new ArrayList<TipoDiscapacidad>();
					this.tipodiscapacidads.add(tipodiscapacidad);
				}
				
				if(tipodiscapacidadLogic.getTipoDiscapacidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodiscapacidadLogic.getTipoDiscapacidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodiscapacidadLogic.getTipoDiscapacidads()==null||tipodiscapacidadLogic.getTipoDiscapacidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodiscapacidads==null|| tipodiscapacidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadsAux=new ArrayList<TipoDiscapacidad>();
						tipodiscapacidadsAux.addAll(tipodiscapacidadLogic.getTipoDiscapacidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodiscapacidadsAux=new ArrayList<TipoDiscapacidad>();
							tipodiscapacidadsAux.addAll(tipodiscapacidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodiscapacidadLogic.getTipoDiscapacidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDiscapacidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDiscapacidads("FK_IdEmpresa",tipodiscapacidadLogic.getTipoDiscapacidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDiscapacidads("FK_IdEmpresa",tipodiscapacidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadLogic.setTipoDiscapacidads(new ArrayList<TipoDiscapacidad>());
						tipodiscapacidadLogic.getTipoDiscapacidads().addAll(tipodiscapacidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodiscapacidads=new ArrayList<TipoDiscapacidad>();
							tipodiscapacidads.addAll(tipodiscapacidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDiscapacidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDiscapacidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodiscapacidadLogic.getTipoDiscapacidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodiscapacidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodiscapacidadLogic.getTipoDiscapacidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodiscapacidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDiscapacidad tipodiscapacidad) {
		Boolean permite=true;
		
		if(this.tipodiscapacidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDiscapacidadConstantesFunciones.getOrderByListaTipoDiscapacidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDiscapacidadConstantesFunciones.getOrderByListaTipoDiscapacidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadLogic.getTipoDiscapacidads()) {
				if(tipodiscapacidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipodiscapacidadTotales=tipodiscapacidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDiscapacidad tipodiscapacidad:this.tipodiscapacidads) {
				if(tipodiscapacidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipodiscapacidadTotales=tipodiscapacidad;
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
			this.tipodiscapacidadAux=new TipoDiscapacidad();
			this.tipodiscapacidadAux.setsType(Constantes2.S_TOTALES);
			this.tipodiscapacidadAux.setIsNew(false);
			this.tipodiscapacidadAux.setIsChanged(false);
			this.tipodiscapacidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDiscapacidadConstantesFunciones.TotalizarValoresFilaTipoDiscapacidad(this.tipodiscapacidadLogic.getTipoDiscapacidads(),this.tipodiscapacidadAux);
				
				this.tipodiscapacidadLogic.getTipoDiscapacidads().add(this.tipodiscapacidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDiscapacidadConstantesFunciones.TotalizarValoresFilaTipoDiscapacidad(this.tipodiscapacidads,this.tipodiscapacidadAux);
				
				this.tipodiscapacidads.add(this.tipodiscapacidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodiscapacidadTotales=new TipoDiscapacidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodiscapacidadLogic.getTipoDiscapacidads().remove(tipodiscapacidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodiscapacidads.remove(tipodiscapacidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodiscapacidadTotales=new TipoDiscapacidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadLogic.getTipoDiscapacidads()) {
				if(tipodiscapacidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipodiscapacidadTotales=tipodiscapacidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDiscapacidadConstantesFunciones.TotalizarValoresFilaTipoDiscapacidad(this.tipodiscapacidadLogic.getTipoDiscapacidads(),tipodiscapacidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDiscapacidad tipodiscapacidad:this.tipodiscapacidads) {
				if(tipodiscapacidad.getsType().equals(Constantes2.S_TOTALES)) {
					tipodiscapacidadTotales=tipodiscapacidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDiscapacidadConstantesFunciones.TotalizarValoresFilaTipoDiscapacidad(this.tipodiscapacidads,tipodiscapacidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDiscapacidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDiscapacidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodiscapacidadLogic.getTipoDiscapacidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDiscapacidad() {
		this.isPermisoTodoTipoDiscapacidad=false;
		this.isPermisoNuevoTipoDiscapacidad=false;
		this.isPermisoActualizarTipoDiscapacidad=false;
		this.isPermisoActualizarOriginalTipoDiscapacidad=false;
		this.isPermisoEliminarTipoDiscapacidad=false;
		this.isPermisoGuardarCambiosTipoDiscapacidad=false;
		this.isPermisoConsultaTipoDiscapacidad=false;
		this.isPermisoBusquedaTipoDiscapacidad=false;
		this.isPermisoReporteTipoDiscapacidad=false;		
		this.isPermisoOrdenTipoDiscapacidad=false;		
		this.isPermisoPaginacionMedioTipoDiscapacidad=false;		
		this.isPermisoPaginacionAltoTipoDiscapacidad=false;
		this.isPermisoPaginacionTodoTipoDiscapacidad=false;
		this.isPermisoCopiarTipoDiscapacidad=false;		
		this.isPermisoVerFormTipoDiscapacidad=false;		
		this.isPermisoDuplicarTipoDiscapacidad=false;		
		this.isPermisoOrdenTipoDiscapacidad=false;		
	}
	
	public void setPermisosUsuarioTipoDiscapacidad(Boolean isPermiso) {
		this.isPermisoTodoTipoDiscapacidad=isPermiso;
		this.isPermisoNuevoTipoDiscapacidad=isPermiso;
		this.isPermisoActualizarTipoDiscapacidad=isPermiso;
		this.isPermisoActualizarOriginalTipoDiscapacidad=isPermiso;
		this.isPermisoEliminarTipoDiscapacidad=isPermiso;
		this.isPermisoGuardarCambiosTipoDiscapacidad=isPermiso;
		this.isPermisoConsultaTipoDiscapacidad=isPermiso;
		this.isPermisoBusquedaTipoDiscapacidad=isPermiso;
		this.isPermisoReporteTipoDiscapacidad=isPermiso;
		this.isPermisoOrdenTipoDiscapacidad=isPermiso;		
		this.isPermisoPaginacionMedioTipoDiscapacidad=isPermiso;		
		this.isPermisoPaginacionAltoTipoDiscapacidad=isPermiso;		
		this.isPermisoPaginacionTodoTipoDiscapacidad=isPermiso;		
		this.isPermisoCopiarTipoDiscapacidad=isPermiso;		
		this.isPermisoVerFormTipoDiscapacidad=isPermiso;		
		this.isPermisoDuplicarTipoDiscapacidad=isPermiso;
		this.isPermisoOrdenTipoDiscapacidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDiscapacidad(Boolean isPermiso) {
		//this.isPermisoTodoTipoDiscapacidad=isPermiso;
		this.isPermisoNuevoTipoDiscapacidad=isPermiso;
		this.isPermisoActualizarTipoDiscapacidad=isPermiso;
		this.isPermisoActualizarOriginalTipoDiscapacidad=isPermiso;
		this.isPermisoEliminarTipoDiscapacidad=isPermiso;
		this.isPermisoGuardarCambiosTipoDiscapacidad=isPermiso;
		//this.isPermisoConsultaTipoDiscapacidad=isPermiso;
		//this.isPermisoBusquedaTipoDiscapacidad=isPermiso;
		//this.isPermisoReporteTipoDiscapacidad=isPermiso;
		//this.isPermisoOrdenTipoDiscapacidad=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDiscapacidad=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDiscapacidad=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDiscapacidad=isPermiso;		
		//this.isPermisoCopiarTipoDiscapacidad=isPermiso;		
		//this.isPermisoDuplicarTipoDiscapacidad=isPermiso;
		//this.isPermisoOrdenTipoDiscapacidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDiscapacidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoDiscaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDiscapacidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoDisca=false;
		this.isTienePermisosEmpleadoDisca=this.verificarGetPermisosUsuarioOpcionTipoDiscapacidadClaseRelacionada(this.opcionsRelacionadas,EmpleadoDiscaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDiscapacidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDiscapacidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoDisca=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDiscapacidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDiscapacidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDiscapacidadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoDisca && this.jInternalFrameDetalleFormTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.remove(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDiscapacidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDiscapacidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDiscapacidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDiscapacidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDiscapacidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDiscapacidad=this.isPermisoActualizarTipoDiscapacidad;
			this.isPermisoEliminarTipoDiscapacidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDiscapacidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDiscapacidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDiscapacidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDiscapacidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDiscapacidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDiscapacidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDiscapacidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDiscapacidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDiscapacidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDiscapacidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDiscapacidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDiscapacidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDiscapacidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDiscapacidad.setToolTipText(this.jTableDatosTipoDiscapacidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDiscapacidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDiscapacidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDiscapacidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDiscapacidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDiscapacidad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoDisca && this.tipodiscapacidadConstantesFunciones.mostrarEmpleadoDiscaTipoDiscapacidad && !TipoDiscapacidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Disca");
			reporte.setsDescripcion("Empleado Disca");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoDiscapacidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDiscapacidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDiscapacidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDiscapacidadListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoDiscapacidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDiscapacidadParameterReturnGeneral tipodiscapacidadReturnGeneral=new TipoDiscapacidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodiscapacidadConstantesFunciones.cargarid_empresaTipoDiscapacidad)
					 || (this.esRecargarFks && this.tipodiscapacidadConstantesFunciones.cargarid_empresaTipoDiscapacidad)) {

					if(!this.tipodiscapacidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodiscapacidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodiscapacidadReturnGeneral=tipodiscapacidadLogic.cargarCombosLoteForeignKeyTipoDiscapacidad(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodiscapacidadReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDiscapacidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodiscapacidadSessionBean==null) {
				this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
			}

			if(!this.tipodiscapacidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDiscapacidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDiscapacidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDiscapacidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDiscapacidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDiscapacidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDiscapacidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDiscapacidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDiscapacidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDiscapacidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDiscapacidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDiscapacidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDiscapacidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDiscapacidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDiscapacidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDiscapacidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean(); 
		this.tipodiscapacidadConstantesFunciones=new TipoDiscapacidadConstantesFunciones(); 
		this.tipodiscapacidadBean=new TipoDiscapacidad();//(this.tipodiscapacidadConstantesFunciones); 		
		this.tipodiscapacidadReturnGeneral=new TipoDiscapacidadParameterReturnGeneral(); 
		
		this.tipodiscapacidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodiscapacidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDiscapacidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDiscapacidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDiscapacidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDiscapacidad(true);
			
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
			
			this.tipodiscapacidadConstantesFunciones=new TipoDiscapacidadConstantesFunciones(); 
			this.tipodiscapacidadBean=new TipoDiscapacidad();//this.tipodiscapacidadConstantesFunciones); 			
			this.tipodiscapacidadReturnGeneral=new TipoDiscapacidadParameterReturnGeneral(); 
		
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Discapacidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipodiscapacidad=new TipoDiscapacidad();
			this.tipodiscapacidads = new ArrayList<TipoDiscapacidad>();
			this.tipodiscapacidadsAux = new ArrayList<TipoDiscapacidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic=new TipoDiscapacidadLogic();
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodiscapacidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodiscapacidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDiscapacidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDiscapacidad);	
					}
					
					if(this.jInternalFrameImportacionTipoDiscapacidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDiscapacidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDiscapacidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDiscapacidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDiscapacidad);
				this.jInternalFrameDetalleFormTipoDiscapacidad.setVisible(false);
				this.jInternalFrameDetalleFormTipoDiscapacidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDiscapacidad);
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDiscapacidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDiscapacidad);
					this.jInternalFrameImportacionTipoDiscapacidad.setVisible(false);
					this.jInternalFrameImportacionTipoDiscapacidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDiscapacidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDiscapacidad);
					this.jInternalFrameOrderByTipoDiscapacidad.setVisible(false);
					this.jInternalFrameOrderByTipoDiscapacidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDiscapacidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDiscapacidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodiscapacidadReturnGeneral=new TipoDiscapacidadParameterReturnGeneral();
			
			this.tipodiscapacidadParameterGeneral=new TipoDiscapacidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodiscapacidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDiscapacidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoDiscaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDiscapacidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),this.tipodiscapacidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDiscapacidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),this.tipodiscapacidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaDuplicarTipoDiscapacidad=true;
			this.isVisibilidadCeldaCopiarTipoDiscapacidad=true;
			this.isVisibilidadCeldaVerFormTipoDiscapacidad=true;
			this.isVisibilidadCeldaOrdenTipoDiscapacidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDiscapacidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDiscapacidad(false);
			
			this.setPermisosUsuarioTipoDiscapacidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodiscapacidadSessionBean.getEsGuardarRelacionado() && this.tipodiscapacidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDiscapacidadClasesRelacionadas();
			}
			
			if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDiscapacidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDiscapacidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDiscapacidad();
			}
			
			if(!this.isPermisoBusquedaTipoDiscapacidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDiscapacidad,this.isPermisoPaginacionMedioTipoDiscapacidad,this.isPermisoPaginacionTodoTipoDiscapacidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDiscapacidadConstantesFunciones.getTiposSeleccionarTipoDiscapacidad());
				
				this.tiposColumnasSelect=TipoDiscapacidadConstantesFunciones.getTiposSeleccionarTipoDiscapacidad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDiscapacidad();				
				//this.tiposRelacionesSelect=TipoDiscapacidadConstantesFunciones.getTiposRelacionesTipoDiscapacidad(true);
				
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
			//if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDiscapacidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoDiscapacidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoDiscapacidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDiscapacidad() ;
			
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
			
			
			this.empleadodiscaLogic=new EmpleadoDiscaLogic(); 
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
				tipodiscapacidadImplementable= (TipoDiscapacidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDiscapacidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodiscapacidadImplementableHome= (TipoDiscapacidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDiscapacidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodiscapacidads= new ArrayList<TipoDiscapacidad>();
			this.tipodiscapacidadsEliminados= new ArrayList<TipoDiscapacidad>();
						
			this.isEsNuevoTipoDiscapacidad=false;
			this.esParaAccionDesdeFormularioTipoDiscapacidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDiscapacidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDiscapacidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDiscapacidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDiscapacidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDiscapacidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDiscapacidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDiscapacidad();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDiscapacidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDiscapacidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDiscapacidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDiscapacidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDiscapacidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDiscapacidad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDiscapacidad")) {
				iIndex=this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Discas")) {
					if(!EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDiscapacidad();

						this.cargarParteTabPanelRelacionadaEmpleadoDisca(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDiscapacidad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoDisca(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDiscapacidad.cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(false,true,iIndex);
		this.jButtonEmpleadoDiscaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoDisca();

		//this.jTabbedPaneRelacionesTipoDiscapacidad.updateUI();
		//this.jTabbedPaneRelacionesTipoDiscapacidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDiscapacidad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoDisca")) {
				int row=this.jTableDatosTipoDiscapacidad.getSelectedRow();
				jButtonEmpleadoDiscaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Disca")) {

					if(this.isTienePermisosEmpleadoDisca && this.tipodiscapacidadConstantesFunciones.mostrarEmpleadoDiscaTipoDiscapacidad && !TipoDiscapacidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Discas"+"("+EmpleadoDiscaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Discas");

						if(tipodiscapacidadConstantesFunciones.resaltarEmpleadoDiscaTipoDiscapacidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodiscapacidadConstantesFunciones.resaltarEmpleadoDiscaTipoDiscapacidad);
						}

						jmenuItem.setEnabled(this.tipodiscapacidadConstantesFunciones.activarEmpleadoDiscaTipoDiscapacidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoDisca"));

						

						this.jInternalFrameDetalleFormTipoDiscapacidad.jmenuDetalleTipoDiscapacidad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDiscapacidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDiscapacidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDiscapacidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDiscapacidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDiscapacidad();
		
		this.cargarCombosFrameForeignKeyTipoDiscapacidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDiscapacidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDiscapacidad();
		}
	}
	
	
	
	public void jButtonNuevoTipoDiscapacidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			
			if(jTableDatosTipoDiscapacidad.getRowCount()>=1) {
				jTableDatosTipoDiscapacidad.removeRowSelectionInterval(0, jTableDatosTipoDiscapacidad.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDiscapacidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDiscapacidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDiscapacidad(true);			
			//this.tipodiscapacidad=new TipoDiscapacidad();
			//this.tipodiscapacidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDiscapacidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad() ;
			
			if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDiscapacidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodiscapacidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);				
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDiscapacidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDiscapacidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDiscapacidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDiscapacidad.getSelectedRows().length;			
			}
			
			tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDiscapacidad--;			
				//TipoDiscapacidad tipodiscapacidadAux= new TipoDiscapacidad();			
				//tipodiscapacidadAux.setId(this.iIdNuevoTipoDiscapacidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDiscapacidad tipodiscapacidadOrigen=new TipoDiscapacidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDiscapacidad tipodiscapacidadOrigen : tipodiscapacidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodiscapacidadOrigen =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodiscapacidadOrigen =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDiscapacidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodiscapacidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDiscapacidad(tipodiscapacidadOrigen,this.tipodiscapacidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodiscapacidadLogic.getTipoDiscapacidads().add(this.tipodiscapacidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidads.add(this.tipodiscapacidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
				
				this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(this.getIndiceNuevoTipoDiscapacidad(), this.getIndiceNuevoTipoDiscapacidad());
				
				int iLastRow =  this.jTableDatosTipoDiscapacidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDiscapacidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDiscapacidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();									
		
			TipoDiscapacidad tipodiscapacidadOrigen=new TipoDiscapacidad();
			TipoDiscapacidad tipodiscapacidadDestino=new TipoDiscapacidad();
				
			tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDiscapacidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodiscapacidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDiscapacidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadOrigen =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodiscapacidadOrigen =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodiscapacidadDestino =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodiscapacidadDestino =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodiscapacidadOrigen =tipodiscapacidadsSeleccionados.get(0);
				tipodiscapacidadDestino =tipodiscapacidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDiscapacidad(tipodiscapacidadOrigen,tipodiscapacidadDestino,true,false);
				
				tipodiscapacidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodiscapacidadDestino,tipodiscapacidadLogic.getTipoDiscapacidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodiscapacidadDestino,tipodiscapacidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
				
				//this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(this.getIndiceNuevoTipoDiscapacidad(), this.getIndiceNuevoTipoDiscapacidad());
				
				int iLastRow =  this.jTableDatosTipoDiscapacidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDiscapacidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDiscapacidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDiscapacidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDiscapacidad.setVisible(!isVisible);
			this.jPanelPaginacionTipoDiscapacidad.setVisible(!isVisible);
			this.jPanelAccionesTipoDiscapacidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDiscapacidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDiscapacidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDiscapacidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDiscapacidad();
			
			this.abrirFrameOrderByTipoDiscapacidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDiscapacidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDiscapacidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDiscapacidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDiscapacidad.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDiscapacidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDiscapacidad.setSize(this.jInternalFrameDetalleFormTipoDiscapacidad.iWidthFormulario,this.jInternalFrameDetalleFormTipoDiscapacidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDiscapacidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDiscapacidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDiscapacidad.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDiscapacidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDiscapacidad.jContentPaneDetalleTipoDiscapacidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDiscapacidad.jContentPaneDetalleTipoDiscapacidad.getWidth(),TipoDiscapacidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDiscapacidad.jContentPaneDetalleTipoDiscapacidad.getWidth(),TipoDiscapacidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDiscapacidad.jContentPaneDetalleTipoDiscapacidad.getWidth(),TipoDiscapacidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoDisca();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDiscapacidad.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDiscapacidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDiscapacidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDiscapacidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDiscapacidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDiscapacidad,false,this);
				} else {
					this.jInternalFrameOrderByTipoDiscapacidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDiscapacidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDiscapacidad);
				this.jInternalFrameOrderByTipoDiscapacidad.setVisible(false);
				this.jInternalFrameOrderByTipoDiscapacidad.setSelected(false);
				
				this.jInternalFrameOrderByTipoDiscapacidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDiscapacidad"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDiscapacidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDiscapacidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDiscapacidad==null) {
				
				this.jInternalFrameImportacionTipoDiscapacidad=new ImportacionJInternalFrame(TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDiscapacidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDiscapacidad);
				this.jInternalFrameImportacionTipoDiscapacidad.setVisible(false);
				this.jInternalFrameImportacionTipoDiscapacidad.setSelected(false);


				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDiscapacidad"));
				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDiscapacidad"));
				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDiscapacidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDiscapacidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDiscapacidad==null) {
				this.jInternalFrameReporteDinamicoTipoDiscapacidad=new ReporteDinamicoJInternalFrame(TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDiscapacidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDiscapacidad);
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDiscapacidad"));
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDiscapacidad"));
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDiscapacidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDiscapacidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoDisca() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoDisca.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDiscapacidad.jContentPaneDetalleTipoDiscapacidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoDisca.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoDisca.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoDisca.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDiscapacidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDiscapacidad);
			
	       	this.jInternalFrameDetalleFormTipoDiscapacidad.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDiscapacidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDiscapacidad.dispose();
			//this.jInternalFrameDetalleFormTipoDiscapacidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDiscapacidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDiscapacidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDiscapacidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDiscapacidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDiscapacidad.setVisible(true);
	        this.jInternalFrameImportacionTipoDiscapacidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDiscapacidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDiscapacidad.setVisible(true);
	        this.jInternalFrameOrderByTipoDiscapacidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDiscapacidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDiscapacidad.setVisible(false);
	        this.jInternalFrameOrderByTipoDiscapacidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDiscapacidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDiscapacidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDiscapacidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDiscapacidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDiscapacidad.setVisible(false);
	        this.jInternalFrameImportacionTipoDiscapacidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDiscapacidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDiscapacidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDiscapacidad(true);
			//this.isEsNuevoTipoDiscapacidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDiscapacidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDiscapacidad(false) ;
			
			if(tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.getEsGuardarRelacionado() && EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoDiscaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDiscapacidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDiscapacidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDiscapacidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDiscapacidad(true);
			//this.isEsNuevoTipoDiscapacidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodiscapacidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDiscapacidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDiscapacidad(false) ;
			
			if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDiscapacidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDiscapacidad(false);
			
			//if(!this.isEsNuevoTipoDiscapacidad) {								
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				
			}
			
			if(this.permiteMantenimiento(this.tipodiscapacidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDiscapacidad=true;
					this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
					this.isEsNuevoTipoDiscapacidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDiscapacidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDiscapacidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDiscapacidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(false);
				
				this.habilitarDeshabilitarControlesTipoDiscapacidad(false);
			
												
				
				if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDiscapacidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDiscapacidadActionPerformed(evt,tipodiscapacidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDiscapacidad(this.tipodiscapacidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodiscapacidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodiscapacidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				this.tipodiscapacidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				this.tipodiscapacidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodiscapacidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDiscapacidadModel) this.jTableDatosTipoDiscapacidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDiscapacidad=true;
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
				this.isEsNuevoTipoDiscapacidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDiscapacidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(false);
				
				this.habilitarDeshabilitarControlesTipoDiscapacidad(false);
				
				
				
				if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDiscapacidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDiscapacidad.getRowCount()>=1) {
				jTableDatosTipoDiscapacidad.removeRowSelectionInterval(0, jTableDatosTipoDiscapacidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDiscapacidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDiscapacidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(false) ;
			
			this.isEsNuevoTipoDiscapacidad=false;
			
			if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDiscapacidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDiscapacidad(false);
				
				//SI ES MANUAL
				if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDiscapacidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDiscapacidad--;			
			//TipoDiscapacidad tipodiscapacidadAux= new TipoDiscapacidad();			
			//tipodiscapacidadAux.setId(this.iIdNuevoTipoDiscapacidad);
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDiscapacidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
			
			this.tipodiscapacidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodiscapacidadLogic.getTipoDiscapacidads().add(this.tipodiscapacidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodiscapacidads.add(this.tipodiscapacidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			
			this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(this.getIndiceNuevoTipoDiscapacidad(), this.getIndiceNuevoTipoDiscapacidad());
			
			int iLastRow =  this.jTableDatosTipoDiscapacidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDiscapacidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDiscapacidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDiscapacidad(false);
			
			//SI ES MANUAL
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDiscapacidad();
			}
			
			//this.abrirFrameTreeTipoDiscapacidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DiscapacidadES ?", "MANTENIMIENTO DE Tipo Discapacidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDiscapacidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDiscapacidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodiscapacidadReturnGeneral=tipodiscapacidadLogic.procesarImportacionTipoDiscapacidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodiscapacidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDiscapacidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDiscapacidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDiscapacidad.setFileImportacion(this.jInternalFrameImportacionTipoDiscapacidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDiscapacidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDiscapacidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDiscapacidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDiscapacidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		

		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDiscapacidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDiscapacidadBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeFinal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					sNombreCampoCategoria="porcentaje_inicial";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL:
					sNombreCampoCategoria="porcentaje_final";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					sNombreCampoCategoriaValor="porcentaje_inicial";
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL:
					sNombreCampoCategoriaValor="porcentaje_final";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_inicial");
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_final");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDiscapacidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodiscapacidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodiscapacidad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL);
					iRow++;

					for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodiscapacidad.getporcentaje_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL);
					iRow++;

					for(TipoDiscapacidad tipodiscapacidad:tipodiscapacidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodiscapacidad.getporcentaje_final());
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
			//	this.getFilaCabeceraExportarExcelTipoDiscapacidad(row);				
			//	iRow++;
			//}				
			
			//for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDiscapacidad(tipodiscapacidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDiscapacidad(false);
			
			//SI ES MANUAL
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDiscapacidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDiscapacidad(false);
			
			//SI ES MANUAL
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDiscapacidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDiscapacidad(false);
			
			//SI ES MANUAL
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDiscapacidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDiscapacidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDiscapacidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDiscapacidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDiscapacidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDiscapacidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDiscapacidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDiscapacidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDiscapacidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDiscapacidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDiscapacidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDiscapacidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDiscapacidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDiscapacidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDiscapacidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDiscapacidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDiscapacidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDiscapacidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDiscapacidad();
		
		this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDiscapacidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDiscapacidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDiscapacidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDiscapacidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDiscapacidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDiscapacidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDiscapacidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionNuevoTipoDiscapacidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionSinCerrarTipoDiscapacidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionSinMensajeTipoDiscapacidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDiscapacidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDiscapacidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDiscapacidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionNuevoTipoDiscapacidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionSinCerrarTipoDiscapacidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDiscapacidad.jCheckBoxPostAccionSinMensajeTipoDiscapacidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDiscapacidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDiscapacidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDiscapacidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDiscapacidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDiscapacidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDiscapacidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDiscapacidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDiscapacidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDiscapacidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDiscapacidad(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDiscapacidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDiscapacidad() throws Exception {
		try	{
			if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDiscapacidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDiscapacidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDiscapacidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDiscapacidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDiscapacidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDiscapacidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDiscapacidad.addItem(reporte);
			}
			
			
			if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDiscapacidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDiscapacidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDiscapacidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDiscapacidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDiscapacidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDiscapacidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDiscapacidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDiscapacidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDiscapacidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoDiscapacidadConstantesFunciones.getTiposSeleccionarTipoDiscapacidad(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoDiscapacidadConstantesFunciones.getTiposSeleccionarTipoDiscapacidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoDiscapacidadConstantesFunciones.getTiposSeleccionarTipoDiscapacidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDiscapacidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDiscapacidad(Boolean esInicializar) throws Exception {				
		if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDiscapacidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDiscapacidad() throws Exception {
		this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDiscapacidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDiscapacidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDiscapacidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodiscapacidadLogic.getTipoDiscapacidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodiscapacidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDiscapacidad.setModel(new TipoDiscapacidadModel(this.tipodiscapacidadLogic.getTipoDiscapacidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDiscapacidad.setModel(new TipoDiscapacidadModel(this.tipodiscapacidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDiscapacidad!=null && this.jInternalFrameOrderByTipoDiscapacidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDiscapacidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,tipodiscapacidadConstantesFunciones.resaltarSeleccionarTipoDiscapacidad,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDiscapacidadConstantesFunciones.SCLASSWEBTITULO,tipodiscapacidadConstantesFunciones.resaltarSeleccionarTipoDiscapacidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,TipoDiscapacidadConstantesFunciones.LABEL_ID));

		if(this.tipodiscapacidadConstantesFunciones.mostraridTipoDiscapacidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDiscapacidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodiscapacidadConstantesFunciones.resaltaridTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activaridTipoDiscapacidad,iSizeTabla,this,true,"idTipoDiscapacidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodiscapacidadConstantesFunciones.resaltaridTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activaridTipoDiscapacidad,this,true,"idTipoDiscapacidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodiscapacidadConstantesFunciones.mostrarid_empresaTipoDiscapacidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodiscapacidadConstantesFunciones.resaltarid_empresaTipoDiscapacidad,this,this.tipodiscapacidadConstantesFunciones.activarid_empresaTipoDiscapacidad,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodiscapacidadConstantesFunciones.resaltarid_empresaTipoDiscapacidad,this,this.tipodiscapacidadConstantesFunciones.activarid_empresaTipoDiscapacidad,false,"id_empresaTipoDiscapacidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodiscapacidadConstantesFunciones.mostrarnombreTipoDiscapacidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodiscapacidadConstantesFunciones.resaltarnombreTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarnombreTipoDiscapacidad,iSizeTabla,this,true,"nombreTipoDiscapacidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodiscapacidadConstantesFunciones.resaltarnombreTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarnombreTipoDiscapacidad,this,true,"nombreTipoDiscapacidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL));

		if(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_inicialTipoDiscapacidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_inicialTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarporcentaje_inicialTipoDiscapacidad,iSizeTabla,this,true,"porcentaje_inicialTipoDiscapacidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_inicialTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarporcentaje_inicialTipoDiscapacidad,this,true,"porcentaje_inicialTipoDiscapacidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL));

		if(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_finalTipoDiscapacidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_finalTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarporcentaje_finalTipoDiscapacidad,iSizeTabla,this,true,"porcentaje_finalTipoDiscapacidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_finalTipoDiscapacidad,this.tipodiscapacidadConstantesFunciones.activarporcentaje_finalTipoDiscapacidad,this,true,"porcentaje_finalTipoDiscapacidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDiscapacidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoDisca && this.tipodiscapacidadConstantesFunciones.mostrarEmpleadoDiscaTipoDiscapacidad && !TipoDiscapacidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Discas");
				tableColumn.setHeaderValue("Empleado Discas");
				tableColumn.setCellRenderer(new EmpleadoDiscaTableCell(tipodiscapacidadConstantesFunciones.resaltarEmpleadoDiscaTipoDiscapacidad,this,this.tipodiscapacidadConstantesFunciones.activarEmpleadoDiscaTipoDiscapacidad));
				tableColumn.setCellEditor(new EmpleadoDiscaTableCell(tipodiscapacidadConstantesFunciones.resaltarEmpleadoDiscaTipoDiscapacidad,this,this.tipodiscapacidadConstantesFunciones.activarEmpleadoDiscaTipoDiscapacidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDiscapacidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDiscapacidad.moveColumn(this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDiscapacidad.moveColumn(this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDiscapacidad.moveColumn(this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDiscapacidad.moveColumn(this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDiscapacidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDiscapacidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDiscapacidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDiscapacidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDiscapacidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDiscapacidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDiscapacidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodiscapacidadLogic.getTipoDiscapacidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodiscapacidads.size()-1;
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
		//this.jTableDatosTipoDiscapacidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDiscapacidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDiscapacidad();
			
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
				
				//this.isEsNuevoTipoDiscapacidad=false;
					
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
				if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDiscapacidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDiscapacidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodiscapacidad.getsType().equals("DUPLICADO")
				   || this.tipodiscapacidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDiscapacidad=true;
				
				} else {
					this.isEsNuevoTipoDiscapacidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodiscapacidad.getId()>=0 && !this.tipodiscapacidad.getIsNew()) {						
						this.isEsNuevoTipoDiscapacidad=false;
						
					} else {
						this.isEsNuevoTipoDiscapacidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDiscapacidad(esRelaciones);						
				
				this.seleccionarTipoDiscapacidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodiscapacidad.getId()<0) {
					this.isEsNuevoTipoDiscapacidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDiscapacidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDiscapacidad(evt,rowIndex);
				}	
				
				if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDiscapacidad: " + this.dDif); 
					}
				}								
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDiscapacidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodiscapacidad)) {
					if(this.tipodiscapacidad.getId()>0) {
						this.tipodiscapacidad.setIsDeleted(true);
						
						this.tipodiscapacidadsEliminados.add(this.tipodiscapacidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodiscapacidadLogic.getTipoDiscapacidads().remove(this.tipodiscapacidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidads.remove(this.tipodiscapacidad);				
					}
					
					
					((TipoDiscapacidadModel) this.jTableDatosTipoDiscapacidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDiscapacidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDiscapacidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDiscapacidad) {
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDiscapacidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDiscapacidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodiscapacidadConstantesFunciones.cargarid_empresaTipoDiscapacidad || this.tipodiscapacidadConstantesFunciones.event_dependid_empresaTipoDiscapacidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodiscapacidad.getid_empresa());
									//this.inicializarActualizarBindingTipoDiscapacidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodiscapacidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodiscapacidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodiscapacidad.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDiscapacidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDiscapacidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDiscapacidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDiscapacidad(tipodiscapacidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDiscapacidad(tipodiscapacidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDiscapacidad(tipodiscapacidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDiscapacidad(tipodiscapacidad);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setText(tipodiscapacidad.getId().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setText(tipodiscapacidad.getnombre());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setText(tipodiscapacidad.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setText(tipodiscapacidad.getporcentaje_final().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDiscapacidad tipodiscapacidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodiscapacidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDiscapacidad tipodiscapacidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodiscapacidadLocal=this.tipodiscapacidad;
			} else {
				tipodiscapacidadLocal=this.tipodiscapacidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodiscapacidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDiscapacidad(tipodiscapacidadLocal,true);
					
					if(tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodiscapacidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodiscapacidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDiscapacidad(tipodiscapacidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(tipodiscapacidad);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDiscapacidad(tipodiscapacidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.getText()==null || this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.getText()=="" || this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setText("0");
			}

			if(conColumnasBase) {tipodiscapacidad.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDiscapacidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelIdTipoDiscapacidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodiscapacidad.setnombre(this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelnombreTipoDiscapacidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodiscapacidad.setporcentaje_inicial(Double.parseDouble(this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_inicialTipoDiscapacidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodiscapacidad.setporcentaje_final(Double.parseDouble(this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelporcentaje_finalTipoDiscapacidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDiscapacidad(TipoDiscapacidad tipodiscapacidadBean,TipoDiscapacidad tipodiscapacidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDiscapacidad(TipoDiscapacidad tipodiscapacidadOrigen,TipoDiscapacidad tipodiscapacidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodiscapacidadOrigen.getId()!=null && !tipodiscapacidadOrigen.getId().equals(0L))) {tipodiscapacidad.setId(tipodiscapacidadOrigen.getId());}}
			if(conDefault || (!conDefault && tipodiscapacidadOrigen.getnombre()!=null && !tipodiscapacidadOrigen.getnombre().equals(""))) {tipodiscapacidad.setnombre(tipodiscapacidadOrigen.getnombre());}
			if(conDefault || (!conDefault && tipodiscapacidadOrigen.getporcentaje_inicial()!=null && !tipodiscapacidadOrigen.getporcentaje_inicial().equals(0.0))) {tipodiscapacidad.setporcentaje_inicial(tipodiscapacidadOrigen.getporcentaje_inicial());}
			if(conDefault || (!conDefault && tipodiscapacidadOrigen.getporcentaje_final()!=null && !tipodiscapacidadOrigen.getporcentaje_final().equals(0.0))) {tipodiscapacidad.setporcentaje_final(tipodiscapacidadOrigen.getporcentaje_final());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setText(tipodiscapacidad.getId().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setText(tipodiscapacidad.getnombre());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setText(tipodiscapacidad.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setText(tipodiscapacidad.getporcentaje_final().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDiscapacidad(TipoDiscapacidadBean tipodiscapacidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setText(tipodiscapacidadBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setText(tipodiscapacidadBean.getnombre());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setText(tipodiscapacidadBean.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setText(tipodiscapacidadBean.getporcentaje_final().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDiscapacidad(TipoDiscapacidadParameterReturnGeneral tipodiscapacidadReturnGeneral,TipoDiscapacidadBean tipodiscapacidadBean,Boolean conDefault) throws Exception { 
		try {
			TipoDiscapacidad tipodiscapacidadLocal=new TipoDiscapacidad();
			
			tipodiscapacidadLocal=tipodiscapacidadReturnGeneral.getTipoDiscapacidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodiscapacidadLocal.getId()!=null && !tipodiscapacidadLocal.getId().equals(0L))) {tipodiscapacidadBean.setId(tipodiscapacidadLocal.getId());}}
			if(conDefault || (!conDefault && tipodiscapacidadLocal.getnombre()!=null && !tipodiscapacidadLocal.getnombre().equals(""))) {tipodiscapacidadBean.setnombre(tipodiscapacidadLocal.getnombre());}
			if(conDefault || (!conDefault && tipodiscapacidadLocal.getporcentaje_inicial()!=null && !tipodiscapacidadLocal.getporcentaje_inicial().equals(0.0))) {tipodiscapacidadBean.setporcentaje_inicial(tipodiscapacidadLocal.getporcentaje_inicial());}
			if(conDefault || (!conDefault && tipodiscapacidadLocal.getporcentaje_final()!=null && !tipodiscapacidadLocal.getporcentaje_final().equals(0.0))) {tipodiscapacidadBean.setporcentaje_final(tipodiscapacidadLocal.getporcentaje_final());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDiscapacidadGenerico(Long idTipoDiscapacidadSeleccionado,JComboBox jComboBoxTipoDiscapacidad,List<TipoDiscapacidad> tipodiscapacidadsLocal)throws Exception {
		try {
			TipoDiscapacidad  tipodiscapacidadTemp=null;

			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsLocal) {
				if(tipodiscapacidadAux.getId()!=null && tipodiscapacidadAux.getId().equals(idTipoDiscapacidadSeleccionado)) {
					tipodiscapacidadTemp=tipodiscapacidadAux;
					break;
				}
			}

			jComboBoxTipoDiscapacidad.setSelectedItem(tipodiscapacidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDiscapacidadGenerico(JComboBox jComboBoxTipoDiscapacidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDiscapacidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDiscapacidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDiscapacidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDiscapacidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDiscapacidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDiscapacidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoDisca")) {
			jButtonEmpleadoDiscaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodiscapacidad=(TipoDiscapacidad) tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodiscapacidad =(TipoDiscapacidad) tipodiscapacidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodiscapacidad.getIsNew() && !tipodiscapacidad.getIsChanged() && !tipodiscapacidad.getIsDeleted()) {
				sDescripcion=tipodiscapacidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodiscapacidad.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDiscapacidad tipodiscapacidadRow=new TipoDiscapacidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodiscapacidadRow=(TipoDiscapacidad) tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodiscapacidadRow=(TipoDiscapacidad) tipodiscapacidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoDiscaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDiscapacidad tipodiscapacidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad = (TipoDiscapacidad)this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodiscapacidad = (TipoDiscapacidad)this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodiscapacidad!=null) {
						this.tipodiscapacidad = tipodiscapacidad;
					} else {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}
				}

				if(this.isTienePermisosEmpleadoDisca && this.permiteMantenimiento(this.tipodiscapacidad)) {
					EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup=new EmpleadoDiscaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadodiscaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup;
					} else {
						empleadodiscaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame;
					}

					List<TipoDiscapacidad> tipodiscapacidads=new ArrayList<TipoDiscapacidad>();
					tipodiscapacidads.add(this.tipodiscapacidad);
					if(!esRelacionado) {
						//empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setConGuardarRelaciones(false);
						//empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadodiscaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDiscapacidad.cargarEmpleadoDiscaBeanSwingJInternalFrame(tipodiscapacidads,this.tipodiscapacidad,empleadodiscaBeanSwingJInternalFrame,/*conInicializar,*/empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.getConGuardarRelaciones(),empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.getEsGuardarRelacionado());
					empleadodiscaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadodiscaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoDisca("no_relacionado");

						empleadodiscaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoDiscaConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoDiscaConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadodiscaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDiscapacidad=(TitledBorder)this.jScrollPanelDatosTipoDiscapacidad.getBorder();
						TitledBorder titledBorderEmpleadoDisca=(TitledBorder)empleadodiscaBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoDisca.getBorder();

						titledBorderEmpleadoDisca.setTitle(titledBorderTipoDiscapacidad.getTitle() + " -> Empleado Disca");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadodiscaBeanSwingJInternalFrame);
						}

						empleadodiscaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadodiscaBeanSwingJInternalFrame);

						empleadodiscaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Disca",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDiscapacidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));			
			this.jButtonDuplicarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaDuplicarTipoDiscapacidad && this.isPermisoDuplicarTipoDiscapacidad));			
			this.jButtonCopiarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaCopiarTipoDiscapacidad && this.isPermisoCopiarTipoDiscapacidad));
			this.jButtonVerFormTipoDiscapacidad.setVisible((this.isVisibilidadCeldaVerFormTipoDiscapacidad && this.isPermisoVerFormTipoDiscapacidad));
			
			this.jButtonAbrirOrderByTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));			
			
			this.jButtonNuevoRelacionesTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));			
			this.jButtonNuevoGuardarCambiosTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaModificarTipoDiscapacidad && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaActualizarTipoDiscapacidad && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaEliminarTipoDiscapacidad && this.isPermisoEliminarTipoDiscapacidad));
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.setVisible(this.isVisibilidadCeldaCancelarTipoDiscapacidad);							
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));						
			this.jButtonDuplicarToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaDuplicarTipoDiscapacidad && this.isPermisoDuplicarTipoDiscapacidad));						
			this.jButtonCopiarToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaCopiarTipoDiscapacidad && this.isPermisoCopiarTipoDiscapacidad));			
			this.jButtonVerFormToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaVerFormTipoDiscapacidad && this.isPermisoVerFormTipoDiscapacidad));			
			this.jButtonAbrirOrderByToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));
			this.jButtonNuevoRelacionesToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));			
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaModificarTipoDiscapacidad && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaActualizarTipoDiscapacidad  && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaEliminarTipoDiscapacidad && this.isPermisoEliminarTipoDiscapacidad));
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarToolBarTipoDiscapacidad.setVisible(this.isVisibilidadCeldaCancelarTipoDiscapacidad);				
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));			
			this.jMenuItemDuplicarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaDuplicarTipoDiscapacidad && this.isPermisoDuplicarTipoDiscapacidad));			
			this.jMenuItemCopiarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaCopiarTipoDiscapacidad && this.isPermisoCopiarTipoDiscapacidad));			
			this.jMenuItemVerFormTipoDiscapacidad.setVisible((this.isVisibilidadCeldaVerFormTipoDiscapacidad && this.isPermisoVerFormTipoDiscapacidad));			
			this.jMenuItemAbrirOrderByTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));			
			//this.jMenuItemMostrarOcultarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));
			this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));			
			//this.jMenuItemDetalleMostrarOcultarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaOrdenTipoDiscapacidad && this.isPermisoOrdenTipoDiscapacidad));			
			this.jMenuItemNuevoRelacionesTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad));			
			this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad.setVisible((this.isVisibilidadCeldaNuevoTipoDiscapacidad && this.isPermisoNuevoTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));									
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemModificarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaModificarTipoDiscapacidad && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemActualizarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaActualizarTipoDiscapacidad && this.isPermisoActualizarTipoDiscapacidad));	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemEliminarTipoDiscapacidad.setVisible((this.isVisibilidadCeldaEliminarTipoDiscapacidad && this.isPermisoEliminarTipoDiscapacidad));
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemCancelarTipoDiscapacidad.setVisible(this.isVisibilidadCeldaCancelarTipoDiscapacidad);				
			}
			
			this.jMenuItemGuardarCambiosTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));						
			this.jMenuItemGuardarCambiosTablaTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=this.jButtonNuevoTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDiscapacidad=this.jButtonDuplicarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaCopiarTipoDiscapacidad=this.jButtonCopiarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaVerFormTipoDiscapacidad=this.jButtonVerFormTipoDiscapacidad.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDiscapacidad=this.jButtonAbrirOrderByTipoDiscapacidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=this.jButtonNuevoRelacionesTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaModificarTipoDiscapacidad=this.jButtonModificarTipoDiscapacidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaGuardarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=this.jButtonGuardarCambiosTablaTipoDiscapacidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=this.jButtonNuevoToolBarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=this.jButtonNuevoRelacionesToolBarTipoDiscapacidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.isVisibilidadCeldaModificarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarToolBarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarToolBarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarToolBarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarToolBarTipoDiscapacidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDiscapacidad=this.jButtonGuardarCambiosToolBarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=this.jMenuItemNuevoTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=this.jMenuItemNuevoRelacionesTipoDiscapacidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.isVisibilidadCeldaModificarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemModificarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemActualizarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemEliminarTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemCancelarTipoDiscapacidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDiscapacidad=this.jMenuItemGuardarCambiosTipoDiscapacidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=this.jMenuItemGuardarCambiosTablaTipoDiscapacidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDiscapacidad(Boolean esInicializar) {
		if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDiscapacidad();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDiscapacidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDiscapacidad() {
		this.jButtonNuevoTipoDiscapacidad.setVisible(this.isPermisoNuevoTipoDiscapacidad);			
		this.jButtonDuplicarTipoDiscapacidad.setVisible(this.isPermisoDuplicarTipoDiscapacidad);			
		this.jButtonCopiarTipoDiscapacidad.setVisible(this.isPermisoCopiarTipoDiscapacidad);			
		this.jButtonVerFormTipoDiscapacidad.setVisible(this.isPermisoVerFormTipoDiscapacidad);			
		
		this.jButtonAbrirOrderByTipoDiscapacidad.setVisible(this.isPermisoOrdenTipoDiscapacidad);					
		
		this.jButtonNuevoRelacionesTipoDiscapacidad.setVisible(this.isPermisoNuevoTipoDiscapacidad);			
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarTipoDiscapacidad.setVisible(this.isPermisoActualizarTipoDiscapacidad);	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.setVisible(this.isPermisoActualizarTipoDiscapacidad);	
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.setVisible(this.isPermisoEliminarTipoDiscapacidad);
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.setVisible(this.isVisibilidadCeldaCancelarTipoDiscapacidad);						
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.setVisible(this.isPermisoGuardarCambiosTipoDiscapacidad);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.setVisible(this.isPermisoActualizarTipoDiscapacidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDiscapacidad() {
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarTipoDiscapacidad.setVisible(this.isPermisoActualizarTipoDiscapacidad);	
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.setVisible(this.isPermisoActualizarTipoDiscapacidad);	
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.setVisible(this.isPermisoEliminarTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.setVisible(this.isVisibilidadCeldaCancelarTipoDiscapacidad);							
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.setVisible((this.isVisibilidadCeldaGuardarTipoDiscapacidad && this.isPermisoGuardarCambiosTipoDiscapacidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDiscapacidad() {
		if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDiscapacidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDiscapacidad() {
	}
	
	public void jTableDatosTipoDiscapacidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDiscapacidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDiscapacidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodiscapacidad==null) {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}

					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				}

				if(this.tipodiscapacidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodiscapacidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDiscapacidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDiscapacidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDiscapacidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDiscapacidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDiscapacidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodiscapacidadLogic.getConnexion());

				if(this.tipodiscapacidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodiscapacidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDiscapacidad=(TitledBorder)this.jScrollPanelDatosTipoDiscapacidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDiscapacidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDiscapacidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodiscapacidad==null) {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}

					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				}

				if(this.tipodiscapacidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodiscapacidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDiscapacidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDiscapacidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodiscapacidad==null) {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}

					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				}

				if(this.tipodiscapacidad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodiscapacidad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDiscapacidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_inicialTipoDiscapacidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodiscapacidad==null) {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}

					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				}

				if(this.tipodiscapacidad.getporcentaje_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_inicial = "+this.tipodiscapacidad.getporcentaje_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDiscapacidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_finalTipoDiscapacidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.gettipodiscapacidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodiscapacidad==null) {
						this.tipodiscapacidad = new TipoDiscapacidad();
					}

					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);
				}

				if(this.tipodiscapacidad.getporcentaje_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_final = "+this.tipodiscapacidad.getporcentaje_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDiscapacidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoDiscapacidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);

			this.getTipoDiscapacidadsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDiscapacidad(false);

			//if(TipoDiscapacidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodiscapacidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDiscapacidad() {
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDiscapacidad.dispose();
			this.jInternalFrameDetalleFormTipoDiscapacidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
			this.jInternalFrameReporteDinamicoTipoDiscapacidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDiscapacidad.dispose();
			this.jInternalFrameReporteDinamicoTipoDiscapacidad=null;
		}
		
		if(this.jInternalFrameImportacionTipoDiscapacidad!=null) {
			this.jInternalFrameImportacionTipoDiscapacidad.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDiscapacidad.dispose();
			this.jInternalFrameImportacionTipoDiscapacidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDiscapacidad();
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDiscapacidad")) {
				jButtonDuplicarTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDiscapacidad")) {
				jButtonCopiarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDiscapacidad")) {
				jButtonVerFormTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDiscapacidad")) {
				jButtonDuplicarTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDiscapacidad")) {
				jButtonDuplicarTipoDiscapacidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDiscapacidad")) {
				jButtonModificarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDiscapacidad")) {
				jButtonModificarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDiscapacidad")) {
				jButtonModificarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDiscapacidad")) {
				jButtonActualizarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDiscapacidad")) {
				jButtonActualizarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDiscapacidad")) {
				jButtonActualizarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDiscapacidad")) {
				jButtonEliminarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDiscapacidad")) {
				jButtonEliminarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDiscapacidad")) {
				jButtonEliminarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDiscapacidad")) {
				jButtonCancelarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDiscapacidad")) {
				jButtonCancelarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDiscapacidad")) {
				jButtonCancelarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDiscapacidad")) {
				jButtonCerrarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDiscapacidad")) {
				jButtonCerrarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDiscapacidad")) {
				jButtonCerrarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDiscapacidad")) {
				jButtonMostrarOcultarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDiscapacidad")) {
				jButtonCancelarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDiscapacidad")) {
				jButtonCopiarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDiscapacidad")) {
				jButtonVerFormTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDiscapacidad")) {
				jButtonCopiarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDiscapacidad")) {
				jButtonVerFormTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDiscapacidad")) {
				jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDiscapacidad")) {
				jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDiscapacidad")) {
				jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDiscapacidad")) {
				jButtonAnterioresTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDiscapacidad")) {
				jButtonAnterioresTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDiscapacidad")) {
				jButtonAnterioresTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDiscapacidad")) {
				jButtonSiguientesTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDiscapacidad")) {
				jButtonSiguientesTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDiscapacidad")) {
				jButtonSiguientesTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDiscapacidad") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDiscapacidad")) {
				jButtonAbrirOrderByTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDiscapacidad") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDiscapacidad")) {
				jButtonMostrarOcultarTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDiscapacidad")) {
				jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDiscapacidad")) {
				jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDiscapacidad")) {
				jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDiscapacidad")) {
				jButtonCerrarReporteDinamicoTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDiscapacidad")) {
				jButtonGenerarReporteDinamicoTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDiscapacidad")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDiscapacidad")) {
				jButtonCerrarImportacionTipoDiscapacidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDiscapacidad")) {
				
				jButtonGenerarImportacionTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDiscapacidad")) {
				
				jButtonAbrirImportacionTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDiscapacidad")) {
				jComboBoxTiposAccionesTipoDiscapacidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDiscapacidad")) {
				jComboBoxTiposRelacionesTipoDiscapacidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDiscapacidad")) {
				jComboBoxTiposAccionesTipoDiscapacidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDiscapacidad")) {
				
				jComboBoxTiposSeleccionarTipoDiscapacidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDiscapacidad")) {
				jTextFieldValorCampoGeneralTipoDiscapacidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDiscapacidad")) {
				jButtonAbrirOrderByTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDiscapacidad")) {
				jButtonAbrirOrderByTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDiscapacidad")) {
				jButtonCerrarOrderByTipoDiscapacidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDiscapacidadBusqueda")) {
				this.jButtonidTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDiscapacidadUpdate")) {
				this.jButtonid_empresaTipoDiscapacidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDiscapacidadBusqueda")) {
				this.jButtonid_empresaTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDiscapacidadBusqueda")) {
				this.jButtonnombreTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_inicialTipoDiscapacidadBusqueda")) {
				this.jButtonporcentaje_inicialTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_finalTipoDiscapacidadBusqueda")) {
				this.jButtonporcentaje_finalTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDiscapacidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDiscapacidad tipodiscapacidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodiscapacidadLocal=this.tipodiscapacidad;
			} else {
				tipodiscapacidadLocal=this.tipodiscapacidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
							
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
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
			
			


			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
								
						
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
								
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
							
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
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
			
			


			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
								
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDiscapacidad")) {
					jCheckBoxSeleccionarTodosTipoDiscapacidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDiscapacidad")) {
					jCheckBoxSeleccionadosTipoDiscapacidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDiscapacidad")) {
					
				}
				
				


				
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
												
				
				


				
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
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
			
			


			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDiscapacidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodiscapacidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodiscapacidad);
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
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
				
				


				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDiscapacidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDiscapacidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDiscapacidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodiscapacidadAnterior =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDiscapacidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDiscapacidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDiscapacidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodiscapacidad =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodiscapacidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDiscapacidad")) {
				
				}
				
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDiscapacidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDiscapacidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDiscapacidad")) {
			
			}
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDiscapacidad();
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDiscapacidad")) {
				jButtonDuplicarTipoDiscapacidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDiscapacidad")) {
				jButtonCopiarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDiscapacidad")) {
				jButtonVerFormTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDiscapacidad")) {
				jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDiscapacidad")) {
				jButtonModificarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDiscapacidad")) {
				jButtonActualizarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDiscapacidad")) {
				jButtonEliminarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDiscapacidad")) {
				jButtonCancelarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDiscapacidad")) {
				jButtonCerrarTipoDiscapacidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDiscapacidad")) {
				jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDiscapacidad")) {
				jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDiscapacidad")) {
				jButtonAbrirOrderByTipoDiscapacidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDiscapacidad")) {
				jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDiscapacidad")) {
				jButtonAnterioresTipoDiscapacidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDiscapacidad")) {
				jButtonSiguientesTipoDiscapacidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDiscapacidadBusqueda")) {
				this.jButtonidTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDiscapacidadUpdate")) {
				this.jButtonid_empresaTipoDiscapacidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDiscapacidadBusqueda")) {
				this.jButtonid_empresaTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDiscapacidadBusqueda")) {
				this.jButtonnombreTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_inicialTipoDiscapacidadBusqueda")) {
				this.jButtonporcentaje_inicialTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_finalTipoDiscapacidadBusqueda")) {
				this.jButtonporcentaje_finalTipoDiscapacidadBusquedaActionPerformed(evt);
			}
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDiscapacidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDiscapacidad")) {
				closingInternalFrameTipoDiscapacidad();
				
			} else if(sTipo.equals("jButtonCancelarTipoDiscapacidad")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDiscapacidad = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDiscapacidadBeanSwingJInternalFrame jInternalFrameParent=(TipoDiscapacidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDiscapacidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDiscapacidadActionPerformed(null);
			}
			
			TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodiscapacidad,new Object(),this.tipodiscapacidadParameterGeneral,this.tipodiscapacidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDiscapacidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDiscapacidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDiscapacidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodiscapacidad)) {
			if(!esControlTabla) {
				if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);			
				}
				
				if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodiscapacidadReturnGeneral=tipodiscapacidadLogic.procesarEventosTipoDiscapacidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodiscapacidadLogic.getTipoDiscapacidads(),this.tipodiscapacidad,this.tipodiscapacidadParameterGeneral,this.isEsNuevoTipoDiscapacidad,classes);//this.tipodiscapacidadLogic.getTipoDiscapacidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDiscapacidad(this.tipodiscapacidadReturnGeneral,this.tipodiscapacidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDiscapacidad(classes,this.tipodiscapacidadReturnGeneral,this.tipodiscapacidadBean,false);
					}
						
					if(this.tipodiscapacidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad());	
					}
						
					if(this.tipodiscapacidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad(),classes);//this.tipodiscapacidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDiscapacidad(this.tipodiscapacidad,classes);//this.tipodiscapacidadBean);									
				}
			
				if(TipoDiscapacidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDiscapacidad(this.tipodiscapacidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDiscapacidad(this.tipodiscapacidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodiscapacidadAnterior!=null) {
						this.tipodiscapacidad=this.tipodiscapacidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodiscapacidadReturnGeneral=tipodiscapacidadLogic.procesarEventosTipoDiscapacidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodiscapacidadLogic.getTipoDiscapacidads(),this.tipodiscapacidad,this.tipodiscapacidadParameterGeneral,this.isEsNuevoTipoDiscapacidad,classes);//this.tipodiscapacidadLogic.getTipoDiscapacidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodiscapacidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodiscapacidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad(),tipodiscapacidadLogic.getTipoDiscapacidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad(),this.tipodiscapacidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDiscapacidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDiscapacidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDiscapacidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDiscapacidad() throws Exception {
		
		TipoDiscapacidadModel tipodiscapacidadModel=(TipoDiscapacidadModel)this.jTableDatosTipoDiscapacidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodiscapacidadModel.tipodiscapacidads=this.tipodiscapacidadLogic.getTipoDiscapacidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodiscapacidadModel.tipodiscapacidads=this.tipodiscapacidads;
		}
		
		
		((TipoDiscapacidadModel) this.jTableDatosTipoDiscapacidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDiscapacidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodiscapacidadAnterior(),this.tipodiscapacidadLogic.getTipoDiscapacidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodiscapacidadAnterior(),this.tipodiscapacidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDiscapacidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoDisca.class)) {
					this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaLogic.setEmpleadoDiscas(tipodiscapacidad.getEmpleadoDiscas());
					this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoDisca(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
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
										
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodiscapacidad,new Object(),generalEntityParameterGeneral,this.tipodiscapacidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDiscapacidadConstantesFunciones.getClassesRelationshipsOfTipoDiscapacidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDiscapacidadConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDiscapacidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDiscapacidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDiscapacidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodiscapacidad,new Object(),generalEntityParameterGeneral,this.tipodiscapacidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDiscapacidad(TipoDiscapacidadBean tipodiscapacidadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoDisca.class)) {
					this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaLogic.setEmpleadoDiscas(tipodiscapacidad.getEmpleadoDiscas());
					this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoDisca(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDiscapacidad(ArrayList<Classe> classes,TipoDiscapacidadReturnGeneral tipodiscapacidadReturnGeneral,TipoDiscapacidadBean tipodiscapacidadBean,Boolean conDefault) throws Exception {
		
			this.tipodiscapacidadBean.setEmpleadoDiscas(tipodiscapacidadReturnGeneral.getTipoDiscapacidad().getEmpleadoDiscas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoDisca.class)) {
					tipodiscapacidad.setEmpleadoDiscas(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaBeanSwingJInternalFrame.empleadodiscaLogic.getEmpleadoDiscas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodiscapacidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDiscapacidad = new TipoDiscapacidadDetalleFormJInternalFrame(jDesktopPane,this.tipodiscapacidadSessionBean.getConGuardarRelaciones(),this.tipodiscapacidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.setVisible(false);
		this.jInternalFrameDetalleFormTipoDiscapacidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.tipodiscapacidadLogic=this.tipodiscapacidadLogic;
		
		this.cargarCombosFrameForeignKeyTipoDiscapacidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDiscapacidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDiscapacidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDiscapacidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDiscapacidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDiscapacidad"));
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ModificarTipoDiscapacidad"));

		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDiscapacidad"));
					
		this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemModificarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDiscapacidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoDiscapacidad"));
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDiscapacidad"));
						
		this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemActualizarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDiscapacidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"EliminarTipoDiscapacidad"));
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDiscapacidad"));
								
		this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemEliminarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDiscapacidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CancelarTipoDiscapacidad"));
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDiscapacidad"));
					
		this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemCancelarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDiscapacidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemDetalleCerrarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDiscapacidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDiscapacidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDiscapacidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDiscapacidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonidTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDiscapacidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonnombreTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_finalTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalTipoDiscapacidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDiscapacidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDiscapacidad"));
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDiscapacidad"));
		}
		
		this.jTableDatosTipoDiscapacidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDiscapacidad"));
		
		this.jTableDatosTipoDiscapacidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDiscapacidad"));
		
		this.jButtonNuevoTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"NuevoTipoDiscapacidad"));
		
		this.jButtonDuplicarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"DuplicarTipoDiscapacidad"));
		
		this.jButtonCopiarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"CopiarTipoDiscapacidad"));
		
		this.jButtonVerFormTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"VerFormTipoDiscapacidad"));
		
		
		this.jButtonNuevoToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDiscapacidad"));
			
		this.jButtonDuplicarToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDiscapacidad"));
			
		this.jMenuItemNuevoTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDiscapacidad"));
			
		this.jMenuItemDuplicarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDiscapacidad"));		
		
		
		this.jButtonNuevoRelacionesTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDiscapacidad"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDiscapacidad"));
			
		this.jMenuItemNuevoRelacionesTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDiscapacidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ModificarTipoDiscapacidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonModificarToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDiscapacidad"));
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemModificarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDiscapacidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoDiscapacidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonActualizarToolBarTipoDiscapacidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDiscapacidad"));
				
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemActualizarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDiscapacidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"EliminarTipoDiscapacidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonEliminarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDiscapacidad"));
						
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemEliminarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDiscapacidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CancelarTipoDiscapacidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonCancelarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDiscapacidad"));
			
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemCancelarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDiscapacidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDiscapacidad"));		
		
		
		this.jButtonCerrarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CerrarTipoDiscapacidad"));
		
		
		this.jButtonCerrarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDiscapacidad"));
			
		this.jMenuItemCerrarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDiscapacidad"));
			
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jMenuItemDetalleCerrarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDiscapacidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDiscapacidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDiscapacidad"));
		}
		
		this.jButtonCopiarToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDiscapacidad"));
			
		this.jButtonVerFormToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDiscapacidad"));
		
		this.jMenuItemGuardarCambiosTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDiscapacidad"));
			
		this.jMenuItemCopiarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDiscapacidad"));		
		
		this.jMenuItemVerFormTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDiscapacidad"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDiscapacidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDiscapacidad"));
			
		this.jMenuItemGuardarCambiosTablaTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDiscapacidad"));		
		
		
		
		this.jButtonRecargarInformacionTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDiscapacidad"));
					
		this.jButtonRecargarInformacionToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDiscapacidad"));
		
		this.jMenuItemRecargarInformacionTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDiscapacidad"));		
		
		
		
		this.jButtonAnterioresTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"AnterioresTipoDiscapacidad"));
		
		
		this.jButtonAnterioresToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDiscapacidad"));
		
		this.jMenuItemAnterioresTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDiscapacidad"));		
		
		
		this.jButtonSiguientesTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"SiguientesTipoDiscapacidad"));
		
		
		this.jButtonSiguientesToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDiscapacidad"));
			
		this.jMenuItemSiguientesTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDiscapacidad"));
			
		this.jMenuItemAbrirOrderByTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDiscapacidad"));
			
		this.jMenuItemMostrarOcultarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDiscapacidad"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDiscapacidad"));
			
		this.jMenuItemDetalleMostarOcultarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDiscapacidad"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDiscapacidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDiscapacidad"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDiscapacidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDiscapacidad"));

		this.jCheckBoxSeleccionadosTipoDiscapacidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDiscapacidad"));
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDiscapacidad"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDiscapacidad"));
			
		this.jComboBoxTiposAccionesTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDiscapacidad"));
					
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDiscapacidad"));
			
		this.jTextFieldValorCampoGeneralTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDiscapacidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonidTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDiscapacidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonnombreTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_finalTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalTipoDiscapacidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDiscapacidad!=null) {
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDiscapacidad"));
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDiscapacidad"));
				this.jInternalFrameReporteDinamicoTipoDiscapacidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDiscapacidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDiscapacidad"));				
			//this.jButtonGenerarReporteDinamicoTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDiscapacidad"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDiscapacidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDiscapacidad!=null) {
				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDiscapacidad"));
				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDiscapacidad"));
				this.jInternalFrameImportacionTipoDiscapacidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDiscapacidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDiscapacidad"));
			
			this.jButtonAbrirOrderByToolBarTipoDiscapacidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDiscapacidad"));			
			
			if(this.jInternalFrameOrderByTipoDiscapacidad!=null) {
				this.jInternalFrameOrderByTipoDiscapacidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDiscapacidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDiscapacidad.jTabbedPaneRelacionesTipoDiscapacidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDiscapacidad"));
		
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
            		closingInternalFrameTipoDiscapacidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDiscapacidad = (JInternalFrameBase)event.getSource();
	            	
	            TipoDiscapacidadBeanSwingJInternalFrame jInternalFrameParent=(TipoDiscapacidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDiscapacidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDiscapacidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDiscapacidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDiscapacidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDiscapacidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDiscapacidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDiscapacidad";
		inputMap = this.jButtonNuevoTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDiscapacidad";
		inputMap = this.jButtonNuevoRelacionesTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDiscapacidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDiscapacidad";
		inputMap = this.jButtonModificarTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDiscapacidad";
		inputMap = this.jButtonActualizarTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDiscapacidad";
		inputMap = this.jButtonEliminarTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDiscapacidad";
		inputMap = this.jButtonCancelarTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDiscapacidad";
		inputMap = this.jButtonCerrarTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDiscapacidad";
		inputMap = this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonGuardarCambiosTipoDiscapacidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDiscapacidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDiscapacidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDiscapacidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDiscapacidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDiscapacidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDiscapacidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDiscapacidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDiscapacidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDiscapacidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonidTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDiscapacidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonid_empresaTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonnombreTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_inicialTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialTipoDiscapacidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDiscapacidad.jButtonporcentaje_finalTipoDiscapacidadBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalTipoDiscapacidadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDiscapacidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDiscapacidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDiscapacidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDiscapacidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDiscapacidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
					tipodiscapacidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidads) {
					tipodiscapacidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDiscapacidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
						tipodiscapacidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidads) {
						tipodiscapacidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDiscapacidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDiscapacidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDiscapacidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDiscapacidad.getSelectedRows();
			
			TipoDiscapacidad tipodiscapacidadLocal=new TipoDiscapacidad();
			
			//this.seleccionarTodosTipoDiscapacidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodiscapacidadLocal =(TipoDiscapacidad) this.tipodiscapacidadLogic.getTipoDiscapacidads().toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodiscapacidadLocal =(TipoDiscapacidad) this.tipodiscapacidads.toArray()[this.jTableDatosTipoDiscapacidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodiscapacidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
						tipodiscapacidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidads) {
						tipodiscapacidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDiscapacidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDiscapacidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDiscapacidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDiscapacidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDiscapacidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDiscapacidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDiscapacidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidadLogic.getTipoDiscapacidads()) {
				
						if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodiscapacidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL)) {
							existe=true;
							tipodiscapacidadAux.setporcentaje_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL)) {
							existe=true;
							tipodiscapacidadAux.setporcentaje_final(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidads) {
					
						if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodiscapacidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL)) {
							existe=true;
							tipodiscapacidadAux.setporcentaje_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL)) {
							existe=true;
							tipodiscapacidadAux.setporcentaje_final(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDiscapacidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDiscapacidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDiscapacidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDiscapacidad) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDiscapacidad(conSplash);
				
					this.generarReporteTipoDiscapacidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDiscapacidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDiscapacidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDiscapacidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDiscapacidad();
				
				this.exportarTipoDiscapacidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDiscapacidads();
				//this.importarTipoDiscapacidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDiscapacidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDiscapacidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Discapacidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDiscapacidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDiscapacidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDiscapacidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDiscapacidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxTiposAccionesFormularioTipoDiscapacidad.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDiscapacidad();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDiscapacidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDiscapacidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDiscapacidad();
			
			if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
			TipoDiscapacidad tipodiscapacidad=new TipoDiscapacidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDiscapacidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDiscapacidad.getSelectedItem();
			
			
			
			
			tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodiscapacidadsSeleccionados.size()==1) {
				for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
					tipodiscapacidad=tipodiscapacidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Disca")) {
					jButtonEmpleadoDiscaActionPerformed(null,rowIndex,true,false,tipodiscapacidad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDiscapacidad();
			
      		//this.finishProcessTipoDiscapacidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDiscapacidadReturnGeneral() throws Exception {
		if(this.tipodiscapacidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodiscapacidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodiscapacidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodiscapacidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodiscapacidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodiscapacidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDiscapacidad(false);
		}
		
		if(this.tipodiscapacidadReturnGeneral.getConRetornoLista() || this.tipodiscapacidadReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodiscapacidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodiscapacidadLogic.setTipoDiscapacidads(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodiscapacidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodiscapacidadLogic.setTipoDiscapacidad(this.tipodiscapacidadReturnGeneral.getTipoDiscapacidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDiscapacidad(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDiscapacidad() throws Exception {
		
		
	}
	
	public ArrayList<TipoDiscapacidad> getTipoDiscapacidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDiscapacidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadLogic.getTipoDiscapacidads()) {
					if(tipodiscapacidadAux.getIsSelected()) {
						tipodiscapacidadsSeleccionados.add(tipodiscapacidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDiscapacidad tipodiscapacidadAux:this.tipodiscapacidads) {
					if(tipodiscapacidadAux.getIsSelected()) {
						tipodiscapacidadsSeleccionados.add(tipodiscapacidadAux);				
					}
				}
			}
			
			if(tipodiscapacidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodiscapacidadsSeleccionados.addAll(this.tipodiscapacidadLogic.getTipoDiscapacidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodiscapacidadsSeleccionados.addAll(this.tipodiscapacidads);				
					}
				}
			}
		} else {
			tipodiscapacidadsSeleccionados.add(this.tipodiscapacidad);
		}
		
		return tipodiscapacidadsSeleccionados;
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
	
	public void generarReporteTipoDiscapacidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDiscapacidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDiscapacidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDiscapacidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDiscapacidadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDiscapacidadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Discapacidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDiscapacidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDiscapacidad();
		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDiscapacidad();
		
		
		//this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados ,tipodiscapacidadImplementable,tipodiscapacidadImplementableHome);
	}
	
	public void mostrarImportacionTipoDiscapacidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDiscapacidad();
		
		this.abrirFrameImportacionTipoDiscapacidad();		
		
			
		//this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados ,tipodiscapacidadImplementable,tipodiscapacidadImplementableHome);
	}
	
	public void importarTipoDiscapacidads() throws Exception {		
	
	}
	
	public void exportarTipoDiscapacidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDiscapacidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDiscapacidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDiscapacidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Discapacidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDiscapacidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDiscapacidad(tipodiscapacidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodiscapacidadAux.setsDetalleGeneralEntityReporte(tipodiscapacidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDiscapacidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodiscapacidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodiscapacidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodiscapacidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodiscapacidad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodiscapacidad.getporcentaje_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodiscapacidad.getporcentaje_final().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDiscapacidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDiscapacidad(row);				
				iRow++;
			}				
			
			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDiscapacidad(tipodiscapacidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDiscapacidadsSeleccionados() throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();		
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodiscapacidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodiscapacidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodiscapacidad");
			//elementRoot.appendChild(element);
		
			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
				element = document.createElement("tipodiscapacidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDiscapacidad(tipodiscapacidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Discapacidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDiscapacidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDiscapacidadConstantesFunciones.LABEL_PORCENTAJEFINAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodiscapacidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodiscapacidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodiscapacidad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodiscapacidad.getporcentaje_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodiscapacidad.getporcentaje_final());				
	}
	
	public void setFilaDatosExportarXmlTipoDiscapacidad(TipoDiscapacidad tipodiscapacidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDiscapacidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodiscapacidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDiscapacidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodiscapacidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDiscapacidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodiscapacidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoDiscapacidadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodiscapacidad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje_inicial = document.createElement(TipoDiscapacidadConstantesFunciones.PORCENTAJEINICIAL);
		elementporcentaje_inicial.appendChild(document.createTextNode(tipodiscapacidad.getporcentaje_inicial().toString().trim()));
		element.appendChild(elementporcentaje_inicial);

		Element elementporcentaje_final = document.createElement(TipoDiscapacidadConstantesFunciones.PORCENTAJEFINAL);
		elementporcentaje_final.appendChild(document.createTextNode(tipodiscapacidad.getporcentaje_final().toString().trim()));
		element.appendChild(elementporcentaje_final);
	}
	
	public void generarReporteGroupGenericoTipoDiscapacidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados=new ArrayList<TipoDiscapacidad>();
		
		tipodiscapacidadsSeleccionados=this.getTipoDiscapacidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDiscapacidad(tipodiscapacidadsSeleccionados);
		
		this.generarReporteTipoDiscapacidads("Todos",tipodiscapacidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDiscapacidad(ArrayList<TipoDiscapacidad> tipodiscapacidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsSeleccionados) {
				tipodiscapacidadAux.setsDetalleGeneralEntityReporte(tipodiscapacidadAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodiscapacidadAux.setsDescripcionGeneralEntityReporte1(tipodiscapacidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDiscapacidadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodiscapacidadAux.setsDescripcionGeneralEntityReporte1(tipodiscapacidadAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDiscapacidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDiscapacidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDiscapacidad=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=true;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=true;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=true;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=true;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=true;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
			this.isVisibilidadCeldaModificarTipoDiscapacidad=true;
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
			this.isVisibilidadCeldaCancelarTipoDiscapacidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDiscapacidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDiscapacidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=true;
		} else {
			this.actualizarEstadoPanelsTipoDiscapacidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDiscapacidad=false;
			//this.isVisibilidadCeldaVerFormTipoDiscapacidad=false;
			this.isVisibilidadCeldaDuplicarTipoDiscapacidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodiscapacidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			if(!tipodiscapacidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;												
			}
			
			this.jButtonCerrarTipoDiscapacidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDiscapacidad=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodiscapacidad)) {
			this.isVisibilidadCeldaActualizarTipoDiscapacidad=false;
			this.isVisibilidadCeldaEliminarTipoDiscapacidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDiscapacidad() {
		this.isVisibilidadCeldaNuevoTipoDiscapacidad=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDiscapacidad=false;
	}
	
	public void actualizarEstadoPanelsTipoDiscapacidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDiscapacidad!=null) {
				this.jScrollPanelDatosEdicionTipoDiscapacidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDiscapacidad!=null) {
				this.jScrollPanelDatosTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDiscapacidad!=null) {
				this.jPanelPaginacionTipoDiscapacidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
					this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodiscapacidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDiscapacidad!=null) {
				this.jTabbedPaneBusquedasTipoDiscapacidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDiscapacidad!=null) {
				this.jPanelParametrosReportesTipoDiscapacidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoDiscapacidadParaEmpleadoDiscas() throws Exception {
		Boolean isPaginaPopupEmpleadoDisca=false;

		try {

			if(this.tipodiscapacidadSessionBean==null) {
				this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setsPathNavegacionActual(tipodiscapacidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoDisca=this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoDisca(true);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoDisca(TipoDiscapacidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setisBusquedaDesdeForeignKeySesionTipoDiscapacidad(true);
			this.jInternalFrameDetalleFormTipoDiscapacidad.empleadodiscaSessionBean.setlidTipoDiscapacidadActual(this.idTipoDiscapacidadActual);

			tipodiscapacidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDiscapacidad(true);
			tipodiscapacidadSessionBean.setlIdTipoDiscapacidadActualForeignKey(this.idTipoDiscapacidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDiscapacidadSessionBean tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		
		if(this.tipodiscapacidadSessionBean==null) {
			this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		}
		
		this.tipodiscapacidadSessionBean.setsUltimaBusquedaTipoDiscapacidad(this.getsAccionBusqueda());
		this.tipodiscapacidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodiscapacidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodiscapacidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDiscapacidadSessionBean tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		
		if(this.tipodiscapacidadSessionBean==null) {
			this.tipodiscapacidadSessionBean=new TipoDiscapacidadSessionBean();
		}
		
		if(this.tipodiscapacidadSessionBean.getsUltimaBusquedaTipoDiscapacidad()!=null&&!this.tipodiscapacidadSessionBean.getsUltimaBusquedaTipoDiscapacidad().equals("")) {
			this.setsAccionBusqueda(tipodiscapacidadSessionBean.getsUltimaBusquedaTipoDiscapacidad());
			this.setiNumeroPaginacion(tipodiscapacidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodiscapacidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodiscapacidadSessionBean.getid_empresa());
				tipodiscapacidadSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodiscapacidadSessionBean.setsUltimaBusquedaTipoDiscapacidad("");
		this.tipodiscapacidadSessionBean.setiNumeroPaginacion(TipoDiscapacidadConstantesFunciones.INUMEROPAGINACION);
		this.tipodiscapacidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDiscapacidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDiscapacidad() {
		this.updateBorderResaltarBusquedasFormularioTipoDiscapacidad();
		this.updateVisibilidadBusquedasFormularioTipoDiscapacidad();
		this.updateHabilitarBusquedasFormularioTipoDiscapacidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDiscapacidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDiscapacidad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDiscapacidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDiscapacidad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDiscapacidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDiscapacidad.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDiscapacidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoDiscapacidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDiscapacidad() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDiscapacidad();
		this.updateVisibilidadResaltarControlesFormularioTipoDiscapacidad();
		this.updateHabilitarResaltarControlesFormularioTipoDiscapacidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDiscapacidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodiscapacidadConstantesFunciones.resaltaridTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setBorder(this.tipodiscapacidadConstantesFunciones.resaltaridTipoDiscapacidad);}
		if(this.tipodiscapacidadConstantesFunciones.resaltarid_empresaTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setBorder(this.tipodiscapacidadConstantesFunciones.resaltarid_empresaTipoDiscapacidad);}
		if(this.tipodiscapacidadConstantesFunciones.resaltarnombreTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setBorder(this.tipodiscapacidadConstantesFunciones.resaltarnombreTipoDiscapacidad);}
		if(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_inicialTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setBorder(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_inicialTipoDiscapacidad);}
		if(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_finalTipoDiscapacidad!=null && this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setBorder(this.tipodiscapacidadConstantesFunciones.resaltarporcentaje_finalTipoDiscapacidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDiscapacidad() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
	
		//this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostraridTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelidTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostraridTipoDiscapacidad);
		//this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarid_empresaTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelid_empresaTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarid_empresaTipoDiscapacidad);
		//this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarnombreTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelnombreTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarnombreTipoDiscapacidad);
		//this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_inicialTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelporcentaje_inicialTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_inicialTipoDiscapacidad);
		//this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_finalTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jPanelporcentaje_finalTipoDiscapacidad.setVisible(this.tipodiscapacidadConstantesFunciones.mostrarporcentaje_finalTipoDiscapacidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDiscapacidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDiscapacidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDiscapacidad!=null) {
	
		this.jInternalFrameDetalleFormTipoDiscapacidad.jLabelidTipoDiscapacidad.setEnabled(this.tipodiscapacidadConstantesFunciones.activaridTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jComboBoxid_empresaTipoDiscapacidad.setEnabled(this.tipodiscapacidadConstantesFunciones.activarid_empresaTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextAreanombreTipoDiscapacidad.setEnabled(this.tipodiscapacidadConstantesFunciones.activarnombreTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_inicialTipoDiscapacidad.setEnabled(this.tipodiscapacidadConstantesFunciones.activarporcentaje_inicialTipoDiscapacidad);
		this.jInternalFrameDetalleFormTipoDiscapacidad.jTextFieldporcentaje_finalTipoDiscapacidad.setEnabled(this.tipodiscapacidadConstantesFunciones.activarporcentaje_finalTipoDiscapacidad);
		}
	}
	
		
}
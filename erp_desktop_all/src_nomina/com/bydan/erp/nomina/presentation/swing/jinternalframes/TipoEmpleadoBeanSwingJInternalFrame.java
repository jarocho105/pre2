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

import com.bydan.erp.nomina.util.TipoEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoEmpleadoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoEmpleadoBeanSwingJInternalFrame extends TipoEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEmpleado> tipoempleadoValidator = new ClassValidator<TipoEmpleado>(TipoEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEmpleado tipoempleado;	
	public TipoEmpleado tipoempleadoAux;
	public TipoEmpleado tipoempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEmpleado tipoempleadoTotales;
	public Long idTipoEmpleadoActual;
	public Long iIdNuevoTipoEmpleado=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
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
	
	public Boolean isPermisoTodoTipoEmpleado;
	public Boolean isPermisoNuevoTipoEmpleado;
	public Boolean isPermisoActualizarTipoEmpleado;
	public Boolean isPermisoActualizarOriginalTipoEmpleado;
	public Boolean isPermisoEliminarTipoEmpleado;
	public Boolean isPermisoGuardarCambiosTipoEmpleado;
	public Boolean isPermisoConsultaTipoEmpleado;
	public Boolean isPermisoBusquedaTipoEmpleado;
	public Boolean isPermisoReporteTipoEmpleado;
	public Boolean isPermisoPaginacionMedioTipoEmpleado;
	public Boolean isPermisoPaginacionAltoTipoEmpleado;
	public Boolean isPermisoPaginacionTodoTipoEmpleado;
	public Boolean isPermisoCopiarTipoEmpleado;
	public Boolean isPermisoVerFormTipoEmpleado;
	public Boolean isPermisoDuplicarTipoEmpleado;
	public Boolean isPermisoOrdenTipoEmpleado;
	
	
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
	
	public TipoEmpleadoParameterReturnGeneral tipoempleadoReturnGeneral;
	public TipoEmpleadoParameterReturnGeneral tipoempleadoParameterGeneral;
	
	

	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEmpleado=false;
	public Boolean esParaAccionDesdeFormularioTipoEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEmpleadoLogic tipoempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEmpleado tipoempleadoBean;
	public TipoEmpleadoConstantesFunciones tipoempleadoConstantesFunciones;
	//public TipoEmpleadoParameterReturnGeneral tipoempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoEmpleado> tipoempleados;	
	//public List<TipoEmpleado> tipoempleadosEliminados;
	//public List<TipoEmpleado> tipoempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarTipoEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormTipoEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenTipoEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
	public Boolean isVisibilidadCeldaModificarTipoEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarTipoEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarTipoEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarTipoEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarTipoEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoEmpleado() {
		return this.iIdNuevoTipoEmpleado;
	}

	public void setiIdNuevoTipoEmpleado(Long iIdNuevoTipoEmpleado) {
		this.iIdNuevoTipoEmpleado = iIdNuevoTipoEmpleado;
	}
	
	public Long getidTipoEmpleadoActual() {
		return this.idTipoEmpleadoActual;
	}

	public void setidTipoEmpleadoActual(Long idTipoEmpleadoActual) {
		this.idTipoEmpleadoActual = idTipoEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEmpleado gettipoempleado() {
		return this.tipoempleado;
	}

	public void settipoempleado(TipoEmpleado tipoempleado) {
		this.tipoempleado = tipoempleado;
	}
	
	public TipoEmpleado gettipoempleadoAux() {
		return this.tipoempleadoAux;
	}

	public void settipoempleadoAux(TipoEmpleado tipoempleadoAux) {
		this.tipoempleadoAux = tipoempleadoAux;
	}				
	
	public TipoEmpleado gettipoempleadoAnterior() {
		return this.tipoempleadoAnterior;
	}

	public void settipoempleadoAnterior(TipoEmpleado tipoempleadoAnterior) {
		this.tipoempleadoAnterior = tipoempleadoAnterior;
	}	
	
	public TipoEmpleado gettipoempleadoTotales() {
		return this.tipoempleadoTotales;
	}

	public void settipoempleadoTotales(TipoEmpleado tipoempleadoTotales) {
		this.tipoempleadoTotales = tipoempleadoTotales;
	}	
	
	public TipoEmpleado gettipoempleadoBean() {
		return this.tipoempleadoBean;
	}

	public void settipoempleadoBean(TipoEmpleado tipoempleadoBean) {
		this.tipoempleadoBean = tipoempleadoBean;
	}	
	
	public TipoEmpleadoParameterReturnGeneral gettipoempleadoReturnGeneral() {
		return this.tipoempleadoReturnGeneral;
	}

	public void settipoempleadoReturnGeneral(TipoEmpleadoParameterReturnGeneral tipoempleadoReturnGeneral) {
		this.tipoempleadoReturnGeneral = tipoempleadoReturnGeneral;
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
	
	
	public TipoEmpleadoLogic getTipoEmpleadoLogic()	{		
		return tipoempleadoLogic;
	}

	public void setTipoEmpleadoLogic(TipoEmpleadoLogic tipoempleadoLogic) {
		this.tipoempleadoLogic = tipoempleadoLogic;
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
	
	public Boolean getIsEsNuevoTipoEmpleado() {
		return isEsNuevoTipoEmpleado;
	}

	public void setIsEsNuevoTipoEmpleado(Boolean isEsNuevoTipoEmpleado) {
		this.isEsNuevoTipoEmpleado = isEsNuevoTipoEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEmpleado() {
		return esParaAccionDesdeFormularioTipoEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEmpleado(Boolean esParaAccionDesdeFormularioTipoEmpleado) {
		this.esParaAccionDesdeFormularioTipoEmpleado = esParaAccionDesdeFormularioTipoEmpleado;
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

			if(this.tipoempleadoSessionBean==null) {
				this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
			}

			if(!this.tipoempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoempleadoSessionBean.getlidEmpresaActual());
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

					if(this.tipoempleado!=null) {
						this.tipoempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
						this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
						if(this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaTipoEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoEmpleadoGenerico!=null && jComboBoxid_empresaTipoEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoEmpleado tipoempleado,JComboBox jComboBoxid_empresaTipoEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoempleado.setid_empresa(empresaAux.getId());
				tipoempleado.setempresa_descripcion(TipoEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoempleado.setEmpresa(empresaAux);			}
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

					if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { 
							this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { 
					}

					if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEmpleado(this.tipoempleadoLogic.getTipoEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEmpleado(this.tipoempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoempleadoLogic.setTipoEmpleados(this.tipoempleados);
			tipoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEmpleadoParameterReturnGeneral getTipoEmpleadoParameterGeneral() {
		return this.tipoempleadoParameterGeneral;
	}
	
	public void setTipoEmpleadoParameterGeneral(TipoEmpleadoParameterReturnGeneral tipoempleadoParameterGeneral) {
		this.tipoempleadoParameterGeneral = tipoempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEmpleado() {
		return isPermisoTodoTipoEmpleado;
	}

	public void setIsPermisoTodoTipoEmpleado(Boolean isPermisoTodoTipoEmpleado) {
		this.isPermisoTodoTipoEmpleado = isPermisoTodoTipoEmpleado;
	}

	public Boolean getIsPermisoNuevoTipoEmpleado() {
		return isPermisoNuevoTipoEmpleado;
	}

	public void setIsPermisoNuevoTipoEmpleado(Boolean isPermisoNuevoTipoEmpleado) {
		this.isPermisoNuevoTipoEmpleado = isPermisoNuevoTipoEmpleado;
	}

	public Boolean getIsPermisoActualizarTipoEmpleado() {
		return isPermisoActualizarTipoEmpleado;
	}

	public void setIsPermisoActualizarTipoEmpleado(Boolean isPermisoActualizarTipoEmpleado) {
		this.isPermisoActualizarTipoEmpleado = isPermisoActualizarTipoEmpleado;
	}

	public Boolean getIsPermisoEliminarTipoEmpleado() {
		return isPermisoEliminarTipoEmpleado;
	}

	public void setIsPermisoEliminarTipoEmpleado(Boolean isPermisoEliminarTipoEmpleado) {
		this.isPermisoEliminarTipoEmpleado = isPermisoEliminarTipoEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEmpleado() {
		return isPermisoGuardarCambiosTipoEmpleado;
	}

	public void setIsPermisoGuardarCambiosTipoEmpleado(Boolean isPermisoGuardarCambiosTipoEmpleado) {
		this.isPermisoGuardarCambiosTipoEmpleado = isPermisoGuardarCambiosTipoEmpleado;
	}
	
	public Boolean getIsPermisoConsultaTipoEmpleado() {
		return isPermisoConsultaTipoEmpleado;
	}

	public void setIsPermisoConsultaTipoEmpleado(Boolean isPermisoConsultaTipoEmpleado) {
		this.isPermisoConsultaTipoEmpleado = isPermisoConsultaTipoEmpleado;
	}

	public Boolean getIsPermisoBusquedaTipoEmpleado() {
		return isPermisoBusquedaTipoEmpleado;
	}

	public void setIsPermisoBusquedaTipoEmpleado(Boolean isPermisoBusquedaTipoEmpleado) {
		this.isPermisoBusquedaTipoEmpleado = isPermisoBusquedaTipoEmpleado;
	}

	public Boolean getIsPermisoReporteTipoEmpleado() {
		return isPermisoReporteTipoEmpleado;
	}

	public void setIsPermisoReporteTipoEmpleado(Boolean isPermisoReporteTipoEmpleado) {
		this.isPermisoReporteTipoEmpleado = isPermisoReporteTipoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEmpleado() {
		return isPermisoPaginacionMedioTipoEmpleado;
	}

	public void setIsPermisoPaginacionMedioTipoEmpleado(Boolean isPermisoPaginacionMedioTipoEmpleado) {
		this.isPermisoPaginacionMedioTipoEmpleado = isPermisoPaginacionMedioTipoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEmpleado() {
		return isPermisoPaginacionTodoTipoEmpleado;
	}

	public void setIsPermisoPaginacionTodoTipoEmpleado(Boolean isPermisoPaginacionTodoTipoEmpleado) {
		this.isPermisoPaginacionTodoTipoEmpleado = isPermisoPaginacionTodoTipoEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEmpleado() {
		return isPermisoPaginacionAltoTipoEmpleado;
	}

	public void setIsPermisoPaginacionAltoTipoEmpleado(Boolean isPermisoPaginacionAltoTipoEmpleado) {
		this.isPermisoPaginacionAltoTipoEmpleado = isPermisoPaginacionAltoTipoEmpleado;
	}
	
	public Boolean getIsPermisoCopiarTipoEmpleado() {
		return isPermisoCopiarTipoEmpleado;
	}

	public void setIsPermisoCopiarTipoEmpleado(Boolean isPermisoCopiarTipoEmpleado) {
		this.isPermisoCopiarTipoEmpleado = isPermisoCopiarTipoEmpleado;
	}
	
	public Boolean getIsPermisoVerFormTipoEmpleado() {
		return isPermisoVerFormTipoEmpleado;
	}

	public void setIsPermisoVerFormTipoEmpleado(Boolean isPermisoVerFormTipoEmpleado) {
		this.isPermisoVerFormTipoEmpleado = isPermisoVerFormTipoEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarTipoEmpleado() {
		return isPermisoDuplicarTipoEmpleado;
	}

	public void setIsPermisoDuplicarTipoEmpleado(Boolean isPermisoDuplicarTipoEmpleado) {
		this.isPermisoDuplicarTipoEmpleado = isPermisoDuplicarTipoEmpleado;
	}
	
	public Boolean getIsPermisoOrdenTipoEmpleado() {
		return isPermisoOrdenTipoEmpleado;
	}

	public void setIsPermisoOrdenTipoEmpleado(Boolean isPermisoOrdenTipoEmpleado) {
		this.isPermisoOrdenTipoEmpleado = isPermisoOrdenTipoEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEmpleado() {
		return isVisibilidadCeldaNuevoTipoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoTipoEmpleado(Boolean isVisibilidadCeldaNuevoTipoEmpleado) {
		this.isVisibilidadCeldaNuevoTipoEmpleado = isVisibilidadCeldaNuevoTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEmpleado() {
		return isVisibilidadCeldaDuplicarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEmpleado(Boolean isVisibilidadCeldaDuplicarTipoEmpleado) {
		this.isVisibilidadCeldaDuplicarTipoEmpleado = isVisibilidadCeldaDuplicarTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEmpleado() {
		return isVisibilidadCeldaCopiarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarTipoEmpleado(Boolean isVisibilidadCeldaCopiarTipoEmpleado) {
		this.isVisibilidadCeldaCopiarTipoEmpleado = isVisibilidadCeldaCopiarTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEmpleado() {
		return isVisibilidadCeldaVerFormTipoEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormTipoEmpleado(Boolean isVisibilidadCeldaVerFormTipoEmpleado) {
		this.isVisibilidadCeldaVerFormTipoEmpleado = isVisibilidadCeldaVerFormTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEmpleado() {
		return isVisibilidadCeldaOrdenTipoEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenTipoEmpleado(Boolean isVisibilidadCeldaOrdenTipoEmpleado) {
		this.isVisibilidadCeldaOrdenTipoEmpleado = isVisibilidadCeldaOrdenTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesTipoEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesTipoEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado = isVisibilidadCeldaNuevoRelacionesTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEmpleado() {
		return isVisibilidadCeldaModificarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaModificarTipoEmpleado(Boolean isVisibilidadCeldaModificarTipoEmpleado) {
		this.isVisibilidadCeldaModificarTipoEmpleado = isVisibilidadCeldaModificarTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEmpleado() {
		return isVisibilidadCeldaActualizarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarTipoEmpleado(Boolean isVisibilidadCeldaActualizarTipoEmpleado) {
		this.isVisibilidadCeldaActualizarTipoEmpleado = isVisibilidadCeldaActualizarTipoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEmpleado() {
		return isVisibilidadCeldaEliminarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarTipoEmpleado(Boolean isVisibilidadCeldaEliminarTipoEmpleado) {
		this.isVisibilidadCeldaEliminarTipoEmpleado = isVisibilidadCeldaEliminarTipoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEmpleado() {
		return isVisibilidadCeldaCancelarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarTipoEmpleado(Boolean isVisibilidadCeldaCancelarTipoEmpleado) {
		this.isVisibilidadCeldaCancelarTipoEmpleado = isVisibilidadCeldaCancelarTipoEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEmpleado() {
		return isVisibilidadCeldaGuardarTipoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarTipoEmpleado(Boolean isVisibilidadCeldaGuardarTipoEmpleado) {
		this.isVisibilidadCeldaGuardarTipoEmpleado = isVisibilidadCeldaGuardarTipoEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEmpleado() {
		return isVisibilidadCeldaGuardarCambiosTipoEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEmpleado(Boolean isVisibilidadCeldaGuardarCambiosTipoEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosTipoEmpleado = isVisibilidadCeldaGuardarCambiosTipoEmpleado;
	}
		
	public TipoEmpleadoSessionBean gettipoempleadoSessionBean() {
		return this.tipoempleadoSessionBean;
	}
	
	public void settipoempleadoSessionBean(TipoEmpleadoSessionBean tipoempleadoSessionBean) {
		this.tipoempleadoSessionBean=tipoempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(TipoEmpleado tipoempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoempleado,null);
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
	
	public void bugActualizarReferenciaActual(TipoEmpleado tipoempleado,TipoEmpleado tipoempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEmpleado(tipoempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoempleadoAux.setId(tipoempleado.getId());
		tipoempleadoAux.setVersionRow(tipoempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEmpleado();
		
			int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoempleadoValidator.getInvalidValues(this.tipoempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoempleadoLogic.setDatosCliente(datosCliente);
			tipoempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoempleadoAux=new  TipoEmpleado();
				
				tipoempleadoAux.setIsNew(true);
				tipoempleadoAux.setIsChanged(true);
				
				tipoempleadoAux.setTipoEmpleadoOriginal(this.tipoempleado);
				
				tipoempleadoAux.setId(this.tipoempleado.getId());	
				tipoempleadoAux.setVersionRow(this.tipoempleado.getVersionRow());	
				tipoempleadoAux.setid_empresa(this.tipoempleado.getid_empresa());	
				tipoempleadoAux.setcodigo(this.tipoempleado.getcodigo());	
				tipoempleadoAux.setnombre(this.tipoempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoempleadoAux,tipoempleadoLogic.getTipoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempleadoAux,tipoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoLogic.saveTipoEmpleados();//WithConnection
						//tipoempleadoLogic.getSetVersionRowTipoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoempleado,tipoempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoempleadoAux=new  TipoEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoempleadoSessionBean.getEsGuardarRelacionado() && this.tipoempleado.getId()>=0)) {
						
					tipoempleadoAux.setIsNew(false);
				}
				
				tipoempleadoAux.setIsDeleted(false);
			
				tipoempleadoAux.setId(this.tipoempleado.getId());	
				tipoempleadoAux.setVersionRow(this.tipoempleado.getVersionRow());	
				tipoempleadoAux.setid_empresa(this.tipoempleado.getid_empresa());	
				tipoempleadoAux.setcodigo(this.tipoempleado.getcodigo());	
				tipoempleadoAux.setnombre(this.tipoempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoempleadoAux,tipoempleadoLogic.getTipoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempleadoAux,tipoempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoLogic.saveTipoEmpleados();//WithConnection
						//tipoempleadoLogic.getSetVersionRowTipoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoempleado,tipoempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoempleadoAux=new  TipoEmpleado();
				
				tipoempleadoAux.setIsNew(false);
				tipoempleadoAux.setIsChanged(false);
				
				tipoempleadoAux.setIsDeleted(true);
				
				tipoempleadoAux.setId(this.tipoempleado.getId());	
				tipoempleadoAux.setVersionRow(this.tipoempleado.getVersionRow());	
				tipoempleadoAux.setid_empresa(this.tipoempleado.getid_empresa());	
				tipoempleadoAux.setcodigo(this.tipoempleado.getcodigo());	
				tipoempleadoAux.setnombre(this.tipoempleado.getnombre());	
				
				if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoempleadoAux.getId()>=0) {	
						this.tipoempleadosEliminados.add(tipoempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoempleadoAux,tipoempleadoLogic.getTipoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempleadoAux,tipoempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoLogic.saveTipoEmpleados();//WithConnection
						//tipoempleadoLogic.getSetVersionRowTipoEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoempleadoAux.setEmpleados(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoempleadoAux,tipoempleadoLogic.getTipoEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoempleadoAux,tipoempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getTipoEmpleados().addAll(this.tipoempleadosEliminados);
					
					tipoempleadoLogic.saveTipoEmpleados();//WithConnection
					//tipoempleadoLogic.getSetVersionRowTipoEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoEmpleado();
				
				this.tipoempleadosEliminados= new ArrayList<TipoEmpleado>();		
			}
			
			if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoempleado=tipoempleadoAux;
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
      		//this.finishProcessTipoEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEmpleado tipoempleadoLocal) throws Exception {
		
		if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoempleadoLocal.setEmpleados(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
			
			} else {
			
				tipoempleadoLocal.setEmpleados(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEmpleado tipoempleadoLocal) throws Exception {	
		if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoempleadoValidator.getInvalidValues(this.tipoempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEmpleado tipoempleado,List<TipoEmpleado> tipoempleados) throws Exception {
		try	{		
			TipoEmpleadoConstantesFunciones.actualizarLista(tipoempleado,tipoempleados,this.tipoempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEmpleado tipoempleado,List<TipoEmpleado> tipoempleados) throws Exception {
		try	{			
			TipoEmpleadoConstantesFunciones.actualizarSelectedLista(tipoempleado,tipoempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEmpleado> tipoempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoempleadosLocal=this.tipoempleadoLogic.getTipoEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoempleadosLocal=this.tipoempleados;
			}
			//ARCHITECTURE
		
			for(TipoEmpleado tipoempleadoLocal:tipoempleadosLocal) {
				if(this.permiteMantenimiento(tipoempleadoLocal) && tipoempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEmpleadoConstantesFunciones.getTipoEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelid_empresaTipoEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelcodigoTipoEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelnombreTipoEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEmpleado.jLabelid_empresaTipoEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEmpleado.jLabelcodigoTipoEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEmpleado.jLabelnombreTipoEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Empleado")) {
			if(this.tipoempleado==null) {
				this.tipoempleado= new TipoEmpleado();
			}

			if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoEmpleado
				this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);

				this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.getempleado().setTipoEmpleado(this.tipoempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoEmpleado--;	
		
		
		this.tipoempleadoAux=new TipoEmpleado();
		
		this.tipoempleadoAux.setId(this.iIdNuevoTipoEmpleado);
		this.tipoempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoempleadoLogic.getTipoEmpleados().add(this.tipoempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoempleados.add(this.tipoempleadoAux);
		}
		//ARCHITECTURE
		
		this.tipoempleado=this.tipoempleadoAux;
		
		if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEmpleado(this.tipoempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpleado(this.tipoempleado);
		}
				
		//this.setDefaultControlesTipoEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEmpleado(this.tipoempleadoBean,this.tipoempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
			classes=TipoEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoempleadoReturnGeneral=tipoempleadoLogic.procesarEventosTipoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempleadoLogic.getTipoEmpleados(),this.tipoempleado,this.tipoempleadoParameterGeneral,this.isEsNuevoTipoEmpleado,classes);//this.tipoempleadoLogic.getTipoEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEmpleado(this.tipoempleadoReturnGeneral,this.tipoempleadoBean,false);
		
		if(this.tipoempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado());
		}
		
		if(this.tipoempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado(),classes);//this.tipoempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEmpleado(false);
						
			if(tipoempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpleado();
			}
			
			this.actualizarVisualTableDatosTipoEmpleado();
			
			this.jTableDatosTipoEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEmpleado(), this.getIndiceNuevoTipoEmpleado());
			
			this.seleccionarFilaTablaTipoEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesTipoEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setEnabled(isHabilitar && this.tipoempleadoConstantesFunciones.activarcodigoTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setEnabled(isHabilitar && this.tipoempleadoConstantesFunciones.activarnombreTipoEmpleado);	
		//
		this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setEnabled(isHabilitar && this.tipoempleadoConstantesFunciones.activarid_empresaTipoEmpleado);
	};
	
	public void setDefaultControlesTipoEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoempleadoSessionBean.setConGuardarRelaciones(true);			
			this.tipoempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoempleadoSessionBean.setConGuardarRelaciones(false);			
			this.tipoempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
				if(tipoempleadoAux.getId().equals(this.iIdNuevoTipoEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleados) {
				if(tipoempleadoAux.getId().equals(this.iIdNuevoTipoEmpleado)) {
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
	
	public int getIndiceActualTipoEmpleado(TipoEmpleado tipoempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
				if(tipoempleadoAux.getId().equals(tipoempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleados) {
				if(tipoempleadoAux.getId().equals(tipoempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEmpleado(TipoEmpleado tipoempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
				if(tipoempleadoAux.getTipoEmpleadoOriginal().getId().equals(tipoempleadoOriginal.getId())) {
					existe=true;
					tipoempleadoOriginal.setId(tipoempleadoAux.getId());
					tipoempleadoOriginal.setVersionRow(tipoempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpleado tipoempleadoAux:this.tipoempleados) {
				if(tipoempleadoAux.getTipoEmpleadoOriginal().getId().equals(tipoempleadoOriginal.getId())) {
					existe=true;
					tipoempleadoOriginal.setId(tipoempleadoAux.getId());
					tipoempleadoOriginal.setVersionRow(tipoempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEmpleado(Boolean esParaCancelar) throws Exception {
		tipoempleadosAux=new ArrayList<TipoEmpleado>();
		tipoempleadoAux=new TipoEmpleado();
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
					if(tipoempleadoAux.getId()<0) {
						tipoempleadosAux.add(tipoempleadoAux);
					}		
				}
				this.iIdNuevoTipoEmpleado=0L;
				this.tipoempleadoLogic.getTipoEmpleados().removeAll(tipoempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpleado tipoempleadoAux:this.tipoempleados) {
					if(tipoempleadoAux.getId()<0) {
						tipoempleadosAux.add(tipoempleadoAux);
					}		
				}
				this.iIdNuevoTipoEmpleado=0L;
				this.tipoempleados.removeAll(tipoempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEmpleado 
					&& this.tipoempleadoLogic.getTipoEmpleados().size()>0
					) {
					tipoempleadoAux=this.tipoempleadoLogic.getTipoEmpleados().get(this.tipoempleadoLogic.getTipoEmpleados().size() - 1);
				
					if(tipoempleadoAux.getId()<0) {
						this.tipoempleadoLogic.getTipoEmpleados().remove(tipoempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEmpleado && this.tipoempleados.size()>0) {
					tipoempleadoAux=this.tipoempleados.get(this.tipoempleados.size() - 1);
				
					if(tipoempleadoAux.getId()<0) {
						this.tipoempleados.remove(tipoempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoempleado.getId()<0) {
				this.tipoempleadoLogic.getTipoEmpleados().remove(this.tipoempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoempleado.getId()<0) {
				this.tipoempleados.remove(this.tipoempleado);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEmpleado(List<TipoEmpleado> tipoempleadosAux) throws Exception {
		TipoEmpleadoConstantesFunciones.setEstadosInicialesTipoEmpleado(tipoempleadosAux);
	}
	
	public void setEstadosInicialesTipoEmpleado(TipoEmpleado tipoempleadoAux) throws Exception {
		TipoEmpleadoConstantesFunciones.setEstadosInicialesTipoEmpleado(tipoempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEmpleadoActual()) {
				if(!this.isEsNuevoTipoEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Empleado ?", "MANTENIMIENTO DE Tipo Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEmpleado tipoempleado) throws Exception {
		TipoEmpleadoConstantesFunciones.seleccionarAsignar(this.tipoempleado,tipoempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEmpleado=this.isPermisoActualizarOriginalTipoEmpleado;
			
			
			this.seleccionarAsignar(tipoempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEmpleadoConstantesFunciones.quitarEspaciosTipoEmpleado(this.tipoempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoempleadoSessionBean.setsFuncionBusquedaRapida(this.tipoempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEmpleado(esParaCancelar);				
				this.cancelarNuevoTipoEmpleado(esParaCancelar);								
			}
			
			this.tipoempleado=new TipoEmpleado();
			
			this.inicializarTipoEmpleado();
			
			this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEmpleado() throws Exception {
		try {
			TipoEmpleadoConstantesFunciones.inicializarTipoEmpleado(this.tipoempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoempleadoLogic.getTipoEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEmpleados(String sAccionBusqueda,List<TipoEmpleado> tipoempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Empleados");		
		parameters.put("busquedapor", TipoEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Empleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoEmpleadoLogic tipoempleadoLogicAuxiliar=new TipoEmpleadoLogic();
					tipoempleadoLogicAuxiliar.setDatosCliente(tipoempleadoLogic.getDatosCliente());				
					tipoempleadoLogicAuxiliar.setTipoEmpleados(tipoempleadosParaReportes);
					
					tipoempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoempleadosParaReportes=tipoempleadoLogicAuxiliar.getTipoEmpleados();
					
					//tipoempleadoLogic.getNewConnexionToDeep();
					
					//for (TipoEmpleado tipoempleado:tipoempleadosParaReportes) {
					//	tipoempleadoLogic.deepLoad(tipoempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEmpleado=new JRBeanArrayDataSource(TipoEmpleadoJInternalFrame.TraerTipoEmpleadoBeans(tipoempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEmpleadoBean.TraerTipoEmpleadoBeans(tipoempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEmpleadoActionPerformed(null);
					//this.generarExcelReporteTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpleado> tipoempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEmpleado tipoempleado : tipoempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEmpleadoConstantesFunciones.generarExcelReporteDataTipoEmpleado("NORMAL",row,workbook,tipoempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEmpleado(String sTipo,Row row,Workbook workbook) {
		
		TipoEmpleadoConstantesFunciones.generarExcelReporteHeaderTipoEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpleado> tipoempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEmpleado tipoempleado : tipoempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEmpleadoConstantesFunciones.getTipoEmpleadoDescripcion(tipoempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEmpleado> tipoempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEmpleado> tipoempleadosRespaldo=null;
		
		classes=TipoEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoempleadoLogic.setDatosCliente(this.datosCliente);
		this.tipoempleadoLogic.setDatosDeep(this.datosDeep);
		this.tipoempleadoLogic.setIsConDeep(true);
		
		tipoempleadosRespaldo=this.tipoempleadoLogic.getTipoEmpleados();
		
		this.tipoempleadoLogic.setTipoEmpleados(tipoempleadosParaReportes);	
		this.tipoempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoempleadosParaReportes=this.tipoempleadoLogic.getTipoEmpleados();
		this.tipoempleadoLogic.setTipoEmpleados(tipoempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEmpleado tipoempleado : tipoempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEmpleadoConstantesFunciones.generarExcelReporteDataTipoEmpleado("NORMAL",row,workbook,tipoempleado,cellStyleDataAux);
		
			
			


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoempleado.getEmpleados()!=null && tipoempleado.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(tipoempleado.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : tipoempleado.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoEmpleadoConstantesFunciones.getTipoEmpleadoDescripcion(tipoempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEmpleado() throws Exception {		
		this.startProcessTipoEmpleado(true);
	}
	
	public void startProcessTipoEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoEmpleado ,this.jPanelParametrosReportesTipoEmpleado, this.jScrollPanelDatosTipoEmpleado,this.jPanelPaginacionTipoEmpleado, this.jScrollPanelDatosEdicionTipoEmpleado, this.jPanelAccionesTipoEmpleado,this.jPanelAccionesFormularioTipoEmpleado,this.jmenuBarTipoEmpleado,this.jmenuBarDetalleTipoEmpleado,this.jTtoolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEmpleado=this.jTabbedPaneBusquedasTipoEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoEmpleado=this.jPanelParametrosReportesTipoEmpleado;
		//final JScrollPane jScrollPanelDatosTipoEmpleado=this.jScrollPanelDatosTipoEmpleado;
		final JTable jTableDatosTipoEmpleado=this.jTableDatosTipoEmpleado;		
		final JPanel jPanelPaginacionTipoEmpleado=this.jPanelPaginacionTipoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoEmpleado=this.jScrollPanelDatosEdicionTipoEmpleado;
		final JPanel jPanelAccionesTipoEmpleado=this.jPanelAccionesTipoEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			jPanelCamposAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jPanelCamposTipoEmpleado;
			jPanelAccionesFormularioAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jPanelAccionesFormularioTipoEmpleado;
		}
		
		final JPanel jPanelCamposTipoEmpleado=jPanelCamposAuxiliarTipoEmpleado;
		final JPanel jPanelAccionesFormularioTipoEmpleado=jPanelAccionesFormularioAuxiliarTipoEmpleado;
		
		
		final JMenuBar jmenuBarTipoEmpleado=this.jmenuBarTipoEmpleado;
		final JToolBar jTtoolBarTipoEmpleado=this.jTtoolBarTipoEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jmenuBarDetalleTipoEmpleado;
			jTtoolBarDetalleAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jTtoolBarDetalleTipoEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleTipoEmpleado=jmenuBarDetalleAuxiliarTipoEmpleado;
		final JToolBar jTtoolBarDetalleTipoEmpleado=jTtoolBarDetalleAuxiliarTipoEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEmpleado ,jPanelParametrosReportesTipoEmpleado,jTableDatosTipoEmpleado, /*jScrollPanelDatosTipoEmpleado,*/jPanelCamposTipoEmpleado,jPanelPaginacionTipoEmpleado, /*jScrollPanelDatosEdicionTipoEmpleado,*/ jPanelAccionesTipoEmpleado,jPanelAccionesFormularioTipoEmpleado,jmenuBarTipoEmpleado,jmenuBarDetalleTipoEmpleado,jTtoolBarTipoEmpleado,jTtoolBarDetalleTipoEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEmpleado ,jPanelParametrosReportesTipoEmpleado, jScrollPanelDatosTipoEmpleado,jPanelPaginacionTipoEmpleado, jScrollPanelDatosEdicionTipoEmpleado, jPanelAccionesTipoEmpleado,jPanelAccionesFormularioTipoEmpleado,jmenuBarTipoEmpleado,jmenuBarDetalleTipoEmpleado,jTtoolBarTipoEmpleado,jTtoolBarDetalleTipoEmpleado);
						
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
	
	public void finishProcessTipoEmpleado() {// throws Exception 
		this.finishProcessTipoEmpleado(true);
	}
	
	public void finishProcessTipoEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoEmpleado ,this.jPanelParametrosReportesTipoEmpleado, this.jScrollPanelDatosTipoEmpleado,this.jPanelPaginacionTipoEmpleado, this.jScrollPanelDatosEdicionTipoEmpleado, this.jPanelAccionesTipoEmpleado,this.jPanelAccionesFormularioTipoEmpleado,this.jmenuBarTipoEmpleado,this.jmenuBarDetalleTipoEmpleado,this.jTtoolBarTipoEmpleado,this.jTtoolBarDetalleTipoEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEmpleado=this.jTabbedPaneBusquedasTipoEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoEmpleado=this.jPanelParametrosReportesTipoEmpleado;
		//final JScrollPane jScrollPanelDatosTipoEmpleado=this.jScrollPanelDatosTipoEmpleado;
		final JTable jTableDatosTipoEmpleado=this.jTableDatosTipoEmpleado;		
		final JPanel jPanelPaginacionTipoEmpleado=this.jPanelPaginacionTipoEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoEmpleado=this.jScrollPanelDatosEdicionTipoEmpleado;
		final JPanel jPanelAccionesTipoEmpleado=this.jPanelAccionesTipoEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			jPanelCamposAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jPanelCamposTipoEmpleado;
			jPanelAccionesFormularioAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jPanelAccionesFormularioTipoEmpleado;
		}
		
		final JPanel jPanelCamposTipoEmpleado=jPanelCamposAuxiliarTipoEmpleado;
		final JPanel jPanelAccionesFormularioTipoEmpleado=jPanelAccionesFormularioAuxiliarTipoEmpleado;
		
		
		final JMenuBar jmenuBarTipoEmpleado=this.jmenuBarTipoEmpleado;		
		final JToolBar jTtoolBarTipoEmpleado=this.jTtoolBarTipoEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jmenuBarDetalleTipoEmpleado;
			jTtoolBarDetalleAuxiliarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jTtoolBarDetalleTipoEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEmpleado=jmenuBarDetalleAuxiliarTipoEmpleado;
		final JToolBar jTtoolBarDetalleTipoEmpleado=jTtoolBarDetalleAuxiliarTipoEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEmpleado ,jPanelParametrosReportesTipoEmpleado, jTableDatosTipoEmpleado,/*jScrollPanelDatosTipoEmpleado,*/jPanelCamposTipoEmpleado,jPanelPaginacionTipoEmpleado, /*jScrollPanelDatosEdicionTipoEmpleado,*/ jPanelAccionesTipoEmpleado,jPanelAccionesFormularioTipoEmpleado,jmenuBarTipoEmpleado,jmenuBarDetalleTipoEmpleado,jTtoolBarTipoEmpleado,jTtoolBarDetalleTipoEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoempleadoConstantesFunciones.getsFinalQueryTipoEmpleado();
		String  finalQueryPaginacionTodos=this.tipoempleadoConstantesFunciones.getsFinalQueryTipoEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoTipoEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoempleadosEliminados= new ArrayList<TipoEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEmpleado();
		
				///*TipoEmpleadoSessionBean*/this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
			
			if(this.tipoempleadoSessionBean==null) {
				this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
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
					this.iNumeroPaginacion=TipoEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEmpleadoConstantesFunciones.getClassesForeignKeysOfTipoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoempleadosAux= new ArrayList<TipoEmpleado>();
			
				
			tipoempleadoLogic.setDatosCliente(this.datosCliente);
			tipoempleadoLogic.setDatosDeep(this.datosDeep);
			tipoempleadoLogic.setIsConDeep(true);
			
			
			tipoempleadoLogic.getTipoEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoempleadoLogic.getTodosTipoEmpleados(finalQueryGlobal,pagination);
					
					//tipoempleadoLogic.getTodosTipoEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoempleadoLogic.getTipoEmpleados()==null|| tipoempleadoLogic.getTipoEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempleadosAux= new ArrayList<TipoEmpleado>();
							tipoempleadosAux.addAll(tipoempleadoLogic.getTipoEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempleadosAux= new ArrayList<TipoEmpleado>();
							tipoempleadosAux.addAll(tipoempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempleadoLogic.getTodosTipoEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//tipoempleadoLogic.getTodosTipoEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEmpleados("Todos",tipoempleadoLogic.getTipoEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoempleadoLogic.setTipoEmpleados(new ArrayList<TipoEmpleado>());					
							tipoempleadoLogic.getTipoEmpleados().addAll(tipoempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempleados=new ArrayList<TipoEmpleado>();
							tipoempleados.addAll(tipoempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEmpleado=this.idActual;
				
				} else if(this.idTipoEmpleadoActual!=null && this.idTipoEmpleadoActual!=0L) {
					idTipoEmpleado=idTipoEmpleadoActual;
				}
				
					
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndicePorId(idTipoEmpleado);
				
				this.tipoempleados=new ArrayList<TipoEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoempleadoLogic.getEntity(idTipoEmpleado);
					
					//tipoempleadoLogic.getEntityWithConnection(idTipoEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempleadoLogic.setTipoEmpleados(new ArrayList<TipoEmpleado>());
					tipoempleadoLogic.getTipoEmpleados().add(tipoempleadoLogic.getTipoEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoempleados=new ArrayList<TipoEmpleado>();
					this.tipoempleados.add(tipoempleado);
				}
				
				if(tipoempleadoLogic.getTipoEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoempleadoLogic.getTipoEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoempleadoLogic.getTipoEmpleados()==null||tipoempleadoLogic.getTipoEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoempleados==null|| tipoempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadosAux=new ArrayList<TipoEmpleado>();
						tipoempleadosAux.addAll(tipoempleadoLogic.getTipoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempleadosAux=new ArrayList<TipoEmpleado>();
							tipoempleadosAux.addAll(tipoempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoempleadoLogic.getTipoEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoEmpleados("FK_IdEmpresa",tipoempleadoLogic.getTipoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoEmpleados("FK_IdEmpresa",tipoempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoLogic.setTipoEmpleados(new ArrayList<TipoEmpleado>());
						tipoempleadoLogic.getTipoEmpleados().addAll(tipoempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempleados=new ArrayList<TipoEmpleado>();
							tipoempleados.addAll(tipoempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoempleadoLogic.getTipoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoempleadoLogic.getTipoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEmpleado tipoempleado) {
		Boolean permite=true;
		
		if(this.tipoempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEmpleadoConstantesFunciones.getOrderByListaTipoEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEmpleadoConstantesFunciones.getOrderByListaTipoEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpleado tipoempleado:tipoempleadoLogic.getTipoEmpleados()) {
				if(tipoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempleadoTotales=tipoempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpleado tipoempleado:this.tipoempleados) {
				if(tipoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempleadoTotales=tipoempleado;
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
			this.tipoempleadoAux=new TipoEmpleado();
			this.tipoempleadoAux.setsType(Constantes2.S_TOTALES);
			this.tipoempleadoAux.setIsNew(false);
			this.tipoempleadoAux.setIsChanged(false);
			this.tipoempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEmpleado(this.tipoempleadoLogic.getTipoEmpleados(),this.tipoempleadoAux);
				
				this.tipoempleadoLogic.getTipoEmpleados().add(this.tipoempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEmpleado(this.tipoempleados,this.tipoempleadoAux);
				
				this.tipoempleados.add(this.tipoempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoempleadoTotales=new TipoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoempleadoLogic.getTipoEmpleados().remove(tipoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoempleados.remove(tipoempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoempleadoTotales=new TipoEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEmpleado tipoempleado:tipoempleadoLogic.getTipoEmpleados()) {
				if(tipoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempleadoTotales=tipoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEmpleado(this.tipoempleadoLogic.getTipoEmpleados(),tipoempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEmpleado tipoempleado:this.tipoempleados) {
				if(tipoempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoempleadoTotales=tipoempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEmpleado(this.tipoempleados,tipoempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempleadoLogic.getTipoEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoEmpleado() {
		this.isPermisoTodoTipoEmpleado=false;
		this.isPermisoNuevoTipoEmpleado=false;
		this.isPermisoActualizarTipoEmpleado=false;
		this.isPermisoActualizarOriginalTipoEmpleado=false;
		this.isPermisoEliminarTipoEmpleado=false;
		this.isPermisoGuardarCambiosTipoEmpleado=false;
		this.isPermisoConsultaTipoEmpleado=false;
		this.isPermisoBusquedaTipoEmpleado=false;
		this.isPermisoReporteTipoEmpleado=false;		
		this.isPermisoOrdenTipoEmpleado=false;		
		this.isPermisoPaginacionMedioTipoEmpleado=false;		
		this.isPermisoPaginacionAltoTipoEmpleado=false;
		this.isPermisoPaginacionTodoTipoEmpleado=false;
		this.isPermisoCopiarTipoEmpleado=false;		
		this.isPermisoVerFormTipoEmpleado=false;		
		this.isPermisoDuplicarTipoEmpleado=false;		
		this.isPermisoOrdenTipoEmpleado=false;		
	}
	
	public void setPermisosUsuarioTipoEmpleado(Boolean isPermiso) {
		this.isPermisoTodoTipoEmpleado=isPermiso;
		this.isPermisoNuevoTipoEmpleado=isPermiso;
		this.isPermisoActualizarTipoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoEmpleado=isPermiso;
		this.isPermisoEliminarTipoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoEmpleado=isPermiso;
		this.isPermisoConsultaTipoEmpleado=isPermiso;
		this.isPermisoBusquedaTipoEmpleado=isPermiso;
		this.isPermisoReporteTipoEmpleado=isPermiso;
		this.isPermisoOrdenTipoEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioTipoEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoTipoEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoTipoEmpleado=isPermiso;		
		this.isPermisoCopiarTipoEmpleado=isPermiso;		
		this.isPermisoVerFormTipoEmpleado=isPermiso;		
		this.isPermisoDuplicarTipoEmpleado=isPermiso;
		this.isPermisoOrdenTipoEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoTipoEmpleado=isPermiso;
		this.isPermisoNuevoTipoEmpleado=isPermiso;
		this.isPermisoActualizarTipoEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoEmpleado=isPermiso;
		this.isPermisoEliminarTipoEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoEmpleado=isPermiso;
		//this.isPermisoConsultaTipoEmpleado=isPermiso;
		//this.isPermisoBusquedaTipoEmpleado=isPermiso;
		//this.isPermisoReporteTipoEmpleado=isPermiso;
		//this.isPermisoOrdenTipoEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEmpleado=isPermiso;		
		//this.isPermisoCopiarTipoEmpleado=isPermiso;		
		//this.isPermisoDuplicarTipoEmpleado=isPermiso;
		//this.isPermisoOrdenTipoEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionTipoEmpleadoClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.remove(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEmpleado=this.isPermisoActualizarTipoEmpleado;
			this.isPermisoEliminarTipoEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEmpleado.setToolTipText(this.jTableDatosTipoEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleado && this.tipoempleadoConstantesFunciones.mostrarEmpleadoTipoEmpleado && !TipoEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
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
	public void inicializarCombosForeignKeyTipoEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEmpleadoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoEmpleadoParameterReturnGeneral tipoempleadoReturnGeneral=new TipoEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoempleadoConstantesFunciones.cargarid_empresaTipoEmpleado)
					 || (this.esRecargarFks && this.tipoempleadoConstantesFunciones.cargarid_empresaTipoEmpleado)) {

					if(!this.tipoempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoempleadoReturnGeneral=tipoempleadoLogic.cargarCombosLoteForeignKeyTipoEmpleado(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoempleadoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoempleadoSessionBean==null) {
				this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
			}

			if(!this.tipoempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEmpleado(TipoEmpleado tipoempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEmpleado(TipoEmpleado tipoempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean(); 
		this.tipoempleadoConstantesFunciones=new TipoEmpleadoConstantesFunciones(); 
		this.tipoempleadoBean=new TipoEmpleado();//(this.tipoempleadoConstantesFunciones); 		
		this.tipoempleadoReturnGeneral=new TipoEmpleadoParameterReturnGeneral(); 
		
		this.tipoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEmpleado(true);
			
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
			
			this.tipoempleadoConstantesFunciones=new TipoEmpleadoConstantesFunciones(); 
			this.tipoempleadoBean=new TipoEmpleado();//this.tipoempleadoConstantesFunciones); 			
			this.tipoempleadoReturnGeneral=new TipoEmpleadoParameterReturnGeneral(); 
		
			TipoEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoempleado=new TipoEmpleado();
			this.tipoempleados = new ArrayList<TipoEmpleado>();
			this.tipoempleadosAux = new ArrayList<TipoEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic=new TipoEmpleadoLogic();
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEmpleado);	
					}
					
					if(this.jInternalFrameImportacionTipoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEmpleado);
				this.jInternalFrameDetalleFormTipoEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormTipoEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEmpleado);
					this.jInternalFrameReporteDinamicoTipoEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEmpleado);
					this.jInternalFrameImportacionTipoEmpleado.setVisible(false);
					this.jInternalFrameImportacionTipoEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEmpleado);
					this.jInternalFrameOrderByTipoEmpleado.setVisible(false);
					this.jInternalFrameOrderByTipoEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoempleadoReturnGeneral=new TipoEmpleadoParameterReturnGeneral();
			
			this.tipoempleadoParameterGeneral=new TipoEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoempleadoSessionBean.getEsGuardarRelacionado(),this.tipoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoempleadoSessionBean.getEsGuardarRelacionado(),this.tipoempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoEmpleado=true;
			this.isVisibilidadCeldaCopiarTipoEmpleado=true;
			this.isVisibilidadCeldaVerFormTipoEmpleado=true;
			this.isVisibilidadCeldaOrdenTipoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEmpleado(false);
			
			this.setPermisosUsuarioTipoEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoempleadoSessionBean.getEsGuardarRelacionado() && this.tipoempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEmpleadoClasesRelacionadas();
			}
			
			if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEmpleado();
			}
			
			if(!this.isPermisoBusquedaTipoEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEmpleado,this.isPermisoPaginacionMedioTipoEmpleado,this.isPermisoPaginacionTodoTipoEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEmpleadoConstantesFunciones.getTiposSeleccionarTipoEmpleado());
				
				this.tiposColumnasSelect=TipoEmpleadoConstantesFunciones.getTiposSeleccionarTipoEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoEmpleado();				
				//this.tiposRelacionesSelect=TipoEmpleadoConstantesFunciones.getTiposRelacionesTipoEmpleado(true);
				
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
			//if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpleado() ;
			
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
			
			
			this.empleadoLogic=new EmpleadoLogic(); 
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
				tipoempleadoImplementable= (TipoEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoempleadoImplementableHome= (TipoEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoempleados= new ArrayList<TipoEmpleado>();
			this.tipoempleadosEliminados= new ArrayList<TipoEmpleado>();
						
			this.isEsNuevoTipoEmpleado=false;
			this.esParaAccionDesdeFormularioTipoEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEmpleado();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoEmpleado();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoEmpleado.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesTipoEmpleado.updateUI();
		//this.jTabbedPaneRelacionesTipoEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosTipoEmpleado.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.tipoempleadoConstantesFunciones.mostrarEmpleadoTipoEmpleado && !TipoEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(tipoempleadoConstantesFunciones.resaltarEmpleadoTipoEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoempleadoConstantesFunciones.resaltarEmpleadoTipoEmpleado);
						}

						jmenuItem.setEnabled(this.tipoempleadoConstantesFunciones.activarEmpleadoTipoEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormTipoEmpleado.jmenuDetalleTipoEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEmpleado();
		
		this.cargarCombosFrameForeignKeyTipoEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoTipoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			
			if(jTableDatosTipoEmpleado.getRowCount()>=1) {
				jTableDatosTipoEmpleado.removeRowSelectionInterval(0, jTableDatosTipoEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEmpleado(true);			
			//this.tipoempleado=new TipoEmpleado();
			//this.tipoempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpleado() ;
			
			if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);				
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEmpleado.getSelectedRows().length;			
			}
			
			tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEmpleado--;			
				//TipoEmpleado tipoempleadoAux= new TipoEmpleado();			
				//tipoempleadoAux.setId(this.iIdNuevoTipoEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEmpleado tipoempleadoOrigen=new TipoEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEmpleado tipoempleadoOrigen : tipoempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoempleadoOrigen =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoempleadoOrigen =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEmpleado(tipoempleadoOrigen,this.tipoempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoempleadoLogic.getTipoEmpleados().add(this.tipoempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoempleados.add(this.tipoempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
				
				this.jTableDatosTipoEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEmpleado(), this.getIndiceNuevoTipoEmpleado());
				
				int iLastRow =  this.jTableDatosTipoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();									
		
			TipoEmpleado tipoempleadoOrigen=new TipoEmpleado();
			TipoEmpleado tipoempleadoDestino=new TipoEmpleado();
				
			tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoOrigen =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoempleadoOrigen =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoempleadoDestino =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoempleadoDestino =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoempleadoOrigen =tipoempleadosSeleccionados.get(0);
				tipoempleadoDestino =tipoempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEmpleado(tipoempleadoOrigen,tipoempleadoDestino,true,false);
				
				tipoempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoempleadoDestino,tipoempleadoLogic.getTipoEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoempleadoDestino,tipoempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
				
				//this.jTableDatosTipoEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEmpleado(), this.getIndiceNuevoTipoEmpleado());
				
				int iLastRow =  this.jTableDatosTipoEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionTipoEmpleado.setVisible(!isVisible);
			this.jPanelAccionesTipoEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEmpleado();
			
			this.abrirFrameOrderByTipoEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEmpleado.setSize(this.jInternalFrameDetalleFormTipoEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormTipoEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEmpleado.jContentPaneDetalleTipoEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpleado.jContentPaneDetalleTipoEmpleado.getWidth(),TipoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpleado.jContentPaneDetalleTipoEmpleado.getWidth(),TipoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEmpleado.jContentPaneDetalleTipoEmpleado.getWidth(),TipoEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByTipoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEmpleado);
				this.jInternalFrameOrderByTipoEmpleado.setVisible(false);
				this.jInternalFrameOrderByTipoEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByTipoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEmpleado==null) {
				
				this.jInternalFrameImportacionTipoEmpleado=new ImportacionJInternalFrame(TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEmpleado);
				this.jInternalFrameImportacionTipoEmpleado.setVisible(false);
				this.jInternalFrameImportacionTipoEmpleado.setSelected(false);


				this.jInternalFrameImportacionTipoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEmpleado"));
				this.jInternalFrameImportacionTipoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEmpleado"));
				this.jInternalFrameImportacionTipoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEmpleado==null) {
				this.jInternalFrameReporteDinamicoTipoEmpleado=new ReporteDinamicoJInternalFrame(TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEmpleado);
				this.jInternalFrameReporteDinamicoTipoEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoEmpleado.jContentPaneDetalleTipoEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEmpleado);
			
	       	this.jInternalFrameDetalleFormTipoEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEmpleado.dispose();
			//this.jInternalFrameDetalleFormTipoEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEmpleado.setVisible(true);
	        this.jInternalFrameImportacionTipoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEmpleado.setVisible(true);
	        this.jInternalFrameOrderByTipoEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEmpleado.setVisible(false);
	        this.jInternalFrameOrderByTipoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEmpleado.setVisible(false);
	        this.jInternalFrameImportacionTipoEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEmpleado(true);
			//this.isEsNuevoTipoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpleado(false) ;
			
			if(tipoempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEmpleado(true);
			//this.isEsNuevoTipoEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEmpleado(false) ;
			
			if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEmpleado(false);
			
			//if(!this.isEsNuevoTipoEmpleado) {								
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				
			}
			
			if(this.permiteMantenimiento(this.tipoempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEmpleado=true;
					this.inicializarActualizarBindingTablaTipoEmpleado(false);
					this.isEsNuevoTipoEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoEmpleado(false);
			
												
				
				if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEmpleadoActionPerformed(evt,tipoempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEmpleado(this.tipoempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEmpleadoModel) this.jTableDatosTipoEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEmpleado=true;
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
				this.isEsNuevoTipoEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoEmpleado(false);
				
				
				
				if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEmpleado.getRowCount()>=1) {
				jTableDatosTipoEmpleado.removeRowSelectionInterval(0, jTableDatosTipoEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEmpleado(false) ;
			
			this.isEsNuevoTipoEmpleado=false;
			
			if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEmpleado(false);
				
				//SI ES MANUAL
				if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEmpleado--;			
			//TipoEmpleado tipoempleadoAux= new TipoEmpleado();			
			//tipoempleadoAux.setId(this.iIdNuevoTipoEmpleado);
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
			
			this.tipoempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoempleadoLogic.getTipoEmpleados().add(this.tipoempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoempleados.add(this.tipoempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEmpleado(false);
			
			this.jTableDatosTipoEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEmpleado(), this.getIndiceNuevoTipoEmpleado());
			
			int iLastRow =  this.jTableDatosTipoEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpleado();
			}
			
			//this.abrirFrameTreeTipoEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo EmpleadoS ?", "MANTENIMIENTO DE Tipo Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoempleadoReturnGeneral=tipoempleadoLogic.procesarImportacionTipoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEmpleado.setFileImportacion(this.jInternalFrameImportacionTipoEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		

		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoEmpleado tipoempleado:tipoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoEmpleado tipoempleado:tipoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEmpleado tipoempleado:tipoempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEmpleado(tipoempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEmpleado();
		
		this.inicializarActualizarBindingBotonesManualTipoEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionNuevoTipoEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionSinCerrarTipoEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionSinMensajeTipoEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
				this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionNuevoTipoEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionSinCerrarTipoEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEmpleado.jCheckBoxPostAccionSinMensajeTipoEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEmpleado() throws Exception {
		try	{
			if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEmpleado.addItem(reporte);
			}
			
			
			if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEmpleado(Boolean esInicializar) throws Exception {				
		if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaTipoEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoempleadoLogic.getTipoEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEmpleado.setModel(new TipoEmpleadoModel(this.tipoempleadoLogic.getTipoEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEmpleado.setModel(new TipoEmpleadoModel(this.tipoempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEmpleado!=null && this.jInternalFrameOrderByTipoEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoempleadoConstantesFunciones.resaltarSeleccionarTipoEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoempleadoConstantesFunciones.resaltarSeleccionarTipoEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,TipoEmpleadoConstantesFunciones.LABEL_ID));

		if(this.tipoempleadoConstantesFunciones.mostraridTipoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoempleadoConstantesFunciones.resaltaridTipoEmpleado,this.tipoempleadoConstantesFunciones.activaridTipoEmpleado,this,true,"idTipoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempleadoConstantesFunciones.resaltaridTipoEmpleado,this.tipoempleadoConstantesFunciones.activaridTipoEmpleado,this,true,"idTipoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoempleadoConstantesFunciones.mostrarid_empresaTipoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoempleadoConstantesFunciones.resaltarid_empresaTipoEmpleado,this,this.tipoempleadoConstantesFunciones.activarid_empresaTipoEmpleado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoempleadoConstantesFunciones.resaltarid_empresaTipoEmpleado,this,this.tipoempleadoConstantesFunciones.activarid_empresaTipoEmpleado,false,"id_empresaTipoEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,TipoEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoempleadoConstantesFunciones.mostrarcodigoTipoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoempleadoConstantesFunciones.resaltarcodigoTipoEmpleado,this.tipoempleadoConstantesFunciones.activarcodigoTipoEmpleado,this,true,"codigoTipoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempleadoConstantesFunciones.resaltarcodigoTipoEmpleado,this.tipoempleadoConstantesFunciones.activarcodigoTipoEmpleado,this,true,"codigoTipoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,TipoEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoempleadoConstantesFunciones.mostrarnombreTipoEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoempleadoConstantesFunciones.resaltarnombreTipoEmpleado,this.tipoempleadoConstantesFunciones.activarnombreTipoEmpleado,this,true,"nombreTipoEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoempleadoConstantesFunciones.resaltarnombreTipoEmpleado,this.tipoempleadoConstantesFunciones.activarnombreTipoEmpleado,this,true,"nombreTipoEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleado && this.tipoempleadoConstantesFunciones.mostrarEmpleadoTipoEmpleado && !TipoEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(tipoempleadoConstantesFunciones.resaltarEmpleadoTipoEmpleado,this,this.tipoempleadoConstantesFunciones.activarEmpleadoTipoEmpleado));
				tableColumn.setCellEditor(new EmpleadoTableCell(tipoempleadoConstantesFunciones.resaltarEmpleadoTipoEmpleado,this,this.tipoempleadoConstantesFunciones.activarEmpleadoTipoEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEmpleado.moveColumn(this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEmpleado.moveColumn(this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoEmpleado.moveColumn(this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEmpleado.moveColumn(this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoempleadoLogic.getTipoEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoempleados.size()-1;
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
		//this.jTableDatosTipoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEmpleado();
			
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
				
				//this.isEsNuevoTipoEmpleado=false;
					
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
				if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoempleado.getsType().equals("DUPLICADO")
				   || this.tipoempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEmpleado=true;
				
				} else {
					this.isEsNuevoTipoEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoempleado.getId()>=0 && !this.tipoempleado.getIsNew()) {						
						this.isEsNuevoTipoEmpleado=false;
						
					} else {
						this.isEsNuevoTipoEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEmpleado(esRelaciones);						
				
				this.seleccionarTipoEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoempleado.getId()<0) {
					this.isEsNuevoTipoEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEmpleado(evt,rowIndex);
				}	
				
				if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEmpleado: " + this.dDif); 
					}
				}								
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoempleado)) {
					if(this.tipoempleado.getId()>0) {
						this.tipoempleado.setIsDeleted(true);
						
						this.tipoempleadosEliminados.add(this.tipoempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoempleadoLogic.getTipoEmpleados().remove(this.tipoempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoempleados.remove(this.tipoempleado);				
					}
					
					
					((TipoEmpleadoModel) this.jTableDatosTipoEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEmpleado) {
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEmpleado(this.tipoempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoempleadoConstantesFunciones.cargarid_empresaTipoEmpleado || this.tipoempleadoConstantesFunciones.event_dependid_empresaTipoEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoempleado.getid_empresa());
									//this.inicializarActualizarBindingTipoEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoempleado.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEmpleado(TipoEmpleado tipoempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEmpleado(tipoempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEmpleado(TipoEmpleado tipoempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEmpleado(tipoempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEmpleado(tipoempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpleado(tipoempleado);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEmpleado(TipoEmpleado tipoempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setText(tipoempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setText(tipoempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setText(tipoempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEmpleado tipoempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEmpleado tipoempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoempleadoLocal=this.tipoempleado;
			} else {
				tipoempleadoLocal=this.tipoempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEmpleado(tipoempleadoLocal,true);
					
					if(tipoempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEmpleado(TipoEmpleado tipoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEmpleado(tipoempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(tipoempleado);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEmpleado(TipoEmpleado tipoempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEmpleado(tipoempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEmpleado(TipoEmpleado tipoempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.getText()==null || this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.getText()=="" || this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setText("0");
			}

			if(conColumnasBase) {tipoempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelIdTipoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoempleado.setcodigo(this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelcodigoTipoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoempleado.setnombre(this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEmpleado.jLabelnombreTipoEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEmpleado(TipoEmpleado tipoempleadoBean,TipoEmpleado tipoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEmpleado(TipoEmpleado tipoempleadoOrigen,TipoEmpleado tipoempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoempleadoOrigen.getId()!=null && !tipoempleadoOrigen.getId().equals(0L))) {tipoempleado.setId(tipoempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoempleadoOrigen.getcodigo()!=null && !tipoempleadoOrigen.getcodigo().equals(""))) {tipoempleado.setcodigo(tipoempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoempleadoOrigen.getnombre()!=null && !tipoempleadoOrigen.getnombre().equals(""))) {tipoempleado.setnombre(tipoempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEmpleado(TipoEmpleado tipoempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setText(tipoempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setText(tipoempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setText(tipoempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEmpleado(TipoEmpleadoBean tipoempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setText(tipoempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setText(tipoempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setText(tipoempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEmpleado(TipoEmpleadoParameterReturnGeneral tipoempleadoReturnGeneral,TipoEmpleadoBean tipoempleadoBean,Boolean conDefault) throws Exception { 
		try {
			TipoEmpleado tipoempleadoLocal=new TipoEmpleado();
			
			tipoempleadoLocal=tipoempleadoReturnGeneral.getTipoEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoempleadoLocal.getId()!=null && !tipoempleadoLocal.getId().equals(0L))) {tipoempleadoBean.setId(tipoempleadoLocal.getId());}}
			if(conDefault || (!conDefault && tipoempleadoLocal.getcodigo()!=null && !tipoempleadoLocal.getcodigo().equals(""))) {tipoempleadoBean.setcodigo(tipoempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoempleadoLocal.getnombre()!=null && !tipoempleadoLocal.getnombre().equals(""))) {tipoempleadoBean.setnombre(tipoempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEmpleadoGenerico(Long idTipoEmpleadoSeleccionado,JComboBox jComboBoxTipoEmpleado,List<TipoEmpleado> tipoempleadosLocal)throws Exception {
		try {
			TipoEmpleado  tipoempleadoTemp=null;

			for(TipoEmpleado tipoempleadoAux:tipoempleadosLocal) {
				if(tipoempleadoAux.getId()!=null && tipoempleadoAux.getId().equals(idTipoEmpleadoSeleccionado)) {
					tipoempleadoTemp=tipoempleadoAux;
					break;
				}
			}

			jComboBoxTipoEmpleado.setSelectedItem(tipoempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEmpleadoGenerico(JComboBox jComboBoxTipoEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempleado=(TipoEmpleado) tipoempleadoLogic.getTipoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoempleado =(TipoEmpleado) tipoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoempleado.getIsNew() && !tipoempleado.getIsChanged() && !tipoempleado.getIsDeleted()) {
				sDescripcion=tipoempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoempleado.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEmpleado tipoempleadoRow=new TipoEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempleadoRow=(TipoEmpleado) tipoempleadoLogic.getTipoEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoempleadoRow=(TipoEmpleado) tipoempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoEmpleado tipoempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleado = (TipoEmpleado)this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoempleado = (TipoEmpleado)this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoempleado!=null) {
						this.tipoempleado = tipoempleado;
					} else {
						this.tipoempleado = new TipoEmpleado();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.tipoempleado)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame;
					}

					List<TipoEmpleado> tipoempleados=new ArrayList<TipoEmpleado>();
					tipoempleados.add(this.tipoempleado);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoEmpleado.cargarEmpleadoBeanSwingJInternalFrame(tipoempleados,this.tipoempleado,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoEmpleado=(TitledBorder)this.jScrollPanelDatosTipoEmpleado.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderTipoEmpleado.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado));			
			this.jButtonDuplicarTipoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpleado && this.isPermisoDuplicarTipoEmpleado));			
			this.jButtonCopiarTipoEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEmpleado && this.isPermisoCopiarTipoEmpleado));
			this.jButtonVerFormTipoEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEmpleado && this.isPermisoVerFormTipoEmpleado));
			
			this.jButtonAbrirOrderByTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));			
			
			this.jButtonNuevoRelacionesTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado && this.isPermisoNuevoTipoEmpleado));			
			this.jButtonNuevoGuardarCambiosTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarTipoEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEmpleado && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEmpleado && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEmpleado && this.isPermisoEliminarTipoEmpleado));
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEmpleado);							
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado));						
			this.jButtonDuplicarToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpleado && this.isPermisoDuplicarTipoEmpleado));						
			this.jButtonCopiarToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEmpleado && this.isPermisoCopiarTipoEmpleado));			
			this.jButtonVerFormToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEmpleado && this.isPermisoVerFormTipoEmpleado));			
			this.jButtonAbrirOrderByToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));
			this.jButtonNuevoRelacionesToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado && this.isPermisoNuevoTipoEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));			
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEmpleado && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEmpleado  && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEmpleado && this.isPermisoEliminarTipoEmpleado));
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarToolBarTipoEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEmpleado);				
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado));			
			this.jMenuItemDuplicarTipoEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEmpleado && this.isPermisoDuplicarTipoEmpleado));			
			this.jMenuItemCopiarTipoEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEmpleado && this.isPermisoCopiarTipoEmpleado));			
			this.jMenuItemVerFormTipoEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEmpleado && this.isPermisoVerFormTipoEmpleado));			
			this.jMenuItemAbrirOrderByTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));			
			//this.jMenuItemMostrarOcultarTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));
			this.jMenuItemDetalleAbrirOrderByTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarTipoEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEmpleado && this.isPermisoOrdenTipoEmpleado));			
			this.jMenuItemNuevoRelacionesTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado && this.isPermisoNuevoTipoEmpleado));			
			this.jMenuItemNuevoGuardarCambiosTipoEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEmpleado && this.isPermisoNuevoTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));									
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemModificarTipoEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEmpleado && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemActualizarTipoEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEmpleado && this.isPermisoActualizarTipoEmpleado));	
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemEliminarTipoEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEmpleado && this.isPermisoEliminarTipoEmpleado));
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemCancelarTipoEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));						
			this.jMenuItemGuardarCambiosTablaTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEmpleado=this.jButtonNuevoTipoEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEmpleado=this.jButtonDuplicarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarTipoEmpleado=this.jButtonCopiarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormTipoEmpleado=this.jButtonVerFormTipoEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEmpleado=this.jButtonAbrirOrderByTipoEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=this.jButtonNuevoRelacionesTipoEmpleado.isVisible();
			this.isVisibilidadCeldaModificarTipoEmpleado=this.jButtonModificarTipoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.isVisibilidadCeldaActualizarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=this.jButtonGuardarCambiosTablaTipoEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEmpleado=this.jButtonNuevoToolBarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=this.jButtonNuevoRelacionesToolBarTipoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarToolBarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarToolBarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarToolBarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarToolBarTipoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEmpleado=this.jButtonGuardarCambiosToolBarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=this.jButtonGuardarCambiosTablaToolBarTipoEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEmpleado=this.jMenuItemNuevoTipoEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=this.jMenuItemNuevoRelacionesTipoEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemModificarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemActualizarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemEliminarTipoEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemCancelarTipoEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEmpleado=this.jMenuItemGuardarCambiosTipoEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=this.jMenuItemGuardarCambiosTablaTipoEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEmpleado(Boolean esInicializar) {
		if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEmpleado() {
		this.jButtonNuevoTipoEmpleado.setVisible(this.isPermisoNuevoTipoEmpleado);			
		this.jButtonDuplicarTipoEmpleado.setVisible(this.isPermisoDuplicarTipoEmpleado);			
		this.jButtonCopiarTipoEmpleado.setVisible(this.isPermisoCopiarTipoEmpleado);			
		this.jButtonVerFormTipoEmpleado.setVisible(this.isPermisoVerFormTipoEmpleado);			
		
		this.jButtonAbrirOrderByTipoEmpleado.setVisible(this.isPermisoOrdenTipoEmpleado);					
		
		this.jButtonNuevoRelacionesTipoEmpleado.setVisible(this.isPermisoNuevoTipoEmpleado);			
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarTipoEmpleado.setVisible(this.isPermisoActualizarTipoEmpleado);	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.setVisible(this.isPermisoActualizarTipoEmpleado);	
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.setVisible(this.isPermisoEliminarTipoEmpleado);
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEmpleado);						
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.setVisible(this.isPermisoGuardarCambiosTipoEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.setVisible(this.isPermisoActualizarTipoEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEmpleado() {
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarTipoEmpleado.setVisible(this.isPermisoActualizarTipoEmpleado);	
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.setVisible(this.isPermisoActualizarTipoEmpleado);	
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.setVisible(this.isPermisoEliminarTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEmpleado);							
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEmpleado && this.isPermisoGuardarCambiosTipoEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEmpleado() {
		if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEmpleado() {
	}
	
	public void jTableDatosTipoEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.gettipoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempleado==null) {
						this.tipoempleado = new TipoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				}

				if(this.tipoempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoEmpleado(this.gettipoempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoempleadoLogic.getConnexion());

				if(this.tipoempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoEmpleado=(TitledBorder)this.jScrollPanelDatosTipoEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.gettipoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempleado==null) {
						this.tipoempleado = new TipoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				}

				if(this.tipoempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.gettipoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempleado==null) {
						this.tipoempleado = new TipoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				}

				if(this.tipoempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.gettipoempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoempleado==null) {
						this.tipoempleado = new TipoEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);
				}

				if(this.tipoempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoEmpleado(false,false);

			this.getTipoEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoEmpleado(false);

			//if(TipoEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoEmpleado() {
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEmpleado.dispose();
			this.jInternalFrameDetalleFormTipoEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
			this.jInternalFrameReporteDinamicoTipoEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEmpleado.dispose();
			this.jInternalFrameReporteDinamicoTipoEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionTipoEmpleado!=null) {
			this.jInternalFrameImportacionTipoEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEmpleado.dispose();
			this.jInternalFrameImportacionTipoEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEmpleado();
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEmpleado")) {
				jButtonDuplicarTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEmpleado")) {
				jButtonCopiarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEmpleado")) {
				jButtonVerFormTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEmpleado")) {
				jButtonDuplicarTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEmpleado")) {
				jButtonDuplicarTipoEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEmpleado")) {
				jButtonModificarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEmpleado")) {
				jButtonModificarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEmpleado")) {
				jButtonModificarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEmpleado")) {
				jButtonActualizarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEmpleado")) {
				jButtonActualizarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEmpleado")) {
				jButtonActualizarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEmpleado")) {
				jButtonEliminarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEmpleado")) {
				jButtonEliminarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEmpleado")) {
				jButtonEliminarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEmpleado")) {
				jButtonCancelarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEmpleado")) {
				jButtonCancelarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEmpleado")) {
				jButtonCancelarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEmpleado")) {
				jButtonCerrarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEmpleado")) {
				jButtonCerrarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEmpleado")) {
				jButtonCerrarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEmpleado")) {
				jButtonMostrarOcultarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEmpleado")) {
				jButtonCancelarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEmpleado")) {
				jButtonCopiarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEmpleado")) {
				jButtonVerFormTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEmpleado")) {
				jButtonCopiarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEmpleado")) {
				jButtonVerFormTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEmpleado")) {
				jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEmpleado")) {
				jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEmpleado")) {
				jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEmpleado")) {
				jButtonAnterioresTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEmpleado")) {
				jButtonAnterioresTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEmpleado")) {
				jButtonAnterioresTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEmpleado")) {
				jButtonSiguientesTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEmpleado")) {
				jButtonSiguientesTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEmpleado")) {
				jButtonSiguientesTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEmpleado")) {
				jButtonAbrirOrderByTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEmpleado")) {
				jButtonMostrarOcultarTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEmpleado")) {
				jButtonCerrarReporteDinamicoTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEmpleado")) {
				jButtonGenerarReporteDinamicoTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEmpleado")) {
				jButtonCerrarImportacionTipoEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEmpleado")) {
				
				jButtonGenerarImportacionTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEmpleado")) {
				
				jButtonAbrirImportacionTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEmpleado")) {
				jComboBoxTiposAccionesTipoEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEmpleado")) {
				jComboBoxTiposRelacionesTipoEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEmpleado")) {
				jComboBoxTiposAccionesTipoEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEmpleado")) {
				
				jComboBoxTiposSeleccionarTipoEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEmpleado")) {
				jTextFieldValorCampoGeneralTipoEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEmpleado")) {
				jButtonAbrirOrderByTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEmpleado")) {
				jButtonAbrirOrderByTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEmpleado")) {
				jButtonCerrarOrderByTipoEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEmpleadoBusqueda")) {
				this.jButtonidTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEmpleadoUpdate")) {
				this.jButtonid_empresaTipoEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEmpleadoBusqueda")) {
				this.jButtoncodigoTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEmpleadoBusqueda")) {
				this.jButtonnombreTipoEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEmpleado tipoempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoempleadoLocal=this.tipoempleado;
			} else {
				tipoempleadoLocal=this.tipoempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
							
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
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
			
			


			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
								
						
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
								
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
							
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
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
			
			


			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
								
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEmpleado")) {
					jCheckBoxSeleccionarTodosTipoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEmpleado")) {
					jCheckBoxSeleccionadosTipoEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEmpleado")) {
					
				}
				
				


				
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
												
				
				


				
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
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
			
			


			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoempleado);
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
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
				
				


				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoempleadoAnterior =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoempleado =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoempleado =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEmpleado")) {
				
				}
				
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEmpleado")) {
			
			}
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEmpleado();
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEmpleado")) {
				jButtonDuplicarTipoEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEmpleado")) {
				jButtonCopiarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEmpleado")) {
				jButtonVerFormTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEmpleado")) {
				jButtonNuevoTipoEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEmpleado")) {
				jButtonModificarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEmpleado")) {
				jButtonActualizarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEmpleado")) {
				jButtonEliminarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEmpleado")) {
				jButtonCancelarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEmpleado")) {
				jButtonCerrarTipoEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEmpleado")) {
				jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEmpleado")) {
				jButtonAbrirOrderByTipoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEmpleado")) {
				jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEmpleado")) {
				jButtonAnterioresTipoEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEmpleado")) {
				jButtonSiguientesTipoEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEmpleadoBusqueda")) {
				this.jButtonidTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEmpleadoUpdate")) {
				this.jButtonid_empresaTipoEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEmpleadoBusqueda")) {
				this.jButtoncodigoTipoEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEmpleadoBusqueda")) {
				this.jButtonnombreTipoEmpleadoBusquedaActionPerformed(evt);
			}
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEmpleado")) {
				closingInternalFrameTipoEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarTipoEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEmpleadoActionPerformed(null);
			}
			
			TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoempleado,new Object(),this.tipoempleadoParameterGeneral,this.tipoempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoempleado)) {
			if(!esControlTabla) {
				if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);			
				}
				
				if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEmpleado(this.tipoempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoempleadoReturnGeneral=tipoempleadoLogic.procesarEventosTipoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempleadoLogic.getTipoEmpleados(),this.tipoempleado,this.tipoempleadoParameterGeneral,this.isEsNuevoTipoEmpleado,classes);//this.tipoempleadoLogic.getTipoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEmpleado(this.tipoempleadoReturnGeneral,this.tipoempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEmpleado(classes,this.tipoempleadoReturnGeneral,this.tipoempleadoBean,false);
					}
						
					if(this.tipoempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado());	
					}
						
					if(this.tipoempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado(),classes);//this.tipoempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEmpleado(this.tipoempleado,classes);//this.tipoempleadoBean);									
				}
			
				if(TipoEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEmpleado(this.tipoempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEmpleado(this.tipoempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoempleadoAnterior!=null) {
						this.tipoempleado=this.tipoempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoempleadoReturnGeneral=tipoempleadoLogic.procesarEventosTipoEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempleadoLogic.getTipoEmpleados(),this.tipoempleado,this.tipoempleadoParameterGeneral,this.isEsNuevoTipoEmpleado,classes);//this.tipoempleadoLogic.getTipoEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoempleadoReturnGeneral.getTipoEmpleado(),tipoempleadoLogic.getTipoEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoempleadoReturnGeneral.getTipoEmpleado(),this.tipoempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEmpleado() throws Exception {
		
		TipoEmpleadoModel tipoempleadoModel=(TipoEmpleadoModel)this.jTableDatosTipoEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoempleadoModel.tipoempleados=this.tipoempleadoLogic.getTipoEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoempleadoModel.tipoempleados=this.tipoempleados;
		}
		
		
		((TipoEmpleadoModel) this.jTableDatosTipoEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoempleadoAnterior(),this.tipoempleadoLogic.getTipoEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoempleadoAnterior(),this.tipoempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEmpleado(TipoEmpleado tipoempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipoempleado.getEmpleados());
					this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
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
										
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempleado,new Object(),generalEntityParameterGeneral,this.tipoempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoempleado,new Object(),generalEntityParameterGeneral,this.tipoempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEmpleado(TipoEmpleadoBean tipoempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipoempleado.getEmpleados());
					this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEmpleado(ArrayList<Classe> classes,TipoEmpleadoReturnGeneral tipoempleadoReturnGeneral,TipoEmpleadoBean tipoempleadoBean,Boolean conDefault) throws Exception {
		
			this.tipoempleadoBean.setEmpleados(tipoempleadoReturnGeneral.getTipoEmpleado().getEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEmpleado(TipoEmpleado tipoempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					tipoempleado.setEmpleados(this.jInternalFrameDetalleFormTipoEmpleado.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEmpleado = new TipoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoempleadoSessionBean.getConGuardarRelaciones(),this.tipoempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormTipoEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEmpleado.tipoempleadoLogic=this.tipoempleadoLogic;
		
		this.cargarCombosFrameForeignKeyTipoEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEmpleado"));
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoEmpleado"));

		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEmpleado"));
					
		this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemModificarTipoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEmpleado"));
						
		this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemActualizarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEmpleado"));
								
		this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemEliminarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEmpleado"));
					
		this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemCancelarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemDetalleCerrarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonidTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtoncodigoTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonnombreTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEmpleado"));
		}
		
		this.jTableDatosTipoEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEmpleado"));
		
		this.jTableDatosTipoEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEmpleado"));
		
		this.jButtonNuevoTipoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoTipoEmpleado"));
		
		this.jButtonDuplicarTipoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarTipoEmpleado"));
		
		this.jButtonCopiarTipoEmpleado.addActionListener(new ButtonActionListener(this,"CopiarTipoEmpleado"));
		
		this.jButtonVerFormTipoEmpleado.addActionListener(new ButtonActionListener(this,"VerFormTipoEmpleado"));
		
		
		this.jButtonNuevoToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEmpleado"));
			
		this.jButtonDuplicarToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEmpleado"));
			
		this.jMenuItemNuevoTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEmpleado"));
			
		this.jMenuItemDuplicarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEmpleado"));		
		
		
		this.jButtonNuevoRelacionesTipoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEmpleado"));
			
		this.jMenuItemNuevoRelacionesTipoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonModificarToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEmpleado"));
			
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemModificarTipoEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarTipoEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonActualizarToolBarTipoEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEmpleado"));
				
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemActualizarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarTipoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonEliminarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEmpleado"));
						
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemEliminarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonCancelarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEmpleado"));
			
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemCancelarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEmpleado"));		
		
		
		this.jButtonCerrarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarTipoEmpleado"));
		
		
		this.jButtonCerrarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEmpleado"));
			
		this.jMenuItemCerrarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEmpleado"));
			
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jMenuItemDetalleCerrarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEmpleado"));
		}
		
		this.jButtonCopiarToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEmpleado"));
			
		this.jButtonVerFormToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEmpleado"));
		
		this.jMenuItemGuardarCambiosTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEmpleado"));
			
		this.jMenuItemCopiarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEmpleado"));		
		
		this.jMenuItemVerFormTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaTipoEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionTipoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEmpleado"));
					
		this.jButtonRecargarInformacionToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEmpleado"));
		
		this.jMenuItemRecargarInformacionTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEmpleado"));		
		
		
		
		this.jButtonAnterioresTipoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresTipoEmpleado"));
		
		
		this.jButtonAnterioresToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEmpleado"));
		
		this.jMenuItemAnterioresTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEmpleado"));		
		
		
		this.jButtonSiguientesTipoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesTipoEmpleado"));
		
		
		this.jButtonSiguientesToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEmpleado"));
			
		this.jMenuItemSiguientesTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEmpleado"));
			
		this.jMenuItemAbrirOrderByTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEmpleado"));
			
		this.jMenuItemMostrarOcultarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEmpleado"));

		this.jCheckBoxSeleccionadosTipoEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEmpleado"));
			
		this.jComboBoxTiposAccionesTipoEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEmpleado"));
					
		this.jComboBoxTiposSeleccionarTipoEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEmpleado"));
			
		this.jTextFieldValorCampoGeneralTipoEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonidTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtoncodigoTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonnombreTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEmpleado"));				
			//this.jButtonGenerarReporteDinamicoTipoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEmpleado!=null) {
				this.jInternalFrameImportacionTipoEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEmpleado"));
				this.jInternalFrameImportacionTipoEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEmpleado"));
				this.jInternalFrameImportacionTipoEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEmpleado"));
			
			this.jButtonAbrirOrderByToolBarTipoEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEmpleado"));			
			
			if(this.jInternalFrameOrderByTipoEmpleado!=null) {
				this.jInternalFrameOrderByTipoEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEmpleado.jTabbedPaneRelacionesTipoEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEmpleado"));
		
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
            		closingInternalFrameTipoEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            TipoEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEmpleado";
		inputMap = this.jButtonNuevoTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEmpleado";
		inputMap = this.jButtonModificarTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEmpleado";
		inputMap = this.jButtonActualizarTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEmpleado";
		inputMap = this.jButtonEliminarTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEmpleado";
		inputMap = this.jButtonCancelarTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEmpleado";
		inputMap = this.jButtonCerrarTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEmpleado";
		inputMap = this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonGuardarCambiosTipoEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonidTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonid_empresaTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtoncodigoTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEmpleado.jButtonnombreTipoEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
					tipoempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpleado tipoempleadoAux:tipoempleados) {
					tipoempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
						tipoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpleado tipoempleadoAux:tipoempleados) {
						tipoempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpleado tipoempleadoAux:tipoempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEmpleado.getSelectedRows();
			
			TipoEmpleado tipoempleadoLocal=new TipoEmpleado();
			
			//this.seleccionarTodosTipoEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempleadoLocal =(TipoEmpleado) this.tipoempleadoLogic.getTipoEmpleados().toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoempleadoLocal =(TipoEmpleado) this.tipoempleados.toArray()[this.jTableDatosTipoEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
						tipoempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEmpleado tipoempleadoAux:tipoempleados) {
						tipoempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEmpleado tipoempleadoAux:this.tipoempleadoLogic.getTipoEmpleados()) {
				
						if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpleado tipoempleadoAux:tipoempleados) {
					
						if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEmpleado(conSplash);
				
					this.generarReporteTipoEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEmpleado();
				
				this.exportarTipoEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEmpleados();
				//this.importarTipoEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxTiposAccionesFormularioTipoEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEmpleado();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEmpleado();
			
			if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
			TipoEmpleado tipoempleado=new TipoEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEmpleado.getSelectedItem();
			
			
			
			
			tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoempleadosSeleccionados.size()==1) {
				for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
					tipoempleado=tipoempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,tipoempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEmpleado();
			
      		//this.finishProcessTipoEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEmpleadoReturnGeneral() throws Exception {
		if(this.tipoempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEmpleado(false);
		}
		
		if(this.tipoempleadoReturnGeneral.getConRetornoLista() || this.tipoempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoempleadoLogic.setTipoEmpleados(this.tipoempleadoReturnGeneral.getTipoEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoempleadoLogic.setTipoEmpleado(this.tipoempleadoReturnGeneral.getTipoEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<TipoEmpleado> getTipoEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEmpleado tipoempleadoAux:tipoempleadoLogic.getTipoEmpleados()) {
					if(tipoempleadoAux.getIsSelected()) {
						tipoempleadosSeleccionados.add(tipoempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEmpleado tipoempleadoAux:this.tipoempleados) {
					if(tipoempleadoAux.getIsSelected()) {
						tipoempleadosSeleccionados.add(tipoempleadoAux);				
					}
				}
			}
			
			if(tipoempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoempleadosSeleccionados.addAll(this.tipoempleadoLogic.getTipoEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoempleadosSeleccionados.addAll(this.tipoempleados);				
					}
				}
			}
		} else {
			tipoempleadosSeleccionados.add(this.tipoempleado);
		}
		
		return tipoempleadosSeleccionados;
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
	
	public void generarReporteTipoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEmpleado();
		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEmpleado();
		
		
		//this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados ,tipoempleadoImplementable,tipoempleadoImplementableHome);
	}
	
	public void mostrarImportacionTipoEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEmpleado();
		
		this.abrirFrameImportacionTipoEmpleado();		
		
			
		//this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados ,tipoempleadoImplementable,tipoempleadoImplementableHome);
	}
	
	public void importarTipoEmpleados() throws Exception {		
	
	}
	
	public void exportarTipoEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEmpleado(tipoempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoempleadoAux.setsDetalleGeneralEntityReporte(tipoempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEmpleado(TipoEmpleado tipoempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEmpleado(row);				
				iRow++;
			}				
			
			for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEmpleado(tipoempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();		
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoempleado");
			//elementRoot.appendChild(element);
		
			for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
				element = document.createElement("tipoempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEmpleado(tipoempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEmpleado(TipoEmpleado tipoempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEmpleado(TipoEmpleado tipoempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEmpleado> tipoempleadosSeleccionados=new ArrayList<TipoEmpleado>();
		
		tipoempleadosSeleccionados=this.getTipoEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEmpleado(tipoempleadosSeleccionados);
		
		this.generarReporteTipoEmpleados("Todos",tipoempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEmpleado(ArrayList<TipoEmpleado> tipoempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEmpleado tipoempleadoAux:tipoempleadosSeleccionados) {
				tipoempleadoAux.setsDetalleGeneralEntityReporte(tipoempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoempleadoAux.setsDescripcionGeneralEntityReporte1(tipoempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoempleadoAux.setsDescripcionGeneralEntityReporte1(tipoempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoempleadoAux.setsDescripcionGeneralEntityReporte1(tipoempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEmpleado=true;
			this.isVisibilidadCeldaCancelarTipoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=true;
			this.isVisibilidadCeldaModificarTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEmpleado=true;
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=true;
		} else {
			this.actualizarEstadoPanelsTipoEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEmpleado=false;
			//this.isVisibilidadCeldaVerFormTipoEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;												
			}
			
			this.jButtonCerrarTipoEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoempleado)) {
			this.isVisibilidadCeldaActualizarTipoEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEmpleado() {
		this.isVisibilidadCeldaNuevoTipoEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosTipoEmpleado=false;
	}
	
	public void actualizarEstadoPanelsTipoEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEmpleado!=null) {
				this.jScrollPanelDatosTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEmpleado!=null) {
				this.jPanelPaginacionTipoEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
					this.jTabbedPaneBusquedasTipoEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoEmpleado!=null) {
				this.jPanelParametrosReportesTipoEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoEmpleadoParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.tipoempleadoSessionBean==null) {
				this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setsPathNavegacionActual(tipoempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TipoEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoEmpleado(true);
			this.jInternalFrameDetalleFormTipoEmpleado.empleadoSessionBean.setlidTipoEmpleadoActual(this.idTipoEmpleadoActual);

			tipoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoEmpleado(true);
			tipoempleadoSessionBean.setlIdTipoEmpleadoActualForeignKey(this.idTipoEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEmpleadoSessionBean tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		
		if(this.tipoempleadoSessionBean==null) {
			this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		}
		
		this.tipoempleadoSessionBean.setsUltimaBusquedaTipoEmpleado(this.getsAccionBusqueda());
		this.tipoempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEmpleadoSessionBean tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		
		if(this.tipoempleadoSessionBean==null) {
			this.tipoempleadoSessionBean=new TipoEmpleadoSessionBean();
		}
		
		if(this.tipoempleadoSessionBean.getsUltimaBusquedaTipoEmpleado()!=null&&!this.tipoempleadoSessionBean.getsUltimaBusquedaTipoEmpleado().equals("")) {
			this.setsAccionBusqueda(tipoempleadoSessionBean.getsUltimaBusquedaTipoEmpleado());
			this.setiNumeroPaginacion(tipoempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoempleadoSessionBean.getid_empresa());
				tipoempleadoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoempleadoSessionBean.setsUltimaBusquedaTipoEmpleado("");
		this.tipoempleadoSessionBean.setiNumeroPaginacion(TipoEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.tipoempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEmpleado() {
		this.updateBorderResaltarBusquedasFormularioTipoEmpleado();
		this.updateVisibilidadBusquedasFormularioTipoEmpleado();
		this.updateHabilitarBusquedasFormularioTipoEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoEmpleado.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEmpleado();
		this.updateVisibilidadResaltarControlesFormularioTipoEmpleado();
		this.updateHabilitarResaltarControlesFormularioTipoEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoempleadoConstantesFunciones.resaltaridTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado!=null) {this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setBorder(this.tipoempleadoConstantesFunciones.resaltaridTipoEmpleado);}
		if(this.tipoempleadoConstantesFunciones.resaltarid_empresaTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado!=null) {this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setBorder(this.tipoempleadoConstantesFunciones.resaltarid_empresaTipoEmpleado);}
		if(this.tipoempleadoConstantesFunciones.resaltarcodigoTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado!=null) {this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setBorder(this.tipoempleadoConstantesFunciones.resaltarcodigoTipoEmpleado);}
		if(this.tipoempleadoConstantesFunciones.resaltarnombreTipoEmpleado!=null && this.jInternalFrameDetalleFormTipoEmpleado!=null) {this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setBorder(this.tipoempleadoConstantesFunciones.resaltarnombreTipoEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostraridTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jPanelidTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostraridTipoEmpleado);
		//this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarid_empresaTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jPanelid_empresaTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarid_empresaTipoEmpleado);
		//this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarcodigoTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jPanelcodigoTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarcodigoTipoEmpleado);
		//this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarnombreTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jPanelnombreTipoEmpleado.setVisible(this.tipoempleadoConstantesFunciones.mostrarnombreTipoEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEmpleado!=null) {
	
		this.jInternalFrameDetalleFormTipoEmpleado.jLabelidTipoEmpleado.setEnabled(this.tipoempleadoConstantesFunciones.activaridTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jComboBoxid_empresaTipoEmpleado.setEnabled(this.tipoempleadoConstantesFunciones.activarid_empresaTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jTextFieldcodigoTipoEmpleado.setEnabled(this.tipoempleadoConstantesFunciones.activarcodigoTipoEmpleado);
		this.jInternalFrameDetalleFormTipoEmpleado.jTextAreanombreTipoEmpleado.setEnabled(this.tipoempleadoConstantesFunciones.activarnombreTipoEmpleado);
		}
	}
	
		
}
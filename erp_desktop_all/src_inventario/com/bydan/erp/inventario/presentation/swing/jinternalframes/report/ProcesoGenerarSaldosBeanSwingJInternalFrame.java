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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ProcesoGenerarSaldosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoGenerarSaldosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoGenerarSaldosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoGenerarSaldosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoGenerarSaldosBeanSwingJInternalFrame extends ProcesoGenerarSaldosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoGenerarSaldosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoGenerarSaldos> procesogenerarsaldosValidator = new ClassValidator<ProcesoGenerarSaldos>(ProcesoGenerarSaldos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoGenerarSaldos procesogenerarsaldos;	
	public ProcesoGenerarSaldos procesogenerarsaldosAux;
	public ProcesoGenerarSaldos procesogenerarsaldosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoGenerarSaldos procesogenerarsaldosTotales;
	public Long idProcesoGenerarSaldosActual;
	public Long iIdNuevoProcesoGenerarSaldos=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboTipoTransaccionModulo="";

	public List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey;

	public List<TipoTransaccionModulo> gettipotransaccionmodulosForeignKey() {
		return tipotransaccionmodulosForeignKey;
	}

	public void settipotransaccionmodulosForeignKey(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey) {
		this.tipotransaccionmodulosForeignKey = tipotransaccionmodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransaccionModulo tipotransaccionmoduloForeignKey;

	public TipoTransaccionModulo gettipotransaccionmoduloForeignKey() {
		return tipotransaccionmoduloForeignKey;
	}

	public void settipotransaccionmoduloForeignKey(TipoTransaccionModulo tipotransaccionmoduloForeignKey) {
		this.tipotransaccionmoduloForeignKey = tipotransaccionmoduloForeignKey;
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
	
	public Boolean isPermisoTodoProcesoGenerarSaldos;
	public Boolean isPermisoNuevoProcesoGenerarSaldos;
	public Boolean isPermisoActualizarProcesoGenerarSaldos;
	public Boolean isPermisoActualizarOriginalProcesoGenerarSaldos;
	public Boolean isPermisoEliminarProcesoGenerarSaldos;
	public Boolean isPermisoGuardarCambiosProcesoGenerarSaldos;
	public Boolean isPermisoConsultaProcesoGenerarSaldos;
	public Boolean isPermisoBusquedaProcesoGenerarSaldos;
	public Boolean isPermisoReporteProcesoGenerarSaldos;
	public Boolean isPermisoPaginacionMedioProcesoGenerarSaldos;
	public Boolean isPermisoPaginacionAltoProcesoGenerarSaldos;
	public Boolean isPermisoPaginacionTodoProcesoGenerarSaldos;
	public Boolean isPermisoCopiarProcesoGenerarSaldos;
	public Boolean isPermisoVerFormProcesoGenerarSaldos;
	public Boolean isPermisoDuplicarProcesoGenerarSaldos;
	public Boolean isPermisoOrdenProcesoGenerarSaldos;
	
	
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
	
	public ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosReturnGeneral;
	public ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoGenerarSaldos=false;
	public Boolean esParaAccionDesdeFormularioProcesoGenerarSaldos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoGenerarSaldosSessionBeanAdditional procesogenerarsaldosSessionBeanAdditional=null;
	
	public ProcesoGenerarSaldosSessionBeanAdditional getProcesoGenerarSaldosSessionBeanAdditional() {
		return this.procesogenerarsaldosSessionBeanAdditional;
	}
	
	public void setProcesoGenerarSaldosSessionBeanAdditional(ProcesoGenerarSaldosSessionBeanAdditional procesogenerarsaldosSessionBeanAdditional) {
		try {
			this.procesogenerarsaldosSessionBeanAdditional=procesogenerarsaldosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional procesogenerarsaldosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoGenerarSaldosBeanSwingJInternalFrame
	
	public ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional getProcesoGenerarSaldosBeanSwingJInternalFrameAdditional() {
		return this.procesogenerarsaldosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoGenerarSaldosBeanSwingJInternalFrameAdditional(ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional procesogenerarsaldosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesogenerarsaldosBeanSwingJInternalFrameAdditional=procesogenerarsaldosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoGenerarSaldosLogic procesogenerarsaldosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoGenerarSaldos procesogenerarsaldosBean;
	public ProcesoGenerarSaldosConstantesFunciones procesogenerarsaldosConstantesFunciones;
	//public ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoGenerarSaldos> procesogenerarsaldoss;	
	//public List<ProcesoGenerarSaldos> procesogenerarsaldossEliminados;
	//public List<ProcesoGenerarSaldos> procesogenerarsaldossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoGenerarSaldos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoGenerarSaldos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoGenerarSaldos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoGenerarSaldos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoGenerarSaldos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoGenerarSaldos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	
	public Long getiIdNuevoProcesoGenerarSaldos() {
		return this.iIdNuevoProcesoGenerarSaldos;
	}

	public void setiIdNuevoProcesoGenerarSaldos(Long iIdNuevoProcesoGenerarSaldos) {
		this.iIdNuevoProcesoGenerarSaldos = iIdNuevoProcesoGenerarSaldos;
	}
	
	public Long getidProcesoGenerarSaldosActual() {
		return this.idProcesoGenerarSaldosActual;
	}

	public void setidProcesoGenerarSaldosActual(Long idProcesoGenerarSaldosActual) {
		this.idProcesoGenerarSaldosActual = idProcesoGenerarSaldosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoGenerarSaldos getprocesogenerarsaldos() {
		return this.procesogenerarsaldos;
	}

	public void setprocesogenerarsaldos(ProcesoGenerarSaldos procesogenerarsaldos) {
		this.procesogenerarsaldos = procesogenerarsaldos;
	}
	
	public ProcesoGenerarSaldos getprocesogenerarsaldosAux() {
		return this.procesogenerarsaldosAux;
	}

	public void setprocesogenerarsaldosAux(ProcesoGenerarSaldos procesogenerarsaldosAux) {
		this.procesogenerarsaldosAux = procesogenerarsaldosAux;
	}				
	
	public ProcesoGenerarSaldos getprocesogenerarsaldosAnterior() {
		return this.procesogenerarsaldosAnterior;
	}

	public void setprocesogenerarsaldosAnterior(ProcesoGenerarSaldos procesogenerarsaldosAnterior) {
		this.procesogenerarsaldosAnterior = procesogenerarsaldosAnterior;
	}	
	
	public ProcesoGenerarSaldos getprocesogenerarsaldosTotales() {
		return this.procesogenerarsaldosTotales;
	}

	public void setprocesogenerarsaldosTotales(ProcesoGenerarSaldos procesogenerarsaldosTotales) {
		this.procesogenerarsaldosTotales = procesogenerarsaldosTotales;
	}	
	
	public ProcesoGenerarSaldos getprocesogenerarsaldosBean() {
		return this.procesogenerarsaldosBean;
	}

	public void setprocesogenerarsaldosBean(ProcesoGenerarSaldos procesogenerarsaldosBean) {
		this.procesogenerarsaldosBean = procesogenerarsaldosBean;
	}	
	
	public ProcesoGenerarSaldosParameterReturnGeneral getprocesogenerarsaldosReturnGeneral() {
		return this.procesogenerarsaldosReturnGeneral;
	}

	public void setprocesogenerarsaldosReturnGeneral(ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosReturnGeneral) {
		this.procesogenerarsaldosReturnGeneral = procesogenerarsaldosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaProcesoGenerarSaldos=-1L;

	public Long getid_ejercicioBusquedaProcesoGenerarSaldos() {
		return this.id_ejercicioBusquedaProcesoGenerarSaldos;
	}

	public void setid_ejercicioBusquedaProcesoGenerarSaldos(Long id_ejercicioBusquedaProcesoGenerarSaldos) {
		this.id_ejercicioBusquedaProcesoGenerarSaldos = id_ejercicioBusquedaProcesoGenerarSaldos;
	}

;
	public Long id_periodoBusquedaProcesoGenerarSaldos=-1L;

	public Long getid_periodoBusquedaProcesoGenerarSaldos() {
		return this.id_periodoBusquedaProcesoGenerarSaldos;
	}

	public void setid_periodoBusquedaProcesoGenerarSaldos(Long id_periodoBusquedaProcesoGenerarSaldos) {
		this.id_periodoBusquedaProcesoGenerarSaldos = id_periodoBusquedaProcesoGenerarSaldos;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=-1L;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoGenerarSaldosLogic getProcesoGenerarSaldosLogic()	{		
		return procesogenerarsaldosLogic;
	}

	public void setProcesoGenerarSaldosLogic(ProcesoGenerarSaldosLogic procesogenerarsaldosLogic) {
		this.procesogenerarsaldosLogic = procesogenerarsaldosLogic;
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
	
	public Boolean getIsEsNuevoProcesoGenerarSaldos() {
		return isEsNuevoProcesoGenerarSaldos;
	}

	public void setIsEsNuevoProcesoGenerarSaldos(Boolean isEsNuevoProcesoGenerarSaldos) {
		this.isEsNuevoProcesoGenerarSaldos = isEsNuevoProcesoGenerarSaldos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoGenerarSaldos() {
		return esParaAccionDesdeFormularioProcesoGenerarSaldos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoGenerarSaldos(Boolean esParaAccionDesdeFormularioProcesoGenerarSaldos) {
		this.esParaAccionDesdeFormularioProcesoGenerarSaldos = esParaAccionDesdeFormularioProcesoGenerarSaldos;
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

			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesogenerarsaldosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(procesogenerarsaldosSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(procesogenerarsaldosSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(procesogenerarsaldosSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosTipoTransaccionModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();

			//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(sFinalQuery,new Pagination());

					this.tipotransaccionmodulosForeignKey=tipotransaccionmoduloLogic.getTipoTransaccionModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransaccionModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getEntityWithConnection(procesogenerarsaldosSessionBean.getlidTipoTransaccionModuloActual());
					this.tipotransaccionmodulosForeignKey.add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
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

					if(this.procesogenerarsaldos!=null) {
						this.procesogenerarsaldos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoGenerarSaldos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoGenerarSaldosGenerico)throws Exception
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
				jComboBoxid_empresaProcesoGenerarSaldosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoGenerarSaldosGenerico!=null && jComboBoxid_empresaProcesoGenerarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoGenerarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.procesogenerarsaldos!=null) {
						this.procesogenerarsaldos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalProcesoGenerarSaldosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoGenerarSaldosGenerico!=null && jComboBoxid_sucursalProcesoGenerarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoGenerarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.procesogenerarsaldos!=null) {
						this.procesogenerarsaldos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoGenerarSaldos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos!=null) {
						jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos!=null) {
							//jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioProcesoGenerarSaldosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoGenerarSaldosGenerico!=null && jComboBoxid_ejercicioProcesoGenerarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoGenerarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.procesogenerarsaldos!=null) {
						this.procesogenerarsaldos.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoProcesoGenerarSaldos.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoGenerarSaldos") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos!=null) {
						jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos!=null) {
							//jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getItemCount()>0) {
								jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoProcesoGenerarSaldosGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoProcesoGenerarSaldosGenerico!=null && jComboBoxid_periodoProcesoGenerarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_periodoProcesoGenerarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaccionModuloForeignKey(Long idTipoTransaccionModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaccionmoduloTemp!=null) {

					if(this.procesogenerarsaldos!=null) {
						this.procesogenerarsaldos.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedIndex(0);
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

	public String getActualTipoTransaccionModuloForeignKeyDescripcion(Long idTipoTransaccionModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}


			sDescripcion=TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(tipotransaccionmoduloTemp!=null) {
				jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico!=null && jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoGenerarSaldos procesogenerarsaldos,JComboBox jComboBoxid_empresaProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoGenerarSaldosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoGenerarSaldosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesogenerarsaldos.setid_empresa(empresaAux.getId());
				procesogenerarsaldos.setempresa_descripcion(ProcesoGenerarSaldosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesogenerarsaldos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoGenerarSaldos procesogenerarsaldos,JComboBox jComboBoxid_sucursalProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoGenerarSaldosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoGenerarSaldosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesogenerarsaldos.setid_sucursal(sucursalAux.getId());
				procesogenerarsaldos.setsucursal_descripcion(ProcesoGenerarSaldosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesogenerarsaldos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoGenerarSaldos procesogenerarsaldos,JComboBox jComboBoxid_ejercicioProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoGenerarSaldosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoGenerarSaldosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesogenerarsaldos.setid_ejercicio(ejercicioAux.getId());
				procesogenerarsaldos.setejercicio_descripcion(ProcesoGenerarSaldosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesogenerarsaldos.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ProcesoGenerarSaldos procesogenerarsaldos,JComboBox jComboBoxid_periodoProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoProcesoGenerarSaldosGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoProcesoGenerarSaldosGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				procesogenerarsaldos.setid_periodo(periodoAux.getId());
				procesogenerarsaldos.setperiodo_descripcion(ProcesoGenerarSaldosConstantesFunciones.getPeriodoDescripcion(periodoAux));
				procesogenerarsaldos.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(ProcesoGenerarSaldos procesogenerarsaldos,JComboBox jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldosGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null && tipotransaccionmoduloAux.getId()!=null) {
				procesogenerarsaldos.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				procesogenerarsaldos.settipotransaccionmodulo_descripcion(ProcesoGenerarSaldosConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				procesogenerarsaldos.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
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

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
					}

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
					}

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
					}

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoGenerarSaldos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.addItem(ejercicio);
							}
						}

						if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
					}

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoGenerarSaldos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.addItem(periodo);
							}
						}

						if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransaccionModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransaccionModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { 
					}

					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTransaccionModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProcesoGenerarSaldos() throws Exception {
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
		
	public ProcesoGenerarSaldosParameterReturnGeneral getProcesoGenerarSaldosParameterGeneral() {
		return this.procesogenerarsaldosParameterGeneral;
	}
	
	public void setProcesoGenerarSaldosParameterGeneral(ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosParameterGeneral) {
		this.procesogenerarsaldosParameterGeneral = procesogenerarsaldosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoGenerarSaldos() {
		return isPermisoTodoProcesoGenerarSaldos;
	}

	public void setIsPermisoTodoProcesoGenerarSaldos(Boolean isPermisoTodoProcesoGenerarSaldos) {
		this.isPermisoTodoProcesoGenerarSaldos = isPermisoTodoProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoNuevoProcesoGenerarSaldos() {
		return isPermisoNuevoProcesoGenerarSaldos;
	}

	public void setIsPermisoNuevoProcesoGenerarSaldos(Boolean isPermisoNuevoProcesoGenerarSaldos) {
		this.isPermisoNuevoProcesoGenerarSaldos = isPermisoNuevoProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoActualizarProcesoGenerarSaldos() {
		return isPermisoActualizarProcesoGenerarSaldos;
	}

	public void setIsPermisoActualizarProcesoGenerarSaldos(Boolean isPermisoActualizarProcesoGenerarSaldos) {
		this.isPermisoActualizarProcesoGenerarSaldos = isPermisoActualizarProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoEliminarProcesoGenerarSaldos() {
		return isPermisoEliminarProcesoGenerarSaldos;
	}

	public void setIsPermisoEliminarProcesoGenerarSaldos(Boolean isPermisoEliminarProcesoGenerarSaldos) {
		this.isPermisoEliminarProcesoGenerarSaldos = isPermisoEliminarProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoGenerarSaldos() {
		return isPermisoGuardarCambiosProcesoGenerarSaldos;
	}

	public void setIsPermisoGuardarCambiosProcesoGenerarSaldos(Boolean isPermisoGuardarCambiosProcesoGenerarSaldos) {
		this.isPermisoGuardarCambiosProcesoGenerarSaldos = isPermisoGuardarCambiosProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoConsultaProcesoGenerarSaldos() {
		return isPermisoConsultaProcesoGenerarSaldos;
	}

	public void setIsPermisoConsultaProcesoGenerarSaldos(Boolean isPermisoConsultaProcesoGenerarSaldos) {
		this.isPermisoConsultaProcesoGenerarSaldos = isPermisoConsultaProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoBusquedaProcesoGenerarSaldos() {
		return isPermisoBusquedaProcesoGenerarSaldos;
	}

	public void setIsPermisoBusquedaProcesoGenerarSaldos(Boolean isPermisoBusquedaProcesoGenerarSaldos) {
		this.isPermisoBusquedaProcesoGenerarSaldos = isPermisoBusquedaProcesoGenerarSaldos;
	}

	public Boolean getIsPermisoReporteProcesoGenerarSaldos() {
		return isPermisoReporteProcesoGenerarSaldos;
	}

	public void setIsPermisoReporteProcesoGenerarSaldos(Boolean isPermisoReporteProcesoGenerarSaldos) {
		this.isPermisoReporteProcesoGenerarSaldos = isPermisoReporteProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoGenerarSaldos() {
		return isPermisoPaginacionMedioProcesoGenerarSaldos;
	}

	public void setIsPermisoPaginacionMedioProcesoGenerarSaldos(Boolean isPermisoPaginacionMedioProcesoGenerarSaldos) {
		this.isPermisoPaginacionMedioProcesoGenerarSaldos = isPermisoPaginacionMedioProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoGenerarSaldos() {
		return isPermisoPaginacionTodoProcesoGenerarSaldos;
	}

	public void setIsPermisoPaginacionTodoProcesoGenerarSaldos(Boolean isPermisoPaginacionTodoProcesoGenerarSaldos) {
		this.isPermisoPaginacionTodoProcesoGenerarSaldos = isPermisoPaginacionTodoProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoGenerarSaldos() {
		return isPermisoPaginacionAltoProcesoGenerarSaldos;
	}

	public void setIsPermisoPaginacionAltoProcesoGenerarSaldos(Boolean isPermisoPaginacionAltoProcesoGenerarSaldos) {
		this.isPermisoPaginacionAltoProcesoGenerarSaldos = isPermisoPaginacionAltoProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoCopiarProcesoGenerarSaldos() {
		return isPermisoCopiarProcesoGenerarSaldos;
	}

	public void setIsPermisoCopiarProcesoGenerarSaldos(Boolean isPermisoCopiarProcesoGenerarSaldos) {
		this.isPermisoCopiarProcesoGenerarSaldos = isPermisoCopiarProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoVerFormProcesoGenerarSaldos() {
		return isPermisoVerFormProcesoGenerarSaldos;
	}

	public void setIsPermisoVerFormProcesoGenerarSaldos(Boolean isPermisoVerFormProcesoGenerarSaldos) {
		this.isPermisoVerFormProcesoGenerarSaldos = isPermisoVerFormProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoGenerarSaldos() {
		return isPermisoDuplicarProcesoGenerarSaldos;
	}

	public void setIsPermisoDuplicarProcesoGenerarSaldos(Boolean isPermisoDuplicarProcesoGenerarSaldos) {
		this.isPermisoDuplicarProcesoGenerarSaldos = isPermisoDuplicarProcesoGenerarSaldos;
	}
	
	public Boolean getIsPermisoOrdenProcesoGenerarSaldos() {
		return isPermisoOrdenProcesoGenerarSaldos;
	}

	public void setIsPermisoOrdenProcesoGenerarSaldos(Boolean isPermisoOrdenProcesoGenerarSaldos) {
		this.isPermisoOrdenProcesoGenerarSaldos = isPermisoOrdenProcesoGenerarSaldos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoGenerarSaldos() {
		return isVisibilidadCeldaNuevoProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoGenerarSaldos(Boolean isVisibilidadCeldaNuevoProcesoGenerarSaldos) {
		this.isVisibilidadCeldaNuevoProcesoGenerarSaldos = isVisibilidadCeldaNuevoProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoGenerarSaldos() {
		return isVisibilidadCeldaDuplicarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoGenerarSaldos(Boolean isVisibilidadCeldaDuplicarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos = isVisibilidadCeldaDuplicarProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoGenerarSaldos() {
		return isVisibilidadCeldaCopiarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoGenerarSaldos(Boolean isVisibilidadCeldaCopiarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaCopiarProcesoGenerarSaldos = isVisibilidadCeldaCopiarProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoGenerarSaldos() {
		return isVisibilidadCeldaVerFormProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoGenerarSaldos(Boolean isVisibilidadCeldaVerFormProcesoGenerarSaldos) {
		this.isVisibilidadCeldaVerFormProcesoGenerarSaldos = isVisibilidadCeldaVerFormProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoGenerarSaldos() {
		return isVisibilidadCeldaOrdenProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoGenerarSaldos(Boolean isVisibilidadCeldaOrdenProcesoGenerarSaldos) {
		this.isVisibilidadCeldaOrdenProcesoGenerarSaldos = isVisibilidadCeldaOrdenProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos = isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoGenerarSaldos() {
		return isVisibilidadCeldaModificarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaModificarProcesoGenerarSaldos(Boolean isVisibilidadCeldaModificarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaModificarProcesoGenerarSaldos = isVisibilidadCeldaModificarProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoGenerarSaldos() {
		return isVisibilidadCeldaActualizarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoGenerarSaldos(Boolean isVisibilidadCeldaActualizarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaActualizarProcesoGenerarSaldos = isVisibilidadCeldaActualizarProcesoGenerarSaldos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoGenerarSaldos() {
		return isVisibilidadCeldaEliminarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoGenerarSaldos(Boolean isVisibilidadCeldaEliminarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaEliminarProcesoGenerarSaldos = isVisibilidadCeldaEliminarProcesoGenerarSaldos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoGenerarSaldos() {
		return isVisibilidadCeldaCancelarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoGenerarSaldos(Boolean isVisibilidadCeldaCancelarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaCancelarProcesoGenerarSaldos = isVisibilidadCeldaCancelarProcesoGenerarSaldos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoGenerarSaldos() {
		return isVisibilidadCeldaGuardarProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoGenerarSaldos(Boolean isVisibilidadCeldaGuardarProcesoGenerarSaldos) {
		this.isVisibilidadCeldaGuardarProcesoGenerarSaldos = isVisibilidadCeldaGuardarProcesoGenerarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos() {
		return isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos(Boolean isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos = isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos;
	}
		
	public ProcesoGenerarSaldosSessionBean getprocesogenerarsaldosSessionBean() {
		return this.procesogenerarsaldosSessionBean;
	}
	
	public void setprocesogenerarsaldosSessionBean(ProcesoGenerarSaldosSessionBean procesogenerarsaldosSessionBean) {
		this.procesogenerarsaldosSessionBean=procesogenerarsaldosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoGenerarSaldos() {
		return this.isVisibilidadBusquedaProcesoGenerarSaldos;
	}

	public void setisVisibilidadBusquedaProcesoGenerarSaldos(Boolean isVisibilidadBusquedaProcesoGenerarSaldos) {
		this.isVisibilidadBusquedaProcesoGenerarSaldos=isVisibilidadBusquedaProcesoGenerarSaldos;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesogenerarsaldos,null);
				this.setActualParaGuardarSucursalForeignKey(procesogenerarsaldos,null);
				this.setActualParaGuardarEjercicioForeignKey(procesogenerarsaldos,null);
				this.setActualParaGuardarPeriodoForeignKey(procesogenerarsaldos,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(procesogenerarsaldos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoGenerarSaldos procesogenerarsaldos,ProcesoGenerarSaldos procesogenerarsaldosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoGenerarSaldos(procesogenerarsaldos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesogenerarsaldosAux.setId(procesogenerarsaldos.getId());
		procesogenerarsaldosAux.setVersionRow(procesogenerarsaldos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoGenerarSaldos procesogenerarsaldosLocal) throws Exception {
		
		if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoGenerarSaldos procesogenerarsaldosLocal) throws Exception {	
		if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesogenerarsaldosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesogenerarsaldosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesogenerarsaldosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				procesogenerarsaldosLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				procesogenerarsaldosLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoGenerarSaldosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesogenerarsaldosValidator.getInvalidValues(this.procesogenerarsaldos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoGenerarSaldos procesogenerarsaldos,List<ProcesoGenerarSaldos> procesogenerarsaldoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoGenerarSaldos procesogenerarsaldos,List<ProcesoGenerarSaldos> procesogenerarsaldoss) throws Exception {
		try	{			
			ProcesoGenerarSaldosConstantesFunciones.actualizarSelectedLista(procesogenerarsaldos,procesogenerarsaldoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoGenerarSaldos> procesogenerarsaldossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesogenerarsaldossLocal=this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesogenerarsaldossLocal=this.procesogenerarsaldoss;
			}
			//ARCHITECTURE
		
			for(ProcesoGenerarSaldos procesogenerarsaldosLocal:procesogenerarsaldossLocal) {
				if(this.permiteMantenimiento(procesogenerarsaldosLocal) && procesogenerarsaldosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.getProcesoGenerarSaldosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_sucursalProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnumero_comprobanteProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelfechaProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodegaProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_productoProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcantidadProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_unitarioProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_totalProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.NOMBREBODEGAENVIAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodega_enviarProcesoGenerarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoGenerarSaldosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabeltotalProcesoGenerarSaldos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_sucursalProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelid_tipo_transaccion_moduloProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnumero_comprobanteProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelfechaProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodegaProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_productoProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcantidadProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_unitarioProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_totalProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodega_enviarProcesoGenerarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabeltotalProcesoGenerarSaldos,"");
		
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
		this.iIdNuevoProcesoGenerarSaldos--;	
		
		
		this.procesogenerarsaldosAux=new ProcesoGenerarSaldos();
		
		this.procesogenerarsaldosAux.setId(this.iIdNuevoProcesoGenerarSaldos);
		this.procesogenerarsaldosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().add(this.procesogenerarsaldosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesogenerarsaldoss.add(this.procesogenerarsaldosAux);
		}
		//ARCHITECTURE
		
		this.procesogenerarsaldos=this.procesogenerarsaldosAux;
		
		if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGenerarSaldos(this.procesogenerarsaldos);
		}
				
		//this.setDefaultControlesProcesoGenerarSaldos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoGenerarSaldos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoGenerarSaldos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGenerarSaldos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldosBean,this.procesogenerarsaldos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral,this.procesogenerarsaldosBean,false);
		
		if(this.procesogenerarsaldosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos());
		}
		
		if(this.procesogenerarsaldosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos(),classes);//this.procesogenerarsaldosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoGenerarSaldos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoGenerarSaldos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.RecargarFormProcesoGenerarSaldos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
						
			if(procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGenerarSaldos();
			}
			
			this.actualizarVisualTableDatosProcesoGenerarSaldos();
			
			this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoGenerarSaldos(), this.getIndiceNuevoProcesoGenerarSaldos());
			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoGenerarSaldos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarnombre_sucursalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarnumero_comprobanteProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarfechaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarnombre_bodegaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarnombre_productoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarcantidadProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarcosto_unitarioProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarcosto_totalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarnombre_bodega_enviarProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activartotalProcesoGenerarSaldos);	
		//
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarid_empresaProcesoGenerarSaldos);//
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarid_sucursalProcesoGenerarSaldos);//
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarid_ejercicioProcesoGenerarSaldos);//
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarid_periodoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setEnabled(isHabilitar && this.procesogenerarsaldosConstantesFunciones.activarid_tipo_transaccion_moduloProcesoGenerarSaldos);
	};
	
	public void setDefaultControlesProcesoGenerarSaldos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoGenerarSaldos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(true);			
			this.procesogenerarsaldosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.setVisible(true);
			
					
		} else {
			//this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(false);			
			this.procesogenerarsaldosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoGenerarSaldos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				if(procesogenerarsaldosAux.getId().equals(this.iIdNuevoProcesoGenerarSaldos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldoss) {
				if(procesogenerarsaldosAux.getId().equals(this.iIdNuevoProcesoGenerarSaldos)) {
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
	
	public int getIndiceActualProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				if(procesogenerarsaldosAux.getId().equals(procesogenerarsaldos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldoss) {
				if(procesogenerarsaldosAux.getId().equals(procesogenerarsaldos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				if(procesogenerarsaldosAux.getProcesoGenerarSaldosOriginal().getId().equals(procesogenerarsaldosOriginal.getId())) {
					existe=true;
					procesogenerarsaldosOriginal.setId(procesogenerarsaldosAux.getId());
					procesogenerarsaldosOriginal.setVersionRow(procesogenerarsaldosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldoss) {
				if(procesogenerarsaldosAux.getProcesoGenerarSaldosOriginal().getId().equals(procesogenerarsaldosOriginal.getId())) {
					existe=true;
					procesogenerarsaldosOriginal.setId(procesogenerarsaldosAux.getId());
					procesogenerarsaldosOriginal.setVersionRow(procesogenerarsaldosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoGenerarSaldos(Boolean esParaCancelar) throws Exception {
		procesogenerarsaldossAux=new ArrayList<ProcesoGenerarSaldos>();
		procesogenerarsaldosAux=new ProcesoGenerarSaldos();
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
					if(procesogenerarsaldosAux.getId()<0) {
						procesogenerarsaldossAux.add(procesogenerarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoGenerarSaldos=0L;
				this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().removeAll(procesogenerarsaldossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldoss) {
					if(procesogenerarsaldosAux.getId()<0) {
						procesogenerarsaldossAux.add(procesogenerarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoGenerarSaldos=0L;
				this.procesogenerarsaldoss.removeAll(procesogenerarsaldossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoGenerarSaldos 
					&& this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size()>0
					) {
					procesogenerarsaldosAux=this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().get(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size() - 1);
				
					if(procesogenerarsaldosAux.getId()<0) {
						this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().remove(procesogenerarsaldosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoGenerarSaldos && this.procesogenerarsaldoss.size()>0) {
					procesogenerarsaldosAux=this.procesogenerarsaldoss.get(this.procesogenerarsaldoss.size() - 1);
				
					if(procesogenerarsaldosAux.getId()<0) {
						this.procesogenerarsaldoss.remove(procesogenerarsaldosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoGenerarSaldos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesogenerarsaldos.getId()<0) {
				this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().remove(this.procesogenerarsaldos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesogenerarsaldos.getId()<0) {
				this.procesogenerarsaldoss.remove(this.procesogenerarsaldos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoGenerarSaldos(List<ProcesoGenerarSaldos> procesogenerarsaldossAux) throws Exception {
		ProcesoGenerarSaldosConstantesFunciones.setEstadosInicialesProcesoGenerarSaldos(procesogenerarsaldossAux);
	}
	
	public void setEstadosInicialesProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldosAux) throws Exception {
		ProcesoGenerarSaldosConstantesFunciones.setEstadosInicialesProcesoGenerarSaldos(procesogenerarsaldosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoGenerarSaldosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoGenerarSaldosActual()) {
				if(!this.isEsNuevoProcesoGenerarSaldos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoGenerarSaldos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoGenerarSaldosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Generar Saldos ?", "MANTENIMIENTO DE Proceso Generar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoGenerarSaldos procesogenerarsaldos) throws Exception {
		ProcesoGenerarSaldosConstantesFunciones.seleccionarAsignar(this.procesogenerarsaldos,procesogenerarsaldos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoGenerarSaldos=this.isPermisoActualizarOriginalProcesoGenerarSaldos;
			
			
			this.seleccionarAsignar(procesogenerarsaldos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesogenerarsaldosSessionBean.setsFuncionBusquedaRapida(this.procesogenerarsaldosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoGenerarSaldos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoGenerarSaldos(esParaCancelar);				
				this.cancelarNuevoProcesoGenerarSaldos(esParaCancelar);								
			}
			
			this.procesogenerarsaldos=new ProcesoGenerarSaldos();
			
			this.inicializarProcesoGenerarSaldos();
			
			this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoGenerarSaldos() throws Exception {
		try {
			ProcesoGenerarSaldosConstantesFunciones.inicializarProcesoGenerarSaldos(this.procesogenerarsaldos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoGenerarSaldoss(String sAccionBusqueda,List<ProcesoGenerarSaldos> procesogenerarsaldossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoGenerarSaldos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoGenerarSaldosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoGenerarSaldosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoGenerarSaldos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Generar Saldoses");		
		parameters.put("busquedapor", ProcesoGenerarSaldosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoGenerarSaldos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoGenerarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoGenerarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoGenerarSaldos=new JRBeanArrayDataSource(ProcesoGenerarSaldosJInternalFrame.TraerProcesoGenerarSaldosBeans(procesogenerarsaldossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoGenerarSaldos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoGenerarSaldosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoGenerarSaldosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoGenerarSaldosBean.TraerProcesoGenerarSaldosBeans(procesogenerarsaldossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldosActionPerformed(null);
					//this.generarExcelReporteProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoGenerarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesogenerarsaldossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoGenerarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGenerarSaldos> procesogenerarsaldossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGenerarSaldoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGenerarSaldos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoGenerarSaldos procesogenerarsaldos : procesogenerarsaldossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoGenerarSaldosConstantesFunciones.generarExcelReporteDataProcesoGenerarSaldos("NORMAL",row,workbook,procesogenerarsaldos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoGenerarSaldos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoGenerarSaldosConstantesFunciones.generarExcelReporteHeaderProcesoGenerarSaldos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoGenerarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGenerarSaldos> procesogenerarsaldossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGenerarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoGenerarSaldos procesogenerarsaldos : procesogenerarsaldossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.getProcesoGenerarSaldosDescripcion(procesogenerarsaldos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.getnombre_bodega_enviar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogenerarsaldos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoGenerarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGenerarSaldos> procesogenerarsaldossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoGenerarSaldos> procesogenerarsaldossRespaldo=null;
		
		classes=ProcesoGenerarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoGenerarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesogenerarsaldosLogic.setDatosCliente(this.datosCliente);
		this.procesogenerarsaldosLogic.setDatosDeep(this.datosDeep);
		this.procesogenerarsaldosLogic.setIsConDeep(true);
		
		procesogenerarsaldossRespaldo=this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss();
		
		this.procesogenerarsaldosLogic.setProcesoGenerarSaldoss(procesogenerarsaldossParaReportes);	
		this.procesogenerarsaldosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesogenerarsaldossParaReportes=this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss();
		this.procesogenerarsaldosLogic.setProcesoGenerarSaldoss(procesogenerarsaldossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGenerarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGenerarSaldos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoGenerarSaldos procesogenerarsaldos : procesogenerarsaldossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoGenerarSaldos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoGenerarSaldosConstantesFunciones.generarExcelReporteDataProcesoGenerarSaldos("NORMAL",row,workbook,procesogenerarsaldos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.getProcesoGenerarSaldosDescripcion(procesogenerarsaldos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoGenerarSaldos() throws Exception {		
		this.startProcessProcesoGenerarSaldos(true);
	}
	
	public void startProcessProcesoGenerarSaldos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoGenerarSaldos ,this.jPanelParametrosReportesProcesoGenerarSaldos, this.jScrollPanelDatosProcesoGenerarSaldos,this.jPanelPaginacionProcesoGenerarSaldos, this.jScrollPanelDatosEdicionProcesoGenerarSaldos, this.jPanelAccionesProcesoGenerarSaldos,this.jPanelAccionesFormularioProcesoGenerarSaldos,this.jmenuBarProcesoGenerarSaldos,this.jmenuBarDetalleProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGenerarSaldos=this.jTabbedPaneBusquedasProcesoGenerarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoGenerarSaldos=this.jPanelParametrosReportesProcesoGenerarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoGenerarSaldos=this.jScrollPanelDatosProcesoGenerarSaldos;
		final JTable jTableDatosProcesoGenerarSaldos=this.jTableDatosProcesoGenerarSaldos;		
		final JPanel jPanelPaginacionProcesoGenerarSaldos=this.jPanelPaginacionProcesoGenerarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGenerarSaldos=this.jScrollPanelDatosEdicionProcesoGenerarSaldos;
		final JPanel jPanelAccionesProcesoGenerarSaldos=this.jPanelAccionesProcesoGenerarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoGenerarSaldos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			jPanelCamposAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelCamposProcesoGenerarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelAccionesFormularioProcesoGenerarSaldos;
		}
		
		final JPanel jPanelCamposProcesoGenerarSaldos=jPanelCamposAuxiliarProcesoGenerarSaldos;
		final JPanel jPanelAccionesFormularioProcesoGenerarSaldos=jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos;
		
		
		final JMenuBar jmenuBarProcesoGenerarSaldos=this.jmenuBarProcesoGenerarSaldos;
		final JToolBar jTtoolBarProcesoGenerarSaldos=this.jTtoolBarProcesoGenerarSaldos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoGenerarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGenerarSaldos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jmenuBarDetalleProcesoGenerarSaldos;
			jTtoolBarDetalleAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTtoolBarDetalleProcesoGenerarSaldos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoGenerarSaldos=jmenuBarDetalleAuxiliarProcesoGenerarSaldos;
		final JToolBar jTtoolBarDetalleProcesoGenerarSaldos=jTtoolBarDetalleAuxiliarProcesoGenerarSaldos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGenerarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGenerarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoGenerarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoGenerarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGenerarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGenerarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGenerarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGenerarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGenerarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoGenerarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGenerarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoGenerarSaldos ,jPanelParametrosReportesProcesoGenerarSaldos,jTableDatosProcesoGenerarSaldos, /*jScrollPanelDatosProcesoGenerarSaldos,*/jPanelCamposProcesoGenerarSaldos,jPanelPaginacionProcesoGenerarSaldos, /*jScrollPanelDatosEdicionProcesoGenerarSaldos,*/ jPanelAccionesProcesoGenerarSaldos,jPanelAccionesFormularioProcesoGenerarSaldos,jmenuBarProcesoGenerarSaldos,jmenuBarDetalleProcesoGenerarSaldos,jTtoolBarProcesoGenerarSaldos,jTtoolBarDetalleProcesoGenerarSaldos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoGenerarSaldos ,jPanelParametrosReportesProcesoGenerarSaldos, jScrollPanelDatosProcesoGenerarSaldos,jPanelPaginacionProcesoGenerarSaldos, jScrollPanelDatosEdicionProcesoGenerarSaldos, jPanelAccionesProcesoGenerarSaldos,jPanelAccionesFormularioProcesoGenerarSaldos,jmenuBarProcesoGenerarSaldos,jmenuBarDetalleProcesoGenerarSaldos,jTtoolBarProcesoGenerarSaldos,jTtoolBarDetalleProcesoGenerarSaldos);
						
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
	
	public void finishProcessProcesoGenerarSaldos() {// throws Exception 
		this.finishProcessProcesoGenerarSaldos(true);
	}
	
	public void finishProcessProcesoGenerarSaldos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoGenerarSaldos ,this.jPanelParametrosReportesProcesoGenerarSaldos, this.jScrollPanelDatosProcesoGenerarSaldos,this.jPanelPaginacionProcesoGenerarSaldos, this.jScrollPanelDatosEdicionProcesoGenerarSaldos, this.jPanelAccionesProcesoGenerarSaldos,this.jPanelAccionesFormularioProcesoGenerarSaldos,this.jmenuBarProcesoGenerarSaldos,this.jmenuBarDetalleProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,this.jTtoolBarDetalleProcesoGenerarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGenerarSaldos=this.jTabbedPaneBusquedasProcesoGenerarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoGenerarSaldos=this.jPanelParametrosReportesProcesoGenerarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoGenerarSaldos=this.jScrollPanelDatosProcesoGenerarSaldos;
		final JTable jTableDatosProcesoGenerarSaldos=this.jTableDatosProcesoGenerarSaldos;		
		final JPanel jPanelPaginacionProcesoGenerarSaldos=this.jPanelPaginacionProcesoGenerarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGenerarSaldos=this.jScrollPanelDatosEdicionProcesoGenerarSaldos;
		final JPanel jPanelAccionesProcesoGenerarSaldos=this.jPanelAccionesProcesoGenerarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoGenerarSaldos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			jPanelCamposAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelCamposProcesoGenerarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelAccionesFormularioProcesoGenerarSaldos;
		}
		
		final JPanel jPanelCamposProcesoGenerarSaldos=jPanelCamposAuxiliarProcesoGenerarSaldos;
		final JPanel jPanelAccionesFormularioProcesoGenerarSaldos=jPanelAccionesFormularioAuxiliarProcesoGenerarSaldos;
		
		
		final JMenuBar jmenuBarProcesoGenerarSaldos=this.jmenuBarProcesoGenerarSaldos;		
		final JToolBar jTtoolBarProcesoGenerarSaldos=this.jTtoolBarProcesoGenerarSaldos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoGenerarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGenerarSaldos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jmenuBarDetalleProcesoGenerarSaldos;
			jTtoolBarDetalleAuxiliarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTtoolBarDetalleProcesoGenerarSaldos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoGenerarSaldos=jmenuBarDetalleAuxiliarProcesoGenerarSaldos;
		final JToolBar jTtoolBarDetalleProcesoGenerarSaldos=jTtoolBarDetalleAuxiliarProcesoGenerarSaldos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGenerarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGenerarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoGenerarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoGenerarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGenerarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGenerarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGenerarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGenerarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGenerarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoGenerarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGenerarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoGenerarSaldos ,jPanelParametrosReportesProcesoGenerarSaldos, jTableDatosProcesoGenerarSaldos,/*jScrollPanelDatosProcesoGenerarSaldos,*/jPanelCamposProcesoGenerarSaldos,jPanelPaginacionProcesoGenerarSaldos, /*jScrollPanelDatosEdicionProcesoGenerarSaldos,*/ jPanelAccionesProcesoGenerarSaldos,jPanelAccionesFormularioProcesoGenerarSaldos,jmenuBarProcesoGenerarSaldos,jmenuBarDetalleProcesoGenerarSaldos,jTtoolBarProcesoGenerarSaldos,jTtoolBarDetalleProcesoGenerarSaldos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoGenerarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoGenerarSaldos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoGenerarSaldos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoGenerarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoGenerarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoGenerarSaldos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoGenerarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoGenerarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoGenerarSaldos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesogenerarsaldosConstantesFunciones.getsFinalQueryProcesoGenerarSaldos();
		String  finalQueryPaginacionTodos=this.procesogenerarsaldosConstantesFunciones.getsFinalQueryProcesoGenerarSaldos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoGenerarSaldosConstantesFunciones.getArrayColumnasGlobalesNoProcesoGenerarSaldos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoGenerarSaldosConstantesFunciones.getArrayColumnasGlobalesProcesoGenerarSaldos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoGenerarSaldosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesogenerarsaldossEliminados= new ArrayList<ProcesoGenerarSaldos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoGenerarSaldos();
		
				///*ProcesoGenerarSaldosSessionBean*/this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			
			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
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
					this.iNumeroPaginacion=ProcesoGenerarSaldosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoGenerarSaldosConstantesFunciones.getClassesForeignKeysOfProcesoGenerarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesogenerarsaldos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesogenerarsaldossAux= new ArrayList<ProcesoGenerarSaldos>();
			
				
			procesogenerarsaldosLogic.setDatosCliente(this.datosCliente);
			procesogenerarsaldosLogic.setDatosDeep(this.datosDeep);
			procesogenerarsaldosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoGenerarSaldos")) {
				this.sDetalleReporte=ProcesoGenerarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoGenerarSaldos(id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesogenerarsaldosLogic.getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoGenerarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoGenerarSaldos(id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoGenerarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoGenerarSaldos(id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesogenerarsaldosLogic.getProcesoGenerarSaldoss()==null||procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesogenerarsaldoss==null|| procesogenerarsaldoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarsaldossAux=new ArrayList<ProcesoGenerarSaldos>();
						procesogenerarsaldossAux.addAll(procesogenerarsaldosLogic.getProcesoGenerarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogenerarsaldossAux=new ArrayList<ProcesoGenerarSaldos>();
							procesogenerarsaldossAux.addAll(procesogenerarsaldoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesogenerarsaldosLogic.getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoGenerarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoGenerarSaldos(id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoGenerarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoGenerarSaldos(id_ejercicioBusquedaProcesoGenerarSaldos,id_periodoBusquedaProcesoGenerarSaldos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoGenerarSaldoss("BusquedaProcesoGenerarSaldos",procesogenerarsaldosLogic.getProcesoGenerarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoGenerarSaldoss("BusquedaProcesoGenerarSaldos",procesogenerarsaldoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarsaldosLogic.setProcesoGenerarSaldoss(new ArrayList<ProcesoGenerarSaldos>());
						procesogenerarsaldosLogic.getProcesoGenerarSaldoss().addAll(procesogenerarsaldossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogenerarsaldoss=new ArrayList<ProcesoGenerarSaldos>();
							procesogenerarsaldoss.addAll(procesogenerarsaldossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoGenerarSaldos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoGenerarSaldos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogenerarsaldoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogenerarsaldoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoGenerarSaldos procesogenerarsaldos) {
		Boolean permite=true;
		
		if(this.procesogenerarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoGenerarSaldosConstantesFunciones.getOrderByListaProcesoGenerarSaldos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoGenerarSaldosConstantesFunciones.getOrderByListaProcesoGenerarSaldos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				if(procesogenerarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarsaldosTotales=procesogenerarsaldos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGenerarSaldos procesogenerarsaldos:this.procesogenerarsaldoss) {
				if(procesogenerarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarsaldosTotales=procesogenerarsaldos;
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
			this.procesogenerarsaldosAux=new ProcesoGenerarSaldos();
			this.procesogenerarsaldosAux.setsType(Constantes2.S_TOTALES);
			this.procesogenerarsaldosAux.setIsNew(false);
			this.procesogenerarsaldosAux.setIsChanged(false);
			this.procesogenerarsaldosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoGenerarSaldosConstantesFunciones.TotalizarValoresFilaProcesoGenerarSaldos(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss(),this.procesogenerarsaldosAux);
				
				//this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().add(this.procesogenerarsaldosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoGenerarSaldosConstantesFunciones.TotalizarValoresFilaProcesoGenerarSaldos(this.procesogenerarsaldoss,this.procesogenerarsaldosAux);
				
				this.procesogenerarsaldoss.add(this.procesogenerarsaldosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesogenerarsaldosTotales=new ProcesoGenerarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().remove(procesogenerarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogenerarsaldoss.remove(procesogenerarsaldosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesogenerarsaldosTotales=new ProcesoGenerarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				if(procesogenerarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarsaldosTotales=procesogenerarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGenerarSaldosConstantesFunciones.TotalizarValoresFilaProcesoGenerarSaldos(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss(),procesogenerarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGenerarSaldos procesogenerarsaldos:this.procesogenerarsaldoss) {
				if(procesogenerarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesogenerarsaldosTotales=procesogenerarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGenerarSaldosConstantesFunciones.TotalizarValoresFilaProcesoGenerarSaldos(this.procesogenerarsaldoss,procesogenerarsaldosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoGenerarSaldos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGenerarSaldossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGenerarSaldossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGenerarSaldossFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGenerarSaldossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoGenerarSaldossFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos(String sFinalQuery,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos(sFinalQuery,this.pagination,id_ejercicio,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGenerarSaldossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGenerarSaldossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGenerarSaldossFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGenerarSaldossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoGenerarSaldossFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesogenerarsaldosLogic.getProcesoGenerarSaldossFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoGenerarSaldos() {
		this.isPermisoTodoProcesoGenerarSaldos=false;
		this.isPermisoNuevoProcesoGenerarSaldos=false;
		this.isPermisoActualizarProcesoGenerarSaldos=false;
		this.isPermisoActualizarOriginalProcesoGenerarSaldos=false;
		this.isPermisoEliminarProcesoGenerarSaldos=false;
		this.isPermisoGuardarCambiosProcesoGenerarSaldos=false;
		this.isPermisoConsultaProcesoGenerarSaldos=true;
		this.isPermisoBusquedaProcesoGenerarSaldos=true;
		this.isPermisoReporteProcesoGenerarSaldos=true;
		this.isPermisoOrdenProcesoGenerarSaldos=false;		
		this.isPermisoPaginacionMedioProcesoGenerarSaldos=false;		
		this.isPermisoPaginacionAltoProcesoGenerarSaldos=false;		
		this.isPermisoPaginacionTodoProcesoGenerarSaldos=false;		
		this.isPermisoCopiarProcesoGenerarSaldos=false;		
		this.isPermisoVerFormProcesoGenerarSaldos=false;		
		this.isPermisoDuplicarProcesoGenerarSaldos=false;
		this.isPermisoOrdenProcesoGenerarSaldos=false;
	}
	
	public void setPermisosUsuarioProcesoGenerarSaldos(Boolean isPermiso) {
		this.isPermisoTodoProcesoGenerarSaldos=isPermiso;
		this.isPermisoNuevoProcesoGenerarSaldos=isPermiso;
		this.isPermisoActualizarProcesoGenerarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoGenerarSaldos=isPermiso;
		this.isPermisoEliminarProcesoGenerarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoGenerarSaldos=isPermiso;
		this.isPermisoConsultaProcesoGenerarSaldos=isPermiso;
		this.isPermisoBusquedaProcesoGenerarSaldos=isPermiso;
		this.isPermisoReporteProcesoGenerarSaldos=isPermiso;
		this.isPermisoOrdenProcesoGenerarSaldos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoGenerarSaldos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoGenerarSaldos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoGenerarSaldos=isPermiso;		
		this.isPermisoCopiarProcesoGenerarSaldos=isPermiso;		
		this.isPermisoVerFormProcesoGenerarSaldos=isPermiso;		
		this.isPermisoDuplicarProcesoGenerarSaldos=isPermiso;
		this.isPermisoOrdenProcesoGenerarSaldos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoGenerarSaldos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoGenerarSaldos=isPermiso;
		this.isPermisoNuevoProcesoGenerarSaldos=isPermiso;
		this.isPermisoActualizarProcesoGenerarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoGenerarSaldos=isPermiso;
		this.isPermisoEliminarProcesoGenerarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoGenerarSaldos=isPermiso;
		//this.isPermisoConsultaProcesoGenerarSaldos=isPermiso;
		//this.isPermisoBusquedaProcesoGenerarSaldos=isPermiso;
		//this.isPermisoReporteProcesoGenerarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoGenerarSaldos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoGenerarSaldos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoGenerarSaldos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoGenerarSaldos=isPermiso;		
		//this.isPermisoCopiarProcesoGenerarSaldos=isPermiso;		
		//this.isPermisoDuplicarProcesoGenerarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoGenerarSaldos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGenerarSaldosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoGenerarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGenerarSaldosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoGenerarSaldosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoGenerarSaldosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoGenerarSaldosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoGenerarSaldos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoGenerarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoGenerarSaldosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoGenerarSaldos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoGenerarSaldos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoGenerarSaldos=this.isPermisoActualizarProcesoGenerarSaldos;
			this.isPermisoEliminarProcesoGenerarSaldos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoGenerarSaldos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoGenerarSaldos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoGenerarSaldos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoGenerarSaldos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoGenerarSaldos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGenerarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoGenerarSaldos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoGenerarSaldos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoGenerarSaldos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoGenerarSaldos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoGenerarSaldos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoGenerarSaldos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGenerarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoGenerarSaldos.setToolTipText(this.jTableDatosProcesoGenerarSaldos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoGenerarSaldos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoGenerarSaldos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoGenerarSaldos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoGenerarSaldosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoGenerarSaldosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoGenerarSaldosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoGenerarSaldos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.procesogenerarsaldosSessionBean==null) {
				this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
			}

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.procesogenerarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
				TipoTransaccionModuloConstantesFunciones.setTipoTransaccionModuloDescripcion(tipotransaccionmodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransaccionmodulo.setId(null);

				if(!TipoTransaccionModuloConstantesFunciones.ExisteEnLista(this.tipotransaccionmodulosForeignKey,tipotransaccionmodulo,true)) {

					this.tipotransaccionmodulosForeignKey.add(0,tipotransaccionmodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoGenerarSaldos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoGenerarSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoGenerarSaldos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGenerarSaldos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos)throws Exception {	
		try {
			
			this.setActualTipoTransaccionModuloForeignKey(procesogenerarsaldos.getid_tipo_transaccion_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoGenerarSaldos()throws Exception {	
		try {
			
			this.setActualTipoTransaccionModuloForeignKey(this.procesogenerarsaldosConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGenerarSaldos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoGenerarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoGenerarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoGenerarSaldos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoGenerarSaldos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoGenerarSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoGenerarSaldos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProcesoGenerarSaldosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoGenerarSaldosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoGenerarSaldosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean(); 
		this.procesogenerarsaldosConstantesFunciones=new ProcesoGenerarSaldosConstantesFunciones(); 
		this.procesogenerarsaldosBean=new ProcesoGenerarSaldos();//(this.procesogenerarsaldosConstantesFunciones); 		
		this.procesogenerarsaldosReturnGeneral=new ProcesoGenerarSaldosParameterReturnGeneral(); 
		
		this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoGenerarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoGenerarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoGenerarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoGenerarSaldos(true);
			
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
			
			this.procesogenerarsaldosConstantesFunciones=new ProcesoGenerarSaldosConstantesFunciones(); 
			this.procesogenerarsaldosBean=new ProcesoGenerarSaldos();//this.procesogenerarsaldosConstantesFunciones); 			
			this.procesogenerarsaldosReturnGeneral=new ProcesoGenerarSaldosParameterReturnGeneral(); 
		
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Generar Saldos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesogenerarsaldos=new ProcesoGenerarSaldos();
			this.procesogenerarsaldoss = new ArrayList<ProcesoGenerarSaldos>();
			this.procesogenerarsaldossAux = new ArrayList<ProcesoGenerarSaldos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic=new ProcesoGenerarSaldosLogic();
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesogenerarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoGenerarSaldos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGenerarSaldos);	
					}
					
					if(this.jInternalFrameImportacionProcesoGenerarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGenerarSaldos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoGenerarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoGenerarSaldos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGenerarSaldos);
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos);
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoGenerarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGenerarSaldos);
					this.jInternalFrameImportacionProcesoGenerarSaldos.setVisible(false);
					this.jInternalFrameImportacionProcesoGenerarSaldos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoGenerarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGenerarSaldos);
					this.jInternalFrameOrderByProcesoGenerarSaldos.setVisible(false);
					this.jInternalFrameOrderByProcesoGenerarSaldos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoGenerarSaldosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoGenerarSaldosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesogenerarsaldosReturnGeneral=new ProcesoGenerarSaldosParameterReturnGeneral();
			
			this.procesogenerarsaldosParameterGeneral=new ProcesoGenerarSaldosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesogenerarsaldosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGenerarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),this.procesogenerarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGenerarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),this.procesogenerarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaCopiarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaVerFormProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaOrdenProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			
			
			this.isVisibilidadBusquedaProcesoGenerarSaldos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoGenerarSaldos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoGenerarSaldos(false);
			
			this.setPermisosUsuarioProcesoGenerarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado() && this.procesogenerarsaldosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoGenerarSaldosClasesRelacionadas();
			}
			
			if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoGenerarSaldosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoGenerarSaldos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoGenerarSaldos();
			}
			
			if(!this.isPermisoBusquedaProcesoGenerarSaldos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoGenerarSaldosConstantesFunciones.getTiposSeleccionarProcesoGenerarSaldos());
				
				this.tiposColumnasSelect=ProcesoGenerarSaldosConstantesFunciones.getTiposSeleccionarProcesoGenerarSaldos(true);
				
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
			//if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoGenerarSaldos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoGenerarSaldos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoGenerarSaldos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGenerarSaldos() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesogenerarsaldosImplementable= (ProcesoGenerarSaldosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGenerarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesogenerarsaldosImplementableHome= (ProcesoGenerarSaldosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGenerarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesogenerarsaldoss= new ArrayList<ProcesoGenerarSaldos>();
			this.procesogenerarsaldossEliminados= new ArrayList<ProcesoGenerarSaldos>();
						
			this.isEsNuevoProcesoGenerarSaldos=false;
			this.esParaAccionDesdeFormularioProcesoGenerarSaldos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoGenerarSaldos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoGenerarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoGenerarSaldosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoGenerarSaldos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoGenerarSaldos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoGenerarSaldos();
			}
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoGenerarSaldos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoGenerarSaldos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoGenerarSaldos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoGenerarSaldos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoGenerarSaldos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoGenerarSaldos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoGenerarSaldos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoGenerarSaldos();	
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
	
	public void cargarCombosForeignKeyProcesoGenerarSaldos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoGenerarSaldos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoGenerarSaldos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoGenerarSaldosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoGenerarSaldos();
		
		this.cargarCombosFrameForeignKeyProcesoGenerarSaldos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoGenerarSaldos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoGenerarSaldos();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoGenerarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			
			if(jTableDatosProcesoGenerarSaldos.getRowCount()>=1) {
				jTableDatosProcesoGenerarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoGenerarSaldos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoGenerarSaldos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoGenerarSaldos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoGenerarSaldos(true);			
			//this.procesogenerarsaldos=new ProcesoGenerarSaldos();
			//this.procesogenerarsaldos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos() ;
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGenerarSaldos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesogenerarsaldos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);				
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoGenerarSaldos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoGenerarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoGenerarSaldos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoGenerarSaldos.getSelectedRows().length;			
			}
			
			procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoGenerarSaldos--;			
				//ProcesoGenerarSaldos procesogenerarsaldosAux= new ProcesoGenerarSaldos();			
				//procesogenerarsaldosAux.setId(this.iIdNuevoProcesoGenerarSaldos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoGenerarSaldos procesogenerarsaldosOrigen=new ProcesoGenerarSaldos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoGenerarSaldos procesogenerarsaldosOrigen : procesogenerarsaldossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesogenerarsaldosOrigen =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogenerarsaldosOrigen =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoGenerarSaldos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesogenerarsaldos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoGenerarSaldos(procesogenerarsaldosOrigen,this.procesogenerarsaldos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().add(this.procesogenerarsaldosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldoss.add(this.procesogenerarsaldosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
				
				this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoGenerarSaldos(), this.getIndiceNuevoProcesoGenerarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoGenerarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGenerarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGenerarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();									
		
			ProcesoGenerarSaldos procesogenerarsaldosOrigen=new ProcesoGenerarSaldos();
			ProcesoGenerarSaldos procesogenerarsaldosDestino=new ProcesoGenerarSaldos();
				
			procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoGenerarSaldos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesogenerarsaldossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoGenerarSaldos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarsaldosOrigen =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogenerarsaldosOrigen =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogenerarsaldosDestino =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogenerarsaldosDestino =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesogenerarsaldosOrigen =procesogenerarsaldossSeleccionados.get(0);
				procesogenerarsaldosDestino =procesogenerarsaldossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoGenerarSaldos(procesogenerarsaldosOrigen,procesogenerarsaldosDestino,true,false);
				
				procesogenerarsaldosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesogenerarsaldosDestino,procesogenerarsaldosLogic.getProcesoGenerarSaldoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesogenerarsaldosDestino,procesogenerarsaldoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
				
				//this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoGenerarSaldos(), this.getIndiceNuevoProcesoGenerarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoGenerarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGenerarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGenerarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoGenerarSaldos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoGenerarSaldos.setVisible(!isVisible);
			this.jPanelAccionesProcesoGenerarSaldos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoGenerarSaldos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoGenerarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoGenerarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoGenerarSaldos();
			
			this.abrirFrameOrderByProcesoGenerarSaldos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoGenerarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoGenerarSaldos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGenerarSaldos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSize(this.jInternalFrameDetalleFormProcesoGenerarSaldos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoGenerarSaldos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoGenerarSaldos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoGenerarSaldos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jContentPaneDetalleProcesoGenerarSaldos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jContentPaneDetalleProcesoGenerarSaldos.getWidth(),ProcesoGenerarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jContentPaneDetalleProcesoGenerarSaldos.getWidth(),ProcesoGenerarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jContentPaneDetalleProcesoGenerarSaldos.getWidth(),ProcesoGenerarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoGenerarSaldos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoGenerarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoGenerarSaldos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoGenerarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGenerarSaldos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoGenerarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGenerarSaldos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGenerarSaldos);
				this.jInternalFrameOrderByProcesoGenerarSaldos.setVisible(false);
				this.jInternalFrameOrderByProcesoGenerarSaldos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoGenerarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGenerarSaldos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoGenerarSaldos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoGenerarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoGenerarSaldos==null) {
				
				this.jInternalFrameImportacionProcesoGenerarSaldos=new ImportacionJInternalFrame(ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGenerarSaldos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGenerarSaldos);
				this.jInternalFrameImportacionProcesoGenerarSaldos.setVisible(false);
				this.jInternalFrameImportacionProcesoGenerarSaldos.setSelected(false);


				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGenerarSaldos"));
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGenerarSaldos"));
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGenerarSaldos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoGenerarSaldos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos==null) {
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos=new ReporteDinamicoJInternalFrame(ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGenerarSaldos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos);
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGenerarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGenerarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGenerarSaldos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGenerarSaldos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoGenerarSaldos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGenerarSaldos);
			
	       	this.jInternalFrameDetalleFormProcesoGenerarSaldos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoGenerarSaldos.dispose();
			//this.jInternalFrameDetalleFormProcesoGenerarSaldos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoGenerarSaldos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoGenerarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoGenerarSaldos.setVisible(true);
	        this.jInternalFrameImportacionProcesoGenerarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoGenerarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoGenerarSaldos.setVisible(true);
	        this.jInternalFrameOrderByProcesoGenerarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoGenerarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoGenerarSaldos.setVisible(false);
	        this.jInternalFrameOrderByProcesoGenerarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoGenerarSaldos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoGenerarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoGenerarSaldos.setVisible(false);
	        this.jInternalFrameImportacionProcesoGenerarSaldos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoGenerarSaldos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoGenerarSaldos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoGenerarSaldos(true);
			//this.isEsNuevoProcesoGenerarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false) ;
			
			if(procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGenerarSaldos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoGenerarSaldosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoGenerarSaldos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoGenerarSaldos(true);
			//this.isEsNuevoProcesoGenerarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesogenerarsaldos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false) ;
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGenerarSaldos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoGenerarSaldos(false);
			
			//if(!this.isEsNuevoProcesoGenerarSaldos) {								
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				
			}
			
			if(this.permiteMantenimiento(this.procesogenerarsaldos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoGenerarSaldos=true;
					this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
					this.isEsNuevoProcesoGenerarSaldos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoGenerarSaldos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoGenerarSaldos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoGenerarSaldos(false);
			
												
				
				if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoGenerarSaldos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,procesogenerarsaldosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoGenerarSaldos(this.procesogenerarsaldos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesogenerarsaldosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesogenerarsaldos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesogenerarsaldos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesogenerarsaldos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesogenerarsaldos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoGenerarSaldosModel) this.jTableDatosProcesoGenerarSaldos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoGenerarSaldos=true;
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
				this.isEsNuevoProcesoGenerarSaldos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoGenerarSaldos(false);
				
				
				
				if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoGenerarSaldos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoGenerarSaldos.getRowCount()>=1) {
				jTableDatosProcesoGenerarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoGenerarSaldos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoGenerarSaldos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(false) ;
			
			this.isEsNuevoProcesoGenerarSaldos=false;
			
			if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoGenerarSaldos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				
				//SI ES MANUAL
				if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoGenerarSaldos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoGenerarSaldos--;			
			//ProcesoGenerarSaldos procesogenerarsaldosAux= new ProcesoGenerarSaldos();			
			//procesogenerarsaldosAux.setId(this.iIdNuevoProcesoGenerarSaldos);
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoGenerarSaldos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
			
			this.procesogenerarsaldos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().add(this.procesogenerarsaldosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesogenerarsaldoss.add(this.procesogenerarsaldosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			
			this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoGenerarSaldos(), this.getIndiceNuevoProcesoGenerarSaldos());
			
			int iLastRow =  this.jTableDatosProcesoGenerarSaldos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoGenerarSaldos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoGenerarSaldos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGenerarSaldos();
			}
			
			//this.abrirFrameTreeProcesoGenerarSaldos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoGenerarSaldos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoGenerarSaldos.setFileImportacion(this.jInternalFrameImportacionProcesoGenerarSaldos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoGenerarSaldos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoGenerarSaldos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		

		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoGenerarSaldosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoGenerarSaldosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodegaEnviar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodegaEnviar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodegaEnviar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodegaEnviar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					sNombreCampoCategoria="nombre_bodega_enviar";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					sNombreCampoCategoriaValor="nombre_bodega_enviar";
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega Enviar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega_enviar");
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoGenerarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.getnombre_bodega_enviar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogenerarsaldos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelProcesoGenerarSaldos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoGenerarSaldos(procesogenerarsaldosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGenerarSaldos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGenerarSaldos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGenerarSaldos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoGenerarSaldos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoGenerarSaldos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoGenerarSaldos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoGenerarSaldos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoGenerarSaldos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoGenerarSaldos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoGenerarSaldos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoGenerarSaldos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoGenerarSaldos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoGenerarSaldos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoGenerarSaldos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoGenerarSaldos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoGenerarSaldos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGenerarSaldos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoGenerarSaldos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoGenerarSaldos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoGenerarSaldos();
		
		this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGenerarSaldos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGenerarSaldos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGenerarSaldos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGenerarSaldos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoGenerarSaldos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionNuevoProcesoGenerarSaldos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionNuevoProcesoGenerarSaldos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionSinCerrarProcesoGenerarSaldos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jCheckBoxPostAccionSinMensajeProcesoGenerarSaldos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoGenerarSaldos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoGenerarSaldos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoGenerarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoGenerarSaldos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoGenerarSaldos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoGenerarSaldos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGenerarSaldos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGenerarSaldos() throws Exception {
		try	{
			if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGenerarSaldos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGenerarSaldos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGenerarSaldos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoGenerarSaldos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoGenerarSaldos.addItem(reporte);
			}
			
			
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoGenerarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoGenerarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGenerarSaldos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGenerarSaldos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoGenerarSaldosConstantesFunciones.getTiposSeleccionarProcesoGenerarSaldos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoGenerarSaldosConstantesFunciones.getTiposSeleccionarProcesoGenerarSaldos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoGenerarSaldosConstantesFunciones.getTiposSeleccionarProcesoGenerarSaldos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoGenerarSaldos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getSelectedItem()!=null){this.id_ejercicioBusquedaProcesoGenerarSaldos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getSelectedItem()!=null){this.id_periodoBusquedaProcesoGenerarSaldos=((Periodo)this.jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoGenerarSaldos(Boolean esInicializar) throws Exception {				
		if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGenerarSaldos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoGenerarSaldos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoGenerarSaldos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoGenerarSaldosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoGenerarSaldos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesogenerarsaldoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoGenerarSaldos.setModel(new ProcesoGenerarSaldosModel(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoGenerarSaldos.setModel(new ProcesoGenerarSaldosModel(this.procesogenerarsaldoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoGenerarSaldos!=null && this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoGenerarSaldos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,procesogenerarsaldosConstantesFunciones.resaltarSeleccionarProcesoGenerarSaldos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,procesogenerarsaldosConstantesFunciones.resaltarSeleccionarProcesoGenerarSaldos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_ID));

		if(this.procesogenerarsaldosConstantesFunciones.mostraridProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarsaldosConstantesFunciones.resaltaridProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activaridProcesoGenerarSaldos,iSizeTabla,this,true,"idProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltaridProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activaridProcesoGenerarSaldos,this,true,"idProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_sucursalProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_sucursalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_sucursalProcesoGenerarSaldos,iSizeTabla,this,true,"nombre_sucursalProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_sucursalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_sucursalProcesoGenerarSaldos,this,true,"nombre_sucursalProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarid_tipo_transaccion_moduloProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTransaccionModuloTableCell(this.tipotransaccionmodulosForeignKey,this.procesogenerarsaldosConstantesFunciones.resaltarid_tipo_transaccion_moduloProcesoGenerarSaldos,this,this.procesogenerarsaldosConstantesFunciones.activarid_tipo_transaccion_moduloProcesoGenerarSaldos,iSizeTabla));
			tableColumn.setCellEditor(new TipoTransaccionModuloTableCell(this.tipotransaccionmodulosForeignKey,this.procesogenerarsaldosConstantesFunciones.resaltarid_tipo_transaccion_moduloProcesoGenerarSaldos,this,this.procesogenerarsaldosConstantesFunciones.activarid_tipo_transaccion_moduloProcesoGenerarSaldos,true,"id_tipo_transaccion_moduloProcesoGenerarSaldos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarnumero_comprobanteProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnumero_comprobanteProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnumero_comprobanteProcesoGenerarSaldos,iSizeTabla,this,true,"numero_comprobanteProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnumero_comprobanteProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnumero_comprobanteProcesoGenerarSaldos,this,true,"numero_comprobanteProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarfechaProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarfechaProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarfechaProcesoGenerarSaldos,iSizeTabla,this,true,"fechaProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarfechaProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarfechaProcesoGenerarSaldos,this,true,"fechaProcesoGenerarSaldos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodegaProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodegaProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_bodegaProcesoGenerarSaldos,iSizeTabla,this,true,"nombre_bodegaProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodegaProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_bodegaProcesoGenerarSaldos,this,true,"nombre_bodegaProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_productoProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_productoProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_productoProcesoGenerarSaldos,iSizeTabla,this,true,"nombre_productoProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_productoProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_productoProcesoGenerarSaldos,this,true,"nombre_productoProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarcantidadProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcantidadProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcantidadProcesoGenerarSaldos,iSizeTabla,this,true,"cantidadProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcantidadProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcantidadProcesoGenerarSaldos,this,true,"cantidadProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_unitarioProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_unitarioProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcosto_unitarioProcesoGenerarSaldos,iSizeTabla,this,true,"costo_unitarioProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_unitarioProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcosto_unitarioProcesoGenerarSaldos,this,true,"costo_unitarioProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_totalProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_totalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcosto_totalProcesoGenerarSaldos,iSizeTabla,this,true,"costo_totalProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_totalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarcosto_totalProcesoGenerarSaldos,this,true,"costo_totalProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR));

		if(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodega_enviarProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodega_enviarProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_bodega_enviarProcesoGenerarSaldos,iSizeTabla,this,true,"nombre_bodega_enviarProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodega_enviarProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activarnombre_bodega_enviarProcesoGenerarSaldos,this,true,"nombre_bodega_enviarProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL));

		if(this.procesogenerarsaldosConstantesFunciones.mostrartotalProcesoGenerarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogenerarsaldosConstantesFunciones.resaltartotalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activartotalProcesoGenerarSaldos,iSizeTabla,this,true,"totalProcesoGenerarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogenerarsaldosConstantesFunciones.resaltartotalProcesoGenerarSaldos,this.procesogenerarsaldosConstantesFunciones.activartotalProcesoGenerarSaldos,this,true,"totalProcesoGenerarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoGenerarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGenerarSaldos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGenerarSaldos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoGenerarSaldos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoGenerarSaldos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoGenerarSaldos.moveColumn(this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoGenerarSaldos.moveColumn(this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoGenerarSaldos.moveColumn(this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoGenerarSaldos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoGenerarSaldos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoGenerarSaldos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoGenerarSaldos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoGenerarSaldos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoGenerarSaldos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesogenerarsaldoss.size()-1;
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
		//this.jTableDatosProcesoGenerarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoGenerarSaldos();
			
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
				
				//this.isEsNuevoProcesoGenerarSaldos=false;
					
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
				if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGenerarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGenerarSaldos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesogenerarsaldos.getsType().equals("DUPLICADO")
				   || this.procesogenerarsaldos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoGenerarSaldos=true;
				
				} else {
					this.isEsNuevoProcesoGenerarSaldos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesogenerarsaldos.getId()>=0 && !this.procesogenerarsaldos.getIsNew()) {						
						this.isEsNuevoProcesoGenerarSaldos=false;
						
					} else {
						this.isEsNuevoProcesoGenerarSaldos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoGenerarSaldos(esRelaciones);						
				
				this.seleccionarProcesoGenerarSaldos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesogenerarsaldos.getId()<0) {
					this.isEsNuevoProcesoGenerarSaldos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoGenerarSaldos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoGenerarSaldos(evt,rowIndex);
				}	
				
				if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoGenerarSaldos: " + this.dDif); 
					}
				}								
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoGenerarSaldos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesogenerarsaldos)) {
					if(this.procesogenerarsaldos.getId()>0) {
						this.procesogenerarsaldos.setIsDeleted(true);
						
						this.procesogenerarsaldossEliminados.add(this.procesogenerarsaldos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().remove(this.procesogenerarsaldos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldoss.remove(this.procesogenerarsaldos);				
					}
					
					
					((ProcesoGenerarSaldosModel) this.jTableDatosProcesoGenerarSaldos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoGenerarSaldos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoGenerarSaldos) {
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGenerarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGenerarSaldos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldos);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoTransaccionModulo
					if(!this.procesogenerarsaldosConstantesFunciones.cargarid_tipo_transaccion_moduloProcesoGenerarSaldos || this.procesogenerarsaldosConstantesFunciones.event_dependid_tipo_transaccion_moduloProcesoGenerarSaldos) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.procesogenerarsaldos.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(procesogenerarsaldos.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(procesogenerarsaldos.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.procesogenerarsaldos.getid_tipo_transaccion_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoGenerarSaldos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoGenerarSaldos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoGenerarSaldos(procesogenerarsaldos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoGenerarSaldos(procesogenerarsaldos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoGenerarSaldos(procesogenerarsaldos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoGenerarSaldos(procesogenerarsaldos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setText(procesogenerarsaldos.getId().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setText(procesogenerarsaldos.getnumero_comprobante());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setDate(procesogenerarsaldos.getfecha());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_bodega());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setText(procesogenerarsaldos.getcantidad().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setText(procesogenerarsaldos.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setText(procesogenerarsaldos.getcosto_total().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setText(procesogenerarsaldos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoGenerarSaldos procesogenerarsaldosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesogenerarsaldosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoGenerarSaldos procesogenerarsaldosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesogenerarsaldosLocal=this.procesogenerarsaldos;
			} else {
				procesogenerarsaldosLocal=this.procesogenerarsaldosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesogenerarsaldosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoGenerarSaldos(procesogenerarsaldosLocal,true);
					
					if(procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesogenerarsaldosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesogenerarsaldosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(procesogenerarsaldos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(procesogenerarsaldos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(procesogenerarsaldos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.getText()==null || this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.getText()=="" || this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setText("0");
			}

			if(conColumnasBase) {procesogenerarsaldos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelIdProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setnombre_sucursal(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_sucursalProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setnumero_comprobante(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnumero_comprobanteProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setfecha(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelfechaProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setnombre_bodega(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodegaProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setnombre_producto(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_productoProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcantidadProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_unitarioProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelcosto_totalProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.setnombre_bodega_enviar(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelnombre_bodega_enviarProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogenerarsaldos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabeltotalProcesoGenerarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldosBean,ProcesoGenerarSaldos procesogenerarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesogenerarsaldosBean.getid_tipo_transaccion_modulo()!=null && !procesogenerarsaldosBean.getid_tipo_transaccion_modulo().equals(-1L))) {procesogenerarsaldos.setid_tipo_transaccion_modulo(procesogenerarsaldosBean.getid_tipo_transaccion_modulo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldosOrigen,ProcesoGenerarSaldos procesogenerarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getId()!=null && !procesogenerarsaldosOrigen.getId().equals(0L))) {procesogenerarsaldos.setId(procesogenerarsaldosOrigen.getId());}}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getnombre_sucursal()!=null && !procesogenerarsaldosOrigen.getnombre_sucursal().equals(""))) {procesogenerarsaldos.setnombre_sucursal(procesogenerarsaldosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getid_tipo_transaccion_modulo()!=null && !procesogenerarsaldosOrigen.getid_tipo_transaccion_modulo().equals(-1L))) {procesogenerarsaldos.setid_tipo_transaccion_modulo(procesogenerarsaldosOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getnumero_comprobante()!=null && !procesogenerarsaldosOrigen.getnumero_comprobante().equals(""))) {procesogenerarsaldos.setnumero_comprobante(procesogenerarsaldosOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getfecha()!=null && !procesogenerarsaldosOrigen.getfecha().equals(new Date()))) {procesogenerarsaldos.setfecha(procesogenerarsaldosOrigen.getfecha());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getnombre_bodega()!=null && !procesogenerarsaldosOrigen.getnombre_bodega().equals(""))) {procesogenerarsaldos.setnombre_bodega(procesogenerarsaldosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getnombre_producto()!=null && !procesogenerarsaldosOrigen.getnombre_producto().equals(""))) {procesogenerarsaldos.setnombre_producto(procesogenerarsaldosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getcantidad()!=null && !procesogenerarsaldosOrigen.getcantidad().equals(0))) {procesogenerarsaldos.setcantidad(procesogenerarsaldosOrigen.getcantidad());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getcosto_unitario()!=null && !procesogenerarsaldosOrigen.getcosto_unitario().equals(0.0))) {procesogenerarsaldos.setcosto_unitario(procesogenerarsaldosOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getcosto_total()!=null && !procesogenerarsaldosOrigen.getcosto_total().equals(0.0))) {procesogenerarsaldos.setcosto_total(procesogenerarsaldosOrigen.getcosto_total());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.getnombre_bodega_enviar()!=null && !procesogenerarsaldosOrigen.getnombre_bodega_enviar().equals(""))) {procesogenerarsaldos.setnombre_bodega_enviar(procesogenerarsaldosOrigen.getnombre_bodega_enviar());}
			if(conDefault || (!conDefault && procesogenerarsaldosOrigen.gettotal()!=null && !procesogenerarsaldosOrigen.gettotal().equals(0.0))) {procesogenerarsaldos.settotal(procesogenerarsaldosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setText(procesogenerarsaldos.getId().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setText(procesogenerarsaldos.getnumero_comprobante());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setDate(procesogenerarsaldos.getfecha());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_bodega());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setText(procesogenerarsaldos.getcantidad().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setText(procesogenerarsaldos.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setText(procesogenerarsaldos.getcosto_total().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setText(procesogenerarsaldos.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setText(procesogenerarsaldos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGenerarSaldos(ProcesoGenerarSaldosBean procesogenerarsaldosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setDate(procesogenerarsaldosBean.getfecha());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setText(procesogenerarsaldosBean.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setText(procesogenerarsaldosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoGenerarSaldos(ProcesoGenerarSaldosParameterReturnGeneral procesogenerarsaldosReturnGeneral,ProcesoGenerarSaldosBean procesogenerarsaldosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoGenerarSaldos procesogenerarsaldosLocal=new ProcesoGenerarSaldos();
			
			procesogenerarsaldosLocal=procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogenerarsaldosLocal.getId()!=null && !procesogenerarsaldosLocal.getId().equals(0L))) {procesogenerarsaldosBean.setId(procesogenerarsaldosLocal.getId());}}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getnombre_sucursal()!=null && !procesogenerarsaldosLocal.getnombre_sucursal().equals(""))) {procesogenerarsaldosBean.setnombre_sucursal(procesogenerarsaldosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getid_tipo_transaccion_modulo()!=null && !procesogenerarsaldosLocal.getid_tipo_transaccion_modulo().equals(-1L))) {procesogenerarsaldosBean.setid_tipo_transaccion_modulo(procesogenerarsaldosLocal.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getnumero_comprobante()!=null && !procesogenerarsaldosLocal.getnumero_comprobante().equals(""))) {procesogenerarsaldosBean.setnumero_comprobante(procesogenerarsaldosLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getfecha()!=null && !procesogenerarsaldosLocal.getfecha().equals(new Date()))) {procesogenerarsaldosBean.setfecha(procesogenerarsaldosLocal.getfecha());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getnombre_bodega()!=null && !procesogenerarsaldosLocal.getnombre_bodega().equals(""))) {procesogenerarsaldosBean.setnombre_bodega(procesogenerarsaldosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getnombre_producto()!=null && !procesogenerarsaldosLocal.getnombre_producto().equals(""))) {procesogenerarsaldosBean.setnombre_producto(procesogenerarsaldosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getcantidad()!=null && !procesogenerarsaldosLocal.getcantidad().equals(0))) {procesogenerarsaldosBean.setcantidad(procesogenerarsaldosLocal.getcantidad());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getcosto_unitario()!=null && !procesogenerarsaldosLocal.getcosto_unitario().equals(0.0))) {procesogenerarsaldosBean.setcosto_unitario(procesogenerarsaldosLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getcosto_total()!=null && !procesogenerarsaldosLocal.getcosto_total().equals(0.0))) {procesogenerarsaldosBean.setcosto_total(procesogenerarsaldosLocal.getcosto_total());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.getnombre_bodega_enviar()!=null && !procesogenerarsaldosLocal.getnombre_bodega_enviar().equals(""))) {procesogenerarsaldosBean.setnombre_bodega_enviar(procesogenerarsaldosLocal.getnombre_bodega_enviar());}
			if(conDefault || (!conDefault && procesogenerarsaldosLocal.gettotal()!=null && !procesogenerarsaldosLocal.gettotal().equals(0.0))) {procesogenerarsaldosBean.settotal(procesogenerarsaldosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoGenerarSaldosGenerico(Long idProcesoGenerarSaldosSeleccionado,JComboBox jComboBoxProcesoGenerarSaldos,List<ProcesoGenerarSaldos> procesogenerarsaldossLocal)throws Exception {
		try {
			ProcesoGenerarSaldos  procesogenerarsaldosTemp=null;

			for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossLocal) {
				if(procesogenerarsaldosAux.getId()!=null && procesogenerarsaldosAux.getId().equals(idProcesoGenerarSaldosSeleccionado)) {
					procesogenerarsaldosTemp=procesogenerarsaldosAux;
					break;
				}
			}

			jComboBoxProcesoGenerarSaldos.setSelectedItem(procesogenerarsaldosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoGenerarSaldosGenerico(JComboBox jComboBoxProcesoGenerarSaldos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGenerarSaldos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoGenerarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGenerarSaldos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoGenerarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoGenerarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoGenerarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogenerarsaldos=(ProcesoGenerarSaldos) procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogenerarsaldos =(ProcesoGenerarSaldos) procesogenerarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesogenerarsaldos.getIsNew() && !procesogenerarsaldos.getIsChanged() && !procesogenerarsaldos.getIsDeleted()) {
				sDescripcion=procesogenerarsaldos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesogenerarsaldos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesogenerarsaldos.getIsNew() && !procesogenerarsaldos.getIsChanged() && !procesogenerarsaldos.getIsDeleted()) {
				sDescripcion=procesogenerarsaldos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesogenerarsaldos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesogenerarsaldos.getIsNew() && !procesogenerarsaldos.getIsChanged() && !procesogenerarsaldos.getIsDeleted()) {
				sDescripcion=procesogenerarsaldos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesogenerarsaldos.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!procesogenerarsaldos.getIsNew() && !procesogenerarsaldos.getIsChanged() && !procesogenerarsaldos.getIsDeleted()) {
				sDescripcion=procesogenerarsaldos.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=procesogenerarsaldos.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!procesogenerarsaldos.getIsNew() && !procesogenerarsaldos.getIsChanged() && !procesogenerarsaldos.getIsDeleted()) {
				sDescripcion=procesogenerarsaldos.gettipotransaccionmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
				sDescripcion=procesogenerarsaldos.gettipotransaccionmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoGenerarSaldos procesogenerarsaldosRow=new ProcesoGenerarSaldos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogenerarsaldosRow=(ProcesoGenerarSaldos) procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogenerarsaldosRow=(ProcesoGenerarSaldos) procesogenerarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));			
			this.jButtonDuplicarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos && this.isPermisoDuplicarProcesoGenerarSaldos));			
			this.jButtonCopiarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoGenerarSaldos && this.isPermisoCopiarProcesoGenerarSaldos));
			this.jButtonVerFormProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoGenerarSaldos && this.isPermisoVerFormProcesoGenerarSaldos));
			
			this.jButtonAbrirOrderByProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));			
			
			this.jButtonNuevoRelacionesProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));			
			this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoGenerarSaldos && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoGenerarSaldos && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoGenerarSaldos && this.isPermisoEliminarProcesoGenerarSaldos));
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoGenerarSaldos);							
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));						
			this.jButtonDuplicarToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos && this.isPermisoDuplicarProcesoGenerarSaldos));						
			this.jButtonCopiarToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoGenerarSaldos && this.isPermisoCopiarProcesoGenerarSaldos));			
			this.jButtonVerFormToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoGenerarSaldos && this.isPermisoVerFormProcesoGenerarSaldos));			
			this.jButtonAbrirOrderByToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));
			this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));			
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoGenerarSaldos && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoGenerarSaldos  && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoGenerarSaldos && this.isPermisoEliminarProcesoGenerarSaldos));
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarToolBarProcesoGenerarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoGenerarSaldos);				
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));			
			this.jMenuItemDuplicarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos && this.isPermisoDuplicarProcesoGenerarSaldos));			
			this.jMenuItemCopiarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoGenerarSaldos && this.isPermisoCopiarProcesoGenerarSaldos));			
			this.jMenuItemVerFormProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoGenerarSaldos && this.isPermisoVerFormProcesoGenerarSaldos));			
			this.jMenuItemAbrirOrderByProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));			
			//this.jMenuItemMostrarOcultarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));
			this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoGenerarSaldos && this.isPermisoOrdenProcesoGenerarSaldos));			
			this.jMenuItemNuevoRelacionesProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos));			
			this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoGenerarSaldos && this.isPermisoNuevoProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));									
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemModificarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoGenerarSaldos && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemActualizarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoGenerarSaldos && this.isPermisoActualizarProcesoGenerarSaldos));	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemEliminarProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoGenerarSaldos && this.isPermisoEliminarProcesoGenerarSaldos));
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemCancelarProcesoGenerarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoGenerarSaldos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));						
			this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=this.jButtonNuevoProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos=this.jButtonDuplicarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoGenerarSaldos=this.jButtonCopiarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoGenerarSaldos=this.jButtonVerFormProcesoGenerarSaldos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoGenerarSaldos=this.jButtonAbrirOrderByProcesoGenerarSaldos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=this.jButtonNuevoRelacionesProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=this.jButtonModificarProcesoGenerarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=this.jButtonNuevoToolBarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarToolBarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarToolBarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarToolBarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarToolBarProcesoGenerarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=this.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=this.jMenuItemNuevoProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=this.jMenuItemNuevoRelacionesProcesoGenerarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemModificarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemActualizarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemEliminarProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemCancelarProcesoGenerarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=this.jMenuItemGuardarCambiosProcesoGenerarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoGenerarSaldos(Boolean esInicializar) {
		if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGenerarSaldos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoGenerarSaldos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoGenerarSaldos() {
		this.jButtonNuevoProcesoGenerarSaldos.setVisible(this.isPermisoNuevoProcesoGenerarSaldos);			
		this.jButtonDuplicarProcesoGenerarSaldos.setVisible(this.isPermisoDuplicarProcesoGenerarSaldos);			
		this.jButtonCopiarProcesoGenerarSaldos.setVisible(this.isPermisoCopiarProcesoGenerarSaldos);			
		this.jButtonVerFormProcesoGenerarSaldos.setVisible(this.isPermisoVerFormProcesoGenerarSaldos);			
		
		this.jButtonAbrirOrderByProcesoGenerarSaldos.setVisible(this.isPermisoOrdenProcesoGenerarSaldos);					
		
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.setVisible(this.isPermisoNuevoProcesoGenerarSaldos);			
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarProcesoGenerarSaldos.setVisible(this.isPermisoActualizarProcesoGenerarSaldos);	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.setVisible(this.isPermisoActualizarProcesoGenerarSaldos);	
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.setVisible(this.isPermisoEliminarProcesoGenerarSaldos);
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoGenerarSaldos);						
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.setVisible(this.isPermisoGuardarCambiosProcesoGenerarSaldos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setVisible(this.isPermisoActualizarProcesoGenerarSaldos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGenerarSaldos() {
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarProcesoGenerarSaldos.setVisible(this.isPermisoActualizarProcesoGenerarSaldos);	
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.setVisible(this.isPermisoActualizarProcesoGenerarSaldos);	
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.setVisible(this.isPermisoEliminarProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoGenerarSaldos);							
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoGenerarSaldos && this.isPermisoGuardarCambiosProcesoGenerarSaldos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoGenerarSaldos() {
		if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoGenerarSaldos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoGenerarSaldos() {
	}
	
	public void jTableDatosProcesoGenerarSaldosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoGenerarSaldos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesogenerarsaldos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoGenerarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGenerarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesogenerarsaldosLogic.getConnexion());

				if(this.procesogenerarsaldos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesogenerarsaldos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGenerarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoGenerarSaldos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoGenerarSaldos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesogenerarsaldos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoGenerarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGenerarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesogenerarsaldosLogic.getConnexion());

				if(this.procesogenerarsaldos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesogenerarsaldos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGenerarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoGenerarSaldos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoGenerarSaldos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesogenerarsaldos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoGenerarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGenerarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesogenerarsaldosLogic.getConnexion());

				if(this.procesogenerarsaldos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesogenerarsaldos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGenerarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoGenerarSaldos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoGenerarSaldos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesogenerarsaldos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoProcesoGenerarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGenerarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.procesogenerarsaldosLogic.getConnexion());

				if(this.procesogenerarsaldos.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.procesogenerarsaldos.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGenerarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoGenerarSaldos.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderProcesoGenerarSaldos.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.procesogenerarsaldos.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.procesogenerarsaldos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebProcesoGenerarSaldos(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoGenerarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoGenerarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.procesogenerarsaldosLogic.getConnexion());

				if(this.procesogenerarsaldos.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.procesogenerarsaldos.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoGenerarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoGenerarSaldos.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderProcesoGenerarSaldos.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.procesogenerarsaldos.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.procesogenerarsaldos.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesogenerarsaldos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.procesogenerarsaldos.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.procesogenerarsaldos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.procesogenerarsaldos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.procesogenerarsaldos.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.procesogenerarsaldos.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodega_enviarProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.getnombre_bodega_enviar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega_enviar like '%"+this.procesogenerarsaldos.getnombre_bodega_enviar()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalProcesoGenerarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.getprocesogenerarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogenerarsaldos==null) {
						this.procesogenerarsaldos = new ProcesoGenerarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);
				}

				if(this.procesogenerarsaldos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.procesogenerarsaldos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGenerarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossBusquedaProcesoGenerarSaldos();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossFK_IdEjercicio();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossFK_IdPeriodo();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossFK_IdSucursal();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloProcesoGenerarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);

			this.getProcesoGenerarSaldossFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingProcesoGenerarSaldos(false);

			//if(ProcesoGenerarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogenerarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoGenerarSaldos() {
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.dispose();
			this.jInternalFrameDetalleFormProcesoGenerarSaldos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
			this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.dispose();
			this.jInternalFrameReporteDinamicoProcesoGenerarSaldos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoGenerarSaldos!=null) {
			this.jInternalFrameImportacionProcesoGenerarSaldos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoGenerarSaldos.dispose();
			this.jInternalFrameImportacionProcesoGenerarSaldos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoGenerarSaldos();
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoGenerarSaldos")) {
				jButtonDuplicarProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoGenerarSaldos")) {
				jButtonCopiarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoGenerarSaldos")) {
				jButtonVerFormProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoGenerarSaldos")) {
				jButtonDuplicarProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoGenerarSaldos")) {
				jButtonDuplicarProcesoGenerarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoGenerarSaldos")) {
				jButtonModificarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoGenerarSaldos")) {
				jButtonModificarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoGenerarSaldos")) {
				jButtonModificarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoGenerarSaldos")) {
				jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoGenerarSaldos")) {
				jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoGenerarSaldos")) {
				jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoGenerarSaldos")) {
				jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoGenerarSaldos")) {
				jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoGenerarSaldos")) {
				jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoGenerarSaldos")) {
				jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoGenerarSaldos")) {
				jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoGenerarSaldos")) {
				jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoGenerarSaldos")) {
				jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoGenerarSaldos")) {
				jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoGenerarSaldos")) {
				jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoGenerarSaldos")) {
				jButtonMostrarOcultarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoGenerarSaldos")) {
				jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoGenerarSaldos")) {
				jButtonCopiarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoGenerarSaldos")) {
				jButtonVerFormProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoGenerarSaldos")) {
				jButtonCopiarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoGenerarSaldos")) {
				jButtonVerFormProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoGenerarSaldos")) {
				jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoGenerarSaldos")) {
				jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoGenerarSaldos")) {
				jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoGenerarSaldos")) {
				jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoGenerarSaldos")) {
				jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoGenerarSaldos")) {
				jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoGenerarSaldos")) {
				jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoGenerarSaldos")) {
				jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoGenerarSaldos")) {
				jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoGenerarSaldos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoGenerarSaldos")) {
				jButtonAbrirOrderByProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoGenerarSaldos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoGenerarSaldos")) {
				jButtonMostrarOcultarProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGenerarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoGenerarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoGenerarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoGenerarSaldos")) {
				jButtonCerrarReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoGenerarSaldos")) {
				jButtonGenerarReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoGenerarSaldos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoGenerarSaldos")) {
				jButtonCerrarImportacionProcesoGenerarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoGenerarSaldos")) {
				
				jButtonGenerarImportacionProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoGenerarSaldos")) {
				
				jButtonAbrirImportacionProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoGenerarSaldos")) {
				jComboBoxTiposAccionesProcesoGenerarSaldosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoGenerarSaldos")) {
				jComboBoxTiposRelacionesProcesoGenerarSaldosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoGenerarSaldos")) {
				jComboBoxTiposAccionesProcesoGenerarSaldosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoGenerarSaldos")) {
				
				jComboBoxTiposSeleccionarProcesoGenerarSaldosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoGenerarSaldos")) {
				jTextFieldValorCampoGeneralProcesoGenerarSaldosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoGenerarSaldos")) {
				jButtonAbrirOrderByProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoGenerarSaldos")) {
				jButtonAbrirOrderByProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoGenerarSaldos")) {
				jButtonCerrarOrderByProcesoGenerarSaldosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGenerarSaldosBusqueda")) {
				this.jButtonidProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoGenerarSaldosUpdate")) {
				this.jButtonid_empresaProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_empresaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoGenerarSaldosUpdate")) {
				this.jButtonid_sucursalProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_sucursalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoGenerarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoGenerarSaldosUpdate")) {
				this.jButtonid_periodoProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_sucursalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate")) {
				this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteProcesoGenerarSaldosBusqueda")) {
				this.jButtonnumero_comprobanteProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoGenerarSaldosBusqueda")) {
				this.jButtonfechaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_bodegaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_productoProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProcesoGenerarSaldosBusqueda")) {
				this.jButtoncantidadProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioProcesoGenerarSaldosBusqueda")) {
				this.jButtoncosto_unitarioProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProcesoGenerarSaldosBusqueda")) {
				this.jButtoncosto_totalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodega_enviarProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProcesoGenerarSaldosBusqueda")) {
				this.jButtontotalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoGenerarSaldosProcesoGenerarSaldos")) {
				this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoGenerarSaldos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoGenerarSaldos procesogenerarsaldosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesogenerarsaldosLocal=this.procesogenerarsaldos;
			} else {
				procesogenerarsaldosLocal=this.procesogenerarsaldosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
							
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
								
						
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
								
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
							
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
								
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoGenerarSaldos")) {
					jCheckBoxSeleccionarTodosProcesoGenerarSaldosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoGenerarSaldos")) {
					jCheckBoxSeleccionadosProcesoGenerarSaldosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoGenerarSaldos")) {
					
				}
				
				


				
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
												
				
				


				
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
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
			
			


			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogenerarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogenerarsaldos);
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
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
				
				


				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGenerarSaldos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGenerarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGenerarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogenerarsaldosAnterior =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoGenerarSaldos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoGenerarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoGenerarSaldos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesogenerarsaldos =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesogenerarsaldos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoGenerarSaldos")) {
				
				}
				
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoGenerarSaldos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoGenerarSaldos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoGenerarSaldos")) {
			
			}
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoGenerarSaldos();
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoGenerarSaldos")) {
				jButtonDuplicarProcesoGenerarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoGenerarSaldos")) {
				jButtonCopiarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoGenerarSaldos")) {
				jButtonVerFormProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoGenerarSaldos")) {
				jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoGenerarSaldos")) {
				jButtonModificarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoGenerarSaldos")) {
				jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoGenerarSaldos")) {
				jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoGenerarSaldos")) {
				jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoGenerarSaldos")) {
				jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoGenerarSaldos")) {
				jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGenerarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoGenerarSaldos")) {
				jButtonAbrirOrderByProcesoGenerarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoGenerarSaldos")) {
				jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoGenerarSaldos")) {
				jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoGenerarSaldos")) {
				jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGenerarSaldosBusqueda")) {
				this.jButtonidProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoGenerarSaldosUpdate")) {
				this.jButtonid_empresaProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_empresaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoGenerarSaldosUpdate")) {
				this.jButtonid_sucursalProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_sucursalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoGenerarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoGenerarSaldosUpdate")) {
				this.jButtonid_periodoProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_sucursalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate")) {
				this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteProcesoGenerarSaldosBusqueda")) {
				this.jButtonnumero_comprobanteProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoGenerarSaldosBusqueda")) {
				this.jButtonfechaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_bodegaProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_productoProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProcesoGenerarSaldosBusqueda")) {
				this.jButtoncantidadProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioProcesoGenerarSaldosBusqueda")) {
				this.jButtoncosto_unitarioProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProcesoGenerarSaldosBusqueda")) {
				this.jButtoncosto_totalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodega_enviarProcesoGenerarSaldosBusqueda")) {
				this.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalProcesoGenerarSaldosBusqueda")) {
				this.jButtontotalProcesoGenerarSaldosBusquedaActionPerformed(evt);
			}
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoGenerarSaldos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoGenerarSaldos")) {
				closingInternalFrameProcesoGenerarSaldos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoGenerarSaldos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoGenerarSaldos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoGenerarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGenerarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGenerarSaldos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoGenerarSaldosActionPerformed(null);
			}
			
			ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogenerarsaldos,new Object(),this.procesogenerarsaldosParameterGeneral,this.procesogenerarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoGenerarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoGenerarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoGenerarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesogenerarsaldos)) {
			if(!esControlTabla) {
				if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);			
				}
				
				if(this.procesogenerarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral,this.procesogenerarsaldosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesogenerarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGenerarSaldos(classes,this.procesogenerarsaldosReturnGeneral,this.procesogenerarsaldosBean,false);
					}
						
					if(this.procesogenerarsaldosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos());	
					}
						
					if(this.procesogenerarsaldosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos(),classes);//this.procesogenerarsaldosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoGenerarSaldos(this.procesogenerarsaldos,classes);//this.procesogenerarsaldosBean);									
				}
			
				if(ProcesoGenerarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoGenerarSaldos(this.procesogenerarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGenerarSaldos(this.procesogenerarsaldos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesogenerarsaldosAnterior!=null) {
						this.procesogenerarsaldos=this.procesogenerarsaldosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesogenerarsaldosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos(),procesogenerarsaldosLogic.getProcesoGenerarSaldoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldos(),this.procesogenerarsaldoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoGenerarSaldos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoGenerarSaldos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoGenerarSaldos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoGenerarSaldos() throws Exception {
		
		ProcesoGenerarSaldosModel procesogenerarsaldosModel=(ProcesoGenerarSaldosModel)this.jTableDatosProcesoGenerarSaldos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogenerarsaldosModel.procesogenerarsaldoss=this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesogenerarsaldosModel.procesogenerarsaldoss=this.procesogenerarsaldoss;
		}
		
		
		((ProcesoGenerarSaldosModel) this.jTableDatosProcesoGenerarSaldos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoGenerarSaldos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesogenerarsaldosAnterior(),this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesogenerarsaldosAnterior(),this.procesogenerarsaldoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoGenerarSaldos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
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
										
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogenerarsaldos,new Object(),generalEntityParameterGeneral,this.procesogenerarsaldosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoGenerarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoGenerarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoGenerarSaldosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoGenerarSaldos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoGenerarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogenerarsaldos,new Object(),generalEntityParameterGeneral,this.procesogenerarsaldosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoGenerarSaldos(ProcesoGenerarSaldosBean procesogenerarsaldosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGenerarSaldos(ArrayList<Classe> classes,ProcesoGenerarSaldosReturnGeneral procesogenerarsaldosReturnGeneral,ProcesoGenerarSaldosBean procesogenerarsaldosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesogenerarsaldos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos = new ProcesoGenerarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesogenerarsaldosSessionBean.getConGuardarRelaciones(),this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.procesogenerarsaldosLogic=this.procesogenerarsaldosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoGenerarSaldos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGenerarSaldos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGenerarSaldos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoGenerarSaldos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoGenerarSaldos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGenerarSaldos"));
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoGenerarSaldos"));

		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGenerarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemModificarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGenerarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGenerarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGenerarSaldos"));
						
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemActualizarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGenerarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoGenerarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGenerarSaldos"));
								
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemEliminarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGenerarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoGenerarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGenerarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemCancelarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGenerarSaldos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemDetalleCerrarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGenerarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGenerarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGenerarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGenerarSaldos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonidProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonfechaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_productoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncantidadProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_totalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtontotalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoGenerarSaldosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGenerarSaldos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoGenerarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGenerarSaldos"));
		}
		
		this.jTableDatosProcesoGenerarSaldos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoGenerarSaldos"));
		
		this.jTableDatosProcesoGenerarSaldos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoGenerarSaldos"));
		
		this.jButtonNuevoProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"NuevoProcesoGenerarSaldos"));
		
		this.jButtonDuplicarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoGenerarSaldos"));
		
		this.jButtonCopiarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"CopiarProcesoGenerarSaldos"));
		
		this.jButtonVerFormProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"VerFormProcesoGenerarSaldos"));
		
		
		this.jButtonNuevoToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoGenerarSaldos"));
			
		this.jButtonDuplicarToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemNuevoProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoGenerarSaldos"));
			
		this.jMenuItemDuplicarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoGenerarSaldos"));		
		
		
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoGenerarSaldos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemNuevoRelacionesProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoGenerarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoGenerarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonModificarToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGenerarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemModificarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGenerarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGenerarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonActualizarToolBarProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGenerarSaldos"));
				
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemActualizarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGenerarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoGenerarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonEliminarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGenerarSaldos"));
						
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemEliminarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGenerarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoGenerarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonCancelarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGenerarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemCancelarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGenerarSaldos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoGenerarSaldos"));		
		
		
		this.jButtonCerrarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CerrarProcesoGenerarSaldos"));
		
		
		this.jButtonCerrarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemCerrarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoGenerarSaldos"));
			
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jMenuItemDetalleCerrarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGenerarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoGenerarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGenerarSaldos"));
		}
		
		this.jButtonCopiarToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoGenerarSaldos"));
			
		this.jButtonVerFormToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoGenerarSaldos"));
		
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoGenerarSaldos"));
			
		this.jMenuItemCopiarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoGenerarSaldos"));		
		
		this.jMenuItemVerFormProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoGenerarSaldos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGenerarSaldos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGenerarSaldos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoGenerarSaldos"));
					
		this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoGenerarSaldos"));
		
		this.jMenuItemRecargarInformacionProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoGenerarSaldos"));		
		
		
		
		this.jButtonAnterioresProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoGenerarSaldos"));
		
		
		this.jButtonAnterioresToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoGenerarSaldos"));
		
		this.jMenuItemAnterioresProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoGenerarSaldos"));		
		
		
		this.jButtonSiguientesProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoGenerarSaldos"));
		
		
		this.jButtonSiguientesToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemSiguientesProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoGenerarSaldos"));
			
		this.jMenuItemAbrirOrderByProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoGenerarSaldos"));
			
		this.jMenuItemMostrarOcultarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoGenerarSaldos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoGenerarSaldos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoGenerarSaldos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoGenerarSaldos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoGenerarSaldos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoGenerarSaldos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoGenerarSaldos"));

		this.jCheckBoxSeleccionadosProcesoGenerarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoGenerarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGenerarSaldos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoGenerarSaldos"));
			
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoGenerarSaldos"));
					
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoGenerarSaldos"));
			
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoGenerarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonidProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonfechaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_productoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncantidadProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_totalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtontotalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoGenerarSaldosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoGenerarSaldosProcesoGenerarSaldos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoGenerarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGenerarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGenerarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGenerarSaldos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGenerarSaldos"));				
			//this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGenerarSaldos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGenerarSaldos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoGenerarSaldos!=null) {
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGenerarSaldos"));
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGenerarSaldos"));
				this.jInternalFrameImportacionProcesoGenerarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGenerarSaldos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoGenerarSaldos"));
			
			this.jButtonAbrirOrderByToolBarProcesoGenerarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoGenerarSaldos"));			
			
			if(this.jInternalFrameOrderByProcesoGenerarSaldos!=null) {
				this.jInternalFrameOrderByProcesoGenerarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGenerarSaldos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTabbedPaneRelacionesProcesoGenerarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGenerarSaldos"));
		
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
            		closingInternalFrameProcesoGenerarSaldos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoGenerarSaldos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoGenerarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGenerarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGenerarSaldos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoGenerarSaldosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoGenerarSaldos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoGenerarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoGenerarSaldos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoGenerarSaldos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGenerarSaldosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoGenerarSaldos";
		inputMap = this.jButtonModificarProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoGenerarSaldos";
		inputMap = this.jButtonActualizarProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoGenerarSaldos";
		inputMap = this.jButtonEliminarProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoGenerarSaldos";
		inputMap = this.jButtonCancelarProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoGenerarSaldos";
		inputMap = this.jButtonCerrarProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoGenerarSaldos";
		inputMap = this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonGuardarCambiosProcesoGenerarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoGenerarSaldosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoGenerarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoGenerarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoGenerarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoGenerarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonidProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_empresaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_ejercicioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_periodoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_sucursalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProcesoGenerarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonid_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnumero_comprobanteProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonfechaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodegaProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_productoProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncantidadProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_unitarioProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtoncosto_totalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtonnombre_bodega_enviarProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarProcesoGenerarSaldosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jButtontotalProcesoGenerarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"totalProcesoGenerarSaldosBusqueda"));
		
		
		this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoGenerarSaldosProcesoGenerarSaldos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoGenerarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoGenerarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoGenerarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoGenerarSaldos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
					procesogenerarsaldosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldoss) {
					procesogenerarsaldosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoGenerarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
						procesogenerarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldoss) {
						procesogenerarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGenerarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGenerarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoGenerarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoGenerarSaldos.getSelectedRows();
			
			ProcesoGenerarSaldos procesogenerarsaldosLocal=new ProcesoGenerarSaldos();
			
			//this.seleccionarTodosProcesoGenerarSaldos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesogenerarsaldosLocal =(ProcesoGenerarSaldos) this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss().toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesogenerarsaldosLocal =(ProcesoGenerarSaldos) this.procesogenerarsaldoss.toArray()[this.jTableDatosProcesoGenerarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesogenerarsaldosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
						procesogenerarsaldosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldoss) {
						procesogenerarsaldosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGenerarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGenerarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGenerarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoGenerarSaldosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoGenerarSaldosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoGenerarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
				
						if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							procesogenerarsaldosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesogenerarsaldosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							procesogenerarsaldosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							procesogenerarsaldosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							procesogenerarsaldosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_bodega_enviar(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							procesogenerarsaldosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldoss) {
					
						if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							procesogenerarsaldosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesogenerarsaldosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							procesogenerarsaldosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							procesogenerarsaldosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							procesogenerarsaldosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
							existe=true;
							procesogenerarsaldosAux.setnombre_bodega_enviar(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							procesogenerarsaldosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoGenerarSaldosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoGenerarSaldos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoGenerarSaldos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoGenerarSaldos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoGenerarSaldos(conSplash);
				
					this.generarReporteProcesoGenerarSaldossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoGenerarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGenerarSaldossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGenerarSaldossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGenerarSaldos();
				
				this.exportarProcesoGenerarSaldossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoGenerarSaldoss();
				//this.importarProcesoGenerarSaldoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGenerarSaldos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoGenerarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Generar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoGenerarSaldos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoGenerarSaldos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoGenerarSaldos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoGenerarSaldosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoGenerarSaldos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoGenerarSaldos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoGenerarSaldos();
						
						this.generarReporteProcesoAccionProcesoGenerarSaldossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Generar SaldosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Generar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoGenerarSaldos();
				
						this.actualizarParametrosGeneralProcesoGenerarSaldos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesogenerarsaldosReturnGeneral=procesogenerarsaldosLogic.procesarAccionProcesoGenerarSaldossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss(),this.procesogenerarsaldosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoGenerarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoGenerarSaldos();
					
					ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoGenerarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGenerarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxTiposAccionesFormularioProcesoGenerarSaldos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoGenerarSaldos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoGenerarSaldosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoGenerarSaldos();
			
			if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
			ProcesoGenerarSaldos procesogenerarsaldos=new ProcesoGenerarSaldos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoGenerarSaldos.getSelectedItem();
			
			
			
			
			procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesogenerarsaldossSeleccionados.size()==1) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
					procesogenerarsaldos=procesogenerarsaldosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoGenerarSaldos();
			
      		//this.finishProcessProcesoGenerarSaldos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoGenerarSaldosReturnGeneral() throws Exception {
		if(this.procesogenerarsaldosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesogenerarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesogenerarsaldosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesogenerarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesogenerarsaldosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesogenerarsaldosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
		}
		
		if(this.procesogenerarsaldosReturnGeneral.getConRetornoLista() || this.procesogenerarsaldosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesogenerarsaldosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesogenerarsaldosLogic.setProcesoGenerarSaldoss(this.procesogenerarsaldosReturnGeneral.getProcesoGenerarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoGenerarSaldos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoGenerarSaldos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoGenerarSaldos> getProcesoGenerarSaldossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoGenerarSaldos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldosLogic.getProcesoGenerarSaldoss()) {
					if(procesogenerarsaldosAux.getIsSelected()) {
						procesogenerarsaldossSeleccionados.add(procesogenerarsaldosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGenerarSaldos procesogenerarsaldosAux:this.procesogenerarsaldoss) {
					if(procesogenerarsaldosAux.getIsSelected()) {
						procesogenerarsaldossSeleccionados.add(procesogenerarsaldosAux);				
					}
				}
			}
			
			if(procesogenerarsaldossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesogenerarsaldossSeleccionados.addAll(this.procesogenerarsaldosLogic.getProcesoGenerarSaldoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesogenerarsaldossSeleccionados.addAll(this.procesogenerarsaldoss);				
					}
				}
			}
		} else {
			procesogenerarsaldossSeleccionados.add(this.procesogenerarsaldos);
		}
		
		return procesogenerarsaldossSeleccionados;
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
	
	public void generarReporteProcesoGenerarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoGenerarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoGenerarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGenerarSaldossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGenerarSaldossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Generar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoGenerarSaldossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoGenerarSaldos();
		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoGenerarSaldos();
		
		
		//this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados ,procesogenerarsaldosImplementable,procesogenerarsaldosImplementableHome);
	}
	
	public void mostrarImportacionProcesoGenerarSaldoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoGenerarSaldos();
		
		this.abrirFrameImportacionProcesoGenerarSaldos();		
		
			
		//this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados ,procesogenerarsaldosImplementable,procesogenerarsaldosImplementableHome);
	}
	
	public void importarProcesoGenerarSaldoss() throws Exception {		
	
	}
	
	public void exportarProcesoGenerarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoGenerarSaldossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoGenerarSaldossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoGenerarSaldossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Generar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoGenerarSaldos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoGenerarSaldos(procesogenerarsaldosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesogenerarsaldosAux.setsDetalleGeneralEntityReporte(procesogenerarsaldosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoGenerarSaldos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesogenerarsaldos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.getnombre_bodega_enviar();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogenerarsaldos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoGenerarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoGenerarSaldos(row);				
				iRow++;
			}				
			
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoGenerarSaldos(procesogenerarsaldosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoGenerarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();		
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogenerarsaldos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesogenerarsaldoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesogenerarsaldos");
			//elementRoot.appendChild(element);
		
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
				element = document.createElement("procesogenerarsaldos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoGenerarSaldos(procesogenerarsaldosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Generar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoGenerarSaldos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGenerarSaldosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.getnombre_bodega_enviar());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogenerarsaldos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlProcesoGenerarSaldos(ProcesoGenerarSaldos procesogenerarsaldos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoGenerarSaldosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesogenerarsaldos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoGenerarSaldosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesogenerarsaldos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoGenerarSaldosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesogenerarsaldos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoGenerarSaldosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesogenerarsaldos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(ProcesoGenerarSaldosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesogenerarsaldos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ProcesoGenerarSaldosConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(procesogenerarsaldos.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementnombre_sucursal = document.createElement(ProcesoGenerarSaldosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(procesogenerarsaldos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(ProcesoGenerarSaldosConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(procesogenerarsaldos.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementnumero_comprobante = document.createElement(ProcesoGenerarSaldosConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(procesogenerarsaldos.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementfecha = document.createElement(ProcesoGenerarSaldosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesogenerarsaldos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnombre_bodega = document.createElement(ProcesoGenerarSaldosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(procesogenerarsaldos.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(ProcesoGenerarSaldosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(procesogenerarsaldos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(ProcesoGenerarSaldosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(procesogenerarsaldos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto_unitario = document.createElement(ProcesoGenerarSaldosConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(procesogenerarsaldos.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(ProcesoGenerarSaldosConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(procesogenerarsaldos.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementnombre_bodega_enviar = document.createElement(ProcesoGenerarSaldosConstantesFunciones.NOMBREBODEGAENVIAR);
		elementnombre_bodega_enviar.appendChild(document.createTextNode(procesogenerarsaldos.getnombre_bodega_enviar().trim()));
		element.appendChild(elementnombre_bodega_enviar);

		Element elementtotal = document.createElement(ProcesoGenerarSaldosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(procesogenerarsaldos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoProcesoGenerarSaldossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados=new ArrayList<ProcesoGenerarSaldos>();
		
		procesogenerarsaldossSeleccionados=this.getProcesoGenerarSaldossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoGenerarSaldos(procesogenerarsaldossSeleccionados);
		
		this.generarReporteProcesoGenerarSaldoss("Todos",procesogenerarsaldossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoGenerarSaldos(ArrayList<ProcesoGenerarSaldos> procesogenerarsaldossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoGenerarSaldos procesogenerarsaldosAux:procesogenerarsaldossSeleccionados) {
				procesogenerarsaldosAux.setsDetalleGeneralEntityReporte(procesogenerarsaldosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesogenerarsaldosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProcesoGenerarSaldosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
					existe=true;
					procesogenerarsaldosAux.setsDescripcionGeneralEntityReporte1(procesogenerarsaldosAux.getnombre_bodega_enviar());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGenerarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoGenerarSaldos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=true;
		} else {
			this.actualizarEstadoPanelsProcesoGenerarSaldos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoGenerarSaldos=false;
			//this.isVisibilidadCeldaVerFormProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoGenerarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!procesogenerarsaldosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;												
			}
			
			this.jButtonCerrarProcesoGenerarSaldos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesogenerarsaldos)) {
			this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoGenerarSaldos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoGenerarSaldos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoGenerarSaldos=false;
		//this.isVisibilidadCeldaModificarProcesoGenerarSaldos=true;
		this.isVisibilidadCeldaActualizarProcesoGenerarSaldos=false;
		this.isVisibilidadCeldaEliminarProcesoGenerarSaldos=false;
		//this.isVisibilidadCeldaCancelarProcesoGenerarSaldos=true;			
		this.isVisibilidadCeldaGuardarProcesoGenerarSaldos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGenerarSaldos() {
	}
	
	public void actualizarEstadoPanelsProcesoGenerarSaldos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoGenerarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGenerarSaldos!=null) {
				this.jScrollPanelDatosProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGenerarSaldos!=null) {
				this.jPanelPaginacionProcesoGenerarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
					this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoGenerarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoGenerarSaldos!=null) {
				this.jPanelParametrosReportesProcesoGenerarSaldos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoGenerarSaldos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoGenerarSaldos) {this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoGenerarSaldos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoGenerarSaldos) {this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaProcesoGenerarSaldos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaProcesoGenerarSaldos) {this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaProcesoGenerarSaldos=isParaPeriodo;
			if(!this.isVisibilidadBusquedaProcesoGenerarSaldos) {this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadBusquedaProcesoGenerarSaldos=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadBusquedaProcesoGenerarSaldos) {this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoGenerarSaldos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoGenerarSaldos() {
		this.updateBorderResaltarBusquedasFormularioProcesoGenerarSaldos();
		this.updateVisibilidadBusquedasFormularioProcesoGenerarSaldos();
		this.updateHabilitarBusquedasFormularioProcesoGenerarSaldos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoGenerarSaldos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponents().length>0) {
	

		if(this.procesogenerarsaldosConstantesFunciones.resaltarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos!=null) {
			index= this.jTabbedPaneBusquedasProcesoGenerarSaldos.indexOfComponent(this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponent(index);
				jPanel.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoGenerarSaldos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoGenerarSaldos.indexOfComponent(this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			if(!this.procesogenerarsaldosConstantesFunciones.mostrarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos && index>-1) {
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoGenerarSaldos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoGenerarSaldos.indexOfComponent(this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
				this.jTabbedPaneBusquedasProcesoGenerarSaldos.setEnabledAt(index,this.procesogenerarsaldosConstantesFunciones.activarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoGenerarSaldos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoGenerarSaldos")) {
			index= this.jTabbedPaneBusquedasProcesoGenerarSaldos.indexOfComponent(this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);

			this.jTabbedPaneBusquedasProcesoGenerarSaldos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoGenerarSaldos.getComponent(index);

			this.procesogenerarsaldosConstantesFunciones.setResaltarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos(resaltar);

			jPanel.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoGenerarSaldos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoGenerarSaldos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoGenerarSaldos();
		this.updateVisibilidadResaltarControlesFormularioProcesoGenerarSaldos();
		this.updateHabilitarResaltarControlesFormularioProcesoGenerarSaldos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoGenerarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesogenerarsaldosConstantesFunciones.resaltaridProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltaridProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarid_empresaProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarid_empresaProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarid_sucursalProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarid_sucursalProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarid_ejercicioProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarid_ejercicioProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarid_periodoProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarid_periodoProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_sucursalProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_sucursalProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarid_tipo_transaccion_moduloProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarid_tipo_transaccion_moduloProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarnumero_comprobanteProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarnumero_comprobanteProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarfechaProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarfechaProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodegaProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodegaProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_productoProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_productoProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarcantidadProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarcantidadProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_unitarioProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_unitarioProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_totalProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarcosto_totalProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodega_enviarProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltarnombre_bodega_enviarProcesoGenerarSaldos);}
		if(this.procesogenerarsaldosConstantesFunciones.resaltartotalProcesoGenerarSaldos!=null && this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setBorder(this.procesogenerarsaldosConstantesFunciones.resaltartotalProcesoGenerarSaldos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoGenerarSaldos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostraridProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelidProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostraridProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_empresaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelid_empresaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_empresaProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_sucursalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelid_sucursalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_sucursalProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_ejercicioProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelid_ejercicioProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_ejercicioProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_periodoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelid_periodoProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_periodoProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_sucursalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelnombre_sucursalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_sucursalProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_tipo_transaccion_moduloProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelid_tipo_transaccion_moduloProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarid_tipo_transaccion_moduloProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnumero_comprobanteProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelnumero_comprobanteProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnumero_comprobanteProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarfechaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelfechaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarfechaProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodegaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelnombre_bodegaProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodegaProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_productoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelnombre_productoProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_productoProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcantidadProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelcantidadProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcantidadProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_unitarioProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelcosto_unitarioProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_unitarioProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_totalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelcosto_totalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarcosto_totalProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodega_enviarProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPanelnombre_bodega_enviarProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrarnombre_bodega_enviarProcesoGenerarSaldos);
		//this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrartotalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jPaneltotalProcesoGenerarSaldos.setVisible(this.procesogenerarsaldosConstantesFunciones.mostrartotalProcesoGenerarSaldos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoGenerarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGenerarSaldos!=null) {
	
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jLabelidProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activaridProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_empresaProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarid_empresaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_sucursalProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarid_sucursalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_ejercicioProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarid_ejercicioProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_periodoProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarid_periodoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_sucursalProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarnombre_sucursalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jComboBoxid_tipo_transaccion_moduloProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarid_tipo_transaccion_moduloProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldnumero_comprobanteProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarnumero_comprobanteProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jDateChooserfechaProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarfechaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodegaProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarnombre_bodegaProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_productoProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarnombre_productoProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcantidadProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarcantidadProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_unitarioProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarcosto_unitarioProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldcosto_totalProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarcosto_totalProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextAreanombre_bodega_enviarProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activarnombre_bodega_enviarProcesoGenerarSaldos);
		this.jInternalFrameDetalleFormProcesoGenerarSaldos.jTextFieldtotalProcesoGenerarSaldos.setEnabled(this.procesogenerarsaldosConstantesFunciones.activartotalProcesoGenerarSaldos);
		}
	}
	
		
}
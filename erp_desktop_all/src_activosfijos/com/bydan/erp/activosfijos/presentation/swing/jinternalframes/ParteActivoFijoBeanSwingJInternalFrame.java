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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.ParteActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.ParteActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.ParteActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.ParteActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class ParteActivoFijoBeanSwingJInternalFrame extends ParteActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParteActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParteActivoFijo> parteactivofijoValidator = new ClassValidator<ParteActivoFijo>(ParteActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParteActivoFijo parteactivofijo;	
	public ParteActivoFijo parteactivofijoAux;
	public ParteActivoFijo parteactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParteActivoFijo parteactivofijoTotales;
	public Long idParteActivoFijoActual;
	public Long iIdNuevoParteActivoFijo=0L;
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

	public String sFinalQueryComboEstadoActivoFijo="";

	public List<EstadoActivoFijo> estadoactivofijosForeignKey;

	public List<EstadoActivoFijo> getestadoactivofijosForeignKey() {
		return estadoactivofijosForeignKey;
	}

	public void setestadoactivofijosForeignKey(List<EstadoActivoFijo> estadoactivofijosForeignKey) {
		this.estadoactivofijosForeignKey = estadoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoActivoFijo estadoactivofijoForeignKey;

	public EstadoActivoFijo getestadoactivofijoForeignKey() {
		return estadoactivofijoForeignKey;
	}

	public void setestadoactivofijoForeignKey(EstadoActivoFijo estadoactivofijoForeignKey) {
		this.estadoactivofijoForeignKey = estadoactivofijoForeignKey;
	}

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
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
	
	public Boolean isPermisoTodoParteActivoFijo;
	public Boolean isPermisoNuevoParteActivoFijo;
	public Boolean isPermisoActualizarParteActivoFijo;
	public Boolean isPermisoActualizarOriginalParteActivoFijo;
	public Boolean isPermisoEliminarParteActivoFijo;
	public Boolean isPermisoGuardarCambiosParteActivoFijo;
	public Boolean isPermisoConsultaParteActivoFijo;
	public Boolean isPermisoBusquedaParteActivoFijo;
	public Boolean isPermisoReporteParteActivoFijo;
	public Boolean isPermisoPaginacionMedioParteActivoFijo;
	public Boolean isPermisoPaginacionAltoParteActivoFijo;
	public Boolean isPermisoPaginacionTodoParteActivoFijo;
	public Boolean isPermisoCopiarParteActivoFijo;
	public Boolean isPermisoVerFormParteActivoFijo;
	public Boolean isPermisoDuplicarParteActivoFijo;
	public Boolean isPermisoOrdenParteActivoFijo;
	
	
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
	
	public ParteActivoFijoParameterReturnGeneral parteactivofijoReturnGeneral;
	public ParteActivoFijoParameterReturnGeneral parteactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParteActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioParteActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParteActivoFijoSessionBeanAdditional parteactivofijoSessionBeanAdditional=null;
	
	public ParteActivoFijoSessionBeanAdditional getParteActivoFijoSessionBeanAdditional() {
		return this.parteactivofijoSessionBeanAdditional;
	}
	
	public void setParteActivoFijoSessionBeanAdditional(ParteActivoFijoSessionBeanAdditional parteactivofijoSessionBeanAdditional) {
		try {
			this.parteactivofijoSessionBeanAdditional=parteactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParteActivoFijoBeanSwingJInternalFrameAdditional parteactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class ParteActivoFijoBeanSwingJInternalFrame
	
	public ParteActivoFijoBeanSwingJInternalFrameAdditional getParteActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.parteactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParteActivoFijoBeanSwingJInternalFrameAdditional(ParteActivoFijoBeanSwingJInternalFrameAdditional parteactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.parteactivofijoBeanSwingJInternalFrameAdditional=parteactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParteActivoFijoLogic parteactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParteActivoFijo parteactivofijoBean;
	public ParteActivoFijoConstantesFunciones parteactivofijoConstantesFunciones;
	//public ParteActivoFijoParameterReturnGeneral parteactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstadoActivoFijoLogic estadoactivofijoLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<ParteActivoFijo> parteactivofijos;	
	//public List<ParteActivoFijo> parteactivofijosEliminados;
	//public List<ParteActivoFijo> parteactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParteActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarParteActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarParteActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormParteActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenParteActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarParteActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarParteActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarParteActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarParteActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarParteActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoActivoFijo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoParteActivoFijo() {
		return this.iIdNuevoParteActivoFijo;
	}

	public void setiIdNuevoParteActivoFijo(Long iIdNuevoParteActivoFijo) {
		this.iIdNuevoParteActivoFijo = iIdNuevoParteActivoFijo;
	}
	
	public Long getidParteActivoFijoActual() {
		return this.idParteActivoFijoActual;
	}

	public void setidParteActivoFijoActual(Long idParteActivoFijoActual) {
		this.idParteActivoFijoActual = idParteActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParteActivoFijo getparteactivofijo() {
		return this.parteactivofijo;
	}

	public void setparteactivofijo(ParteActivoFijo parteactivofijo) {
		this.parteactivofijo = parteactivofijo;
	}
	
	public ParteActivoFijo getparteactivofijoAux() {
		return this.parteactivofijoAux;
	}

	public void setparteactivofijoAux(ParteActivoFijo parteactivofijoAux) {
		this.parteactivofijoAux = parteactivofijoAux;
	}				
	
	public ParteActivoFijo getparteactivofijoAnterior() {
		return this.parteactivofijoAnterior;
	}

	public void setparteactivofijoAnterior(ParteActivoFijo parteactivofijoAnterior) {
		this.parteactivofijoAnterior = parteactivofijoAnterior;
	}	
	
	public ParteActivoFijo getparteactivofijoTotales() {
		return this.parteactivofijoTotales;
	}

	public void setparteactivofijoTotales(ParteActivoFijo parteactivofijoTotales) {
		this.parteactivofijoTotales = parteactivofijoTotales;
	}	
	
	public ParteActivoFijo getparteactivofijoBean() {
		return this.parteactivofijoBean;
	}

	public void setparteactivofijoBean(ParteActivoFijo parteactivofijoBean) {
		this.parteactivofijoBean = parteactivofijoBean;
	}	
	
	public ParteActivoFijoParameterReturnGeneral getparteactivofijoReturnGeneral() {
		return this.parteactivofijoReturnGeneral;
	}

	public void setparteactivofijoReturnGeneral(ParteActivoFijoParameterReturnGeneral parteactivofijoReturnGeneral) {
		this.parteactivofijoReturnGeneral = parteactivofijoReturnGeneral;
	}	
	
	
	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_activo_fijoFK_IdEstadoActivoFijo=-1L;

	public Long getid_estado_activo_fijoFK_IdEstadoActivoFijo() {
		return this.id_estado_activo_fijoFK_IdEstadoActivoFijo;
	}

	public void setid_estado_activo_fijoFK_IdEstadoActivoFijo(Long id_estado_activo_fijoFK_IdEstadoActivoFijo) {
		this.id_estado_activo_fijoFK_IdEstadoActivoFijo = id_estado_activo_fijoFK_IdEstadoActivoFijo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParteActivoFijoLogic getParteActivoFijoLogic()	{		
		return parteactivofijoLogic;
	}

	public void setParteActivoFijoLogic(ParteActivoFijoLogic parteactivofijoLogic) {
		this.parteactivofijoLogic = parteactivofijoLogic;
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
	
	public Boolean getIsEsNuevoParteActivoFijo() {
		return isEsNuevoParteActivoFijo;
	}

	public void setIsEsNuevoParteActivoFijo(Boolean isEsNuevoParteActivoFijo) {
		this.isEsNuevoParteActivoFijo = isEsNuevoParteActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioParteActivoFijo() {
		return esParaAccionDesdeFormularioParteActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioParteActivoFijo(Boolean esParaAccionDesdeFormularioParteActivoFijo) {
		this.esParaAccionDesdeFormularioParteActivoFijo = esParaAccionDesdeFormularioParteActivoFijo;
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

			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parteactivofijoSessionBean.getlidEmpresaActual());
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

			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parteactivofijoSessionBean.getlidSucursalActual());
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

	public void cargarCombosEstadoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoactivofijosForeignKey=new ArrayList<EstadoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoActivoFijoLogic estadoactivofijoLogic=new EstadoActivoFijoLogic();

			//estadoactivofijoLogic.getEstadoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoactivofijoLogic.getEstadoActivoFijoDataAccess().setIsForForeingKeyData(true);

					estadoactivofijoLogic.getTodosEstadoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.estadoactivofijosForeignKey=estadoactivofijoLogic.getEstadoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoactivofijoLogic.getEntityWithConnection(parteactivofijoSessionBean.getlidEstadoActivoFijoActual());
					this.estadoactivofijosForeignKey.add(estadoactivofijoLogic.getEstadoActivoFijo());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(parteactivofijoSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

					if(this.parteactivofijo!=null) {
						this.parteactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParteActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParteActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaParteActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParteActivoFijoGenerico!=null && jComboBoxid_empresaParteActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParteActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.parteactivofijo!=null) {
						this.parteactivofijo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParteActivoFijo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParteActivoFijoGenerico)throws Exception
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
				jComboBoxid_sucursalParteActivoFijoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParteActivoFijoGenerico!=null && jComboBoxid_sucursalParteActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParteActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoActivoFijoForeignKey(Long idEstadoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoActivoFijo  estadoactivofijoTemp=null;

			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosForeignKey) {
				if(estadoactivofijoAux.getId()!=null && estadoactivofijoAux.getId().equals(idEstadoActivoFijoSeleccionado)) {
					estadoactivofijoTemp=estadoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoactivofijoTemp!=null) {

					if(this.parteactivofijo!=null) {
						this.parteactivofijo.setEstadoActivoFijo(estadoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedItem(estadoactivofijoTemp);
					}
				} else {
					//jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedItem(estadoactivofijoTemp);
					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoactivofijoTemp!=null && jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo!=null) {
						jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setSelectedItem(estadoactivofijoTemp);
					} else {
						if(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo!=null) {
							//jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setSelectedItem(estadoactivofijoTemp);
							if(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.getItemCount()>0) {
								jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setSelectedIndex(0);
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

	public String getActualEstadoActivoFijoForeignKeyDescripcion(Long idEstadoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoActivoFijo  estadoactivofijoTemp=null;

			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosForeignKey) {
				if(estadoactivofijoAux.getId()!=null && estadoactivofijoAux.getId().equals(idEstadoActivoFijoSeleccionado)) {
					estadoactivofijoTemp=estadoactivofijoAux;
					break;
				}
			}


			sDescripcion=EstadoActivoFijoConstantesFunciones.getEstadoActivoFijoDescripcion(estadoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoActivoFijoForeignKeyGenerico(Long idEstadoActivoFijoSeleccionado,JComboBox jComboBoxid_estado_activo_fijoParteActivoFijoGenerico)throws Exception
	{
		try
		{
			EstadoActivoFijo  estadoactivofijoTemp=null;

			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosForeignKey) {
				if(estadoactivofijoAux.getId()!=null && estadoactivofijoAux.getId().equals(idEstadoActivoFijoSeleccionado)) {
					estadoactivofijoTemp=estadoactivofijoAux;
					break;
				}
			}

			if(estadoactivofijoTemp!=null) {
				jComboBoxid_estado_activo_fijoParteActivoFijoGenerico.setSelectedItem(estadoactivofijoTemp);
			} else {
				if(jComboBoxid_estado_activo_fijoParteActivoFijoGenerico!=null && jComboBoxid_estado_activo_fijoParteActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_estado_activo_fijoParteActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.parteactivofijo!=null) {
						this.parteactivofijo.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico!=null && jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParteActivoFijo parteactivofijo,JComboBox jComboBoxid_empresaParteActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParteActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParteActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parteactivofijo.setid_empresa(empresaAux.getId());
				parteactivofijo.setempresa_descripcion(ParteActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parteactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParteActivoFijo parteactivofijo,JComboBox jComboBoxid_sucursalParteActivoFijoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParteActivoFijoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParteActivoFijoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parteactivofijo.setid_sucursal(sucursalAux.getId());
				parteactivofijo.setsucursal_descripcion(ParteActivoFijoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parteactivofijo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoActivoFijoForeignKey(ParteActivoFijo parteactivofijo,JComboBox jComboBoxid_estado_activo_fijoParteActivoFijoGenerico)throws Exception
	{
		try
		{
			EstadoActivoFijo  estadoactivofijoAux=new EstadoActivoFijo();

			if(jComboBoxid_estado_activo_fijoParteActivoFijoGenerico==null) {
				estadoactivofijoAux=(EstadoActivoFijo)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.getSelectedItem();
			} else {
				estadoactivofijoAux=(EstadoActivoFijo)jComboBoxid_estado_activo_fijoParteActivoFijoGenerico.getSelectedItem();
			}

			if(estadoactivofijoAux!=null && estadoactivofijoAux.getId()!=null) {
				parteactivofijo.setid_estado_activo_fijo(estadoactivofijoAux.getId());
				parteactivofijo.setestadoactivofijo_descripcion(ParteActivoFijoConstantesFunciones.getEstadoActivoFijoDescripcion(estadoactivofijoAux));
				parteactivofijo.setEstadoActivoFijo(estadoactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(ParteActivoFijo parteactivofijo,JComboBox jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoParteActivoFijoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				parteactivofijo.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				parteactivofijo.setdetalleactivofijo_descripcion(ParteActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				parteactivofijo.setDetalleActivoFijo(detalleactivofijoAux);			}
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

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
					}

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
					}

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.removeAllItems();

							for(EstadoActivoFijo estadoactivofijo:this.estadoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.addItem(estadoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
					}

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.removeAllItems();

							for(EstadoActivoFijo estadoactivofijo:this.estadoactivofijosForeignKey) {
								this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.addItem(estadoactivofijo);
							}
						}

						if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { 
					}

					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.addItem(detalleactivofijo);
							}
						}

						if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoActivoFijoForeignKey(EstadoActivoFijo estadoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedItem(estadoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setSelectedItem(estadoactivofijo);
						} else {
							this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParteActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParteActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesParteActivoFijo(this.parteactivofijoLogic.getParteActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParteActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesParteActivoFijo(this.parteactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(EstadoActivoFijo.class));
		classes.add(new Classe(DetalleActivoFijo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parteactivofijoLogic.setParteActivoFijos(this.parteactivofijos);
			parteactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParteActivoFijoParameterReturnGeneral getParteActivoFijoParameterGeneral() {
		return this.parteactivofijoParameterGeneral;
	}
	
	public void setParteActivoFijoParameterGeneral(ParteActivoFijoParameterReturnGeneral parteactivofijoParameterGeneral) {
		this.parteactivofijoParameterGeneral = parteactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParteActivoFijo() {
		return isPermisoTodoParteActivoFijo;
	}

	public void setIsPermisoTodoParteActivoFijo(Boolean isPermisoTodoParteActivoFijo) {
		this.isPermisoTodoParteActivoFijo = isPermisoTodoParteActivoFijo;
	}

	public Boolean getIsPermisoNuevoParteActivoFijo() {
		return isPermisoNuevoParteActivoFijo;
	}

	public void setIsPermisoNuevoParteActivoFijo(Boolean isPermisoNuevoParteActivoFijo) {
		this.isPermisoNuevoParteActivoFijo = isPermisoNuevoParteActivoFijo;
	}

	public Boolean getIsPermisoActualizarParteActivoFijo() {
		return isPermisoActualizarParteActivoFijo;
	}

	public void setIsPermisoActualizarParteActivoFijo(Boolean isPermisoActualizarParteActivoFijo) {
		this.isPermisoActualizarParteActivoFijo = isPermisoActualizarParteActivoFijo;
	}

	public Boolean getIsPermisoEliminarParteActivoFijo() {
		return isPermisoEliminarParteActivoFijo;
	}

	public void setIsPermisoEliminarParteActivoFijo(Boolean isPermisoEliminarParteActivoFijo) {
		this.isPermisoEliminarParteActivoFijo = isPermisoEliminarParteActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosParteActivoFijo() {
		return isPermisoGuardarCambiosParteActivoFijo;
	}

	public void setIsPermisoGuardarCambiosParteActivoFijo(Boolean isPermisoGuardarCambiosParteActivoFijo) {
		this.isPermisoGuardarCambiosParteActivoFijo = isPermisoGuardarCambiosParteActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaParteActivoFijo() {
		return isPermisoConsultaParteActivoFijo;
	}

	public void setIsPermisoConsultaParteActivoFijo(Boolean isPermisoConsultaParteActivoFijo) {
		this.isPermisoConsultaParteActivoFijo = isPermisoConsultaParteActivoFijo;
	}

	public Boolean getIsPermisoBusquedaParteActivoFijo() {
		return isPermisoBusquedaParteActivoFijo;
	}

	public void setIsPermisoBusquedaParteActivoFijo(Boolean isPermisoBusquedaParteActivoFijo) {
		this.isPermisoBusquedaParteActivoFijo = isPermisoBusquedaParteActivoFijo;
	}

	public Boolean getIsPermisoReporteParteActivoFijo() {
		return isPermisoReporteParteActivoFijo;
	}

	public void setIsPermisoReporteParteActivoFijo(Boolean isPermisoReporteParteActivoFijo) {
		this.isPermisoReporteParteActivoFijo = isPermisoReporteParteActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioParteActivoFijo() {
		return isPermisoPaginacionMedioParteActivoFijo;
	}

	public void setIsPermisoPaginacionMedioParteActivoFijo(Boolean isPermisoPaginacionMedioParteActivoFijo) {
		this.isPermisoPaginacionMedioParteActivoFijo = isPermisoPaginacionMedioParteActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoParteActivoFijo() {
		return isPermisoPaginacionTodoParteActivoFijo;
	}

	public void setIsPermisoPaginacionTodoParteActivoFijo(Boolean isPermisoPaginacionTodoParteActivoFijo) {
		this.isPermisoPaginacionTodoParteActivoFijo = isPermisoPaginacionTodoParteActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoParteActivoFijo() {
		return isPermisoPaginacionAltoParteActivoFijo;
	}

	public void setIsPermisoPaginacionAltoParteActivoFijo(Boolean isPermisoPaginacionAltoParteActivoFijo) {
		this.isPermisoPaginacionAltoParteActivoFijo = isPermisoPaginacionAltoParteActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarParteActivoFijo() {
		return isPermisoCopiarParteActivoFijo;
	}

	public void setIsPermisoCopiarParteActivoFijo(Boolean isPermisoCopiarParteActivoFijo) {
		this.isPermisoCopiarParteActivoFijo = isPermisoCopiarParteActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormParteActivoFijo() {
		return isPermisoVerFormParteActivoFijo;
	}

	public void setIsPermisoVerFormParteActivoFijo(Boolean isPermisoVerFormParteActivoFijo) {
		this.isPermisoVerFormParteActivoFijo = isPermisoVerFormParteActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarParteActivoFijo() {
		return isPermisoDuplicarParteActivoFijo;
	}

	public void setIsPermisoDuplicarParteActivoFijo(Boolean isPermisoDuplicarParteActivoFijo) {
		this.isPermisoDuplicarParteActivoFijo = isPermisoDuplicarParteActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenParteActivoFijo() {
		return isPermisoOrdenParteActivoFijo;
	}

	public void setIsPermisoOrdenParteActivoFijo(Boolean isPermisoOrdenParteActivoFijo) {
		this.isPermisoOrdenParteActivoFijo = isPermisoOrdenParteActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParteActivoFijo() {
		return isVisibilidadCeldaNuevoParteActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoParteActivoFijo(Boolean isVisibilidadCeldaNuevoParteActivoFijo) {
		this.isVisibilidadCeldaNuevoParteActivoFijo = isVisibilidadCeldaNuevoParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParteActivoFijo() {
		return isVisibilidadCeldaDuplicarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarParteActivoFijo(Boolean isVisibilidadCeldaDuplicarParteActivoFijo) {
		this.isVisibilidadCeldaDuplicarParteActivoFijo = isVisibilidadCeldaDuplicarParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParteActivoFijo() {
		return isVisibilidadCeldaCopiarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarParteActivoFijo(Boolean isVisibilidadCeldaCopiarParteActivoFijo) {
		this.isVisibilidadCeldaCopiarParteActivoFijo = isVisibilidadCeldaCopiarParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParteActivoFijo() {
		return isVisibilidadCeldaVerFormParteActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormParteActivoFijo(Boolean isVisibilidadCeldaVerFormParteActivoFijo) {
		this.isVisibilidadCeldaVerFormParteActivoFijo = isVisibilidadCeldaVerFormParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParteActivoFijo() {
		return isVisibilidadCeldaOrdenParteActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenParteActivoFijo(Boolean isVisibilidadCeldaOrdenParteActivoFijo) {
		this.isVisibilidadCeldaOrdenParteActivoFijo = isVisibilidadCeldaOrdenParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParteActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesParteActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParteActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesParteActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo = isVisibilidadCeldaNuevoRelacionesParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParteActivoFijo() {
		return isVisibilidadCeldaModificarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarParteActivoFijo(Boolean isVisibilidadCeldaModificarParteActivoFijo) {
		this.isVisibilidadCeldaModificarParteActivoFijo = isVisibilidadCeldaModificarParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParteActivoFijo() {
		return isVisibilidadCeldaActualizarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarParteActivoFijo(Boolean isVisibilidadCeldaActualizarParteActivoFijo) {
		this.isVisibilidadCeldaActualizarParteActivoFijo = isVisibilidadCeldaActualizarParteActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarParteActivoFijo() {
		return isVisibilidadCeldaEliminarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarParteActivoFijo(Boolean isVisibilidadCeldaEliminarParteActivoFijo) {
		this.isVisibilidadCeldaEliminarParteActivoFijo = isVisibilidadCeldaEliminarParteActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarParteActivoFijo() {
		return isVisibilidadCeldaCancelarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarParteActivoFijo(Boolean isVisibilidadCeldaCancelarParteActivoFijo) {
		this.isVisibilidadCeldaCancelarParteActivoFijo = isVisibilidadCeldaCancelarParteActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarParteActivoFijo() {
		return isVisibilidadCeldaGuardarParteActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarParteActivoFijo(Boolean isVisibilidadCeldaGuardarParteActivoFijo) {
		this.isVisibilidadCeldaGuardarParteActivoFijo = isVisibilidadCeldaGuardarParteActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParteActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosParteActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParteActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosParteActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosParteActivoFijo = isVisibilidadCeldaGuardarCambiosParteActivoFijo;
	}
		
	public ParteActivoFijoSessionBean getparteactivofijoSessionBean() {
		return this.parteactivofijoSessionBean;
	}
	
	public void setparteactivofijoSessionBean(ParteActivoFijoSessionBean parteactivofijoSessionBean) {
		this.parteactivofijoSessionBean=parteactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoActivoFijo() {
		return this.isVisibilidadFK_IdEstadoActivoFijo;
	}

	public void setisVisibilidadFK_IdEstadoActivoFijo(Boolean isVisibilidadFK_IdEstadoActivoFijo) {
		this.isVisibilidadFK_IdEstadoActivoFijo=isVisibilidadFK_IdEstadoActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(ParteActivoFijo parteactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parteactivofijo,null);
				this.setActualParaGuardarSucursalForeignKey(parteactivofijo,null);
				this.setActualParaGuardarEstadoActivoFijoForeignKey(parteactivofijo,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(parteactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(ParteActivoFijo parteactivofijo,ParteActivoFijo parteactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParteActivoFijo(parteactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parteactivofijoAux.setId(parteactivofijo.getId());
		parteactivofijoAux.setVersionRow(parteactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParteActivoFijo();
		
			int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parteactivofijoValidator.getInvalidValues(this.parteactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parteactivofijoLogic.setDatosCliente(datosCliente);
			parteactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parteactivofijoAux=new  ParteActivoFijo();
				
				parteactivofijoAux.setIsNew(true);
				parteactivofijoAux.setIsChanged(true);
				
				parteactivofijoAux.setParteActivoFijoOriginal(this.parteactivofijo);
				
				parteactivofijoAux.setId(this.parteactivofijo.getId());	
				parteactivofijoAux.setVersionRow(this.parteactivofijo.getVersionRow());	
				parteactivofijoAux.setid_empresa(this.parteactivofijo.getid_empresa());	
				parteactivofijoAux.setid_sucursal(this.parteactivofijo.getid_sucursal());	
				parteactivofijoAux.setid_estado_activo_fijo(this.parteactivofijo.getid_estado_activo_fijo());	
				parteactivofijoAux.setid_detalle_activo_fijo(this.parteactivofijo.getid_detalle_activo_fijo());	
				parteactivofijoAux.setcodigo(this.parteactivofijo.getcodigo());	
				parteactivofijoAux.setnombre(this.parteactivofijo.getnombre());	
				parteactivofijoAux.setmarca(this.parteactivofijo.getmarca());	
				parteactivofijoAux.setserie(this.parteactivofijo.getserie());	
				parteactivofijoAux.setcantidad(this.parteactivofijo.getcantidad());	
				parteactivofijoAux.setfoto(this.parteactivofijo.getfoto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parteactivofijoAux,parteactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.saveParteActivoFijos();//WithConnection
						//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesParteActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parteactivofijoLogic.saveParteActivoFijoRelaciones(parteactivofijoAux);//WithConnection
								//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parteactivofijoAux,parteactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parteactivofijoAux=new  ParteActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.parteactivofijoSessionBean.getEsGuardarRelacionado() && this.parteactivofijo.getId()>=0)) {
						
					parteactivofijoAux.setIsNew(false);
				}
				
				parteactivofijoAux.setIsDeleted(false);
			
				parteactivofijoAux.setId(this.parteactivofijo.getId());	
				parteactivofijoAux.setVersionRow(this.parteactivofijo.getVersionRow());	
				parteactivofijoAux.setid_empresa(this.parteactivofijo.getid_empresa());	
				parteactivofijoAux.setid_sucursal(this.parteactivofijo.getid_sucursal());	
				parteactivofijoAux.setid_estado_activo_fijo(this.parteactivofijo.getid_estado_activo_fijo());	
				parteactivofijoAux.setid_detalle_activo_fijo(this.parteactivofijo.getid_detalle_activo_fijo());	
				parteactivofijoAux.setcodigo(this.parteactivofijo.getcodigo());	
				parteactivofijoAux.setnombre(this.parteactivofijo.getnombre());	
				parteactivofijoAux.setmarca(this.parteactivofijo.getmarca());	
				parteactivofijoAux.setserie(this.parteactivofijo.getserie());	
				parteactivofijoAux.setcantidad(this.parteactivofijo.getcantidad());	
				parteactivofijoAux.setfoto(this.parteactivofijo.getfoto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parteactivofijoAux,parteactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.saveParteActivoFijos();//WithConnection
						//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesParteActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parteactivofijoLogic.saveParteActivoFijoRelaciones(parteactivofijoAux);//WithConnection
								//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parteactivofijoAux,parteactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parteactivofijo,parteactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parteactivofijoAux=new  ParteActivoFijo();
				
				parteactivofijoAux.setIsNew(false);
				parteactivofijoAux.setIsChanged(false);
				
				parteactivofijoAux.setIsDeleted(true);
				
				parteactivofijoAux.setId(this.parteactivofijo.getId());	
				parteactivofijoAux.setVersionRow(this.parteactivofijo.getVersionRow());	
				parteactivofijoAux.setid_empresa(this.parteactivofijo.getid_empresa());	
				parteactivofijoAux.setid_sucursal(this.parteactivofijo.getid_sucursal());	
				parteactivofijoAux.setid_estado_activo_fijo(this.parteactivofijo.getid_estado_activo_fijo());	
				parteactivofijoAux.setid_detalle_activo_fijo(this.parteactivofijo.getid_detalle_activo_fijo());	
				parteactivofijoAux.setcodigo(this.parteactivofijo.getcodigo());	
				parteactivofijoAux.setnombre(this.parteactivofijo.getnombre());	
				parteactivofijoAux.setmarca(this.parteactivofijo.getmarca());	
				parteactivofijoAux.setserie(this.parteactivofijo.getserie());	
				parteactivofijoAux.setcantidad(this.parteactivofijo.getcantidad());	
				parteactivofijoAux.setfoto(this.parteactivofijo.getfoto());	
				
				if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parteactivofijoAux.getId()>=0) {	
						this.parteactivofijosEliminados.add(parteactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parteactivofijoAux,parteactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.saveParteActivoFijos();//WithConnection
						//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parteactivofijoLogic.saveParteActivoFijoRelaciones(parteactivofijoAux);//WithConnection
								//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
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
							if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parteactivofijoAux,parteactivofijoLogic.getParteActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parteactivofijoAux,parteactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getParteActivoFijos().addAll(this.parteactivofijosEliminados);
					
					parteactivofijoLogic.saveParteActivoFijos();//WithConnection
					//parteactivofijoLogic.getSetVersionRowParteActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParteActivoFijo();
				
				this.parteactivofijosEliminados= new ArrayList<ParteActivoFijo>();		
			}
			
			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parte Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parteactivofijo=parteactivofijoAux;
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
      		//this.finishProcessParteActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(ParteActivoFijo parteactivofijoLocal) throws Exception {
		
		if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParteActivoFijo parteactivofijoLocal) throws Exception {	
		if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parteactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parteactivofijoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoActivoFijoDetalleFormJInternalFrame.class)) {
				EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrameLocal=(EstadoActivoFijoBeanSwingJInternalFrame) ((EstadoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoActivoFijo(estadoactivofijoBeanSwingJInternalFrameLocal.getestadoactivofijo(),true);
				estadoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(estadoactivofijoBeanSwingJInternalFrameLocal.estadoactivofijo,this.estadoactivofijosForeignKey);

				estadoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoactivofijoBeanSwingJInternalFrameLocal.estadoactivofijo);

				parteactivofijoLocal.setEstadoActivoFijo(estadoactivofijoBeanSwingJInternalFrameLocal.estadoactivofijo);

				this.addItemDefectoCombosForeignKeyEstadoActivoFijo();
				this.cargarCombosFrameEstadoActivoFijosForeignKey("Formulario");
				this.setActualEstadoActivoFijoForeignKey(estadoactivofijoBeanSwingJInternalFrameLocal.estadoactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				parteactivofijoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParteActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parteactivofijoValidator.getInvalidValues(this.parteactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParteActivoFijo parteactivofijo,List<ParteActivoFijo> parteactivofijos) throws Exception {
		try	{		
			ParteActivoFijoConstantesFunciones.actualizarLista(parteactivofijo,parteactivofijos,this.parteactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParteActivoFijo parteactivofijo,List<ParteActivoFijo> parteactivofijos) throws Exception {
		try	{			
			ParteActivoFijoConstantesFunciones.actualizarSelectedLista(parteactivofijo,parteactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParteActivoFijo> parteactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parteactivofijosLocal=this.parteactivofijoLogic.getParteActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parteactivofijosLocal=this.parteactivofijos;
			}
			//ARCHITECTURE
		
			for(ParteActivoFijo parteactivofijoLocal:parteactivofijosLocal) {
				if(this.permiteMantenimiento(parteactivofijoLocal) && parteactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParteActivoFijoConstantesFunciones.getParteActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_empresaParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_sucursalParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.IDESTADOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_estado_activo_fijoParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_detalle_activo_fijoParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcodigoParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelnombreParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelmarcaParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelserieParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcantidadParteActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParteActivoFijoConstantesFunciones.FOTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelfotoParteActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_empresaParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_sucursalParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_estado_activo_fijoParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelid_detalle_activo_fijoParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcodigoParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelnombreParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelmarcaParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelserieParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcantidadParteActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParteActivoFijo.jLabelfotoParteActivoFijo,"");
		
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
		this.iIdNuevoParteActivoFijo--;	
		
		
		this.parteactivofijoAux=new ParteActivoFijo();
		
		this.parteactivofijoAux.setId(this.iIdNuevoParteActivoFijo);
		this.parteactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parteactivofijoLogic.getParteActivoFijos().add(this.parteactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parteactivofijos.add(this.parteactivofijoAux);
		}
		//ARCHITECTURE
		
		this.parteactivofijo=this.parteactivofijoAux;
		
		if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParteActivoFijo(this.parteactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyParteActivoFijo(this.parteactivofijo);
		}
				
		//this.setDefaultControlesParteActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParteActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParteActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParteActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParteActivoFijo(this.parteactivofijoBean,this.parteactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParteActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=ParteActivoFijoConstantesFunciones.getClassesRelationshipsOfParteActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parteactivofijoReturnGeneral=parteactivofijoLogic.procesarEventosParteActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parteactivofijoLogic.getParteActivoFijos(),this.parteactivofijo,this.parteactivofijoParameterGeneral,this.isEsNuevoParteActivoFijo,classes);//this.parteactivofijoLogic.getParteActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParteActivoFijo(this.parteactivofijoReturnGeneral,this.parteactivofijoBean,false);
		
		if(this.parteactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo());
		}
		
		if(this.parteactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo(),classes);//this.parteactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParteActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParteActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormParteActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParteActivoFijo(false);
						
			if(parteactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParteActivoFijo();
			}
			
			this.actualizarVisualTableDatosParteActivoFijo();
			
			this.jTableDatosParteActivoFijo.setRowSelectionInterval(this.getIndiceNuevoParteActivoFijo(), this.getIndiceNuevoParteActivoFijo());
			
			this.seleccionarFilaTablaParteActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesParteActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParteActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarcodigoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarnombreParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarmarcaParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarserieParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarcantidadParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarfotoParteActivoFijo);	
		//
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarid_empresaParteActivoFijo);//
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarid_sucursalParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarid_estado_activo_fijoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setEnabled(isHabilitar && this.parteactivofijoConstantesFunciones.activarid_detalle_activo_fijoParteActivoFijo);
	};
	
	public void setDefaultControlesParteActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParteActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parteactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.parteactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.setVisible(true);
			
					
		} else {
			//this.parteactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.parteactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParteActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
				if(parteactivofijoAux.getId().equals(this.iIdNuevoParteActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijos) {
				if(parteactivofijoAux.getId().equals(this.iIdNuevoParteActivoFijo)) {
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
	
	public int getIndiceActualParteActivoFijo(ParteActivoFijo parteactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
				if(parteactivofijoAux.getId().equals(parteactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijos) {
				if(parteactivofijoAux.getId().equals(parteactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParteActivoFijo(ParteActivoFijo parteactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
				if(parteactivofijoAux.getParteActivoFijoOriginal().getId().equals(parteactivofijoOriginal.getId())) {
					existe=true;
					parteactivofijoOriginal.setId(parteactivofijoAux.getId());
					parteactivofijoOriginal.setVersionRow(parteactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParteActivoFijo parteactivofijoAux:this.parteactivofijos) {
				if(parteactivofijoAux.getParteActivoFijoOriginal().getId().equals(parteactivofijoOriginal.getId())) {
					existe=true;
					parteactivofijoOriginal.setId(parteactivofijoAux.getId());
					parteactivofijoOriginal.setVersionRow(parteactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParteActivoFijo(Boolean esParaCancelar) throws Exception {
		parteactivofijosAux=new ArrayList<ParteActivoFijo>();
		parteactivofijoAux=new ParteActivoFijo();
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
					if(parteactivofijoAux.getId()<0) {
						parteactivofijosAux.add(parteactivofijoAux);
					}		
				}
				this.iIdNuevoParteActivoFijo=0L;
				this.parteactivofijoLogic.getParteActivoFijos().removeAll(parteactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParteActivoFijo parteactivofijoAux:this.parteactivofijos) {
					if(parteactivofijoAux.getId()<0) {
						parteactivofijosAux.add(parteactivofijoAux);
					}		
				}
				this.iIdNuevoParteActivoFijo=0L;
				this.parteactivofijos.removeAll(parteactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParteActivoFijo 
					&& this.parteactivofijoLogic.getParteActivoFijos().size()>0
					) {
					parteactivofijoAux=this.parteactivofijoLogic.getParteActivoFijos().get(this.parteactivofijoLogic.getParteActivoFijos().size() - 1);
				
					if(parteactivofijoAux.getId()<0) {
						this.parteactivofijoLogic.getParteActivoFijos().remove(parteactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParteActivoFijo && this.parteactivofijos.size()>0) {
					parteactivofijoAux=this.parteactivofijos.get(this.parteactivofijos.size() - 1);
				
					if(parteactivofijoAux.getId()<0) {
						this.parteactivofijos.remove(parteactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParteActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parteactivofijo.getId()<0) {
				this.parteactivofijoLogic.getParteActivoFijos().remove(this.parteactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parteactivofijo.getId()<0) {
				this.parteactivofijos.remove(this.parteactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesParteActivoFijo(List<ParteActivoFijo> parteactivofijosAux) throws Exception {
		ParteActivoFijoConstantesFunciones.setEstadosInicialesParteActivoFijo(parteactivofijosAux);
	}
	
	public void setEstadosInicialesParteActivoFijo(ParteActivoFijo parteactivofijoAux) throws Exception {
		ParteActivoFijoConstantesFunciones.setEstadosInicialesParteActivoFijo(parteactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParteActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParteActivoFijoActual()) {
				if(!this.isEsNuevoParteActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParteActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParteActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parte Activo Fijo ?", "MANTENIMIENTO DE Parte Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParteActivoFijo parteactivofijo) throws Exception {
		ParteActivoFijoConstantesFunciones.seleccionarAsignar(this.parteactivofijo,parteactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParteActivoFijo=this.isPermisoActualizarOriginalParteActivoFijo;
			
			
			this.seleccionarAsignar(parteactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParteActivoFijoConstantesFunciones.quitarEspaciosParteActivoFijo(this.parteactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParteActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parteactivofijoSessionBean.setsFuncionBusquedaRapida(this.parteactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParteActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParteActivoFijo(esParaCancelar);				
				this.cancelarNuevoParteActivoFijo(esParaCancelar);								
			}
			
			this.parteactivofijo=new ParteActivoFijo();
			
			this.inicializarParteActivoFijo();
			
			this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParteActivoFijo() throws Exception {
		try {
			ParteActivoFijoConstantesFunciones.inicializarParteActivoFijo(this.parteactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parteactivofijoLogic.getParteActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParteActivoFijos(String sAccionBusqueda,List<ParteActivoFijo> parteactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="ParteActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParteActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParteActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParteActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parte Activo Fijos");		
		parameters.put("busquedapor", ParteActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParteActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParteActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParteActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParteActivoFijo=new JRBeanArrayDataSource(ParteActivoFijoJInternalFrame.TraerParteActivoFijoBeans(parteactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParteActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParteActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParteActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParteActivoFijoBean.TraerParteActivoFijoBeans(parteactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParteActivoFijoActionPerformed(null);
					//this.generarExcelReporteParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParteActivoFijos(sAccionBusqueda,sTipoArchivoReporte,parteactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParteActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParteActivoFijo> parteactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParteActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParteActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParteActivoFijo parteactivofijo : parteactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParteActivoFijoConstantesFunciones.generarExcelReporteDataParteActivoFijo("NORMAL",row,workbook,parteactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParteActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		ParteActivoFijoConstantesFunciones.generarExcelReporteHeaderParteActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParteActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParteActivoFijo> parteactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParteActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParteActivoFijo parteactivofijo : parteactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParteActivoFijoConstantesFunciones.getParteActivoFijoDescripcion(parteactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getestadoactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParteActivoFijoConstantesFunciones.LABEL_FOTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_FOTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parteactivofijo.getfoto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParteActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParteActivoFijo> parteactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParteActivoFijo> parteactivofijosRespaldo=null;
		
		classes=ParteActivoFijoConstantesFunciones.getClassesRelationshipsOfParteActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parteactivofijoLogic.setDatosCliente(this.datosCliente);
		this.parteactivofijoLogic.setDatosDeep(this.datosDeep);
		this.parteactivofijoLogic.setIsConDeep(true);
		
		parteactivofijosRespaldo=this.parteactivofijoLogic.getParteActivoFijos();
		
		this.parteactivofijoLogic.setParteActivoFijos(parteactivofijosParaReportes);	
		this.parteactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parteactivofijosParaReportes=this.parteactivofijoLogic.getParteActivoFijos();
		this.parteactivofijoLogic.setParteActivoFijos(parteactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParteActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParteActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParteActivoFijo parteactivofijo : parteactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParteActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParteActivoFijoConstantesFunciones.generarExcelReporteDataParteActivoFijo("NORMAL",row,workbook,parteactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParteActivoFijoConstantesFunciones.getParteActivoFijoDescripcion(parteactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParteActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParteActivoFijo() throws Exception {		
		this.startProcessParteActivoFijo(true);
	}
	
	public void startProcessParteActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParteActivoFijo ,this.jPanelParametrosReportesParteActivoFijo, this.jScrollPanelDatosParteActivoFijo,this.jPanelPaginacionParteActivoFijo, this.jScrollPanelDatosEdicionParteActivoFijo, this.jPanelAccionesParteActivoFijo,this.jPanelAccionesFormularioParteActivoFijo,this.jmenuBarParteActivoFijo,this.jmenuBarDetalleParteActivoFijo,this.jTtoolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasParteActivoFijo=this.jTabbedPaneBusquedasParteActivoFijo; 
		
		final JPanel jPanelParametrosReportesParteActivoFijo=this.jPanelParametrosReportesParteActivoFijo;
		//final JScrollPane jScrollPanelDatosParteActivoFijo=this.jScrollPanelDatosParteActivoFijo;
		final JTable jTableDatosParteActivoFijo=this.jTableDatosParteActivoFijo;		
		final JPanel jPanelPaginacionParteActivoFijo=this.jPanelPaginacionParteActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionParteActivoFijo=this.jScrollPanelDatosEdicionParteActivoFijo;
		final JPanel jPanelAccionesParteActivoFijo=this.jPanelAccionesParteActivoFijo;
		
		JPanel jPanelCamposAuxiliarParteActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParteActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			jPanelCamposAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jPanelCamposParteActivoFijo;
			jPanelAccionesFormularioAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jPanelAccionesFormularioParteActivoFijo;
		}
		
		final JPanel jPanelCamposParteActivoFijo=jPanelCamposAuxiliarParteActivoFijo;
		final JPanel jPanelAccionesFormularioParteActivoFijo=jPanelAccionesFormularioAuxiliarParteActivoFijo;
		
		
		final JMenuBar jmenuBarParteActivoFijo=this.jmenuBarParteActivoFijo;
		final JToolBar jTtoolBarParteActivoFijo=this.jTtoolBarParteActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParteActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParteActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			jmenuBarDetalleAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jmenuBarDetalleParteActivoFijo;
			jTtoolBarDetalleAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jTtoolBarDetalleParteActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleParteActivoFijo=jmenuBarDetalleAuxiliarParteActivoFijo;
		final JToolBar jTtoolBarDetalleParteActivoFijo=jTtoolBarDetalleAuxiliarParteActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParteActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParteActivoFijo;
			processRunnable.jTableDatos=jTableDatosParteActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposParteActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionParteActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesParteActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParteActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarParteActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParteActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarParteActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParteActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParteActivoFijo ,jPanelParametrosReportesParteActivoFijo,jTableDatosParteActivoFijo, /*jScrollPanelDatosParteActivoFijo,*/jPanelCamposParteActivoFijo,jPanelPaginacionParteActivoFijo, /*jScrollPanelDatosEdicionParteActivoFijo,*/ jPanelAccionesParteActivoFijo,jPanelAccionesFormularioParteActivoFijo,jmenuBarParteActivoFijo,jmenuBarDetalleParteActivoFijo,jTtoolBarParteActivoFijo,jTtoolBarDetalleParteActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParteActivoFijo ,jPanelParametrosReportesParteActivoFijo, jScrollPanelDatosParteActivoFijo,jPanelPaginacionParteActivoFijo, jScrollPanelDatosEdicionParteActivoFijo, jPanelAccionesParteActivoFijo,jPanelAccionesFormularioParteActivoFijo,jmenuBarParteActivoFijo,jmenuBarDetalleParteActivoFijo,jTtoolBarParteActivoFijo,jTtoolBarDetalleParteActivoFijo);
						
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
	
	public void finishProcessParteActivoFijo() {// throws Exception 
		this.finishProcessParteActivoFijo(true);
	}
	
	public void finishProcessParteActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParteActivoFijo ,this.jPanelParametrosReportesParteActivoFijo, this.jScrollPanelDatosParteActivoFijo,this.jPanelPaginacionParteActivoFijo, this.jScrollPanelDatosEdicionParteActivoFijo, this.jPanelAccionesParteActivoFijo,this.jPanelAccionesFormularioParteActivoFijo,this.jmenuBarParteActivoFijo,this.jmenuBarDetalleParteActivoFijo,this.jTtoolBarParteActivoFijo,this.jTtoolBarDetalleParteActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasParteActivoFijo=this.jTabbedPaneBusquedasParteActivoFijo; 
		
		final JPanel jPanelParametrosReportesParteActivoFijo=this.jPanelParametrosReportesParteActivoFijo;
		//final JScrollPane jScrollPanelDatosParteActivoFijo=this.jScrollPanelDatosParteActivoFijo;
		final JTable jTableDatosParteActivoFijo=this.jTableDatosParteActivoFijo;		
		final JPanel jPanelPaginacionParteActivoFijo=this.jPanelPaginacionParteActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionParteActivoFijo=this.jScrollPanelDatosEdicionParteActivoFijo;
		final JPanel jPanelAccionesParteActivoFijo=this.jPanelAccionesParteActivoFijo;
		
		JPanel jPanelCamposAuxiliarParteActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParteActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			jPanelCamposAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jPanelCamposParteActivoFijo;
			jPanelAccionesFormularioAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jPanelAccionesFormularioParteActivoFijo;
		}
		
		final JPanel jPanelCamposParteActivoFijo=jPanelCamposAuxiliarParteActivoFijo;
		final JPanel jPanelAccionesFormularioParteActivoFijo=jPanelAccionesFormularioAuxiliarParteActivoFijo;
		
		
		final JMenuBar jmenuBarParteActivoFijo=this.jmenuBarParteActivoFijo;		
		final JToolBar jTtoolBarParteActivoFijo=this.jTtoolBarParteActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarParteActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParteActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			jmenuBarDetalleAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jmenuBarDetalleParteActivoFijo;
			jTtoolBarDetalleAuxiliarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jTtoolBarDetalleParteActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleParteActivoFijo=jmenuBarDetalleAuxiliarParteActivoFijo;
		final JToolBar jTtoolBarDetalleParteActivoFijo=jTtoolBarDetalleAuxiliarParteActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParteActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParteActivoFijo;
			processRunnable.jTableDatos=jTableDatosParteActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposParteActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionParteActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesParteActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParteActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarParteActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParteActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarParteActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParteActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParteActivoFijo ,jPanelParametrosReportesParteActivoFijo, jTableDatosParteActivoFijo,/*jScrollPanelDatosParteActivoFijo,*/jPanelCamposParteActivoFijo,jPanelPaginacionParteActivoFijo, /*jScrollPanelDatosEdicionParteActivoFijo,*/ jPanelAccionesParteActivoFijo,jPanelAccionesFormularioParteActivoFijo,jmenuBarParteActivoFijo,jmenuBarDetalleParteActivoFijo,jTtoolBarParteActivoFijo,jTtoolBarDetalleParteActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParteActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParteActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParteActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParteActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParteActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParteActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParteActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParteActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParteActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parteactivofijoConstantesFunciones.getsFinalQueryParteActivoFijo();
		String  finalQueryPaginacionTodos=this.parteactivofijoConstantesFunciones.getsFinalQueryParteActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParteActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoParteActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParteActivoFijoConstantesFunciones.getArrayColumnasGlobalesParteActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParteActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parteactivofijosEliminados= new ArrayList<ParteActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParteActivoFijo();
		
				///*ParteActivoFijoSessionBean*/this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			
			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
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
					this.iNumeroPaginacion=ParteActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParteActivoFijoConstantesFunciones.getClassesForeignKeysOfParteActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parteactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parteactivofijosAux= new ArrayList<ParteActivoFijo>();
			
				
			parteactivofijoLogic.setDatosCliente(this.datosCliente);
			parteactivofijoLogic.setDatosDeep(this.datosDeep);
			parteactivofijoLogic.setIsConDeep(true);
			
			
			parteactivofijoLogic.getParteActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parteactivofijoLogic.getTodosParteActivoFijos(finalQueryGlobal,pagination);
					
					//parteactivofijoLogic.getTodosParteActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parteactivofijoLogic.getParteActivoFijos()==null|| parteactivofijoLogic.getParteActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parteactivofijosAux= new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijoLogic.getParteActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijosAux= new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parteactivofijoLogic.getTodosParteActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//parteactivofijoLogic.getTodosParteActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParteActivoFijos("Todos",parteactivofijoLogic.getParteActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());					
							parteactivofijoLogic.getParteActivoFijos().addAll(parteactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijos=new ArrayList<ParteActivoFijo>();
							parteactivofijos.addAll(parteactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParteActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParteActivoFijo=this.idActual;
				
				} else if(this.idParteActivoFijoActual!=null && this.idParteActivoFijoActual!=0L) {
					idParteActivoFijo=idParteActivoFijoActual;
				}
				
					
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndicePorId(idParteActivoFijo);
				
				this.parteactivofijos=new ArrayList<ParteActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parteactivofijoLogic.getEntity(idParteActivoFijo);
					
					//parteactivofijoLogic.getEntityWithConnection(idParteActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());
					parteactivofijoLogic.getParteActivoFijos().add(parteactivofijoLogic.getParteActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijos=new ArrayList<ParteActivoFijo>();
					this.parteactivofijos.add(parteactivofijo);
				}
				
				if(parteactivofijoLogic.getParteActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parteactivofijoLogic.getParteActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parteactivofijoLogic.getParteActivoFijos()==null||parteactivofijoLogic.getParteActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parteactivofijos==null|| parteactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijosAux=new ArrayList<ParteActivoFijo>();
						parteactivofijosAux.addAll(parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijosAux=new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parteactivofijoLogic.getParteActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParteActivoFijos("FK_IdDetalleActivoFijo",parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParteActivoFijos("FK_IdDetalleActivoFijo",parteactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());
						parteactivofijoLogic.getParteActivoFijos().addAll(parteactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijos=new ArrayList<ParteActivoFijo>();
							parteactivofijos.addAll(parteactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parteactivofijoLogic.getParteActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parteactivofijoLogic.getParteActivoFijos()==null||parteactivofijoLogic.getParteActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parteactivofijos==null|| parteactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijosAux=new ArrayList<ParteActivoFijo>();
						parteactivofijosAux.addAll(parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijosAux=new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parteactivofijoLogic.getParteActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParteActivoFijos("FK_IdEmpresa",parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParteActivoFijos("FK_IdEmpresa",parteactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());
						parteactivofijoLogic.getParteActivoFijos().addAll(parteactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijos=new ArrayList<ParteActivoFijo>();
							parteactivofijos.addAll(parteactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoActivoFijo")) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstadoActivoFijo(id_estado_activo_fijoFK_IdEstadoActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parteactivofijoLogic.getParteActivoFijosFK_IdEstadoActivoFijo(finalQueryGlobal,pagination,id_estado_activo_fijoFK_IdEstadoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstadoActivoFijo(id_estado_activo_fijoFK_IdEstadoActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstadoActivoFijo(id_estado_activo_fijoFK_IdEstadoActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parteactivofijoLogic.getParteActivoFijos()==null||parteactivofijoLogic.getParteActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parteactivofijos==null|| parteactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijosAux=new ArrayList<ParteActivoFijo>();
						parteactivofijosAux.addAll(parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijosAux=new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parteactivofijoLogic.getParteActivoFijosFK_IdEstadoActivoFijo(finalQueryGlobal,pagination,id_estado_activo_fijoFK_IdEstadoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstadoActivoFijo(id_estado_activo_fijoFK_IdEstadoActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEstadoActivoFijo(id_estado_activo_fijoFK_IdEstadoActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParteActivoFijos("FK_IdEstadoActivoFijo",parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParteActivoFijos("FK_IdEstadoActivoFijo",parteactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());
						parteactivofijoLogic.getParteActivoFijos().addAll(parteactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijos=new ArrayList<ParteActivoFijo>();
							parteactivofijos.addAll(parteactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parteactivofijoLogic.getParteActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parteactivofijoLogic.getParteActivoFijos()==null||parteactivofijoLogic.getParteActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parteactivofijos==null|| parteactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijosAux=new ArrayList<ParteActivoFijo>();
						parteactivofijosAux.addAll(parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijosAux=new ArrayList<ParteActivoFijo>();
							parteactivofijosAux.addAll(parteactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parteactivofijoLogic.getParteActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParteActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParteActivoFijos("FK_IdSucursal",parteactivofijoLogic.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParteActivoFijos("FK_IdSucursal",parteactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoLogic.setParteActivoFijos(new ArrayList<ParteActivoFijo>());
						parteactivofijoLogic.getParteActivoFijos().addAll(parteactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijos=new ArrayList<ParteActivoFijo>();
							parteactivofijos.addAll(parteactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParteActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParteActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parteactivofijoLogic.getParteActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parteactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parteactivofijoLogic.getParteActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parteactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParteActivoFijo parteactivofijo) {
		Boolean permite=true;
		
		if(this.parteactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParteActivoFijoConstantesFunciones.getOrderByListaParteActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParteActivoFijoConstantesFunciones.getOrderByListaParteActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParteActivoFijo parteactivofijo:parteactivofijoLogic.getParteActivoFijos()) {
				if(parteactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					parteactivofijoTotales=parteactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParteActivoFijo parteactivofijo:this.parteactivofijos) {
				if(parteactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					parteactivofijoTotales=parteactivofijo;
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
			this.parteactivofijoAux=new ParteActivoFijo();
			this.parteactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.parteactivofijoAux.setIsNew(false);
			this.parteactivofijoAux.setIsChanged(false);
			this.parteactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParteActivoFijoConstantesFunciones.TotalizarValoresFilaParteActivoFijo(this.parteactivofijoLogic.getParteActivoFijos(),this.parteactivofijoAux);
				
				this.parteactivofijoLogic.getParteActivoFijos().add(this.parteactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParteActivoFijoConstantesFunciones.TotalizarValoresFilaParteActivoFijo(this.parteactivofijos,this.parteactivofijoAux);
				
				this.parteactivofijos.add(this.parteactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parteactivofijoTotales=new ParteActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parteactivofijoLogic.getParteActivoFijos().remove(parteactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parteactivofijos.remove(parteactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parteactivofijoTotales=new ParteActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParteActivoFijo parteactivofijo:parteactivofijoLogic.getParteActivoFijos()) {
				if(parteactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					parteactivofijoTotales=parteactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParteActivoFijoConstantesFunciones.TotalizarValoresFilaParteActivoFijo(this.parteactivofijoLogic.getParteActivoFijos(),parteactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParteActivoFijo parteactivofijo:this.parteactivofijos) {
				if(parteactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					parteactivofijoTotales=parteactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParteActivoFijoConstantesFunciones.TotalizarValoresFilaParteActivoFijo(this.parteactivofijos,parteactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParteActivoFijosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParteActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParteActivoFijosFK_IdEstadoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParteActivoFijosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParteActivoFijosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLogic.getParteActivoFijosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParteActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLogic.getParteActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParteActivoFijosFK_IdEstadoActivoFijo(String sFinalQuery,Long id_estado_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLogic.getParteActivoFijosFK_IdEstadoActivoFijo(sFinalQuery,this.pagination,id_estado_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParteActivoFijosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLogic.getParteActivoFijosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosParteActivoFijo() {
		this.isPermisoTodoParteActivoFijo=false;
		this.isPermisoNuevoParteActivoFijo=false;
		this.isPermisoActualizarParteActivoFijo=false;
		this.isPermisoActualizarOriginalParteActivoFijo=false;
		this.isPermisoEliminarParteActivoFijo=false;
		this.isPermisoGuardarCambiosParteActivoFijo=false;
		this.isPermisoConsultaParteActivoFijo=false;
		this.isPermisoBusquedaParteActivoFijo=false;
		this.isPermisoReporteParteActivoFijo=false;		
		this.isPermisoOrdenParteActivoFijo=false;		
		this.isPermisoPaginacionMedioParteActivoFijo=false;		
		this.isPermisoPaginacionAltoParteActivoFijo=false;
		this.isPermisoPaginacionTodoParteActivoFijo=false;
		this.isPermisoCopiarParteActivoFijo=false;		
		this.isPermisoVerFormParteActivoFijo=false;		
		this.isPermisoDuplicarParteActivoFijo=false;		
		this.isPermisoOrdenParteActivoFijo=false;		
	}
	
	public void setPermisosUsuarioParteActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoParteActivoFijo=isPermiso;
		this.isPermisoNuevoParteActivoFijo=isPermiso;
		this.isPermisoActualizarParteActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalParteActivoFijo=isPermiso;
		this.isPermisoEliminarParteActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosParteActivoFijo=isPermiso;
		this.isPermisoConsultaParteActivoFijo=isPermiso;
		this.isPermisoBusquedaParteActivoFijo=isPermiso;
		this.isPermisoReporteParteActivoFijo=isPermiso;
		this.isPermisoOrdenParteActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioParteActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoParteActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoParteActivoFijo=isPermiso;		
		this.isPermisoCopiarParteActivoFijo=isPermiso;		
		this.isPermisoVerFormParteActivoFijo=isPermiso;		
		this.isPermisoDuplicarParteActivoFijo=isPermiso;
		this.isPermisoOrdenParteActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParteActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoParteActivoFijo=isPermiso;
		this.isPermisoNuevoParteActivoFijo=isPermiso;
		this.isPermisoActualizarParteActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalParteActivoFijo=isPermiso;
		this.isPermisoEliminarParteActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosParteActivoFijo=isPermiso;
		//this.isPermisoConsultaParteActivoFijo=isPermiso;
		//this.isPermisoBusquedaParteActivoFijo=isPermiso;
		//this.isPermisoReporteParteActivoFijo=isPermiso;
		//this.isPermisoOrdenParteActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioParteActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoParteActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoParteActivoFijo=isPermiso;		
		//this.isPermisoCopiarParteActivoFijo=isPermiso;		
		//this.isPermisoDuplicarParteActivoFijo=isPermiso;
		//this.isPermisoOrdenParteActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParteActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParteActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParteActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParteActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParteActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParteActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParteActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParteActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParteActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParteActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParteActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParteActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParteActivoFijo=this.isPermisoActualizarParteActivoFijo;
			this.isPermisoEliminarParteActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParteActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParteActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParteActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParteActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParteActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParteActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParteActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParteActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParteActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParteActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParteActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParteActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParteActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParteActivoFijo.setToolTipText(this.jTableDatosParteActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParteActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParteActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParteActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParteActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParteActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyParteActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estadoactivofijosForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParteActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParteActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParteActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstadoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoactivofijosForeignKey==null||this.estadoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesEstadoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParteActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParteActivoFijoParameterReturnGeneral parteactivofijoReturnGeneral=new ParteActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parteactivofijoConstantesFunciones.cargarid_empresaParteActivoFijo)
					 || (this.esRecargarFks && this.parteactivofijoConstantesFunciones.cargarid_empresaParteActivoFijo)) {

					if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parteactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parteactivofijoConstantesFunciones.cargarid_sucursalParteActivoFijo)
					 || (this.esRecargarFks && this.parteactivofijoConstantesFunciones.cargarid_sucursalParteActivoFijo)) {

					if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parteactivofijoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstadoActivoFijo="";

				if(((this.estadoactivofijosForeignKey==null||this.estadoactivofijosForeignKey.size()<=0) && this.parteactivofijoConstantesFunciones.cargarid_estado_activo_fijoParteActivoFijo)
					 || (this.esRecargarFks && this.parteactivofijoConstantesFunciones.cargarid_estado_activo_fijoParteActivoFijo)) {

					if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesEstadoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoActivoFijo, "");
						finalQueryGlobalEstadoActivoFijo+=EstadoActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoActivoFijo=" WHERE " + ConstantesSql.ID + "="+parteactivofijoSessionBean.getlidEstadoActivoFijoActual();
					}
				} else {
					finalQueryGlobalEstadoActivoFijo="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.parteactivofijoConstantesFunciones.cargarid_detalle_activo_fijoParteActivoFijo)
					 || (this.esRecargarFks && this.parteactivofijoConstantesFunciones.cargarid_detalle_activo_fijoParteActivoFijo)) {

					if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+parteactivofijoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parteactivofijoReturnGeneral=parteactivofijoLogic.cargarCombosLoteForeignKeyParteActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstadoActivoFijo,finalQueryGlobalDetalleActivoFijo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parteactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parteactivofijoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstadoActivoFijo.equals("NONE")) {
				this.estadoactivofijosForeignKey=parteactivofijoReturnGeneral.getestadoactivofijosForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=parteactivofijoReturnGeneral.getdetalleactivofijosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParteActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstadoActivoFijo();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parteactivofijoSessionBean==null) {
				this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEstadoActivoFijo()throws Exception {
		try {

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoActivoFijo()) {
				EstadoActivoFijo estadoactivofijo=new EstadoActivoFijo();
				EstadoActivoFijoConstantesFunciones.setEstadoActivoFijoDescripcion(estadoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoactivofijo.setId(null);

				if(!EstadoActivoFijoConstantesFunciones.ExisteEnLista(this.estadoactivofijosForeignKey,estadoactivofijo,true)) {

					this.estadoactivofijosForeignKey.add(0,estadoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.parteactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParteActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParteActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParteActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParteActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParteActivoFijo(ParteActivoFijo parteactivofijo)throws Exception {	
		try {
			
			this.setActualEstadoActivoFijoForeignKey(parteactivofijo.getid_estado_activo_fijo(),false,"Formulario");
			this.setActualDetalleActivoFijoForeignKey(parteactivofijo.getid_detalle_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParteActivoFijo(ParteActivoFijo parteactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParteActivoFijo()throws Exception {	
		try {
			
			this.setActualEstadoActivoFijoForeignKey(this.parteactivofijoConstantesFunciones.getid_estado_activo_fijo(),false,"Formulario");
			this.setActualDetalleActivoFijoForeignKey(this.parteactivofijoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParteActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParteActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParteActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParteActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParteActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstadoActivoFijosForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParteActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParteActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ParteActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParteActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParteActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean(); 
		this.parteactivofijoConstantesFunciones=new ParteActivoFijoConstantesFunciones(); 
		this.parteactivofijoBean=new ParteActivoFijo();//(this.parteactivofijoConstantesFunciones); 		
		this.parteactivofijoReturnGeneral=new ParteActivoFijoParameterReturnGeneral(); 
		
		this.parteactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parteactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParteActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParteActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParteActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParteActivoFijo(true);
			
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
			
			this.parteactivofijoConstantesFunciones=new ParteActivoFijoConstantesFunciones(); 
			this.parteactivofijoBean=new ParteActivoFijo();//this.parteactivofijoConstantesFunciones); 			
			this.parteactivofijoReturnGeneral=new ParteActivoFijoParameterReturnGeneral(); 
		
			ParteActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parte Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parteactivofijo=new ParteActivoFijo();
			this.parteactivofijos = new ArrayList<ParteActivoFijo>();
			this.parteactivofijosAux = new ArrayList<ParteActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic=new ParteActivoFijoLogic();
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.parteactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parteactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParteActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParteActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionParteActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParteActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParteActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParteActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParteActivoFijo);
				this.jInternalFrameDetalleFormParteActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormParteActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParteActivoFijo);
					this.jInternalFrameReporteDinamicoParteActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoParteActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParteActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParteActivoFijo);
					this.jInternalFrameImportacionParteActivoFijo.setVisible(false);
					this.jInternalFrameImportacionParteActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParteActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParteActivoFijo);
					this.jInternalFrameOrderByParteActivoFijo.setVisible(false);
					this.jInternalFrameOrderByParteActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParteActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParteActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parteactivofijoReturnGeneral=new ParteActivoFijoParameterReturnGeneral();
			
			this.parteactivofijoParameterGeneral=new ParteActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parteactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParteActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParteActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parteactivofijoSessionBean.getEsGuardarRelacionado(),this.parteactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParteActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parteactivofijoSessionBean.getEsGuardarRelacionado(),this.parteactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaDuplicarParteActivoFijo=true;
			this.isVisibilidadCeldaCopiarParteActivoFijo=true;
			this.isVisibilidadCeldaVerFormParteActivoFijo=true;
			this.isVisibilidadCeldaOrdenParteActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			
			
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoActivoFijo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParteActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParteActivoFijo(false);
			
			this.setPermisosUsuarioParteActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.parteactivofijoSessionBean.getEsGuardarRelacionado() && this.parteactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParteActivoFijoClasesRelacionadas();
			}
			
			if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParteActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParteActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParteActivoFijo();
			}
			
			if(!this.isPermisoBusquedaParteActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParteActivoFijo,this.isPermisoPaginacionMedioParteActivoFijo,this.isPermisoPaginacionTodoParteActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParteActivoFijoConstantesFunciones.getTiposSeleccionarParteActivoFijo());
				
				this.tiposColumnasSelect=ParteActivoFijoConstantesFunciones.getTiposSeleccionarParteActivoFijo(true);
				
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
			//if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParteActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParteActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParteActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParteActivoFijo() ;
			
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
			this.estadoactivofijoLogic=new EstadoActivoFijoLogic();
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parteactivofijoImplementable= (ParteActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParteActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parteactivofijoImplementableHome= (ParteActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParteActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parteactivofijos= new ArrayList<ParteActivoFijo>();
			this.parteactivofijosEliminados= new ArrayList<ParteActivoFijo>();
						
			this.isEsNuevoParteActivoFijo=false;
			this.esParaAccionDesdeFormularioParteActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estadoactivofijosForeignKey=new ArrayList<EstadoActivoFijo>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParteActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParteActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParteActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParteActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParteActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParteActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParteActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParteActivoFijo();
			}
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParteActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParteActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParteActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParteActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParteActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParteActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParteActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParteActivoFijo();	
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
	
	public void cargarCombosForeignKeyParteActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParteActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParteActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParteActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParteActivoFijo();
		
		this.cargarCombosFrameForeignKeyParteActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParteActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParteActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyEstadoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoActivoFijo();
				this.cargarCombosFrameEstadoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoActivoFijo(this.estadoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParteActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			
			if(jTableDatosParteActivoFijo.getRowCount()>=1) {
				jTableDatosParteActivoFijo.removeRowSelectionInterval(0, jTableDatosParteActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoParteActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParteActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParteActivoFijo(true);			
			//this.parteactivofijo=new ParteActivoFijo();
			//this.parteactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParteActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParteActivoFijo() ;
			
			if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParteActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parteactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);				
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParteActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParteActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParteActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParteActivoFijo.getSelectedRows().length;			
			}
			
			parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParteActivoFijo--;			
				//ParteActivoFijo parteactivofijoAux= new ParteActivoFijo();			
				//parteactivofijoAux.setId(this.iIdNuevoParteActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParteActivoFijo parteactivofijoOrigen=new ParteActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParteActivoFijo parteactivofijoOrigen : parteactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parteactivofijoOrigen =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parteactivofijoOrigen =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParteActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parteactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParteActivoFijo(parteactivofijoOrigen,this.parteactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parteactivofijoLogic.getParteActivoFijos().add(this.parteactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parteactivofijos.add(this.parteactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
				
				this.jTableDatosParteActivoFijo.setRowSelectionInterval(this.getIndiceNuevoParteActivoFijo(), this.getIndiceNuevoParteActivoFijo());
				
				int iLastRow =  this.jTableDatosParteActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParteActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParteActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParteActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();									
		
			ParteActivoFijo parteactivofijoOrigen=new ParteActivoFijo();
			ParteActivoFijo parteactivofijoDestino=new ParteActivoFijo();
				
			parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParteActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parteactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParteActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoOrigen =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parteactivofijoOrigen =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parteactivofijoDestino =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parteactivofijoDestino =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parteactivofijoOrigen =parteactivofijosSeleccionados.get(0);
				parteactivofijoDestino =parteactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParteActivoFijo(parteactivofijoOrigen,parteactivofijoDestino,true,false);
				
				parteactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parteactivofijoDestino,parteactivofijoLogic.getParteActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parteactivofijoDestino,parteactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
				
				//this.jTableDatosParteActivoFijo.setRowSelectionInterval(this.getIndiceNuevoParteActivoFijo(), this.getIndiceNuevoParteActivoFijo());
				
				int iLastRow =  this.jTableDatosParteActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParteActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParteActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParteActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParteActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParteActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParteActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParteActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionParteActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesParteActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParteActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParteActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParteActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParteActivoFijo();
			
			this.abrirFrameOrderByParteActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParteActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParteActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParteActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParteActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormParteActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParteActivoFijo.setSize(this.jInternalFrameDetalleFormParteActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormParteActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParteActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParteActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParteActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormParteActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParteActivoFijo.jContentPaneDetalleParteActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParteActivoFijo.jContentPaneDetalleParteActivoFijo.getWidth(),ParteActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParteActivoFijo.jContentPaneDetalleParteActivoFijo.getWidth(),ParteActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParteActivoFijo.jContentPaneDetalleParteActivoFijo.getWidth(),ParteActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParteActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormParteActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParteActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParteActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParteActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParteActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByParteActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParteActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParteActivoFijo);
				this.jInternalFrameOrderByParteActivoFijo.setVisible(false);
				this.jInternalFrameOrderByParteActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByParteActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParteActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByParteActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParteActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParteActivoFijo==null) {
				
				this.jInternalFrameImportacionParteActivoFijo=new ImportacionJInternalFrame(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParteActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParteActivoFijo);
				this.jInternalFrameImportacionParteActivoFijo.setVisible(false);
				this.jInternalFrameImportacionParteActivoFijo.setSelected(false);


				this.jInternalFrameImportacionParteActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParteActivoFijo"));
				this.jInternalFrameImportacionParteActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParteActivoFijo"));
				this.jInternalFrameImportacionParteActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParteActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParteActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParteActivoFijo==null) {
				this.jInternalFrameReporteDinamicoParteActivoFijo=new ReporteDinamicoJInternalFrame(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParteActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParteActivoFijo);
				this.jInternalFrameReporteDinamicoParteActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoParteActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParteActivoFijo"));
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParteActivoFijo"));
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParteActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParteActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParteActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParteActivoFijo);
			
	       	this.jInternalFrameDetalleFormParteActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormParteActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormParteActivoFijo.dispose();
			//this.jInternalFrameDetalleFormParteActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParteActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParteActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoParteActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParteActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParteActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionParteActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParteActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParteActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByParteActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParteActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParteActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByParteActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParteActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParteActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoParteActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParteActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParteActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionParteActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParteActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParteActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParteActivoFijo(true);
			//this.isEsNuevoParteActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParteActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParteActivoFijo(false) ;
			
			if(parteactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParteActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParteActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParteActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParteActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParteActivoFijo(true);
			//this.isEsNuevoParteActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parteactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParteActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParteActivoFijo(false) ;
			
			if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParteActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParteActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstadoActivoFijo(List<EstadoActivoFijo> estadoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnEstadoActivoFijo=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO));
		TableCellEditor tableCellEditorEstadoActivoFijo =tableColumnEstadoActivoFijo.getCellEditor();

		EstadoActivoFijoTableCell estadoactivofijoTableCellFk=(EstadoActivoFijoTableCell)tableCellEditorEstadoActivoFijo;

		if(estadoactivofijoTableCellFk!=null) {
			estadoactivofijoTableCellFk.setestadoactivofijosForeignKey(estadoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParteActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//estadoactivofijoTableCellFk.setestadoactivofijosForeignKeyActual(estadoactivofijosForeignKey);
		//}


		if(estadoactivofijoTableCellFk!=null) {
			estadoactivofijoTableCellFk.RecargarEstadoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParteActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParteActivoFijo(false);
			
			//if(!this.isEsNuevoParteActivoFijo) {								
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.parteactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParteActivoFijo=true;
					this.inicializarActualizarBindingTablaParteActivoFijo(false);
					this.isEsNuevoParteActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParteActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParteActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParteActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParteActivoFijo(false);
				
				this.habilitarDeshabilitarControlesParteActivoFijo(false);
			
												
				
				if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParteActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParteActivoFijoActionPerformed(evt,parteactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParteActivoFijo(this.parteactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParteActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parteactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parteactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.parteactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.parteactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parteactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParteActivoFijoModel) this.jTableDatosParteActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParteActivoFijo=true;
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
				this.isEsNuevoParteActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParteActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParteActivoFijo(false);
				
				this.habilitarDeshabilitarControlesParteActivoFijo(false);
				
				
				
				if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParteActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParteActivoFijo.getRowCount()>=1) {
				jTableDatosParteActivoFijo.removeRowSelectionInterval(0, jTableDatosParteActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParteActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParteActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParteActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParteActivoFijo(false) ;
			
			this.isEsNuevoParteActivoFijo=false;
			
			if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParteActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParteActivoFijo(false);
				
				//SI ES MANUAL
				if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParteActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParteActivoFijo--;			
			//ParteActivoFijo parteactivofijoAux= new ParteActivoFijo();			
			//parteactivofijoAux.setId(this.iIdNuevoParteActivoFijo);
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParteActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
			
			this.parteactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parteactivofijoLogic.getParteActivoFijos().add(this.parteactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parteactivofijos.add(this.parteactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParteActivoFijo(false);
			
			this.jTableDatosParteActivoFijo.setRowSelectionInterval(this.getIndiceNuevoParteActivoFijo(), this.getIndiceNuevoParteActivoFijo());
			
			int iLastRow =  this.jTableDatosParteActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParteActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParteActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParteActivoFijo(false);
			
			//SI ES MANUAL
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParteActivoFijo();
			}
			
			//this.abrirFrameTreeParteActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parte Activo FijoS ?", "MANTENIMIENTO DE Parte Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParteActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParteActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parteactivofijoReturnGeneral=parteactivofijoLogic.procesarImportacionParteActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parteactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParteActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParteActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParteActivoFijo.setFileImportacion(this.jInternalFrameImportacionParteActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParteActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParteActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParteActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParteActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		

		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParteActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParteActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParteActivoFijoConstantesFunciones.LABEL_FOTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_to_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_to_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_to_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_to_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParteActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO:
					sNombreCampoCategoria="id_estado_activo_fijo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_FOTO:
					sNombreCampoCategoria="foto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_estado_activo_fijo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_FOTO:
					sNombreCampoCategoriaValor="foto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_activo_fijo");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_FOTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Foto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"foto");
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
	
	public void jButtonGenerarExcelReporteDinamicoParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParteActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getestadoactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParteActivoFijoConstantesFunciones.LABEL_FOTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_FOTO);
					iRow++;

					for(ParteActivoFijo parteactivofijo:parteactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parteactivofijo.getfoto());
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
			//	this.getFilaCabeceraExportarExcelParteActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParteActivoFijo(parteactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParteActivoFijo(false);
			
			//SI ES MANUAL
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParteActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParteActivoFijo(false);
			
			//SI ES MANUAL
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParteActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParteActivoFijo(false);
			
			//SI ES MANUAL
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParteActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParteActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParteActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParteActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParteActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParteActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParteActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosParteActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosParteActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParteActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParteActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParteActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParteActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParteActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParteActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParteActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParteActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParteActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParteActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualParteActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParteActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParteActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParteActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParteActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParteActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParteActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParteActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionNuevoParteActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionSinCerrarParteActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionSinMensajeParteActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParteActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParteActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParteActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
				this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionNuevoParteActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionSinCerrarParteActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParteActivoFijo.jCheckBoxPostAccionSinMensajeParteActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParteActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParteActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParteActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParteActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParteActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParteActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParteActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParteActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParteActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParteActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParteActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParteActivoFijo() throws Exception {
		try	{
			if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParteActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParteActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParteActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParteActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParteActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParteActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParteActivoFijo.addItem(reporte);
			}
			
			
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParteActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParteActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParteActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParteActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParteActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParteActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParteActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParteActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParteActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParteActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParteActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParteActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.getSelectedItem()!=null){this.id_estado_activo_fijoFK_IdEstadoActivoFijo=((EstadoActivoFijo)this.jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParteActivoFijo(Boolean esInicializar) throws Exception {				
		if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParteActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParteActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaParteActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParteActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParteActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParteActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parteactivofijoLogic.getParteActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parteactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParteActivoFijo.setModel(new ParteActivoFijoModel(this.parteactivofijoLogic.getParteActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParteActivoFijo.setModel(new ParteActivoFijoModel(this.parteactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParteActivoFijo!=null && this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParteActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,parteactivofijoConstantesFunciones.resaltarSeleccionarParteActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,parteactivofijoConstantesFunciones.resaltarSeleccionarParteActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_ID));

		if(this.parteactivofijoConstantesFunciones.mostraridParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parteactivofijoConstantesFunciones.resaltaridParteActivoFijo,this.parteactivofijoConstantesFunciones.activaridParteActivoFijo,this,true,"idParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltaridParteActivoFijo,this.parteactivofijoConstantesFunciones.activaridParteActivoFijo,this,true,"idParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parteactivofijoConstantesFunciones.mostrarid_empresaParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_empresaParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_empresaParteActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_empresaParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_empresaParteActivoFijo,false,"id_empresaParteActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parteactivofijoConstantesFunciones.mostrarid_sucursalParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_sucursalParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_sucursalParteActivoFijo));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_sucursalParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_sucursalParteActivoFijo,false,"id_sucursalParteActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO));

		if(this.parteactivofijoConstantesFunciones.mostrarid_estado_activo_fijoParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoActivoFijoTableCell(this.estadoactivofijosForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_estado_activo_fijoParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_estado_activo_fijoParteActivoFijo));
			tableColumn.setCellEditor(new EstadoActivoFijoTableCell(this.estadoactivofijosForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_estado_activo_fijoParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_estado_activo_fijoParteActivoFijo,true,"id_estado_activo_fijoParteActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.parteactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_detalle_activo_fijoParteActivoFijo));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.parteactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoParteActivoFijo,this,this.parteactivofijoConstantesFunciones.activarid_detalle_activo_fijoParteActivoFijo,true,"id_detalle_activo_fijoParteActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_CODIGO));

		if(this.parteactivofijoConstantesFunciones.mostrarcodigoParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parteactivofijoConstantesFunciones.resaltarcodigoParteActivoFijo,this.parteactivofijoConstantesFunciones.activarcodigoParteActivoFijo,this,true,"codigoParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarcodigoParteActivoFijo,this.parteactivofijoConstantesFunciones.activarcodigoParteActivoFijo,this,true,"codigoParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.parteactivofijoConstantesFunciones.mostrarnombreParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parteactivofijoConstantesFunciones.resaltarnombreParteActivoFijo,this.parteactivofijoConstantesFunciones.activarnombreParteActivoFijo,this,true,"nombreParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarnombreParteActivoFijo,this.parteactivofijoConstantesFunciones.activarnombreParteActivoFijo,this,true,"nombreParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_MARCA));

		if(this.parteactivofijoConstantesFunciones.mostrarmarcaParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parteactivofijoConstantesFunciones.resaltarmarcaParteActivoFijo,this.parteactivofijoConstantesFunciones.activarmarcaParteActivoFijo,this,true,"marcaParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarmarcaParteActivoFijo,this.parteactivofijoConstantesFunciones.activarmarcaParteActivoFijo,this,true,"marcaParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_SERIE));

		if(this.parteactivofijoConstantesFunciones.mostrarserieParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parteactivofijoConstantesFunciones.resaltarserieParteActivoFijo,this.parteactivofijoConstantesFunciones.activarserieParteActivoFijo,this,true,"serieParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarserieParteActivoFijo,this.parteactivofijoConstantesFunciones.activarserieParteActivoFijo,this,true,"serieParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD));

		if(this.parteactivofijoConstantesFunciones.mostrarcantidadParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parteactivofijoConstantesFunciones.resaltarcantidadParteActivoFijo,this.parteactivofijoConstantesFunciones.activarcantidadParteActivoFijo,this,true,"cantidadParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarcantidadParteActivoFijo,this.parteactivofijoConstantesFunciones.activarcantidadParteActivoFijo,this,true,"cantidadParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,ParteActivoFijoConstantesFunciones.LABEL_FOTO));

		if(this.parteactivofijoConstantesFunciones.mostrarfotoParteActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParteActivoFijoConstantesFunciones.LABEL_FOTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parteactivofijoConstantesFunciones.resaltarfotoParteActivoFijo,this.parteactivofijoConstantesFunciones.activarfotoParteActivoFijo,this,true,"fotoParteActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parteactivofijoConstantesFunciones.resaltarfotoParteActivoFijo,this.parteactivofijoConstantesFunciones.activarfotoParteActivoFijo,this,true,"fotoParteActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParteActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParteActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParteActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parteactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParteActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosParteActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParteActivoFijo.moveColumn(this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParteActivoFijo.moveColumn(this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParteActivoFijo.moveColumn(this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParteActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParteActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParteActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParteActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParteActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParteActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParteActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parteactivofijoLogic.getParteActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parteactivofijos.size()-1;
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
		//this.jTableDatosParteActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParteActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParteActivoFijo();
			
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
				
				//this.isEsNuevoParteActivoFijo=false;
					
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
				if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParteActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParteActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParteActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parteactivofijo.getsType().equals("DUPLICADO")
				   || this.parteactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParteActivoFijo=true;
				
				} else {
					this.isEsNuevoParteActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.parteactivofijo.getId()>=0 && !this.parteactivofijo.getIsNew()) {						
						this.isEsNuevoParteActivoFijo=false;
						
					} else {
						this.isEsNuevoParteActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParteActivoFijo(esRelaciones);						
				
				this.seleccionarParteActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parteactivofijo.getId()<0) {
					this.isEsNuevoParteActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParteActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParteActivoFijo(evt,rowIndex);
				}	
				
				if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParteActivoFijo: " + this.dDif); 
					}
				}								
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParteActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parteactivofijo)) {
					if(this.parteactivofijo.getId()>0) {
						this.parteactivofijo.setIsDeleted(true);
						
						this.parteactivofijosEliminados.add(this.parteactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parteactivofijoLogic.getParteActivoFijos().remove(this.parteactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parteactivofijos.remove(this.parteactivofijo);				
					}
					
					
					((ParteActivoFijoModel) this.jTableDatosParteActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParteActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParteActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParteActivoFijo) {
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParteActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParteActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParteActivoFijo(this.parteactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parteactivofijoConstantesFunciones.cargarid_empresaParteActivoFijo || this.parteactivofijoConstantesFunciones.event_dependid_empresaParteActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parteactivofijo.getid_empresa());
									//this.inicializarActualizarBindingParteActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parteactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(parteactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parteactivofijo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parteactivofijoConstantesFunciones.cargarid_sucursalParteActivoFijo || this.parteactivofijoConstantesFunciones.event_dependid_sucursalParteActivoFijo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parteactivofijo.getid_sucursal());
									//this.inicializarActualizarBindingParteActivoFijo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parteactivofijo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parteactivofijo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parteactivofijo.getid_sucursal(),false,"Formulario");

					//EstadoActivoFijo
					if(!this.parteactivofijoConstantesFunciones.cargarid_estado_activo_fijoParteActivoFijo || this.parteactivofijoConstantesFunciones.event_dependid_estado_activo_fijoParteActivoFijo) {
						//this.cargarCombosEstadoActivoFijosForeignKeyLista(" where id="+this.parteactivofijo.getid_estado_activo_fijo());
									//this.inicializarActualizarBindingParteActivoFijo(false,false);
						this.estadoactivofijosForeignKey=new ArrayList<EstadoActivoFijo>();

						if(parteactivofijo.getEstadoActivoFijo()!=null) {
							this.estadoactivofijosForeignKey.add(parteactivofijo.getEstadoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyEstadoActivoFijo();
						this.cargarCombosFrameEstadoActivoFijosForeignKey("Todos");
					}
					this.setActualEstadoActivoFijoForeignKey(this.parteactivofijo.getid_estado_activo_fijo(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.parteactivofijoConstantesFunciones.cargarid_detalle_activo_fijoParteActivoFijo || this.parteactivofijoConstantesFunciones.event_dependid_detalle_activo_fijoParteActivoFijo) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.parteactivofijo.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingParteActivoFijo(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(parteactivofijo.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(parteactivofijo.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.parteactivofijo.getid_detalle_activo_fijo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParteActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParteActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParteActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParteActivoFijo(ParteActivoFijo parteactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParteActivoFijo(parteactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParteActivoFijo(ParteActivoFijo parteactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParteActivoFijo(parteactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParteActivoFijo(parteactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParteActivoFijo(parteactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioParteActivoFijo(ParteActivoFijo parteactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setText(parteactivofijo.getId().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setText(parteactivofijo.getcodigo());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setText(parteactivofijo.getnombre());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setText(parteactivofijo.getmarca());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setText(parteactivofijo.getserie());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setText(parteactivofijo.getcantidad().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setText(parteactivofijo.getfoto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParteActivoFijo parteactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parteactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParteActivoFijo parteactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parteactivofijoLocal=this.parteactivofijo;
			} else {
				parteactivofijoLocal=this.parteactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parteactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParteActivoFijo(parteactivofijoLocal,true);
					
					if(parteactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parteactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parteactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParteActivoFijo(ParteActivoFijo parteactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParteActivoFijo(parteactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(parteactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualParteActivoFijo(ParteActivoFijo parteactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParteActivoFijo(parteactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParteActivoFijo(ParteActivoFijo parteactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.getText()==null || this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.getText()=="" || this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setText("0");
			}

			if(conColumnasBase) {parteactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelIdParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setcodigo(this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcodigoParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setnombre(this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelnombreParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setmarca(this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelmarcaParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setserie(this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelserieParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelcantidadParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parteactivofijo.setfoto(this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParteActivoFijoConstantesFunciones.LABEL_FOTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParteActivoFijo.jLabelfotoParteActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParteActivoFijo(ParteActivoFijo parteactivofijoBean,ParteActivoFijo parteactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parteactivofijoBean.getid_estado_activo_fijo()!=null && !parteactivofijoBean.getid_estado_activo_fijo().equals(-1L))) {parteactivofijo.setid_estado_activo_fijo(parteactivofijoBean.getid_estado_activo_fijo());}
			if(conDefault || (!conDefault && parteactivofijoBean.getid_detalle_activo_fijo()!=null && !parteactivofijoBean.getid_detalle_activo_fijo().equals(-1L))) {parteactivofijo.setid_detalle_activo_fijo(parteactivofijoBean.getid_detalle_activo_fijo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParteActivoFijo(ParteActivoFijo parteactivofijoOrigen,ParteActivoFijo parteactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parteactivofijoOrigen.getId()!=null && !parteactivofijoOrigen.getId().equals(0L))) {parteactivofijo.setId(parteactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getid_estado_activo_fijo()!=null && !parteactivofijoOrigen.getid_estado_activo_fijo().equals(-1L))) {parteactivofijo.setid_estado_activo_fijo(parteactivofijoOrigen.getid_estado_activo_fijo());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getid_detalle_activo_fijo()!=null && !parteactivofijoOrigen.getid_detalle_activo_fijo().equals(-1L))) {parteactivofijo.setid_detalle_activo_fijo(parteactivofijoOrigen.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getcodigo()!=null && !parteactivofijoOrigen.getcodigo().equals(""))) {parteactivofijo.setcodigo(parteactivofijoOrigen.getcodigo());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getnombre()!=null && !parteactivofijoOrigen.getnombre().equals(""))) {parteactivofijo.setnombre(parteactivofijoOrigen.getnombre());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getmarca()!=null && !parteactivofijoOrigen.getmarca().equals(""))) {parteactivofijo.setmarca(parteactivofijoOrigen.getmarca());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getserie()!=null && !parteactivofijoOrigen.getserie().equals(""))) {parteactivofijo.setserie(parteactivofijoOrigen.getserie());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getcantidad()!=null && !parteactivofijoOrigen.getcantidad().equals(0))) {parteactivofijo.setcantidad(parteactivofijoOrigen.getcantidad());}
			if(conDefault || (!conDefault && parteactivofijoOrigen.getfoto()!=null && !parteactivofijoOrigen.getfoto().equals(""))) {parteactivofijo.setfoto(parteactivofijoOrigen.getfoto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParteActivoFijo(ParteActivoFijo parteactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setText(parteactivofijo.getId().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setText(parteactivofijo.getcodigo());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setText(parteactivofijo.getnombre());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setText(parteactivofijo.getmarca());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setText(parteactivofijo.getserie());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setText(parteactivofijo.getcantidad().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setText(parteactivofijo.getfoto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParteActivoFijo(ParteActivoFijoBean parteactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setText(parteactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setText(parteactivofijoBean.getcodigo());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setText(parteactivofijoBean.getnombre());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setText(parteactivofijoBean.getmarca());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setText(parteactivofijoBean.getserie());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setText(parteactivofijoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setText(parteactivofijoBean.getfoto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParteActivoFijo(ParteActivoFijoParameterReturnGeneral parteactivofijoReturnGeneral,ParteActivoFijoBean parteactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			ParteActivoFijo parteactivofijoLocal=new ParteActivoFijo();
			
			parteactivofijoLocal=parteactivofijoReturnGeneral.getParteActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parteactivofijoLocal.getId()!=null && !parteactivofijoLocal.getId().equals(0L))) {parteactivofijoBean.setId(parteactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && parteactivofijoLocal.getid_estado_activo_fijo()!=null && !parteactivofijoLocal.getid_estado_activo_fijo().equals(-1L))) {parteactivofijoBean.setid_estado_activo_fijo(parteactivofijoLocal.getid_estado_activo_fijo());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getid_detalle_activo_fijo()!=null && !parteactivofijoLocal.getid_detalle_activo_fijo().equals(-1L))) {parteactivofijoBean.setid_detalle_activo_fijo(parteactivofijoLocal.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getcodigo()!=null && !parteactivofijoLocal.getcodigo().equals(""))) {parteactivofijoBean.setcodigo(parteactivofijoLocal.getcodigo());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getnombre()!=null && !parteactivofijoLocal.getnombre().equals(""))) {parteactivofijoBean.setnombre(parteactivofijoLocal.getnombre());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getmarca()!=null && !parteactivofijoLocal.getmarca().equals(""))) {parteactivofijoBean.setmarca(parteactivofijoLocal.getmarca());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getserie()!=null && !parteactivofijoLocal.getserie().equals(""))) {parteactivofijoBean.setserie(parteactivofijoLocal.getserie());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getcantidad()!=null && !parteactivofijoLocal.getcantidad().equals(0))) {parteactivofijoBean.setcantidad(parteactivofijoLocal.getcantidad());}
			if(conDefault || (!conDefault && parteactivofijoLocal.getfoto()!=null && !parteactivofijoLocal.getfoto().equals(""))) {parteactivofijoBean.setfoto(parteactivofijoLocal.getfoto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParteActivoFijoGenerico(Long idParteActivoFijoSeleccionado,JComboBox jComboBoxParteActivoFijo,List<ParteActivoFijo> parteactivofijosLocal)throws Exception {
		try {
			ParteActivoFijo  parteactivofijoTemp=null;

			for(ParteActivoFijo parteactivofijoAux:parteactivofijosLocal) {
				if(parteactivofijoAux.getId()!=null && parteactivofijoAux.getId().equals(idParteActivoFijoSeleccionado)) {
					parteactivofijoTemp=parteactivofijoAux;
					break;
				}
			}

			jComboBoxParteActivoFijo.setSelectedItem(parteactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParteActivoFijoGenerico(JComboBox jComboBoxParteActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParteActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParteActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParteActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParteActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParteActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParteActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parteactivofijo=(ParteActivoFijo) parteactivofijoLogic.getParteActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parteactivofijo =(ParteActivoFijo) parteactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parteactivofijo.getIsNew() && !parteactivofijo.getIsChanged() && !parteactivofijo.getIsDeleted()) {
				sDescripcion=parteactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parteactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parteactivofijo.getIsNew() && !parteactivofijo.getIsChanged() && !parteactivofijo.getIsDeleted()) {
				sDescripcion=parteactivofijo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parteactivofijo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("EstadoActivoFijo")) {
			//sDescripcion=this.getActualEstadoActivoFijoForeignKeyDescripcion((Long)value);
			if(!parteactivofijo.getIsNew() && !parteactivofijo.getIsChanged() && !parteactivofijo.getIsDeleted()) {
				sDescripcion=parteactivofijo.getestadoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=parteactivofijo.getestadoactivofijo_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!parteactivofijo.getIsNew() && !parteactivofijo.getIsChanged() && !parteactivofijo.getIsDeleted()) {
				sDescripcion=parteactivofijo.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=parteactivofijo.getdetalleactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParteActivoFijo parteactivofijoRow=new ParteActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parteactivofijoRow=(ParteActivoFijo) parteactivofijoLogic.getParteActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parteactivofijoRow=(ParteActivoFijo) parteactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParteActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo));			
			this.jButtonDuplicarParteActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarParteActivoFijo && this.isPermisoDuplicarParteActivoFijo));			
			this.jButtonCopiarParteActivoFijo.setVisible((this.isVisibilidadCeldaCopiarParteActivoFijo && this.isPermisoCopiarParteActivoFijo));
			this.jButtonVerFormParteActivoFijo.setVisible((this.isVisibilidadCeldaVerFormParteActivoFijo && this.isPermisoVerFormParteActivoFijo));
			
			this.jButtonAbrirOrderByParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));			
			
			this.jButtonNuevoRelacionesParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo && this.isPermisoNuevoParteActivoFijo));			
			this.jButtonNuevoGuardarCambiosParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarParteActivoFijo.setVisible((this.isVisibilidadCeldaModificarParteActivoFijo && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.setVisible((this.isVisibilidadCeldaActualizarParteActivoFijo && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.setVisible((this.isVisibilidadCeldaEliminarParteActivoFijo && this.isPermisoEliminarParteActivoFijo));
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.setVisible(this.isVisibilidadCeldaCancelarParteActivoFijo);							
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo));						
			this.jButtonDuplicarToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarParteActivoFijo && this.isPermisoDuplicarParteActivoFijo));						
			this.jButtonCopiarToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaCopiarParteActivoFijo && this.isPermisoCopiarParteActivoFijo));			
			this.jButtonVerFormToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaVerFormParteActivoFijo && this.isPermisoVerFormParteActivoFijo));			
			this.jButtonAbrirOrderByToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));
			this.jButtonNuevoRelacionesToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo && this.isPermisoNuevoParteActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));			
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaModificarParteActivoFijo && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaActualizarParteActivoFijo  && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaEliminarParteActivoFijo && this.isPermisoEliminarParteActivoFijo));
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarToolBarParteActivoFijo.setVisible(this.isVisibilidadCeldaCancelarParteActivoFijo);				
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo));			
			this.jMenuItemDuplicarParteActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarParteActivoFijo && this.isPermisoDuplicarParteActivoFijo));			
			this.jMenuItemCopiarParteActivoFijo.setVisible((this.isVisibilidadCeldaCopiarParteActivoFijo && this.isPermisoCopiarParteActivoFijo));			
			this.jMenuItemVerFormParteActivoFijo.setVisible((this.isVisibilidadCeldaVerFormParteActivoFijo && this.isPermisoVerFormParteActivoFijo));			
			this.jMenuItemAbrirOrderByParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));			
			//this.jMenuItemMostrarOcultarParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));
			this.jMenuItemDetalleAbrirOrderByParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarParteActivoFijo.setVisible((this.isVisibilidadCeldaOrdenParteActivoFijo && this.isPermisoOrdenParteActivoFijo));			
			this.jMenuItemNuevoRelacionesParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo && this.isPermisoNuevoParteActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosParteActivoFijo.setVisible((this.isVisibilidadCeldaNuevoParteActivoFijo && this.isPermisoNuevoParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));									
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemModificarParteActivoFijo.setVisible((this.isVisibilidadCeldaModificarParteActivoFijo && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemActualizarParteActivoFijo.setVisible((this.isVisibilidadCeldaActualizarParteActivoFijo && this.isPermisoActualizarParteActivoFijo));	
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemEliminarParteActivoFijo.setVisible((this.isVisibilidadCeldaEliminarParteActivoFijo && this.isPermisoEliminarParteActivoFijo));
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemCancelarParteActivoFijo.setVisible(this.isVisibilidadCeldaCancelarParteActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));						
			this.jMenuItemGuardarCambiosTablaParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParteActivoFijo=this.jButtonNuevoParteActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarParteActivoFijo=this.jButtonDuplicarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarParteActivoFijo=this.jButtonCopiarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormParteActivoFijo=this.jButtonVerFormParteActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenParteActivoFijo=this.jButtonAbrirOrderByParteActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=this.jButtonNuevoRelacionesParteActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarParteActivoFijo=this.jButtonModificarParteActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=this.jButtonGuardarCambiosTablaParteActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParteActivoFijo=this.jButtonNuevoToolBarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=this.jButtonNuevoRelacionesToolBarParteActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.isVisibilidadCeldaModificarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarToolBarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarToolBarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarToolBarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarToolBarParteActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParteActivoFijo=this.jButtonGuardarCambiosToolBarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=this.jButtonGuardarCambiosTablaToolBarParteActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParteActivoFijo=this.jMenuItemNuevoParteActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=this.jMenuItemNuevoRelacionesParteActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.isVisibilidadCeldaModificarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemModificarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemActualizarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemEliminarParteActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarParteActivoFijo=this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemCancelarParteActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParteActivoFijo=this.jMenuItemGuardarCambiosParteActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=this.jMenuItemGuardarCambiosTablaParteActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParteActivoFijo(Boolean esInicializar) {
		if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParteActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualParteActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParteActivoFijo() {
		this.jButtonNuevoParteActivoFijo.setVisible(this.isPermisoNuevoParteActivoFijo);			
		this.jButtonDuplicarParteActivoFijo.setVisible(this.isPermisoDuplicarParteActivoFijo);			
		this.jButtonCopiarParteActivoFijo.setVisible(this.isPermisoCopiarParteActivoFijo);			
		this.jButtonVerFormParteActivoFijo.setVisible(this.isPermisoVerFormParteActivoFijo);			
		
		this.jButtonAbrirOrderByParteActivoFijo.setVisible(this.isPermisoOrdenParteActivoFijo);					
		
		this.jButtonNuevoRelacionesParteActivoFijo.setVisible(this.isPermisoNuevoParteActivoFijo);			
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarParteActivoFijo.setVisible(this.isPermisoActualizarParteActivoFijo);	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.setVisible(this.isPermisoActualizarParteActivoFijo);	
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.setVisible(this.isPermisoEliminarParteActivoFijo);
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.setVisible(this.isVisibilidadCeldaCancelarParteActivoFijo);						
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.setVisible(this.isPermisoGuardarCambiosParteActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.setVisible(this.isPermisoActualizarParteActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParteActivoFijo() {
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarParteActivoFijo.setVisible(this.isPermisoActualizarParteActivoFijo);	
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.setVisible(this.isPermisoActualizarParteActivoFijo);	
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.setVisible(this.isPermisoEliminarParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.setVisible(this.isVisibilidadCeldaCancelarParteActivoFijo);							
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.setVisible((this.isVisibilidadCeldaGuardarParteActivoFijo && this.isPermisoGuardarCambiosParteActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParteActivoFijo() {
		if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParteActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParteActivoFijo() {
	}
	
	public void jTableDatosParteActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParteActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parteactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParteActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParteActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParteActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParteActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parteactivofijoLogic.getConnexion());

				if(this.parteactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parteactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParteActivoFijo=(TitledBorder)this.jScrollPanelDatosParteActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParteActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parteactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParteActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParteActivoFijo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParteActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParteActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parteactivofijoLogic.getConnexion());

				if(this.parteactivofijo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parteactivofijo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParteActivoFijo=(TitledBorder)this.jScrollPanelDatosParteActivoFijo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParteActivoFijo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parteactivofijo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_activo_fijoParteActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoactivofijo=true;

			idTienePermisoestadoactivofijo=this.tienePermisosUsuarioEnPaginaWebParteActivoFijo(EstadoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParteActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParteActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);

				this.estadoactivofijoBeanSwingJInternalFrame=new EstadoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoactivofijoBeanSwingJInternalFrame.getEstadoActivoFijoLogic().setConnexion(this.parteactivofijoLogic.getConnexion());

				if(this.parteactivofijo.getid_estado_activo_fijo()!=null) {
					this.estadoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoactivofijoBeanSwingJInternalFrame.setIdActual(this.parteactivofijo.getid_estado_activo_fijo());
					this.estadoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.estadoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParteActivoFijo=(TitledBorder)this.jScrollPanelDatosParteActivoFijo.getBorder();
				TitledBorder titledBorderestadoactivofijo=(TitledBorder)this.estadoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosEstadoActivoFijo.getBorder();

				titledBorderestadoactivofijo.setTitle(titledBorderParteActivoFijo.getTitle() + " -> Estado Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_activo_fijoParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getid_estado_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_activo_fijo = "+this.parteactivofijo.getid_estado_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoParteActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebParteActivoFijo(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParteActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParteActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.parteactivofijoLogic.getConnexion());

				if(this.parteactivofijo.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.parteactivofijo.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParteActivoFijo=(TitledBorder)this.jScrollPanelDatosParteActivoFijo.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderParteActivoFijo.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.parteactivofijo.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.parteactivofijo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.parteactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.parteactivofijo.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.parteactivofijo.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.parteactivofijo.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfotoParteActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.getparteactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parteactivofijo==null) {
						this.parteactivofijo = new ParteActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);
				}

				if(this.parteactivofijo.getfoto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where foto like '%"+this.parteactivofijo.getfoto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParteActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleActivoFijoParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParteActivoFijo(false,false);

			this.getParteActivoFijosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingParteActivoFijo(false);

			//if(ParteActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParteActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParteActivoFijo(false,false);

			this.getParteActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingParteActivoFijo(false);

			//if(ParteActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParteActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoActivoFijoParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParteActivoFijo(false,false);

			this.getParteActivoFijosFK_IdEstadoActivoFijo();

			this.inicializarActualizarBindingParteActivoFijo(false);

			//if(ParteActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParteActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParteActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParteActivoFijo(false,false);

			this.getParteActivoFijosFK_IdSucursal();

			this.inicializarActualizarBindingParteActivoFijo(false);

			//if(ParteActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParteActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parteactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParteActivoFijo() {
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
			this.jInternalFrameDetalleFormParteActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormParteActivoFijo.dispose();
			this.jInternalFrameDetalleFormParteActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoParteActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParteActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoParteActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionParteActivoFijo!=null) {
			this.jInternalFrameImportacionParteActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionParteActivoFijo.dispose();
			this.jInternalFrameImportacionParteActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParteActivoFijo();
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParteActivoFijo")) {
				jButtonDuplicarParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParteActivoFijo")) {
				jButtonCopiarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParteActivoFijo")) {
				jButtonVerFormParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParteActivoFijo")) {
				jButtonDuplicarParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParteActivoFijo")) {
				jButtonDuplicarParteActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParteActivoFijo")) {
				jButtonModificarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParteActivoFijo")) {
				jButtonModificarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParteActivoFijo")) {
				jButtonModificarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParteActivoFijo")) {
				jButtonActualizarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParteActivoFijo")) {
				jButtonActualizarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParteActivoFijo")) {
				jButtonActualizarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParteActivoFijo")) {
				jButtonEliminarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParteActivoFijo")) {
				jButtonEliminarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParteActivoFijo")) {
				jButtonEliminarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParteActivoFijo")) {
				jButtonCancelarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParteActivoFijo")) {
				jButtonCancelarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParteActivoFijo")) {
				jButtonCancelarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParteActivoFijo")) {
				jButtonCerrarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParteActivoFijo")) {
				jButtonCerrarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParteActivoFijo")) {
				jButtonCerrarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParteActivoFijo")) {
				jButtonMostrarOcultarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParteActivoFijo")) {
				jButtonCancelarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParteActivoFijo")) {
				jButtonCopiarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParteActivoFijo")) {
				jButtonVerFormParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParteActivoFijo")) {
				jButtonCopiarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParteActivoFijo")) {
				jButtonVerFormParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParteActivoFijo")) {
				jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParteActivoFijo")) {
				jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParteActivoFijo")) {
				jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParteActivoFijo")) {
				jButtonAnterioresParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParteActivoFijo")) {
				jButtonAnterioresParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParteActivoFijo")) {
				jButtonAnterioresParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParteActivoFijo")) {
				jButtonSiguientesParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParteActivoFijo")) {
				jButtonSiguientesParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParteActivoFijo")) {
				jButtonSiguientesParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParteActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByParteActivoFijo")) {
				jButtonAbrirOrderByParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParteActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarParteActivoFijo")) {
				jButtonMostrarOcultarParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParteActivoFijo")) {
				jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParteActivoFijo")) {
				jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParteActivoFijo")) {
				jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParteActivoFijo")) {
				jButtonCerrarReporteDinamicoParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParteActivoFijo")) {
				jButtonGenerarReporteDinamicoParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParteActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParteActivoFijo")) {
				jButtonCerrarImportacionParteActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParteActivoFijo")) {
				
				jButtonGenerarImportacionParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParteActivoFijo")) {
				
				jButtonAbrirImportacionParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParteActivoFijo")) {
				jComboBoxTiposAccionesParteActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParteActivoFijo")) {
				jComboBoxTiposRelacionesParteActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParteActivoFijo")) {
				jComboBoxTiposAccionesParteActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParteActivoFijo")) {
				
				jComboBoxTiposSeleccionarParteActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParteActivoFijo")) {
				jTextFieldValorCampoGeneralParteActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParteActivoFijo")) {
				jButtonAbrirOrderByParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParteActivoFijo")) {
				jButtonAbrirOrderByParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParteActivoFijo")) {
				jButtonCerrarOrderByParteActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParteActivoFijoBusqueda")) {
				this.jButtonidParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParteActivoFijoUpdate")) {
				this.jButtonid_empresaParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParteActivoFijoBusqueda")) {
				this.jButtonid_empresaParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParteActivoFijoUpdate")) {
				this.jButtonid_sucursalParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParteActivoFijoBusqueda")) {
				this.jButtonid_sucursalParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_activo_fijoParteActivoFijoUpdate")) {
				this.jButtonid_estado_activo_fijoParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_activo_fijoParteActivoFijoBusqueda")) {
				this.jButtonid_estado_activo_fijoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoParteActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoParteActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParteActivoFijoBusqueda")) {
				this.jButtoncodigoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParteActivoFijoBusqueda")) {
				this.jButtonnombreParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaParteActivoFijoBusqueda")) {
				this.jButtonmarcaParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieParteActivoFijoBusqueda")) {
				this.jButtonserieParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadParteActivoFijoBusqueda")) {
				this.jButtoncantidadParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fotoParteActivoFijoBusqueda")) {
				this.jButtonfotoParteActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdDetalleActivoFijoParteActivoFijo")) {
				this.jButtonFK_IdDetalleActivoFijoParteActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoActivoFijoParteActivoFijo")) {
				this.jButtonFK_IdEstadoActivoFijoParteActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParteActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParteActivoFijo parteactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parteactivofijoLocal=this.parteactivofijo;
			} else {
				parteactivofijoLocal=this.parteactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
							
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
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
			
			


			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
								
						
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
								
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
							
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
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
			
			


			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
								
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParteActivoFijo")) {
					jCheckBoxSeleccionarTodosParteActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParteActivoFijo")) {
					jCheckBoxSeleccionadosParteActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParteActivoFijo")) {
					
				}
				
				


				
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
												
				
				


				
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
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
			
			


			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParteActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parteactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parteactivofijo);
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
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
				
				


				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParteActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParteActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParteActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parteactivofijoAnterior =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParteActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParteActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParteActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parteactivofijo =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parteactivofijo =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parteactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParteActivoFijo")) {
				
				}
				
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParteActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParteActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParteActivoFijo")) {
			
			}
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParteActivoFijo();
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParteActivoFijo")) {
				jButtonDuplicarParteActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParteActivoFijo")) {
				jButtonCopiarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParteActivoFijo")) {
				jButtonVerFormParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParteActivoFijo")) {
				jButtonNuevoParteActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParteActivoFijo")) {
				jButtonModificarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParteActivoFijo")) {
				jButtonActualizarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParteActivoFijo")) {
				jButtonEliminarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParteActivoFijo")) {
				jButtonCancelarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParteActivoFijo")) {
				jButtonCerrarParteActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParteActivoFijo")) {
				jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParteActivoFijo")) {
				jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParteActivoFijo")) {
				jButtonAbrirOrderByParteActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParteActivoFijo")) {
				jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParteActivoFijo")) {
				jButtonAnterioresParteActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParteActivoFijo")) {
				jButtonSiguientesParteActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParteActivoFijoBusqueda")) {
				this.jButtonidParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParteActivoFijoUpdate")) {
				this.jButtonid_empresaParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParteActivoFijoBusqueda")) {
				this.jButtonid_empresaParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParteActivoFijoUpdate")) {
				this.jButtonid_sucursalParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParteActivoFijoBusqueda")) {
				this.jButtonid_sucursalParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_activo_fijoParteActivoFijoUpdate")) {
				this.jButtonid_estado_activo_fijoParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_activo_fijoParteActivoFijoBusqueda")) {
				this.jButtonid_estado_activo_fijoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoParteActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoParteActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoParteActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParteActivoFijoBusqueda")) {
				this.jButtoncodigoParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParteActivoFijoBusqueda")) {
				this.jButtonnombreParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaParteActivoFijoBusqueda")) {
				this.jButtonmarcaParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieParteActivoFijoBusqueda")) {
				this.jButtonserieParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadParteActivoFijoBusqueda")) {
				this.jButtoncantidadParteActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fotoParteActivoFijoBusqueda")) {
				this.jButtonfotoParteActivoFijoBusquedaActionPerformed(evt);
			}
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParteActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParteActivoFijo")) {
				closingInternalFrameParteActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarParteActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormParteActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            ParteActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(ParteActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormParteActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParteActivoFijoActionPerformed(null);
			}
			
			ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parteactivofijo,new Object(),this.parteactivofijoParameterGeneral,this.parteactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParteActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParteActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParteActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parteactivofijo)) {
			if(!esControlTabla) {
				if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);			
				}
				
				if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParteActivoFijo(this.parteactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parteactivofijoReturnGeneral=parteactivofijoLogic.procesarEventosParteActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parteactivofijoLogic.getParteActivoFijos(),this.parteactivofijo,this.parteactivofijoParameterGeneral,this.isEsNuevoParteActivoFijo,classes);//this.parteactivofijoLogic.getParteActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParteActivoFijo(this.parteactivofijoReturnGeneral,this.parteactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParteActivoFijo(classes,this.parteactivofijoReturnGeneral,this.parteactivofijoBean,false);
					}
						
					if(this.parteactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo());	
					}
						
					if(this.parteactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo(),classes);//this.parteactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParteActivoFijo(this.parteactivofijo,classes);//this.parteactivofijoBean);									
				}
			
				if(ParteActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParteActivoFijo(this.parteactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParteActivoFijo(this.parteactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parteactivofijoAnterior!=null) {
						this.parteactivofijo=this.parteactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parteactivofijoReturnGeneral=parteactivofijoLogic.procesarEventosParteActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parteactivofijoLogic.getParteActivoFijos(),this.parteactivofijo,this.parteactivofijoParameterGeneral,this.isEsNuevoParteActivoFijo,classes);//this.parteactivofijoLogic.getParteActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parteactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parteactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parteactivofijoReturnGeneral.getParteActivoFijo(),parteactivofijoLogic.getParteActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parteactivofijoReturnGeneral.getParteActivoFijo(),this.parteactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParteActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosParteActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParteActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosParteActivoFijo() throws Exception {
		
		ParteActivoFijoModel parteactivofijoModel=(ParteActivoFijoModel)this.jTableDatosParteActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parteactivofijoModel.parteactivofijos=this.parteactivofijoLogic.getParteActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parteactivofijoModel.parteactivofijos=this.parteactivofijos;
		}
		
		
		((ParteActivoFijoModel) this.jTableDatosParteActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParteActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparteactivofijoAnterior(),this.parteactivofijoLogic.getParteActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparteactivofijoAnterior(),this.parteactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParteActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParteActivoFijo(ParteActivoFijo parteactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
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
										
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parteactivofijo,new Object(),generalEntityParameterGeneral,this.parteactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parteactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParteActivoFijoConstantesFunciones.getClassesRelationshipsOfParteActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParteActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfParteActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParteActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParteActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parteactivofijo,new Object(),generalEntityParameterGeneral,this.parteactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParteActivoFijo(ParteActivoFijoBean parteactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParteActivoFijo(ArrayList<Classe> classes,ParteActivoFijoReturnGeneral parteactivofijoReturnGeneral,ParteActivoFijoBean parteactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParteActivoFijo(ParteActivoFijo parteactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parteactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParteActivoFijo = new ParteActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.parteactivofijoSessionBean.getConGuardarRelaciones(),this.parteactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormParteActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormParteActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParteActivoFijo.parteactivofijoLogic=this.parteactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyParteActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParteActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParteActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParteActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParteActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParteActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParteActivoFijo"));
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarParteActivoFijo"));

		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarParteActivoFijo"));
					
		this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemModificarParteActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarParteActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarParteActivoFijo"));
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParteActivoFijo"));
						
		this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemActualizarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParteActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarParteActivoFijo"));
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarParteActivoFijo"));
								
		this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemEliminarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParteActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarParteActivoFijo"));
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarParteActivoFijo"));
					
		this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemCancelarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParteActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemDetalleCerrarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParteActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParteActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParteActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParteActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonidParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncodigoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonnombreParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonmarcaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"marcaParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonserieParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"serieParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncantidadParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonfotoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fotoParteActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParteActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParteActivoFijo"));
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParteActivoFijo"));
		}
		
		this.jTableDatosParteActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParteActivoFijo"));
		
		this.jTableDatosParteActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParteActivoFijo"));
		
		this.jButtonNuevoParteActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoParteActivoFijo"));
		
		this.jButtonDuplicarParteActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarParteActivoFijo"));
		
		this.jButtonCopiarParteActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarParteActivoFijo"));
		
		this.jButtonVerFormParteActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormParteActivoFijo"));
		
		
		this.jButtonNuevoToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarParteActivoFijo"));
			
		this.jButtonDuplicarToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParteActivoFijo"));
			
		this.jMenuItemNuevoParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParteActivoFijo"));
			
		this.jMenuItemDuplicarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParteActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesParteActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParteActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParteActivoFijo"));
			
		this.jMenuItemNuevoRelacionesParteActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParteActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarParteActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonModificarToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarParteActivoFijo"));
			
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemModificarParteActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarParteActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarParteActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarParteActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonActualizarToolBarParteActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParteActivoFijo"));
				
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemActualizarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParteActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarParteActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarParteActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonEliminarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarParteActivoFijo"));
						
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemEliminarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParteActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarParteActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonCancelarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarParteActivoFijo"));
			
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemCancelarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParteActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParteActivoFijo"));		
		
		
		this.jButtonCerrarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarParteActivoFijo"));
		
		
		this.jButtonCerrarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarParteActivoFijo"));
			
		this.jMenuItemCerrarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParteActivoFijo"));
			
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jMenuItemDetalleCerrarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParteActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosParteActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParteActivoFijo"));
		}
		
		this.jButtonCopiarToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarParteActivoFijo"));
			
		this.jButtonVerFormToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarParteActivoFijo"));
		
		this.jMenuItemGuardarCambiosParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParteActivoFijo"));
			
		this.jMenuItemCopiarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParteActivoFijo"));		
		
		this.jMenuItemVerFormParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParteActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParteActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParteActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaParteActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParteActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionParteActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionParteActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParteActivoFijo"));
		
		this.jMenuItemRecargarInformacionParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParteActivoFijo"));		
		
		
		
		this.jButtonAnterioresParteActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresParteActivoFijo"));
		
		
		this.jButtonAnterioresToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParteActivoFijo"));
		
		this.jMenuItemAnterioresParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParteActivoFijo"));		
		
		
		this.jButtonSiguientesParteActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesParteActivoFijo"));
		
		
		this.jButtonSiguientesToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParteActivoFijo"));
			
		this.jMenuItemSiguientesParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParteActivoFijo"));
			
		this.jMenuItemAbrirOrderByParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParteActivoFijo"));
			
		this.jMenuItemMostrarOcultarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParteActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParteActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParteActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosParteActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParteActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParteActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosParteActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParteActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParteActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParteActivoFijo"));

		this.jCheckBoxSeleccionadosParteActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParteActivoFijo"));
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParteActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesParteActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesParteActivoFijo"));
			
		this.jComboBoxTiposAccionesParteActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesParteActivoFijo"));
					
		this.jComboBoxTiposSeleccionarParteActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParteActivoFijo"));
			
		this.jTextFieldValorCampoGeneralParteActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParteActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonidParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncodigoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonnombreParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonmarcaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"marcaParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonserieParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"serieParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncantidadParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonfotoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fotoParteActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDetalleActivoFijoParteActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoParteActivoFijo"));

			this.jButtonFK_IdEstadoActivoFijoParteActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEstadoActivoFijoParteActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParteActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParteActivoFijo"));
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParteActivoFijo"));
				this.jInternalFrameReporteDinamicoParteActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParteActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoParteActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParteActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoParteActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParteActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoParteActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParteActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParteActivoFijo!=null) {
				this.jInternalFrameImportacionParteActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParteActivoFijo"));
				this.jInternalFrameImportacionParteActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParteActivoFijo"));
				this.jInternalFrameImportacionParteActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParteActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParteActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByParteActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarParteActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParteActivoFijo"));			
			
			if(this.jInternalFrameOrderByParteActivoFijo!=null) {
				this.jInternalFrameOrderByParteActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParteActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParteActivoFijo.jTabbedPaneRelacionesParteActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParteActivoFijo"));
		
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
            		closingInternalFrameParteActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParteActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParteActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            ParteActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(ParteActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormParteActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParteActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParteActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParteActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParteActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParteActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParteActivoFijo";
		inputMap = this.jButtonNuevoParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParteActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParteActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParteActivoFijo";
		inputMap = this.jButtonNuevoRelacionesParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParteActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParteActivoFijo";
		inputMap = this.jButtonModificarParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParteActivoFijo";
		inputMap = this.jButtonActualizarParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParteActivoFijo";
		inputMap = this.jButtonEliminarParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParteActivoFijo";
		inputMap = this.jButtonCancelarParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParteActivoFijo";
		inputMap = this.jButtonCerrarParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParteActivoFijo";
		inputMap = this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonGuardarCambiosParteActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParteActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParteActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParteActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParteActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParteActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParteActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParteActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParteActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParteActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonidParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_empresaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_sucursalParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_estado_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_activo_fijoParteActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonid_detalle_activo_fijoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncodigoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonnombreParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonmarcaParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"marcaParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonserieParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"serieParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtoncantidadParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadParteActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParteActivoFijo.jButtonfotoParteActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fotoParteActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdDetalleActivoFijoParteActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoParteActivoFijo"));

		this.jButtonFK_IdEstadoActivoFijoParteActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdEstadoActivoFijoParteActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParteActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParteActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParteActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParteActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParteActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
					parteactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParteActivoFijo parteactivofijoAux:parteactivofijos) {
					parteactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParteActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
						parteactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParteActivoFijo parteactivofijoAux:parteactivofijos) {
						parteactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParteActivoFijo parteactivofijoAux:parteactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParteActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParteActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParteActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParteActivoFijo.getSelectedRows();
			
			ParteActivoFijo parteactivofijoLocal=new ParteActivoFijo();
			
			//this.seleccionarTodosParteActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parteactivofijoLocal =(ParteActivoFijo) this.parteactivofijoLogic.getParteActivoFijos().toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parteactivofijoLocal =(ParteActivoFijo) this.parteactivofijos.toArray()[this.jTableDatosParteActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parteactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
						parteactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParteActivoFijo parteactivofijoAux:parteactivofijos) {
						parteactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParteActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParteActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParteActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParteActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParteActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParteActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParteActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParteActivoFijo parteactivofijoAux:this.parteactivofijoLogic.getParteActivoFijos()) {
				
						if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parteactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parteactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							parteactivofijoAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							parteactivofijoAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							parteactivofijoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_FOTO)) {
							existe=true;
							parteactivofijoAux.setfoto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParteActivoFijo parteactivofijoAux:parteactivofijos) {
					
						if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parteactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parteactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							parteactivofijoAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							parteactivofijoAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							parteactivofijoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_FOTO)) {
							existe=true;
							parteactivofijoAux.setfoto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParteActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParteActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParteActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParteActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParteActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessParteActivoFijo(conSplash);
				
					this.generarReporteParteActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParteActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParteActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParteActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParteActivoFijo();
				
				this.exportarParteActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParteActivoFijos();
				//this.importarParteActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParteActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParteActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parte Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParteActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParteActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParteActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(ParteActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParteActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParteActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralParteActivoFijo();
						
						this.generarReporteProcesoAccionParteActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParteActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parte Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Parte Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParteActivoFijo();
				
						this.actualizarParametrosGeneralParteActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parteactivofijoReturnGeneral=parteactivofijoLogic.procesarAccionParteActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parteactivofijoLogic.getParteActivoFijos(),this.parteactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParteActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParteActivoFijo();
					
					ParteActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParteActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParteActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxTiposAccionesFormularioParteActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParteActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParteActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParteActivoFijo();
			
			if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
			ParteActivoFijo parteactivofijo=new ParteActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParteActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParteActivoFijo.getSelectedItem();
			
			
			
			
			parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parteactivofijosSeleccionados.size()==1) {
				for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
					parteactivofijo=parteactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParteActivoFijo();
			
      		//this.finishProcessParteActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParteActivoFijoReturnGeneral() throws Exception {
		if(this.parteactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parteactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parteactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parteactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parteactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parteactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParteActivoFijo(false);
		}
		
		if(this.parteactivofijoReturnGeneral.getConRetornoLista() || this.parteactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.parteactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parteactivofijoLogic.setParteActivoFijos(this.parteactivofijoReturnGeneral.getParteActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parteactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parteactivofijoLogic.setParteActivoFijo(this.parteactivofijoReturnGeneral.getParteActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParteActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralParteActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<ParteActivoFijo> getParteActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParteActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParteActivoFijo parteactivofijoAux:parteactivofijoLogic.getParteActivoFijos()) {
					if(parteactivofijoAux.getIsSelected()) {
						parteactivofijosSeleccionados.add(parteactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParteActivoFijo parteactivofijoAux:this.parteactivofijos) {
					if(parteactivofijoAux.getIsSelected()) {
						parteactivofijosSeleccionados.add(parteactivofijoAux);				
					}
				}
			}
			
			if(parteactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parteactivofijosSeleccionados.addAll(this.parteactivofijoLogic.getParteActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parteactivofijosSeleccionados.addAll(this.parteactivofijos);				
					}
				}
			}
		} else {
			parteactivofijosSeleccionados.add(this.parteactivofijo);
		}
		
		return parteactivofijosSeleccionados;
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
	
	public void generarReporteParteActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParteActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParteActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParteActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParteActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parte Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParteActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParteActivoFijo();
		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParteActivoFijo();
		
		
		//this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados ,parteactivofijoImplementable,parteactivofijoImplementableHome);
	}
	
	public void mostrarImportacionParteActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParteActivoFijo();
		
		this.abrirFrameImportacionParteActivoFijo();		
		
			
		//this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados ,parteactivofijoImplementable,parteactivofijoImplementableHome);
	}
	
	public void importarParteActivoFijos() throws Exception {		
	
	}
	
	public void exportarParteActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParteActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParteActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParteActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parte Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParteActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParteActivoFijo(parteactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parteactivofijoAux.setsDetalleGeneralEntityReporte(parteactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParteActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParteActivoFijoConstantesFunciones.LABEL_FOTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParteActivoFijo(ParteActivoFijo parteactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parteactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getestadoactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parteactivofijo.getfoto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParteActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParteActivoFijo(row);				
				iRow++;
			}				
			
			for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParteActivoFijo(parteactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParteActivoFijosSeleccionados() throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();		
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parteactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parteactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parteactivofijo");
			//elementRoot.appendChild(element);
		
			for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
				element = document.createElement("parteactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParteActivoFijo(parteactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parte Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParteActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ParteActivoFijoConstantesFunciones.LABEL_FOTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParteActivoFijo(ParteActivoFijo parteactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getestadoactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(parteactivofijo.getfoto());				
	}
	
	public void setFilaDatosExportarXmlParteActivoFijo(ParteActivoFijo parteactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParteActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parteactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParteActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parteactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParteActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parteactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParteActivoFijoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parteactivofijo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestadoactivofijo_descripcion = document.createElement(ParteActivoFijoConstantesFunciones.IDESTADOACTIVOFIJO);
		elementestadoactivofijo_descripcion.appendChild(document.createTextNode(parteactivofijo.getestadoactivofijo_descripcion()));
		element.appendChild(elementestadoactivofijo_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(ParteActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(parteactivofijo.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementcodigo = document.createElement(ParteActivoFijoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(parteactivofijo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ParteActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(parteactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementmarca = document.createElement(ParteActivoFijoConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(parteactivofijo.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementserie = document.createElement(ParteActivoFijoConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(parteactivofijo.getserie().trim()));
		element.appendChild(elementserie);

		Element elementcantidad = document.createElement(ParteActivoFijoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(parteactivofijo.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementfoto = document.createElement(ParteActivoFijoConstantesFunciones.FOTO);
		elementfoto.appendChild(document.createTextNode(parteactivofijo.getfoto().trim()));
		element.appendChild(elementfoto);
	}
	
	public void generarReporteGroupGenericoParteActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParteActivoFijo> parteactivofijosSeleccionados=new ArrayList<ParteActivoFijo>();
		
		parteactivofijosSeleccionados=this.getParteActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParteActivoFijo(parteactivofijosSeleccionados);
		
		this.generarReporteParteActivoFijos("Todos",parteactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParteActivoFijo(ArrayList<ParteActivoFijo> parteactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParteActivoFijo parteactivofijoAux:parteactivofijosSeleccionados) {
				parteactivofijoAux.setsDetalleGeneralEntityReporte(parteactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getestadoactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ParteActivoFijoConstantesFunciones.LABEL_FOTO)) {
					existe=true;
					parteactivofijoAux.setsDescripcionGeneralEntityReporte1(parteactivofijoAux.getfoto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParteActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParteActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParteActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=true;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=true;
			this.isVisibilidadCeldaEliminarParteActivoFijo=true;
			this.isVisibilidadCeldaCancelarParteActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=true;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=true;
			this.isVisibilidadCeldaModificarParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
			this.isVisibilidadCeldaModificarParteActivoFijo=true;
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
			this.isVisibilidadCeldaCancelarParteActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarParteActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParteActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsParteActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParteActivoFijo=false;
			//this.isVisibilidadCeldaVerFormParteActivoFijo=false;
			this.isVisibilidadCeldaDuplicarParteActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parteactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoParteActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosParteActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!parteactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;												
			}
			
			this.jButtonCerrarParteActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParteActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.parteactivofijo)) {
			this.isVisibilidadCeldaActualizarParteActivoFijo=false;
			this.isVisibilidadCeldaEliminarParteActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParteActivoFijo() {
	}
	
	public void actualizarEstadoPanelsParteActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParteActivoFijo!=null) {
				this.jScrollPanelDatosEdicionParteActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParteActivoFijo!=null) {
				this.jScrollPanelDatosParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionParteActivoFijo!=null) {
				this.jPanelPaginacionParteActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
					this.jTabbedPaneBusquedasParteActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParteActivoFijo!=null) {
				this.jTabbedPaneBusquedasParteActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParteActivoFijo!=null) {
				this.jPanelParametrosReportesParteActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdDetalleActivoFijoParteActivoFijo);}

			this.isVisibilidadFK_IdEstadoActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdEstadoActivoFijoParteActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdDetalleActivoFijoParteActivoFijo);}

			this.isVisibilidadFK_IdEstadoActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdEstadoActivoFijoParteActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoActivoFijo(Boolean isParaEstadoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoActivoFijoNegation=!isParaEstadoActivoFijo;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEstadoActivoFijoNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdDetalleActivoFijoParteActivoFijo);}

			this.isVisibilidadFK_IdEstadoActivoFijo=isParaEstadoActivoFijo;
			if(!this.isVisibilidadFK_IdEstadoActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdEstadoActivoFijoParteActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdDetalleActivoFijoParteActivoFijo);}

			this.isVisibilidadFK_IdEstadoActivoFijo=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdEstadoActivoFijo) {this.jTabbedPaneBusquedasParteActivoFijo.remove(jPanelFK_IdEstadoActivoFijoParteActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParteActivoFijoSessionBean parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		
		if(this.parteactivofijoSessionBean==null) {
			this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		}
		
		this.parteactivofijoSessionBean.setsUltimaBusquedaParteActivoFijo(this.getsAccionBusqueda());
		this.parteactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parteactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			parteactivofijoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parteactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoActivoFijo")) {
			parteactivofijoSessionBean.setid_estado_activo_fijo(this.getid_estado_activo_fijoFK_IdEstadoActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parteactivofijoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParteActivoFijoSessionBean parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		
		if(this.parteactivofijoSessionBean==null) {
			this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		}
		
		if(this.parteactivofijoSessionBean.getsUltimaBusquedaParteActivoFijo()!=null&&!this.parteactivofijoSessionBean.getsUltimaBusquedaParteActivoFijo().equals("")) {
			this.setsAccionBusqueda(parteactivofijoSessionBean.getsUltimaBusquedaParteActivoFijo());
			this.setiNumeroPaginacion(parteactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parteactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(parteactivofijoSessionBean.getid_detalle_activo_fijo());
				parteactivofijoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parteactivofijoSessionBean.getid_empresa());
				parteactivofijoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoActivoFijo")) {
				this.setid_estado_activo_fijoFK_IdEstadoActivoFijo(parteactivofijoSessionBean.getid_estado_activo_fijo());
				parteactivofijoSessionBean.setid_estado_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parteactivofijoSessionBean.getid_sucursal());
				parteactivofijoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.parteactivofijoSessionBean.setsUltimaBusquedaParteActivoFijo("");
		this.parteactivofijoSessionBean.setiNumeroPaginacion(ParteActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.parteactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParteActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParteActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioParteActivoFijo();
		this.updateVisibilidadBusquedasFormularioParteActivoFijo();
		this.updateHabilitarBusquedasFormularioParteActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioParteActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParteActivoFijo.getComponents().length>0) {
	

		if(this.parteactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoParteActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoParteActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
				jPanel.setBorder(this.parteactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoParteActivoFijo);
			}
		}

		if(this.parteactivofijoConstantesFunciones.resaltarFK_IdEstadoActivoFijoParteActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdEstadoActivoFijoParteActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
				jPanel.setBorder(this.parteactivofijoConstantesFunciones.resaltarFK_IdEstadoActivoFijoParteActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParteActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParteActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoParteActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parteactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoParteActivoFijo);
			if(!this.parteactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoParteActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasParteActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdEstadoActivoFijoParteActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parteactivofijoConstantesFunciones.mostrarFK_IdEstadoActivoFijoParteActivoFijo);
			if(!this.parteactivofijoConstantesFunciones.mostrarFK_IdEstadoActivoFijoParteActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasParteActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParteActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParteActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoParteActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parteactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoParteActivoFijo);
				this.jTabbedPaneBusquedasParteActivoFijo.setEnabledAt(index,this.parteactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoParteActivoFijo);
			}

			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdEstadoActivoFijoParteActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parteactivofijoConstantesFunciones.activarFK_IdEstadoActivoFijoParteActivoFijo);
				this.jTabbedPaneBusquedasParteActivoFijo.setEnabledAt(index,this.parteactivofijoConstantesFunciones.activarFK_IdEstadoActivoFijoParteActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParteActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoParteActivoFijo);

			this.jTabbedPaneBusquedasParteActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);

			this.parteactivofijoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoParteActivoFijo(resaltar);

			jPanel.setBorder(this.parteactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoParteActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoActivoFijo")) {
			index= this.jTabbedPaneBusquedasParteActivoFijo.indexOfComponent(this.jPanelFK_IdEstadoActivoFijoParteActivoFijo);

			this.jTabbedPaneBusquedasParteActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParteActivoFijo.getComponent(index);

			this.parteactivofijoConstantesFunciones.setResaltarFK_IdEstadoActivoFijoParteActivoFijo(resaltar);

			jPanel.setBorder(this.parteactivofijoConstantesFunciones.resaltarFK_IdEstadoActivoFijoParteActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParteActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParteActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParteActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioParteActivoFijo();
		this.updateHabilitarResaltarControlesFormularioParteActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioParteActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parteactivofijoConstantesFunciones.resaltaridParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltaridParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarid_empresaParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarid_empresaParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarid_sucursalParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarid_sucursalParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarid_estado_activo_fijoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarid_estado_activo_fijoParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarcodigoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarcodigoParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarnombreParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarnombreParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarmarcaParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarmarcaParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarserieParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarserieParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarcantidadParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarcantidadParteActivoFijo);}
		if(this.parteactivofijoConstantesFunciones.resaltarfotoParteActivoFijo!=null && this.jInternalFrameDetalleFormParteActivoFijo!=null) {this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setBorder(this.parteactivofijoConstantesFunciones.resaltarfotoParteActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParteActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostraridParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelidParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostraridParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_empresaParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelid_empresaParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_empresaParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_sucursalParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelid_sucursalParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_sucursalParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_estado_activo_fijoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelid_estado_activo_fijoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_estado_activo_fijoParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelid_detalle_activo_fijoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarcodigoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelcodigoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarcodigoParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarnombreParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelnombreParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarnombreParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarmarcaParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelmarcaParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarmarcaParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarserieParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelserieParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarserieParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarcantidadParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelcantidadParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarcantidadParteActivoFijo);
		//this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarfotoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jPanelfotoParteActivoFijo.setVisible(this.parteactivofijoConstantesFunciones.mostrarfotoParteActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParteActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormParteActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParteActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormParteActivoFijo.jLabelidParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activaridParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_empresaParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarid_empresaParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_sucursalParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarid_sucursalParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_estado_activo_fijoParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarid_estado_activo_fijoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jComboBoxid_detalle_activo_fijoParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarid_detalle_activo_fijoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcodigoParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarcodigoParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextAreanombreParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarnombreParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldmarcaParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarmarcaParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldserieParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarserieParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextFieldcantidadParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarcantidadParteActivoFijo);
		this.jInternalFrameDetalleFormParteActivoFijo.jTextAreafotoParteActivoFijo.setEnabled(this.parteactivofijoConstantesFunciones.activarfotoParteActivoFijo);
		}
	}
	
		
}
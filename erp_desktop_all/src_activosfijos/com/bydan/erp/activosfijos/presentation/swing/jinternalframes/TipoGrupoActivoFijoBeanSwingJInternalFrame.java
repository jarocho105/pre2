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

import com.bydan.erp.activosfijos.util.TipoGrupoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoGrupoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoGrupoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoGrupoActivoFijoBean;
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
public class TipoGrupoActivoFijoBeanSwingJInternalFrame extends TipoGrupoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGrupoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGrupoActivoFijo> tipogrupoactivofijoValidator = new ClassValidator<TipoGrupoActivoFijo>(TipoGrupoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGrupoActivoFijo tipogrupoactivofijo;	
	public TipoGrupoActivoFijo tipogrupoactivofijoAux;
	public TipoGrupoActivoFijo tipogrupoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGrupoActivoFijo tipogrupoactivofijoTotales;
	public Long idTipoGrupoActivoFijoActual;
	public Long iIdNuevoTipoGrupoActivoFijo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoGrupoActivoFijo;
	public Boolean isPermisoNuevoTipoGrupoActivoFijo;
	public Boolean isPermisoActualizarTipoGrupoActivoFijo;
	public Boolean isPermisoActualizarOriginalTipoGrupoActivoFijo;
	public Boolean isPermisoEliminarTipoGrupoActivoFijo;
	public Boolean isPermisoGuardarCambiosTipoGrupoActivoFijo;
	public Boolean isPermisoConsultaTipoGrupoActivoFijo;
	public Boolean isPermisoBusquedaTipoGrupoActivoFijo;
	public Boolean isPermisoReporteTipoGrupoActivoFijo;
	public Boolean isPermisoPaginacionMedioTipoGrupoActivoFijo;
	public Boolean isPermisoPaginacionAltoTipoGrupoActivoFijo;
	public Boolean isPermisoPaginacionTodoTipoGrupoActivoFijo;
	public Boolean isPermisoCopiarTipoGrupoActivoFijo;
	public Boolean isPermisoVerFormTipoGrupoActivoFijo;
	public Boolean isPermisoDuplicarTipoGrupoActivoFijo;
	public Boolean isPermisoOrdenTipoGrupoActivoFijo;
	
	
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
	
	public TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoReturnGeneral;
	public TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGrupoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioTipoGrupoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGrupoActivoFijo tipogrupoactivofijoBean;
	public TipoGrupoActivoFijoConstantesFunciones tipogrupoactivofijoConstantesFunciones;
	//public TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGrupoActivoFijo> tipogrupoactivofijos;	
	//public List<TipoGrupoActivoFijo> tipogrupoactivofijosEliminados;
	//public List<TipoGrupoActivoFijo> tipogrupoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarTipoGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormTipoGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenTipoGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarTipoGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoGrupoActivoFijo() {
		return this.iIdNuevoTipoGrupoActivoFijo;
	}

	public void setiIdNuevoTipoGrupoActivoFijo(Long iIdNuevoTipoGrupoActivoFijo) {
		this.iIdNuevoTipoGrupoActivoFijo = iIdNuevoTipoGrupoActivoFijo;
	}
	
	public Long getidTipoGrupoActivoFijoActual() {
		return this.idTipoGrupoActivoFijoActual;
	}

	public void setidTipoGrupoActivoFijoActual(Long idTipoGrupoActivoFijoActual) {
		this.idTipoGrupoActivoFijoActual = idTipoGrupoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGrupoActivoFijo gettipogrupoactivofijo() {
		return this.tipogrupoactivofijo;
	}

	public void settipogrupoactivofijo(TipoGrupoActivoFijo tipogrupoactivofijo) {
		this.tipogrupoactivofijo = tipogrupoactivofijo;
	}
	
	public TipoGrupoActivoFijo gettipogrupoactivofijoAux() {
		return this.tipogrupoactivofijoAux;
	}

	public void settipogrupoactivofijoAux(TipoGrupoActivoFijo tipogrupoactivofijoAux) {
		this.tipogrupoactivofijoAux = tipogrupoactivofijoAux;
	}				
	
	public TipoGrupoActivoFijo gettipogrupoactivofijoAnterior() {
		return this.tipogrupoactivofijoAnterior;
	}

	public void settipogrupoactivofijoAnterior(TipoGrupoActivoFijo tipogrupoactivofijoAnterior) {
		this.tipogrupoactivofijoAnterior = tipogrupoactivofijoAnterior;
	}	
	
	public TipoGrupoActivoFijo gettipogrupoactivofijoTotales() {
		return this.tipogrupoactivofijoTotales;
	}

	public void settipogrupoactivofijoTotales(TipoGrupoActivoFijo tipogrupoactivofijoTotales) {
		this.tipogrupoactivofijoTotales = tipogrupoactivofijoTotales;
	}	
	
	public TipoGrupoActivoFijo gettipogrupoactivofijoBean() {
		return this.tipogrupoactivofijoBean;
	}

	public void settipogrupoactivofijoBean(TipoGrupoActivoFijo tipogrupoactivofijoBean) {
		this.tipogrupoactivofijoBean = tipogrupoactivofijoBean;
	}	
	
	public TipoGrupoActivoFijoParameterReturnGeneral gettipogrupoactivofijoReturnGeneral() {
		return this.tipogrupoactivofijoReturnGeneral;
	}

	public void settipogrupoactivofijoReturnGeneral(TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoReturnGeneral) {
		this.tipogrupoactivofijoReturnGeneral = tipogrupoactivofijoReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGrupoActivoFijoLogic getTipoGrupoActivoFijoLogic()	{		
		return tipogrupoactivofijoLogic;
	}

	public void setTipoGrupoActivoFijoLogic(TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic) {
		this.tipogrupoactivofijoLogic = tipogrupoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoTipoGrupoActivoFijo() {
		return isEsNuevoTipoGrupoActivoFijo;
	}

	public void setIsEsNuevoTipoGrupoActivoFijo(Boolean isEsNuevoTipoGrupoActivoFijo) {
		this.isEsNuevoTipoGrupoActivoFijo = isEsNuevoTipoGrupoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGrupoActivoFijo() {
		return esParaAccionDesdeFormularioTipoGrupoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGrupoActivoFijo(Boolean esParaAccionDesdeFormularioTipoGrupoActivoFijo) {
		this.esParaAccionDesdeFormularioTipoGrupoActivoFijo = esParaAccionDesdeFormularioTipoGrupoActivoFijo;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipogrupoactivofijoSessionBean==null) {
				this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
			}

			if(!this.tipogrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipogrupoactivofijoSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipogrupoactivofijo!=null) {
						this.tipogrupoactivofijo.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoGrupoActivoFijo.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo!=null) {
						jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo!=null) {
							//jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoGrupoActivoFijoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoGrupoActivoFijoGenerico!=null && jComboBoxid_paisTipoGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoGrupoActivoFijo tipogrupoactivofijo,JComboBox jComboBoxid_paisTipoGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoGrupoActivoFijoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipogrupoactivofijo.setid_pais(paisAux.getId());
				tipogrupoactivofijo.setpais_descripcion(TipoGrupoActivoFijoConstantesFunciones.getPaisDescripcion(paisAux));
				tipogrupoactivofijo.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { 
					}

					if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.addItem(pais);
							}
						}

						if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoGrupoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo(this.tipogrupoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(this.tipogrupoactivofijos);
			tipogrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGrupoActivoFijoParameterReturnGeneral getTipoGrupoActivoFijoParameterGeneral() {
		return this.tipogrupoactivofijoParameterGeneral;
	}
	
	public void setTipoGrupoActivoFijoParameterGeneral(TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoParameterGeneral) {
		this.tipogrupoactivofijoParameterGeneral = tipogrupoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGrupoActivoFijo() {
		return isPermisoTodoTipoGrupoActivoFijo;
	}

	public void setIsPermisoTodoTipoGrupoActivoFijo(Boolean isPermisoTodoTipoGrupoActivoFijo) {
		this.isPermisoTodoTipoGrupoActivoFijo = isPermisoTodoTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoNuevoTipoGrupoActivoFijo() {
		return isPermisoNuevoTipoGrupoActivoFijo;
	}

	public void setIsPermisoNuevoTipoGrupoActivoFijo(Boolean isPermisoNuevoTipoGrupoActivoFijo) {
		this.isPermisoNuevoTipoGrupoActivoFijo = isPermisoNuevoTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoActualizarTipoGrupoActivoFijo() {
		return isPermisoActualizarTipoGrupoActivoFijo;
	}

	public void setIsPermisoActualizarTipoGrupoActivoFijo(Boolean isPermisoActualizarTipoGrupoActivoFijo) {
		this.isPermisoActualizarTipoGrupoActivoFijo = isPermisoActualizarTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoEliminarTipoGrupoActivoFijo() {
		return isPermisoEliminarTipoGrupoActivoFijo;
	}

	public void setIsPermisoEliminarTipoGrupoActivoFijo(Boolean isPermisoEliminarTipoGrupoActivoFijo) {
		this.isPermisoEliminarTipoGrupoActivoFijo = isPermisoEliminarTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGrupoActivoFijo() {
		return isPermisoGuardarCambiosTipoGrupoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosTipoGrupoActivoFijo(Boolean isPermisoGuardarCambiosTipoGrupoActivoFijo) {
		this.isPermisoGuardarCambiosTipoGrupoActivoFijo = isPermisoGuardarCambiosTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaTipoGrupoActivoFijo() {
		return isPermisoConsultaTipoGrupoActivoFijo;
	}

	public void setIsPermisoConsultaTipoGrupoActivoFijo(Boolean isPermisoConsultaTipoGrupoActivoFijo) {
		this.isPermisoConsultaTipoGrupoActivoFijo = isPermisoConsultaTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaTipoGrupoActivoFijo() {
		return isPermisoBusquedaTipoGrupoActivoFijo;
	}

	public void setIsPermisoBusquedaTipoGrupoActivoFijo(Boolean isPermisoBusquedaTipoGrupoActivoFijo) {
		this.isPermisoBusquedaTipoGrupoActivoFijo = isPermisoBusquedaTipoGrupoActivoFijo;
	}

	public Boolean getIsPermisoReporteTipoGrupoActivoFijo() {
		return isPermisoReporteTipoGrupoActivoFijo;
	}

	public void setIsPermisoReporteTipoGrupoActivoFijo(Boolean isPermisoReporteTipoGrupoActivoFijo) {
		this.isPermisoReporteTipoGrupoActivoFijo = isPermisoReporteTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGrupoActivoFijo() {
		return isPermisoPaginacionMedioTipoGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioTipoGrupoActivoFijo(Boolean isPermisoPaginacionMedioTipoGrupoActivoFijo) {
		this.isPermisoPaginacionMedioTipoGrupoActivoFijo = isPermisoPaginacionMedioTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGrupoActivoFijo() {
		return isPermisoPaginacionTodoTipoGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoTipoGrupoActivoFijo(Boolean isPermisoPaginacionTodoTipoGrupoActivoFijo) {
		this.isPermisoPaginacionTodoTipoGrupoActivoFijo = isPermisoPaginacionTodoTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGrupoActivoFijo() {
		return isPermisoPaginacionAltoTipoGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoTipoGrupoActivoFijo(Boolean isPermisoPaginacionAltoTipoGrupoActivoFijo) {
		this.isPermisoPaginacionAltoTipoGrupoActivoFijo = isPermisoPaginacionAltoTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarTipoGrupoActivoFijo() {
		return isPermisoCopiarTipoGrupoActivoFijo;
	}

	public void setIsPermisoCopiarTipoGrupoActivoFijo(Boolean isPermisoCopiarTipoGrupoActivoFijo) {
		this.isPermisoCopiarTipoGrupoActivoFijo = isPermisoCopiarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormTipoGrupoActivoFijo() {
		return isPermisoVerFormTipoGrupoActivoFijo;
	}

	public void setIsPermisoVerFormTipoGrupoActivoFijo(Boolean isPermisoVerFormTipoGrupoActivoFijo) {
		this.isPermisoVerFormTipoGrupoActivoFijo = isPermisoVerFormTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarTipoGrupoActivoFijo() {
		return isPermisoDuplicarTipoGrupoActivoFijo;
	}

	public void setIsPermisoDuplicarTipoGrupoActivoFijo(Boolean isPermisoDuplicarTipoGrupoActivoFijo) {
		this.isPermisoDuplicarTipoGrupoActivoFijo = isPermisoDuplicarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenTipoGrupoActivoFijo() {
		return isPermisoOrdenTipoGrupoActivoFijo;
	}

	public void setIsPermisoOrdenTipoGrupoActivoFijo(Boolean isPermisoOrdenTipoGrupoActivoFijo) {
		this.isPermisoOrdenTipoGrupoActivoFijo = isPermisoOrdenTipoGrupoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoTipoGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo = isVisibilidadCeldaNuevoTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaDuplicarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaDuplicarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo = isVisibilidadCeldaDuplicarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaCopiarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaCopiarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo = isVisibilidadCeldaCopiarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGrupoActivoFijo() {
		return isVisibilidadCeldaVerFormTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormTipoGrupoActivoFijo(Boolean isVisibilidadCeldaVerFormTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo = isVisibilidadCeldaVerFormTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGrupoActivoFijo() {
		return isVisibilidadCeldaOrdenTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenTipoGrupoActivoFijo(Boolean isVisibilidadCeldaOrdenTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo = isVisibilidadCeldaOrdenTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo = isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaModificarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaModificarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaModificarTipoGrupoActivoFijo = isVisibilidadCeldaModificarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaActualizarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaActualizarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo = isVisibilidadCeldaActualizarTipoGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaEliminarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaEliminarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo = isVisibilidadCeldaEliminarTipoGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaCancelarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaCancelarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo = isVisibilidadCeldaCancelarTipoGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarTipoGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo = isVisibilidadCeldaGuardarTipoGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo = isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo;
	}
		
	public TipoGrupoActivoFijoSessionBean gettipogrupoactivofijoSessionBean() {
		return this.tipogrupoactivofijoSessionBean;
	}
	
	public void settipogrupoactivofijoSessionBean(TipoGrupoActivoFijoSessionBean tipogrupoactivofijoSessionBean) {
		this.tipogrupoactivofijoSessionBean=tipogrupoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipogrupoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(TipoGrupoActivoFijo tipogrupoactivofijo,TipoGrupoActivoFijo tipogrupoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGrupoActivoFijo(tipogrupoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogrupoactivofijoAux.setId(tipogrupoactivofijo.getId());
		tipogrupoactivofijoAux.setVersionRow(tipogrupoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGrupoActivoFijo();
		
			int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogrupoactivofijoValidator.getInvalidValues(this.tipogrupoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogrupoactivofijoLogic.setDatosCliente(datosCliente);
			tipogrupoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogrupoactivofijoAux=new  TipoGrupoActivoFijo();
				
				tipogrupoactivofijoAux.setIsNew(true);
				tipogrupoactivofijoAux.setIsChanged(true);
				
				tipogrupoactivofijoAux.setTipoGrupoActivoFijoOriginal(this.tipogrupoactivofijo);
				
				tipogrupoactivofijoAux.setId(this.tipogrupoactivofijo.getId());	
				tipogrupoactivofijoAux.setVersionRow(this.tipogrupoactivofijo.getVersionRow());	
				tipogrupoactivofijoAux.setid_pais(this.tipogrupoactivofijo.getid_pais());	
				tipogrupoactivofijoAux.setnombre(this.tipogrupoactivofijo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoLogic.saveTipoGrupoActivoFijos();//WithConnection
						//tipogrupoactivofijoLogic.getSetVersionRowTipoGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoactivofijo,tipogrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogrupoactivofijoAux=new  TipoGrupoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipogrupoactivofijo.getId()>=0)) {
						
					tipogrupoactivofijoAux.setIsNew(false);
				}
				
				tipogrupoactivofijoAux.setIsDeleted(false);
			
				tipogrupoactivofijoAux.setId(this.tipogrupoactivofijo.getId());	
				tipogrupoactivofijoAux.setVersionRow(this.tipogrupoactivofijo.getVersionRow());	
				tipogrupoactivofijoAux.setid_pais(this.tipogrupoactivofijo.getid_pais());	
				tipogrupoactivofijoAux.setnombre(this.tipogrupoactivofijo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoLogic.saveTipoGrupoActivoFijos();//WithConnection
						//tipogrupoactivofijoLogic.getSetVersionRowTipoGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoactivofijo,tipogrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogrupoactivofijoAux=new  TipoGrupoActivoFijo();
				
				tipogrupoactivofijoAux.setIsNew(false);
				tipogrupoactivofijoAux.setIsChanged(false);
				
				tipogrupoactivofijoAux.setIsDeleted(true);
				
				tipogrupoactivofijoAux.setId(this.tipogrupoactivofijo.getId());	
				tipogrupoactivofijoAux.setVersionRow(this.tipogrupoactivofijo.getVersionRow());	
				tipogrupoactivofijoAux.setid_pais(this.tipogrupoactivofijo.getid_pais());	
				tipogrupoactivofijoAux.setnombre(this.tipogrupoactivofijo.getnombre());	
				
				if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogrupoactivofijoAux.getId()>=0) {	
						this.tipogrupoactivofijosEliminados.add(tipogrupoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoLogic.saveTipoGrupoActivoFijos();//WithConnection
						//tipogrupoactivofijoLogic.getSetVersionRowTipoGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogrupoactivofijoAux,tipogrupoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().addAll(this.tipogrupoactivofijosEliminados);
					
					tipogrupoactivofijoLogic.saveTipoGrupoActivoFijos();//WithConnection
					//tipogrupoactivofijoLogic.getSetVersionRowTipoGrupoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo();
				
				this.tipogrupoactivofijosEliminados= new ArrayList<TipoGrupoActivoFijo>();		
			}
			
			if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Grupo Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogrupoactivofijo=tipogrupoactivofijoAux;
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
      		//this.finishProcessTipoGrupoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGrupoActivoFijo tipogrupoactivofijoLocal) throws Exception {
		
		if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGrupoActivoFijo tipogrupoactivofijoLocal) throws Exception {	
		if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipogrupoactivofijoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGrupoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogrupoactivofijoValidator.getInvalidValues(this.tipogrupoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGrupoActivoFijo tipogrupoactivofijo,List<TipoGrupoActivoFijo> tipogrupoactivofijos) throws Exception {
		try	{		
			TipoGrupoActivoFijoConstantesFunciones.actualizarLista(tipogrupoactivofijo,tipogrupoactivofijos,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGrupoActivoFijo tipogrupoactivofijo,List<TipoGrupoActivoFijo> tipogrupoactivofijos) throws Exception {
		try	{			
			TipoGrupoActivoFijoConstantesFunciones.actualizarSelectedLista(tipogrupoactivofijo,tipogrupoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGrupoActivoFijo> tipogrupoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogrupoactivofijosLocal=this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogrupoactivofijosLocal=this.tipogrupoactivofijos;
			}
			//ARCHITECTURE
		
			for(TipoGrupoActivoFijo tipogrupoactivofijoLocal:tipogrupoactivofijosLocal) {
				if(this.permiteMantenimiento(tipogrupoactivofijoLocal) && tipogrupoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGrupoActivoFijoConstantesFunciones.getTipoGrupoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGrupoActivoFijoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelid_paisTipoGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGrupoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelnombreTipoGrupoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelid_paisTipoGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelnombreTipoGrupoActivoFijo,"");
		
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
		this.iIdNuevoTipoGrupoActivoFijo--;	
		
		
		this.tipogrupoactivofijoAux=new TipoGrupoActivoFijo();
		
		this.tipogrupoactivofijoAux.setId(this.iIdNuevoTipoGrupoActivoFijo);
		this.tipogrupoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(this.tipogrupoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogrupoactivofijos.add(this.tipogrupoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.tipogrupoactivofijo=this.tipogrupoactivofijoAux;
		
		if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoActivoFijo(this.tipogrupoactivofijo);
		}
				
		//this.setDefaultControlesTipoGrupoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGrupoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijoBean,this.tipogrupoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=TipoGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogrupoactivofijoReturnGeneral=tipogrupoactivofijoLogic.procesarEventosTipoGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),this.tipogrupoactivofijo,this.tipogrupoactivofijoParameterGeneral,this.isEsNuevoTipoGrupoActivoFijo,classes);//this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral,this.tipogrupoactivofijoBean,false);
		
		if(this.tipogrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo());
		}
		
		if(this.tipogrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo(),classes);//this.tipogrupoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGrupoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
						
			if(tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();
			}
			
			this.actualizarVisualTableDatosTipoGrupoActivoFijo();
			
			this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoActivoFijo(), this.getIndiceNuevoTipoGrupoActivoFijo());
			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGrupoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setEnabled(isHabilitar && this.tipogrupoactivofijoConstantesFunciones.activarnombreTipoGrupoActivoFijo);	
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setEnabled(isHabilitar && this.tipogrupoactivofijoConstantesFunciones.activarid_paisTipoGrupoActivoFijo);
	};
	
	public void setDefaultControlesTipoGrupoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGrupoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.tipogrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.setVisible(true);
			
					
		} else {
			//this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.tipogrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGrupoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				if(tipogrupoactivofijoAux.getId().equals(this.iIdNuevoTipoGrupoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijos) {
				if(tipogrupoactivofijoAux.getId().equals(this.iIdNuevoTipoGrupoActivoFijo)) {
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
	
	public int getIndiceActualTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				if(tipogrupoactivofijoAux.getId().equals(tipogrupoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijos) {
				if(tipogrupoactivofijoAux.getId().equals(tipogrupoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				if(tipogrupoactivofijoAux.getTipoGrupoActivoFijoOriginal().getId().equals(tipogrupoactivofijoOriginal.getId())) {
					existe=true;
					tipogrupoactivofijoOriginal.setId(tipogrupoactivofijoAux.getId());
					tipogrupoactivofijoOriginal.setVersionRow(tipogrupoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijos) {
				if(tipogrupoactivofijoAux.getTipoGrupoActivoFijoOriginal().getId().equals(tipogrupoactivofijoOriginal.getId())) {
					existe=true;
					tipogrupoactivofijoOriginal.setId(tipogrupoactivofijoAux.getId());
					tipogrupoactivofijoOriginal.setVersionRow(tipogrupoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		tipogrupoactivofijosAux=new ArrayList<TipoGrupoActivoFijo>();
		tipogrupoactivofijoAux=new TipoGrupoActivoFijo();
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
					if(tipogrupoactivofijoAux.getId()<0) {
						tipogrupoactivofijosAux.add(tipogrupoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoGrupoActivoFijo=0L;
				this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().removeAll(tipogrupoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijos) {
					if(tipogrupoactivofijoAux.getId()<0) {
						tipogrupoactivofijosAux.add(tipogrupoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoGrupoActivoFijo=0L;
				this.tipogrupoactivofijos.removeAll(tipogrupoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoActivoFijo 
					&& this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()>0
					) {
					tipogrupoactivofijoAux=this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().get(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size() - 1);
				
					if(tipogrupoactivofijoAux.getId()<0) {
						this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().remove(tipogrupoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoActivoFijo && this.tipogrupoactivofijos.size()>0) {
					tipogrupoactivofijoAux=this.tipogrupoactivofijos.get(this.tipogrupoactivofijos.size() - 1);
				
					if(tipogrupoactivofijoAux.getId()<0) {
						this.tipogrupoactivofijos.remove(tipogrupoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogrupoactivofijo.getId()<0) {
				this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().remove(this.tipogrupoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogrupoactivofijo.getId()<0) {
				this.tipogrupoactivofijos.remove(this.tipogrupoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGrupoActivoFijo(List<TipoGrupoActivoFijo> tipogrupoactivofijosAux) throws Exception {
		TipoGrupoActivoFijoConstantesFunciones.setEstadosInicialesTipoGrupoActivoFijo(tipogrupoactivofijosAux);
	}
	
	public void setEstadosInicialesTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijoAux) throws Exception {
		TipoGrupoActivoFijoConstantesFunciones.setEstadosInicialesTipoGrupoActivoFijo(tipogrupoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGrupoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGrupoActivoFijoActual()) {
				if(!this.isEsNuevoTipoGrupoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGrupoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGrupoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Grupo Activo Fijo ?", "MANTENIMIENTO DE Tipo Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGrupoActivoFijo tipogrupoactivofijo) throws Exception {
		TipoGrupoActivoFijoConstantesFunciones.seleccionarAsignar(this.tipogrupoactivofijo,tipogrupoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGrupoActivoFijo=this.isPermisoActualizarOriginalTipoGrupoActivoFijo;
			
			
			this.seleccionarAsignar(tipogrupoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGrupoActivoFijoConstantesFunciones.quitarEspaciosTipoGrupoActivoFijo(this.tipogrupoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogrupoactivofijoSessionBean.setsFuncionBusquedaRapida(this.tipogrupoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGrupoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGrupoActivoFijo(esParaCancelar);				
				this.cancelarNuevoTipoGrupoActivoFijo(esParaCancelar);								
			}
			
			this.tipogrupoactivofijo=new TipoGrupoActivoFijo();
			
			this.inicializarTipoGrupoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGrupoActivoFijo() throws Exception {
		try {
			TipoGrupoActivoFijoConstantesFunciones.inicializarTipoGrupoActivoFijo(this.tipogrupoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGrupoActivoFijos(String sAccionBusqueda,List<TipoGrupoActivoFijo> tipogrupoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGrupoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGrupoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Grupo Activo Fijos");		
		parameters.put("busquedapor", TipoGrupoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGrupoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGrupoActivoFijo=new JRBeanArrayDataSource(TipoGrupoActivoFijoJInternalFrame.TraerTipoGrupoActivoFijoBeans(tipogrupoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGrupoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGrupoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGrupoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGrupoActivoFijoBean.TraerTipoGrupoActivoFijoBeans(tipogrupoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijoActionPerformed(null);
					//this.generarExcelReporteTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoActivoFijo> tipogrupoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGrupoActivoFijo tipogrupoactivofijo : tipogrupoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGrupoActivoFijoConstantesFunciones.generarExcelReporteDataTipoGrupoActivoFijo("NORMAL",row,workbook,tipogrupoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGrupoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		TipoGrupoActivoFijoConstantesFunciones.generarExcelReporteHeaderTipoGrupoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoActivoFijo> tipogrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGrupoActivoFijo tipogrupoactivofijo : tipogrupoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.getTipoGrupoActivoFijoDescripcion(tipogrupoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogrupoactivofijo.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogrupoactivofijo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoActivoFijo> tipogrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGrupoActivoFijo> tipogrupoactivofijosRespaldo=null;
		
		classes=TipoGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogrupoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.tipogrupoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.tipogrupoactivofijoLogic.setIsConDeep(true);
		
		tipogrupoactivofijosRespaldo=this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos();
		
		this.tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(tipogrupoactivofijosParaReportes);	
		this.tipogrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogrupoactivofijosParaReportes=this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos();
		this.tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(tipogrupoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGrupoActivoFijo tipogrupoactivofijo : tipogrupoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGrupoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGrupoActivoFijoConstantesFunciones.generarExcelReporteDataTipoGrupoActivoFijo("NORMAL",row,workbook,tipogrupoactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.getTipoGrupoActivoFijoDescripcion(tipogrupoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGrupoActivoFijo() throws Exception {		
		this.startProcessTipoGrupoActivoFijo(true);
	}
	
	public void startProcessTipoGrupoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGrupoActivoFijo ,this.jPanelParametrosReportesTipoGrupoActivoFijo, this.jScrollPanelDatosTipoGrupoActivoFijo,this.jPanelPaginacionTipoGrupoActivoFijo, this.jScrollPanelDatosEdicionTipoGrupoActivoFijo, this.jPanelAccionesTipoGrupoActivoFijo,this.jPanelAccionesFormularioTipoGrupoActivoFijo,this.jmenuBarTipoGrupoActivoFijo,this.jmenuBarDetalleTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoActivoFijo=this.jTabbedPaneBusquedasTipoGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoGrupoActivoFijo=this.jPanelParametrosReportesTipoGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoGrupoActivoFijo=this.jScrollPanelDatosTipoGrupoActivoFijo;
		final JTable jTableDatosTipoGrupoActivoFijo=this.jTableDatosTipoGrupoActivoFijo;		
		final JPanel jPanelPaginacionTipoGrupoActivoFijo=this.jPanelPaginacionTipoGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoActivoFijo=this.jScrollPanelDatosEdicionTipoGrupoActivoFijo;
		final JPanel jPanelAccionesTipoGrupoActivoFijo=this.jPanelAccionesTipoGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoGrupoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelCamposTipoGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelAccionesFormularioTipoGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoGrupoActivoFijo=jPanelCamposAuxiliarTipoGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoGrupoActivoFijo=jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoGrupoActivoFijo=this.jmenuBarTipoGrupoActivoFijo;
		final JToolBar jTtoolBarTipoGrupoActivoFijo=this.jTtoolBarTipoGrupoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jmenuBarDetalleTipoGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTtoolBarDetalleTipoGrupoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoActivoFijo=jmenuBarDetalleAuxiliarTipoGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoGrupoActivoFijo=jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoActivoFijo ,jPanelParametrosReportesTipoGrupoActivoFijo,jTableDatosTipoGrupoActivoFijo, /*jScrollPanelDatosTipoGrupoActivoFijo,*/jPanelCamposTipoGrupoActivoFijo,jPanelPaginacionTipoGrupoActivoFijo, /*jScrollPanelDatosEdicionTipoGrupoActivoFijo,*/ jPanelAccionesTipoGrupoActivoFijo,jPanelAccionesFormularioTipoGrupoActivoFijo,jmenuBarTipoGrupoActivoFijo,jmenuBarDetalleTipoGrupoActivoFijo,jTtoolBarTipoGrupoActivoFijo,jTtoolBarDetalleTipoGrupoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoActivoFijo ,jPanelParametrosReportesTipoGrupoActivoFijo, jScrollPanelDatosTipoGrupoActivoFijo,jPanelPaginacionTipoGrupoActivoFijo, jScrollPanelDatosEdicionTipoGrupoActivoFijo, jPanelAccionesTipoGrupoActivoFijo,jPanelAccionesFormularioTipoGrupoActivoFijo,jmenuBarTipoGrupoActivoFijo,jmenuBarDetalleTipoGrupoActivoFijo,jTtoolBarTipoGrupoActivoFijo,jTtoolBarDetalleTipoGrupoActivoFijo);
						
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
	
	public void finishProcessTipoGrupoActivoFijo() {// throws Exception 
		this.finishProcessTipoGrupoActivoFijo(true);
	}
	
	public void finishProcessTipoGrupoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGrupoActivoFijo ,this.jPanelParametrosReportesTipoGrupoActivoFijo, this.jScrollPanelDatosTipoGrupoActivoFijo,this.jPanelPaginacionTipoGrupoActivoFijo, this.jScrollPanelDatosEdicionTipoGrupoActivoFijo, this.jPanelAccionesTipoGrupoActivoFijo,this.jPanelAccionesFormularioTipoGrupoActivoFijo,this.jmenuBarTipoGrupoActivoFijo,this.jmenuBarDetalleTipoGrupoActivoFijo,this.jTtoolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoActivoFijo=this.jTabbedPaneBusquedasTipoGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoGrupoActivoFijo=this.jPanelParametrosReportesTipoGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoGrupoActivoFijo=this.jScrollPanelDatosTipoGrupoActivoFijo;
		final JTable jTableDatosTipoGrupoActivoFijo=this.jTableDatosTipoGrupoActivoFijo;		
		final JPanel jPanelPaginacionTipoGrupoActivoFijo=this.jPanelPaginacionTipoGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoActivoFijo=this.jScrollPanelDatosEdicionTipoGrupoActivoFijo;
		final JPanel jPanelAccionesTipoGrupoActivoFijo=this.jPanelAccionesTipoGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoGrupoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelCamposTipoGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelAccionesFormularioTipoGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoGrupoActivoFijo=jPanelCamposAuxiliarTipoGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoGrupoActivoFijo=jPanelAccionesFormularioAuxiliarTipoGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoGrupoActivoFijo=this.jmenuBarTipoGrupoActivoFijo;		
		final JToolBar jTtoolBarTipoGrupoActivoFijo=this.jTtoolBarTipoGrupoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jmenuBarDetalleTipoGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTtoolBarDetalleTipoGrupoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoActivoFijo=jmenuBarDetalleAuxiliarTipoGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoGrupoActivoFijo=jTtoolBarDetalleAuxiliarTipoGrupoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGrupoActivoFijo ,jPanelParametrosReportesTipoGrupoActivoFijo, jTableDatosTipoGrupoActivoFijo,/*jScrollPanelDatosTipoGrupoActivoFijo,*/jPanelCamposTipoGrupoActivoFijo,jPanelPaginacionTipoGrupoActivoFijo, /*jScrollPanelDatosEdicionTipoGrupoActivoFijo,*/ jPanelAccionesTipoGrupoActivoFijo,jPanelAccionesFormularioTipoGrupoActivoFijo,jmenuBarTipoGrupoActivoFijo,jmenuBarDetalleTipoGrupoActivoFijo,jTtoolBarTipoGrupoActivoFijo,jTtoolBarDetalleTipoGrupoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGrupoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGrupoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogrupoactivofijoConstantesFunciones.getsFinalQueryTipoGrupoActivoFijo();
		String  finalQueryPaginacionTodos=this.tipogrupoactivofijoConstantesFunciones.getsFinalQueryTipoGrupoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoTipoGrupoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesTipoGrupoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGrupoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogrupoactivofijosEliminados= new ArrayList<TipoGrupoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGrupoActivoFijo();
		
				///*TipoGrupoActivoFijoSessionBean*/this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
			
			if(this.tipogrupoactivofijoSessionBean==null) {
				this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=TipoGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGrupoActivoFijoConstantesFunciones.getClassesForeignKeysOfTipoGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogrupoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogrupoactivofijosAux= new ArrayList<TipoGrupoActivoFijo>();
			
				
			tipogrupoactivofijoLogic.setDatosCliente(this.datosCliente);
			tipogrupoactivofijoLogic.setDatosDeep(this.datosDeep);
			tipogrupoactivofijoLogic.setIsConDeep(true);
			
			
			tipogrupoactivofijoLogic.getTipoGrupoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogrupoactivofijoLogic.getTodosTipoGrupoActivoFijos(finalQueryGlobal,pagination);
					
					//tipogrupoactivofijoLogic.getTodosTipoGrupoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()==null|| tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoactivofijosAux= new ArrayList<TipoGrupoActivoFijo>();
							tipogrupoactivofijosAux.addAll(tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoactivofijosAux= new ArrayList<TipoGrupoActivoFijo>();
							tipogrupoactivofijosAux.addAll(tipogrupoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoactivofijoLogic.getTodosTipoGrupoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//tipogrupoactivofijoLogic.getTodosTipoGrupoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijoLogic.getTipoGrupoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(new ArrayList<TipoGrupoActivoFijo>());					
							tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().addAll(tipogrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoactivofijos=new ArrayList<TipoGrupoActivoFijo>();
							tipogrupoactivofijos.addAll(tipogrupoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGrupoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGrupoActivoFijo=this.idActual;
				
				} else if(this.idTipoGrupoActivoFijoActual!=null && this.idTipoGrupoActivoFijoActual!=0L) {
					idTipoGrupoActivoFijo=idTipoGrupoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndicePorId(idTipoGrupoActivoFijo);
				
				this.tipogrupoactivofijos=new ArrayList<TipoGrupoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogrupoactivofijoLogic.getEntity(idTipoGrupoActivoFijo);
					
					//tipogrupoactivofijoLogic.getEntityWithConnection(idTipoGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(new ArrayList<TipoGrupoActivoFijo>());
					tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(tipogrupoactivofijoLogic.getTipoGrupoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoactivofijos=new ArrayList<TipoGrupoActivoFijo>();
					this.tipogrupoactivofijos.add(tipogrupoactivofijo);
				}
				
				if(tipogrupoactivofijoLogic.getTipoGrupoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogrupoactivofijoLogic.getTipoGrupoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()==null||tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogrupoactivofijos==null|| tipogrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijosAux=new ArrayList<TipoGrupoActivoFijo>();
						tipogrupoactivofijosAux.addAll(tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoactivofijosAux=new ArrayList<TipoGrupoActivoFijo>();
							tipogrupoactivofijosAux.addAll(tipogrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogrupoactivofijoLogic.getTipoGrupoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGrupoActivoFijos("FK_IdPais",tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGrupoActivoFijos("FK_IdPais",tipogrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(new ArrayList<TipoGrupoActivoFijo>());
						tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().addAll(tipogrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoactivofijos=new ArrayList<TipoGrupoActivoFijo>();
							tipogrupoactivofijos.addAll(tipogrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGrupoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGrupoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGrupoActivoFijo tipogrupoactivofijo) {
		Boolean permite=true;
		
		if(this.tipogrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGrupoActivoFijoConstantesFunciones.getOrderByListaTipoGrupoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGrupoActivoFijoConstantesFunciones.getOrderByListaTipoGrupoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoActivoFijo tipogrupoactivofijo:tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				if(tipogrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoactivofijoTotales=tipogrupoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoActivoFijo tipogrupoactivofijo:this.tipogrupoactivofijos) {
				if(tipogrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoactivofijoTotales=tipogrupoactivofijo;
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
			this.tipogrupoactivofijoAux=new TipoGrupoActivoFijo();
			this.tipogrupoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.tipogrupoactivofijoAux.setIsNew(false);
			this.tipogrupoactivofijoAux.setIsChanged(false);
			this.tipogrupoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoGrupoActivoFijo(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),this.tipogrupoactivofijoAux);
				
				this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(this.tipogrupoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoGrupoActivoFijo(this.tipogrupoactivofijos,this.tipogrupoactivofijoAux);
				
				this.tipogrupoactivofijos.add(this.tipogrupoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogrupoactivofijoTotales=new TipoGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().remove(tipogrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoactivofijos.remove(tipogrupoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogrupoactivofijoTotales=new TipoGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoActivoFijo tipogrupoactivofijo:tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				if(tipogrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoactivofijoTotales=tipogrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoGrupoActivoFijo(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),tipogrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoActivoFijo tipogrupoactivofijo:this.tipogrupoactivofijos) {
				if(tipogrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoactivofijoTotales=tipogrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoGrupoActivoFijo(this.tipogrupoactivofijos,tipogrupoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGrupoActivoFijosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGrupoActivoFijoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoGrupoActivoFijosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoactivofijoLogic.getTipoGrupoActivoFijosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGrupoActivoFijoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoactivofijoLogic.getTipoGrupoActivoFijoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoGrupoActivoFijo() {
		this.isPermisoTodoTipoGrupoActivoFijo=false;
		this.isPermisoNuevoTipoGrupoActivoFijo=false;
		this.isPermisoActualizarTipoGrupoActivoFijo=false;
		this.isPermisoActualizarOriginalTipoGrupoActivoFijo=false;
		this.isPermisoEliminarTipoGrupoActivoFijo=false;
		this.isPermisoGuardarCambiosTipoGrupoActivoFijo=false;
		this.isPermisoConsultaTipoGrupoActivoFijo=false;
		this.isPermisoBusquedaTipoGrupoActivoFijo=false;
		this.isPermisoReporteTipoGrupoActivoFijo=false;		
		this.isPermisoOrdenTipoGrupoActivoFijo=false;		
		this.isPermisoPaginacionMedioTipoGrupoActivoFijo=false;		
		this.isPermisoPaginacionAltoTipoGrupoActivoFijo=false;
		this.isPermisoPaginacionTodoTipoGrupoActivoFijo=false;
		this.isPermisoCopiarTipoGrupoActivoFijo=false;		
		this.isPermisoVerFormTipoGrupoActivoFijo=false;		
		this.isPermisoDuplicarTipoGrupoActivoFijo=false;		
		this.isPermisoOrdenTipoGrupoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioTipoGrupoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoTipoGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoActivoFijo=isPermiso;
		this.isPermisoConsultaTipoGrupoActivoFijo=isPermiso;
		this.isPermisoBusquedaTipoGrupoActivoFijo=isPermiso;
		this.isPermisoReporteTipoGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoCopiarTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoVerFormTipoGrupoActivoFijo=isPermiso;		
		this.isPermisoDuplicarTipoGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoGrupoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGrupoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoTipoGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoActivoFijo=isPermiso;
		//this.isPermisoConsultaTipoGrupoActivoFijo=isPermiso;
		//this.isPermisoBusquedaTipoGrupoActivoFijo=isPermiso;
		//this.isPermisoReporteTipoGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGrupoActivoFijo=isPermiso;		
		//this.isPermisoCopiarTipoGrupoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarTipoGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoGrupoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGrupoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGrupoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGrupoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGrupoActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGrupoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGrupoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGrupoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGrupoActivoFijo=this.isPermisoActualizarTipoGrupoActivoFijo;
			this.isPermisoEliminarTipoGrupoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGrupoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGrupoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGrupoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGrupoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGrupoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGrupoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGrupoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGrupoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGrupoActivoFijo.setToolTipText(this.jTableDatosTipoGrupoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGrupoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGrupoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGrupoActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyTipoGrupoActivoFijoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGrupoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGrupoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoReturnGeneral=new TipoGrupoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipogrupoactivofijoConstantesFunciones.cargarid_paisTipoGrupoActivoFijo)
					 || (this.esRecargarFks && this.tipogrupoactivofijoConstantesFunciones.cargarid_paisTipoGrupoActivoFijo)) {

					if(!this.tipogrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipogrupoactivofijoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogrupoactivofijoReturnGeneral=tipogrupoactivofijoLogic.cargarCombosLoteForeignKeyTipoGrupoActivoFijo(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipogrupoactivofijoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGrupoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipogrupoactivofijoSessionBean==null) {
				this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
			}

			if(!this.tipogrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoGrupoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGrupoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipogrupoactivofijo.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGrupoActivoFijo()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipogrupoactivofijoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGrupoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGrupoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGrupoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo!=null && this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGrupoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGrupoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrupoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean(); 
		this.tipogrupoactivofijoConstantesFunciones=new TipoGrupoActivoFijoConstantesFunciones(); 
		this.tipogrupoactivofijoBean=new TipoGrupoActivoFijo();//(this.tipogrupoactivofijoConstantesFunciones); 		
		this.tipogrupoactivofijoReturnGeneral=new TipoGrupoActivoFijoParameterReturnGeneral(); 
		
		this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGrupoActivoFijo(true);
			
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
			
			this.tipogrupoactivofijoConstantesFunciones=new TipoGrupoActivoFijoConstantesFunciones(); 
			this.tipogrupoactivofijoBean=new TipoGrupoActivoFijo();//this.tipogrupoactivofijoConstantesFunciones); 			
			this.tipogrupoactivofijoReturnGeneral=new TipoGrupoActivoFijoParameterReturnGeneral(); 
		
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogrupoactivofijo=new TipoGrupoActivoFijo();
			this.tipogrupoactivofijos = new ArrayList<TipoGrupoActivoFijo>();
			this.tipogrupoactivofijosAux = new ArrayList<TipoGrupoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic=new TipoGrupoActivoFijoLogic();
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGrupoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionTipoGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGrupoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoActivoFijo);
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo);
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoActivoFijo);
					this.jInternalFrameImportacionTipoGrupoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionTipoGrupoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoActivoFijo);
					this.jInternalFrameOrderByTipoGrupoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByTipoGrupoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGrupoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogrupoactivofijoReturnGeneral=new TipoGrupoActivoFijoParameterReturnGeneral();
			
			this.tipogrupoactivofijoParameterGeneral=new TipoGrupoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogrupoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGrupoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGrupoActivoFijo(false);
			
			this.setPermisosUsuarioTipoGrupoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGrupoActivoFijoClasesRelacionadas();
			}
			
			if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGrupoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGrupoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaTipoGrupoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGrupoActivoFijo,this.isPermisoPaginacionMedioTipoGrupoActivoFijo,this.isPermisoPaginacionTodoTipoGrupoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGrupoActivoFijoConstantesFunciones.getTiposSeleccionarTipoGrupoActivoFijo());
				
				this.tiposColumnasSelect=TipoGrupoActivoFijoConstantesFunciones.getTiposSeleccionarTipoGrupoActivoFijo(true);
				
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
			//if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGrupoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGrupoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGrupoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoActivoFijo() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipogrupoactivofijoImplementable= (TipoGrupoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogrupoactivofijoImplementableHome= (TipoGrupoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogrupoactivofijos= new ArrayList<TipoGrupoActivoFijo>();
			this.tipogrupoactivofijosEliminados= new ArrayList<TipoGrupoActivoFijo>();
						
			this.isEsNuevoTipoGrupoActivoFijo=false;
			this.esParaAccionDesdeFormularioTipoGrupoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGrupoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGrupoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGrupoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGrupoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGrupoActivoFijo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGrupoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGrupoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGrupoActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGrupoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGrupoActivoFijo();	
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
	
	public void cargarCombosForeignKeyTipoGrupoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGrupoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGrupoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGrupoActivoFijo();
		
		this.cargarCombosFrameForeignKeyTipoGrupoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGrupoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGrupoActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			
			if(jTableDatosTipoGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoGrupoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGrupoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGrupoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(true);			
			//this.tipogrupoactivofijo=new TipoGrupoActivoFijo();
			//this.tipogrupoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo() ;
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogrupoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);				
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGrupoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGrupoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoActivoFijo.getSelectedRows().length;			
			}
			
			tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGrupoActivoFijo--;			
				//TipoGrupoActivoFijo tipogrupoactivofijoAux= new TipoGrupoActivoFijo();			
				//tipogrupoactivofijoAux.setId(this.iIdNuevoTipoGrupoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGrupoActivoFijo tipogrupoactivofijoOrigen=new TipoGrupoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGrupoActivoFijo tipogrupoactivofijoOrigen : tipogrupoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogrupoactivofijoOrigen =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoactivofijoOrigen =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGrupoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogrupoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGrupoActivoFijo(tipogrupoactivofijoOrigen,this.tipogrupoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(this.tipogrupoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoactivofijos.add(this.tipogrupoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
				
				this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoActivoFijo(), this.getIndiceNuevoTipoGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();									
		
			TipoGrupoActivoFijo tipogrupoactivofijoOrigen=new TipoGrupoActivoFijo();
			TipoGrupoActivoFijo tipogrupoactivofijoDestino=new TipoGrupoActivoFijo();
				
			tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogrupoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGrupoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoOrigen =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoactivofijoOrigen =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoactivofijoDestino =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoactivofijoDestino =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogrupoactivofijoOrigen =tipogrupoactivofijosSeleccionados.get(0);
				tipogrupoactivofijoDestino =tipogrupoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGrupoActivoFijo(tipogrupoactivofijoOrigen,tipogrupoactivofijoDestino,true,false);
				
				tipogrupoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoactivofijoDestino,tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoactivofijoDestino,tipogrupoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
				
				//this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoActivoFijo(), this.getIndiceNuevoTipoGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGrupoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesTipoGrupoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGrupoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGrupoActivoFijo();
			
			this.abrirFrameOrderByTipoGrupoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGrupoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSize(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGrupoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGrupoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jContentPaneDetalleTipoGrupoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jContentPaneDetalleTipoGrupoActivoFijo.getWidth(),TipoGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jContentPaneDetalleTipoGrupoActivoFijo.getWidth(),TipoGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jContentPaneDetalleTipoGrupoActivoFijo.getWidth(),TipoGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGrupoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByTipoGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoActivoFijo);
				this.jInternalFrameOrderByTipoGrupoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByTipoGrupoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByTipoGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGrupoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGrupoActivoFijo==null) {
				
				this.jInternalFrameImportacionTipoGrupoActivoFijo=new ImportacionJInternalFrame(TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoActivoFijo);
				this.jInternalFrameImportacionTipoGrupoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionTipoGrupoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoActivoFijo"));
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoActivoFijo"));
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo=new ReporteDinamicoJInternalFrame(TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo);
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoGrupoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoActivoFijo);
			
	       	this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGrupoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormTipoGrupoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionTipoGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByTipoGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByTipoGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGrupoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionTipoGrupoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGrupoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGrupoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(true);
			//this.isEsNuevoTipoGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false) ;
			
			if(tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGrupoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGrupoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(true);
			//this.isEsNuevoTipoGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogrupoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false) ;
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoActivoFijo(false);
			
			//if(!this.isEsNuevoTipoGrupoActivoFijo) {								
				int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.tipogrupoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGrupoActivoFijo=true;
					this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
					this.isEsNuevoTipoGrupoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGrupoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGrupoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(false);
			
												
				
				if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGrupoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,tipogrupoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogrupoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogrupoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogrupoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGrupoActivoFijoModel) this.jTableDatosTipoGrupoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGrupoActivoFijo=true;
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
				this.isEsNuevoTipoGrupoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(false);
				
				
				
				if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGrupoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoGrupoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGrupoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(false) ;
			
			this.isEsNuevoTipoGrupoActivoFijo=false;
			
			if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGrupoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
				
				//SI ES MANUAL
				if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGrupoActivoFijo--;			
			//TipoGrupoActivoFijo tipogrupoactivofijoAux= new TipoGrupoActivoFijo();			
			//tipogrupoactivofijoAux.setId(this.iIdNuevoTipoGrupoActivoFijo);
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGrupoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
			
			this.tipogrupoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().add(this.tipogrupoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogrupoactivofijos.add(this.tipogrupoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			
			this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoActivoFijo(), this.getIndiceNuevoTipoGrupoActivoFijo());
			
			int iLastRow =  this.jTableDatosTipoGrupoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGrupoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGrupoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();
			}
			
			//this.abrirFrameTreeTipoGrupoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Grupo Activo FijoS ?", "MANTENIMIENTO DE Tipo Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGrupoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGrupoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogrupoactivofijoReturnGeneral=tipogrupoactivofijoLogic.procesarImportacionTipoGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogrupoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGrupoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGrupoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGrupoActivoFijo.setFileImportacion(this.jInternalFrameImportacionTipoGrupoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGrupoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGrupoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		

		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGrupoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGrupoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoGrupoActivoFijo tipogrupoactivofijo:tipogrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogrupoactivofijo.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGrupoActivoFijo tipogrupoactivofijo:tipogrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogrupoactivofijo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGrupoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGrupoActivoFijo(tipogrupoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGrupoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGrupoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGrupoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGrupoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGrupoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGrupoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGrupoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGrupoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGrupoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGrupoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGrupoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGrupoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGrupoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGrupoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGrupoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGrupoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoActivoFijo() throws Exception {
		try	{
			if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGrupoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGrupoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoGrupoActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGrupoActivoFijo(Boolean esInicializar) throws Exception {				
		if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGrupoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGrupoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGrupoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGrupoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogrupoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGrupoActivoFijo.setModel(new TipoGrupoActivoFijoModel(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGrupoActivoFijo.setModel(new TipoGrupoActivoFijoModel(this.tipogrupoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGrupoActivoFijo!=null && this.jInternalFrameOrderByTipoGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGrupoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipogrupoactivofijoConstantesFunciones.resaltarSeleccionarTipoGrupoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipogrupoactivofijoConstantesFunciones.resaltarSeleccionarTipoGrupoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,TipoGrupoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.tipogrupoactivofijoConstantesFunciones.mostraridTipoGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogrupoactivofijoConstantesFunciones.resaltaridTipoGrupoActivoFijo,this.tipogrupoactivofijoConstantesFunciones.activaridTipoGrupoActivoFijo,this,true,"idTipoGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoactivofijoConstantesFunciones.resaltaridTipoGrupoActivoFijo,this.tipogrupoactivofijoConstantesFunciones.activaridTipoGrupoActivoFijo,this,true,"idTipoGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipogrupoactivofijoConstantesFunciones.mostrarid_paisTipoGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipogrupoactivofijoConstantesFunciones.resaltarid_paisTipoGrupoActivoFijo,this,this.tipogrupoactivofijoConstantesFunciones.activarid_paisTipoGrupoActivoFijo));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipogrupoactivofijoConstantesFunciones.resaltarid_paisTipoGrupoActivoFijo,this,this.tipogrupoactivofijoConstantesFunciones.activarid_paisTipoGrupoActivoFijo,true,"id_paisTipoGrupoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogrupoactivofijoConstantesFunciones.mostrarnombreTipoGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogrupoactivofijoConstantesFunciones.resaltarnombreTipoGrupoActivoFijo,this.tipogrupoactivofijoConstantesFunciones.activarnombreTipoGrupoActivoFijo,this,true,"nombreTipoGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoactivofijoConstantesFunciones.resaltarnombreTipoGrupoActivoFijo,this.tipogrupoactivofijoConstantesFunciones.activarnombreTipoGrupoActivoFijo,this,true,"nombreTipoGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGrupoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGrupoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGrupoActivoFijo.moveColumn(this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGrupoActivoFijo.moveColumn(this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGrupoActivoFijo.moveColumn(this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGrupoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGrupoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGrupoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGrupoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGrupoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGrupoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogrupoactivofijos.size()-1;
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
		//this.jTableDatosTipoGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGrupoActivoFijo();
			
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
				
				//this.isEsNuevoTipoGrupoActivoFijo=false;
					
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
				if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogrupoactivofijo.getsType().equals("DUPLICADO")
				   || this.tipogrupoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGrupoActivoFijo=true;
				
				} else {
					this.isEsNuevoTipoGrupoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogrupoactivofijo.getId()>=0 && !this.tipogrupoactivofijo.getIsNew()) {						
						this.isEsNuevoTipoGrupoActivoFijo=false;
						
					} else {
						this.isEsNuevoTipoGrupoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGrupoActivoFijo(esRelaciones);						
				
				this.seleccionarTipoGrupoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogrupoactivofijo.getId()<0) {
					this.isEsNuevoTipoGrupoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGrupoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGrupoActivoFijo(evt,rowIndex);
				}	
				
				if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGrupoActivoFijo: " + this.dDif); 
					}
				}								
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGrupoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogrupoactivofijo)) {
					if(this.tipogrupoactivofijo.getId()>0) {
						this.tipogrupoactivofijo.setIsDeleted(true);
						
						this.tipogrupoactivofijosEliminados.add(this.tipogrupoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().remove(this.tipogrupoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoactivofijos.remove(this.tipogrupoactivofijo);				
					}
					
					
					((TipoGrupoActivoFijoModel) this.jTableDatosTipoGrupoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGrupoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGrupoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipogrupoactivofijoConstantesFunciones.cargarid_paisTipoGrupoActivoFijo || this.tipogrupoactivofijoConstantesFunciones.event_dependid_paisTipoGrupoActivoFijo) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipogrupoactivofijo.getid_pais());
									//this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipogrupoactivofijo.getPais()!=null) {
							this.paissForeignKey.add(tipogrupoactivofijo.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipogrupoactivofijo.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGrupoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGrupoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGrupoActivoFijo(tipogrupoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(tipogrupoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGrupoActivoFijo(tipogrupoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoActivoFijo(tipogrupoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setText(tipogrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setText(tipogrupoactivofijo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGrupoActivoFijo tipogrupoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogrupoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGrupoActivoFijo tipogrupoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogrupoactivofijoLocal=this.tipogrupoactivofijo;
			} else {
				tipogrupoactivofijoLocal=this.tipogrupoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogrupoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGrupoActivoFijo(tipogrupoactivofijoLocal,true);
					
					if(tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogrupoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogrupoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(tipogrupoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(tipogrupoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(tipogrupoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.getText()==null || this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setText("0");
			}

			if(conColumnasBase) {tipogrupoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelIdTipoGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogrupoactivofijo.setnombre(this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jLabelnombreTipoGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijoBean,TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipogrupoactivofijoBean.getid_pais()!=null && !tipogrupoactivofijoBean.getid_pais().equals(-1L))) {tipogrupoactivofijo.setid_pais(tipogrupoactivofijoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijoOrigen,TipoGrupoActivoFijo tipogrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoactivofijoOrigen.getId()!=null && !tipogrupoactivofijoOrigen.getId().equals(0L))) {tipogrupoactivofijo.setId(tipogrupoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && tipogrupoactivofijoOrigen.getid_pais()!=null && !tipogrupoactivofijoOrigen.getid_pais().equals(-1L))) {tipogrupoactivofijo.setid_pais(tipogrupoactivofijoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipogrupoactivofijoOrigen.getnombre()!=null && !tipogrupoactivofijoOrigen.getnombre().equals(""))) {tipogrupoactivofijo.setnombre(tipogrupoactivofijoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setText(tipogrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setText(tipogrupoactivofijo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoActivoFijo(TipoGrupoActivoFijoBean tipogrupoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setText(tipogrupoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setText(tipogrupoactivofijoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGrupoActivoFijo(TipoGrupoActivoFijoParameterReturnGeneral tipogrupoactivofijoReturnGeneral,TipoGrupoActivoFijoBean tipogrupoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			TipoGrupoActivoFijo tipogrupoactivofijoLocal=new TipoGrupoActivoFijo();
			
			tipogrupoactivofijoLocal=tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoactivofijoLocal.getId()!=null && !tipogrupoactivofijoLocal.getId().equals(0L))) {tipogrupoactivofijoBean.setId(tipogrupoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && tipogrupoactivofijoLocal.getid_pais()!=null && !tipogrupoactivofijoLocal.getid_pais().equals(-1L))) {tipogrupoactivofijoBean.setid_pais(tipogrupoactivofijoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipogrupoactivofijoLocal.getnombre()!=null && !tipogrupoactivofijoLocal.getnombre().equals(""))) {tipogrupoactivofijoBean.setnombre(tipogrupoactivofijoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGrupoActivoFijoGenerico(Long idTipoGrupoActivoFijoSeleccionado,JComboBox jComboBoxTipoGrupoActivoFijo,List<TipoGrupoActivoFijo> tipogrupoactivofijosLocal)throws Exception {
		try {
			TipoGrupoActivoFijo  tipogrupoactivofijoTemp=null;

			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosLocal) {
				if(tipogrupoactivofijoAux.getId()!=null && tipogrupoactivofijoAux.getId().equals(idTipoGrupoActivoFijoSeleccionado)) {
					tipogrupoactivofijoTemp=tipogrupoactivofijoAux;
					break;
				}
			}

			jComboBoxTipoGrupoActivoFijo.setSelectedItem(tipogrupoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGrupoActivoFijoGenerico(JComboBox jComboBoxTipoGrupoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoactivofijo=(TipoGrupoActivoFijo) tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoactivofijo =(TipoGrupoActivoFijo) tipogrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipogrupoactivofijo.getIsNew() && !tipogrupoactivofijo.getIsChanged() && !tipogrupoactivofijo.getIsDeleted()) {
				sDescripcion=tipogrupoactivofijo.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipogrupoactivofijo.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGrupoActivoFijo tipogrupoactivofijoRow=new TipoGrupoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoactivofijoRow=(TipoGrupoActivoFijo) tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoactivofijoRow=(TipoGrupoActivoFijo) tipogrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));			
			this.jButtonDuplicarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo && this.isPermisoDuplicarTipoGrupoActivoFijo));			
			this.jButtonCopiarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo && this.isPermisoCopiarTipoGrupoActivoFijo));
			this.jButtonVerFormTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo && this.isPermisoVerFormTipoGrupoActivoFijo));
			
			this.jButtonAbrirOrderByTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));			
			
			this.jButtonNuevoRelacionesTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoGrupoActivoFijo && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo && this.isPermisoEliminarTipoGrupoActivoFijo));
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo);							
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));						
			this.jButtonDuplicarToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo && this.isPermisoDuplicarTipoGrupoActivoFijo));						
			this.jButtonCopiarToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo && this.isPermisoCopiarTipoGrupoActivoFijo));			
			this.jButtonVerFormToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo && this.isPermisoVerFormTipoGrupoActivoFijo));			
			this.jButtonAbrirOrderByToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));
			this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoGrupoActivoFijo && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo  && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo && this.isPermisoEliminarTipoGrupoActivoFijo));
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarToolBarTipoGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo);				
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));			
			this.jMenuItemDuplicarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo && this.isPermisoDuplicarTipoGrupoActivoFijo));			
			this.jMenuItemCopiarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo && this.isPermisoCopiarTipoGrupoActivoFijo));			
			this.jMenuItemVerFormTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo && this.isPermisoVerFormTipoGrupoActivoFijo));			
			this.jMenuItemAbrirOrderByTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));			
			//this.jMenuItemMostrarOcultarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo && this.isPermisoOrdenTipoGrupoActivoFijo));			
			this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo && this.isPermisoNuevoTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemModificarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoGrupoActivoFijo && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemActualizarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo && this.isPermisoActualizarTipoGrupoActivoFijo));	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemEliminarTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo && this.isPermisoEliminarTipoGrupoActivoFijo));
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemCancelarTipoGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=this.jButtonNuevoTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo=this.jButtonDuplicarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo=this.jButtonCopiarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo=this.jButtonVerFormTipoGrupoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGrupoActivoFijo=this.jButtonAbrirOrderByTipoGrupoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=this.jButtonNuevoRelacionesTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=this.jButtonModificarTipoGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=this.jButtonNuevoToolBarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarToolBarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarToolBarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarToolBarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarToolBarTipoGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=this.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=this.jMenuItemNuevoTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemModificarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemActualizarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemEliminarTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemCancelarTipoGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGrupoActivoFijo(Boolean esInicializar) {
		if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGrupoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGrupoActivoFijo() {
		this.jButtonNuevoTipoGrupoActivoFijo.setVisible(this.isPermisoNuevoTipoGrupoActivoFijo);			
		this.jButtonDuplicarTipoGrupoActivoFijo.setVisible(this.isPermisoDuplicarTipoGrupoActivoFijo);			
		this.jButtonCopiarTipoGrupoActivoFijo.setVisible(this.isPermisoCopiarTipoGrupoActivoFijo);			
		this.jButtonVerFormTipoGrupoActivoFijo.setVisible(this.isPermisoVerFormTipoGrupoActivoFijo);			
		
		this.jButtonAbrirOrderByTipoGrupoActivoFijo.setVisible(this.isPermisoOrdenTipoGrupoActivoFijo);					
		
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.setVisible(this.isPermisoNuevoTipoGrupoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarTipoGrupoActivoFijo.setVisible(this.isPermisoActualizarTipoGrupoActivoFijo);	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.setVisible(this.isPermisoActualizarTipoGrupoActivoFijo);	
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.setVisible(this.isPermisoEliminarTipoGrupoActivoFijo);
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo);						
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.setVisible(this.isPermisoGuardarCambiosTipoGrupoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setVisible(this.isPermisoActualizarTipoGrupoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoActivoFijo() {
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarTipoGrupoActivoFijo.setVisible(this.isPermisoActualizarTipoGrupoActivoFijo);	
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.setVisible(this.isPermisoActualizarTipoGrupoActivoFijo);	
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.setVisible(this.isPermisoEliminarTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo);							
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo && this.isPermisoGuardarCambiosTipoGrupoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGrupoActivoFijo() {
		if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGrupoActivoFijo() {
	}
	
	public void jTableDatosTipoGrupoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGrupoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.gettipogrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoactivofijo==null) {
						this.tipogrupoactivofijo = new TipoGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				}

				if(this.tipogrupoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogrupoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoGrupoActivoFijo(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.gettipogrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipogrupoactivofijoLogic.getConnexion());

				if(this.tipogrupoactivofijo.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipogrupoactivofijo.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosTipoGrupoActivoFijo.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoGrupoActivoFijo.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.gettipogrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoactivofijo==null) {
						this.tipogrupoactivofijo = new TipoGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				}

				if(this.tipogrupoactivofijo.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipogrupoactivofijo.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.gettipogrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoactivofijo==null) {
						this.tipogrupoactivofijo = new TipoGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);
				}

				if(this.tipogrupoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogrupoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);

			this.getTipoGrupoActivoFijosFK_IdPais();

			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);

			//if(TipoGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGrupoActivoFijo() {
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.dispose();
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionTipoGrupoActivoFijo!=null) {
			this.jInternalFrameImportacionTipoGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGrupoActivoFijo.dispose();
			this.jInternalFrameImportacionTipoGrupoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGrupoActivoFijo();
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGrupoActivoFijo")) {
				jButtonDuplicarTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGrupoActivoFijo")) {
				jButtonCopiarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGrupoActivoFijo")) {
				jButtonVerFormTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGrupoActivoFijo")) {
				jButtonDuplicarTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGrupoActivoFijo")) {
				jButtonDuplicarTipoGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGrupoActivoFijo")) {
				jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGrupoActivoFijo")) {
				jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGrupoActivoFijo")) {
				jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGrupoActivoFijo")) {
				jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGrupoActivoFijo")) {
				jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGrupoActivoFijo")) {
				jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGrupoActivoFijo")) {
				jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGrupoActivoFijo")) {
				jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGrupoActivoFijo")) {
				jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGrupoActivoFijo")) {
				jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGrupoActivoFijo")) {
				jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGrupoActivoFijo")) {
				jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGrupoActivoFijo")) {
				jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGrupoActivoFijo")) {
				jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGrupoActivoFijo")) {
				jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGrupoActivoFijo")) {
				jButtonMostrarOcultarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGrupoActivoFijo")) {
				jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGrupoActivoFijo")) {
				jButtonCopiarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGrupoActivoFijo")) {
				jButtonVerFormTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGrupoActivoFijo")) {
				jButtonCopiarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGrupoActivoFijo")) {
				jButtonVerFormTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGrupoActivoFijo")) {
				jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGrupoActivoFijo")) {
				jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGrupoActivoFijo")) {
				jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGrupoActivoFijo")) {
				jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGrupoActivoFijo")) {
				jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGrupoActivoFijo")) {
				jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGrupoActivoFijo")) {
				jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGrupoActivoFijo")) {
				jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGrupoActivoFijo")) {
				jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGrupoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGrupoActivoFijo")) {
				jButtonAbrirOrderByTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGrupoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGrupoActivoFijo")) {
				jButtonMostrarOcultarTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGrupoActivoFijo")) {
				jButtonCerrarReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGrupoActivoFijo")) {
				jButtonGenerarReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGrupoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGrupoActivoFijo")) {
				jButtonCerrarImportacionTipoGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGrupoActivoFijo")) {
				
				jButtonGenerarImportacionTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGrupoActivoFijo")) {
				
				jButtonAbrirImportacionTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGrupoActivoFijo")) {
				jComboBoxTiposAccionesTipoGrupoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGrupoActivoFijo")) {
				jComboBoxTiposRelacionesTipoGrupoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGrupoActivoFijo")) {
				jComboBoxTiposAccionesTipoGrupoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGrupoActivoFijo")) {
				
				jComboBoxTiposSeleccionarTipoGrupoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGrupoActivoFijo")) {
				jTextFieldValorCampoGeneralTipoGrupoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGrupoActivoFijo")) {
				jButtonAbrirOrderByTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGrupoActivoFijo")) {
				jButtonAbrirOrderByTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGrupoActivoFijo")) {
				jButtonCerrarOrderByTipoGrupoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoActivoFijoBusqueda")) {
				this.jButtonidTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGrupoActivoFijoUpdate")) {
				this.jButtonid_paisTipoGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGrupoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoActivoFijoBusqueda")) {
				this.jButtonnombreTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoGrupoActivoFijo")) {
				this.jButtonFK_IdPaisTipoGrupoActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGrupoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGrupoActivoFijo tipogrupoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogrupoactivofijoLocal=this.tipogrupoactivofijo;
			} else {
				tipogrupoactivofijoLocal=this.tipogrupoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
							
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
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
			
			


			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
								
						
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
								
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
							
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
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
			
			


			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
								
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGrupoActivoFijo")) {
					jCheckBoxSeleccionarTodosTipoGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGrupoActivoFijo")) {
					jCheckBoxSeleccionadosTipoGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGrupoActivoFijo")) {
					
				}
				
				


				
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
												
				
				


				
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
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
			
			


			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoactivofijo);
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
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
				
				


				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoactivofijoAnterior =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGrupoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGrupoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogrupoactivofijo =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogrupoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGrupoActivoFijo")) {
				
				}
				
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGrupoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGrupoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGrupoActivoFijo")) {
			
			}
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGrupoActivoFijo();
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGrupoActivoFijo")) {
				jButtonDuplicarTipoGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGrupoActivoFijo")) {
				jButtonCopiarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGrupoActivoFijo")) {
				jButtonVerFormTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoActivoFijo")) {
				jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGrupoActivoFijo")) {
				jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGrupoActivoFijo")) {
				jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGrupoActivoFijo")) {
				jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGrupoActivoFijo")) {
				jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGrupoActivoFijo")) {
				jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGrupoActivoFijo")) {
				jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGrupoActivoFijo")) {
				jButtonAbrirOrderByTipoGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGrupoActivoFijo")) {
				jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGrupoActivoFijo")) {
				jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGrupoActivoFijo")) {
				jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoActivoFijoBusqueda")) {
				this.jButtonidTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGrupoActivoFijoUpdate")) {
				this.jButtonid_paisTipoGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGrupoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoActivoFijoBusqueda")) {
				this.jButtonnombreTipoGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGrupoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGrupoActivoFijo")) {
				closingInternalFrameTipoGrupoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarTipoGrupoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGrupoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGrupoActivoFijoActionPerformed(null);
			}
			
			TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoactivofijo,new Object(),this.tipogrupoactivofijoParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogrupoactivofijo)) {
			if(!esControlTabla) {
				if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);			
				}
				
				if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoactivofijoReturnGeneral=tipogrupoactivofijoLogic.procesarEventosTipoGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),this.tipogrupoactivofijo,this.tipogrupoactivofijoParameterGeneral,this.isEsNuevoTipoGrupoActivoFijo,classes);//this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral,this.tipogrupoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoActivoFijo(classes,this.tipogrupoactivofijoReturnGeneral,this.tipogrupoactivofijoBean,false);
					}
						
					if(this.tipogrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo());	
					}
						
					if(this.tipogrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo(),classes);//this.tipogrupoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoActivoFijo(this.tipogrupoactivofijo,classes);//this.tipogrupoactivofijoBean);									
				}
			
				if(TipoGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGrupoActivoFijo(this.tipogrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoActivoFijo(this.tipogrupoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogrupoactivofijoAnterior!=null) {
						this.tipogrupoactivofijo=this.tipogrupoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoactivofijoReturnGeneral=tipogrupoactivofijoLogic.procesarEventosTipoGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos(),this.tipogrupoactivofijo,this.tipogrupoactivofijoParameterGeneral,this.isEsNuevoTipoGrupoActivoFijo,classes);//this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo(),tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo(),this.tipogrupoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGrupoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGrupoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGrupoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGrupoActivoFijo() throws Exception {
		
		TipoGrupoActivoFijoModel tipogrupoactivofijoModel=(TipoGrupoActivoFijoModel)this.jTableDatosTipoGrupoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoactivofijoModel.tipogrupoactivofijos=this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogrupoactivofijoModel.tipogrupoactivofijos=this.tipogrupoactivofijos;
		}
		
		
		((TipoGrupoActivoFijoModel) this.jTableDatosTipoGrupoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGrupoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogrupoactivofijoAnterior(),this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogrupoactivofijoAnterior(),this.tipogrupoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGrupoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoactivofijo,new Object(),generalEntityParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGrupoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGrupoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoactivofijo,new Object(),generalEntityParameterGeneral,this.tipogrupoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGrupoActivoFijo(TipoGrupoActivoFijoBean tipogrupoactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoActivoFijo(ArrayList<Classe> classes,TipoGrupoActivoFijoReturnGeneral tipogrupoactivofijoReturnGeneral,TipoGrupoActivoFijoBean tipogrupoactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogrupoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo = new TipoGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones(),this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.tipogrupoactivofijoLogic=this.tipogrupoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyTipoGrupoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGrupoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoActivoFijo"));
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoActivoFijo"));

		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemModificarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoActivoFijo"));
						
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemActualizarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoActivoFijo"));
								
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemEliminarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemCancelarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemDetalleCerrarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonidTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonnombreTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoActivoFijo"));
		}
		
		this.jTableDatosTipoGrupoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGrupoActivoFijo"));
		
		this.jTableDatosTipoGrupoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGrupoActivoFijo"));
		
		this.jButtonNuevoTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoTipoGrupoActivoFijo"));
		
		this.jButtonDuplicarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarTipoGrupoActivoFijo"));
		
		this.jButtonCopiarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarTipoGrupoActivoFijo"));
		
		this.jButtonVerFormTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormTipoGrupoActivoFijo"));
		
		
		this.jButtonNuevoToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGrupoActivoFijo"));
			
		this.jButtonDuplicarToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemNuevoTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGrupoActivoFijo"));
			
		this.jMenuItemDuplicarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGrupoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGrupoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonModificarToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemModificarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonActualizarToolBarTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoActivoFijo"));
				
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemActualizarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonEliminarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoActivoFijo"));
						
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemEliminarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonCancelarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemCancelarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGrupoActivoFijo"));		
		
		
		this.jButtonCerrarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarTipoGrupoActivoFijo"));
		
		
		this.jButtonCerrarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemCerrarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGrupoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jMenuItemDetalleCerrarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGrupoActivoFijo"));
			
		this.jButtonVerFormToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGrupoActivoFijo"));
		
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGrupoActivoFijo"));
			
		this.jMenuItemCopiarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGrupoActivoFijo"));		
		
		this.jMenuItemVerFormTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGrupoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGrupoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGrupoActivoFijo"));
		
		this.jMenuItemRecargarInformacionTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGrupoActivoFijo"));		
		
		
		
		this.jButtonAnterioresTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresTipoGrupoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGrupoActivoFijo"));
		
		this.jMenuItemAnterioresTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGrupoActivoFijo"));		
		
		
		this.jButtonSiguientesTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesTipoGrupoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemSiguientesTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGrupoActivoFijo"));
			
		this.jMenuItemAbrirOrderByTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGrupoActivoFijo"));
			
		this.jMenuItemMostrarOcultarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGrupoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGrupoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGrupoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGrupoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGrupoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGrupoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGrupoActivoFijo"));

		this.jCheckBoxSeleccionadosTipoGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGrupoActivoFijo"));
			
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGrupoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGrupoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonidTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonnombreTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGrupoActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGrupoActivoFijo!=null) {
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoActivoFijo"));
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoActivoFijo"));
				this.jInternalFrameImportacionTipoGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGrupoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarTipoGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGrupoActivoFijo"));			
			
			if(this.jInternalFrameOrderByTipoGrupoActivoFijo!=null) {
				this.jInternalFrameOrderByTipoGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTabbedPaneRelacionesTipoGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoActivoFijo"));
		
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
            		closingInternalFrameTipoGrupoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGrupoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            TipoGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGrupoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGrupoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGrupoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGrupoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGrupoActivoFijo";
		inputMap = this.jButtonModificarTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGrupoActivoFijo";
		inputMap = this.jButtonActualizarTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGrupoActivoFijo";
		inputMap = this.jButtonEliminarTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGrupoActivoFijo";
		inputMap = this.jButtonCancelarTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGrupoActivoFijo";
		inputMap = this.jButtonCerrarTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGrupoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonGuardarCambiosTipoGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGrupoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGrupoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonidTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonid_paisTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jButtonnombreTipoGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGrupoActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGrupoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGrupoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
					tipogrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijos) {
					tipogrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
						tipogrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijos) {
						tipogrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGrupoActivoFijo.getSelectedRows();
			
			TipoGrupoActivoFijo tipogrupoactivofijoLocal=new TipoGrupoActivoFijo();
			
			//this.seleccionarTodosTipoGrupoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoactivofijoLocal =(TipoGrupoActivoFijo) this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos().toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogrupoactivofijoLocal =(TipoGrupoActivoFijo) this.tipogrupoactivofijos.toArray()[this.jTableDatosTipoGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogrupoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
						tipogrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijos) {
						tipogrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGrupoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGrupoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGrupoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijos) {
					
						if(sTipoSeleccionar.equals(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGrupoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGrupoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGrupoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGrupoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGrupoActivoFijo(conSplash);
				
					this.generarReporteTipoGrupoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoActivoFijo();
				
				this.exportarTipoGrupoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGrupoActivoFijos();
				//this.importarTipoGrupoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGrupoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGrupoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGrupoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGrupoActivoFijo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGrupoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGrupoActivoFijo();
			
			if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
			TipoGrupoActivoFijo tipogrupoactivofijo=new TipoGrupoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGrupoActivoFijo.getSelectedItem();
			
			
			
			
			tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogrupoactivofijosSeleccionados.size()==1) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
					tipogrupoactivofijo=tipogrupoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGrupoActivoFijo();
			
      		//this.finishProcessTipoGrupoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGrupoActivoFijoReturnGeneral() throws Exception {
		if(this.tipogrupoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogrupoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogrupoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogrupoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
		}
		
		if(this.tipogrupoactivofijoReturnGeneral.getConRetornoLista() || this.tipogrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogrupoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoactivofijoLogic.setTipoGrupoActivoFijos(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoactivofijoLogic.setTipoGrupoActivoFijo(this.tipogrupoactivofijoReturnGeneral.getTipoGrupoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGrupoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGrupoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<TipoGrupoActivoFijo> getTipoGrupoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGrupoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijoLogic.getTipoGrupoActivoFijos()) {
					if(tipogrupoactivofijoAux.getIsSelected()) {
						tipogrupoactivofijosSeleccionados.add(tipogrupoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoActivoFijo tipogrupoactivofijoAux:this.tipogrupoactivofijos) {
					if(tipogrupoactivofijoAux.getIsSelected()) {
						tipogrupoactivofijosSeleccionados.add(tipogrupoactivofijoAux);				
					}
				}
			}
			
			if(tipogrupoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogrupoactivofijosSeleccionados.addAll(this.tipogrupoactivofijoLogic.getTipoGrupoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogrupoactivofijosSeleccionados.addAll(this.tipogrupoactivofijos);				
					}
				}
			}
		} else {
			tipogrupoactivofijosSeleccionados.add(this.tipogrupoactivofijo);
		}
		
		return tipogrupoactivofijosSeleccionados;
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
	
	public void generarReporteTipoGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGrupoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGrupoActivoFijo();
		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGrupoActivoFijo();
		
		
		//this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados ,tipogrupoactivofijoImplementable,tipogrupoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionTipoGrupoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGrupoActivoFijo();
		
		this.abrirFrameImportacionTipoGrupoActivoFijo();		
		
			
		//this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados ,tipogrupoactivofijoImplementable,tipogrupoactivofijoImplementableHome);
	}
	
	public void importarTipoGrupoActivoFijos() throws Exception {		
	
	}
	
	public void exportarTipoGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGrupoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGrupoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGrupoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGrupoActivoFijo(tipogrupoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogrupoactivofijoAux.setsDetalleGeneralEntityReporte(tipogrupoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGrupoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGrupoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogrupoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoactivofijo.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoactivofijo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGrupoActivoFijo(row);				
				iRow++;
			}				
			
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGrupoActivoFijo(tipogrupoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();		
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogrupoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogrupoactivofijo");
			//elementRoot.appendChild(element);
		
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
				element = document.createElement("tipogrupoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGrupoActivoFijo(tipogrupoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGrupoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoactivofijo.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoactivofijo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGrupoActivoFijo(TipoGrupoActivoFijo tipogrupoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGrupoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogrupoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGrupoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogrupoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoGrupoActivoFijoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipogrupoactivofijo.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoGrupoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogrupoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGrupoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados=new ArrayList<TipoGrupoActivoFijo>();
		
		tipogrupoactivofijosSeleccionados=this.getTipoGrupoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGrupoActivoFijo(tipogrupoactivofijosSeleccionados);
		
		this.generarReporteTipoGrupoActivoFijos("Todos",tipogrupoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGrupoActivoFijo(ArrayList<TipoGrupoActivoFijo> tipogrupoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGrupoActivoFijo tipogrupoactivofijoAux:tipogrupoactivofijosSeleccionados) {
				tipogrupoactivofijoAux.setsDetalleGeneralEntityReporte(tipogrupoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipogrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipogrupoactivofijoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipogrupoactivofijoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGrupoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsTipoGrupoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGrupoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;												
			}
			
			this.jButtonCerrarTipoGrupoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogrupoactivofijo)) {
			this.isVisibilidadCeldaActualizarTipoGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoGrupoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoActivoFijo() {
	}
	
	public void actualizarEstadoPanelsTipoGrupoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoActivoFijo!=null) {
				this.jScrollPanelDatosTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoActivoFijo!=null) {
				this.jPanelPaginacionTipoGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
					this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoGrupoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoGrupoActivoFijo.remove(jPanelFK_IdPaisTipoGrupoActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGrupoActivoFijoSessionBean tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		
		if(this.tipogrupoactivofijoSessionBean==null) {
			this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		}
		
		this.tipogrupoactivofijoSessionBean.setsUltimaBusquedaTipoGrupoActivoFijo(this.getsAccionBusqueda());
		this.tipogrupoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogrupoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipogrupoactivofijoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGrupoActivoFijoSessionBean tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		
		if(this.tipogrupoactivofijoSessionBean==null) {
			this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		}
		
		if(this.tipogrupoactivofijoSessionBean.getsUltimaBusquedaTipoGrupoActivoFijo()!=null&&!this.tipogrupoactivofijoSessionBean.getsUltimaBusquedaTipoGrupoActivoFijo().equals("")) {
			this.setsAccionBusqueda(tipogrupoactivofijoSessionBean.getsUltimaBusquedaTipoGrupoActivoFijo());
			this.setiNumeroPaginacion(tipogrupoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogrupoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipogrupoactivofijoSessionBean.getid_pais());
				tipogrupoactivofijoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipogrupoactivofijoSessionBean.setsUltimaBusquedaTipoGrupoActivoFijo("");
		this.tipogrupoactivofijoSessionBean.setiNumeroPaginacion(TipoGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.tipogrupoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGrupoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGrupoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioTipoGrupoActivoFijo();
		this.updateVisibilidadBusquedasFormularioTipoGrupoActivoFijo();
		this.updateHabilitarBusquedasFormularioTipoGrupoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGrupoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponents().length>0) {
	

		if(this.tipogrupoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoGrupoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasTipoGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoGrupoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponent(index);
				jPanel.setBorder(this.tipogrupoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoGrupoActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGrupoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoGrupoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoGrupoActivoFijo);
			if(!this.tipogrupoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoGrupoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGrupoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoGrupoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrupoactivofijoConstantesFunciones.activarFK_IdPaisTipoGrupoActivoFijo);
				this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setEnabledAt(index,this.tipogrupoactivofijoConstantesFunciones.activarFK_IdPaisTipoGrupoActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGrupoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoGrupoActivoFijo);

			this.jTabbedPaneBusquedasTipoGrupoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoActivoFijo.getComponent(index);

			this.tipogrupoactivofijoConstantesFunciones.setResaltarFK_IdPaisTipoGrupoActivoFijo(resaltar);

			jPanel.setBorder(this.tipogrupoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoGrupoActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGrupoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGrupoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGrupoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioTipoGrupoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioTipoGrupoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogrupoactivofijoConstantesFunciones.resaltaridTipoGrupoActivoFijo!=null && this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setBorder(this.tipogrupoactivofijoConstantesFunciones.resaltaridTipoGrupoActivoFijo);}
		if(this.tipogrupoactivofijoConstantesFunciones.resaltarid_paisTipoGrupoActivoFijo!=null && this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setBorder(this.tipogrupoactivofijoConstantesFunciones.resaltarid_paisTipoGrupoActivoFijo);}
		if(this.tipogrupoactivofijoConstantesFunciones.resaltarnombreTipoGrupoActivoFijo!=null && this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setBorder(this.tipogrupoactivofijoConstantesFunciones.resaltarnombreTipoGrupoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGrupoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostraridTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelidTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostraridTipoGrupoActivoFijo);
		//this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostrarid_paisTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelid_paisTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostrarid_paisTipoGrupoActivoFijo);
		//this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostrarnombreTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jPanelnombreTipoGrupoActivoFijo.setVisible(this.tipogrupoactivofijoConstantesFunciones.mostrarnombreTipoGrupoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextFieldidTipoGrupoActivoFijo.setEnabled(this.tipogrupoactivofijoConstantesFunciones.activaridTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jComboBoxid_paisTipoGrupoActivoFijo.setEnabled(this.tipogrupoactivofijoConstantesFunciones.activarid_paisTipoGrupoActivoFijo);
		this.jInternalFrameDetalleFormTipoGrupoActivoFijo.jTextAreanombreTipoGrupoActivoFijo.setEnabled(this.tipogrupoactivofijoConstantesFunciones.activarnombreTipoGrupoActivoFijo);
		}
	}
	
		
}
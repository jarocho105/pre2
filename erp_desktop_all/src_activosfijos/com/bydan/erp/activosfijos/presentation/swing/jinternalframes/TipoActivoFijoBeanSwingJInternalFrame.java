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

import com.bydan.erp.activosfijos.util.TipoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoActivoFijoBean;
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
public class TipoActivoFijoBeanSwingJInternalFrame extends TipoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoActivoFijo> tipoactivofijoValidator = new ClassValidator<TipoActivoFijo>(TipoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoActivoFijo tipoactivofijo;	
	public TipoActivoFijo tipoactivofijoAux;
	public TipoActivoFijo tipoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoActivoFijo tipoactivofijoTotales;
	public Long idTipoActivoFijoActual;
	public Long iIdNuevoTipoActivoFijo=0L;
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
	
	public Boolean isPermisoTodoTipoActivoFijo;
	public Boolean isPermisoNuevoTipoActivoFijo;
	public Boolean isPermisoActualizarTipoActivoFijo;
	public Boolean isPermisoActualizarOriginalTipoActivoFijo;
	public Boolean isPermisoEliminarTipoActivoFijo;
	public Boolean isPermisoGuardarCambiosTipoActivoFijo;
	public Boolean isPermisoConsultaTipoActivoFijo;
	public Boolean isPermisoBusquedaTipoActivoFijo;
	public Boolean isPermisoReporteTipoActivoFijo;
	public Boolean isPermisoPaginacionMedioTipoActivoFijo;
	public Boolean isPermisoPaginacionAltoTipoActivoFijo;
	public Boolean isPermisoPaginacionTodoTipoActivoFijo;
	public Boolean isPermisoCopiarTipoActivoFijo;
	public Boolean isPermisoVerFormTipoActivoFijo;
	public Boolean isPermisoDuplicarTipoActivoFijo;
	public Boolean isPermisoOrdenTipoActivoFijo;
	
	
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
	
	public TipoActivoFijoParameterReturnGeneral tipoactivofijoReturnGeneral;
	public TipoActivoFijoParameterReturnGeneral tipoactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioTipoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoActivoFijoLogic tipoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoActivoFijo tipoactivofijoBean;
	public TipoActivoFijoConstantesFunciones tipoactivofijoConstantesFunciones;
	//public TipoActivoFijoParameterReturnGeneral tipoactivofijoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoActivoFijo> tipoactivofijos;	
	//public List<TipoActivoFijo> tipoactivofijosEliminados;
	//public List<TipoActivoFijo> tipoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarTipoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormTipoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenTipoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarTipoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarTipoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoActivoFijo() {
		return this.iIdNuevoTipoActivoFijo;
	}

	public void setiIdNuevoTipoActivoFijo(Long iIdNuevoTipoActivoFijo) {
		this.iIdNuevoTipoActivoFijo = iIdNuevoTipoActivoFijo;
	}
	
	public Long getidTipoActivoFijoActual() {
		return this.idTipoActivoFijoActual;
	}

	public void setidTipoActivoFijoActual(Long idTipoActivoFijoActual) {
		this.idTipoActivoFijoActual = idTipoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoActivoFijo gettipoactivofijo() {
		return this.tipoactivofijo;
	}

	public void settipoactivofijo(TipoActivoFijo tipoactivofijo) {
		this.tipoactivofijo = tipoactivofijo;
	}
	
	public TipoActivoFijo gettipoactivofijoAux() {
		return this.tipoactivofijoAux;
	}

	public void settipoactivofijoAux(TipoActivoFijo tipoactivofijoAux) {
		this.tipoactivofijoAux = tipoactivofijoAux;
	}				
	
	public TipoActivoFijo gettipoactivofijoAnterior() {
		return this.tipoactivofijoAnterior;
	}

	public void settipoactivofijoAnterior(TipoActivoFijo tipoactivofijoAnterior) {
		this.tipoactivofijoAnterior = tipoactivofijoAnterior;
	}	
	
	public TipoActivoFijo gettipoactivofijoTotales() {
		return this.tipoactivofijoTotales;
	}

	public void settipoactivofijoTotales(TipoActivoFijo tipoactivofijoTotales) {
		this.tipoactivofijoTotales = tipoactivofijoTotales;
	}	
	
	public TipoActivoFijo gettipoactivofijoBean() {
		return this.tipoactivofijoBean;
	}

	public void settipoactivofijoBean(TipoActivoFijo tipoactivofijoBean) {
		this.tipoactivofijoBean = tipoactivofijoBean;
	}	
	
	public TipoActivoFijoParameterReturnGeneral gettipoactivofijoReturnGeneral() {
		return this.tipoactivofijoReturnGeneral;
	}

	public void settipoactivofijoReturnGeneral(TipoActivoFijoParameterReturnGeneral tipoactivofijoReturnGeneral) {
		this.tipoactivofijoReturnGeneral = tipoactivofijoReturnGeneral;
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
	
	
	public TipoActivoFijoLogic getTipoActivoFijoLogic()	{		
		return tipoactivofijoLogic;
	}

	public void setTipoActivoFijoLogic(TipoActivoFijoLogic tipoactivofijoLogic) {
		this.tipoactivofijoLogic = tipoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoTipoActivoFijo() {
		return isEsNuevoTipoActivoFijo;
	}

	public void setIsEsNuevoTipoActivoFijo(Boolean isEsNuevoTipoActivoFijo) {
		this.isEsNuevoTipoActivoFijo = isEsNuevoTipoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoActivoFijo() {
		return esParaAccionDesdeFormularioTipoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoActivoFijo(Boolean esParaAccionDesdeFormularioTipoActivoFijo) {
		this.esParaAccionDesdeFormularioTipoActivoFijo = esParaAccionDesdeFormularioTipoActivoFijo;
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

			if(this.tipoactivofijoSessionBean==null) {
				this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
			}

			if(!this.tipoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipoactivofijoSessionBean.getlidPaisActual());
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

					if(this.tipoactivofijo!=null) {
						this.tipoactivofijo.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
						this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoActivoFijo.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoActivoFijo!=null) {
						jComboBoxid_paisFK_IdPaisTipoActivoFijo.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoActivoFijo!=null) {
							//jComboBoxid_paisFK_IdPaisTipoActivoFijo.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoActivoFijo.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoActivoFijo.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoActivoFijoGenerico)throws Exception
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
				jComboBoxid_paisTipoActivoFijoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoActivoFijoGenerico!=null && jComboBoxid_paisTipoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoActivoFijo tipoactivofijo,JComboBox jComboBoxid_paisTipoActivoFijoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoActivoFijoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoActivoFijoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipoactivofijo.setid_pais(paisAux.getId());
				tipoactivofijo.setpais_descripcion(TipoActivoFijoConstantesFunciones.getPaisDescripcion(paisAux));
				tipoactivofijo.setPais(paisAux);			}
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

					if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { 
					}

					if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.addItem(pais);
							}
						}

						if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoActivoFijo(this.tipoactivofijoLogic.getTipoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoActivoFijo(this.tipoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoactivofijoLogic.setTipoActivoFijos(this.tipoactivofijos);
			tipoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoActivoFijoParameterReturnGeneral getTipoActivoFijoParameterGeneral() {
		return this.tipoactivofijoParameterGeneral;
	}
	
	public void setTipoActivoFijoParameterGeneral(TipoActivoFijoParameterReturnGeneral tipoactivofijoParameterGeneral) {
		this.tipoactivofijoParameterGeneral = tipoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoActivoFijo() {
		return isPermisoTodoTipoActivoFijo;
	}

	public void setIsPermisoTodoTipoActivoFijo(Boolean isPermisoTodoTipoActivoFijo) {
		this.isPermisoTodoTipoActivoFijo = isPermisoTodoTipoActivoFijo;
	}

	public Boolean getIsPermisoNuevoTipoActivoFijo() {
		return isPermisoNuevoTipoActivoFijo;
	}

	public void setIsPermisoNuevoTipoActivoFijo(Boolean isPermisoNuevoTipoActivoFijo) {
		this.isPermisoNuevoTipoActivoFijo = isPermisoNuevoTipoActivoFijo;
	}

	public Boolean getIsPermisoActualizarTipoActivoFijo() {
		return isPermisoActualizarTipoActivoFijo;
	}

	public void setIsPermisoActualizarTipoActivoFijo(Boolean isPermisoActualizarTipoActivoFijo) {
		this.isPermisoActualizarTipoActivoFijo = isPermisoActualizarTipoActivoFijo;
	}

	public Boolean getIsPermisoEliminarTipoActivoFijo() {
		return isPermisoEliminarTipoActivoFijo;
	}

	public void setIsPermisoEliminarTipoActivoFijo(Boolean isPermisoEliminarTipoActivoFijo) {
		this.isPermisoEliminarTipoActivoFijo = isPermisoEliminarTipoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoActivoFijo() {
		return isPermisoGuardarCambiosTipoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosTipoActivoFijo(Boolean isPermisoGuardarCambiosTipoActivoFijo) {
		this.isPermisoGuardarCambiosTipoActivoFijo = isPermisoGuardarCambiosTipoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaTipoActivoFijo() {
		return isPermisoConsultaTipoActivoFijo;
	}

	public void setIsPermisoConsultaTipoActivoFijo(Boolean isPermisoConsultaTipoActivoFijo) {
		this.isPermisoConsultaTipoActivoFijo = isPermisoConsultaTipoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaTipoActivoFijo() {
		return isPermisoBusquedaTipoActivoFijo;
	}

	public void setIsPermisoBusquedaTipoActivoFijo(Boolean isPermisoBusquedaTipoActivoFijo) {
		this.isPermisoBusquedaTipoActivoFijo = isPermisoBusquedaTipoActivoFijo;
	}

	public Boolean getIsPermisoReporteTipoActivoFijo() {
		return isPermisoReporteTipoActivoFijo;
	}

	public void setIsPermisoReporteTipoActivoFijo(Boolean isPermisoReporteTipoActivoFijo) {
		this.isPermisoReporteTipoActivoFijo = isPermisoReporteTipoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoActivoFijo() {
		return isPermisoPaginacionMedioTipoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioTipoActivoFijo(Boolean isPermisoPaginacionMedioTipoActivoFijo) {
		this.isPermisoPaginacionMedioTipoActivoFijo = isPermisoPaginacionMedioTipoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoActivoFijo() {
		return isPermisoPaginacionTodoTipoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoTipoActivoFijo(Boolean isPermisoPaginacionTodoTipoActivoFijo) {
		this.isPermisoPaginacionTodoTipoActivoFijo = isPermisoPaginacionTodoTipoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoActivoFijo() {
		return isPermisoPaginacionAltoTipoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoTipoActivoFijo(Boolean isPermisoPaginacionAltoTipoActivoFijo) {
		this.isPermisoPaginacionAltoTipoActivoFijo = isPermisoPaginacionAltoTipoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarTipoActivoFijo() {
		return isPermisoCopiarTipoActivoFijo;
	}

	public void setIsPermisoCopiarTipoActivoFijo(Boolean isPermisoCopiarTipoActivoFijo) {
		this.isPermisoCopiarTipoActivoFijo = isPermisoCopiarTipoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormTipoActivoFijo() {
		return isPermisoVerFormTipoActivoFijo;
	}

	public void setIsPermisoVerFormTipoActivoFijo(Boolean isPermisoVerFormTipoActivoFijo) {
		this.isPermisoVerFormTipoActivoFijo = isPermisoVerFormTipoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarTipoActivoFijo() {
		return isPermisoDuplicarTipoActivoFijo;
	}

	public void setIsPermisoDuplicarTipoActivoFijo(Boolean isPermisoDuplicarTipoActivoFijo) {
		this.isPermisoDuplicarTipoActivoFijo = isPermisoDuplicarTipoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenTipoActivoFijo() {
		return isPermisoOrdenTipoActivoFijo;
	}

	public void setIsPermisoOrdenTipoActivoFijo(Boolean isPermisoOrdenTipoActivoFijo) {
		this.isPermisoOrdenTipoActivoFijo = isPermisoOrdenTipoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoActivoFijo() {
		return isVisibilidadCeldaNuevoTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoTipoActivoFijo(Boolean isVisibilidadCeldaNuevoTipoActivoFijo) {
		this.isVisibilidadCeldaNuevoTipoActivoFijo = isVisibilidadCeldaNuevoTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoActivoFijo() {
		return isVisibilidadCeldaDuplicarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoActivoFijo(Boolean isVisibilidadCeldaDuplicarTipoActivoFijo) {
		this.isVisibilidadCeldaDuplicarTipoActivoFijo = isVisibilidadCeldaDuplicarTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoActivoFijo() {
		return isVisibilidadCeldaCopiarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarTipoActivoFijo(Boolean isVisibilidadCeldaCopiarTipoActivoFijo) {
		this.isVisibilidadCeldaCopiarTipoActivoFijo = isVisibilidadCeldaCopiarTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoActivoFijo() {
		return isVisibilidadCeldaVerFormTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormTipoActivoFijo(Boolean isVisibilidadCeldaVerFormTipoActivoFijo) {
		this.isVisibilidadCeldaVerFormTipoActivoFijo = isVisibilidadCeldaVerFormTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoActivoFijo() {
		return isVisibilidadCeldaOrdenTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenTipoActivoFijo(Boolean isVisibilidadCeldaOrdenTipoActivoFijo) {
		this.isVisibilidadCeldaOrdenTipoActivoFijo = isVisibilidadCeldaOrdenTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesTipoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo = isVisibilidadCeldaNuevoRelacionesTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoActivoFijo() {
		return isVisibilidadCeldaModificarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarTipoActivoFijo(Boolean isVisibilidadCeldaModificarTipoActivoFijo) {
		this.isVisibilidadCeldaModificarTipoActivoFijo = isVisibilidadCeldaModificarTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoActivoFijo() {
		return isVisibilidadCeldaActualizarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarTipoActivoFijo(Boolean isVisibilidadCeldaActualizarTipoActivoFijo) {
		this.isVisibilidadCeldaActualizarTipoActivoFijo = isVisibilidadCeldaActualizarTipoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoActivoFijo() {
		return isVisibilidadCeldaEliminarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarTipoActivoFijo(Boolean isVisibilidadCeldaEliminarTipoActivoFijo) {
		this.isVisibilidadCeldaEliminarTipoActivoFijo = isVisibilidadCeldaEliminarTipoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoActivoFijo() {
		return isVisibilidadCeldaCancelarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarTipoActivoFijo(Boolean isVisibilidadCeldaCancelarTipoActivoFijo) {
		this.isVisibilidadCeldaCancelarTipoActivoFijo = isVisibilidadCeldaCancelarTipoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoActivoFijo() {
		return isVisibilidadCeldaGuardarTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarTipoActivoFijo(Boolean isVisibilidadCeldaGuardarTipoActivoFijo) {
		this.isVisibilidadCeldaGuardarTipoActivoFijo = isVisibilidadCeldaGuardarTipoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosTipoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosTipoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo = isVisibilidadCeldaGuardarCambiosTipoActivoFijo;
	}
		
	public TipoActivoFijoSessionBean gettipoactivofijoSessionBean() {
		return this.tipoactivofijoSessionBean;
	}
	
	public void settipoactivofijoSessionBean(TipoActivoFijoSessionBean tipoactivofijoSessionBean) {
		this.tipoactivofijoSessionBean=tipoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(TipoActivoFijo tipoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(TipoActivoFijo tipoactivofijo,TipoActivoFijo tipoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoActivoFijo(tipoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoactivofijoAux.setId(tipoactivofijo.getId());
		tipoactivofijoAux.setVersionRow(tipoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoActivoFijo();
		
			int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoactivofijoValidator.getInvalidValues(this.tipoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoactivofijoLogic.setDatosCliente(datosCliente);
			tipoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoactivofijoAux=new  TipoActivoFijo();
				
				tipoactivofijoAux.setIsNew(true);
				tipoactivofijoAux.setIsChanged(true);
				
				tipoactivofijoAux.setTipoActivoFijoOriginal(this.tipoactivofijo);
				
				tipoactivofijoAux.setId(this.tipoactivofijo.getId());	
				tipoactivofijoAux.setVersionRow(this.tipoactivofijo.getVersionRow());	
				tipoactivofijoAux.setid_pais(this.tipoactivofijo.getid_pais());	
				tipoactivofijoAux.setnombre(this.tipoactivofijo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoactivofijoAux,tipoactivofijoLogic.getTipoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoAux,tipoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoLogic.saveTipoActivoFijos();//WithConnection
						//tipoactivofijoLogic.getSetVersionRowTipoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoactivofijo,tipoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoactivofijoAux=new  TipoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipoactivofijo.getId()>=0)) {
						
					tipoactivofijoAux.setIsNew(false);
				}
				
				tipoactivofijoAux.setIsDeleted(false);
			
				tipoactivofijoAux.setId(this.tipoactivofijo.getId());	
				tipoactivofijoAux.setVersionRow(this.tipoactivofijo.getVersionRow());	
				tipoactivofijoAux.setid_pais(this.tipoactivofijo.getid_pais());	
				tipoactivofijoAux.setnombre(this.tipoactivofijo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoactivofijoAux,tipoactivofijoLogic.getTipoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoAux,tipoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoLogic.saveTipoActivoFijos();//WithConnection
						//tipoactivofijoLogic.getSetVersionRowTipoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoactivofijo,tipoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoactivofijoAux=new  TipoActivoFijo();
				
				tipoactivofijoAux.setIsNew(false);
				tipoactivofijoAux.setIsChanged(false);
				
				tipoactivofijoAux.setIsDeleted(true);
				
				tipoactivofijoAux.setId(this.tipoactivofijo.getId());	
				tipoactivofijoAux.setVersionRow(this.tipoactivofijo.getVersionRow());	
				tipoactivofijoAux.setid_pais(this.tipoactivofijo.getid_pais());	
				tipoactivofijoAux.setnombre(this.tipoactivofijo.getnombre());	
				
				if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoactivofijoAux.getId()>=0) {	
						this.tipoactivofijosEliminados.add(tipoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoactivofijoAux,tipoactivofijoLogic.getTipoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoAux,tipoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoLogic.saveTipoActivoFijos();//WithConnection
						//tipoactivofijoLogic.getSetVersionRowTipoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoactivofijoAux,tipoactivofijoLogic.getTipoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoactivofijoAux,tipoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.getTipoActivoFijos().addAll(this.tipoactivofijosEliminados);
					
					tipoactivofijoLogic.saveTipoActivoFijos();//WithConnection
					//tipoactivofijoLogic.getSetVersionRowTipoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoActivoFijo();
				
				this.tipoactivofijosEliminados= new ArrayList<TipoActivoFijo>();		
			}
			
			if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoactivofijo=tipoactivofijoAux;
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
      		//this.finishProcessTipoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoActivoFijo tipoactivofijoLocal) throws Exception {
		
		if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoActivoFijo tipoactivofijoLocal) throws Exception {	
		if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipoactivofijoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoactivofijoValidator.getInvalidValues(this.tipoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoActivoFijo tipoactivofijo,List<TipoActivoFijo> tipoactivofijos) throws Exception {
		try	{		
			TipoActivoFijoConstantesFunciones.actualizarLista(tipoactivofijo,tipoactivofijos,this.tipoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoActivoFijo tipoactivofijo,List<TipoActivoFijo> tipoactivofijos) throws Exception {
		try	{			
			TipoActivoFijoConstantesFunciones.actualizarSelectedLista(tipoactivofijo,tipoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoActivoFijo> tipoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoactivofijosLocal=this.tipoactivofijoLogic.getTipoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoactivofijosLocal=this.tipoactivofijos;
			}
			//ARCHITECTURE
		
			for(TipoActivoFijo tipoactivofijoLocal:tipoactivofijosLocal) {
				if(this.permiteMantenimiento(tipoactivofijoLocal) && tipoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoActivoFijoConstantesFunciones.getTipoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoActivoFijoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelid_paisTipoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelnombreTipoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelid_paisTipoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelnombreTipoActivoFijo,"");
		
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
		this.iIdNuevoTipoActivoFijo--;	
		
		
		this.tipoactivofijoAux=new TipoActivoFijo();
		
		this.tipoactivofijoAux.setId(this.iIdNuevoTipoActivoFijo);
		this.tipoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoactivofijoLogic.getTipoActivoFijos().add(this.tipoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoactivofijos.add(this.tipoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.tipoactivofijo=this.tipoactivofijoAux;
		
		if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijo(this.tipoactivofijo);
		}
				
		//this.setDefaultControlesTipoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoActivoFijo(this.tipoactivofijoBean,this.tipoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=TipoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoactivofijoReturnGeneral=tipoactivofijoLogic.procesarEventosTipoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijoLogic.getTipoActivoFijos(),this.tipoactivofijo,this.tipoactivofijoParameterGeneral,this.isEsNuevoTipoActivoFijo,classes);//this.tipoactivofijoLogic.getTipoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoActivoFijo(this.tipoactivofijoReturnGeneral,this.tipoactivofijoBean,false);
		
		if(this.tipoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo());
		}
		
		if(this.tipoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo(),classes);//this.tipoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoActivoFijo(false);
						
			if(tipoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijo();
			}
			
			this.actualizarVisualTableDatosTipoActivoFijo();
			
			this.jTableDatosTipoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijo(), this.getIndiceNuevoTipoActivoFijo());
			
			this.seleccionarFilaTablaTipoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesTipoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setEnabled(isHabilitar && this.tipoactivofijoConstantesFunciones.activarnombreTipoActivoFijo);	
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setEnabled(isHabilitar && this.tipoactivofijoConstantesFunciones.activarid_paisTipoActivoFijo);
	};
	
	public void setDefaultControlesTipoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.tipoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.setVisible(true);
			
					
		} else {
			//this.tipoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.tipoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
				if(tipoactivofijoAux.getId().equals(this.iIdNuevoTipoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijos) {
				if(tipoactivofijoAux.getId().equals(this.iIdNuevoTipoActivoFijo)) {
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
	
	public int getIndiceActualTipoActivoFijo(TipoActivoFijo tipoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
				if(tipoactivofijoAux.getId().equals(tipoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijos) {
				if(tipoactivofijoAux.getId().equals(tipoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoActivoFijo(TipoActivoFijo tipoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
				if(tipoactivofijoAux.getTipoActivoFijoOriginal().getId().equals(tipoactivofijoOriginal.getId())) {
					existe=true;
					tipoactivofijoOriginal.setId(tipoactivofijoAux.getId());
					tipoactivofijoOriginal.setVersionRow(tipoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijos) {
				if(tipoactivofijoAux.getTipoActivoFijoOriginal().getId().equals(tipoactivofijoOriginal.getId())) {
					existe=true;
					tipoactivofijoOriginal.setId(tipoactivofijoAux.getId());
					tipoactivofijoOriginal.setVersionRow(tipoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoActivoFijo(Boolean esParaCancelar) throws Exception {
		tipoactivofijosAux=new ArrayList<TipoActivoFijo>();
		tipoactivofijoAux=new TipoActivoFijo();
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
					if(tipoactivofijoAux.getId()<0) {
						tipoactivofijosAux.add(tipoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoActivoFijo=0L;
				this.tipoactivofijoLogic.getTipoActivoFijos().removeAll(tipoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijos) {
					if(tipoactivofijoAux.getId()<0) {
						tipoactivofijosAux.add(tipoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoActivoFijo=0L;
				this.tipoactivofijos.removeAll(tipoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoActivoFijo 
					&& this.tipoactivofijoLogic.getTipoActivoFijos().size()>0
					) {
					tipoactivofijoAux=this.tipoactivofijoLogic.getTipoActivoFijos().get(this.tipoactivofijoLogic.getTipoActivoFijos().size() - 1);
				
					if(tipoactivofijoAux.getId()<0) {
						this.tipoactivofijoLogic.getTipoActivoFijos().remove(tipoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoActivoFijo && this.tipoactivofijos.size()>0) {
					tipoactivofijoAux=this.tipoactivofijos.get(this.tipoactivofijos.size() - 1);
				
					if(tipoactivofijoAux.getId()<0) {
						this.tipoactivofijos.remove(tipoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoactivofijo.getId()<0) {
				this.tipoactivofijoLogic.getTipoActivoFijos().remove(this.tipoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoactivofijo.getId()<0) {
				this.tipoactivofijos.remove(this.tipoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoActivoFijo(List<TipoActivoFijo> tipoactivofijosAux) throws Exception {
		TipoActivoFijoConstantesFunciones.setEstadosInicialesTipoActivoFijo(tipoactivofijosAux);
	}
	
	public void setEstadosInicialesTipoActivoFijo(TipoActivoFijo tipoactivofijoAux) throws Exception {
		TipoActivoFijoConstantesFunciones.setEstadosInicialesTipoActivoFijo(tipoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoActivoFijoActual()) {
				if(!this.isEsNuevoTipoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Activo Fijo ?", "MANTENIMIENTO DE Tipo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoActivoFijo tipoactivofijo) throws Exception {
		TipoActivoFijoConstantesFunciones.seleccionarAsignar(this.tipoactivofijo,tipoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoActivoFijo=this.isPermisoActualizarOriginalTipoActivoFijo;
			
			
			this.seleccionarAsignar(tipoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoActivoFijoConstantesFunciones.quitarEspaciosTipoActivoFijo(this.tipoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoactivofijoSessionBean.setsFuncionBusquedaRapida(this.tipoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoActivoFijo(esParaCancelar);				
				this.cancelarNuevoTipoActivoFijo(esParaCancelar);								
			}
			
			this.tipoactivofijo=new TipoActivoFijo();
			
			this.inicializarTipoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoActivoFijo() throws Exception {
		try {
			TipoActivoFijoConstantesFunciones.inicializarTipoActivoFijo(this.tipoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoactivofijoLogic.getTipoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoActivoFijos(String sAccionBusqueda,List<TipoActivoFijo> tipoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Activo Fijos");		
		parameters.put("busquedapor", TipoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoActivoFijo=new JRBeanArrayDataSource(TipoActivoFijoJInternalFrame.TraerTipoActivoFijoBeans(tipoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoActivoFijoBean.TraerTipoActivoFijoBeans(tipoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoActivoFijoActionPerformed(null);
					//this.generarExcelReporteTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijo> tipoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoActivoFijo tipoactivofijo : tipoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoActivoFijoConstantesFunciones.generarExcelReporteDataTipoActivoFijo("NORMAL",row,workbook,tipoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		TipoActivoFijoConstantesFunciones.generarExcelReporteHeaderTipoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijo> tipoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoActivoFijo tipoactivofijo : tipoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoActivoFijoConstantesFunciones.getTipoActivoFijoDescripcion(tipoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoactivofijo.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoactivofijo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoActivoFijo> tipoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoActivoFijo> tipoactivofijosRespaldo=null;
		
		classes=TipoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.tipoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.tipoactivofijoLogic.setIsConDeep(true);
		
		tipoactivofijosRespaldo=this.tipoactivofijoLogic.getTipoActivoFijos();
		
		this.tipoactivofijoLogic.setTipoActivoFijos(tipoactivofijosParaReportes);	
		this.tipoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoactivofijosParaReportes=this.tipoactivofijoLogic.getTipoActivoFijos();
		this.tipoactivofijoLogic.setTipoActivoFijos(tipoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoActivoFijo tipoactivofijo : tipoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoActivoFijoConstantesFunciones.generarExcelReporteDataTipoActivoFijo("NORMAL",row,workbook,tipoactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoActivoFijoConstantesFunciones.getTipoActivoFijoDescripcion(tipoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoActivoFijo() throws Exception {		
		this.startProcessTipoActivoFijo(true);
	}
	
	public void startProcessTipoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoActivoFijo ,this.jPanelParametrosReportesTipoActivoFijo, this.jScrollPanelDatosTipoActivoFijo,this.jPanelPaginacionTipoActivoFijo, this.jScrollPanelDatosEdicionTipoActivoFijo, this.jPanelAccionesTipoActivoFijo,this.jPanelAccionesFormularioTipoActivoFijo,this.jmenuBarTipoActivoFijo,this.jmenuBarDetalleTipoActivoFijo,this.jTtoolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoActivoFijo=this.jTabbedPaneBusquedasTipoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoActivoFijo=this.jPanelParametrosReportesTipoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoActivoFijo=this.jScrollPanelDatosTipoActivoFijo;
		final JTable jTableDatosTipoActivoFijo=this.jTableDatosTipoActivoFijo;		
		final JPanel jPanelPaginacionTipoActivoFijo=this.jPanelPaginacionTipoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoActivoFijo=this.jScrollPanelDatosEdicionTipoActivoFijo;
		final JPanel jPanelAccionesTipoActivoFijo=this.jPanelAccionesTipoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jPanelCamposTipoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jPanelAccionesFormularioTipoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoActivoFijo=jPanelCamposAuxiliarTipoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoActivoFijo=jPanelAccionesFormularioAuxiliarTipoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoActivoFijo=this.jmenuBarTipoActivoFijo;
		final JToolBar jTtoolBarTipoActivoFijo=this.jTtoolBarTipoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jmenuBarDetalleTipoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jTtoolBarDetalleTipoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleTipoActivoFijo=jmenuBarDetalleAuxiliarTipoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoActivoFijo=jTtoolBarDetalleAuxiliarTipoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoActivoFijo ,jPanelParametrosReportesTipoActivoFijo,jTableDatosTipoActivoFijo, /*jScrollPanelDatosTipoActivoFijo,*/jPanelCamposTipoActivoFijo,jPanelPaginacionTipoActivoFijo, /*jScrollPanelDatosEdicionTipoActivoFijo,*/ jPanelAccionesTipoActivoFijo,jPanelAccionesFormularioTipoActivoFijo,jmenuBarTipoActivoFijo,jmenuBarDetalleTipoActivoFijo,jTtoolBarTipoActivoFijo,jTtoolBarDetalleTipoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoActivoFijo ,jPanelParametrosReportesTipoActivoFijo, jScrollPanelDatosTipoActivoFijo,jPanelPaginacionTipoActivoFijo, jScrollPanelDatosEdicionTipoActivoFijo, jPanelAccionesTipoActivoFijo,jPanelAccionesFormularioTipoActivoFijo,jmenuBarTipoActivoFijo,jmenuBarDetalleTipoActivoFijo,jTtoolBarTipoActivoFijo,jTtoolBarDetalleTipoActivoFijo);
						
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
	
	public void finishProcessTipoActivoFijo() {// throws Exception 
		this.finishProcessTipoActivoFijo(true);
	}
	
	public void finishProcessTipoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoActivoFijo ,this.jPanelParametrosReportesTipoActivoFijo, this.jScrollPanelDatosTipoActivoFijo,this.jPanelPaginacionTipoActivoFijo, this.jScrollPanelDatosEdicionTipoActivoFijo, this.jPanelAccionesTipoActivoFijo,this.jPanelAccionesFormularioTipoActivoFijo,this.jmenuBarTipoActivoFijo,this.jmenuBarDetalleTipoActivoFijo,this.jTtoolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoActivoFijo=this.jTabbedPaneBusquedasTipoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoActivoFijo=this.jPanelParametrosReportesTipoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoActivoFijo=this.jScrollPanelDatosTipoActivoFijo;
		final JTable jTableDatosTipoActivoFijo=this.jTableDatosTipoActivoFijo;		
		final JPanel jPanelPaginacionTipoActivoFijo=this.jPanelPaginacionTipoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoActivoFijo=this.jScrollPanelDatosEdicionTipoActivoFijo;
		final JPanel jPanelAccionesTipoActivoFijo=this.jPanelAccionesTipoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jPanelCamposTipoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jPanelAccionesFormularioTipoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoActivoFijo=jPanelCamposAuxiliarTipoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoActivoFijo=jPanelAccionesFormularioAuxiliarTipoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoActivoFijo=this.jmenuBarTipoActivoFijo;		
		final JToolBar jTtoolBarTipoActivoFijo=this.jTtoolBarTipoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jmenuBarDetalleTipoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jTtoolBarDetalleTipoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoActivoFijo=jmenuBarDetalleAuxiliarTipoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoActivoFijo=jTtoolBarDetalleAuxiliarTipoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoActivoFijo ,jPanelParametrosReportesTipoActivoFijo, jTableDatosTipoActivoFijo,/*jScrollPanelDatosTipoActivoFijo,*/jPanelCamposTipoActivoFijo,jPanelPaginacionTipoActivoFijo, /*jScrollPanelDatosEdicionTipoActivoFijo,*/ jPanelAccionesTipoActivoFijo,jPanelAccionesFormularioTipoActivoFijo,jmenuBarTipoActivoFijo,jmenuBarDetalleTipoActivoFijo,jTtoolBarTipoActivoFijo,jTtoolBarDetalleTipoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoactivofijoConstantesFunciones.getsFinalQueryTipoActivoFijo();
		String  finalQueryPaginacionTodos=this.tipoactivofijoConstantesFunciones.getsFinalQueryTipoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoTipoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoActivoFijoConstantesFunciones.getArrayColumnasGlobalesTipoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoactivofijosEliminados= new ArrayList<TipoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoActivoFijo();
		
				///*TipoActivoFijoSessionBean*/this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
			
			if(this.tipoactivofijoSessionBean==null) {
				this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=TipoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoActivoFijoConstantesFunciones.getClassesForeignKeysOfTipoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoactivofijosAux= new ArrayList<TipoActivoFijo>();
			
				
			tipoactivofijoLogic.setDatosCliente(this.datosCliente);
			tipoactivofijoLogic.setDatosDeep(this.datosDeep);
			tipoactivofijoLogic.setIsConDeep(true);
			
			
			tipoactivofijoLogic.getTipoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoactivofijoLogic.getTodosTipoActivoFijos(finalQueryGlobal,pagination);
					
					//tipoactivofijoLogic.getTodosTipoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoactivofijoLogic.getTipoActivoFijos()==null|| tipoactivofijoLogic.getTipoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijosAux= new ArrayList<TipoActivoFijo>();
							tipoactivofijosAux.addAll(tipoactivofijoLogic.getTipoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijosAux= new ArrayList<TipoActivoFijo>();
							tipoactivofijosAux.addAll(tipoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijoLogic.getTodosTipoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//tipoactivofijoLogic.getTodosTipoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoActivoFijos("Todos",tipoactivofijoLogic.getTipoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoactivofijoLogic.setTipoActivoFijos(new ArrayList<TipoActivoFijo>());					
							tipoactivofijoLogic.getTipoActivoFijos().addAll(tipoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijos=new ArrayList<TipoActivoFijo>();
							tipoactivofijos.addAll(tipoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoActivoFijo=this.idActual;
				
				} else if(this.idTipoActivoFijoActual!=null && this.idTipoActivoFijoActual!=0L) {
					idTipoActivoFijo=idTipoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndicePorId(idTipoActivoFijo);
				
				this.tipoactivofijos=new ArrayList<TipoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoactivofijoLogic.getEntity(idTipoActivoFijo);
					
					//tipoactivofijoLogic.getEntityWithConnection(idTipoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoLogic.setTipoActivoFijos(new ArrayList<TipoActivoFijo>());
					tipoactivofijoLogic.getTipoActivoFijos().add(tipoactivofijoLogic.getTipoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijos=new ArrayList<TipoActivoFijo>();
					this.tipoactivofijos.add(tipoactivofijo);
				}
				
				if(tipoactivofijoLogic.getTipoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoactivofijoLogic.getTipoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoactivofijoLogic.getTipoActivoFijos()==null||tipoactivofijoLogic.getTipoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoactivofijos==null|| tipoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijosAux=new ArrayList<TipoActivoFijo>();
						tipoactivofijosAux.addAll(tipoactivofijoLogic.getTipoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijosAux=new ArrayList<TipoActivoFijo>();
							tipoactivofijosAux.addAll(tipoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoactivofijoLogic.getTipoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoActivoFijos("FK_IdPais",tipoactivofijoLogic.getTipoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoActivoFijos("FK_IdPais",tipoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoLogic.setTipoActivoFijos(new ArrayList<TipoActivoFijo>());
						tipoactivofijoLogic.getTipoActivoFijos().addAll(tipoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijos=new ArrayList<TipoActivoFijo>();
							tipoactivofijos.addAll(tipoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoactivofijoLogic.getTipoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoactivofijoLogic.getTipoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoActivoFijo tipoactivofijo) {
		Boolean permite=true;
		
		if(this.tipoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoActivoFijoConstantesFunciones.getOrderByListaTipoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoActivoFijoConstantesFunciones.getOrderByListaTipoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijo tipoactivofijo:tipoactivofijoLogic.getTipoActivoFijos()) {
				if(tipoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoTotales=tipoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijo tipoactivofijo:this.tipoactivofijos) {
				if(tipoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoTotales=tipoactivofijo;
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
			this.tipoactivofijoAux=new TipoActivoFijo();
			this.tipoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.tipoactivofijoAux.setIsNew(false);
			this.tipoactivofijoAux.setIsChanged(false);
			this.tipoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoActivoFijo(this.tipoactivofijoLogic.getTipoActivoFijos(),this.tipoactivofijoAux);
				
				this.tipoactivofijoLogic.getTipoActivoFijos().add(this.tipoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoActivoFijo(this.tipoactivofijos,this.tipoactivofijoAux);
				
				this.tipoactivofijos.add(this.tipoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoactivofijoTotales=new TipoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoactivofijoLogic.getTipoActivoFijos().remove(tipoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoactivofijos.remove(tipoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoactivofijoTotales=new TipoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoActivoFijo tipoactivofijo:tipoactivofijoLogic.getTipoActivoFijos()) {
				if(tipoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoTotales=tipoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoActivoFijo(this.tipoactivofijoLogic.getTipoActivoFijos(),tipoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoActivoFijo tipoactivofijo:this.tipoactivofijos) {
				if(tipoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoactivofijoTotales=tipoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoActivoFijo(this.tipoactivofijos,tipoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoActivoFijosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoActivoFijoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoActivoFijosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoLogic.getTipoActivoFijosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoActivoFijoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoLogic.getTipoActivoFijoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoActivoFijo() {
		this.isPermisoTodoTipoActivoFijo=false;
		this.isPermisoNuevoTipoActivoFijo=false;
		this.isPermisoActualizarTipoActivoFijo=false;
		this.isPermisoActualizarOriginalTipoActivoFijo=false;
		this.isPermisoEliminarTipoActivoFijo=false;
		this.isPermisoGuardarCambiosTipoActivoFijo=false;
		this.isPermisoConsultaTipoActivoFijo=false;
		this.isPermisoBusquedaTipoActivoFijo=false;
		this.isPermisoReporteTipoActivoFijo=false;		
		this.isPermisoOrdenTipoActivoFijo=false;		
		this.isPermisoPaginacionMedioTipoActivoFijo=false;		
		this.isPermisoPaginacionAltoTipoActivoFijo=false;
		this.isPermisoPaginacionTodoTipoActivoFijo=false;
		this.isPermisoCopiarTipoActivoFijo=false;		
		this.isPermisoVerFormTipoActivoFijo=false;		
		this.isPermisoDuplicarTipoActivoFijo=false;		
		this.isPermisoOrdenTipoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioTipoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoTipoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoActivoFijo=isPermiso;
		this.isPermisoConsultaTipoActivoFijo=isPermiso;
		this.isPermisoBusquedaTipoActivoFijo=isPermiso;
		this.isPermisoReporteTipoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioTipoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoTipoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoTipoActivoFijo=isPermiso;		
		this.isPermisoCopiarTipoActivoFijo=isPermiso;		
		this.isPermisoVerFormTipoActivoFijo=isPermiso;		
		this.isPermisoDuplicarTipoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoTipoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoActivoFijo=isPermiso;
		//this.isPermisoConsultaTipoActivoFijo=isPermiso;
		//this.isPermisoBusquedaTipoActivoFijo=isPermiso;
		//this.isPermisoReporteTipoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoActivoFijo=isPermiso;		
		//this.isPermisoCopiarTipoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarTipoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoActivoFijo=this.isPermisoActualizarTipoActivoFijo;
			this.isPermisoEliminarTipoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoActivoFijo.setToolTipText(this.jTableDatosTipoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyTipoActivoFijoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoActivoFijoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoActivoFijoParameterReturnGeneral tipoactivofijoReturnGeneral=new TipoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipoactivofijoConstantesFunciones.cargarid_paisTipoActivoFijo)
					 || (this.esRecargarFks && this.tipoactivofijoConstantesFunciones.cargarid_paisTipoActivoFijo)) {

					if(!this.tipoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipoactivofijoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoactivofijoReturnGeneral=tipoactivofijoLogic.cargarCombosLoteForeignKeyTipoActivoFijo(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipoactivofijoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipoactivofijoSessionBean==null) {
				this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
			}

			if(!this.tipoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijo(TipoActivoFijo tipoactivofijo)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipoactivofijo.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoActivoFijo(TipoActivoFijo tipoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoActivoFijo()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipoactivofijoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo!=null && this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean(); 
		this.tipoactivofijoConstantesFunciones=new TipoActivoFijoConstantesFunciones(); 
		this.tipoactivofijoBean=new TipoActivoFijo();//(this.tipoactivofijoConstantesFunciones); 		
		this.tipoactivofijoReturnGeneral=new TipoActivoFijoParameterReturnGeneral(); 
		
		this.tipoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoActivoFijo(true);
			
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
			
			this.tipoactivofijoConstantesFunciones=new TipoActivoFijoConstantesFunciones(); 
			this.tipoactivofijoBean=new TipoActivoFijo();//this.tipoactivofijoConstantesFunciones); 			
			this.tipoactivofijoReturnGeneral=new TipoActivoFijoParameterReturnGeneral(); 
		
			TipoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoactivofijo=new TipoActivoFijo();
			this.tipoactivofijos = new ArrayList<TipoActivoFijo>();
			this.tipoactivofijosAux = new ArrayList<TipoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic=new TipoActivoFijoLogic();
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionTipoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoActivoFijo);
				this.jInternalFrameDetalleFormTipoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormTipoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoActivoFijo);
					this.jInternalFrameReporteDinamicoTipoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoActivoFijo);
					this.jInternalFrameImportacionTipoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionTipoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoActivoFijo);
					this.jInternalFrameOrderByTipoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByTipoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoactivofijoReturnGeneral=new TipoActivoFijoParameterReturnGeneral();
			
			this.tipoactivofijoParameterGeneral=new TipoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoActivoFijo=true;
			this.isVisibilidadCeldaCopiarTipoActivoFijo=true;
			this.isVisibilidadCeldaVerFormTipoActivoFijo=true;
			this.isVisibilidadCeldaOrdenTipoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoActivoFijo(false);
			
			this.setPermisosUsuarioTipoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoActivoFijoClasesRelacionadas();
			}
			
			if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaTipoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoActivoFijo,this.isPermisoPaginacionMedioTipoActivoFijo,this.isPermisoPaginacionTodoTipoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoActivoFijoConstantesFunciones.getTiposSeleccionarTipoActivoFijo());
				
				this.tiposColumnasSelect=TipoActivoFijoConstantesFunciones.getTiposSeleccionarTipoActivoFijo(true);
				
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
			//if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijo() ;
			
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
				tipoactivofijoImplementable= (TipoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoactivofijoImplementableHome= (TipoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoactivofijos= new ArrayList<TipoActivoFijo>();
			this.tipoactivofijosEliminados= new ArrayList<TipoActivoFijo>();
						
			this.isEsNuevoTipoActivoFijo=false;
			this.esParaAccionDesdeFormularioTipoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoActivoFijo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoActivoFijo();	
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
	
	public void cargarCombosForeignKeyTipoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoActivoFijo();
		
		this.cargarCombosFrameForeignKeyTipoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoActivoFijo();
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
	
	public void jButtonNuevoTipoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			
			if(jTableDatosTipoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoActivoFijo(true);			
			//this.tipoactivofijo=new TipoActivoFijo();
			//this.tipoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijo() ;
			
			if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);				
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoActivoFijo.getSelectedRows().length;			
			}
			
			tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoActivoFijo--;			
				//TipoActivoFijo tipoactivofijoAux= new TipoActivoFijo();			
				//tipoactivofijoAux.setId(this.iIdNuevoTipoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoActivoFijo tipoactivofijoOrigen=new TipoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoActivoFijo tipoactivofijoOrigen : tipoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoactivofijoOrigen =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoactivofijoOrigen =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoActivoFijo(tipoactivofijoOrigen,this.tipoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoactivofijoLogic.getTipoActivoFijos().add(this.tipoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoactivofijos.add(this.tipoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
				
				this.jTableDatosTipoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijo(), this.getIndiceNuevoTipoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();									
		
			TipoActivoFijo tipoactivofijoOrigen=new TipoActivoFijo();
			TipoActivoFijo tipoactivofijoDestino=new TipoActivoFijo();
				
			tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoOrigen =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoactivofijoOrigen =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoactivofijoDestino =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoactivofijoDestino =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoactivofijoOrigen =tipoactivofijosSeleccionados.get(0);
				tipoactivofijoDestino =tipoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoActivoFijo(tipoactivofijoOrigen,tipoactivofijoDestino,true,false);
				
				tipoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoactivofijoDestino,tipoactivofijoLogic.getTipoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoactivofijoDestino,tipoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
				
				//this.jTableDatosTipoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijo(), this.getIndiceNuevoTipoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionTipoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesTipoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoActivoFijo();
			
			this.abrirFrameOrderByTipoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoActivoFijo.setSize(this.jInternalFrameDetalleFormTipoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormTipoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoActivoFijo.jContentPaneDetalleTipoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijo.jContentPaneDetalleTipoActivoFijo.getWidth(),TipoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijo.jContentPaneDetalleTipoActivoFijo.getWidth(),TipoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoActivoFijo.jContentPaneDetalleTipoActivoFijo.getWidth(),TipoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByTipoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoActivoFijo);
				this.jInternalFrameOrderByTipoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByTipoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByTipoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoActivoFijo==null) {
				
				this.jInternalFrameImportacionTipoActivoFijo=new ImportacionJInternalFrame(TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoActivoFijo);
				this.jInternalFrameImportacionTipoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionTipoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionTipoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoActivoFijo"));
				this.jInternalFrameImportacionTipoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoActivoFijo"));
				this.jInternalFrameImportacionTipoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijo=new ReporteDinamicoJInternalFrame(TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoActivoFijo);
				this.jInternalFrameReporteDinamicoTipoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoActivoFijo);
			
	       	this.jInternalFrameDetalleFormTipoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormTipoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionTipoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByTipoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByTipoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionTipoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoActivoFijo(true);
			//this.isEsNuevoTipoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijo(false) ;
			
			if(tipoactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoActivoFijo(true);
			//this.isEsNuevoTipoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoActivoFijo(false) ;
			
			if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,TipoActivoFijoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoActivoFijo(false);
			
			//if(!this.isEsNuevoTipoActivoFijo) {								
				int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoActivoFijo=true;
					this.inicializarActualizarBindingTablaTipoActivoFijo(false);
					this.isEsNuevoTipoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoActivoFijo(false);
			
												
				
				if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoActivoFijoActionPerformed(evt,tipoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoActivoFijo(this.tipoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoActivoFijoModel) this.jTableDatosTipoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoActivoFijo=true;
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
				this.isEsNuevoTipoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoActivoFijo(false);
				
				
				
				if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoActivoFijo(false) ;
			
			this.isEsNuevoTipoActivoFijo=false;
			
			if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoActivoFijo(false);
				
				//SI ES MANUAL
				if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoActivoFijo--;			
			//TipoActivoFijo tipoactivofijoAux= new TipoActivoFijo();			
			//tipoactivofijoAux.setId(this.iIdNuevoTipoActivoFijo);
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
			
			this.tipoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoactivofijoLogic.getTipoActivoFijos().add(this.tipoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoactivofijos.add(this.tipoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			
			this.jTableDatosTipoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoActivoFijo(), this.getIndiceNuevoTipoActivoFijo());
			
			int iLastRow =  this.jTableDatosTipoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijo();
			}
			
			//this.abrirFrameTreeTipoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Activo FijoS ?", "MANTENIMIENTO DE Tipo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoactivofijoReturnGeneral=tipoactivofijoLogic.procesarImportacionTipoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoActivoFijo.setFileImportacion(this.jInternalFrameImportacionTipoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		

		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoActivoFijo tipoactivofijo:tipoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoactivofijo.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoActivoFijo tipoactivofijo:tipoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoactivofijo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoActivoFijo(tipoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualTipoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionNuevoTipoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionSinCerrarTipoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionSinMensajeTipoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
				this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionNuevoTipoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionSinCerrarTipoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoActivoFijo.jCheckBoxPostAccionSinMensajeTipoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoActivoFijo() throws Exception {
		try	{
			if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoActivoFijo(Boolean esInicializar) throws Exception {				
		if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaTipoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoactivofijoLogic.getTipoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoActivoFijo.setModel(new TipoActivoFijoModel(this.tipoactivofijoLogic.getTipoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoActivoFijo.setModel(new TipoActivoFijoModel(this.tipoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoActivoFijo!=null && this.jInternalFrameOrderByTipoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipoactivofijoConstantesFunciones.resaltarSeleccionarTipoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipoactivofijoConstantesFunciones.resaltarSeleccionarTipoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,TipoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.tipoactivofijoConstantesFunciones.mostraridTipoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoactivofijoConstantesFunciones.resaltaridTipoActivoFijo,this.tipoactivofijoConstantesFunciones.activaridTipoActivoFijo,this,true,"idTipoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoactivofijoConstantesFunciones.resaltaridTipoActivoFijo,this.tipoactivofijoConstantesFunciones.activaridTipoActivoFijo,this,true,"idTipoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,TipoActivoFijoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipoactivofijoConstantesFunciones.mostrarid_paisTipoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipoactivofijoConstantesFunciones.resaltarid_paisTipoActivoFijo,this,this.tipoactivofijoConstantesFunciones.activarid_paisTipoActivoFijo));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipoactivofijoConstantesFunciones.resaltarid_paisTipoActivoFijo,this,this.tipoactivofijoConstantesFunciones.activarid_paisTipoActivoFijo,true,"id_paisTipoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,TipoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoactivofijoConstantesFunciones.mostrarnombreTipoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoactivofijoConstantesFunciones.resaltarnombreTipoActivoFijo,this.tipoactivofijoConstantesFunciones.activarnombreTipoActivoFijo,this,true,"nombreTipoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoactivofijoConstantesFunciones.resaltarnombreTipoActivoFijo,this.tipoactivofijoConstantesFunciones.activarnombreTipoActivoFijo,this,true,"nombreTipoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoActivoFijo.moveColumn(this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoActivoFijo.moveColumn(this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoActivoFijo.moveColumn(this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoactivofijoLogic.getTipoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoactivofijos.size()-1;
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
		//this.jTableDatosTipoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoActivoFijo();
			
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
				
				//this.isEsNuevoTipoActivoFijo=false;
					
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
				if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoactivofijo.getsType().equals("DUPLICADO")
				   || this.tipoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoActivoFijo=true;
				
				} else {
					this.isEsNuevoTipoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoactivofijo.getId()>=0 && !this.tipoactivofijo.getIsNew()) {						
						this.isEsNuevoTipoActivoFijo=false;
						
					} else {
						this.isEsNuevoTipoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoActivoFijo(esRelaciones);						
				
				this.seleccionarTipoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoactivofijo.getId()<0) {
					this.isEsNuevoTipoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoActivoFijo(evt,rowIndex);
				}	
				
				if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoActivoFijo: " + this.dDif); 
					}
				}								
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoactivofijo)) {
					if(this.tipoactivofijo.getId()>0) {
						this.tipoactivofijo.setIsDeleted(true);
						
						this.tipoactivofijosEliminados.add(this.tipoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoactivofijoLogic.getTipoActivoFijos().remove(this.tipoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoactivofijos.remove(this.tipoactivofijo);				
					}
					
					
					((TipoActivoFijoModel) this.jTableDatosTipoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipoactivofijoConstantesFunciones.cargarid_paisTipoActivoFijo || this.tipoactivofijoConstantesFunciones.event_dependid_paisTipoActivoFijo) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipoactivofijo.getid_pais());
									//this.inicializarActualizarBindingTipoActivoFijo(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipoactivofijo.getPais()!=null) {
							this.paissForeignKey.add(tipoactivofijo.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipoactivofijo.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoActivoFijo(TipoActivoFijo tipoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoActivoFijo(tipoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoActivoFijo(TipoActivoFijo tipoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoActivoFijo(tipoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoActivoFijo(tipoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijo(tipoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoActivoFijo(TipoActivoFijo tipoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setText(tipoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setText(tipoactivofijo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoActivoFijo tipoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoActivoFijo tipoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoactivofijoLocal=this.tipoactivofijo;
			} else {
				tipoactivofijoLocal=this.tipoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoActivoFijo(tipoactivofijoLocal,true);
					
					if(tipoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoActivoFijo(TipoActivoFijo tipoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoActivoFijo(tipoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(tipoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoActivoFijo(TipoActivoFijo tipoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoActivoFijo(tipoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoActivoFijo(TipoActivoFijo tipoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.getText()==null || this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setText("0");
			}

			if(conColumnasBase) {tipoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelIdTipoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoactivofijo.setnombre(this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoActivoFijo.jLabelnombreTipoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoActivoFijo(TipoActivoFijo tipoactivofijoBean,TipoActivoFijo tipoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoactivofijoBean.getid_pais()!=null && !tipoactivofijoBean.getid_pais().equals(-1L))) {tipoactivofijo.setid_pais(tipoactivofijoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoActivoFijo(TipoActivoFijo tipoactivofijoOrigen,TipoActivoFijo tipoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoactivofijoOrigen.getId()!=null && !tipoactivofijoOrigen.getId().equals(0L))) {tipoactivofijo.setId(tipoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoactivofijoOrigen.getid_pais()!=null && !tipoactivofijoOrigen.getid_pais().equals(-1L))) {tipoactivofijo.setid_pais(tipoactivofijoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipoactivofijoOrigen.getnombre()!=null && !tipoactivofijoOrigen.getnombre().equals(""))) {tipoactivofijo.setnombre(tipoactivofijoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoActivoFijo(TipoActivoFijo tipoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setText(tipoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setText(tipoactivofijo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoActivoFijo(TipoActivoFijoBean tipoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setText(tipoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setText(tipoactivofijoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoActivoFijo(TipoActivoFijoParameterReturnGeneral tipoactivofijoReturnGeneral,TipoActivoFijoBean tipoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			TipoActivoFijo tipoactivofijoLocal=new TipoActivoFijo();
			
			tipoactivofijoLocal=tipoactivofijoReturnGeneral.getTipoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoactivofijoLocal.getId()!=null && !tipoactivofijoLocal.getId().equals(0L))) {tipoactivofijoBean.setId(tipoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && tipoactivofijoLocal.getid_pais()!=null && !tipoactivofijoLocal.getid_pais().equals(-1L))) {tipoactivofijoBean.setid_pais(tipoactivofijoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipoactivofijoLocal.getnombre()!=null && !tipoactivofijoLocal.getnombre().equals(""))) {tipoactivofijoBean.setnombre(tipoactivofijoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoActivoFijoGenerico(Long idTipoActivoFijoSeleccionado,JComboBox jComboBoxTipoActivoFijo,List<TipoActivoFijo> tipoactivofijosLocal)throws Exception {
		try {
			TipoActivoFijo  tipoactivofijoTemp=null;

			for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosLocal) {
				if(tipoactivofijoAux.getId()!=null && tipoactivofijoAux.getId().equals(idTipoActivoFijoSeleccionado)) {
					tipoactivofijoTemp=tipoactivofijoAux;
					break;
				}
			}

			jComboBoxTipoActivoFijo.setSelectedItem(tipoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoActivoFijoGenerico(JComboBox jComboBoxTipoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijo=(TipoActivoFijo) tipoactivofijoLogic.getTipoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoactivofijo =(TipoActivoFijo) tipoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipoactivofijo.getIsNew() && !tipoactivofijo.getIsChanged() && !tipoactivofijo.getIsDeleted()) {
				sDescripcion=tipoactivofijo.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipoactivofijo.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoActivoFijo tipoactivofijoRow=new TipoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijoRow=(TipoActivoFijo) tipoactivofijoLogic.getTipoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoactivofijoRow=(TipoActivoFijo) tipoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));			
			this.jButtonDuplicarTipoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijo && this.isPermisoDuplicarTipoActivoFijo));			
			this.jButtonCopiarTipoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijo && this.isPermisoCopiarTipoActivoFijo));
			this.jButtonVerFormTipoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijo && this.isPermisoVerFormTipoActivoFijo));
			
			this.jButtonAbrirOrderByTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));			
			
			this.jButtonNuevoRelacionesTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));			
			this.jButtonNuevoGuardarCambiosTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarTipoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijo && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijo && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijo && this.isPermisoEliminarTipoActivoFijo));
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijo);							
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));						
			this.jButtonDuplicarToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijo && this.isPermisoDuplicarTipoActivoFijo));						
			this.jButtonCopiarToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijo && this.isPermisoCopiarTipoActivoFijo));			
			this.jButtonVerFormToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijo && this.isPermisoVerFormTipoActivoFijo));			
			this.jButtonAbrirOrderByToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));
			this.jButtonNuevoRelacionesToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijo && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijo  && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijo && this.isPermisoEliminarTipoActivoFijo));
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarToolBarTipoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijo);				
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));			
			this.jMenuItemDuplicarTipoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoActivoFijo && this.isPermisoDuplicarTipoActivoFijo));			
			this.jMenuItemCopiarTipoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoActivoFijo && this.isPermisoCopiarTipoActivoFijo));			
			this.jMenuItemVerFormTipoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoActivoFijo && this.isPermisoVerFormTipoActivoFijo));			
			this.jMenuItemAbrirOrderByTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));			
			//this.jMenuItemMostrarOcultarTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarTipoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoActivoFijo && this.isPermisoOrdenTipoActivoFijo));			
			this.jMenuItemNuevoRelacionesTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosTipoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoActivoFijo && this.isPermisoNuevoTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemModificarTipoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoActivoFijo && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemActualizarTipoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoActivoFijo && this.isPermisoActualizarTipoActivoFijo));	
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemEliminarTipoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoActivoFijo && this.isPermisoEliminarTipoActivoFijo));
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemCancelarTipoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=this.jButtonNuevoTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoActivoFijo=this.jButtonDuplicarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarTipoActivoFijo=this.jButtonCopiarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormTipoActivoFijo=this.jButtonVerFormTipoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoActivoFijo=this.jButtonAbrirOrderByTipoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=this.jButtonNuevoRelacionesTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarTipoActivoFijo=this.jButtonModificarTipoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=this.jButtonGuardarCambiosTablaTipoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoActivoFijo=this.jButtonNuevoToolBarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=this.jButtonNuevoRelacionesToolBarTipoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarToolBarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarToolBarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarToolBarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarToolBarTipoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoActivoFijo=this.jButtonGuardarCambiosToolBarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoActivoFijo=this.jMenuItemNuevoTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=this.jMenuItemNuevoRelacionesTipoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemModificarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemActualizarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemEliminarTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoActivoFijo=this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemCancelarTipoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoActivoFijo=this.jMenuItemGuardarCambiosTipoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=this.jMenuItemGuardarCambiosTablaTipoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoActivoFijo(Boolean esInicializar) {
		if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoActivoFijo() {
		this.jButtonNuevoTipoActivoFijo.setVisible(this.isPermisoNuevoTipoActivoFijo);			
		this.jButtonDuplicarTipoActivoFijo.setVisible(this.isPermisoDuplicarTipoActivoFijo);			
		this.jButtonCopiarTipoActivoFijo.setVisible(this.isPermisoCopiarTipoActivoFijo);			
		this.jButtonVerFormTipoActivoFijo.setVisible(this.isPermisoVerFormTipoActivoFijo);			
		
		this.jButtonAbrirOrderByTipoActivoFijo.setVisible(this.isPermisoOrdenTipoActivoFijo);					
		
		this.jButtonNuevoRelacionesTipoActivoFijo.setVisible(this.isPermisoNuevoTipoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarTipoActivoFijo.setVisible(this.isPermisoActualizarTipoActivoFijo);	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.setVisible(this.isPermisoActualizarTipoActivoFijo);	
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.setVisible(this.isPermisoEliminarTipoActivoFijo);
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijo);						
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.setVisible(this.isPermisoGuardarCambiosTipoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.setVisible(this.isPermisoActualizarTipoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoActivoFijo() {
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarTipoActivoFijo.setVisible(this.isPermisoActualizarTipoActivoFijo);	
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.setVisible(this.isPermisoActualizarTipoActivoFijo);	
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.setVisible(this.isPermisoEliminarTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoActivoFijo);							
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoActivoFijo && this.isPermisoGuardarCambiosTipoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoActivoFijo() {
		if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoActivoFijo() {
	}
	
	public void jTableDatosTipoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.gettipoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijo==null) {
						this.tipoactivofijo = new TipoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
				}

				if(this.tipoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoActivoFijo(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.gettipoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipoactivofijoLogic.getConnexion());

				if(this.tipoactivofijo.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipoactivofijo.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoActivoFijo=(TitledBorder)this.jScrollPanelDatosTipoActivoFijo.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoActivoFijo.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.gettipoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijo==null) {
						this.tipoactivofijo = new TipoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
				}

				if(this.tipoactivofijo.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipoactivofijo.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.gettipoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoactivofijo==null) {
						this.tipoactivofijo = new TipoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);
				}

				if(this.tipoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoActivoFijo(false,false);

			this.getTipoActivoFijosFK_IdPais();

			this.inicializarActualizarBindingTipoActivoFijo(false);

			//if(TipoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoActivoFijo() {
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoActivoFijo.dispose();
			this.jInternalFrameDetalleFormTipoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoTipoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoTipoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionTipoActivoFijo!=null) {
			this.jInternalFrameImportacionTipoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoActivoFijo.dispose();
			this.jInternalFrameImportacionTipoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoActivoFijo();
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoActivoFijo")) {
				jButtonDuplicarTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoActivoFijo")) {
				jButtonCopiarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoActivoFijo")) {
				jButtonVerFormTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoActivoFijo")) {
				jButtonDuplicarTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoActivoFijo")) {
				jButtonDuplicarTipoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoActivoFijo")) {
				jButtonModificarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoActivoFijo")) {
				jButtonModificarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoActivoFijo")) {
				jButtonModificarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoActivoFijo")) {
				jButtonActualizarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoActivoFijo")) {
				jButtonActualizarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoActivoFijo")) {
				jButtonActualizarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoActivoFijo")) {
				jButtonEliminarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoActivoFijo")) {
				jButtonEliminarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoActivoFijo")) {
				jButtonEliminarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoActivoFijo")) {
				jButtonCancelarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoActivoFijo")) {
				jButtonCancelarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoActivoFijo")) {
				jButtonCancelarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoActivoFijo")) {
				jButtonCerrarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoActivoFijo")) {
				jButtonCerrarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoActivoFijo")) {
				jButtonCerrarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoActivoFijo")) {
				jButtonMostrarOcultarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoActivoFijo")) {
				jButtonCancelarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoActivoFijo")) {
				jButtonCopiarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoActivoFijo")) {
				jButtonVerFormTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoActivoFijo")) {
				jButtonCopiarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoActivoFijo")) {
				jButtonVerFormTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoActivoFijo")) {
				jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoActivoFijo")) {
				jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoActivoFijo")) {
				jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoActivoFijo")) {
				jButtonAnterioresTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoActivoFijo")) {
				jButtonAnterioresTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoActivoFijo")) {
				jButtonAnterioresTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoActivoFijo")) {
				jButtonSiguientesTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoActivoFijo")) {
				jButtonSiguientesTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoActivoFijo")) {
				jButtonSiguientesTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoActivoFijo")) {
				jButtonAbrirOrderByTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoActivoFijo")) {
				jButtonMostrarOcultarTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoActivoFijo")) {
				jButtonCerrarReporteDinamicoTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoActivoFijo")) {
				jButtonGenerarReporteDinamicoTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoActivoFijo")) {
				jButtonCerrarImportacionTipoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoActivoFijo")) {
				
				jButtonGenerarImportacionTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoActivoFijo")) {
				
				jButtonAbrirImportacionTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoActivoFijo")) {
				jComboBoxTiposAccionesTipoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoActivoFijo")) {
				jComboBoxTiposRelacionesTipoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoActivoFijo")) {
				jComboBoxTiposAccionesTipoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoActivoFijo")) {
				
				jComboBoxTiposSeleccionarTipoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoActivoFijo")) {
				jTextFieldValorCampoGeneralTipoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoActivoFijo")) {
				jButtonAbrirOrderByTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoActivoFijo")) {
				jButtonAbrirOrderByTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoActivoFijo")) {
				jButtonCerrarOrderByTipoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoActivoFijoBusqueda")) {
				this.jButtonidTipoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoActivoFijoUpdate")) {
				this.jButtonid_paisTipoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoActivoFijoBusqueda")) {
				this.jButtonnombreTipoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoActivoFijo")) {
				this.jButtonFK_IdPaisTipoActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoActivoFijo tipoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoactivofijoLocal=this.tipoactivofijo;
			} else {
				tipoactivofijoLocal=this.tipoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
							
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
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
			
			


			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
								
						
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
								
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
							
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
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
			
			


			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
								
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoActivoFijo")) {
					jCheckBoxSeleccionarTodosTipoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoActivoFijo")) {
					jCheckBoxSeleccionadosTipoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoActivoFijo")) {
					
				}
				
				


				
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
												
				
				


				
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
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
			
			


			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoactivofijo);
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
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
				
				


				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoactivofijoAnterior =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoactivofijo =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoActivoFijo")) {
				
				}
				
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoActivoFijo")) {
			
			}
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoActivoFijo();
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoActivoFijo")) {
				jButtonDuplicarTipoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoActivoFijo")) {
				jButtonCopiarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoActivoFijo")) {
				jButtonVerFormTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoActivoFijo")) {
				jButtonNuevoTipoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoActivoFijo")) {
				jButtonModificarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoActivoFijo")) {
				jButtonActualizarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoActivoFijo")) {
				jButtonEliminarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoActivoFijo")) {
				jButtonCancelarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoActivoFijo")) {
				jButtonCerrarTipoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoActivoFijo")) {
				jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoActivoFijo")) {
				jButtonAbrirOrderByTipoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoActivoFijo")) {
				jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoActivoFijo")) {
				jButtonAnterioresTipoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoActivoFijo")) {
				jButtonSiguientesTipoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoActivoFijoBusqueda")) {
				this.jButtonidTipoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoActivoFijoUpdate")) {
				this.jButtonid_paisTipoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoActivoFijoBusqueda")) {
				this.jButtonnombreTipoActivoFijoBusquedaActionPerformed(evt);
			}
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoActivoFijo")) {
				closingInternalFrameTipoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarTipoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoActivoFijoActionPerformed(null);
			}
			
			TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoactivofijo,new Object(),this.tipoactivofijoParameterGeneral,this.tipoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoactivofijo)) {
			if(!esControlTabla) {
				if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);			
				}
				
				if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoActivoFijo(this.tipoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoactivofijoReturnGeneral=tipoactivofijoLogic.procesarEventosTipoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoLogic.getTipoActivoFijos(),this.tipoactivofijo,this.tipoactivofijoParameterGeneral,this.isEsNuevoTipoActivoFijo,classes);//this.tipoactivofijoLogic.getTipoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoActivoFijo(this.tipoactivofijoReturnGeneral,this.tipoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoActivoFijo(classes,this.tipoactivofijoReturnGeneral,this.tipoactivofijoBean,false);
					}
						
					if(this.tipoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo());	
					}
						
					if(this.tipoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo(),classes);//this.tipoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoActivoFijo(this.tipoactivofijo,classes);//this.tipoactivofijoBean);									
				}
			
				if(TipoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoActivoFijo(this.tipoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoActivoFijo(this.tipoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoactivofijoAnterior!=null) {
						this.tipoactivofijo=this.tipoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoactivofijoReturnGeneral=tipoactivofijoLogic.procesarEventosTipoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijoLogic.getTipoActivoFijos(),this.tipoactivofijo,this.tipoactivofijoParameterGeneral,this.isEsNuevoTipoActivoFijo,classes);//this.tipoactivofijoLogic.getTipoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoactivofijoReturnGeneral.getTipoActivoFijo(),tipoactivofijoLogic.getTipoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoactivofijoReturnGeneral.getTipoActivoFijo(),this.tipoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoActivoFijo() throws Exception {
		
		TipoActivoFijoModel tipoactivofijoModel=(TipoActivoFijoModel)this.jTableDatosTipoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoactivofijoModel.tipoactivofijos=this.tipoactivofijoLogic.getTipoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoactivofijoModel.tipoactivofijos=this.tipoactivofijos;
		}
		
		
		((TipoActivoFijoModel) this.jTableDatosTipoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoactivofijoAnterior(),this.tipoactivofijoLogic.getTipoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoactivofijoAnterior(),this.tipoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoActivoFijo(TipoActivoFijo tipoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijo,new Object(),generalEntityParameterGeneral,this.tipoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoactivofijo,new Object(),generalEntityParameterGeneral,this.tipoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoActivoFijo(TipoActivoFijoBean tipoactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoActivoFijo(ArrayList<Classe> classes,TipoActivoFijoReturnGeneral tipoactivofijoReturnGeneral,TipoActivoFijoBean tipoactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoActivoFijo(TipoActivoFijo tipoactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoActivoFijo = new TipoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipoactivofijoSessionBean.getConGuardarRelaciones(),this.tipoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormTipoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoActivoFijo.tipoactivofijoLogic=this.tipoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyTipoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoActivoFijo"));
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoActivoFijo"));

		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemModificarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoActivoFijo"));
						
		this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemActualizarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoActivoFijo"));
								
		this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemEliminarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemCancelarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemDetalleCerrarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonidTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonnombreTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoActivoFijo"));
		}
		
		this.jTableDatosTipoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoActivoFijo"));
		
		this.jTableDatosTipoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoActivoFijo"));
		
		this.jButtonNuevoTipoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoTipoActivoFijo"));
		
		this.jButtonDuplicarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarTipoActivoFijo"));
		
		this.jButtonCopiarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarTipoActivoFijo"));
		
		this.jButtonVerFormTipoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormTipoActivoFijo"));
		
		
		this.jButtonNuevoToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoActivoFijo"));
			
		this.jButtonDuplicarToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoActivoFijo"));
			
		this.jMenuItemNuevoTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoActivoFijo"));
			
		this.jMenuItemDuplicarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesTipoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesTipoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonModificarToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemModificarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonActualizarToolBarTipoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoActivoFijo"));
				
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemActualizarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonEliminarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoActivoFijo"));
						
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemEliminarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonCancelarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemCancelarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoActivoFijo"));		
		
		
		this.jButtonCerrarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarTipoActivoFijo"));
		
		
		this.jButtonCerrarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoActivoFijo"));
			
		this.jMenuItemCerrarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jMenuItemDetalleCerrarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoActivoFijo"));
			
		this.jButtonVerFormToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoActivoFijo"));
		
		this.jMenuItemGuardarCambiosTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoActivoFijo"));
			
		this.jMenuItemCopiarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoActivoFijo"));		
		
		this.jMenuItemVerFormTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionTipoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoActivoFijo"));
		
		this.jMenuItemRecargarInformacionTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoActivoFijo"));		
		
		
		
		this.jButtonAnterioresTipoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresTipoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoActivoFijo"));
		
		this.jMenuItemAnterioresTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoActivoFijo"));		
		
		
		this.jButtonSiguientesTipoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesTipoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoActivoFijo"));
			
		this.jMenuItemSiguientesTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoActivoFijo"));
			
		this.jMenuItemAbrirOrderByTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoActivoFijo"));
			
		this.jMenuItemMostrarOcultarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoActivoFijo"));

		this.jCheckBoxSeleccionadosTipoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoActivoFijo"));
			
		this.jComboBoxTiposAccionesTipoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralTipoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonidTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonnombreTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoActivoFijo!=null) {
				this.jInternalFrameImportacionTipoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoActivoFijo"));
				this.jInternalFrameImportacionTipoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoActivoFijo"));
				this.jInternalFrameImportacionTipoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarTipoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoActivoFijo"));			
			
			if(this.jInternalFrameOrderByTipoActivoFijo!=null) {
				this.jInternalFrameOrderByTipoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoActivoFijo.jTabbedPaneRelacionesTipoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoActivoFijo"));
		
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
            		closingInternalFrameTipoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            TipoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoActivoFijo";
		inputMap = this.jButtonNuevoTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoActivoFijo";
		inputMap = this.jButtonModificarTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoActivoFijo";
		inputMap = this.jButtonActualizarTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoActivoFijo";
		inputMap = this.jButtonEliminarTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoActivoFijo";
		inputMap = this.jButtonCancelarTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoActivoFijo";
		inputMap = this.jButtonCerrarTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonGuardarCambiosTipoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonidTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonid_paisTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoActivoFijo.jButtonnombreTipoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
					tipoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijo tipoactivofijoAux:tipoactivofijos) {
					tipoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
						tipoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijo tipoactivofijoAux:tipoactivofijos) {
						tipoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijo tipoactivofijoAux:tipoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoActivoFijo.getSelectedRows();
			
			TipoActivoFijo tipoactivofijoLocal=new TipoActivoFijo();
			
			//this.seleccionarTodosTipoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoactivofijoLocal =(TipoActivoFijo) this.tipoactivofijoLogic.getTipoActivoFijos().toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoactivofijoLocal =(TipoActivoFijo) this.tipoactivofijos.toArray()[this.jTableDatosTipoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
						tipoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoActivoFijo tipoactivofijoAux:tipoactivofijos) {
						tipoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijoLogic.getTipoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijo tipoactivofijoAux:tipoactivofijos) {
					
						if(sTipoSeleccionar.equals(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoActivoFijo(conSplash);
				
					this.generarReporteTipoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoActivoFijo();
				
				this.exportarTipoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoActivoFijos();
				//this.importarTipoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxTiposAccionesFormularioTipoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoActivoFijo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoActivoFijo();
			
			if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
			TipoActivoFijo tipoactivofijo=new TipoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoActivoFijo.getSelectedItem();
			
			
			
			
			tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoactivofijosSeleccionados.size()==1) {
				for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
					tipoactivofijo=tipoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoActivoFijo();
			
      		//this.finishProcessTipoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoActivoFijoReturnGeneral() throws Exception {
		if(this.tipoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoActivoFijo(false);
		}
		
		if(this.tipoactivofijoReturnGeneral.getConRetornoLista() || this.tipoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoactivofijoLogic.setTipoActivoFijos(this.tipoactivofijoReturnGeneral.getTipoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoactivofijoLogic.setTipoActivoFijo(this.tipoactivofijoReturnGeneral.getTipoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<TipoActivoFijo> getTipoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoActivoFijo tipoactivofijoAux:tipoactivofijoLogic.getTipoActivoFijos()) {
					if(tipoactivofijoAux.getIsSelected()) {
						tipoactivofijosSeleccionados.add(tipoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoActivoFijo tipoactivofijoAux:this.tipoactivofijos) {
					if(tipoactivofijoAux.getIsSelected()) {
						tipoactivofijosSeleccionados.add(tipoactivofijoAux);				
					}
				}
			}
			
			if(tipoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoactivofijosSeleccionados.addAll(this.tipoactivofijoLogic.getTipoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoactivofijosSeleccionados.addAll(this.tipoactivofijos);				
					}
				}
			}
		} else {
			tipoactivofijosSeleccionados.add(this.tipoactivofijo);
		}
		
		return tipoactivofijosSeleccionados;
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
	
	public void generarReporteTipoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoActivoFijo();
		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoActivoFijo();
		
		
		//this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados ,tipoactivofijoImplementable,tipoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionTipoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoActivoFijo();
		
		this.abrirFrameImportacionTipoActivoFijo();		
		
			
		//this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados ,tipoactivofijoImplementable,tipoactivofijoImplementableHome);
	}
	
	public void importarTipoActivoFijos() throws Exception {		
	
	}
	
	public void exportarTipoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoActivoFijo(tipoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoactivofijoAux.setsDetalleGeneralEntityReporte(tipoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoActivoFijo(TipoActivoFijo tipoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijo.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoactivofijo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoActivoFijo(row);				
				iRow++;
			}				
			
			for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoActivoFijo(tipoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();		
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoactivofijo");
			//elementRoot.appendChild(element);
		
			for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
				element = document.createElement("tipoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoActivoFijo(tipoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoActivoFijo(TipoActivoFijo tipoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijo.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoactivofijo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoActivoFijo(TipoActivoFijo tipoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoActivoFijoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipoactivofijo.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados=new ArrayList<TipoActivoFijo>();
		
		tipoactivofijosSeleccionados=this.getTipoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoActivoFijo(tipoactivofijosSeleccionados);
		
		this.generarReporteTipoActivoFijos("Todos",tipoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoActivoFijo(ArrayList<TipoActivoFijo> tipoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoActivoFijo tipoactivofijoAux:tipoactivofijosSeleccionados) {
				tipoactivofijoAux.setsDetalleGeneralEntityReporte(tipoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipoactivofijoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipoactivofijoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=true;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=true;
			this.isVisibilidadCeldaModificarTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoActivoFijo=true;
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsTipoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormTipoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;												
			}
			
			this.jButtonCerrarTipoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoactivofijo)) {
			this.isVisibilidadCeldaActualizarTipoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoActivoFijo() {
	}
	
	public void actualizarEstadoPanelsTipoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoActivoFijo!=null) {
				this.jScrollPanelDatosTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoActivoFijo!=null) {
				this.jPanelPaginacionTipoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
					this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoActivoFijo.remove(jPanelFK_IdPaisTipoActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoActivoFijoSessionBean tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		
		if(this.tipoactivofijoSessionBean==null) {
			this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		}
		
		this.tipoactivofijoSessionBean.setsUltimaBusquedaTipoActivoFijo(this.getsAccionBusqueda());
		this.tipoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipoactivofijoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoActivoFijoSessionBean tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		
		if(this.tipoactivofijoSessionBean==null) {
			this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		}
		
		if(this.tipoactivofijoSessionBean.getsUltimaBusquedaTipoActivoFijo()!=null&&!this.tipoactivofijoSessionBean.getsUltimaBusquedaTipoActivoFijo().equals("")) {
			this.setsAccionBusqueda(tipoactivofijoSessionBean.getsUltimaBusquedaTipoActivoFijo());
			this.setiNumeroPaginacion(tipoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipoactivofijoSessionBean.getid_pais());
				tipoactivofijoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipoactivofijoSessionBean.setsUltimaBusquedaTipoActivoFijo("");
		this.tipoactivofijoSessionBean.setiNumeroPaginacion(TipoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.tipoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioTipoActivoFijo();
		this.updateVisibilidadBusquedasFormularioTipoActivoFijo();
		this.updateHabilitarBusquedasFormularioTipoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoActivoFijo.getComponents().length>0) {
	

		if(this.tipoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasTipoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoActivoFijo.getComponent(index);
				jPanel.setBorder(this.tipoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoActivoFijo);
			if(!this.tipoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasTipoActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoactivofijoConstantesFunciones.activarFK_IdPaisTipoActivoFijo);
				this.jTabbedPaneBusquedasTipoActivoFijo.setEnabledAt(index,this.tipoactivofijoConstantesFunciones.activarFK_IdPaisTipoActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoActivoFijo);

			this.jTabbedPaneBusquedasTipoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoActivoFijo.getComponent(index);

			this.tipoactivofijoConstantesFunciones.setResaltarFK_IdPaisTipoActivoFijo(resaltar);

			jPanel.setBorder(this.tipoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioTipoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioTipoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoactivofijoConstantesFunciones.resaltaridTipoActivoFijo!=null && this.jInternalFrameDetalleFormTipoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setBorder(this.tipoactivofijoConstantesFunciones.resaltaridTipoActivoFijo);}
		if(this.tipoactivofijoConstantesFunciones.resaltarid_paisTipoActivoFijo!=null && this.jInternalFrameDetalleFormTipoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setBorder(this.tipoactivofijoConstantesFunciones.resaltarid_paisTipoActivoFijo);}
		if(this.tipoactivofijoConstantesFunciones.resaltarnombreTipoActivoFijo!=null && this.jInternalFrameDetalleFormTipoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setBorder(this.tipoactivofijoConstantesFunciones.resaltarnombreTipoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostraridTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jPanelidTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostraridTipoActivoFijo);
		//this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostrarid_paisTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jPanelid_paisTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostrarid_paisTipoActivoFijo);
		//this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostrarnombreTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jPanelnombreTipoActivoFijo.setVisible(this.tipoactivofijoConstantesFunciones.mostrarnombreTipoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormTipoActivoFijo.jTextFieldidTipoActivoFijo.setEnabled(this.tipoactivofijoConstantesFunciones.activaridTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jComboBoxid_paisTipoActivoFijo.setEnabled(this.tipoactivofijoConstantesFunciones.activarid_paisTipoActivoFijo);
		this.jInternalFrameDetalleFormTipoActivoFijo.jTextAreanombreTipoActivoFijo.setEnabled(this.tipoactivofijoConstantesFunciones.activarnombreTipoActivoFijo);
		}
	}
	
		
}
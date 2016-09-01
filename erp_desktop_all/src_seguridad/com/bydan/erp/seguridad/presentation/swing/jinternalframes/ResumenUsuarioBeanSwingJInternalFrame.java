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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.ResumenUsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.ResumenUsuarioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ResumenUsuarioParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ResumenUsuarioBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class ResumenUsuarioBeanSwingJInternalFrame extends ResumenUsuarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResumenUsuarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ResumenUsuario> resumenusuarioValidator = new ClassValidator<ResumenUsuario>(ResumenUsuario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ResumenUsuario resumenusuario;	
	public ResumenUsuario resumenusuarioAux;
	public ResumenUsuario resumenusuarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ResumenUsuario resumenusuarioTotales;
	public Long idResumenUsuarioActual;
	public Long iIdNuevoResumenUsuario=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
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
	
	public Boolean isPermisoTodoResumenUsuario;
	public Boolean isPermisoNuevoResumenUsuario;
	public Boolean isPermisoActualizarResumenUsuario;
	public Boolean isPermisoActualizarOriginalResumenUsuario;
	public Boolean isPermisoEliminarResumenUsuario;
	public Boolean isPermisoGuardarCambiosResumenUsuario;
	public Boolean isPermisoConsultaResumenUsuario;
	public Boolean isPermisoBusquedaResumenUsuario;
	public Boolean isPermisoReporteResumenUsuario;
	public Boolean isPermisoPaginacionMedioResumenUsuario;
	public Boolean isPermisoPaginacionAltoResumenUsuario;
	public Boolean isPermisoPaginacionTodoResumenUsuario;
	public Boolean isPermisoCopiarResumenUsuario;
	public Boolean isPermisoVerFormResumenUsuario;
	public Boolean isPermisoDuplicarResumenUsuario;
	public Boolean isPermisoOrdenResumenUsuario;
	
	
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
	
	public ResumenUsuarioParameterReturnGeneral resumenusuarioReturnGeneral;
	public ResumenUsuarioParameterReturnGeneral resumenusuarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResumenUsuario=false;
	public Boolean esParaAccionDesdeFormularioResumenUsuario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResumenUsuarioSessionBeanAdditional resumenusuarioSessionBeanAdditional=null;
	
	public ResumenUsuarioSessionBeanAdditional getResumenUsuarioSessionBeanAdditional() {
		return this.resumenusuarioSessionBeanAdditional;
	}
	
	public void setResumenUsuarioSessionBeanAdditional(ResumenUsuarioSessionBeanAdditional resumenusuarioSessionBeanAdditional) {
		try {
			this.resumenusuarioSessionBeanAdditional=resumenusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResumenUsuarioBeanSwingJInternalFrameAdditional resumenusuarioBeanSwingJInternalFrameAdditional=null;
	//public class ResumenUsuarioBeanSwingJInternalFrame
	
	public ResumenUsuarioBeanSwingJInternalFrameAdditional getResumenUsuarioBeanSwingJInternalFrameAdditional() {
		return this.resumenusuarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setResumenUsuarioBeanSwingJInternalFrameAdditional(ResumenUsuarioBeanSwingJInternalFrameAdditional resumenusuarioBeanSwingJInternalFrameAdditional) {
		try {
			this.resumenusuarioBeanSwingJInternalFrameAdditional=resumenusuarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResumenUsuarioLogic resumenusuarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ResumenUsuario resumenusuarioBean;
	public ResumenUsuarioConstantesFunciones resumenusuarioConstantesFunciones;
	//public ResumenUsuarioParameterReturnGeneral resumenusuarioReturnGeneral;
	
	//FK
	
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<ResumenUsuario> resumenusuarios;	
	//public List<ResumenUsuario> resumenusuariosEliminados;
	//public List<ResumenUsuario> resumenusuariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResumenUsuario=false;
	public Boolean isVisibilidadCeldaDuplicarResumenUsuario=true;
	public Boolean isVisibilidadCeldaCopiarResumenUsuario=true;
	public Boolean isVisibilidadCeldaVerFormResumenUsuario=true;
	public Boolean isVisibilidadCeldaOrdenResumenUsuario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
	public Boolean isVisibilidadCeldaModificarResumenUsuario=false;
	public Boolean isVisibilidadCeldaActualizarResumenUsuario=false;
	public Boolean isVisibilidadCeldaEliminarResumenUsuario=false;
	public Boolean isVisibilidadCeldaCancelarResumenUsuario=false;
	public Boolean isVisibilidadCeldaGuardarResumenUsuario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResumenUsuario=false;	
	
	
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoResumenUsuario() {
		return this.iIdNuevoResumenUsuario;
	}

	public void setiIdNuevoResumenUsuario(Long iIdNuevoResumenUsuario) {
		this.iIdNuevoResumenUsuario = iIdNuevoResumenUsuario;
	}
	
	public Long getidResumenUsuarioActual() {
		return this.idResumenUsuarioActual;
	}

	public void setidResumenUsuarioActual(Long idResumenUsuarioActual) {
		this.idResumenUsuarioActual = idResumenUsuarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ResumenUsuario getresumenusuario() {
		return this.resumenusuario;
	}

	public void setresumenusuario(ResumenUsuario resumenusuario) {
		this.resumenusuario = resumenusuario;
	}
	
	public ResumenUsuario getresumenusuarioAux() {
		return this.resumenusuarioAux;
	}

	public void setresumenusuarioAux(ResumenUsuario resumenusuarioAux) {
		this.resumenusuarioAux = resumenusuarioAux;
	}				
	
	public ResumenUsuario getresumenusuarioAnterior() {
		return this.resumenusuarioAnterior;
	}

	public void setresumenusuarioAnterior(ResumenUsuario resumenusuarioAnterior) {
		this.resumenusuarioAnterior = resumenusuarioAnterior;
	}	
	
	public ResumenUsuario getresumenusuarioTotales() {
		return this.resumenusuarioTotales;
	}

	public void setresumenusuarioTotales(ResumenUsuario resumenusuarioTotales) {
		this.resumenusuarioTotales = resumenusuarioTotales;
	}	
	
	public ResumenUsuario getresumenusuarioBean() {
		return this.resumenusuarioBean;
	}

	public void setresumenusuarioBean(ResumenUsuario resumenusuarioBean) {
		this.resumenusuarioBean = resumenusuarioBean;
	}	
	
	public ResumenUsuarioParameterReturnGeneral getresumenusuarioReturnGeneral() {
		return this.resumenusuarioReturnGeneral;
	}

	public void setresumenusuarioReturnGeneral(ResumenUsuarioParameterReturnGeneral resumenusuarioReturnGeneral) {
		this.resumenusuarioReturnGeneral = resumenusuarioReturnGeneral;
	}	
	
	
	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ResumenUsuarioLogic getResumenUsuarioLogic()	{		
		return resumenusuarioLogic;
	}

	public void setResumenUsuarioLogic(ResumenUsuarioLogic resumenusuarioLogic) {
		this.resumenusuarioLogic = resumenusuarioLogic;
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
	
	public Boolean getIsEsNuevoResumenUsuario() {
		return isEsNuevoResumenUsuario;
	}

	public void setIsEsNuevoResumenUsuario(Boolean isEsNuevoResumenUsuario) {
		this.isEsNuevoResumenUsuario = isEsNuevoResumenUsuario;
	}

	public Boolean getEsParaAccionDesdeFormularioResumenUsuario() {
		return esParaAccionDesdeFormularioResumenUsuario;
	}
	
	public void setEsParaAccionDesdeFormularioResumenUsuario(Boolean esParaAccionDesdeFormularioResumenUsuario) {
		this.esParaAccionDesdeFormularioResumenUsuario = esParaAccionDesdeFormularioResumenUsuario;
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
	
	
	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.resumenusuarioSessionBean==null) {
				this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
			}

			if(!this.resumenusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(resumenusuarioSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

	
	
	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.resumenusuario!=null) {
						this.resumenusuario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
						this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioResumenUsuario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
						if(this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioResumenUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioResumenUsuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioResumenUsuarioGenerico!=null && jComboBoxid_usuarioResumenUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioResumenUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(ResumenUsuario resumenusuario,JComboBox jComboBoxid_usuarioResumenUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioResumenUsuarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioResumenUsuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				resumenusuario.setid_usuario(usuarioAux.getId());
				resumenusuario.setusuario_descripcion(ResumenUsuarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				resumenusuario.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResumenUsuario!=null) { 
							this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResumenUsuario!=null) { 
					}

					if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
							this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
							this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesResumenUsuario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ResumenUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesResumenUsuario(this.resumenusuarioLogic.getResumenUsuarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ResumenUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesResumenUsuario(this.resumenusuarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//resumenusuarioLogic.setResumenUsuarios(this.resumenusuarios);
			resumenusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ResumenUsuarioParameterReturnGeneral getResumenUsuarioParameterGeneral() {
		return this.resumenusuarioParameterGeneral;
	}
	
	public void setResumenUsuarioParameterGeneral(ResumenUsuarioParameterReturnGeneral resumenusuarioParameterGeneral) {
		this.resumenusuarioParameterGeneral = resumenusuarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResumenUsuario() {
		return isPermisoTodoResumenUsuario;
	}

	public void setIsPermisoTodoResumenUsuario(Boolean isPermisoTodoResumenUsuario) {
		this.isPermisoTodoResumenUsuario = isPermisoTodoResumenUsuario;
	}

	public Boolean getIsPermisoNuevoResumenUsuario() {
		return isPermisoNuevoResumenUsuario;
	}

	public void setIsPermisoNuevoResumenUsuario(Boolean isPermisoNuevoResumenUsuario) {
		this.isPermisoNuevoResumenUsuario = isPermisoNuevoResumenUsuario;
	}

	public Boolean getIsPermisoActualizarResumenUsuario() {
		return isPermisoActualizarResumenUsuario;
	}

	public void setIsPermisoActualizarResumenUsuario(Boolean isPermisoActualizarResumenUsuario) {
		this.isPermisoActualizarResumenUsuario = isPermisoActualizarResumenUsuario;
	}

	public Boolean getIsPermisoEliminarResumenUsuario() {
		return isPermisoEliminarResumenUsuario;
	}

	public void setIsPermisoEliminarResumenUsuario(Boolean isPermisoEliminarResumenUsuario) {
		this.isPermisoEliminarResumenUsuario = isPermisoEliminarResumenUsuario;
	}

	public Boolean getIsPermisoGuardarCambiosResumenUsuario() {
		return isPermisoGuardarCambiosResumenUsuario;
	}

	public void setIsPermisoGuardarCambiosResumenUsuario(Boolean isPermisoGuardarCambiosResumenUsuario) {
		this.isPermisoGuardarCambiosResumenUsuario = isPermisoGuardarCambiosResumenUsuario;
	}
	
	public Boolean getIsPermisoConsultaResumenUsuario() {
		return isPermisoConsultaResumenUsuario;
	}

	public void setIsPermisoConsultaResumenUsuario(Boolean isPermisoConsultaResumenUsuario) {
		this.isPermisoConsultaResumenUsuario = isPermisoConsultaResumenUsuario;
	}

	public Boolean getIsPermisoBusquedaResumenUsuario() {
		return isPermisoBusquedaResumenUsuario;
	}

	public void setIsPermisoBusquedaResumenUsuario(Boolean isPermisoBusquedaResumenUsuario) {
		this.isPermisoBusquedaResumenUsuario = isPermisoBusquedaResumenUsuario;
	}

	public Boolean getIsPermisoReporteResumenUsuario() {
		return isPermisoReporteResumenUsuario;
	}

	public void setIsPermisoReporteResumenUsuario(Boolean isPermisoReporteResumenUsuario) {
		this.isPermisoReporteResumenUsuario = isPermisoReporteResumenUsuario;
	}
	
	public Boolean getIsPermisoPaginacionMedioResumenUsuario() {
		return isPermisoPaginacionMedioResumenUsuario;
	}

	public void setIsPermisoPaginacionMedioResumenUsuario(Boolean isPermisoPaginacionMedioResumenUsuario) {
		this.isPermisoPaginacionMedioResumenUsuario = isPermisoPaginacionMedioResumenUsuario;
	}
	
	public Boolean getIsPermisoPaginacionTodoResumenUsuario() {
		return isPermisoPaginacionTodoResumenUsuario;
	}

	public void setIsPermisoPaginacionTodoResumenUsuario(Boolean isPermisoPaginacionTodoResumenUsuario) {
		this.isPermisoPaginacionTodoResumenUsuario = isPermisoPaginacionTodoResumenUsuario;
	}
	
	public Boolean getIsPermisoPaginacionAltoResumenUsuario() {
		return isPermisoPaginacionAltoResumenUsuario;
	}

	public void setIsPermisoPaginacionAltoResumenUsuario(Boolean isPermisoPaginacionAltoResumenUsuario) {
		this.isPermisoPaginacionAltoResumenUsuario = isPermisoPaginacionAltoResumenUsuario;
	}
	
	public Boolean getIsPermisoCopiarResumenUsuario() {
		return isPermisoCopiarResumenUsuario;
	}

	public void setIsPermisoCopiarResumenUsuario(Boolean isPermisoCopiarResumenUsuario) {
		this.isPermisoCopiarResumenUsuario = isPermisoCopiarResumenUsuario;
	}
	
	public Boolean getIsPermisoVerFormResumenUsuario() {
		return isPermisoVerFormResumenUsuario;
	}

	public void setIsPermisoVerFormResumenUsuario(Boolean isPermisoVerFormResumenUsuario) {
		this.isPermisoVerFormResumenUsuario = isPermisoVerFormResumenUsuario;
	}
	
	public Boolean getIsPermisoDuplicarResumenUsuario() {
		return isPermisoDuplicarResumenUsuario;
	}

	public void setIsPermisoDuplicarResumenUsuario(Boolean isPermisoDuplicarResumenUsuario) {
		this.isPermisoDuplicarResumenUsuario = isPermisoDuplicarResumenUsuario;
	}
	
	public Boolean getIsPermisoOrdenResumenUsuario() {
		return isPermisoOrdenResumenUsuario;
	}

	public void setIsPermisoOrdenResumenUsuario(Boolean isPermisoOrdenResumenUsuario) {
		this.isPermisoOrdenResumenUsuario = isPermisoOrdenResumenUsuario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResumenUsuario() {
		return isVisibilidadCeldaNuevoResumenUsuario;
	}

	public void setIsVisibilidadCeldaNuevoResumenUsuario(Boolean isVisibilidadCeldaNuevoResumenUsuario) {
		this.isVisibilidadCeldaNuevoResumenUsuario = isVisibilidadCeldaNuevoResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResumenUsuario() {
		return isVisibilidadCeldaDuplicarResumenUsuario;
	}

	public void setIsVisibilidadCeldaDuplicarResumenUsuario(Boolean isVisibilidadCeldaDuplicarResumenUsuario) {
		this.isVisibilidadCeldaDuplicarResumenUsuario = isVisibilidadCeldaDuplicarResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResumenUsuario() {
		return isVisibilidadCeldaCopiarResumenUsuario;
	}

	public void setIsVisibilidadCeldaCopiarResumenUsuario(Boolean isVisibilidadCeldaCopiarResumenUsuario) {
		this.isVisibilidadCeldaCopiarResumenUsuario = isVisibilidadCeldaCopiarResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResumenUsuario() {
		return isVisibilidadCeldaVerFormResumenUsuario;
	}

	public void setIsVisibilidadCeldaVerFormResumenUsuario(Boolean isVisibilidadCeldaVerFormResumenUsuario) {
		this.isVisibilidadCeldaVerFormResumenUsuario = isVisibilidadCeldaVerFormResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResumenUsuario() {
		return isVisibilidadCeldaOrdenResumenUsuario;
	}

	public void setIsVisibilidadCeldaOrdenResumenUsuario(Boolean isVisibilidadCeldaOrdenResumenUsuario) {
		this.isVisibilidadCeldaOrdenResumenUsuario = isVisibilidadCeldaOrdenResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResumenUsuario() {
		return isVisibilidadCeldaNuevoRelacionesResumenUsuario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResumenUsuario(Boolean isVisibilidadCeldaNuevoRelacionesResumenUsuario) {
		this.isVisibilidadCeldaNuevoRelacionesResumenUsuario = isVisibilidadCeldaNuevoRelacionesResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResumenUsuario() {
		return isVisibilidadCeldaModificarResumenUsuario;
	}

	public void setIsVisibilidadCeldaModificarResumenUsuario(Boolean isVisibilidadCeldaModificarResumenUsuario) {
		this.isVisibilidadCeldaModificarResumenUsuario = isVisibilidadCeldaModificarResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResumenUsuario() {
		return isVisibilidadCeldaActualizarResumenUsuario;
	}

	public void setIsVisibilidadCeldaActualizarResumenUsuario(Boolean isVisibilidadCeldaActualizarResumenUsuario) {
		this.isVisibilidadCeldaActualizarResumenUsuario = isVisibilidadCeldaActualizarResumenUsuario;
	}

	public Boolean getIsVisibilidadCeldaEliminarResumenUsuario() {
		return isVisibilidadCeldaEliminarResumenUsuario;
	}

	public void setIsVisibilidadCeldaEliminarResumenUsuario(Boolean isVisibilidadCeldaEliminarResumenUsuario) {
		this.isVisibilidadCeldaEliminarResumenUsuario = isVisibilidadCeldaEliminarResumenUsuario;
	}

	public Boolean getIsVisibilidadCeldaCancelarResumenUsuario() {
		return isVisibilidadCeldaCancelarResumenUsuario;
	}

	public void setIsVisibilidadCeldaCancelarResumenUsuario(Boolean isVisibilidadCeldaCancelarResumenUsuario) {
		this.isVisibilidadCeldaCancelarResumenUsuario = isVisibilidadCeldaCancelarResumenUsuario;
	}

	public Boolean getIsVisibilidadCeldaGuardarResumenUsuario() {
		return isVisibilidadCeldaGuardarResumenUsuario;
	}

	public void setIsVisibilidadCeldaGuardarResumenUsuario(Boolean isVisibilidadCeldaGuardarResumenUsuario) {
		this.isVisibilidadCeldaGuardarResumenUsuario = isVisibilidadCeldaGuardarResumenUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResumenUsuario() {
		return isVisibilidadCeldaGuardarCambiosResumenUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResumenUsuario(Boolean isVisibilidadCeldaGuardarCambiosResumenUsuario) {
		this.isVisibilidadCeldaGuardarCambiosResumenUsuario = isVisibilidadCeldaGuardarCambiosResumenUsuario;
	}
		
	public ResumenUsuarioSessionBean getresumenusuarioSessionBean() {
		return this.resumenusuarioSessionBean;
	}
	
	public void setresumenusuarioSessionBean(ResumenUsuarioSessionBean resumenusuarioSessionBean) {
		this.resumenusuarioSessionBean=resumenusuarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(ResumenUsuario resumenusuario)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioForeignKey(resumenusuario,null);
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
	
	public void bugActualizarReferenciaActual(ResumenUsuario resumenusuario,ResumenUsuario resumenusuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResumenUsuario(resumenusuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		resumenusuarioAux.setId(resumenusuario.getId());
		resumenusuarioAux.setVersionRow(resumenusuario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessResumenUsuario();
		
			int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = resumenusuarioValidator.getInvalidValues(this.resumenusuario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			resumenusuarioLogic.setDatosCliente(datosCliente);
			resumenusuarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				resumenusuarioAux=new  ResumenUsuario();
				
				resumenusuarioAux.setIsNew(true);
				resumenusuarioAux.setIsChanged(true);
				
				resumenusuarioAux.setResumenUsuarioOriginal(this.resumenusuario);
				
				resumenusuarioAux.setId(this.resumenusuario.getId());	
				resumenusuarioAux.setVersionRow(this.resumenusuario.getVersionRow());	
				resumenusuarioAux.setid_usuario(this.resumenusuario.getid_usuario());	
				resumenusuarioAux.setnumero_ingresos(this.resumenusuario.getnumero_ingresos());	
				resumenusuarioAux.setnumero_error_ingreso(this.resumenusuario.getnumero_error_ingreso());	
				resumenusuarioAux.setnumero_intentos(this.resumenusuario.getnumero_intentos());	
				resumenusuarioAux.setnumero_cierres(this.resumenusuario.getnumero_cierres());	
				resumenusuarioAux.setnumero_reinicios(this.resumenusuario.getnumero_reinicios());	
				resumenusuarioAux.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual());	
				resumenusuarioAux.setfecha_ultimo_ingreso(this.resumenusuario.getfecha_ultimo_ingreso());	
				resumenusuarioAux.setfecha_ultimo_error_ingreso(this.resumenusuario.getfecha_ultimo_error_ingreso());	
				resumenusuarioAux.setfecha_ultimo_intento(this.resumenusuario.getfecha_ultimo_intento());	
				resumenusuarioAux.setfecha_ultimo_cierre(this.resumenusuario.getfecha_ultimo_cierre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(resumenusuarioAux,resumenusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioLogic.saveResumenUsuarios();//WithConnection
						//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);
					
					this.refrescarForeignKeysDescripcionesResumenUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								resumenusuarioLogic.saveResumenUsuarioRelaciones(resumenusuarioAux);//WithConnection
								//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(resumenusuarioAux,resumenusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				resumenusuarioAux=new  ResumenUsuario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado() 
					|| (this.resumenusuarioSessionBean.getEsGuardarRelacionado() && this.resumenusuario.getId()>=0)) {
						
					resumenusuarioAux.setIsNew(false);
				}
				
				resumenusuarioAux.setIsDeleted(false);
			
				resumenusuarioAux.setId(this.resumenusuario.getId());	
				resumenusuarioAux.setVersionRow(this.resumenusuario.getVersionRow());	
				resumenusuarioAux.setid_usuario(this.resumenusuario.getid_usuario());	
				resumenusuarioAux.setnumero_ingresos(this.resumenusuario.getnumero_ingresos());	
				resumenusuarioAux.setnumero_error_ingreso(this.resumenusuario.getnumero_error_ingreso());	
				resumenusuarioAux.setnumero_intentos(this.resumenusuario.getnumero_intentos());	
				resumenusuarioAux.setnumero_cierres(this.resumenusuario.getnumero_cierres());	
				resumenusuarioAux.setnumero_reinicios(this.resumenusuario.getnumero_reinicios());	
				resumenusuarioAux.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual());	
				resumenusuarioAux.setfecha_ultimo_ingreso(this.resumenusuario.getfecha_ultimo_ingreso());	
				resumenusuarioAux.setfecha_ultimo_error_ingreso(this.resumenusuario.getfecha_ultimo_error_ingreso());	
				resumenusuarioAux.setfecha_ultimo_intento(this.resumenusuario.getfecha_ultimo_intento());	
				resumenusuarioAux.setfecha_ultimo_cierre(this.resumenusuario.getfecha_ultimo_cierre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(resumenusuarioAux,resumenusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioLogic.saveResumenUsuarios();//WithConnection
						//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);
					
					this.refrescarForeignKeysDescripcionesResumenUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								resumenusuarioLogic.saveResumenUsuarioRelaciones(resumenusuarioAux);//WithConnection
								//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(resumenusuarioAux,resumenusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.resumenusuario,resumenusuarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				resumenusuarioAux=new  ResumenUsuario();
				
				resumenusuarioAux.setIsNew(false);
				resumenusuarioAux.setIsChanged(false);
				
				resumenusuarioAux.setIsDeleted(true);
				
				resumenusuarioAux.setId(this.resumenusuario.getId());	
				resumenusuarioAux.setVersionRow(this.resumenusuario.getVersionRow());	
				resumenusuarioAux.setid_usuario(this.resumenusuario.getid_usuario());	
				resumenusuarioAux.setnumero_ingresos(this.resumenusuario.getnumero_ingresos());	
				resumenusuarioAux.setnumero_error_ingreso(this.resumenusuario.getnumero_error_ingreso());	
				resumenusuarioAux.setnumero_intentos(this.resumenusuario.getnumero_intentos());	
				resumenusuarioAux.setnumero_cierres(this.resumenusuario.getnumero_cierres());	
				resumenusuarioAux.setnumero_reinicios(this.resumenusuario.getnumero_reinicios());	
				resumenusuarioAux.setnumero_ingreso_actual(this.resumenusuario.getnumero_ingreso_actual());	
				resumenusuarioAux.setfecha_ultimo_ingreso(this.resumenusuario.getfecha_ultimo_ingreso());	
				resumenusuarioAux.setfecha_ultimo_error_ingreso(this.resumenusuario.getfecha_ultimo_error_ingreso());	
				resumenusuarioAux.setfecha_ultimo_intento(this.resumenusuario.getfecha_ultimo_intento());	
				resumenusuarioAux.setfecha_ultimo_cierre(this.resumenusuario.getfecha_ultimo_cierre());	
				
				if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.resumenusuarioAux.getId()>=0) {	
						this.resumenusuariosEliminados.add(resumenusuarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(resumenusuarioAux,resumenusuarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioLogic.saveResumenUsuarios();//WithConnection
						//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								resumenusuarioLogic.saveResumenUsuarioRelaciones(resumenusuarioAux);//WithConnection
								//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
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
							if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(resumenusuarioAux,resumenusuarioLogic.getResumenUsuarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(resumenusuarioAux,resumenusuarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getResumenUsuarios().addAll(this.resumenusuariosEliminados);
					
					resumenusuarioLogic.saveResumenUsuarios();//WithConnection
					//resumenusuarioLogic.getSetVersionRowResumenUsuarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesResumenUsuario();
				
				this.resumenusuariosEliminados= new ArrayList<ResumenUsuario>();		
			}
			
			if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Resumen Usuario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.resumenusuario=resumenusuarioAux;
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
      		//this.finishProcessResumenUsuario();
      	}
		
	}	
	
	public void actualizarRelaciones(ResumenUsuario resumenusuarioLocal) throws Exception {
		
		if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ResumenUsuario resumenusuarioLocal) throws Exception {	
		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				resumenusuarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResumenUsuarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = resumenusuarioValidator.getInvalidValues(this.resumenusuario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception {
		try	{		
			ResumenUsuarioConstantesFunciones.actualizarLista(resumenusuario,resumenusuarios,this.resumenusuarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ResumenUsuario resumenusuario,List<ResumenUsuario> resumenusuarios) throws Exception {
		try	{			
			ResumenUsuarioConstantesFunciones.actualizarSelectedLista(resumenusuario,resumenusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ResumenUsuario> resumenusuariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				resumenusuariosLocal=this.resumenusuarioLogic.getResumenUsuarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				resumenusuariosLocal=this.resumenusuarios;
			}
			//ARCHITECTURE
		
			for(ResumenUsuario resumenusuarioLocal:resumenusuariosLocal) {
				if(this.permiteMantenimiento(resumenusuarioLocal) && resumenusuarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResumenUsuarioConstantesFunciones.getResumenUsuarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelid_usuarioResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROINGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingresosResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROERRORINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_error_ingresoResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROINTENTOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_intentosResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROCIERRES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_cierresResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROREINICIOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_reiniciosResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.NUMEROINGRESOACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingreso_actualResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.FECHAULTIMOINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_ingresoResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.FECHAULTIMOERRORINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_error_ingresoResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.FECHAULTIMOINTENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_intentoResumenUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResumenUsuarioConstantesFunciones.FECHAULTIMOCIERRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_cierreResumenUsuario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelid_usuarioResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingresosResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_error_ingresoResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_intentosResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_cierresResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_reiniciosResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingreso_actualResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_ingresoResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_error_ingresoResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_intentoResumenUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_cierreResumenUsuario,"");
		
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
		this.iIdNuevoResumenUsuario--;	
		
		
		this.resumenusuarioAux=new ResumenUsuario();
		
		this.resumenusuarioAux.setId(this.iIdNuevoResumenUsuario);
		this.resumenusuarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.resumenusuarioLogic.getResumenUsuarios().add(this.resumenusuarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.resumenusuarios.add(this.resumenusuarioAux);
		}
		//ARCHITECTURE
		
		this.resumenusuario=this.resumenusuarioAux;
		
		if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResumenUsuario(this.resumenusuario);
			this.setVariablesObjetoActualToFormularioForeignKeyResumenUsuario(this.resumenusuario);
		}
				
		//this.setDefaultControlesResumenUsuario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResumenUsuario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResumenUsuario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResumenUsuario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResumenUsuario(this.resumenusuarioBean,this.resumenusuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ResumenUsuarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
			classes=ResumenUsuarioConstantesFunciones.getClassesRelationshipsOfResumenUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.resumenusuarioReturnGeneral=resumenusuarioLogic.procesarEventosResumenUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuario,this.resumenusuarioParameterGeneral,this.isEsNuevoResumenUsuario,classes);//this.resumenusuarioLogic.getResumenUsuario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResumenUsuario(this.resumenusuarioReturnGeneral,this.resumenusuarioBean,false);
		
		if(this.resumenusuarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario());
		}
		
		if(this.resumenusuarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario(),classes);//this.resumenusuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResumenUsuario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResumenUsuario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.RecargarFormResumenUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResumenUsuario(false);
						
			if(resumenusuarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenUsuario();
			}
			
			this.actualizarVisualTableDatosResumenUsuario();
			
			this.jTableDatosResumenUsuario.setRowSelectionInterval(this.getIndiceNuevoResumenUsuario(), this.getIndiceNuevoResumenUsuario());
			
			this.seleccionarFilaTablaResumenUsuarioActual();
						
			this.actualizarEstadoCeldasBotonesResumenUsuario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResumenUsuario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_ingresosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_intentosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_cierresResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_reiniciosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarnumero_ingreso_actualResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarfecha_ultimo_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarfecha_ultimo_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarfecha_ultimo_intentoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarfecha_ultimo_cierreResumenUsuario);	
		//
		this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setEnabled(isHabilitar && this.resumenusuarioConstantesFunciones.activarid_usuarioResumenUsuario);
	};
	
	public void setDefaultControlesResumenUsuario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResumenUsuario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.resumenusuarioSessionBean.setConGuardarRelaciones(true);			
			this.resumenusuarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.setVisible(true);
			
					
		} else {
			//this.resumenusuarioSessionBean.setConGuardarRelaciones(false);			
			this.resumenusuarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoResumenUsuario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuarioAux.getId().equals(this.iIdNuevoResumenUsuario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
				if(resumenusuarioAux.getId().equals(this.iIdNuevoResumenUsuario)) {
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
	
	public int getIndiceActualResumenUsuario(ResumenUsuario resumenusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuarioAux.getId().equals(resumenusuario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
				if(resumenusuarioAux.getId().equals(resumenusuario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResumenUsuario(ResumenUsuario resumenusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuarioAux.getResumenUsuarioOriginal().getId().equals(resumenusuarioOriginal.getId())) {
					existe=true;
					resumenusuarioOriginal.setId(resumenusuarioAux.getId());
					resumenusuarioOriginal.setVersionRow(resumenusuarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
				if(resumenusuarioAux.getResumenUsuarioOriginal().getId().equals(resumenusuarioOriginal.getId())) {
					existe=true;
					resumenusuarioOriginal.setId(resumenusuarioAux.getId());
					resumenusuarioOriginal.setVersionRow(resumenusuarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResumenUsuario(Boolean esParaCancelar) throws Exception {
		resumenusuariosAux=new ArrayList<ResumenUsuario>();
		resumenusuarioAux=new ResumenUsuario();
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
					if(resumenusuarioAux.getId()<0) {
						resumenusuariosAux.add(resumenusuarioAux);
					}		
				}
				this.iIdNuevoResumenUsuario=0L;
				this.resumenusuarioLogic.getResumenUsuarios().removeAll(resumenusuariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
					if(resumenusuarioAux.getId()<0) {
						resumenusuariosAux.add(resumenusuarioAux);
					}		
				}
				this.iIdNuevoResumenUsuario=0L;
				this.resumenusuarios.removeAll(resumenusuariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResumenUsuario 
					&& this.resumenusuarioLogic.getResumenUsuarios().size()>0
					) {
					resumenusuarioAux=this.resumenusuarioLogic.getResumenUsuarios().get(this.resumenusuarioLogic.getResumenUsuarios().size() - 1);
				
					if(resumenusuarioAux.getId()<0) {
						this.resumenusuarioLogic.getResumenUsuarios().remove(resumenusuarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResumenUsuario && this.resumenusuarios.size()>0) {
					resumenusuarioAux=this.resumenusuarios.get(this.resumenusuarios.size() - 1);
				
					if(resumenusuarioAux.getId()<0) {
						this.resumenusuarios.remove(resumenusuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResumenUsuario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(resumenusuario.getId()<0) {
				this.resumenusuarioLogic.getResumenUsuarios().remove(this.resumenusuario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(resumenusuario.getId()<0) {
				this.resumenusuarios.remove(this.resumenusuario);
			}
		}			
	}
	
	public void setEstadosInicialesResumenUsuario(List<ResumenUsuario> resumenusuariosAux) throws Exception {
		ResumenUsuarioConstantesFunciones.setEstadosInicialesResumenUsuario(resumenusuariosAux);
	}
	
	public void setEstadosInicialesResumenUsuario(ResumenUsuario resumenusuarioAux) throws Exception {
		ResumenUsuarioConstantesFunciones.setEstadosInicialesResumenUsuario(resumenusuarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResumenUsuarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResumenUsuarioActual()) {
				if(!this.isEsNuevoResumenUsuario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResumenUsuario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResumenUsuarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Resumen Usuario ?", "MANTENIMIENTO DE Resumen Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ResumenUsuario resumenusuario) throws Exception {
		ResumenUsuarioConstantesFunciones.seleccionarAsignar(this.resumenusuario,resumenusuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResumenUsuario=this.isPermisoActualizarOriginalResumenUsuario;
			
			
			this.seleccionarAsignar(resumenusuario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResumenUsuarioConstantesFunciones.quitarEspaciosResumenUsuario(this.resumenusuario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesResumenUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.resumenusuarioSessionBean.setsFuncionBusquedaRapida(this.resumenusuarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoResumenUsuario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResumenUsuario(esParaCancelar);				
				this.cancelarNuevoResumenUsuario(esParaCancelar);								
			}
			
			this.resumenusuario=new ResumenUsuario();
			
			this.inicializarResumenUsuario();
			
			this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResumenUsuario() throws Exception {
		try {
			ResumenUsuarioConstantesFunciones.inicializarResumenUsuario(this.resumenusuario);
			
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
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.resumenusuarioLogic.getResumenUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResumenUsuarios(String sAccionBusqueda,List<ResumenUsuario> resumenusuariosParaReportes) throws Exception {
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
					sPathReporteFinal="ResumenUsuario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResumenUsuarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResumenUsuarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ResumenUsuario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Resumen Usuarios");		
		parameters.put("busquedapor", ResumenUsuarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResumenUsuario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResumenUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResumenUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResumenUsuario=new JRBeanArrayDataSource(ResumenUsuarioJInternalFrame.TraerResumenUsuarioBeans(resumenusuariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResumenUsuario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResumenUsuarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResumenUsuarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResumenUsuarioBean.TraerResumenUsuarioBeans(resumenusuariosParaReportes).toArray()));
							
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
				this.generarExcelReporteResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResumenUsuarioActionPerformed(null);
					//this.generarExcelReporteResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResumenUsuarios(sAccionBusqueda,sTipoArchivoReporte,resumenusuariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResumenUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenUsuario> resumenusuariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenUsuarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResumenUsuario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ResumenUsuario resumenusuario : resumenusuariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResumenUsuarioConstantesFunciones.generarExcelReporteDataResumenUsuario("NORMAL",row,workbook,resumenusuario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResumenUsuario(String sTipo,Row row,Workbook workbook) {
		
		ResumenUsuarioConstantesFunciones.generarExcelReporteHeaderResumenUsuario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResumenUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenUsuario> resumenusuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ResumenUsuario resumenusuario : resumenusuariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResumenUsuarioConstantesFunciones.getResumenUsuarioDescripcion(resumenusuario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_ingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_error_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_intentos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_cierres());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_reinicios());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getnumero_ingreso_actual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getfecha_ultimo_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getfecha_ultimo_error_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getfecha_ultimo_intento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(resumenusuario.getfecha_ultimo_cierre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResumenUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ResumenUsuario> resumenusuariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ResumenUsuario> resumenusuariosRespaldo=null;
		
		classes=ResumenUsuarioConstantesFunciones.getClassesRelationshipsOfResumenUsuario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.resumenusuarioLogic.setDatosCliente(this.datosCliente);
		this.resumenusuarioLogic.setDatosDeep(this.datosDeep);
		this.resumenusuarioLogic.setIsConDeep(true);
		
		resumenusuariosRespaldo=this.resumenusuarioLogic.getResumenUsuarios();
		
		this.resumenusuarioLogic.setResumenUsuarios(resumenusuariosParaReportes);	
		this.resumenusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		resumenusuariosParaReportes=this.resumenusuarioLogic.getResumenUsuarios();
		this.resumenusuarioLogic.setResumenUsuarios(resumenusuariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResumenUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResumenUsuario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ResumenUsuario resumenusuario : resumenusuariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResumenUsuario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResumenUsuarioConstantesFunciones.generarExcelReporteDataResumenUsuario("NORMAL",row,workbook,resumenusuario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ResumenUsuarioConstantesFunciones.getResumenUsuarioDescripcion(resumenusuario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResumenUsuario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResumenUsuario() throws Exception {		
		this.startProcessResumenUsuario(true);
	}
	
	public void startProcessResumenUsuario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResumenUsuario ,this.jPanelParametrosReportesResumenUsuario, this.jScrollPanelDatosResumenUsuario,this.jPanelPaginacionResumenUsuario, this.jScrollPanelDatosEdicionResumenUsuario, this.jPanelAccionesResumenUsuario,this.jPanelAccionesFormularioResumenUsuario,this.jmenuBarResumenUsuario,this.jmenuBarDetalleResumenUsuario,this.jTtoolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasResumenUsuario=this.jTabbedPaneBusquedasResumenUsuario; 
		
		final JPanel jPanelParametrosReportesResumenUsuario=this.jPanelParametrosReportesResumenUsuario;
		//final JScrollPane jScrollPanelDatosResumenUsuario=this.jScrollPanelDatosResumenUsuario;
		final JTable jTableDatosResumenUsuario=this.jTableDatosResumenUsuario;		
		final JPanel jPanelPaginacionResumenUsuario=this.jPanelPaginacionResumenUsuario;
		//final JScrollPane jScrollPanelDatosEdicionResumenUsuario=this.jScrollPanelDatosEdicionResumenUsuario;
		final JPanel jPanelAccionesResumenUsuario=this.jPanelAccionesResumenUsuario;
		
		JPanel jPanelCamposAuxiliarResumenUsuario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResumenUsuario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			jPanelCamposAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jPanelCamposResumenUsuario;
			jPanelAccionesFormularioAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jPanelAccionesFormularioResumenUsuario;
		}
		
		final JPanel jPanelCamposResumenUsuario=jPanelCamposAuxiliarResumenUsuario;
		final JPanel jPanelAccionesFormularioResumenUsuario=jPanelAccionesFormularioAuxiliarResumenUsuario;
		
		
		final JMenuBar jmenuBarResumenUsuario=this.jmenuBarResumenUsuario;
		final JToolBar jTtoolBarResumenUsuario=this.jTtoolBarResumenUsuario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResumenUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResumenUsuario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			jmenuBarDetalleAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jmenuBarDetalleResumenUsuario;
			jTtoolBarDetalleAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jTtoolBarDetalleResumenUsuario;
		}
		
		final JMenuBar jmenuBarDetalleResumenUsuario=jmenuBarDetalleAuxiliarResumenUsuario;
		final JToolBar jTtoolBarDetalleResumenUsuario=jTtoolBarDetalleAuxiliarResumenUsuario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResumenUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResumenUsuario;
			processRunnable.jTableDatos=jTableDatosResumenUsuario;
			processRunnable.jPanelCampos=jPanelCamposResumenUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionResumenUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesResumenUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResumenUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarResumenUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResumenUsuario;
			processRunnable.jTtoolBar=jTtoolBarResumenUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResumenUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResumenUsuario ,jPanelParametrosReportesResumenUsuario,jTableDatosResumenUsuario, /*jScrollPanelDatosResumenUsuario,*/jPanelCamposResumenUsuario,jPanelPaginacionResumenUsuario, /*jScrollPanelDatosEdicionResumenUsuario,*/ jPanelAccionesResumenUsuario,jPanelAccionesFormularioResumenUsuario,jmenuBarResumenUsuario,jmenuBarDetalleResumenUsuario,jTtoolBarResumenUsuario,jTtoolBarDetalleResumenUsuario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResumenUsuario ,jPanelParametrosReportesResumenUsuario, jScrollPanelDatosResumenUsuario,jPanelPaginacionResumenUsuario, jScrollPanelDatosEdicionResumenUsuario, jPanelAccionesResumenUsuario,jPanelAccionesFormularioResumenUsuario,jmenuBarResumenUsuario,jmenuBarDetalleResumenUsuario,jTtoolBarResumenUsuario,jTtoolBarDetalleResumenUsuario);
						
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
	
	public void finishProcessResumenUsuario() {// throws Exception 
		this.finishProcessResumenUsuario(true);
	}
	
	public void finishProcessResumenUsuario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResumenUsuario ,this.jPanelParametrosReportesResumenUsuario, this.jScrollPanelDatosResumenUsuario,this.jPanelPaginacionResumenUsuario, this.jScrollPanelDatosEdicionResumenUsuario, this.jPanelAccionesResumenUsuario,this.jPanelAccionesFormularioResumenUsuario,this.jmenuBarResumenUsuario,this.jmenuBarDetalleResumenUsuario,this.jTtoolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasResumenUsuario=this.jTabbedPaneBusquedasResumenUsuario; 
		
		final JPanel jPanelParametrosReportesResumenUsuario=this.jPanelParametrosReportesResumenUsuario;
		//final JScrollPane jScrollPanelDatosResumenUsuario=this.jScrollPanelDatosResumenUsuario;
		final JTable jTableDatosResumenUsuario=this.jTableDatosResumenUsuario;		
		final JPanel jPanelPaginacionResumenUsuario=this.jPanelPaginacionResumenUsuario;
		//final JScrollPane jScrollPanelDatosEdicionResumenUsuario=this.jScrollPanelDatosEdicionResumenUsuario;
		final JPanel jPanelAccionesResumenUsuario=this.jPanelAccionesResumenUsuario;
		
		JPanel jPanelCamposAuxiliarResumenUsuario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResumenUsuario=new JPanel();
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			jPanelCamposAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jPanelCamposResumenUsuario;
			jPanelAccionesFormularioAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jPanelAccionesFormularioResumenUsuario;
		}
		
		final JPanel jPanelCamposResumenUsuario=jPanelCamposAuxiliarResumenUsuario;
		final JPanel jPanelAccionesFormularioResumenUsuario=jPanelAccionesFormularioAuxiliarResumenUsuario;
		
		
		final JMenuBar jmenuBarResumenUsuario=this.jmenuBarResumenUsuario;		
		final JToolBar jTtoolBarResumenUsuario=this.jTtoolBarResumenUsuario;
				
		JMenuBar jmenuBarDetalleAuxiliarResumenUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResumenUsuario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			jmenuBarDetalleAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jmenuBarDetalleResumenUsuario;
			jTtoolBarDetalleAuxiliarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jTtoolBarDetalleResumenUsuario;		
		}
		
		final JMenuBar jmenuBarDetalleResumenUsuario=jmenuBarDetalleAuxiliarResumenUsuario;
		final JToolBar jTtoolBarDetalleResumenUsuario=jTtoolBarDetalleAuxiliarResumenUsuario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResumenUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResumenUsuario;
			processRunnable.jTableDatos=jTableDatosResumenUsuario;
			processRunnable.jPanelCampos=jPanelCamposResumenUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionResumenUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesResumenUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResumenUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarResumenUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResumenUsuario;
			processRunnable.jTtoolBar=jTtoolBarResumenUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResumenUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResumenUsuario ,jPanelParametrosReportesResumenUsuario, jTableDatosResumenUsuario,/*jScrollPanelDatosResumenUsuario,*/jPanelCamposResumenUsuario,jPanelPaginacionResumenUsuario, /*jScrollPanelDatosEdicionResumenUsuario,*/ jPanelAccionesResumenUsuario,jPanelAccionesFormularioResumenUsuario,jmenuBarResumenUsuario,jmenuBarDetalleResumenUsuario,jTtoolBarResumenUsuario,jTtoolBarDetalleResumenUsuario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResumenUsuario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResumenUsuario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResumenUsuario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResumenUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResumenUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResumenUsuario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResumenUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResumenUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResumenUsuario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.resumenusuarioConstantesFunciones.getsFinalQueryResumenUsuario();
		String  finalQueryPaginacionTodos=this.resumenusuarioConstantesFunciones.getsFinalQueryResumenUsuario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResumenUsuarioConstantesFunciones.getArrayColumnasGlobalesNoResumenUsuario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResumenUsuarioConstantesFunciones.getArrayColumnasGlobalesResumenUsuario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResumenUsuarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.resumenusuariosEliminados= new ArrayList<ResumenUsuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResumenUsuario();
		
				///*ResumenUsuarioSessionBean*/this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
			
			if(this.resumenusuarioSessionBean==null) {
				this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
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
					this.iNumeroPaginacion=ResumenUsuarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResumenUsuarioConstantesFunciones.getClassesForeignKeysOfResumenUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/resumenusuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			resumenusuariosAux= new ArrayList<ResumenUsuario>();
			
				
			resumenusuarioLogic.setDatosCliente(this.datosCliente);
			resumenusuarioLogic.setDatosDeep(this.datosDeep);
			resumenusuarioLogic.setIsConDeep(true);
			
			
			resumenusuarioLogic.getResumenUsuarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					resumenusuarioLogic.getTodosResumenUsuarios(finalQueryGlobal,pagination);
					
					//resumenusuarioLogic.getTodosResumenUsuariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(resumenusuarioLogic.getResumenUsuarios()==null|| resumenusuarioLogic.getResumenUsuarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							resumenusuariosAux= new ArrayList<ResumenUsuario>();
							resumenusuariosAux.addAll(resumenusuarioLogic.getResumenUsuarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumenusuariosAux= new ArrayList<ResumenUsuario>();
							resumenusuariosAux.addAll(resumenusuarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							resumenusuarioLogic.getTodosResumenUsuarios(finalQueryGlobal+"",this.pagination);												
							
							//resumenusuarioLogic.getTodosResumenUsuariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteResumenUsuarios("Todos",resumenusuarioLogic.getResumenUsuarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());					
							resumenusuarioLogic.getResumenUsuarios().addAll(resumenusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumenusuarios=new ArrayList<ResumenUsuario>();
							resumenusuarios.addAll(resumenusuariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idResumenUsuario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idResumenUsuario=this.idActual;
				
				} else if(this.idResumenUsuarioActual!=null && this.idResumenUsuarioActual!=0L) {
					idResumenUsuario=idResumenUsuarioActual;
				}
				
					
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndicePorId(idResumenUsuario);
				
				this.resumenusuarios=new ArrayList<ResumenUsuario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					resumenusuarioLogic.getEntity(idResumenUsuario);
					
					//resumenusuarioLogic.getEntityWithConnection(idResumenUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());
					resumenusuarioLogic.getResumenUsuarios().add(resumenusuarioLogic.getResumenUsuario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumenusuarios=new ArrayList<ResumenUsuario>();
					this.resumenusuarios.add(resumenusuario);
				}
				
				if(resumenusuarioLogic.getResumenUsuario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					resumenusuarioLogic.getResumenUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=resumenusuarioLogic.getResumenUsuarios()==null||resumenusuarioLogic.getResumenUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=resumenusuarios==null|| resumenusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuariosAux=new ArrayList<ResumenUsuario>();
						resumenusuariosAux.addAll(resumenusuarioLogic.getResumenUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumenusuariosAux=new ArrayList<ResumenUsuario>();
							resumenusuariosAux.addAll(resumenusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							resumenusuarioLogic.getResumenUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResumenUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResumenUsuarios("FK_IdUsuario",resumenusuarioLogic.getResumenUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResumenUsuarios("FK_IdUsuario",resumenusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioLogic.setResumenUsuarios(new ArrayList<ResumenUsuario>());
						resumenusuarioLogic.getResumenUsuarios().addAll(resumenusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumenusuarios=new ArrayList<ResumenUsuario>();
							resumenusuarios.addAll(resumenusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResumenUsuario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResumenUsuario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=resumenusuarioLogic.getResumenUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumenusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=resumenusuarioLogic.getResumenUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumenusuarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ResumenUsuario resumenusuario) {
		Boolean permite=true;
		
		if(this.resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResumenUsuarioConstantesFunciones.getOrderByListaResumenUsuario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResumenUsuarioConstantesFunciones.getOrderByListaResumenUsuario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenUsuario resumenusuario:resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenUsuario resumenusuario:this.resumenusuarios) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
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
			this.resumenusuarioAux=new ResumenUsuario();
			this.resumenusuarioAux.setsType(Constantes2.S_TOTALES);
			this.resumenusuarioAux.setIsNew(false);
			this.resumenusuarioAux.setIsChanged(false);
			this.resumenusuarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ResumenUsuarioConstantesFunciones.TotalizarValoresFilaResumenUsuario(this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuarioAux);
				
				this.resumenusuarioLogic.getResumenUsuarios().add(this.resumenusuarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResumenUsuarioConstantesFunciones.TotalizarValoresFilaResumenUsuario(this.resumenusuarios,this.resumenusuarioAux);
				
				this.resumenusuarios.add(this.resumenusuarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		resumenusuarioTotales=new ResumenUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumenusuarioLogic.getResumenUsuarios().remove(resumenusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.resumenusuarios.remove(resumenusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		resumenusuarioTotales=new ResumenUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResumenUsuario resumenusuario:resumenusuarioLogic.getResumenUsuarios()) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenUsuarioConstantesFunciones.TotalizarValoresFilaResumenUsuario(this.resumenusuarioLogic.getResumenUsuarios(),resumenusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResumenUsuario resumenusuario:this.resumenusuarios) {
				if(resumenusuario.getsType().equals(Constantes2.S_TOTALES)) {
					resumenusuarioTotales=resumenusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResumenUsuarioConstantesFunciones.TotalizarValoresFilaResumenUsuario(this.resumenusuarios,resumenusuarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResumenUsuariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getResumenUsuariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					resumenusuarioLogic.getResumenUsuariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosResumenUsuario() {
		this.isPermisoTodoResumenUsuario=false;
		this.isPermisoNuevoResumenUsuario=false;
		this.isPermisoActualizarResumenUsuario=false;
		this.isPermisoActualizarOriginalResumenUsuario=false;
		this.isPermisoEliminarResumenUsuario=false;
		this.isPermisoGuardarCambiosResumenUsuario=false;
		this.isPermisoConsultaResumenUsuario=false;
		this.isPermisoBusquedaResumenUsuario=false;
		this.isPermisoReporteResumenUsuario=false;		
		this.isPermisoOrdenResumenUsuario=false;		
		this.isPermisoPaginacionMedioResumenUsuario=false;		
		this.isPermisoPaginacionAltoResumenUsuario=false;
		this.isPermisoPaginacionTodoResumenUsuario=false;
		this.isPermisoCopiarResumenUsuario=false;		
		this.isPermisoVerFormResumenUsuario=false;		
		this.isPermisoDuplicarResumenUsuario=false;		
		this.isPermisoOrdenResumenUsuario=false;		
	}
	
	public void setPermisosUsuarioResumenUsuario(Boolean isPermiso) {
		this.isPermisoTodoResumenUsuario=isPermiso;
		this.isPermisoNuevoResumenUsuario=isPermiso;
		this.isPermisoActualizarResumenUsuario=isPermiso;
		this.isPermisoActualizarOriginalResumenUsuario=isPermiso;
		this.isPermisoEliminarResumenUsuario=isPermiso;
		this.isPermisoGuardarCambiosResumenUsuario=isPermiso;
		this.isPermisoConsultaResumenUsuario=isPermiso;
		this.isPermisoBusquedaResumenUsuario=isPermiso;
		this.isPermisoReporteResumenUsuario=isPermiso;
		this.isPermisoOrdenResumenUsuario=isPermiso;		
		this.isPermisoPaginacionMedioResumenUsuario=isPermiso;		
		this.isPermisoPaginacionAltoResumenUsuario=isPermiso;		
		this.isPermisoPaginacionTodoResumenUsuario=isPermiso;		
		this.isPermisoCopiarResumenUsuario=isPermiso;		
		this.isPermisoVerFormResumenUsuario=isPermiso;		
		this.isPermisoDuplicarResumenUsuario=isPermiso;
		this.isPermisoOrdenResumenUsuario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResumenUsuario(Boolean isPermiso) {
		//this.isPermisoTodoResumenUsuario=isPermiso;
		this.isPermisoNuevoResumenUsuario=isPermiso;
		this.isPermisoActualizarResumenUsuario=isPermiso;
		this.isPermisoActualizarOriginalResumenUsuario=isPermiso;
		this.isPermisoEliminarResumenUsuario=isPermiso;
		this.isPermisoGuardarCambiosResumenUsuario=isPermiso;
		//this.isPermisoConsultaResumenUsuario=isPermiso;
		//this.isPermisoBusquedaResumenUsuario=isPermiso;
		//this.isPermisoReporteResumenUsuario=isPermiso;
		//this.isPermisoOrdenResumenUsuario=isPermiso;		
		//this.isPermisoPaginacionMedioResumenUsuario=isPermiso;		
		//this.isPermisoPaginacionAltoResumenUsuario=isPermiso;		
		//this.isPermisoPaginacionTodoResumenUsuario=isPermiso;		
		//this.isPermisoCopiarResumenUsuario=isPermiso;		
		//this.isPermisoDuplicarResumenUsuario=isPermiso;
		//this.isPermisoOrdenResumenUsuario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResumenUsuarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ResumenUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebResumenUsuario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResumenUsuarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioResumenUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResumenUsuarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResumenUsuarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioResumenUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResumenUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResumenUsuarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResumenUsuario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResumenUsuario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResumenUsuario=this.isPermisoActualizarResumenUsuario;
			this.isPermisoEliminarResumenUsuario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResumenUsuario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResumenUsuario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResumenUsuario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResumenUsuario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResumenUsuario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResumenUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResumenUsuario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResumenUsuario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResumenUsuario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResumenUsuario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResumenUsuario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResumenUsuario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResumenUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResumenUsuario.setToolTipText(this.jTableDatosResumenUsuario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResumenUsuario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResumenUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResumenUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResumenUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResumenUsuario() throws Exception {
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
	public void inicializarCombosForeignKeyResumenUsuarioListas()throws Exception {
		try	{						
			
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResumenUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResumenUsuarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyResumenUsuarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyResumenUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ResumenUsuarioParameterReturnGeneral resumenusuarioReturnGeneral=new ResumenUsuarioParameterReturnGeneral();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.resumenusuarioConstantesFunciones.cargarid_usuarioResumenUsuario)
					 || (this.esRecargarFks && this.resumenusuarioConstantesFunciones.cargarid_usuarioResumenUsuario)) {

					if(!this.resumenusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+resumenusuarioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				resumenusuarioReturnGeneral=resumenusuarioLogic.cargarCombosLoteForeignKeyResumenUsuario(finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=resumenusuarioReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyResumenUsuario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {
			if(this.resumenusuarioSessionBean==null) {
				this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
			}

			if(!this.resumenusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyResumenUsuario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResumenUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResumenUsuario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.resumenusuario.setfecha_ultimo_ingreso(this.parametroGeneralUsuario.getfecha_sistema());
				this.resumenusuario.setfecha_ultimo_error_ingreso(this.parametroGeneralUsuario.getfecha_sistema());
				this.resumenusuario.setfecha_ultimo_intento(this.parametroGeneralUsuario.getfecha_sistema());
				this.resumenusuario.setfecha_ultimo_cierre(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResumenUsuario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResumenUsuario(ResumenUsuario resumenusuario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResumenUsuario(ResumenUsuario resumenusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResumenUsuario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResumenUsuario()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResumenUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResumenUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResumenUsuario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResumenUsuario()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResumenUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResumenUsuario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ResumenUsuarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResumenUsuarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResumenUsuarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean(); 
		this.resumenusuarioConstantesFunciones=new ResumenUsuarioConstantesFunciones(); 
		this.resumenusuarioBean=new ResumenUsuario();//(this.resumenusuarioConstantesFunciones); 		
		this.resumenusuarioReturnGeneral=new ResumenUsuarioParameterReturnGeneral(); 
		
		this.resumenusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumenusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResumenUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResumenUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResumenUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResumenUsuario(true);
			
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
			
			this.resumenusuarioConstantesFunciones=new ResumenUsuarioConstantesFunciones(); 
			this.resumenusuarioBean=new ResumenUsuario();//this.resumenusuarioConstantesFunciones); 			
			this.resumenusuarioReturnGeneral=new ResumenUsuarioParameterReturnGeneral(); 
		
			ResumenUsuarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Resumen Usuario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.resumenusuario=new ResumenUsuario();
			this.resumenusuarios = new ArrayList<ResumenUsuario>();
			this.resumenusuariosAux = new ArrayList<ResumenUsuario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic=new ResumenUsuarioLogic();
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.resumenusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.resumenusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResumenUsuario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResumenUsuario);	
					}
					
					if(this.jInternalFrameImportacionResumenUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResumenUsuario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResumenUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResumenUsuario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResumenUsuario);
				this.jInternalFrameDetalleFormResumenUsuario.setVisible(false);
				this.jInternalFrameDetalleFormResumenUsuario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResumenUsuario);
					this.jInternalFrameReporteDinamicoResumenUsuario.setVisible(false);
					this.jInternalFrameReporteDinamicoResumenUsuario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResumenUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResumenUsuario);
					this.jInternalFrameImportacionResumenUsuario.setVisible(false);
					this.jInternalFrameImportacionResumenUsuario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResumenUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResumenUsuario);
					this.jInternalFrameOrderByResumenUsuario.setVisible(false);
					this.jInternalFrameOrderByResumenUsuario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResumenUsuarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResumenUsuarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.resumenusuarioReturnGeneral=new ResumenUsuarioParameterReturnGeneral();
			
			this.resumenusuarioParameterGeneral=new ResumenUsuarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.resumenusuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResumenUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResumenUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.resumenusuarioSessionBean.getEsGuardarRelacionado(),this.resumenusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResumenUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.resumenusuarioSessionBean.getEsGuardarRelacionado(),this.resumenusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaDuplicarResumenUsuario=true;
			this.isVisibilidadCeldaCopiarResumenUsuario=true;
			this.isVisibilidadCeldaVerFormResumenUsuario=true;
			this.isVisibilidadCeldaOrdenResumenUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=false;
			this.isVisibilidadCeldaGuardarResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			
			
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResumenUsuario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResumenUsuario(false);
			
			this.setPermisosUsuarioResumenUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado() 
				|| (this.resumenusuarioSessionBean.getEsGuardarRelacionado() && this.resumenusuarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResumenUsuarioClasesRelacionadas();
			}
			
			if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResumenUsuarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResumenUsuario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResumenUsuario();
			}
			
			if(!this.isPermisoBusquedaResumenUsuario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioResumenUsuario,this.isPermisoPaginacionMedioResumenUsuario,this.isPermisoPaginacionTodoResumenUsuario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResumenUsuarioConstantesFunciones.getTiposSeleccionarResumenUsuario());
				
				this.tiposColumnasSelect=ResumenUsuarioConstantesFunciones.getTiposSeleccionarResumenUsuario(true);
				
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
			//if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResumenUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioResumenUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioResumenUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenUsuario() ;
			
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
			
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				resumenusuarioImplementable= (ResumenUsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResumenUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				resumenusuarioImplementableHome= (ResumenUsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResumenUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.resumenusuarios= new ArrayList<ResumenUsuario>();
			this.resumenusuariosEliminados= new ArrayList<ResumenUsuario>();
						
			this.isEsNuevoResumenUsuario=false;
			this.esParaAccionDesdeFormularioResumenUsuario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResumenUsuario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResumenUsuario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResumenUsuarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResumenUsuarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResumenUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResumenUsuario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResumenUsuario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResumenUsuario();
			}
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResumenUsuario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResumenUsuario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResumenUsuario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResumenUsuario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ResumenUsuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResumenUsuario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesResumenUsuario")) {
				iIndex=this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResumenUsuario();	
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
	
	public void cargarCombosForeignKeyResumenUsuario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResumenUsuario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResumenUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResumenUsuarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResumenUsuario();
		
		this.cargarCombosFrameForeignKeyResumenUsuario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResumenUsuario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResumenUsuario();
		}
	}
	
	
	
	public void jButtonNuevoResumenUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			
			if(jTableDatosResumenUsuario.getRowCount()>=1) {
				jTableDatosResumenUsuario.removeRowSelectionInterval(0, jTableDatosResumenUsuario.getRowCount()-1);						
			}
			
			this.isEsNuevoResumenUsuario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResumenUsuario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResumenUsuario(true);			
			//this.resumenusuario=new ResumenUsuario();
			//this.resumenusuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenUsuario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenUsuario() ;
			
			if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenUsuario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.resumenusuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);				
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ResumenUsuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResumenUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResumenUsuario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResumenUsuario.getSelectedRows().length;			
			}
			
			resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResumenUsuario--;			
				//ResumenUsuario resumenusuarioAux= new ResumenUsuario();			
				//resumenusuarioAux.setId(this.iIdNuevoResumenUsuario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ResumenUsuario resumenusuarioOrigen=new ResumenUsuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ResumenUsuario resumenusuarioOrigen : resumenusuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							resumenusuarioOrigen =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							resumenusuarioOrigen =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResumenUsuario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.resumenusuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResumenUsuario(resumenusuarioOrigen,this.resumenusuario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.resumenusuarioLogic.getResumenUsuarios().add(this.resumenusuarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.resumenusuarios.add(this.resumenusuarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResumenUsuario(false);
				
				this.jTableDatosResumenUsuario.setRowSelectionInterval(this.getIndiceNuevoResumenUsuario(), this.getIndiceNuevoResumenUsuario());
				
				int iLastRow =  this.jTableDatosResumenUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResumenUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResumenUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenUsuario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();									
		
			ResumenUsuario resumenusuarioOrigen=new ResumenUsuario();
			ResumenUsuario resumenusuarioDestino=new ResumenUsuario();
				
			resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResumenUsuario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || resumenusuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResumenUsuario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioOrigen =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						resumenusuarioOrigen =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						resumenusuarioDestino =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						resumenusuarioDestino =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				resumenusuarioOrigen =resumenusuariosSeleccionados.get(0);
				resumenusuarioDestino =resumenusuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResumenUsuario(resumenusuarioOrigen,resumenusuarioDestino,true,false);
				
				resumenusuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(resumenusuarioDestino,resumenusuarioLogic.getResumenUsuarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(resumenusuarioDestino,resumenusuarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResumenUsuario(false);
				
				//this.jTableDatosResumenUsuario.setRowSelectionInterval(this.getIndiceNuevoResumenUsuario(), this.getIndiceNuevoResumenUsuario());
				
				int iLastRow =  this.jTableDatosResumenUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResumenUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResumenUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenUsuario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResumenUsuario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResumenUsuario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResumenUsuario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResumenUsuario.setVisible(!isVisible);
			this.jPanelPaginacionResumenUsuario.setVisible(!isVisible);
			this.jPanelAccionesResumenUsuario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResumenUsuario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResumenUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResumenUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResumenUsuario();
			
			this.abrirFrameOrderByResumenUsuario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResumenUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResumenUsuario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResumenUsuario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResumenUsuario.isMaximum()) {
					this.jInternalFrameDetalleFormResumenUsuario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResumenUsuario.setSize(this.jInternalFrameDetalleFormResumenUsuario.iWidthFormulario,this.jInternalFrameDetalleFormResumenUsuario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResumenUsuario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResumenUsuario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResumenUsuario.isMaximum()) {
						this.jInternalFrameDetalleFormResumenUsuario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResumenUsuario.jContentPaneDetalleResumenUsuario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResumenUsuario.jContentPaneDetalleResumenUsuario.getWidth(),ResumenUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResumenUsuario.jContentPaneDetalleResumenUsuario.getWidth(),ResumenUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResumenUsuario.jContentPaneDetalleResumenUsuario.getWidth(),ResumenUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResumenUsuario.setVisible(true);
	        this.jInternalFrameDetalleFormResumenUsuario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResumenUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResumenUsuario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResumenUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenUsuario,false,this);
				} else {
					this.jInternalFrameOrderByResumenUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenUsuario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResumenUsuario);
				this.jInternalFrameOrderByResumenUsuario.setVisible(false);
				this.jInternalFrameOrderByResumenUsuario.setSelected(false);
				
				this.jInternalFrameOrderByResumenUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResumenUsuario"));
				
				this.inicializarActualizarBindingTablaOrderByResumenUsuario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResumenUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResumenUsuario==null) {
				
				this.jInternalFrameImportacionResumenUsuario=new ImportacionJInternalFrame(ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResumenUsuario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResumenUsuario);
				this.jInternalFrameImportacionResumenUsuario.setVisible(false);
				this.jInternalFrameImportacionResumenUsuario.setSelected(false);


				this.jInternalFrameImportacionResumenUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResumenUsuario"));
				this.jInternalFrameImportacionResumenUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResumenUsuario"));
				this.jInternalFrameImportacionResumenUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResumenUsuario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResumenUsuario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResumenUsuario==null) {
				this.jInternalFrameReporteDinamicoResumenUsuario=new ReporteDinamicoJInternalFrame(ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResumenUsuario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResumenUsuario);
				this.jInternalFrameReporteDinamicoResumenUsuario.setVisible(false);
				this.jInternalFrameReporteDinamicoResumenUsuario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenUsuario"));
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenUsuario"));
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenUsuario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenUsuario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleResumenUsuario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResumenUsuario);
			
	       	this.jInternalFrameDetalleFormResumenUsuario.setVisible(false);
	        this.jInternalFrameDetalleFormResumenUsuario.setSelected(false);
			
			//this.jInternalFrameDetalleFormResumenUsuario.dispose();
			//this.jInternalFrameDetalleFormResumenUsuario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResumenUsuario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResumenUsuario.setVisible(true);
	        this.jInternalFrameReporteDinamicoResumenUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResumenUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResumenUsuario.setVisible(true);
	        this.jInternalFrameImportacionResumenUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResumenUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResumenUsuario.setVisible(true);
	        this.jInternalFrameOrderByResumenUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResumenUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResumenUsuario.setVisible(false);
	        this.jInternalFrameOrderByResumenUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResumenUsuario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResumenUsuario.setVisible(false);
	        this.jInternalFrameReporteDinamicoResumenUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResumenUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResumenUsuario.setVisible(false);
	        this.jInternalFrameImportacionResumenUsuario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResumenUsuario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResumenUsuario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResumenUsuario(true);
			//this.isEsNuevoResumenUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResumenUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenUsuario(false) ;
			
			if(resumenusuarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenUsuario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResumenUsuarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResumenUsuario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResumenUsuario(true);
			//this.isEsNuevoResumenUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.resumenusuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResumenUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResumenUsuario(false) ;
			
			if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResumenUsuario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResumenUsuario(false);
			
			//if(!this.isEsNuevoResumenUsuario) {								
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				
			}
			
			if(this.permiteMantenimiento(this.resumenusuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResumenUsuario=true;
					this.inicializarActualizarBindingTablaResumenUsuario(false);
					this.isEsNuevoResumenUsuario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResumenUsuario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResumenUsuario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResumenUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenUsuario(false);
				
				this.habilitarDeshabilitarControlesResumenUsuario(false);
			
												
				
				if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResumenUsuario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResumenUsuarioActionPerformed(evt,resumenusuarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResumenUsuario(this.resumenusuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResumenUsuario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,resumenusuarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.resumenusuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				this.resumenusuario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				this.resumenusuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.resumenusuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResumenUsuarioModel) this.jTableDatosResumenUsuario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResumenUsuario=true;
				this.inicializarActualizarBindingTablaResumenUsuario(false);
				this.isEsNuevoResumenUsuario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResumenUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenUsuario(false);
				
				this.habilitarDeshabilitarControlesResumenUsuario(false);
				
				
				
				if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResumenUsuario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResumenUsuario.getRowCount()>=1) {
				jTableDatosResumenUsuario.removeRowSelectionInterval(0, jTableDatosResumenUsuario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResumenUsuario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResumenUsuario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResumenUsuario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResumenUsuario(false) ;
			
			this.isEsNuevoResumenUsuario=false;
			
			if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResumenUsuario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResumenUsuario(false);
				
				//SI ES MANUAL
				if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResumenUsuario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResumenUsuario--;			
			//ResumenUsuario resumenusuarioAux= new ResumenUsuario();			
			//resumenusuarioAux.setId(this.iIdNuevoResumenUsuario);
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResumenUsuario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
			
			this.resumenusuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.resumenusuarioLogic.getResumenUsuarios().add(this.resumenusuarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.resumenusuarios.add(this.resumenusuarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResumenUsuario(false);
			
			this.jTableDatosResumenUsuario.setRowSelectionInterval(this.getIndiceNuevoResumenUsuario(), this.getIndiceNuevoResumenUsuario());
			
			int iLastRow =  this.jTableDatosResumenUsuario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResumenUsuario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResumenUsuario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResumenUsuario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenUsuario(false);
			
			//SI ES MANUAL
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenUsuario();
			}
			
			//this.abrirFrameTreeResumenUsuario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Resumen UsuarioS ?", "MANTENIMIENTO DE Resumen Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionResumenUsuario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralResumenUsuario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.resumenusuarioReturnGeneral=resumenusuarioLogic.procesarImportacionResumenUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.resumenusuarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarResumenUsuarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResumenUsuario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResumenUsuario.setFileImportacion(this.jInternalFrameImportacionResumenUsuario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResumenUsuario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResumenUsuario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResumenUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResumenUsuario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		

		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResumenUsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResumenUsuarioBaseDesign.jrxml";
			
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
			
			this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIngresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIngresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIngresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIngresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroErrorIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroErrorIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroErrorIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroErrorIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIntentos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIntentos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIntentos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIntentos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCierres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCierres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCierres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCierres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroReinicios_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroReinicios_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroReinicios_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroReinicios_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIngresoActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIngresoActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIngresoActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIngresoActual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimoIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimoIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimoIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimoIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimoErrorIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimoErrorIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimoErrorIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimoErrorIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimoIntento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimoIntento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimoIntento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimoIntento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimoCierre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimoCierre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimoCierre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimoCierre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoResumenUsuario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS:
					sNombreCampoCategoria="numero_ingresos";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO:
					sNombreCampoCategoria="numero_error_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS:
					sNombreCampoCategoria="numero_intentos";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES:
					sNombreCampoCategoria="numero_cierres";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS:
					sNombreCampoCategoria="numero_reinicios";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL:
					sNombreCampoCategoria="numero_ingreso_actual";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO:
					sNombreCampoCategoria="fecha_ultimo_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO:
					sNombreCampoCategoria="fecha_ultimo_error_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO:
					sNombreCampoCategoria="fecha_ultimo_intento";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE:
					sNombreCampoCategoria="fecha_ultimo_cierre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS:
					sNombreCampoCategoriaValor="numero_ingresos";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO:
					sNombreCampoCategoriaValor="numero_error_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS:
					sNombreCampoCategoriaValor="numero_intentos";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES:
					sNombreCampoCategoriaValor="numero_cierres";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS:
					sNombreCampoCategoriaValor="numero_reinicios";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL:
					sNombreCampoCategoriaValor="numero_ingreso_actual";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO:
					sNombreCampoCategoriaValor="fecha_ultimo_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO:
					sNombreCampoCategoriaValor="fecha_ultimo_error_ingreso";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO:
					sNombreCampoCategoriaValor="fecha_ultimo_intento";
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE:
					sNombreCampoCategoriaValor="fecha_ultimo_cierre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_ingresos");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Error Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_error_ingreso");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Intentos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_intentos");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cierres",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cierres");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Reinicios",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_reinicios");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Ingreso Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_ingreso_actual");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultimo Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultimo_ingreso");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultimo Error Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultimo_error_ingreso");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultimo Intento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultimo_intento");
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultimo Cierre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultimo_cierre");
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
	
	public void jButtonGenerarExcelReporteDinamicoResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ResumenUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_ingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_error_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_intentos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_cierres());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_reinicios());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getnumero_ingreso_actual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getfecha_ultimo_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getfecha_ultimo_error_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getfecha_ultimo_intento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE);
					iRow++;

					for(ResumenUsuario resumenusuario:resumenusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(resumenusuario.getfecha_ultimo_cierre());
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
			//	this.getFilaCabeceraExportarExcelResumenUsuario(row);				
			//	iRow++;
			//}				
			
			//for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResumenUsuario(resumenusuarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
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
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenUsuario(false);
			
			//SI ES MANUAL
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResumenUsuario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenUsuario(false);
			
			//SI ES MANUAL
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResumenUsuario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResumenUsuario(false);
			
			//SI ES MANUAL
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResumenUsuario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResumenUsuario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResumenUsuario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResumenUsuario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResumenUsuario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResumenUsuario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResumenUsuario.setMinimumSize(dimensionMinimum);
		this.jTableDatosResumenUsuario.setMaximumSize(dimensionMaximum);
		this.jTableDatosResumenUsuario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResumenUsuario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResumenUsuario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResumenUsuario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResumenUsuario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResumenUsuario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResumenUsuario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenUsuario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResumenUsuario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResumenUsuario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResumenUsuario();
		
		this.inicializarActualizarBindingBotonesManualResumenUsuario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResumenUsuario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResumenUsuario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResumenUsuario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResumenUsuario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResumenUsuario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResumenUsuario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResumenUsuario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionNuevoResumenUsuario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionSinCerrarResumenUsuario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionSinMensajeResumenUsuario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResumenUsuario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResumenUsuario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResumenUsuario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
				this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionNuevoResumenUsuario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionSinCerrarResumenUsuario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResumenUsuario.jCheckBoxPostAccionSinMensajeResumenUsuario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResumenUsuario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResumenUsuario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResumenUsuario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResumenUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResumenUsuario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResumenUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResumenUsuario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResumenUsuario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResumenUsuario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResumenUsuario(Boolean esInicializar) throws Exception {
		try	{	
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResumenUsuario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResumenUsuario() throws Exception {
		try	{
			if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResumenUsuario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResumenUsuario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResumenUsuario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResumenUsuario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResumenUsuario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResumenUsuario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResumenUsuario.addItem(reporte);
			}
			
			
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResumenUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResumenUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResumenUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResumenUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResumenUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResumenUsuario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResumenUsuario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenUsuario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResumenUsuario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
				this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
				this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResumenUsuario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
				
				if(this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResumenUsuario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResumenUsuario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResumenUsuario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResumenUsuario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResumenUsuario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResumenUsuario(Boolean esInicializar) throws Exception {				
		if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResumenUsuario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResumenUsuario() throws Exception {
		this.inicializarActualizarBindingTablaResumenUsuario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResumenUsuario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResumenUsuarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResumenUsuario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=resumenusuarioLogic.getResumenUsuarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=resumenusuarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResumenUsuario.setModel(new ResumenUsuarioModel(this.resumenusuarioLogic.getResumenUsuarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResumenUsuario.setModel(new ResumenUsuarioModel(this.resumenusuarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResumenUsuario!=null && this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResumenUsuario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,resumenusuarioConstantesFunciones.resaltarSeleccionarResumenUsuario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,resumenusuarioConstantesFunciones.resaltarSeleccionarResumenUsuario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_ID));

		if(this.resumenusuarioConstantesFunciones.mostraridResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltaridResumenUsuario,this.resumenusuarioConstantesFunciones.activaridResumenUsuario,this,true,"idResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltaridResumenUsuario,this.resumenusuarioConstantesFunciones.activaridResumenUsuario,this,true,"idResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO));

		if(this.resumenusuarioConstantesFunciones.mostrarid_usuarioResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.resumenusuarioConstantesFunciones.resaltarid_usuarioResumenUsuario,this,this.resumenusuarioConstantesFunciones.activarid_usuarioResumenUsuario));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.resumenusuarioConstantesFunciones.resaltarid_usuarioResumenUsuario,this,this.resumenusuarioConstantesFunciones.activarid_usuarioResumenUsuario,false,"id_usuarioResumenUsuario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_ingresosResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_ingresosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_ingresosResumenUsuario,this,true,"numero_ingresosResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_ingresosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_ingresosResumenUsuario,this,true,"numero_ingresosResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_error_ingresoResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_error_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_error_ingresoResumenUsuario,this,true,"numero_error_ingresoResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_error_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_error_ingresoResumenUsuario,this,true,"numero_error_ingresoResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_intentosResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_intentosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_intentosResumenUsuario,this,true,"numero_intentosResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_intentosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_intentosResumenUsuario,this,true,"numero_intentosResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_cierresResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_cierresResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_cierresResumenUsuario,this,true,"numero_cierresResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_cierresResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_cierresResumenUsuario,this,true,"numero_cierresResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_reiniciosResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_reiniciosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_reiniciosResumenUsuario,this,true,"numero_reiniciosResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_reiniciosResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_reiniciosResumenUsuario,this,true,"numero_reiniciosResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL));

		if(this.resumenusuarioConstantesFunciones.mostrarnumero_ingreso_actualResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_ingreso_actualResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_ingreso_actualResumenUsuario,this,true,"numero_ingreso_actualResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarnumero_ingreso_actualResumenUsuario,this.resumenusuarioConstantesFunciones.activarnumero_ingreso_actualResumenUsuario,this,true,"numero_ingreso_actualResumenUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO));

		if(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_ingresoResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_ingresoResumenUsuario,this,true,"fecha_ultimo_ingresoResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_ingresoResumenUsuario,this,true,"fecha_ultimo_ingresoResumenUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO));

		if(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_error_ingresoResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_error_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_error_ingresoResumenUsuario,this,true,"fecha_ultimo_error_ingresoResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_error_ingresoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_error_ingresoResumenUsuario,this,true,"fecha_ultimo_error_ingresoResumenUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO));

		if(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_intentoResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_intentoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_intentoResumenUsuario,this,true,"fecha_ultimo_intentoResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_intentoResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_intentoResumenUsuario,this,true,"fecha_ultimo_intentoResumenUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE));

		if(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_cierreResumenUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_cierreResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_cierreResumenUsuario,this,true,"fecha_ultimo_cierreResumenUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_cierreResumenUsuario,this.resumenusuarioConstantesFunciones.activarfecha_ultimo_cierreResumenUsuario,this,true,"fecha_ultimo_cierreResumenUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResumenUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResumenUsuario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResumenUsuario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.resumenusuarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResumenUsuario.addColumn(tableColumn);
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
			
			this.jTableDatosResumenUsuario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResumenUsuario.moveColumn(this.jTableDatosResumenUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResumenUsuario.moveColumn(this.jTableDatosResumenUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResumenUsuario.moveColumn(this.jTableDatosResumenUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResumenUsuario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResumenUsuario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResumenUsuario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResumenUsuario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResumenUsuario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResumenUsuario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResumenUsuario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResumenUsuario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=resumenusuarioLogic.getResumenUsuarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=resumenusuarios.size()-1;
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
		//this.jTableDatosResumenUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResumenUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResumenUsuario();
			
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
				
				//this.isEsNuevoResumenUsuario=false;
					
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
				if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResumenUsuario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResumenUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResumenUsuario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.resumenusuario.getsType().equals("DUPLICADO")
				   || this.resumenusuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResumenUsuario=true;
				
				} else {
					this.isEsNuevoResumenUsuario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					if(this.resumenusuario.getId()>=0 && !this.resumenusuario.getIsNew()) {						
						this.isEsNuevoResumenUsuario=false;
						
					} else {
						this.isEsNuevoResumenUsuario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResumenUsuario(esRelaciones);						
				
				this.seleccionarResumenUsuario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.resumenusuario.getId()<0) {
					this.isEsNuevoResumenUsuario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResumenUsuario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResumenUsuario(evt,rowIndex);
				}	
				
				if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ResumenUsuario: " + this.dDif); 
					}
				}								
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResumenUsuario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.resumenusuario)) {
					if(this.resumenusuario.getId()>0) {
						this.resumenusuario.setIsDeleted(true);
						
						this.resumenusuariosEliminados.add(this.resumenusuario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.resumenusuarioLogic.getResumenUsuarios().remove(this.resumenusuario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.resumenusuarios.remove(this.resumenusuario);				
					}
					
					
					((ResumenUsuarioModel) this.jTableDatosResumenUsuario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResumenUsuario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResumenUsuario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResumenUsuario) {
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResumenUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResumenUsuario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResumenUsuario(this.resumenusuario);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.resumenusuarioConstantesFunciones.cargarid_usuarioResumenUsuario || this.resumenusuarioConstantesFunciones.event_dependid_usuarioResumenUsuario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.resumenusuario.getid_usuario());
									//this.inicializarActualizarBindingResumenUsuario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(resumenusuario.getUsuario()!=null) {
							this.usuariosForeignKey.add(resumenusuario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.resumenusuario.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResumenUsuario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResumenUsuario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResumenUsuario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResumenUsuario(ResumenUsuario resumenusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResumenUsuario(resumenusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResumenUsuario(ResumenUsuario resumenusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResumenUsuario(resumenusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResumenUsuario(resumenusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResumenUsuario(resumenusuario);
	}
	
	public void setVariablesObjetoActualToFormularioResumenUsuario(ResumenUsuario resumenusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setText(resumenusuario.getId().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setText(resumenusuario.getnumero_ingresos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setText(resumenusuario.getnumero_error_ingreso().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setText(resumenusuario.getnumero_intentos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setText(resumenusuario.getnumero_cierres().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setText(resumenusuario.getnumero_reinicios().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setText(resumenusuario.getnumero_ingreso_actual().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_error_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_intento());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setDate(resumenusuario.getfecha_ultimo_cierre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ResumenUsuario resumenusuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,resumenusuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ResumenUsuario resumenusuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				resumenusuarioLocal=this.resumenusuario;
			} else {
				resumenusuarioLocal=this.resumenusuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(resumenusuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResumenUsuario(resumenusuarioLocal,true);
					
					if(resumenusuarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(resumenusuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(resumenusuarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResumenUsuario(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResumenUsuario(resumenusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(resumenusuario);
	}
	
	public void setVariablesFormularioToObjetoActualResumenUsuario(ResumenUsuario resumenusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResumenUsuario(resumenusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResumenUsuario(ResumenUsuario resumenusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.getText()==null || this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.getText()=="" || this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.getText()=="Id") {
				this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setText("0");
			}

			if(conColumnasBase) {resumenusuario.setId(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelIdResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_ingresos(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingresosResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_error_ingreso(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_error_ingresoResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_intentos(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_intentosResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_cierres(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_cierresResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_reinicios(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_reiniciosResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setnumero_ingreso_actual(Long.parseLong(this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelnumero_ingreso_actualResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_ingreso(this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_ingresoResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_error_ingreso(this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_error_ingresoResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_intento(this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_intentoResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			resumenusuario.setfecha_ultimo_cierre(this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResumenUsuario.jLabelfecha_ultimo_cierreResumenUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResumenUsuario(ResumenUsuario resumenusuarioBean,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResumenUsuario(ResumenUsuario resumenusuarioOrigen,ResumenUsuario resumenusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && resumenusuarioOrigen.getId()!=null && !resumenusuarioOrigen.getId().equals(0L))) {resumenusuario.setId(resumenusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_ingresos()!=null && !resumenusuarioOrigen.getnumero_ingresos().equals(0L))) {resumenusuario.setnumero_ingresos(resumenusuarioOrigen.getnumero_ingresos());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_error_ingreso()!=null && !resumenusuarioOrigen.getnumero_error_ingreso().equals(0L))) {resumenusuario.setnumero_error_ingreso(resumenusuarioOrigen.getnumero_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_intentos()!=null && !resumenusuarioOrigen.getnumero_intentos().equals(0L))) {resumenusuario.setnumero_intentos(resumenusuarioOrigen.getnumero_intentos());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_cierres()!=null && !resumenusuarioOrigen.getnumero_cierres().equals(0L))) {resumenusuario.setnumero_cierres(resumenusuarioOrigen.getnumero_cierres());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_reinicios()!=null && !resumenusuarioOrigen.getnumero_reinicios().equals(0L))) {resumenusuario.setnumero_reinicios(resumenusuarioOrigen.getnumero_reinicios());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getnumero_ingreso_actual()!=null && !resumenusuarioOrigen.getnumero_ingreso_actual().equals(0L))) {resumenusuario.setnumero_ingreso_actual(resumenusuarioOrigen.getnumero_ingreso_actual());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_ingreso()!=null && !resumenusuarioOrigen.getfecha_ultimo_ingreso().equals(new Date()))) {resumenusuario.setfecha_ultimo_ingreso(resumenusuarioOrigen.getfecha_ultimo_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_error_ingreso()!=null && !resumenusuarioOrigen.getfecha_ultimo_error_ingreso().equals(new Date()))) {resumenusuario.setfecha_ultimo_error_ingreso(resumenusuarioOrigen.getfecha_ultimo_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_intento()!=null && !resumenusuarioOrigen.getfecha_ultimo_intento().equals(new Date()))) {resumenusuario.setfecha_ultimo_intento(resumenusuarioOrigen.getfecha_ultimo_intento());}
			if(conDefault || (!conDefault && resumenusuarioOrigen.getfecha_ultimo_cierre()!=null && !resumenusuarioOrigen.getfecha_ultimo_cierre().equals(new Date()))) {resumenusuario.setfecha_ultimo_cierre(resumenusuarioOrigen.getfecha_ultimo_cierre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResumenUsuario(ResumenUsuario resumenusuario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setText(resumenusuario.getId().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setText(resumenusuario.getnumero_ingresos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setText(resumenusuario.getnumero_error_ingreso().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setText(resumenusuario.getnumero_intentos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setText(resumenusuario.getnumero_cierres().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setText(resumenusuario.getnumero_reinicios().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setText(resumenusuario.getnumero_ingreso_actual().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_error_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setDate(resumenusuario.getfecha_ultimo_intento());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setDate(resumenusuario.getfecha_ultimo_cierre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResumenUsuario(ResumenUsuarioBean resumenusuarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setText(resumenusuarioBean.getId().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setText(resumenusuarioBean.getnumero_ingresos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setText(resumenusuarioBean.getnumero_error_ingreso().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setText(resumenusuarioBean.getnumero_intentos().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setText(resumenusuarioBean.getnumero_cierres().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setText(resumenusuarioBean.getnumero_reinicios().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setText(resumenusuarioBean.getnumero_ingreso_actual().toString());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setDate(resumenusuarioBean.getfecha_ultimo_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setDate(resumenusuarioBean.getfecha_ultimo_error_ingreso());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setDate(resumenusuarioBean.getfecha_ultimo_intento());
			this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setDate(resumenusuarioBean.getfecha_ultimo_cierre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResumenUsuario(ResumenUsuarioParameterReturnGeneral resumenusuarioReturnGeneral,ResumenUsuarioBean resumenusuarioBean,Boolean conDefault) throws Exception { 
		try {
			ResumenUsuario resumenusuarioLocal=new ResumenUsuario();
			
			resumenusuarioLocal=resumenusuarioReturnGeneral.getResumenUsuario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && resumenusuarioLocal.getId()!=null && !resumenusuarioLocal.getId().equals(0L))) {resumenusuarioBean.setId(resumenusuarioLocal.getId());}}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_ingresos()!=null && !resumenusuarioLocal.getnumero_ingresos().equals(0L))) {resumenusuarioBean.setnumero_ingresos(resumenusuarioLocal.getnumero_ingresos());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_error_ingreso()!=null && !resumenusuarioLocal.getnumero_error_ingreso().equals(0L))) {resumenusuarioBean.setnumero_error_ingreso(resumenusuarioLocal.getnumero_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_intentos()!=null && !resumenusuarioLocal.getnumero_intentos().equals(0L))) {resumenusuarioBean.setnumero_intentos(resumenusuarioLocal.getnumero_intentos());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_cierres()!=null && !resumenusuarioLocal.getnumero_cierres().equals(0L))) {resumenusuarioBean.setnumero_cierres(resumenusuarioLocal.getnumero_cierres());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_reinicios()!=null && !resumenusuarioLocal.getnumero_reinicios().equals(0L))) {resumenusuarioBean.setnumero_reinicios(resumenusuarioLocal.getnumero_reinicios());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getnumero_ingreso_actual()!=null && !resumenusuarioLocal.getnumero_ingreso_actual().equals(0L))) {resumenusuarioBean.setnumero_ingreso_actual(resumenusuarioLocal.getnumero_ingreso_actual());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getfecha_ultimo_ingreso()!=null && !resumenusuarioLocal.getfecha_ultimo_ingreso().equals(new Date()))) {resumenusuarioBean.setfecha_ultimo_ingreso(resumenusuarioLocal.getfecha_ultimo_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getfecha_ultimo_error_ingreso()!=null && !resumenusuarioLocal.getfecha_ultimo_error_ingreso().equals(new Date()))) {resumenusuarioBean.setfecha_ultimo_error_ingreso(resumenusuarioLocal.getfecha_ultimo_error_ingreso());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getfecha_ultimo_intento()!=null && !resumenusuarioLocal.getfecha_ultimo_intento().equals(new Date()))) {resumenusuarioBean.setfecha_ultimo_intento(resumenusuarioLocal.getfecha_ultimo_intento());}
			if(conDefault || (!conDefault && resumenusuarioLocal.getfecha_ultimo_cierre()!=null && !resumenusuarioLocal.getfecha_ultimo_cierre().equals(new Date()))) {resumenusuarioBean.setfecha_ultimo_cierre(resumenusuarioLocal.getfecha_ultimo_cierre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResumenUsuarioGenerico(Long idResumenUsuarioSeleccionado,JComboBox jComboBoxResumenUsuario,List<ResumenUsuario> resumenusuariosLocal)throws Exception {
		try {
			ResumenUsuario  resumenusuarioTemp=null;

			for(ResumenUsuario resumenusuarioAux:resumenusuariosLocal) {
				if(resumenusuarioAux.getId()!=null && resumenusuarioAux.getId().equals(idResumenUsuarioSeleccionado)) {
					resumenusuarioTemp=resumenusuarioAux;
					break;
				}
			}

			jComboBoxResumenUsuario.setSelectedItem(resumenusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResumenUsuarioGenerico(JComboBox jComboBoxResumenUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResumenUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResumenUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResumenUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumenusuario=(ResumenUsuario) resumenusuarioLogic.getResumenUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			resumenusuario =(ResumenUsuario) resumenusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!resumenusuario.getIsNew() && !resumenusuario.getIsChanged() && !resumenusuario.getIsDeleted()) {
				sDescripcion=resumenusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=resumenusuario.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ResumenUsuario resumenusuarioRow=new ResumenUsuario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumenusuarioRow=(ResumenUsuario) resumenusuarioLogic.getResumenUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			resumenusuarioRow=(ResumenUsuario) resumenusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResumenUsuario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario));			
			this.jButtonDuplicarResumenUsuario.setVisible((this.isVisibilidadCeldaDuplicarResumenUsuario && this.isPermisoDuplicarResumenUsuario));			
			this.jButtonCopiarResumenUsuario.setVisible((this.isVisibilidadCeldaCopiarResumenUsuario && this.isPermisoCopiarResumenUsuario));
			this.jButtonVerFormResumenUsuario.setVisible((this.isVisibilidadCeldaVerFormResumenUsuario && this.isPermisoVerFormResumenUsuario));
			
			this.jButtonAbrirOrderByResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));			
			
			this.jButtonNuevoRelacionesResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenUsuario && this.isPermisoNuevoResumenUsuario));			
			this.jButtonNuevoGuardarCambiosResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarResumenUsuario.setVisible((this.isVisibilidadCeldaModificarResumenUsuario && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.setVisible((this.isVisibilidadCeldaActualizarResumenUsuario && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.setVisible((this.isVisibilidadCeldaEliminarResumenUsuario && this.isPermisoEliminarResumenUsuario));
			this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.setVisible(this.isVisibilidadCeldaCancelarResumenUsuario);							
			this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));			
			
			}
						
			this.jButtonGuardarCambiosTablaResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario));						
			this.jButtonDuplicarToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaDuplicarResumenUsuario && this.isPermisoDuplicarResumenUsuario));						
			this.jButtonCopiarToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaCopiarResumenUsuario && this.isPermisoCopiarResumenUsuario));			
			this.jButtonVerFormToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaVerFormResumenUsuario && this.isPermisoVerFormResumenUsuario));			
			this.jButtonAbrirOrderByToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));
			this.jButtonNuevoRelacionesToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenUsuario && this.isPermisoNuevoResumenUsuario));			
			this.jButtonNuevoGuardarCambiosToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));			
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaModificarResumenUsuario && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaActualizarResumenUsuario  && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaEliminarResumenUsuario && this.isPermisoEliminarResumenUsuario));
			this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarToolBarResumenUsuario.setVisible(this.isVisibilidadCeldaCancelarResumenUsuario);				
			this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario));			
			this.jMenuItemDuplicarResumenUsuario.setVisible((this.isVisibilidadCeldaDuplicarResumenUsuario && this.isPermisoDuplicarResumenUsuario));			
			this.jMenuItemCopiarResumenUsuario.setVisible((this.isVisibilidadCeldaCopiarResumenUsuario && this.isPermisoCopiarResumenUsuario));			
			this.jMenuItemVerFormResumenUsuario.setVisible((this.isVisibilidadCeldaVerFormResumenUsuario && this.isPermisoVerFormResumenUsuario));			
			this.jMenuItemAbrirOrderByResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));			
			//this.jMenuItemMostrarOcultarResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));
			this.jMenuItemDetalleAbrirOrderByResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));			
			//this.jMenuItemDetalleMostrarOcultarResumenUsuario.setVisible((this.isVisibilidadCeldaOrdenResumenUsuario && this.isPermisoOrdenResumenUsuario));			
			this.jMenuItemNuevoRelacionesResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesResumenUsuario && this.isPermisoNuevoResumenUsuario));			
			this.jMenuItemNuevoGuardarCambiosResumenUsuario.setVisible((this.isVisibilidadCeldaNuevoResumenUsuario && this.isPermisoNuevoResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));									
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemModificarResumenUsuario.setVisible((this.isVisibilidadCeldaModificarResumenUsuario && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemActualizarResumenUsuario.setVisible((this.isVisibilidadCeldaActualizarResumenUsuario && this.isPermisoActualizarResumenUsuario));	
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemEliminarResumenUsuario.setVisible((this.isVisibilidadCeldaEliminarResumenUsuario && this.isPermisoEliminarResumenUsuario));
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemCancelarResumenUsuario.setVisible(this.isVisibilidadCeldaCancelarResumenUsuario);				
			}
			
			this.jMenuItemGuardarCambiosResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));						
			this.jMenuItemGuardarCambiosTablaResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResumenUsuario=this.jButtonNuevoResumenUsuario.isVisible();
			this.isVisibilidadCeldaDuplicarResumenUsuario=this.jButtonDuplicarResumenUsuario.isVisible();
			this.isVisibilidadCeldaCopiarResumenUsuario=this.jButtonCopiarResumenUsuario.isVisible();
			this.isVisibilidadCeldaVerFormResumenUsuario=this.jButtonVerFormResumenUsuario.isVisible();
			
			this.isVisibilidadCeldaOrdenResumenUsuario=this.jButtonAbrirOrderByResumenUsuario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=this.jButtonNuevoRelacionesResumenUsuario.isVisible();
			this.isVisibilidadCeldaModificarResumenUsuario=this.jButtonModificarResumenUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.isVisibilidadCeldaActualizarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.isVisible();
			this.isVisibilidadCeldaEliminarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.isVisible();
			this.isVisibilidadCeldaCancelarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.isVisible();
			this.isVisibilidadCeldaGuardarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=this.jButtonGuardarCambiosTablaResumenUsuario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResumenUsuario=this.jButtonNuevoToolBarResumenUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=this.jButtonNuevoRelacionesToolBarResumenUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.isVisibilidadCeldaModificarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarToolBarResumenUsuario.isVisible();
			this.isVisibilidadCeldaActualizarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarToolBarResumenUsuario.isVisible();
			this.isVisibilidadCeldaEliminarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarToolBarResumenUsuario.isVisible();
			this.isVisibilidadCeldaCancelarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarToolBarResumenUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResumenUsuario=this.jButtonGuardarCambiosToolBarResumenUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=this.jButtonGuardarCambiosTablaToolBarResumenUsuario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResumenUsuario=this.jMenuItemNuevoResumenUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=this.jMenuItemNuevoRelacionesResumenUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.isVisibilidadCeldaModificarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jMenuItemModificarResumenUsuario.isVisible();
			this.isVisibilidadCeldaActualizarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jMenuItemActualizarResumenUsuario.isVisible();
			this.isVisibilidadCeldaEliminarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jMenuItemEliminarResumenUsuario.isVisible();
			this.isVisibilidadCeldaCancelarResumenUsuario=this.jInternalFrameDetalleFormResumenUsuario.jMenuItemCancelarResumenUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResumenUsuario=this.jMenuItemGuardarCambiosResumenUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=this.jMenuItemGuardarCambiosTablaResumenUsuario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResumenUsuario(Boolean esInicializar) {
		if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
				//if(this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResumenUsuario();
			}
			
			this.inicializarActualizarBindingBotonesManualResumenUsuario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResumenUsuario() {
		this.jButtonNuevoResumenUsuario.setVisible(this.isPermisoNuevoResumenUsuario);			
		this.jButtonDuplicarResumenUsuario.setVisible(this.isPermisoDuplicarResumenUsuario);			
		this.jButtonCopiarResumenUsuario.setVisible(this.isPermisoCopiarResumenUsuario);			
		this.jButtonVerFormResumenUsuario.setVisible(this.isPermisoVerFormResumenUsuario);			
		
		this.jButtonAbrirOrderByResumenUsuario.setVisible(this.isPermisoOrdenResumenUsuario);					
		
		this.jButtonNuevoRelacionesResumenUsuario.setVisible(this.isPermisoNuevoResumenUsuario);			
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarResumenUsuario.setVisible(this.isPermisoActualizarResumenUsuario);	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.setVisible(this.isPermisoActualizarResumenUsuario);	
			this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.setVisible(this.isPermisoEliminarResumenUsuario);
			this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.setVisible(this.isVisibilidadCeldaCancelarResumenUsuario);						
			this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.setVisible(this.isPermisoGuardarCambiosResumenUsuario);							
		}
		
		this.jButtonGuardarCambiosTablaResumenUsuario.setVisible(this.isPermisoActualizarResumenUsuario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResumenUsuario() {
		this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarResumenUsuario.setVisible(this.isPermisoActualizarResumenUsuario);	
		this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.setVisible(this.isPermisoActualizarResumenUsuario);	
		this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.setVisible(this.isPermisoEliminarResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.setVisible(this.isVisibilidadCeldaCancelarResumenUsuario);							
		this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.setVisible((this.isVisibilidadCeldaGuardarResumenUsuario && this.isPermisoGuardarCambiosResumenUsuario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResumenUsuario() {
		if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResumenUsuario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResumenUsuario() {
	}
	
	public void jTableDatosResumenUsuarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResumenUsuario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.resumenusuario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioResumenUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebResumenUsuario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResumenUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResumenUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.resumenusuarioLogic.getConnexion());

				if(this.resumenusuario.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.resumenusuario.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResumenUsuario=(TitledBorder)this.jScrollPanelDatosResumenUsuario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderResumenUsuario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.resumenusuario.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_ingresosResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_ingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_ingresos = "+this.resumenusuario.getnumero_ingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_error_ingresoResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_error_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_error_ingreso = "+this.resumenusuario.getnumero_error_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_intentosResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_intentos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_intentos = "+this.resumenusuario.getnumero_intentos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cierresResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_cierres()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cierres = "+this.resumenusuario.getnumero_cierres().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_reiniciosResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_reinicios()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_reinicios = "+this.resumenusuario.getnumero_reinicios().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_ingreso_actualResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getnumero_ingreso_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_ingreso_actual = "+this.resumenusuario.getnumero_ingreso_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimo_ingresoResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getfecha_ultimo_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultimo_ingreso = '"+Funciones2.getStringPostgresDate(this.resumenusuario.getfecha_ultimo_ingreso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimo_error_ingresoResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getfecha_ultimo_error_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultimo_error_ingreso = '"+Funciones2.getStringPostgresDate(this.resumenusuario.getfecha_ultimo_error_ingreso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimo_intentoResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getfecha_ultimo_intento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultimo_intento = '"+Funciones2.getStringPostgresDate(this.resumenusuario.getfecha_ultimo_intento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimo_cierreResumenUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.getresumenusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.resumenusuario==null) {
						this.resumenusuario = new ResumenUsuario();
					}

					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);
				}

				if(this.resumenusuario.getfecha_ultimo_cierre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultimo_cierre = '"+Funciones2.getStringPostgresDate(this.resumenusuario.getfecha_ultimo_cierre())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResumenUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdUsuarioResumenUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResumenUsuario(false,false);

			this.getResumenUsuariosFK_IdUsuario();

			this.inicializarActualizarBindingResumenUsuario(false);

			//if(ResumenUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResumenUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.resumenusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResumenUsuario() {
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
			this.jInternalFrameDetalleFormResumenUsuario.setVisible(false);	    			
			this.jInternalFrameDetalleFormResumenUsuario.dispose();
			this.jInternalFrameDetalleFormResumenUsuario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
			this.jInternalFrameReporteDinamicoResumenUsuario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResumenUsuario.dispose();
			this.jInternalFrameReporteDinamicoResumenUsuario=null;
		}
		
		if(this.jInternalFrameImportacionResumenUsuario!=null) {
			this.jInternalFrameImportacionResumenUsuario.setVisible(false);	    			
			this.jInternalFrameImportacionResumenUsuario.dispose();
			this.jInternalFrameImportacionResumenUsuario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResumenUsuario();
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResumenUsuario")) {
				jButtonDuplicarResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResumenUsuario")) {
				jButtonCopiarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormResumenUsuario")) {
				jButtonVerFormResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResumenUsuario")) {
				jButtonDuplicarResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResumenUsuario")) {
				jButtonDuplicarResumenUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResumenUsuario")) {
				jButtonModificarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResumenUsuario")) {
				jButtonModificarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResumenUsuario")) {
				jButtonModificarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResumenUsuario")) {
				jButtonActualizarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResumenUsuario")) {
				jButtonActualizarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResumenUsuario")) {
				jButtonActualizarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarResumenUsuario")) {
				jButtonEliminarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResumenUsuario")) {
				jButtonEliminarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResumenUsuario")) {
				jButtonEliminarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarResumenUsuario")) {
				jButtonCancelarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResumenUsuario")) {
				jButtonCancelarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResumenUsuario")) {
				jButtonCancelarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarResumenUsuario")) {
				jButtonCerrarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResumenUsuario")) {
				jButtonCerrarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResumenUsuario")) {
				jButtonCerrarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResumenUsuario")) {
				jButtonMostrarOcultarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResumenUsuario")) {
				jButtonCancelarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResumenUsuario")) {
				jButtonCopiarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResumenUsuario")) {
				jButtonVerFormResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResumenUsuario")) {
				jButtonCopiarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResumenUsuario")) {
				jButtonVerFormResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResumenUsuario")) {
				jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResumenUsuario")) {
				jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResumenUsuario")) {
				jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResumenUsuario")) {
				jButtonAnterioresResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResumenUsuario")) {
				jButtonAnterioresResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResumenUsuario")) {
				jButtonAnterioresResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResumenUsuario")) {
				jButtonSiguientesResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResumenUsuario")) {
				jButtonSiguientesResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResumenUsuario")) {
				jButtonSiguientesResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResumenUsuario") || sTipo.equals("MenuItemDetalleAbrirOrderByResumenUsuario")) {
				jButtonAbrirOrderByResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResumenUsuario") || sTipo.equals("MenuItemDetalleMostrarOcultarResumenUsuario")) {
				jButtonMostrarOcultarResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResumenUsuario")) {
				jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResumenUsuario")) {
				jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResumenUsuario")) {
				jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResumenUsuario")) {
				jButtonCerrarReporteDinamicoResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResumenUsuario")) {
				jButtonGenerarReporteDinamicoResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResumenUsuario")) {
				
				jButtonGenerarExcelReporteDinamicoResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResumenUsuario")) {
				jButtonCerrarImportacionResumenUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResumenUsuario")) {
				
				jButtonGenerarImportacionResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResumenUsuario")) {
				
				jButtonAbrirImportacionResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResumenUsuario")) {
				jComboBoxTiposAccionesResumenUsuarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResumenUsuario")) {
				jComboBoxTiposRelacionesResumenUsuarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResumenUsuario")) {
				jComboBoxTiposAccionesResumenUsuarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResumenUsuario")) {
				
				jComboBoxTiposSeleccionarResumenUsuarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResumenUsuario")) {
				jTextFieldValorCampoGeneralResumenUsuarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResumenUsuario")) {
				jButtonAbrirOrderByResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResumenUsuario")) {
				jButtonAbrirOrderByResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResumenUsuario")) {
				jButtonCerrarOrderByResumenUsuarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResumenUsuarioBusqueda")) {
				this.jButtonidResumenUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResumenUsuarioUpdate")) {
				this.jButtonid_usuarioResumenUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResumenUsuarioBusqueda")) {
				this.jButtonid_usuarioResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingresosResumenUsuarioBusqueda")) {
				this.jButtonnumero_ingresosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_error_ingresoResumenUsuarioBusqueda")) {
				this.jButtonnumero_error_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentosResumenUsuarioBusqueda")) {
				this.jButtonnumero_intentosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cierresResumenUsuarioBusqueda")) {
				this.jButtonnumero_cierresResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_reiniciosResumenUsuarioBusqueda")) {
				this.jButtonnumero_reiniciosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingreso_actualResumenUsuarioBusqueda")) {
				this.jButtonnumero_ingreso_actualResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_ingresoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_error_ingresoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_intentoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_intentoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_cierreResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_cierreResumenUsuarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResumenUsuario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ResumenUsuario resumenusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				resumenusuarioLocal=this.resumenusuario;
			} else {
				resumenusuarioLocal=this.resumenusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
							
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
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
			
			


			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
								
						
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
								
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
							
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
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
			
			


			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
								
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResumenUsuario")) {
					jCheckBoxSeleccionarTodosResumenUsuarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResumenUsuario")) {
					jCheckBoxSeleccionadosResumenUsuarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResumenUsuario")) {
					
				}
				
				


				
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
												
				
				


				
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
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
			
			


			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResumenUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.resumenusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.resumenusuario);
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
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
				
				


				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResumenUsuario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResumenUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResumenUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.resumenusuarioAnterior =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResumenUsuario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResumenUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResumenUsuario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.resumenusuario =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.resumenusuario =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.resumenusuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResumenUsuario")) {
				
				}
				
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResumenUsuario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResumenUsuario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResumenUsuario")) {
			
			}
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResumenUsuario();
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			if(sTipo.equals("NuevoResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResumenUsuario")) {
				jButtonDuplicarResumenUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResumenUsuario")) {
				jButtonCopiarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResumenUsuario")) {
				jButtonVerFormResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResumenUsuario")) {
				jButtonNuevoResumenUsuarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResumenUsuario")) {
				jButtonModificarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResumenUsuario")) {
				jButtonActualizarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResumenUsuario")) {
				jButtonEliminarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResumenUsuario")) {
				jButtonCancelarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResumenUsuario")) {
				jButtonCerrarResumenUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResumenUsuario")) {
				jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResumenUsuario")) {
				jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResumenUsuario")) {
				jButtonAbrirOrderByResumenUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResumenUsuario")) {
				jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResumenUsuario")) {
				jButtonAnterioresResumenUsuarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResumenUsuario")) {
				jButtonSiguientesResumenUsuarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResumenUsuarioBusqueda")) {
				this.jButtonidResumenUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioResumenUsuarioUpdate")) {
				this.jButtonid_usuarioResumenUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioResumenUsuarioBusqueda")) {
				this.jButtonid_usuarioResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingresosResumenUsuarioBusqueda")) {
				this.jButtonnumero_ingresosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_error_ingresoResumenUsuarioBusqueda")) {
				this.jButtonnumero_error_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentosResumenUsuarioBusqueda")) {
				this.jButtonnumero_intentosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cierresResumenUsuarioBusqueda")) {
				this.jButtonnumero_cierresResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_reiniciosResumenUsuarioBusqueda")) {
				this.jButtonnumero_reiniciosResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingreso_actualResumenUsuarioBusqueda")) {
				this.jButtonnumero_ingreso_actualResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_ingresoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_error_ingresoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_intentoResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_intentoResumenUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_cierreResumenUsuarioBusqueda")) {
				this.jButtonfecha_ultimo_cierreResumenUsuarioBusquedaActionPerformed(evt);
			}
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResumenUsuario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResumenUsuario")) {
				closingInternalFrameResumenUsuario();
				
			} else if(sTipo.equals("jButtonCancelarResumenUsuario")) {
				JInternalFrameBase jInternalFrameDetalleFormResumenUsuario = (JInternalFrameBase)evt.getSource();
	            	
	            ResumenUsuarioBeanSwingJInternalFrame jInternalFrameParent=(ResumenUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormResumenUsuario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResumenUsuarioActionPerformed(null);
			}
			
			ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.resumenusuario,new Object(),this.resumenusuarioParameterGeneral,this.resumenusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResumenUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResumenUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResumenUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.resumenusuario)) {
			if(!esControlTabla) {
				if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);			
				}
				
				if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResumenUsuario(this.resumenusuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.resumenusuarioReturnGeneral=resumenusuarioLogic.procesarEventosResumenUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuario,this.resumenusuarioParameterGeneral,this.isEsNuevoResumenUsuario,classes);//this.resumenusuarioLogic.getResumenUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResumenUsuario(this.resumenusuarioReturnGeneral,this.resumenusuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResumenUsuario(classes,this.resumenusuarioReturnGeneral,this.resumenusuarioBean,false);
					}
						
					if(this.resumenusuarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario());	
					}
						
					if(this.resumenusuarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario(),classes);//this.resumenusuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResumenUsuario(this.resumenusuario,classes);//this.resumenusuarioBean);									
				}
			
				if(ResumenUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResumenUsuario(this.resumenusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResumenUsuario(this.resumenusuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.resumenusuarioAnterior!=null) {
						this.resumenusuario=this.resumenusuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.resumenusuarioReturnGeneral=resumenusuarioLogic.procesarEventosResumenUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuario,this.resumenusuarioParameterGeneral,this.isEsNuevoResumenUsuario,classes);//this.resumenusuarioLogic.getResumenUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.resumenusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.resumenusuarioReturnGeneral.getResumenUsuario(),resumenusuarioLogic.getResumenUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.resumenusuarioReturnGeneral.getResumenUsuario(),this.resumenusuarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResumenUsuario.repaint();
				
				//((AbstractTableModel) this.jTableDatosResumenUsuario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResumenUsuario();
			}
		}
	}
	
	public void actualizarVisualTableDatosResumenUsuario() throws Exception {
		
		ResumenUsuarioModel resumenusuarioModel=(ResumenUsuarioModel)this.jTableDatosResumenUsuario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			resumenusuarioModel.resumenusuarios=this.resumenusuarioLogic.getResumenUsuarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			resumenusuarioModel.resumenusuarios=this.resumenusuarios;
		}
		
		
		((ResumenUsuarioModel) this.jTableDatosResumenUsuario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResumenUsuario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresumenusuarioAnterior(),this.resumenusuarioLogic.getResumenUsuarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresumenusuarioAnterior(),this.resumenusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResumenUsuario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResumenUsuario(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
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
										
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumenusuario,new Object(),generalEntityParameterGeneral,this.resumenusuarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResumenUsuarioConstantesFunciones.getClassesRelationshipsOfResumenUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResumenUsuarioConstantesFunciones.getClassesRelationshipsFromStringsOfResumenUsuario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResumenUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResumenUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.resumenusuario,new Object(),generalEntityParameterGeneral,this.resumenusuarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResumenUsuario(ResumenUsuarioBean resumenusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResumenUsuario(ArrayList<Classe> classes,ResumenUsuarioReturnGeneral resumenusuarioReturnGeneral,ResumenUsuarioBean resumenusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResumenUsuario(ResumenUsuario resumenusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.resumenusuario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResumenUsuario = new ResumenUsuarioDetalleFormJInternalFrame(jDesktopPane,this.resumenusuarioSessionBean.getConGuardarRelaciones(),this.resumenusuarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.setVisible(false);
		this.jInternalFrameDetalleFormResumenUsuario.setSelected(false);						
		
		this.jInternalFrameDetalleFormResumenUsuario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResumenUsuario.resumenusuarioLogic=this.resumenusuarioLogic;
		
		this.cargarCombosFrameForeignKeyResumenUsuario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResumenUsuario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResumenUsuario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResumenUsuario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResumenUsuario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResumenUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResumenUsuario"));
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarResumenUsuario.addActionListener(new ButtonActionListener(this,"ModificarResumenUsuario"));

		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarResumenUsuario"));
					
		this.jInternalFrameDetalleFormResumenUsuario.jMenuItemModificarResumenUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarResumenUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.addActionListener (new ButtonActionListener(this,"ActualizarResumenUsuario"));
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResumenUsuario"));
						
		this.jInternalFrameDetalleFormResumenUsuario.jMenuItemActualizarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResumenUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.addActionListener (new ButtonActionListener(this,"EliminarResumenUsuario"));
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarResumenUsuario"));
								
		this.jInternalFrameDetalleFormResumenUsuario.jMenuItemEliminarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResumenUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.addActionListener (new ButtonActionListener(this,"CancelarResumenUsuario"));
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarResumenUsuario"));
					
		this.jInternalFrameDetalleFormResumenUsuario.jMenuItemCancelarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResumenUsuario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jMenuItemDetalleCerrarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResumenUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenUsuario"));
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenUsuario"));
		
		
		
		this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResumenUsuario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonidResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idResumenUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingresosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_intentosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_cierresResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_cierresResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_reiniciosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_reiniciosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_actualResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_intentoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_cierreResumenUsuarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResumenUsuario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResumenUsuario"));
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResumenUsuario"));
		}
		
		this.jTableDatosResumenUsuario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResumenUsuario"));
		
		this.jTableDatosResumenUsuario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResumenUsuario"));
		
		this.jButtonNuevoResumenUsuario.addActionListener(new ButtonActionListener(this,"NuevoResumenUsuario"));
		
		this.jButtonDuplicarResumenUsuario.addActionListener(new ButtonActionListener(this,"DuplicarResumenUsuario"));
		
		this.jButtonCopiarResumenUsuario.addActionListener(new ButtonActionListener(this,"CopiarResumenUsuario"));
		
		this.jButtonVerFormResumenUsuario.addActionListener(new ButtonActionListener(this,"VerFormResumenUsuario"));
		
		
		this.jButtonNuevoToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"NuevoToolBarResumenUsuario"));
			
		this.jButtonDuplicarToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResumenUsuario"));
			
		this.jMenuItemNuevoResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResumenUsuario"));
			
		this.jMenuItemDuplicarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResumenUsuario"));		
		
		
		this.jButtonNuevoRelacionesResumenUsuario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResumenUsuario"));
		
		
		this.jButtonNuevoRelacionesToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResumenUsuario"));
			
		this.jMenuItemNuevoRelacionesResumenUsuario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResumenUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarResumenUsuario.addActionListener(new ButtonActionListener(this,"ModificarResumenUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonModificarToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarResumenUsuario"));
			
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemModificarResumenUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarResumenUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarResumenUsuario.addActionListener (new ButtonActionListener(this,"ActualizarResumenUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonActualizarToolBarResumenUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResumenUsuario"));
				
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemActualizarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResumenUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarResumenUsuario.addActionListener (new ButtonActionListener(this,"EliminarResumenUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonEliminarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarResumenUsuario"));
						
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemEliminarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResumenUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarResumenUsuario.addActionListener (new ButtonActionListener(this,"CancelarResumenUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonCancelarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarResumenUsuario"));
			
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemCancelarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResumenUsuario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResumenUsuario"));		
		
		
		this.jButtonCerrarResumenUsuario.addActionListener (new ButtonActionListener(this,"CerrarResumenUsuario"));
		
		
		this.jButtonCerrarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"CerrarToolBarResumenUsuario"));
			
		this.jMenuItemCerrarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResumenUsuario"));
			
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jMenuItemDetalleCerrarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResumenUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosResumenUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResumenUsuario"));
		}
		
		this.jButtonCopiarToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"CopiarToolBarResumenUsuario"));
			
		this.jButtonVerFormToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"VerFormToolBarResumenUsuario"));
		
		this.jMenuItemGuardarCambiosResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResumenUsuario"));
			
		this.jMenuItemCopiarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResumenUsuario"));		
		
		this.jMenuItemVerFormResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResumenUsuario"));		
		
		
		this.jButtonGuardarCambiosTablaResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResumenUsuario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResumenUsuario"));
			
		this.jMenuItemGuardarCambiosTablaResumenUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResumenUsuario"));		
		
		
		
		this.jButtonRecargarInformacionResumenUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionResumenUsuario"));
					
		this.jButtonRecargarInformacionToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResumenUsuario"));
		
		this.jMenuItemRecargarInformacionResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResumenUsuario"));		
		
		
		
		this.jButtonAnterioresResumenUsuario.addActionListener (new ButtonActionListener(this,"AnterioresResumenUsuario"));
		
		
		this.jButtonAnterioresToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResumenUsuario"));
		
		this.jMenuItemAnterioresResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResumenUsuario"));		
		
		
		this.jButtonSiguientesResumenUsuario.addActionListener (new ButtonActionListener(this,"SiguientesResumenUsuario"));
		
		
		this.jButtonSiguientesToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResumenUsuario"));
			
		this.jMenuItemSiguientesResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResumenUsuario"));
			
		this.jMenuItemAbrirOrderByResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResumenUsuario"));
			
		this.jMenuItemMostrarOcultarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResumenUsuario"));
			
		this.jMenuItemDetalleAbrirOrderByResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResumenUsuario"));
			
		this.jMenuItemDetalleMostarOcultarResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResumenUsuario"));		
		
		
		this.jButtonNuevoGuardarCambiosResumenUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResumenUsuario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResumenUsuario"));
			
		this.jMenuItemNuevoGuardarCambiosResumenUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResumenUsuario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResumenUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResumenUsuario"));

		this.jCheckBoxSeleccionadosResumenUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResumenUsuario"));
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResumenUsuario"));
		}
		
		
		this.jComboBoxTiposRelacionesResumenUsuario.addActionListener (new ButtonActionListener(this,"TiposRelacionesResumenUsuario"));
			
		this.jComboBoxTiposAccionesResumenUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesResumenUsuario"));
					
		this.jComboBoxTiposSeleccionarResumenUsuario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResumenUsuario"));
			
		this.jTextFieldValorCampoGeneralResumenUsuario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResumenUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonidResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idResumenUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingresosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_intentosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_cierresResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_cierresResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_reiniciosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_reiniciosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_actualResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_intentoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_cierreResumenUsuarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResumenUsuario!=null) {
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenUsuario"));
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenUsuario"));
				this.jInternalFrameReporteDinamicoResumenUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenUsuario"));
			}
			
			//this.jButtonCerrarReporteDinamicoResumenUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResumenUsuario"));				
			//this.jButtonGenerarReporteDinamicoResumenUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResumenUsuario"));
			//this.jButtonGenerarExcelReporteDinamicoResumenUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResumenUsuario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResumenUsuario!=null) {
				this.jInternalFrameImportacionResumenUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResumenUsuario"));
				this.jInternalFrameImportacionResumenUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResumenUsuario"));
				this.jInternalFrameImportacionResumenUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResumenUsuario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResumenUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByResumenUsuario"));
			
			this.jButtonAbrirOrderByToolBarResumenUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResumenUsuario"));			
			
			if(this.jInternalFrameOrderByResumenUsuario!=null) {
				this.jInternalFrameOrderByResumenUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResumenUsuario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResumenUsuario.jTabbedPaneRelacionesResumenUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResumenUsuario"));
		
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
            		closingInternalFrameResumenUsuario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResumenUsuario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResumenUsuario = (JInternalFrameBase)event.getSource();
	            	
	            ResumenUsuarioBeanSwingJInternalFrame jInternalFrameParent=(ResumenUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormResumenUsuario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResumenUsuarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResumenUsuario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResumenUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResumenUsuario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResumenUsuario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResumenUsuario";
		inputMap = this.jButtonNuevoResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResumenUsuarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResumenUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResumenUsuario";
		inputMap = this.jButtonNuevoRelacionesResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResumenUsuarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResumenUsuario";
		inputMap = this.jButtonModificarResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResumenUsuario";
		inputMap = this.jButtonActualizarResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResumenUsuario";
		inputMap = this.jButtonEliminarResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResumenUsuario";
		inputMap = this.jButtonCancelarResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResumenUsuario";
		inputMap = this.jButtonCerrarResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResumenUsuario";
		inputMap = this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResumenUsuario.jButtonGuardarCambiosResumenUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResumenUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResumenUsuario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResumenUsuarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResumenUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResumenUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResumenUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResumenUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResumenUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResumenUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonidResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idResumenUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonid_usuarioResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingresosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_intentosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_cierresResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_cierresResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_reiniciosResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_reiniciosResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_actualResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_error_ingresoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_intentoResumenUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResumenUsuario.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_cierreResumenUsuarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResumenUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResumenUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResumenUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResumenUsuario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResumenUsuario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
					resumenusuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
					resumenusuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResumenUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
						resumenusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
						resumenusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResumenUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResumenUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResumenUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResumenUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResumenUsuario.getSelectedRows();
			
			ResumenUsuario resumenusuarioLocal=new ResumenUsuario();
			
			//this.seleccionarTodosResumenUsuario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					resumenusuarioLocal =(ResumenUsuario) this.resumenusuarioLogic.getResumenUsuarios().toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					resumenusuarioLocal =(ResumenUsuario) this.resumenusuarios.toArray()[this.jTableDatosResumenUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				resumenusuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
						resumenusuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
						resumenusuarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResumenUsuario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResumenUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResumenUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResumenUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResumenUsuarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResumenUsuarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResumenUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResumenUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarioLogic.getResumenUsuarios()) {
				
						if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS)) {
							existe=true;
							resumenusuarioAux.setnumero_ingresos(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO)) {
							existe=true;
							resumenusuarioAux.setnumero_error_ingreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS)) {
							existe=true;
							resumenusuarioAux.setnumero_intentos(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES)) {
							existe=true;
							resumenusuarioAux.setnumero_cierres(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS)) {
							existe=true;
							resumenusuarioAux.setnumero_reinicios(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL)) {
							existe=true;
							resumenusuarioAux.setnumero_ingreso_actual(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_error_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_intento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_cierre(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenUsuario resumenusuarioAux:resumenusuarios) {
					
						if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS)) {
							existe=true;
							resumenusuarioAux.setnumero_ingresos(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO)) {
							existe=true;
							resumenusuarioAux.setnumero_error_ingreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS)) {
							existe=true;
							resumenusuarioAux.setnumero_intentos(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES)) {
							existe=true;
							resumenusuarioAux.setnumero_cierres(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS)) {
							existe=true;
							resumenusuarioAux.setnumero_reinicios(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL)) {
							existe=true;
							resumenusuarioAux.setnumero_ingreso_actual(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_error_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_intento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE)) {
							existe=true;
							resumenusuarioAux.setfecha_ultimo_cierre(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResumenUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResumenUsuarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResumenUsuario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResumenUsuario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResumenUsuario) {				
					conSplash=true;//false;										
					
					//this.startProcessResumenUsuario(conSplash);
				
					this.generarReporteResumenUsuariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResumenUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResumenUsuariosSeleccionados(false);
				//this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResumenUsuariosSeleccionados(true);
				//this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResumenUsuario();
				
				this.exportarResumenUsuariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResumenUsuarios();
				//this.importarResumenUsuarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResumenUsuario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResumenUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Resumen Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResumenUsuario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResumenUsuario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResumenUsuario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
				}	
			} 			
			else if(ResumenUsuarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResumenUsuario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResumenUsuario(conSplash);
					
						//this.actualizarParametrosGeneralResumenUsuario();
						
						this.generarReporteProcesoAccionResumenUsuariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResumenUsuarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Resumen UsuarioS SELECCIONADOS?", "MANTENIMIENTO DE Resumen Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResumenUsuario();
				
						this.actualizarParametrosGeneralResumenUsuario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.resumenusuarioReturnGeneral=resumenusuarioLogic.procesarAccionResumenUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.resumenusuarioLogic.getResumenUsuarios(),this.resumenusuarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResumenUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResumenUsuario();
					
					ResumenUsuarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResumenUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResumenUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResumenUsuario.jComboBoxTiposAccionesFormularioResumenUsuario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResumenUsuario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResumenUsuarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResumenUsuario();
			
			if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
			ResumenUsuario resumenusuario=new ResumenUsuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResumenUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResumenUsuario.getSelectedItem();
			
			
			
			
			resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(resumenusuariosSeleccionados.size()==1) {
				for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
					resumenusuario=resumenusuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResumenUsuario();
			
      		//this.finishProcessResumenUsuario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResumenUsuarioReturnGeneral() throws Exception {
		if(this.resumenusuarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.resumenusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.resumenusuarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.resumenusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.resumenusuarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.resumenusuarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResumenUsuario(false);
		}
		
		if(this.resumenusuarioReturnGeneral.getConRetornoLista() || this.resumenusuarioReturnGeneral.getConRetornoObjeto()) {
			if(this.resumenusuarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumenusuarioLogic.setResumenUsuarios(this.resumenusuarioReturnGeneral.getResumenUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.resumenusuarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.resumenusuarioLogic.setResumenUsuario(this.resumenusuarioReturnGeneral.getResumenUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingResumenUsuario(false);
		}
	}
	
	public void actualizarParametrosGeneralResumenUsuario() throws Exception {
		
		
	}
	
	public ArrayList<ResumenUsuario> getResumenUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResumenUsuario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ResumenUsuario resumenusuarioAux:resumenusuarioLogic.getResumenUsuarios()) {
					if(resumenusuarioAux.getIsSelected()) {
						resumenusuariosSeleccionados.add(resumenusuarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResumenUsuario resumenusuarioAux:this.resumenusuarios) {
					if(resumenusuarioAux.getIsSelected()) {
						resumenusuariosSeleccionados.add(resumenusuarioAux);				
					}
				}
			}
			
			if(resumenusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						resumenusuariosSeleccionados.addAll(this.resumenusuarioLogic.getResumenUsuarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						resumenusuariosSeleccionados.addAll(this.resumenusuarios);				
					}
				}
			}
		} else {
			resumenusuariosSeleccionados.add(this.resumenusuario);
		}
		
		return resumenusuariosSeleccionados;
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
	
	public void generarReporteResumenUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResumenUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResumenUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResumenUsuariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResumenUsuariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Resumen Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResumenUsuariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResumenUsuario();
		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResumenUsuario();
		
		
		//this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados ,resumenusuarioImplementable,resumenusuarioImplementableHome);
	}
	
	public void mostrarImportacionResumenUsuarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResumenUsuario();
		
		this.abrirFrameImportacionResumenUsuario();		
		
			
		//this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados ,resumenusuarioImplementable,resumenusuarioImplementableHome);
	}
	
	public void importarResumenUsuarios() throws Exception {		
	
	}
	
	public void exportarResumenUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResumenUsuariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResumenUsuariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResumenUsuariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Resumen Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResumenUsuario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResumenUsuario(resumenusuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//resumenusuarioAux.setsDetalleGeneralEntityReporte(resumenusuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResumenUsuario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResumenUsuario(ResumenUsuario resumenusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=resumenusuario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_ingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_error_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_intentos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_cierres().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_reinicios().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getnumero_ingreso_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_error_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_intento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=resumenusuario.getfecha_ultimo_cierre().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ResumenUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResumenUsuario(row);				
				iRow++;
			}				
			
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResumenUsuario(resumenusuarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResumenUsuariosSeleccionados() throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();		
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"resumenusuario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("resumenusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("resumenusuario");
			//elementRoot.appendChild(element);
		
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				element = document.createElement("resumenusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResumenUsuario(resumenusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Resumen Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResumenUsuario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResumenUsuario(ResumenUsuario resumenusuario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_ingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_error_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_intentos());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_cierres());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_reinicios());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getnumero_ingreso_actual());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getfecha_ultimo_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getfecha_ultimo_error_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getfecha_ultimo_intento());
		cell = row.createCell(iColumn++);cell.setCellValue(resumenusuario.getfecha_ultimo_cierre());				
	}
	
	public void setFilaDatosExportarXmlResumenUsuario(ResumenUsuario resumenusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResumenUsuarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(resumenusuario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResumenUsuarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(resumenusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(ResumenUsuarioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(resumenusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnumero_ingresos = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROINGRESOS);
		elementnumero_ingresos.appendChild(document.createTextNode(resumenusuario.getnumero_ingresos().toString().trim()));
		element.appendChild(elementnumero_ingresos);

		Element elementnumero_error_ingreso = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROERRORINGRESO);
		elementnumero_error_ingreso.appendChild(document.createTextNode(resumenusuario.getnumero_error_ingreso().toString().trim()));
		element.appendChild(elementnumero_error_ingreso);

		Element elementnumero_intentos = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROINTENTOS);
		elementnumero_intentos.appendChild(document.createTextNode(resumenusuario.getnumero_intentos().toString().trim()));
		element.appendChild(elementnumero_intentos);

		Element elementnumero_cierres = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROCIERRES);
		elementnumero_cierres.appendChild(document.createTextNode(resumenusuario.getnumero_cierres().toString().trim()));
		element.appendChild(elementnumero_cierres);

		Element elementnumero_reinicios = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROREINICIOS);
		elementnumero_reinicios.appendChild(document.createTextNode(resumenusuario.getnumero_reinicios().toString().trim()));
		element.appendChild(elementnumero_reinicios);

		Element elementnumero_ingreso_actual = document.createElement(ResumenUsuarioConstantesFunciones.NUMEROINGRESOACTUAL);
		elementnumero_ingreso_actual.appendChild(document.createTextNode(resumenusuario.getnumero_ingreso_actual().toString().trim()));
		element.appendChild(elementnumero_ingreso_actual);

		Element elementfecha_ultimo_ingreso = document.createElement(ResumenUsuarioConstantesFunciones.FECHAULTIMOINGRESO);
		elementfecha_ultimo_ingreso.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_ingreso().toString().trim()));
		element.appendChild(elementfecha_ultimo_ingreso);

		Element elementfecha_ultimo_error_ingreso = document.createElement(ResumenUsuarioConstantesFunciones.FECHAULTIMOERRORINGRESO);
		elementfecha_ultimo_error_ingreso.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_error_ingreso().toString().trim()));
		element.appendChild(elementfecha_ultimo_error_ingreso);

		Element elementfecha_ultimo_intento = document.createElement(ResumenUsuarioConstantesFunciones.FECHAULTIMOINTENTO);
		elementfecha_ultimo_intento.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_intento().toString().trim()));
		element.appendChild(elementfecha_ultimo_intento);

		Element elementfecha_ultimo_cierre = document.createElement(ResumenUsuarioConstantesFunciones.FECHAULTIMOCIERRE);
		elementfecha_ultimo_cierre.appendChild(document.createTextNode(resumenusuario.getfecha_ultimo_cierre().toString().trim()));
		element.appendChild(elementfecha_ultimo_cierre);
	}
	
	public void generarReporteGroupGenericoResumenUsuariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ResumenUsuario> resumenusuariosSeleccionados=new ArrayList<ResumenUsuario>();
		
		resumenusuariosSeleccionados=this.getResumenUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResumenUsuario(resumenusuariosSeleccionados);
		
		this.generarReporteResumenUsuarios("Todos",resumenusuariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResumenUsuario(ArrayList<ResumenUsuario> resumenusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ResumenUsuario resumenusuarioAux:resumenusuariosSeleccionados) {
				resumenusuarioAux.setsDetalleGeneralEntityReporte(resumenusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_ingresos().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_error_ingreso().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_intentos().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_cierres().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_reinicios().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(resumenusuarioAux.getnumero_ingreso_actual().toString());
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_error_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_intento()));
				}
				 else if(sTipoSeleccionar.equals(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE)) {
					existe=true;
					resumenusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(resumenusuarioAux.getfecha_ultimo_cierre()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResumenUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResumenUsuario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResumenUsuario=true;
				this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=true;
				this.isVisibilidadCeldaGuardarCambiosResumenUsuario=true;
			}
			
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=true;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=true;
			this.isVisibilidadCeldaEliminarResumenUsuario=true;
			this.isVisibilidadCeldaCancelarResumenUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=true;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResumenUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=true;
			this.isVisibilidadCeldaModificarResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
			this.isVisibilidadCeldaModificarResumenUsuario=true;
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
			this.isVisibilidadCeldaCancelarResumenUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarResumenUsuario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResumenUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=true;
		} else {
			this.actualizarEstadoPanelsResumenUsuario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResumenUsuario=false;
			//this.isVisibilidadCeldaVerFormResumenUsuario=false;
			this.isVisibilidadCeldaDuplicarResumenUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!resumenusuarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
		} else {
			this.isVisibilidadCeldaNuevoResumenUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosResumenUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!resumenusuarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;												
			}
			
			this.jButtonCerrarResumenUsuario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResumenUsuario=false;
		}
		
		if(!this.permiteMantenimiento(this.resumenusuario)) {
			this.isVisibilidadCeldaActualizarResumenUsuario=false;
			this.isVisibilidadCeldaEliminarResumenUsuario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResumenUsuario() {
	}
	
	public void actualizarEstadoPanelsResumenUsuario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResumenUsuario!=null) {
				this.jScrollPanelDatosEdicionResumenUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResumenUsuario!=null) {
				this.jScrollPanelDatosResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionResumenUsuario!=null) {
				this.jPanelPaginacionResumenUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
					this.jTabbedPaneBusquedasResumenUsuario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResumenUsuario!=null) {
				this.jTabbedPaneBusquedasResumenUsuario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResumenUsuario!=null) {
				this.jPanelParametrosReportesResumenUsuario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ResumenUsuarioSessionBean resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		
		if(this.resumenusuarioSessionBean==null) {
			this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		}
		
		this.resumenusuarioSessionBean.setsUltimaBusquedaResumenUsuario(this.getsAccionBusqueda());
		this.resumenusuarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.resumenusuarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			resumenusuarioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ResumenUsuarioSessionBean resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		
		if(this.resumenusuarioSessionBean==null) {
			this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		}
		
		if(this.resumenusuarioSessionBean.getsUltimaBusquedaResumenUsuario()!=null&&!this.resumenusuarioSessionBean.getsUltimaBusquedaResumenUsuario().equals("")) {
			this.setsAccionBusqueda(resumenusuarioSessionBean.getsUltimaBusquedaResumenUsuario());
			this.setiNumeroPaginacion(resumenusuarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(resumenusuarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(resumenusuarioSessionBean.getid_usuario());
				resumenusuarioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.resumenusuarioSessionBean.setsUltimaBusquedaResumenUsuario("");
		this.resumenusuarioSessionBean.setiNumeroPaginacion(ResumenUsuarioConstantesFunciones.INUMEROPAGINACION);
		this.resumenusuarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaResumenUsuario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResumenUsuario() {
		this.updateBorderResaltarBusquedasFormularioResumenUsuario();
		this.updateVisibilidadBusquedasFormularioResumenUsuario();
		this.updateHabilitarBusquedasFormularioResumenUsuario();
	}
	
	public void updateBorderResaltarBusquedasFormularioResumenUsuario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResumenUsuario.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResumenUsuario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResumenUsuario.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResumenUsuario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResumenUsuario.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResumenUsuario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarResumenUsuario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResumenUsuario() throws Exception {

		if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResumenUsuario();
		this.updateVisibilidadResaltarControlesFormularioResumenUsuario();
		this.updateHabilitarResaltarControlesFormularioResumenUsuario();
		
	}
	
	public void updateBorderResaltarControlesFormularioResumenUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.resumenusuarioConstantesFunciones.resaltaridResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltaridResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarid_usuarioResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarid_usuarioResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_ingresosResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_ingresosResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_error_ingresoResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_error_ingresoResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_intentosResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_intentosResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_cierresResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_cierresResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_reiniciosResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_reiniciosResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarnumero_ingreso_actualResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarnumero_ingreso_actualResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_ingresoResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_ingresoResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_error_ingresoResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_error_ingresoResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_intentoResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_intentoResumenUsuario);}
		if(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_cierreResumenUsuario!=null && this.jInternalFrameDetalleFormResumenUsuario!=null) {this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setBorder(this.resumenusuarioConstantesFunciones.resaltarfecha_ultimo_cierreResumenUsuario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResumenUsuario() throws Exception {		
		if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
	
		//this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostraridResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelidResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostraridResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarid_usuarioResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelid_usuarioResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarid_usuarioResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_ingresosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_ingresosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_ingresosResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_error_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_error_ingresoResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_intentosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_intentosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_intentosResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_cierresResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_cierresResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_cierresResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_reiniciosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_reiniciosResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_reiniciosResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_ingreso_actualResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelnumero_ingreso_actualResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarnumero_ingreso_actualResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelfecha_ultimo_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_ingresoResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelfecha_ultimo_error_ingresoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_error_ingresoResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_intentoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelfecha_ultimo_intentoResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_intentoResumenUsuario);
		//this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_cierreResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jPanelfecha_ultimo_cierreResumenUsuario.setVisible(this.resumenusuarioConstantesFunciones.mostrarfecha_ultimo_cierreResumenUsuario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResumenUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormResumenUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResumenUsuario!=null) {
	
		this.jInternalFrameDetalleFormResumenUsuario.jLabelidResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activaridResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jComboBoxid_usuarioResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarid_usuarioResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingresosResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_ingresosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_error_ingresoResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_intentosResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_intentosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_cierresResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_cierresResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_reiniciosResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_reiniciosResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jTextFieldnumero_ingreso_actualResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarnumero_ingreso_actualResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_ingresoResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarfecha_ultimo_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarfecha_ultimo_error_ingresoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_intentoResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarfecha_ultimo_intentoResumenUsuario);
		this.jInternalFrameDetalleFormResumenUsuario.jDateChooserfecha_ultimo_cierreResumenUsuario.setEnabled(this.resumenusuarioConstantesFunciones.activarfecha_ultimo_cierreResumenUsuario);
		}
	}
	
		
}
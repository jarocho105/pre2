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

import com.bydan.erp.cartera.util.CobradorConstantesFunciones;
import com.bydan.erp.cartera.util.CobradorParameterReturnGeneral;
//import com.bydan.erp.cartera.util.CobradorParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.CobradorBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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




@SuppressWarnings("unused")
public class CobradorBeanSwingJInternalFrame extends CobradorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobradorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Cobrador> cobradorValidator = new ClassValidator<Cobrador>(Cobrador.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Cobrador cobrador;	
	public Cobrador cobradorAux;
	public Cobrador cobradorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Cobrador cobradorTotales;
	public Long idCobradorActual;
	public Long iIdNuevoCobrador=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoIdentificacion="";

	public List<TipoIdentificacion> tipoidentificacionsForeignKey;

	public List<TipoIdentificacion> gettipoidentificacionsForeignKey() {
		return tipoidentificacionsForeignKey;
	}

	public void settipoidentificacionsForeignKey(List<TipoIdentificacion> tipoidentificacionsForeignKey) {
		this.tipoidentificacionsForeignKey = tipoidentificacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIdentificacion tipoidentificacionForeignKey;

	public TipoIdentificacion gettipoidentificacionForeignKey() {
		return tipoidentificacionForeignKey;
	}

	public void settipoidentificacionForeignKey(TipoIdentificacion tipoidentificacionForeignKey) {
		this.tipoidentificacionForeignKey = tipoidentificacionForeignKey;
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
	
	public Boolean isPermisoTodoCobrador;
	public Boolean isPermisoNuevoCobrador;
	public Boolean isPermisoActualizarCobrador;
	public Boolean isPermisoActualizarOriginalCobrador;
	public Boolean isPermisoEliminarCobrador;
	public Boolean isPermisoGuardarCambiosCobrador;
	public Boolean isPermisoConsultaCobrador;
	public Boolean isPermisoBusquedaCobrador;
	public Boolean isPermisoReporteCobrador;
	public Boolean isPermisoPaginacionMedioCobrador;
	public Boolean isPermisoPaginacionAltoCobrador;
	public Boolean isPermisoPaginacionTodoCobrador;
	public Boolean isPermisoCopiarCobrador;
	public Boolean isPermisoVerFormCobrador;
	public Boolean isPermisoDuplicarCobrador;
	public Boolean isPermisoOrdenCobrador;
	
	
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
	
	public CobradorParameterReturnGeneral cobradorReturnGeneral;
	public CobradorParameterReturnGeneral cobradorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrador=false;
	public Boolean esParaAccionDesdeFormularioCobrador=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobradorSessionBeanAdditional cobradorSessionBeanAdditional=null;
	
	public CobradorSessionBeanAdditional getCobradorSessionBeanAdditional() {
		return this.cobradorSessionBeanAdditional;
	}
	
	public void setCobradorSessionBeanAdditional(CobradorSessionBeanAdditional cobradorSessionBeanAdditional) {
		try {
			this.cobradorSessionBeanAdditional=cobradorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobradorBeanSwingJInternalFrameAdditional cobradorBeanSwingJInternalFrameAdditional=null;
	//public class CobradorBeanSwingJInternalFrame
	
	public CobradorBeanSwingJInternalFrameAdditional getCobradorBeanSwingJInternalFrameAdditional() {
		return this.cobradorBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobradorBeanSwingJInternalFrameAdditional(CobradorBeanSwingJInternalFrameAdditional cobradorBeanSwingJInternalFrameAdditional) {
		try {
			this.cobradorBeanSwingJInternalFrameAdditional=cobradorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobradorLogic cobradorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Cobrador cobradorBean;
	public CobradorConstantesFunciones cobradorConstantesFunciones;
	//public CobradorParameterReturnGeneral cobradorReturnGeneral;
	
	//FK
	
	public TipoIdentificacionLogic tipoidentificacionLogic;
	
	//PARAMETROS
	
	
	//public List<Cobrador> cobradors;	
	//public List<Cobrador> cobradorsEliminados;
	//public List<Cobrador> cobradorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrador=false;
	public Boolean isVisibilidadCeldaDuplicarCobrador=true;
	public Boolean isVisibilidadCeldaCopiarCobrador=true;
	public Boolean isVisibilidadCeldaVerFormCobrador=true;
	public Boolean isVisibilidadCeldaOrdenCobrador=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrador=false;
	public Boolean isVisibilidadCeldaModificarCobrador=false;
	public Boolean isVisibilidadCeldaActualizarCobrador=false;
	public Boolean isVisibilidadCeldaEliminarCobrador=false;
	public Boolean isVisibilidadCeldaCancelarCobrador=false;
	public Boolean isVisibilidadCeldaGuardarCobrador=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrador=false;	
	
	
	public Boolean isVisibilidadFK_IdTipoIdentificacion=false;
	
	public Long getiIdNuevoCobrador() {
		return this.iIdNuevoCobrador;
	}

	public void setiIdNuevoCobrador(Long iIdNuevoCobrador) {
		this.iIdNuevoCobrador = iIdNuevoCobrador;
	}
	
	public Long getidCobradorActual() {
		return this.idCobradorActual;
	}

	public void setidCobradorActual(Long idCobradorActual) {
		this.idCobradorActual = idCobradorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Cobrador getcobrador() {
		return this.cobrador;
	}

	public void setcobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}
	
	public Cobrador getcobradorAux() {
		return this.cobradorAux;
	}

	public void setcobradorAux(Cobrador cobradorAux) {
		this.cobradorAux = cobradorAux;
	}				
	
	public Cobrador getcobradorAnterior() {
		return this.cobradorAnterior;
	}

	public void setcobradorAnterior(Cobrador cobradorAnterior) {
		this.cobradorAnterior = cobradorAnterior;
	}	
	
	public Cobrador getcobradorTotales() {
		return this.cobradorTotales;
	}

	public void setcobradorTotales(Cobrador cobradorTotales) {
		this.cobradorTotales = cobradorTotales;
	}	
	
	public Cobrador getcobradorBean() {
		return this.cobradorBean;
	}

	public void setcobradorBean(Cobrador cobradorBean) {
		this.cobradorBean = cobradorBean;
	}	
	
	public CobradorParameterReturnGeneral getcobradorReturnGeneral() {
		return this.cobradorReturnGeneral;
	}

	public void setcobradorReturnGeneral(CobradorParameterReturnGeneral cobradorReturnGeneral) {
		this.cobradorReturnGeneral = cobradorReturnGeneral;
	}	
	
	
	public Long id_tipo_identificacionFK_IdTipoIdentificacion=-1L;

	public Long getid_tipo_identificacionFK_IdTipoIdentificacion() {
		return this.id_tipo_identificacionFK_IdTipoIdentificacion;
	}

	public void setid_tipo_identificacionFK_IdTipoIdentificacion(Long id_tipo_identificacionFK_IdTipoIdentificacion) {
		this.id_tipo_identificacionFK_IdTipoIdentificacion = id_tipo_identificacionFK_IdTipoIdentificacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobradorLogic getCobradorLogic()	{		
		return cobradorLogic;
	}

	public void setCobradorLogic(CobradorLogic cobradorLogic) {
		this.cobradorLogic = cobradorLogic;
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
	
	public Boolean getIsEsNuevoCobrador() {
		return isEsNuevoCobrador;
	}

	public void setIsEsNuevoCobrador(Boolean isEsNuevoCobrador) {
		this.isEsNuevoCobrador = isEsNuevoCobrador;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrador() {
		return esParaAccionDesdeFormularioCobrador;
	}
	
	public void setEsParaAccionDesdeFormularioCobrador(Boolean esParaAccionDesdeFormularioCobrador) {
		this.esParaAccionDesdeFormularioCobrador = esParaAccionDesdeFormularioCobrador;
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
	
	
	public void cargarCombosTipoIdentificacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIdentificacionLogic tipoidentificacionLogic=new TipoIdentificacionLogic();

			tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

			if(this.cobradorSessionBean==null) {
				this.cobradorSessionBean=new CobradorSessionBean();
			}

			if(!this.cobradorSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

					tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(sFinalQuery,new Pagination());

					this.tipoidentificacionsForeignKey=tipoidentificacionLogic.getTipoIdentificacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIdentificacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getEntityWithConnection(cobradorSessionBean.getlidTipoIdentificacionActual());
					this.tipoidentificacionsForeignKey.add(tipoidentificacionLogic.getTipoIdentificacion());
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

	
	
	public void setActualTipoIdentificacionForeignKey(Long idTipoIdentificacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoidentificacionTemp!=null) {

					if(this.cobrador!=null) {
						this.cobrador.setTipoIdentificacion(tipoidentificacionTemp);
					}

					if(this.jInternalFrameDetalleFormCobrador!=null) {
						this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setSelectedItem(tipoidentificacionTemp);
					}
				} else {
					//jComboBoxid_tipo_identificacionCobrador.setSelectedItem(tipoidentificacionTemp);
					if(this.jInternalFrameDetalleFormCobrador!=null) {
						if(this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoidentificacionTemp!=null && jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador!=null) {
						jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setSelectedItem(tipoidentificacionTemp);
					} else {
						if(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador!=null) {
							//jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setSelectedItem(tipoidentificacionTemp);
							if(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.getItemCount()>0) {
								jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setSelectedIndex(0);
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

	public String getActualTipoIdentificacionForeignKeyDescripcion(Long idTipoIdentificacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}


			sDescripcion=TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIdentificacionForeignKeyGenerico(Long idTipoIdentificacionSeleccionado,JComboBox jComboBoxid_tipo_identificacionCobradorGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(tipoidentificacionTemp!=null) {
				jComboBoxid_tipo_identificacionCobradorGenerico.setSelectedItem(tipoidentificacionTemp);
			} else {
				if(jComboBoxid_tipo_identificacionCobradorGenerico!=null && jComboBoxid_tipo_identificacionCobradorGenerico.getItemCount()>0) {
					jComboBoxid_tipo_identificacionCobradorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIdentificacionForeignKey(Cobrador cobrador,JComboBox jComboBoxid_tipo_identificacionCobradorGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionAux=new TipoIdentificacion();

			if(jComboBoxid_tipo_identificacionCobradorGenerico==null) {
				tipoidentificacionAux=(TipoIdentificacion)this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.getSelectedItem();
			} else {
				tipoidentificacionAux=(TipoIdentificacion)jComboBoxid_tipo_identificacionCobradorGenerico.getSelectedItem();
			}

			if(tipoidentificacionAux!=null && tipoidentificacionAux.getId()!=null) {
				cobrador.setid_tipo_identificacion(tipoidentificacionAux.getId());
				cobrador.settipoidentificacion_descripcion(CobradorConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionAux));
				cobrador.setTipoIdentificacion(tipoidentificacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIdentificacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIdentificacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobradorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrador!=null) { 
							this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.addItem(tipoidentificacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrador!=null) { 
					}

					if(!CobradorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobradorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.addItem(tipoidentificacion);
							}
						}

						if(!CobradorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoIdentificacionForeignKey(TipoIdentificacion tipoidentificacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrador!=null) {
							this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setSelectedItem(tipoidentificacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrador!=null) {
							this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setSelectedItem(tipoidentificacion);
						} else {
							this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrador() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CobradorConstantesFunciones.refrescarForeignKeysDescripcionesCobrador(this.cobradorLogic.getCobradors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CobradorConstantesFunciones.refrescarForeignKeysDescripcionesCobrador(this.cobradors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoIdentificacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cobradorLogic.setCobradors(this.cobradors);
			cobradorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CobradorParameterReturnGeneral getCobradorParameterGeneral() {
		return this.cobradorParameterGeneral;
	}
	
	public void setCobradorParameterGeneral(CobradorParameterReturnGeneral cobradorParameterGeneral) {
		this.cobradorParameterGeneral = cobradorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrador() {
		return isPermisoTodoCobrador;
	}

	public void setIsPermisoTodoCobrador(Boolean isPermisoTodoCobrador) {
		this.isPermisoTodoCobrador = isPermisoTodoCobrador;
	}

	public Boolean getIsPermisoNuevoCobrador() {
		return isPermisoNuevoCobrador;
	}

	public void setIsPermisoNuevoCobrador(Boolean isPermisoNuevoCobrador) {
		this.isPermisoNuevoCobrador = isPermisoNuevoCobrador;
	}

	public Boolean getIsPermisoActualizarCobrador() {
		return isPermisoActualizarCobrador;
	}

	public void setIsPermisoActualizarCobrador(Boolean isPermisoActualizarCobrador) {
		this.isPermisoActualizarCobrador = isPermisoActualizarCobrador;
	}

	public Boolean getIsPermisoEliminarCobrador() {
		return isPermisoEliminarCobrador;
	}

	public void setIsPermisoEliminarCobrador(Boolean isPermisoEliminarCobrador) {
		this.isPermisoEliminarCobrador = isPermisoEliminarCobrador;
	}

	public Boolean getIsPermisoGuardarCambiosCobrador() {
		return isPermisoGuardarCambiosCobrador;
	}

	public void setIsPermisoGuardarCambiosCobrador(Boolean isPermisoGuardarCambiosCobrador) {
		this.isPermisoGuardarCambiosCobrador = isPermisoGuardarCambiosCobrador;
	}
	
	public Boolean getIsPermisoConsultaCobrador() {
		return isPermisoConsultaCobrador;
	}

	public void setIsPermisoConsultaCobrador(Boolean isPermisoConsultaCobrador) {
		this.isPermisoConsultaCobrador = isPermisoConsultaCobrador;
	}

	public Boolean getIsPermisoBusquedaCobrador() {
		return isPermisoBusquedaCobrador;
	}

	public void setIsPermisoBusquedaCobrador(Boolean isPermisoBusquedaCobrador) {
		this.isPermisoBusquedaCobrador = isPermisoBusquedaCobrador;
	}

	public Boolean getIsPermisoReporteCobrador() {
		return isPermisoReporteCobrador;
	}

	public void setIsPermisoReporteCobrador(Boolean isPermisoReporteCobrador) {
		this.isPermisoReporteCobrador = isPermisoReporteCobrador;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrador() {
		return isPermisoPaginacionMedioCobrador;
	}

	public void setIsPermisoPaginacionMedioCobrador(Boolean isPermisoPaginacionMedioCobrador) {
		this.isPermisoPaginacionMedioCobrador = isPermisoPaginacionMedioCobrador;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrador() {
		return isPermisoPaginacionTodoCobrador;
	}

	public void setIsPermisoPaginacionTodoCobrador(Boolean isPermisoPaginacionTodoCobrador) {
		this.isPermisoPaginacionTodoCobrador = isPermisoPaginacionTodoCobrador;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrador() {
		return isPermisoPaginacionAltoCobrador;
	}

	public void setIsPermisoPaginacionAltoCobrador(Boolean isPermisoPaginacionAltoCobrador) {
		this.isPermisoPaginacionAltoCobrador = isPermisoPaginacionAltoCobrador;
	}
	
	public Boolean getIsPermisoCopiarCobrador() {
		return isPermisoCopiarCobrador;
	}

	public void setIsPermisoCopiarCobrador(Boolean isPermisoCopiarCobrador) {
		this.isPermisoCopiarCobrador = isPermisoCopiarCobrador;
	}
	
	public Boolean getIsPermisoVerFormCobrador() {
		return isPermisoVerFormCobrador;
	}

	public void setIsPermisoVerFormCobrador(Boolean isPermisoVerFormCobrador) {
		this.isPermisoVerFormCobrador = isPermisoVerFormCobrador;
	}
	
	public Boolean getIsPermisoDuplicarCobrador() {
		return isPermisoDuplicarCobrador;
	}

	public void setIsPermisoDuplicarCobrador(Boolean isPermisoDuplicarCobrador) {
		this.isPermisoDuplicarCobrador = isPermisoDuplicarCobrador;
	}
	
	public Boolean getIsPermisoOrdenCobrador() {
		return isPermisoOrdenCobrador;
	}

	public void setIsPermisoOrdenCobrador(Boolean isPermisoOrdenCobrador) {
		this.isPermisoOrdenCobrador = isPermisoOrdenCobrador;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrador() {
		return isVisibilidadCeldaNuevoCobrador;
	}

	public void setIsVisibilidadCeldaNuevoCobrador(Boolean isVisibilidadCeldaNuevoCobrador) {
		this.isVisibilidadCeldaNuevoCobrador = isVisibilidadCeldaNuevoCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrador() {
		return isVisibilidadCeldaDuplicarCobrador;
	}

	public void setIsVisibilidadCeldaDuplicarCobrador(Boolean isVisibilidadCeldaDuplicarCobrador) {
		this.isVisibilidadCeldaDuplicarCobrador = isVisibilidadCeldaDuplicarCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrador() {
		return isVisibilidadCeldaCopiarCobrador;
	}

	public void setIsVisibilidadCeldaCopiarCobrador(Boolean isVisibilidadCeldaCopiarCobrador) {
		this.isVisibilidadCeldaCopiarCobrador = isVisibilidadCeldaCopiarCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrador() {
		return isVisibilidadCeldaVerFormCobrador;
	}

	public void setIsVisibilidadCeldaVerFormCobrador(Boolean isVisibilidadCeldaVerFormCobrador) {
		this.isVisibilidadCeldaVerFormCobrador = isVisibilidadCeldaVerFormCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrador() {
		return isVisibilidadCeldaOrdenCobrador;
	}

	public void setIsVisibilidadCeldaOrdenCobrador(Boolean isVisibilidadCeldaOrdenCobrador) {
		this.isVisibilidadCeldaOrdenCobrador = isVisibilidadCeldaOrdenCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrador() {
		return isVisibilidadCeldaNuevoRelacionesCobrador;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrador(Boolean isVisibilidadCeldaNuevoRelacionesCobrador) {
		this.isVisibilidadCeldaNuevoRelacionesCobrador = isVisibilidadCeldaNuevoRelacionesCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrador() {
		return isVisibilidadCeldaModificarCobrador;
	}

	public void setIsVisibilidadCeldaModificarCobrador(Boolean isVisibilidadCeldaModificarCobrador) {
		this.isVisibilidadCeldaModificarCobrador = isVisibilidadCeldaModificarCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrador() {
		return isVisibilidadCeldaActualizarCobrador;
	}

	public void setIsVisibilidadCeldaActualizarCobrador(Boolean isVisibilidadCeldaActualizarCobrador) {
		this.isVisibilidadCeldaActualizarCobrador = isVisibilidadCeldaActualizarCobrador;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrador() {
		return isVisibilidadCeldaEliminarCobrador;
	}

	public void setIsVisibilidadCeldaEliminarCobrador(Boolean isVisibilidadCeldaEliminarCobrador) {
		this.isVisibilidadCeldaEliminarCobrador = isVisibilidadCeldaEliminarCobrador;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrador() {
		return isVisibilidadCeldaCancelarCobrador;
	}

	public void setIsVisibilidadCeldaCancelarCobrador(Boolean isVisibilidadCeldaCancelarCobrador) {
		this.isVisibilidadCeldaCancelarCobrador = isVisibilidadCeldaCancelarCobrador;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrador() {
		return isVisibilidadCeldaGuardarCobrador;
	}

	public void setIsVisibilidadCeldaGuardarCobrador(Boolean isVisibilidadCeldaGuardarCobrador) {
		this.isVisibilidadCeldaGuardarCobrador = isVisibilidadCeldaGuardarCobrador;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrador() {
		return isVisibilidadCeldaGuardarCambiosCobrador;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrador(Boolean isVisibilidadCeldaGuardarCambiosCobrador) {
		this.isVisibilidadCeldaGuardarCambiosCobrador = isVisibilidadCeldaGuardarCambiosCobrador;
	}
		
	public CobradorSessionBean getcobradorSessionBean() {
		return this.cobradorSessionBean;
	}
	
	public void setcobradorSessionBean(CobradorSessionBean cobradorSessionBean) {
		this.cobradorSessionBean=cobradorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdTipoIdentificacion() {
		return this.isVisibilidadFK_IdTipoIdentificacion;
	}

	public void setisVisibilidadFK_IdTipoIdentificacion(Boolean isVisibilidadFK_IdTipoIdentificacion) {
		this.isVisibilidadFK_IdTipoIdentificacion=isVisibilidadFK_IdTipoIdentificacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrador(Cobrador cobrador)throws Exception {
		try {
			
				this.setActualParaGuardarTipoIdentificacionForeignKey(cobrador,null);
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
	
	public void bugActualizarReferenciaActual(Cobrador cobrador,Cobrador cobradorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrador(cobrador);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobradorAux.setId(cobrador.getId());
		cobradorAux.setVersionRow(cobrador.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCobrador();
		
			int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cobradorValidator.getInvalidValues(this.cobrador);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cobradorLogic.setDatosCliente(datosCliente);
			cobradorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cobradorAux=new  Cobrador();
				
				cobradorAux.setIsNew(true);
				cobradorAux.setIsChanged(true);
				
				cobradorAux.setCobradorOriginal(this.cobrador);
				
				cobradorAux.setId(this.cobrador.getId());	
				cobradorAux.setVersionRow(this.cobrador.getVersionRow());	
				cobradorAux.setid_tipo_identificacion(this.cobrador.getid_tipo_identificacion());	
				cobradorAux.setidentificacion(this.cobrador.getidentificacion());	
				cobradorAux.setapellido(this.cobrador.getapellido());	
				cobradorAux.setnombre(this.cobrador.getnombre());	
				cobradorAux.setdireccion(this.cobrador.getdireccion());	
				cobradorAux.settelefono(this.cobrador.gettelefono());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobradorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cobradorAux,cobradorLogic.getCobradors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobradorAux,cobradors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cobradorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorLogic.saveCobradors();//WithConnection
						//cobradorLogic.getSetVersionRowCobradors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);
					
					this.refrescarForeignKeysDescripcionesCobrador();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cobradorLogic.saveCobradorRelaciones(cobradorAux);//WithConnection
								//cobradorLogic.getSetVersionRowCobradors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cobradorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cobradorAux,cobradorLogic.getCobradors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cobradorAux,cobradors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cobradorAux=new  Cobrador();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cobradorSessionBean.getEsGuardarRelacionado() 
					|| (this.cobradorSessionBean.getEsGuardarRelacionado() && this.cobrador.getId()>=0)) {
						
					cobradorAux.setIsNew(false);
				}
				
				cobradorAux.setIsDeleted(false);
			
				cobradorAux.setId(this.cobrador.getId());	
				cobradorAux.setVersionRow(this.cobrador.getVersionRow());	
				cobradorAux.setid_tipo_identificacion(this.cobrador.getid_tipo_identificacion());	
				cobradorAux.setidentificacion(this.cobrador.getidentificacion());	
				cobradorAux.setapellido(this.cobrador.getapellido());	
				cobradorAux.setnombre(this.cobrador.getnombre());	
				cobradorAux.setdireccion(this.cobrador.getdireccion());	
				cobradorAux.settelefono(this.cobrador.gettelefono());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobradorAux,cobradorLogic.getCobradors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobradorAux,cobradors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cobradorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorLogic.saveCobradors();//WithConnection
						//cobradorLogic.getSetVersionRowCobradors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);
					
					this.refrescarForeignKeysDescripcionesCobrador();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cobradorLogic.saveCobradorRelaciones(cobradorAux);//WithConnection
								//cobradorLogic.getSetVersionRowCobradors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cobradorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cobradorAux,cobradorLogic.getCobradors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cobradorAux,cobradors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cobrador,cobradorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cobradorAux=new  Cobrador();
				
				cobradorAux.setIsNew(false);
				cobradorAux.setIsChanged(false);
				
				cobradorAux.setIsDeleted(true);
				
				cobradorAux.setId(this.cobrador.getId());	
				cobradorAux.setVersionRow(this.cobrador.getVersionRow());	
				cobradorAux.setid_tipo_identificacion(this.cobrador.getid_tipo_identificacion());	
				cobradorAux.setidentificacion(this.cobrador.getidentificacion());	
				cobradorAux.setapellido(this.cobrador.getapellido());	
				cobradorAux.setnombre(this.cobrador.getnombre());	
				cobradorAux.setdireccion(this.cobrador.getdireccion());	
				cobradorAux.settelefono(this.cobrador.gettelefono());	
				
				if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cobradorAux.getId()>=0) {	
						this.cobradorsEliminados.add(cobradorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cobradorAux,cobradorLogic.getCobradors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobradorAux,cobradors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cobradorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorLogic.saveCobradors();//WithConnection
						//cobradorLogic.getSetVersionRowCobradors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cobradorLogic.saveCobradorRelaciones(cobradorAux);//WithConnection
								//cobradorLogic.getSetVersionRowCobradors();//WithConnection
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
							if(this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cobradorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cobradorAux,cobradorLogic.getCobradors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cobradorAux,cobradors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getCobradors().addAll(this.cobradorsEliminados);
					
					cobradorLogic.saveCobradors();//WithConnection
					//cobradorLogic.getSetVersionRowCobradors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCobrador();
				
				this.cobradorsEliminados= new ArrayList<Cobrador>();		
			}
			
			if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cobrador GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cobrador=cobradorAux;
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
      		//this.finishProcessCobrador();
      	}
		
	}	
	
	public void actualizarRelaciones(Cobrador cobradorLocal) throws Exception {
		
		if(this.cobradorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Cobrador cobradorLocal) throws Exception {	
		if(this.cobradorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoIdentificacionDetalleFormJInternalFrame.class)) {
				TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrameLocal=(TipoIdentificacionBeanSwingJInternalFrame) ((TipoIdentificacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoidentificacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.gettipoidentificacion(),true);
				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarLista(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion,this.tipoidentificacionsForeignKey);

				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				cobradorLocal.setTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey("Formulario");
				this.setActualTipoIdentificacionForeignKey(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobradorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobradorValidator.getInvalidValues(this.cobrador);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Cobrador cobrador,List<Cobrador> cobradors) throws Exception {
		try	{		
			CobradorConstantesFunciones.actualizarLista(cobrador,cobradors,this.cobradorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Cobrador cobrador,List<Cobrador> cobradors) throws Exception {
		try	{			
			CobradorConstantesFunciones.actualizarSelectedLista(cobrador,cobradors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Cobrador> cobradorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobradorsLocal=this.cobradorLogic.getCobradors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobradorsLocal=this.cobradors;
			}
			//ARCHITECTURE
		
			for(Cobrador cobradorLocal:cobradorsLocal) {
				if(this.permiteMantenimiento(cobradorLocal) && cobradorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobradorConstantesFunciones.getCobradorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.IDTIPOIDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelid_tipo_identificacionCobrador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelidentificacionCobrador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelapellidoCobrador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelnombreCobrador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabeldireccionCobrador,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobradorConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabeltelefonoCobrador,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabelid_tipo_identificacionCobrador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabelidentificacionCobrador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabelapellidoCobrador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabelnombreCobrador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabeldireccionCobrador,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrador.jLabeltelefonoCobrador,"");
		
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
		this.iIdNuevoCobrador--;	
		
		
		this.cobradorAux=new Cobrador();
		
		this.cobradorAux.setId(this.iIdNuevoCobrador);
		this.cobradorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobradorLogic.getCobradors().add(this.cobradorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobradors.add(this.cobradorAux);
		}
		//ARCHITECTURE
		
		this.cobrador=this.cobradorAux;
		
		if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrador(this.cobrador);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrador(this.cobrador);
		}
				
		//this.setDefaultControlesCobrador();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrador();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrador();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrador();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrador(this.cobradorBean,this.cobrador,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CobradorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cobradorSessionBean.getConGuardarRelaciones()) {
			classes=CobradorConstantesFunciones.getClassesRelationshipsOfCobrador(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cobradorReturnGeneral=cobradorLogic.procesarEventosCobradorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobradorLogic.getCobradors(),this.cobrador,this.cobradorParameterGeneral,this.isEsNuevoCobrador,classes);//this.cobradorLogic.getCobrador()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrador(this.cobradorReturnGeneral,this.cobradorBean,false);
		
		if(this.cobradorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrador(this.cobradorReturnGeneral.getCobrador());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrador(this.cobradorReturnGeneral.getCobrador());
		}
		
		if(this.cobradorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrador(this.cobradorReturnGeneral.getCobrador(),classes);//this.cobradorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrador();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrador();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobradorBeanSwingJInternalFrameAdditional.RecargarFormCobrador(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrador(false);
						
			if(cobradorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrador();
			}
			
			this.actualizarVisualTableDatosCobrador();
			
			this.jTableDatosCobrador.setRowSelectionInterval(this.getIndiceNuevoCobrador(), this.getIndiceNuevoCobrador());
			
			this.seleccionarFilaTablaCobradorActual();
						
			this.actualizarEstadoCeldasBotonesCobrador("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrador(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activaridentificacionCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activarapellidoCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activarnombreCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activardireccionCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activartelefonoCobrador);	
		
		this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setEnabled(isHabilitar && this.cobradorConstantesFunciones.activarid_tipo_identificacionCobrador);
	};
	
	public void setDefaultControlesCobrador() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrador(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobradorSessionBean.setConGuardarRelaciones(true);			
			this.cobradorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.setVisible(true);
			
					
		} else {
			//this.cobradorSessionBean.setConGuardarRelaciones(false);			
			this.cobradorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrador() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
				if(cobradorAux.getId().equals(this.iIdNuevoCobrador)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cobrador cobradorAux:this.cobradors) {
				if(cobradorAux.getId().equals(this.iIdNuevoCobrador)) {
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
	
	public int getIndiceActualCobrador(Cobrador cobrador,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
				if(cobradorAux.getId().equals(cobrador.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cobrador cobradorAux:this.cobradors) {
				if(cobradorAux.getId().equals(cobrador.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrador(Cobrador cobradorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
				if(cobradorAux.getCobradorOriginal().getId().equals(cobradorOriginal.getId())) {
					existe=true;
					cobradorOriginal.setId(cobradorAux.getId());
					cobradorOriginal.setVersionRow(cobradorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cobrador cobradorAux:this.cobradors) {
				if(cobradorAux.getCobradorOriginal().getId().equals(cobradorOriginal.getId())) {
					existe=true;
					cobradorOriginal.setId(cobradorAux.getId());
					cobradorOriginal.setVersionRow(cobradorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrador(Boolean esParaCancelar) throws Exception {
		cobradorsAux=new ArrayList<Cobrador>();
		cobradorAux=new Cobrador();
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
					if(cobradorAux.getId()<0) {
						cobradorsAux.add(cobradorAux);
					}		
				}
				this.iIdNuevoCobrador=0L;
				this.cobradorLogic.getCobradors().removeAll(cobradorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cobrador cobradorAux:this.cobradors) {
					if(cobradorAux.getId()<0) {
						cobradorsAux.add(cobradorAux);
					}		
				}
				this.iIdNuevoCobrador=0L;
				this.cobradors.removeAll(cobradorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrador 
					&& this.cobradorLogic.getCobradors().size()>0
					) {
					cobradorAux=this.cobradorLogic.getCobradors().get(this.cobradorLogic.getCobradors().size() - 1);
				
					if(cobradorAux.getId()<0) {
						this.cobradorLogic.getCobradors().remove(cobradorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrador && this.cobradors.size()>0) {
					cobradorAux=this.cobradors.get(this.cobradors.size() - 1);
				
					if(cobradorAux.getId()<0) {
						this.cobradors.remove(cobradorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrador(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrador.getId()<0) {
				this.cobradorLogic.getCobradors().remove(this.cobrador);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrador.getId()<0) {
				this.cobradors.remove(this.cobrador);
			}
		}			
	}
	
	public void setEstadosInicialesCobrador(List<Cobrador> cobradorsAux) throws Exception {
		CobradorConstantesFunciones.setEstadosInicialesCobrador(cobradorsAux);
	}
	
	public void setEstadosInicialesCobrador(Cobrador cobradorAux) throws Exception {
		CobradorConstantesFunciones.setEstadosInicialesCobrador(cobradorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobradorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobradorActual()) {
				if(!this.isEsNuevoCobrador) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrador=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobradorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrador ?", "MANTENIMIENTO DE Cobrador", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Cobrador cobrador) throws Exception {
		CobradorConstantesFunciones.seleccionarAsignar(this.cobrador,cobrador);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrador=this.isPermisoActualizarOriginalCobrador;
			
			
			this.seleccionarAsignar(cobrador);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobradorConstantesFunciones.quitarEspaciosCobrador(this.cobrador,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCobrador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobradorSessionBean.setsFuncionBusquedaRapida(this.cobradorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrador) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrador(esParaCancelar);				
				this.cancelarNuevoCobrador(esParaCancelar);								
			}
			
			this.cobrador=new Cobrador();
			
			this.inicializarCobrador();
			
			this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrador() throws Exception {
		try {
			CobradorConstantesFunciones.inicializarCobrador(this.cobrador);
			
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
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobradorLogic.getCobradors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobradors(String sAccionBusqueda,List<Cobrador> cobradorsParaReportes) throws Exception {
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
					sPathReporteFinal="Cobrador"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobradorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobradorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Cobrador"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobradores");		
		parameters.put("busquedapor", CobradorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrador=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobradorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobradorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrador=new JRBeanArrayDataSource(CobradorJInternalFrame.TraerCobradorBeans(cobradorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrador);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobradorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobradorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobradorBean.TraerCobradorBeans(cobradorsParaReportes).toArray()));
							
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
				this.generarExcelReporteCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobradorActionPerformed(null);
					//this.generarExcelReporteCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobradors(sAccionBusqueda,sTipoArchivoReporte,cobradorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobradors(String sAccionBusqueda,String sTipoArchivoReporte,List<Cobrador> cobradorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cobradors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrador("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Cobrador cobrador : cobradorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobradorConstantesFunciones.generarExcelReporteDataCobrador("NORMAL",row,workbook,cobrador,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrador(String sTipo,Row row,Workbook workbook) {
		
		CobradorConstantesFunciones.generarExcelReporteHeaderCobrador(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobradors(String sAccionBusqueda,String sTipoArchivoReporte,List<Cobrador> cobradorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cobradors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Cobrador cobrador : cobradorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobradorConstantesFunciones.getCobradorDescripcion(cobrador));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.gettipoidentificacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobradorConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobradorConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrador.gettelefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobradors(String sAccionBusqueda,String sTipoArchivoReporte,List<Cobrador> cobradorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Cobrador> cobradorsRespaldo=null;
		
		classes=CobradorConstantesFunciones.getClassesRelationshipsOfCobrador(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobradorLogic.setDatosCliente(this.datosCliente);
		this.cobradorLogic.setDatosDeep(this.datosDeep);
		this.cobradorLogic.setIsConDeep(true);
		
		cobradorsRespaldo=this.cobradorLogic.getCobradors();
		
		this.cobradorLogic.setCobradors(cobradorsParaReportes);	
		this.cobradorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobradorsParaReportes=this.cobradorLogic.getCobradors();
		this.cobradorLogic.setCobradors(cobradorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cobradors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrador("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Cobrador cobrador : cobradorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrador("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobradorConstantesFunciones.generarExcelReporteDataCobrador("NORMAL",row,workbook,cobrador,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobradorConstantesFunciones.getCobradorDescripcion(cobrador));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrador.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrador.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrador() throws Exception {		
		this.startProcessCobrador(true);
	}
	
	public void startProcessCobrador(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrador ,this.jPanelParametrosReportesCobrador, this.jScrollPanelDatosCobrador,this.jPanelPaginacionCobrador, this.jScrollPanelDatosEdicionCobrador, this.jPanelAccionesCobrador,this.jPanelAccionesFormularioCobrador,this.jmenuBarCobrador,this.jmenuBarDetalleCobrador,this.jTtoolBarCobrador,this.jTtoolBarDetalleCobrador);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrador=this.jTabbedPaneBusquedasCobrador; 
		
		final JPanel jPanelParametrosReportesCobrador=this.jPanelParametrosReportesCobrador;
		//final JScrollPane jScrollPanelDatosCobrador=this.jScrollPanelDatosCobrador;
		final JTable jTableDatosCobrador=this.jTableDatosCobrador;		
		final JPanel jPanelPaginacionCobrador=this.jPanelPaginacionCobrador;
		//final JScrollPane jScrollPanelDatosEdicionCobrador=this.jScrollPanelDatosEdicionCobrador;
		final JPanel jPanelAccionesCobrador=this.jPanelAccionesCobrador;
		
		JPanel jPanelCamposAuxiliarCobrador=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrador=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			jPanelCamposAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jPanelCamposCobrador;
			jPanelAccionesFormularioAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jPanelAccionesFormularioCobrador;
		}
		
		final JPanel jPanelCamposCobrador=jPanelCamposAuxiliarCobrador;
		final JPanel jPanelAccionesFormularioCobrador=jPanelAccionesFormularioAuxiliarCobrador;
		
		
		final JMenuBar jmenuBarCobrador=this.jmenuBarCobrador;
		final JToolBar jTtoolBarCobrador=this.jTtoolBarCobrador;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrador=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrador=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			jmenuBarDetalleAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jmenuBarDetalleCobrador;
			jTtoolBarDetalleAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jTtoolBarDetalleCobrador;
		}
		
		final JMenuBar jmenuBarDetalleCobrador=jmenuBarDetalleAuxiliarCobrador;
		final JToolBar jTtoolBarDetalleCobrador=jTtoolBarDetalleAuxiliarCobrador;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrador;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrador;
			processRunnable.jTableDatos=jTableDatosCobrador;
			processRunnable.jPanelCampos=jPanelCamposCobrador;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrador;
			processRunnable.jPanelAcciones=jPanelAccionesCobrador;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrador;
			
			
			processRunnable.jmenuBar=jmenuBarCobrador;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrador;
			processRunnable.jTtoolBar=jTtoolBarCobrador;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrador;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrador ,jPanelParametrosReportesCobrador,jTableDatosCobrador, /*jScrollPanelDatosCobrador,*/jPanelCamposCobrador,jPanelPaginacionCobrador, /*jScrollPanelDatosEdicionCobrador,*/ jPanelAccionesCobrador,jPanelAccionesFormularioCobrador,jmenuBarCobrador,jmenuBarDetalleCobrador,jTtoolBarCobrador,jTtoolBarDetalleCobrador);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrador ,jPanelParametrosReportesCobrador, jScrollPanelDatosCobrador,jPanelPaginacionCobrador, jScrollPanelDatosEdicionCobrador, jPanelAccionesCobrador,jPanelAccionesFormularioCobrador,jmenuBarCobrador,jmenuBarDetalleCobrador,jTtoolBarCobrador,jTtoolBarDetalleCobrador);
						
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
	
	public void finishProcessCobrador() {// throws Exception 
		this.finishProcessCobrador(true);
	}
	
	public void finishProcessCobrador(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrador ,this.jPanelParametrosReportesCobrador, this.jScrollPanelDatosCobrador,this.jPanelPaginacionCobrador, this.jScrollPanelDatosEdicionCobrador, this.jPanelAccionesCobrador,this.jPanelAccionesFormularioCobrador,this.jmenuBarCobrador,this.jmenuBarDetalleCobrador,this.jTtoolBarCobrador,this.jTtoolBarDetalleCobrador);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrador=this.jTabbedPaneBusquedasCobrador; 
		
		final JPanel jPanelParametrosReportesCobrador=this.jPanelParametrosReportesCobrador;
		//final JScrollPane jScrollPanelDatosCobrador=this.jScrollPanelDatosCobrador;
		final JTable jTableDatosCobrador=this.jTableDatosCobrador;		
		final JPanel jPanelPaginacionCobrador=this.jPanelPaginacionCobrador;
		//final JScrollPane jScrollPanelDatosEdicionCobrador=this.jScrollPanelDatosEdicionCobrador;
		final JPanel jPanelAccionesCobrador=this.jPanelAccionesCobrador;
		
		JPanel jPanelCamposAuxiliarCobrador=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrador=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			jPanelCamposAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jPanelCamposCobrador;
			jPanelAccionesFormularioAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jPanelAccionesFormularioCobrador;
		}
		
		final JPanel jPanelCamposCobrador=jPanelCamposAuxiliarCobrador;
		final JPanel jPanelAccionesFormularioCobrador=jPanelAccionesFormularioAuxiliarCobrador;
		
		
		final JMenuBar jmenuBarCobrador=this.jmenuBarCobrador;		
		final JToolBar jTtoolBarCobrador=this.jTtoolBarCobrador;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrador=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrador=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			jmenuBarDetalleAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jmenuBarDetalleCobrador;
			jTtoolBarDetalleAuxiliarCobrador=this.jInternalFrameDetalleFormCobrador.jTtoolBarDetalleCobrador;		
		}
		
		final JMenuBar jmenuBarDetalleCobrador=jmenuBarDetalleAuxiliarCobrador;
		final JToolBar jTtoolBarDetalleCobrador=jTtoolBarDetalleAuxiliarCobrador;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrador;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrador;
			processRunnable.jTableDatos=jTableDatosCobrador;
			processRunnable.jPanelCampos=jPanelCamposCobrador;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrador;
			processRunnable.jPanelAcciones=jPanelAccionesCobrador;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrador;
			
			
			processRunnable.jmenuBar=jmenuBarCobrador;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrador;
			processRunnable.jTtoolBar=jTtoolBarCobrador;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrador;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrador ,jPanelParametrosReportesCobrador, jTableDatosCobrador,/*jScrollPanelDatosCobrador,*/jPanelCamposCobrador,jPanelPaginacionCobrador, /*jScrollPanelDatosEdicionCobrador,*/ jPanelAccionesCobrador,jPanelAccionesFormularioCobrador,jmenuBarCobrador,jmenuBarDetalleCobrador,jTtoolBarCobrador,jTtoolBarDetalleCobrador));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrador(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrador(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrador(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrador(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrador,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrador,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrador(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrador,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrador,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobradorConstantesFunciones.getsFinalQueryCobrador();
		String  finalQueryPaginacionTodos=this.cobradorConstantesFunciones.getsFinalQueryCobrador();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobradorConstantesFunciones.getArrayColumnasGlobalesNoCobrador(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobradorConstantesFunciones.getArrayColumnasGlobalesCobrador(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobradorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobradorsEliminados= new ArrayList<Cobrador>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrador();
		
				///*CobradorSessionBean*/this.cobradorSessionBean=new CobradorSessionBean();
			
			if(this.cobradorSessionBean==null) {
				this.cobradorSessionBean=new CobradorSessionBean();
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
					this.iNumeroPaginacion=CobradorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobradorConstantesFunciones.getClassesForeignKeysOfCobrador(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrador."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobradorsAux= new ArrayList<Cobrador>();
			
				
			cobradorLogic.setDatosCliente(this.datosCliente);
			cobradorLogic.setDatosDeep(this.datosDeep);
			cobradorLogic.setIsConDeep(true);
			
			
			cobradorLogic.getCobradorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cobradorLogic.getTodosCobradors(finalQueryGlobal,pagination);
					
					//cobradorLogic.getTodosCobradorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cobradorLogic.getCobradors()==null|| cobradorLogic.getCobradors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cobradorsAux= new ArrayList<Cobrador>();
							cobradorsAux.addAll(cobradorLogic.getCobradors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobradorsAux= new ArrayList<Cobrador>();
							cobradorsAux.addAll(cobradors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cobradorLogic.getTodosCobradors(finalQueryGlobal+"",this.pagination);												
							
							//cobradorLogic.getTodosCobradorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCobradors("Todos",cobradorLogic.getCobradors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cobradorLogic.setCobradors(new ArrayList<Cobrador>());					
							cobradorLogic.getCobradors().addAll(cobradorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobradors=new ArrayList<Cobrador>();
							cobradors.addAll(cobradorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCobrador=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCobrador=this.idActual;
				
				} else if(this.idCobradorActual!=null && this.idCobradorActual!=0L) {
					idCobrador=idCobradorActual;
				}
				
					
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndicePorId(idCobrador);
				
				this.cobradors=new ArrayList<Cobrador>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cobradorLogic.getEntity(idCobrador);
					
					//cobradorLogic.getEntityWithConnection(idCobrador);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobradorLogic.setCobradors(new ArrayList<Cobrador>());
					cobradorLogic.getCobradors().add(cobradorLogic.getCobrador());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobradors=new ArrayList<Cobrador>();
					this.cobradors.add(cobrador);
				}
				
				if(cobradorLogic.getCobrador()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdTipoIdentificacion")) {
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndiceFK_IdTipoIdentificacion(id_tipo_identificacionFK_IdTipoIdentificacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobradorLogic.getCobradorsFK_IdTipoIdentificacion(finalQueryGlobal,pagination,id_tipo_identificacionFK_IdTipoIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndiceFK_IdTipoIdentificacion(id_tipo_identificacionFK_IdTipoIdentificacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndiceFK_IdTipoIdentificacion(id_tipo_identificacionFK_IdTipoIdentificacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobradorLogic.getCobradors()==null||cobradorLogic.getCobradors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobradors==null|| cobradors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorsAux=new ArrayList<Cobrador>();
						cobradorsAux.addAll(cobradorLogic.getCobradors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobradorsAux=new ArrayList<Cobrador>();
							cobradorsAux.addAll(cobradors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobradorLogic.getCobradorsFK_IdTipoIdentificacion(finalQueryGlobal,pagination,id_tipo_identificacionFK_IdTipoIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndiceFK_IdTipoIdentificacion(id_tipo_identificacionFK_IdTipoIdentificacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobradorConstantesFunciones.getDetalleIndiceFK_IdTipoIdentificacion(id_tipo_identificacionFK_IdTipoIdentificacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobradors("FK_IdTipoIdentificacion",cobradorLogic.getCobradors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobradors("FK_IdTipoIdentificacion",cobradors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorLogic.setCobradors(new ArrayList<Cobrador>());
						cobradorLogic.getCobradors().addAll(cobradorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobradors=new ArrayList<Cobrador>();
							cobradors.addAll(cobradorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrador();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrador();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobradorLogic.getCobradors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobradors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobradorLogic.getCobradors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobradors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Cobrador cobrador) {
		Boolean permite=true;
		
		if(this.cobrador.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobradorConstantesFunciones.getOrderByListaCobrador();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobradorConstantesFunciones.getOrderByListaCobrador();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cobrador cobrador:cobradorLogic.getCobradors()) {
				if(cobrador.getsType().equals(Constantes2.S_TOTALES)) {
					cobradorTotales=cobrador;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cobrador cobrador:this.cobradors) {
				if(cobrador.getsType().equals(Constantes2.S_TOTALES)) {
					cobradorTotales=cobrador;
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
			this.cobradorAux=new Cobrador();
			this.cobradorAux.setsType(Constantes2.S_TOTALES);
			this.cobradorAux.setIsNew(false);
			this.cobradorAux.setIsChanged(false);
			this.cobradorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CobradorConstantesFunciones.TotalizarValoresFilaCobrador(this.cobradorLogic.getCobradors(),this.cobradorAux);
				
				this.cobradorLogic.getCobradors().add(this.cobradorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobradorConstantesFunciones.TotalizarValoresFilaCobrador(this.cobradors,this.cobradorAux);
				
				this.cobradors.add(this.cobradorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobradorTotales=new Cobrador();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobradorLogic.getCobradors().remove(cobradorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobradors.remove(cobradorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobradorTotales=new Cobrador();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cobrador cobrador:cobradorLogic.getCobradors()) {
				if(cobrador.getsType().equals(Constantes2.S_TOTALES)) {
					cobradorTotales=cobrador;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobradorConstantesFunciones.TotalizarValoresFilaCobrador(this.cobradorLogic.getCobradors(),cobradorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cobrador cobrador:this.cobradors) {
				if(cobrador.getsType().equals(Constantes2.S_TOTALES)) {
					cobradorTotales=cobrador;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobradorConstantesFunciones.TotalizarValoresFilaCobrador(this.cobradors,cobradorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobradorsFK_IdTipoIdentificacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIdentificacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobradorsFK_IdTipoIdentificacion(String sFinalQuery,Long id_tipo_identificacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobradorLogic.getCobradorsFK_IdTipoIdentificacion(sFinalQuery,this.pagination,id_tipo_identificacion);
				
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
	
	public void inicializarPermisosCobrador() {
		this.isPermisoTodoCobrador=false;
		this.isPermisoNuevoCobrador=false;
		this.isPermisoActualizarCobrador=false;
		this.isPermisoActualizarOriginalCobrador=false;
		this.isPermisoEliminarCobrador=false;
		this.isPermisoGuardarCambiosCobrador=false;
		this.isPermisoConsultaCobrador=false;
		this.isPermisoBusquedaCobrador=false;
		this.isPermisoReporteCobrador=false;		
		this.isPermisoOrdenCobrador=false;		
		this.isPermisoPaginacionMedioCobrador=false;		
		this.isPermisoPaginacionAltoCobrador=false;
		this.isPermisoPaginacionTodoCobrador=false;
		this.isPermisoCopiarCobrador=false;		
		this.isPermisoVerFormCobrador=false;		
		this.isPermisoDuplicarCobrador=false;		
		this.isPermisoOrdenCobrador=false;		
	}
	
	public void setPermisosUsuarioCobrador(Boolean isPermiso) {
		this.isPermisoTodoCobrador=isPermiso;
		this.isPermisoNuevoCobrador=isPermiso;
		this.isPermisoActualizarCobrador=isPermiso;
		this.isPermisoActualizarOriginalCobrador=isPermiso;
		this.isPermisoEliminarCobrador=isPermiso;
		this.isPermisoGuardarCambiosCobrador=isPermiso;
		this.isPermisoConsultaCobrador=isPermiso;
		this.isPermisoBusquedaCobrador=isPermiso;
		this.isPermisoReporteCobrador=isPermiso;
		this.isPermisoOrdenCobrador=isPermiso;		
		this.isPermisoPaginacionMedioCobrador=isPermiso;		
		this.isPermisoPaginacionAltoCobrador=isPermiso;		
		this.isPermisoPaginacionTodoCobrador=isPermiso;		
		this.isPermisoCopiarCobrador=isPermiso;		
		this.isPermisoVerFormCobrador=isPermiso;		
		this.isPermisoDuplicarCobrador=isPermiso;
		this.isPermisoOrdenCobrador=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrador(Boolean isPermiso) {
		//this.isPermisoTodoCobrador=isPermiso;
		this.isPermisoNuevoCobrador=isPermiso;
		this.isPermisoActualizarCobrador=isPermiso;
		this.isPermisoActualizarOriginalCobrador=isPermiso;
		this.isPermisoEliminarCobrador=isPermiso;
		this.isPermisoGuardarCambiosCobrador=isPermiso;
		//this.isPermisoConsultaCobrador=isPermiso;
		//this.isPermisoBusquedaCobrador=isPermiso;
		//this.isPermisoReporteCobrador=isPermiso;
		//this.isPermisoOrdenCobrador=isPermiso;		
		//this.isPermisoPaginacionMedioCobrador=isPermiso;		
		//this.isPermisoPaginacionAltoCobrador=isPermiso;		
		//this.isPermisoPaginacionTodoCobrador=isPermiso;		
		//this.isPermisoCopiarCobrador=isPermiso;		
		//this.isPermisoDuplicarCobrador=isPermiso;
		//this.isPermisoOrdenCobrador=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobradorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobradorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrador(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobradorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobradorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobradorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobradorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrador() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobradorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobradorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrador=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrador=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrador=this.isPermisoActualizarCobrador;
			this.isPermisoEliminarCobrador=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrador=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrador=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrador=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrador=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrador=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrador=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrador=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrador=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrador=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrador=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrador=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrador=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrador=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrador.setToolTipText(this.jTableDatosCobrador.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrador(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrador(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobradorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobradorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrador() throws Exception {
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
	public void inicializarCombosForeignKeyCobradorListas()throws Exception {
		try	{						
			
				this.tipoidentificacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobradorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobradorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCobradorListas(false);
			} else {
			
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCobradorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CobradorParameterReturnGeneral cobradorReturnGeneral=new CobradorParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoIdentificacion="";

				if(((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0) && this.cobradorConstantesFunciones.cargarid_tipo_identificacionCobrador)
					 || (this.esRecargarFks && this.cobradorConstantesFunciones.cargarid_tipo_identificacionCobrador)) {

					if(!this.cobradorSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIdentificacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIdentificacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIdentificacion, "");
						finalQueryGlobalTipoIdentificacion+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIdentificacion=" WHERE " + ConstantesSql.ID + "="+cobradorSessionBean.getlidTipoIdentificacionActual();
					}
				} else {
					finalQueryGlobalTipoIdentificacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cobradorReturnGeneral=cobradorLogic.cargarCombosLoteForeignKeyCobrador(finalQueryGlobalTipoIdentificacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoIdentificacion.equals("NONE")) {
				this.tipoidentificacionsForeignKey=cobradorReturnGeneral.gettipoidentificacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCobrador()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoIdentificacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoIdentificacion()throws Exception {
		try {
			if(this.cobradorSessionBean==null) {
				this.cobradorSessionBean=new CobradorSessionBean();
			}

			if(!this.cobradorSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				TipoIdentificacion tipoidentificacion=new TipoIdentificacion();
				TipoIdentificacionConstantesFunciones.setTipoIdentificacionDescripcion(tipoidentificacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoidentificacion.setId(null);

				if(!TipoIdentificacionConstantesFunciones.ExisteEnLista(this.tipoidentificacionsForeignKey,tipoidentificacion,true)) {

					this.tipoidentificacionsForeignKey.add(0,tipoidentificacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCobrador()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrador(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrador()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrador();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrador(Cobrador cobrador)throws Exception {	
		try {
			
			this.setActualTipoIdentificacionForeignKey(cobrador.getid_tipo_identificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrador(Cobrador cobrador,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrador()throws Exception {	
		try {
			
			this.setActualTipoIdentificacionForeignKey(this.cobradorConstantesFunciones.getid_tipo_identificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrador()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrador()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrador()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrador()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrador()throws Exception {
		try {
			

			this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrador(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrador()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador!=null && this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobradorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobradorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobradorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobradorSessionBean=new CobradorSessionBean(); 
		this.cobradorConstantesFunciones=new CobradorConstantesFunciones(); 
		this.cobradorBean=new Cobrador();//(this.cobradorConstantesFunciones); 		
		this.cobradorReturnGeneral=new CobradorParameterReturnGeneral(); 
		
		this.cobradorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobradorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobradorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobradorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobradorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrador(true);
			
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
			
			this.cobradorConstantesFunciones=new CobradorConstantesFunciones(); 
			this.cobradorBean=new Cobrador();//this.cobradorConstantesFunciones); 			
			this.cobradorReturnGeneral=new CobradorParameterReturnGeneral(); 
		
			CobradorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrador Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrador=new Cobrador();
			this.cobradors = new ArrayList<Cobrador>();
			this.cobradorsAux = new ArrayList<Cobrador>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic=new CobradorLogic();
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			//this.cobradorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobradorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrador);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrador);	
					}
					
					if(this.jInternalFrameImportacionCobrador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrador);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrador!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrador);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrador!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrador);
				this.jInternalFrameDetalleFormCobrador.setVisible(false);
				this.jInternalFrameDetalleFormCobrador.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrador!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrador);
					this.jInternalFrameReporteDinamicoCobrador.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrador.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrador!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrador);
					this.jInternalFrameImportacionCobrador.setVisible(false);
					this.jInternalFrameImportacionCobrador.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrador!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrador);
					this.jInternalFrameOrderByCobrador.setVisible(false);
					this.jInternalFrameOrderByCobrador.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobradorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobradorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobradorReturnGeneral=new CobradorParameterReturnGeneral();
			
			this.cobradorParameterGeneral=new CobradorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobradorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobradorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobradorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobradorSessionBean.getEsGuardarRelacionado(),this.cobradorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobradorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobradorSessionBean.getEsGuardarRelacionado(),this.cobradorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaDuplicarCobrador=true;
			this.isVisibilidadCeldaCopiarCobrador=true;
			this.isVisibilidadCeldaVerFormCobrador=true;
			this.isVisibilidadCeldaOrdenCobrador=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=false;
			this.isVisibilidadCeldaGuardarCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			
			
			this.isVisibilidadFK_IdTipoIdentificacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrador();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrador(false);
			
			this.setPermisosUsuarioCobrador();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobradorSessionBean.getEsGuardarRelacionado() 
				|| (this.cobradorSessionBean.getEsGuardarRelacionado() && this.cobradorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobradorClasesRelacionadas();
			}
			
			if(this.cobradorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobradorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobradorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrador();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrador();
			}
			
			if(!this.isPermisoBusquedaCobrador) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrador.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCobrador,this.isPermisoPaginacionMedioCobrador,this.isPermisoPaginacionTodoCobrador);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobradorConstantesFunciones.getTiposSeleccionarCobrador());
				
				this.tiposColumnasSelect=CobradorConstantesFunciones.getTiposSeleccionarCobrador(true);
				
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
			//if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrador();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCobrador(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCobrador(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrador() ;
			
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
			
			this.tipoidentificacionLogic=new TipoIdentificacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobradorImplementable= (CobradorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobradorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobradorImplementableHome= (CobradorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobradorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobradors= new ArrayList<Cobrador>();
			this.cobradorsEliminados= new ArrayList<Cobrador>();
						
			this.isEsNuevoCobrador=false;
			this.esParaAccionDesdeFormularioCobrador=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrador(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrador();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobradorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobradorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrador("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrador(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrador!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrador();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrador();
			}
			
			CobradorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrador.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrador.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrador.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrador(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Cobrador: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrador() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrador")) {
				iIndex=this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrador.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrador();	
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
	
	public void cargarCombosForeignKeyCobrador(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrador(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrador(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobradorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrador();
		
		this.cargarCombosFrameForeignKeyCobrador();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrador();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrador();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIdentificacion(this.tipoidentificacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCobradorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobradorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			
			if(jTableDatosCobrador.getRowCount()>=1) {
				jTableDatosCobrador.removeRowSelectionInterval(0, jTableDatosCobrador.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrador=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrador(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrador(true);			
			//this.cobrador=new Cobrador();
			//this.cobrador.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrador(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrador() ;
			
			if(CobradorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrador(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrador);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrador);				
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			if(this.cobradorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Cobrador: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobradorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrador.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrador.getSelectedRows().length;			
			}
			
			cobradorsSeleccionados=this.getCobradorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrador--;			
				//Cobrador cobradorAux= new Cobrador();			
				//cobradorAux.setId(this.iIdNuevoCobrador);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Cobrador cobradorOrigen=new Cobrador();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Cobrador cobradorOrigen : cobradorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobradorOrigen =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobradorOrigen =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrador();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrador.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrador(cobradorOrigen,this.cobrador,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobradorLogic.getCobradors().add(this.cobradorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobradors.add(this.cobradorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrador(false);
				
				this.jTableDatosCobrador.setRowSelectionInterval(this.getIndiceNuevoCobrador(), this.getIndiceNuevoCobrador());
				
				int iLastRow =  this.jTableDatosCobrador.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrador.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrador.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrador(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();									
		
			Cobrador cobradorOrigen=new Cobrador();
			Cobrador cobradorDestino=new Cobrador();
				
			cobradorsSeleccionados=this.getCobradorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrador.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobradorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrador.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorOrigen =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobradorOrigen =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobradorDestino =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobradorDestino =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobradorOrigen =cobradorsSeleccionados.get(0);
				cobradorDestino =cobradorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrador(cobradorOrigen,cobradorDestino,true,false);
				
				cobradorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobradorDestino,cobradorLogic.getCobradors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobradorDestino,cobradors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrador(false);
				
				//this.jTableDatosCobrador.setRowSelectionInterval(this.getIndiceNuevoCobrador(), this.getIndiceNuevoCobrador());
				
				int iLastRow =  this.jTableDatosCobrador.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrador.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrador.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrador(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrador.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrador.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrador.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrador.setVisible(!isVisible);
			this.jPanelPaginacionCobrador.setVisible(!isVisible);
			this.jPanelAccionesCobrador.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrador();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrador();
			
			this.abrirFrameOrderByCobrador();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrador();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrador(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrador);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrador.isMaximum()) {
					this.jInternalFrameDetalleFormCobrador.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrador.setSize(this.jInternalFrameDetalleFormCobrador.iWidthFormulario,this.jInternalFrameDetalleFormCobrador.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrador.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrador.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrador.isMaximum()) {
						this.jInternalFrameDetalleFormCobrador.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrador.jContentPaneDetalleCobrador.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrador.jContentPaneDetalleCobrador.getWidth(),CobradorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrador.jContentPaneDetalleCobrador.getWidth(),CobradorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrador.jContentPaneDetalleCobrador.getWidth(),CobradorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrador.setVisible(true);
	        this.jInternalFrameDetalleFormCobrador.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrador() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrador==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrador,false,this);
				} else {
					this.jInternalFrameOrderByCobrador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrador,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrador);
				this.jInternalFrameOrderByCobrador.setVisible(false);
				this.jInternalFrameOrderByCobrador.setSelected(false);
				
				this.jInternalFrameOrderByCobrador.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrador"));
				
				this.inicializarActualizarBindingTablaOrderByCobrador();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrador() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrador==null) {
				
				this.jInternalFrameImportacionCobrador=new ImportacionJInternalFrame(CobradorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrador);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrador);
				this.jInternalFrameImportacionCobrador.setVisible(false);
				this.jInternalFrameImportacionCobrador.setSelected(false);


				this.jInternalFrameImportacionCobrador.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrador"));
				this.jInternalFrameImportacionCobrador.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrador"));
				this.jInternalFrameImportacionCobrador.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrador"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrador() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrador==null) {
				this.jInternalFrameReporteDinamicoCobrador=new ReporteDinamicoJInternalFrame(CobradorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrador);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrador);
				this.jInternalFrameReporteDinamicoCobrador.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrador.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrador.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrador"));
				this.jInternalFrameReporteDinamicoCobrador.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrador"));
				this.jInternalFrameReporteDinamicoCobrador.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrador"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrador();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrador() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrador);
			
	       	this.jInternalFrameDetalleFormCobrador.setVisible(false);
	        this.jInternalFrameDetalleFormCobrador.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrador.dispose();
			//this.jInternalFrameDetalleFormCobrador=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrador() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrador.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrador() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrador.setVisible(true);
	        this.jInternalFrameImportacionCobrador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrador() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrador.setVisible(true);
	        this.jInternalFrameOrderByCobrador.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrador() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrador.setVisible(false);
	        this.jInternalFrameOrderByCobrador.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrador() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrador.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrador.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrador() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrador.setVisible(false);
	        this.jInternalFrameImportacionCobrador.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrador(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrador(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrador(true);
			//this.isEsNuevoCobrador=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrador(false) ;
			
			if(cobradorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobradorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrador(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrador(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobradorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrador(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrador(true);
			//this.isEsNuevoCobrador=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrador.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrador("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrador(false) ;
			
			if(CobradorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrador(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrador(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoIdentificacion(List<TipoIdentificacion> tipoidentificacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoIdentificacion=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));
		TableCellEditor tableCellEditorTipoIdentificacion =tableColumnTipoIdentificacion.getCellEditor();

		TipoIdentificacionTableCell tipoidentificacionTableCellFk=(TipoIdentificacionTableCell)tableCellEditorTipoIdentificacion;

		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.settipoidentificacionsForeignKey(tipoidentificacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrador.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoidentificacionTableCellFk.setRowActual(intSelectedRow);
			//tipoidentificacionTableCellFk.settipoidentificacionsForeignKeyActual(tipoidentificacionsForeignKey);
		//}


		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.RecargarTipoIdentificacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrador(false);
			
			//if(!this.isEsNuevoCobrador) {								
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				
			}
			
			if(this.permiteMantenimiento(this.cobrador)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobradorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrador=true;
					this.inicializarActualizarBindingTablaCobrador(false);
					this.isEsNuevoCobrador=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrador=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrador=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrador(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrador(false);
				
				this.habilitarDeshabilitarControlesCobrador(false);
			
												
				
				if(CobradorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrador();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobradorActionPerformed(evt,cobradorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrador(this.cobrador,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrador.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobradorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrador.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobradorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				this.cobrador.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				this.cobrador.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrador)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobradorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobradorModel) this.jTableDatosCobrador.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrador=true;
				this.inicializarActualizarBindingTablaCobrador(false);
				this.isEsNuevoCobrador=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrador(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrador(false);
				
				this.habilitarDeshabilitarControlesCobrador(false);
				
				
				
				if(CobradorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrador();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobradorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrador.getRowCount()>=1) {
				jTableDatosCobrador.removeRowSelectionInterval(0, jTableDatosCobrador.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrador(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrador(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrador(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrador(false) ;
			
			this.isEsNuevoCobrador=false;
			
			if(CobradorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrador();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrador(false);
				
				//SI ES MANUAL
				if(CobradorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrador();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrador--;			
			//Cobrador cobradorAux= new Cobrador();			
			//cobradorAux.setId(this.iIdNuevoCobrador);
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrador();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
			
			this.cobrador.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobradorLogic.getCobradors().add(this.cobradorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobradors.add(this.cobradorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrador(false);
			
			this.jTableDatosCobrador.setRowSelectionInterval(this.getIndiceNuevoCobrador(), this.getIndiceNuevoCobrador());
			
			int iLastRow =  this.jTableDatosCobrador.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrador.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrador.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrador(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrador(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrador(false);
			
			//SI ES MANUAL
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrador();
			}
			
			//this.abrirFrameTreeCobrador();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobradorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CobradorES ?", "MANTENIMIENTO DE Cobrador", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCobrador.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCobrador();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cobradorReturnGeneral=cobradorLogic.procesarImportacionCobradorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cobradorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCobradorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobradorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrador.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrador.setFileImportacion(this.jInternalFrameImportacionCobrador.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrador.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrador.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrador.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrador.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		

		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobradorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobradorBaseDesign.jrxml";
			
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
			
			this.generarReporteCobradors("Todos",cobradorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIdentificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIdentificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIdentificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIdentificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobradorConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobradorConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobradorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobradorConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobradorConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrador.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoria="id_tipo_identificacion";
					break;

				case CobradorConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case CobradorConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CobradorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobradorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case CobradorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoriaValor="id_tipo_identificacion";
					break;

				case CobradorConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case CobradorConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CobradorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobradorConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case CobradorConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrador.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrador.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_identificacion");
					break;

				case CobradorConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case CobradorConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CobradorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobradorConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case CobradorConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobradorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Cobradors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.gettipoidentificacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobradorConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobradorConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobradorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobradorConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobradorConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobradorConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Cobrador cobrador:cobradorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrador.gettelefono());
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
			//	this.getFilaCabeceraExportarExcelCobrador(row);				
			//	iRow++;
			//}				
			
			//for(Cobrador cobradorAux:cobradorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrador(cobradorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrador(false);
			
			//SI ES MANUAL
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrador();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrador(false);
			
			//SI ES MANUAL
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrador();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobradorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrador(false);
			
			//SI ES MANUAL
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrador();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrador() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrador.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrador.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrador.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrador.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrador.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrador.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrador.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrador(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrador(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrador(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrador(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrador(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrador(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrador(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrador(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobradorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobradorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrador() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrador();
		
		this.inicializarActualizarBindingBotonesManualCobrador(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrador();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrador() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrador(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrador(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrador.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrador.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrador.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrador!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionNuevoCobrador.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionSinCerrarCobrador.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionSinMensajeCobrador.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrador.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrador.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrador.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrador!=null) {
				this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionNuevoCobrador.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionSinCerrarCobrador.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrador.jCheckBoxPostAccionSinMensajeCobrador.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrador.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrador.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrador.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrador!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrador.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrador.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrador.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrador.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrador!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrador.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrador.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrador(Boolean esInicializar) throws Exception {
		try	{	
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrador(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrador() throws Exception {
		try	{
			if(CobradorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrador();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrador() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrador() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrador.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrador.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrador.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrador.addItem(reporte);
			}
			
			
			if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrador.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrador.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrador.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrador.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrador.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrador.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrador.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrador();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrador() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrador!=null) {
				this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrador!=null) {
				this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrador.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrador!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrador.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrador.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrador.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrador.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrador()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.getSelectedItem()!=null){this.id_tipo_identificacionFK_IdTipoIdentificacion=((TipoIdentificacion)this.jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrador(Boolean esInicializar) throws Exception {				
		if(CobradorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrador();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrador() throws Exception {
		this.inicializarActualizarBindingTablaCobrador(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrador() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobradorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobradorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrador(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobradorLogic.getCobradors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobradors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrador.setModel(new CobradorModel(this.cobradorLogic.getCobradors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrador.setModel(new CobradorModel(this.cobradors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrador!=null && this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrador();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobradorConstantesFunciones.SCLASSWEBTITULO,cobradorConstantesFunciones.resaltarSeleccionarCobrador,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobradorConstantesFunciones.SCLASSWEBTITULO,cobradorConstantesFunciones.resaltarSeleccionarCobrador,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_ID));

		if(this.cobradorConstantesFunciones.mostraridCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobradorConstantesFunciones.resaltaridCobrador,this.cobradorConstantesFunciones.activaridCobrador,this,true,"idCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltaridCobrador,this.cobradorConstantesFunciones.activaridCobrador,this,true,"idCobrador","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));

		if(this.cobradorConstantesFunciones.mostrarid_tipo_identificacionCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.cobradorConstantesFunciones.resaltarid_tipo_identificacionCobrador,this,this.cobradorConstantesFunciones.activarid_tipo_identificacionCobrador));
			tableColumn.setCellEditor(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.cobradorConstantesFunciones.resaltarid_tipo_identificacionCobrador,this,this.cobradorConstantesFunciones.activarid_tipo_identificacionCobrador,true,"id_tipo_identificacionCobrador","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.cobradorConstantesFunciones.mostraridentificacionCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobradorConstantesFunciones.resaltaridentificacionCobrador,this.cobradorConstantesFunciones.activaridentificacionCobrador,this,true,"identificacionCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltaridentificacionCobrador,this.cobradorConstantesFunciones.activaridentificacionCobrador,this,true,"identificacionCobrador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_APELLIDO));

		if(this.cobradorConstantesFunciones.mostrarapellidoCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobradorConstantesFunciones.resaltarapellidoCobrador,this.cobradorConstantesFunciones.activarapellidoCobrador,this,true,"apellidoCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltarapellidoCobrador,this.cobradorConstantesFunciones.activarapellidoCobrador,this,true,"apellidoCobrador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_NOMBRE));

		if(this.cobradorConstantesFunciones.mostrarnombreCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobradorConstantesFunciones.resaltarnombreCobrador,this.cobradorConstantesFunciones.activarnombreCobrador,this,true,"nombreCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltarnombreCobrador,this.cobradorConstantesFunciones.activarnombreCobrador,this,true,"nombreCobrador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_DIRECCION));

		if(this.cobradorConstantesFunciones.mostrardireccionCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobradorConstantesFunciones.resaltardireccionCobrador,this.cobradorConstantesFunciones.activardireccionCobrador,this,true,"direccionCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltardireccionCobrador,this.cobradorConstantesFunciones.activardireccionCobrador,this,true,"direccionCobrador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrador,CobradorConstantesFunciones.LABEL_TELEFONO));

		if(this.cobradorConstantesFunciones.mostrartelefonoCobrador && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobradorConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobradorConstantesFunciones.resaltartelefonoCobrador,this.cobradorConstantesFunciones.activartelefonoCobrador,this,true,"telefonoCobrador","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobradorConstantesFunciones.resaltartelefonoCobrador,this.cobradorConstantesFunciones.activartelefonoCobrador,this,true,"telefonoCobrador","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobradorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobradorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobradorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrador.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobradorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobradorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrador.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrador && this.isPermisoGuardarCambiosCobrador) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobradorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobradorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrador.addColumn(tableColumn);
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
			
			this.jTableDatosCobrador.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrador && this.isPermisoGuardarCambiosCobrador) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrador && this.isPermisoGuardarCambiosCobrador) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrador.moveColumn(this.jTableDatosCobrador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrador.moveColumn(this.jTableDatosCobrador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrador.moveColumn(this.jTableDatosCobrador.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrador.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrador.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrador,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrador.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrador.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrador.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrador.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrador.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cobradorLogic.getCobradors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobradors.size()-1;
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
		//this.jTableDatosCobrador.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrador.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrador();
			
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
				
				//this.isEsNuevoCobrador=false;
					
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
				if(this.cobradorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrador==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrador.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrador.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrador.getsType().equals("DUPLICADO")
				   || this.cobrador.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrador=true;
				
				} else {
					this.isEsNuevoCobrador=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrador.getId()>=0 && !this.cobrador.getIsNew()) {						
						this.isEsNuevoCobrador=false;
						
					} else {
						this.isEsNuevoCobrador=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrador(esRelaciones);						
				
				this.seleccionarCobrador(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrador.getId()<0) {
					this.isEsNuevoCobrador=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrador(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrador(evt,rowIndex);
				}	
				
				if(this.cobradorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Cobrador: " + this.dDif); 
					}
				}								
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrador(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrador)) {
					if(this.cobrador.getId()>0) {
						this.cobrador.setIsDeleted(true);
						
						this.cobradorsEliminados.add(this.cobrador);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobradorLogic.getCobradors().remove(this.cobrador);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobradors.remove(this.cobrador);				
					}
					
					
					((CobradorModel) this.jTableDatosCobrador.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrador(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrador(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrador) {
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrador.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrador.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrador(this.cobrador);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoIdentificacion
					if(!this.cobradorConstantesFunciones.cargarid_tipo_identificacionCobrador || this.cobradorConstantesFunciones.event_dependid_tipo_identificacionCobrador) {
						//this.cargarCombosTipoIdentificacionsForeignKeyLista(" where id="+this.cobrador.getid_tipo_identificacion());
									//this.inicializarActualizarBindingCobrador(false,false);
						this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

						if(cobrador.getTipoIdentificacion()!=null) {
							this.tipoidentificacionsForeignKey.add(cobrador.getTipoIdentificacion());
						}

						this.addItemDefectoCombosForeignKeyTipoIdentificacion();
						this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");
					}
					this.setActualTipoIdentificacionForeignKey(this.cobrador.getid_tipo_identificacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrador("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrador(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrador() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrador(Cobrador cobrador) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrador(cobrador,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrador(Cobrador cobrador,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrador(cobrador);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrador(cobrador,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrador(cobrador);
	}
	
	public void setVariablesObjetoActualToFormularioCobrador(Cobrador cobrador) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setText(cobrador.getId().toString());
			this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setText(cobrador.getidentificacion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setText(cobrador.getapellido());
			this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setText(cobrador.getnombre());
			this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setText(cobrador.getdireccion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setText(cobrador.gettelefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Cobrador cobradorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobradorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Cobrador cobradorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobradorLocal=this.cobrador;
			} else {
				cobradorLocal=this.cobradorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobradorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrador(cobradorLocal,true);
					
					if(cobradorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobradorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobradorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrador(Cobrador cobrador,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrador(cobrador,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrador(cobrador);
	}
	
	public void setVariablesFormularioToObjetoActualCobrador(Cobrador cobrador,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrador(cobrador,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrador(Cobrador cobrador,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.getText()==null || this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.getText()=="" || this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setText("0");
			}

			if(conColumnasBase) {cobrador.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelIdCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrador.setidentificacion(this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelidentificacionCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrador.setapellido(this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelapellidoCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrador.setnombre(this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabelnombreCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrador.setdireccion(this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabeldireccionCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrador.settelefono(this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobradorConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrador.jLabeltelefonoCobrador,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrador(Cobrador cobradorBean,Cobrador cobrador,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cobradorBean.getid_tipo_identificacion()!=null && !cobradorBean.getid_tipo_identificacion().equals(-1L))) {cobrador.setid_tipo_identificacion(cobradorBean.getid_tipo_identificacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrador(Cobrador cobradorOrigen,Cobrador cobrador,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobradorOrigen.getId()!=null && !cobradorOrigen.getId().equals(0L))) {cobrador.setId(cobradorOrigen.getId());}}
			if(conDefault || (!conDefault && cobradorOrigen.getid_tipo_identificacion()!=null && !cobradorOrigen.getid_tipo_identificacion().equals(-1L))) {cobrador.setid_tipo_identificacion(cobradorOrigen.getid_tipo_identificacion());}
			if(conDefault || (!conDefault && cobradorOrigen.getidentificacion()!=null && !cobradorOrigen.getidentificacion().equals(""))) {cobrador.setidentificacion(cobradorOrigen.getidentificacion());}
			if(conDefault || (!conDefault && cobradorOrigen.getapellido()!=null && !cobradorOrigen.getapellido().equals(""))) {cobrador.setapellido(cobradorOrigen.getapellido());}
			if(conDefault || (!conDefault && cobradorOrigen.getnombre()!=null && !cobradorOrigen.getnombre().equals(""))) {cobrador.setnombre(cobradorOrigen.getnombre());}
			if(conDefault || (!conDefault && cobradorOrigen.getdireccion()!=null && !cobradorOrigen.getdireccion().equals(""))) {cobrador.setdireccion(cobradorOrigen.getdireccion());}
			if(conDefault || (!conDefault && cobradorOrigen.gettelefono()!=null && !cobradorOrigen.gettelefono().equals(""))) {cobrador.settelefono(cobradorOrigen.gettelefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrador(Cobrador cobrador) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setText(cobrador.getId().toString());
			this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setText(cobrador.getidentificacion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setText(cobrador.getapellido());
			this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setText(cobrador.getnombre());
			this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setText(cobrador.getdireccion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setText(cobrador.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrador(CobradorBean cobradorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setText(cobradorBean.getId().toString());
			this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setText(cobradorBean.getidentificacion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setText(cobradorBean.getapellido());
			this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setText(cobradorBean.getnombre());
			this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setText(cobradorBean.getdireccion());
			this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setText(cobradorBean.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrador(CobradorParameterReturnGeneral cobradorReturnGeneral,CobradorBean cobradorBean,Boolean conDefault) throws Exception { 
		try {
			Cobrador cobradorLocal=new Cobrador();
			
			cobradorLocal=cobradorReturnGeneral.getCobrador();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobradorLocal.getId()!=null && !cobradorLocal.getId().equals(0L))) {cobradorBean.setId(cobradorLocal.getId());}}
			if(conDefault || (!conDefault && cobradorLocal.getid_tipo_identificacion()!=null && !cobradorLocal.getid_tipo_identificacion().equals(-1L))) {cobradorBean.setid_tipo_identificacion(cobradorLocal.getid_tipo_identificacion());}
			if(conDefault || (!conDefault && cobradorLocal.getidentificacion()!=null && !cobradorLocal.getidentificacion().equals(""))) {cobradorBean.setidentificacion(cobradorLocal.getidentificacion());}
			if(conDefault || (!conDefault && cobradorLocal.getapellido()!=null && !cobradorLocal.getapellido().equals(""))) {cobradorBean.setapellido(cobradorLocal.getapellido());}
			if(conDefault || (!conDefault && cobradorLocal.getnombre()!=null && !cobradorLocal.getnombre().equals(""))) {cobradorBean.setnombre(cobradorLocal.getnombre());}
			if(conDefault || (!conDefault && cobradorLocal.getdireccion()!=null && !cobradorLocal.getdireccion().equals(""))) {cobradorBean.setdireccion(cobradorLocal.getdireccion());}
			if(conDefault || (!conDefault && cobradorLocal.gettelefono()!=null && !cobradorLocal.gettelefono().equals(""))) {cobradorBean.settelefono(cobradorLocal.gettelefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobradorGenerico(Long idCobradorSeleccionado,JComboBox jComboBoxCobrador,List<Cobrador> cobradorsLocal)throws Exception {
		try {
			Cobrador  cobradorTemp=null;

			for(Cobrador cobradorAux:cobradorsLocal) {
				if(cobradorAux.getId()!=null && cobradorAux.getId().equals(idCobradorSeleccionado)) {
					cobradorTemp=cobradorAux;
					break;
				}
			}

			jComboBoxCobrador.setSelectedItem(cobradorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobradorGenerico(JComboBox jComboBoxCobrador,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrador.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrador.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrador.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrador.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrador=(Cobrador) cobradorLogic.getCobradors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrador =(Cobrador) cobradors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoIdentificacion")) {
			//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
			if(!cobrador.getIsNew() && !cobrador.getIsChanged() && !cobrador.getIsDeleted()) {
				sDescripcion=cobrador.gettipoidentificacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
				sDescripcion=cobrador.gettipoidentificacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Cobrador cobradorRow=new Cobrador();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobradorRow=(Cobrador) cobradorLogic.getCobradors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobradorRow=(Cobrador) cobradors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrador(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador));			
			this.jButtonDuplicarCobrador.setVisible((this.isVisibilidadCeldaDuplicarCobrador && this.isPermisoDuplicarCobrador));			
			this.jButtonCopiarCobrador.setVisible((this.isVisibilidadCeldaCopiarCobrador && this.isPermisoCopiarCobrador));
			this.jButtonVerFormCobrador.setVisible((this.isVisibilidadCeldaVerFormCobrador && this.isPermisoVerFormCobrador));
			
			this.jButtonAbrirOrderByCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));			
			
			this.jButtonNuevoRelacionesCobrador.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrador && this.isPermisoNuevoCobrador));			
			this.jButtonNuevoGuardarCambiosCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador && this.isPermisoGuardarCambiosCobrador));
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.jInternalFrameDetalleFormCobrador.jButtonModificarCobrador.setVisible((this.isVisibilidadCeldaModificarCobrador && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.setVisible((this.isVisibilidadCeldaActualizarCobrador && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.setVisible((this.isVisibilidadCeldaEliminarCobrador && this.isPermisoEliminarCobrador));
			this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.setVisible(this.isVisibilidadCeldaCancelarCobrador);							
			this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.setVisible((this.isVisibilidadCeldaGuardarCobrador && this.isPermisoGuardarCambiosCobrador));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrador.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrador && this.isPermisoGuardarCambiosCobrador));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador));						
			this.jButtonDuplicarToolBarCobrador.setVisible((this.isVisibilidadCeldaDuplicarCobrador && this.isPermisoDuplicarCobrador));						
			this.jButtonCopiarToolBarCobrador.setVisible((this.isVisibilidadCeldaCopiarCobrador && this.isPermisoCopiarCobrador));			
			this.jButtonVerFormToolBarCobrador.setVisible((this.isVisibilidadCeldaVerFormCobrador && this.isPermisoVerFormCobrador));			
			this.jButtonAbrirOrderByToolBarCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));
			this.jButtonNuevoRelacionesToolBarCobrador.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrador && this.isPermisoNuevoCobrador));			
			this.jButtonNuevoGuardarCambiosToolBarCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador && this.isPermisoGuardarCambiosCobrador));			
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.jInternalFrameDetalleFormCobrador.jButtonModificarToolBarCobrador.setVisible((this.isVisibilidadCeldaModificarCobrador && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jButtonActualizarToolBarCobrador.setVisible((this.isVisibilidadCeldaActualizarCobrador  && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jButtonEliminarToolBarCobrador.setVisible((this.isVisibilidadCeldaEliminarCobrador && this.isPermisoEliminarCobrador));
			this.jInternalFrameDetalleFormCobrador.jButtonCancelarToolBarCobrador.setVisible(this.isVisibilidadCeldaCancelarCobrador);				
			this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosToolBarCobrador.setVisible((this.isVisibilidadCeldaGuardarCobrador && this.isPermisoGuardarCambiosCobrador));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrador.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrador && this.isPermisoGuardarCambiosCobrador));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador));			
			this.jMenuItemDuplicarCobrador.setVisible((this.isVisibilidadCeldaDuplicarCobrador && this.isPermisoDuplicarCobrador));			
			this.jMenuItemCopiarCobrador.setVisible((this.isVisibilidadCeldaCopiarCobrador && this.isPermisoCopiarCobrador));			
			this.jMenuItemVerFormCobrador.setVisible((this.isVisibilidadCeldaVerFormCobrador && this.isPermisoVerFormCobrador));			
			this.jMenuItemAbrirOrderByCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));			
			//this.jMenuItemMostrarOcultarCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));
			this.jMenuItemDetalleAbrirOrderByCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));			
			//this.jMenuItemDetalleMostrarOcultarCobrador.setVisible((this.isVisibilidadCeldaOrdenCobrador && this.isPermisoOrdenCobrador));			
			this.jMenuItemNuevoRelacionesCobrador.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrador && this.isPermisoNuevoCobrador));			
			this.jMenuItemNuevoGuardarCambiosCobrador.setVisible((this.isVisibilidadCeldaNuevoCobrador && this.isPermisoNuevoCobrador && this.isPermisoGuardarCambiosCobrador));									
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.jInternalFrameDetalleFormCobrador.jMenuItemModificarCobrador.setVisible((this.isVisibilidadCeldaModificarCobrador && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jMenuItemActualizarCobrador.setVisible((this.isVisibilidadCeldaActualizarCobrador && this.isPermisoActualizarCobrador));	
			this.jInternalFrameDetalleFormCobrador.jMenuItemEliminarCobrador.setVisible((this.isVisibilidadCeldaEliminarCobrador && this.isPermisoEliminarCobrador));
			this.jInternalFrameDetalleFormCobrador.jMenuItemCancelarCobrador.setVisible(this.isVisibilidadCeldaCancelarCobrador);				
			}
			
			this.jMenuItemGuardarCambiosCobrador.setVisible((this.isVisibilidadCeldaGuardarCobrador && this.isPermisoGuardarCambiosCobrador));						
			this.jMenuItemGuardarCambiosTablaCobrador.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrador && this.isPermisoGuardarCambiosCobrador));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrador=this.jButtonNuevoCobrador.isVisible();
			this.isVisibilidadCeldaDuplicarCobrador=this.jButtonDuplicarCobrador.isVisible();
			this.isVisibilidadCeldaCopiarCobrador=this.jButtonCopiarCobrador.isVisible();
			this.isVisibilidadCeldaVerFormCobrador=this.jButtonVerFormCobrador.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrador=this.jButtonAbrirOrderByCobrador.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrador=this.jButtonNuevoRelacionesCobrador.isVisible();
			this.isVisibilidadCeldaModificarCobrador=this.jButtonModificarCobrador.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.isVisibilidadCeldaActualizarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.isVisible();
			this.isVisibilidadCeldaEliminarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.isVisible();
			this.isVisibilidadCeldaCancelarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.isVisible();
			this.isVisibilidadCeldaGuardarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrador=this.jButtonGuardarCambiosTablaCobrador.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrador=this.jButtonNuevoToolBarCobrador.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrador=this.jButtonNuevoRelacionesToolBarCobrador.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.isVisibilidadCeldaModificarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonModificarToolBarCobrador.isVisible();
			this.isVisibilidadCeldaActualizarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonActualizarToolBarCobrador.isVisible();
			this.isVisibilidadCeldaEliminarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonEliminarToolBarCobrador.isVisible();
			this.isVisibilidadCeldaCancelarCobrador=this.jInternalFrameDetalleFormCobrador.jButtonCancelarToolBarCobrador.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrador=this.jButtonGuardarCambiosToolBarCobrador.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrador=this.jButtonGuardarCambiosTablaToolBarCobrador.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrador=this.jMenuItemNuevoCobrador.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrador=this.jMenuItemNuevoRelacionesCobrador.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.isVisibilidadCeldaModificarCobrador=this.jInternalFrameDetalleFormCobrador.jMenuItemModificarCobrador.isVisible();
			this.isVisibilidadCeldaActualizarCobrador=this.jInternalFrameDetalleFormCobrador.jMenuItemActualizarCobrador.isVisible();
			this.isVisibilidadCeldaEliminarCobrador=this.jInternalFrameDetalleFormCobrador.jMenuItemEliminarCobrador.isVisible();
			this.isVisibilidadCeldaCancelarCobrador=this.jInternalFrameDetalleFormCobrador.jMenuItemCancelarCobrador.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrador=this.jMenuItemGuardarCambiosCobrador.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrador=this.jMenuItemGuardarCambiosTablaCobrador.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrador(Boolean esInicializar) {
		if(CobradorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobradorSessionBean.getConGuardarRelaciones()) {
				//if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrador();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrador(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrador() {
		this.jButtonNuevoCobrador.setVisible(this.isPermisoNuevoCobrador);			
		this.jButtonDuplicarCobrador.setVisible(this.isPermisoDuplicarCobrador);			
		this.jButtonCopiarCobrador.setVisible(this.isPermisoCopiarCobrador);			
		this.jButtonVerFormCobrador.setVisible(this.isPermisoVerFormCobrador);			
		
		this.jButtonAbrirOrderByCobrador.setVisible(this.isPermisoOrdenCobrador);					
		
		this.jButtonNuevoRelacionesCobrador.setVisible(this.isPermisoNuevoCobrador);			
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonModificarCobrador.setVisible(this.isPermisoActualizarCobrador);	
			this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.setVisible(this.isPermisoActualizarCobrador);	
			this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.setVisible(this.isPermisoEliminarCobrador);
			this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.setVisible(this.isVisibilidadCeldaCancelarCobrador);						
			this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.setVisible(this.isPermisoGuardarCambiosCobrador);							
		}
		
		this.jButtonGuardarCambiosTablaCobrador.setVisible(this.isPermisoActualizarCobrador);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrador() {
		this.jInternalFrameDetalleFormCobrador.jButtonModificarCobrador.setVisible(this.isPermisoActualizarCobrador);	
		this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.setVisible(this.isPermisoActualizarCobrador);	
		this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.setVisible(this.isPermisoEliminarCobrador);
		this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.setVisible(this.isVisibilidadCeldaCancelarCobrador);							
		this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.setVisible((this.isVisibilidadCeldaGuardarCobrador && this.isPermisoGuardarCambiosCobrador));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrador() {
		if(CobradorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrador();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrador() {
	}
	
	public void jTableDatosCobradorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrador(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrador.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_identificacionCobradorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoidentificacion=true;

			idTienePermisotipoidentificacion=this.tienePermisosUsuarioEnPaginaWebCobrador(TipoIdentificacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoidentificacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrador.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrador.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);

				this.tipoidentificacionBeanSwingJInternalFrame=new TipoIdentificacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoidentificacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoidentificacionBeanSwingJInternalFrame.getTipoIdentificacionLogic().setConnexion(this.cobradorLogic.getConnexion());

				if(this.cobrador.getid_tipo_identificacion()!=null) {
					this.tipoidentificacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoidentificacionBeanSwingJInternalFrame.setIdActual(this.cobrador.getid_tipo_identificacion());
					this.tipoidentificacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIdentificacion();
				}

				JInternalFrameBase jinternalFrame =this.tipoidentificacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrador=(TitledBorder)this.jScrollPanelDatosCobrador.getBorder();
				TitledBorder titledBordertipoidentificacion=(TitledBorder)this.tipoidentificacionBeanSwingJInternalFrame.jScrollPanelDatosTipoIdentificacion.getBorder();

				titledBordertipoidentificacion.setTitle(titledBorderCobrador.getTitle() + " -> Tipo Identificacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_identificacionCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getid_tipo_identificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_identificacion = "+this.cobrador.getid_tipo_identificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.cobrador.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cobrador.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrador.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.cobrador.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoCobradorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrador.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrador(this.getcobrador(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrador==null) {
						this.cobrador = new Cobrador();
					}

					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);
				}

				if(this.cobrador.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.cobrador.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrador(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdTipoIdentificacionCobradorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrador(false,false);

			this.getCobradorsFK_IdTipoIdentificacion();

			this.inicializarActualizarBindingCobrador(false);

			//if(CobradorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrador(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobradorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrador() {
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
			this.jInternalFrameDetalleFormCobrador.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrador.dispose();
			this.jInternalFrameDetalleFormCobrador=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrador!=null) {
			this.jInternalFrameReporteDinamicoCobrador.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrador.dispose();
			this.jInternalFrameReporteDinamicoCobrador=null;
		}
		
		if(this.jInternalFrameImportacionCobrador!=null) {
			this.jInternalFrameImportacionCobrador.setVisible(false);	    			
			this.jInternalFrameImportacionCobrador.dispose();
			this.jInternalFrameImportacionCobrador=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrador();
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrador")) {
				jButtonDuplicarCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrador")) {
				jButtonCopiarCobradorActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrador")) {
				jButtonVerFormCobradorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrador")) {
				jButtonDuplicarCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrador")) {
				jButtonDuplicarCobradorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrador")) {
				jButtonModificarCobradorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrador")) {
				jButtonModificarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrador")) {
				jButtonModificarCobradorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrador")) {
				jButtonActualizarCobradorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrador")) {
				jButtonActualizarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrador")) {
				jButtonActualizarCobradorActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrador")) {
				jButtonEliminarCobradorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrador")) {
				jButtonEliminarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrador")) {
				jButtonEliminarCobradorActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrador")) {
				jButtonCancelarCobradorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrador")) {
				jButtonCancelarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrador")) {
				jButtonCancelarCobradorActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrador")) {
				jButtonCerrarCobradorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrador")) {
				jButtonCerrarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrador")) {
				jButtonCerrarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrador")) {
				jButtonMostrarOcultarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrador")) {
				jButtonCancelarCobradorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrador")) {
				jButtonCopiarCobradorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrador")) {
				jButtonVerFormCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrador")) {
				jButtonCopiarCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrador")) {
				jButtonVerFormCobradorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrador")) {
				jButtonRecargarInformacionCobradorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrador")) {
				jButtonRecargarInformacionCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrador")) {
				jButtonRecargarInformacionCobradorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrador")) {
				jButtonAnterioresCobradorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrador")) {
				jButtonAnterioresCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrador")) {
				jButtonAnterioresCobradorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrador")) {
				jButtonSiguientesCobradorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrador")) {
				jButtonSiguientesCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrador")) {
				jButtonSiguientesCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrador") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrador")) {
				jButtonAbrirOrderByCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrador") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrador")) {
				jButtonMostrarOcultarCobradorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrador")) {
				jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrador")) {
				jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrador")) {
				jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrador")) {
				jButtonCerrarReporteDinamicoCobradorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrador")) {
				jButtonGenerarReporteDinamicoCobradorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrador")) {
				
				jButtonGenerarExcelReporteDinamicoCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrador")) {
				jButtonCerrarImportacionCobradorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrador")) {
				
				jButtonGenerarImportacionCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrador")) {
				
				jButtonAbrirImportacionCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrador")) {
				jComboBoxTiposAccionesCobradorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrador")) {
				jComboBoxTiposRelacionesCobradorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrador")) {
				jComboBoxTiposAccionesCobradorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrador")) {
				
				jComboBoxTiposSeleccionarCobradorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrador")) {
				jTextFieldValorCampoGeneralCobradorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrador")) {
				jButtonAbrirOrderByCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrador")) {
				jButtonAbrirOrderByCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrador")) {
				jButtonCerrarOrderByCobradorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobradorBusqueda")) {
				this.jButtonidCobradorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_identificacionCobradorUpdate")) {
				this.jButtonid_tipo_identificacionCobradorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_identificacionCobradorBusqueda")) {
				this.jButtonid_tipo_identificacionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionCobradorBusqueda")) {
				this.jButtonidentificacionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobradorBusqueda")) {
				this.jButtonapellidoCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobradorBusqueda")) {
				this.jButtonnombreCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCobradorBusqueda")) {
				this.jButtondireccionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoCobradorBusqueda")) {
				this.jButtontelefonoCobradorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoIdentificacionCobrador")) {
				this.jButtonFK_IdTipoIdentificacionCobradorActionPerformed(evt);
			}
			
			;
			
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrador();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Cobrador cobradorLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobradorLocal=this.cobrador;
			} else {
				cobradorLocal=this.cobradorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
							
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
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
			
			


			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
								
						
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
								
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
							
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
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
			
			


			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
								
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrador")) {
					jCheckBoxSeleccionarTodosCobradorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrador")) {
					jCheckBoxSeleccionadosCobradorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrador")) {
					
				}
				
				


				
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
												
				
				


				
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
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
			
			


			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobradorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrador);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrador);
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
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
				
				


				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cobrador.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cobrador.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobradorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobradorAnterior =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobradorAnterior =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrador")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobradorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrador.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrador =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrador =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrador);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrador")) {
				
				}
				
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrador")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrador.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrador")) {
			
			}
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrador();
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			if(sTipo.equals("NuevoCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrador")) {
				jButtonDuplicarCobradorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrador")) {
				jButtonCopiarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrador")) {
				jButtonVerFormCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrador")) {
				jButtonNuevoCobradorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrador")) {
				jButtonModificarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrador")) {
				jButtonActualizarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrador")) {
				jButtonEliminarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrador")) {
				jButtonCancelarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrador")) {
				jButtonCerrarCobradorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrador")) {
				jButtonGuardarCambiosCobradorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrador")) {
				jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrador")) {
				jButtonAbrirOrderByCobradorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrador")) {
				jButtonRecargarInformacionCobradorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrador")) {
				jButtonAnterioresCobradorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrador")) {
				jButtonSiguientesCobradorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobradorBusqueda")) {
				this.jButtonidCobradorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_identificacionCobradorUpdate")) {
				this.jButtonid_tipo_identificacionCobradorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_identificacionCobradorBusqueda")) {
				this.jButtonid_tipo_identificacionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionCobradorBusqueda")) {
				this.jButtonidentificacionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobradorBusqueda")) {
				this.jButtonapellidoCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobradorBusqueda")) {
				this.jButtonnombreCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionCobradorBusqueda")) {
				this.jButtondireccionCobradorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoCobradorBusqueda")) {
				this.jButtontelefonoCobradorBusquedaActionPerformed(evt);
			}
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrador();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrador")) {
				closingInternalFrameCobrador();
				
			} else if(sTipo.equals("jButtonCancelarCobrador")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrador = (JInternalFrameBase)evt.getSource();
	            	
	            CobradorBeanSwingJInternalFrame jInternalFrameParent=(CobradorBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrador.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobradorActionPerformed(null);
			}
			
			CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrador,new Object(),this.cobradorParameterGeneral,this.cobradorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrador(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrador(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrador(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrador)) {
			if(!esControlTabla) {
				if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);			
				}
				
				if(this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrador(this.cobrador,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cobradorReturnGeneral=cobradorLogic.procesarEventosCobradorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobradorLogic.getCobradors(),this.cobrador,this.cobradorParameterGeneral,this.isEsNuevoCobrador,classes);//this.cobradorLogic.getCobrador()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrador(this.cobradorReturnGeneral,this.cobradorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrador(classes,this.cobradorReturnGeneral,this.cobradorBean,false);
					}
						
					if(this.cobradorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrador(this.cobradorReturnGeneral.getCobrador());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrador(this.cobradorReturnGeneral.getCobrador());	
					}
						
					if(this.cobradorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrador(this.cobradorReturnGeneral.getCobrador(),classes);//this.cobradorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrador(this.cobrador,classes);//this.cobradorBean);									
				}
			
				if(CobradorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrador(this.cobrador,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrador(this.cobrador);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobradorAnterior!=null) {
						this.cobrador=this.cobradorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cobradorReturnGeneral=cobradorLogic.procesarEventosCobradorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobradorLogic.getCobradors(),this.cobrador,this.cobradorParameterGeneral,this.isEsNuevoCobrador,classes);//this.cobradorLogic.getCobrador()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobradorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobradorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobradorReturnGeneral.getCobrador(),cobradorLogic.getCobradors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobradorReturnGeneral.getCobrador(),this.cobradors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrador.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrador.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrador();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrador() throws Exception {
		
		CobradorModel cobradorModel=(CobradorModel)this.jTableDatosCobrador.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobradorModel.cobradors=this.cobradorLogic.getCobradors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobradorModel.cobradors=this.cobradors;
		}
		
		
		((CobradorModel) this.jTableDatosCobrador.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrador() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobradorAnterior(),this.cobradorLogic.getCobradors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobradorAnterior(),this.cobradors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrador();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrador(Cobrador cobrador,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
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
										
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrador,new Object(),generalEntityParameterGeneral,this.cobradorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobradorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobradorConstantesFunciones.getClassesRelationshipsOfCobrador(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobradorConstantesFunciones.getClassesRelationshipsFromStringsOfCobrador(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrador(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobradorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrador,new Object(),generalEntityParameterGeneral,this.cobradorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrador(CobradorBean cobradorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrador(ArrayList<Classe> classes,CobradorReturnGeneral cobradorReturnGeneral,CobradorBean cobradorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrador(Cobrador cobrador,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrador)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrador = new CobradorDetalleFormJInternalFrame(jDesktopPane,this.cobradorSessionBean.getConGuardarRelaciones(),this.cobradorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrador);
		this.jInternalFrameDetalleFormCobrador.setVisible(false);
		this.jInternalFrameDetalleFormCobrador.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrador.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrador.cobradorLogic=this.cobradorLogic;
		
		this.cargarCombosFrameForeignKeyCobrador("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrador();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrador();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrador("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrador();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrador.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrador"));
		
		this.jInternalFrameDetalleFormCobrador.jButtonModificarCobrador.addActionListener(new ButtonActionListener(this,"ModificarCobrador"));

		
		this.jInternalFrameDetalleFormCobrador.jButtonModificarToolBarCobrador.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrador"));
					
		this.jInternalFrameDetalleFormCobrador.jMenuItemModificarCobrador.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrador"));		
		
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.addActionListener (new ButtonActionListener(this,"ActualizarCobrador"));
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonActualizarToolBarCobrador.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrador"));
						
		this.jInternalFrameDetalleFormCobrador.jMenuItemActualizarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrador"));		
		
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.addActionListener (new ButtonActionListener(this,"EliminarCobrador"));
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonEliminarToolBarCobrador.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrador"));
								
		this.jInternalFrameDetalleFormCobrador.jMenuItemEliminarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrador"));		
		
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.addActionListener (new ButtonActionListener(this,"CancelarCobrador"));
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonCancelarToolBarCobrador.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrador"));
					
		this.jInternalFrameDetalleFormCobrador.jMenuItemCancelarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrador"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrador.jMenuItemDetalleCerrarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrador"));		
		
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosToolBarCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrador"));
		
		
		
		this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosToolBarCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrador"));
		
		
		
		this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrador"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidCobradorBusqueda.addActionListener(new ButtonActionListener(this,"idCobradorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidentificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonapellidoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonnombreCobradorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtondireccionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"direccionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtontelefonoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobradorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrador"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrador"));
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrador"));
		}
		
		this.jTableDatosCobrador.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrador"));
		
		this.jTableDatosCobrador.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrador"));
		
		this.jButtonNuevoCobrador.addActionListener(new ButtonActionListener(this,"NuevoCobrador"));
		
		this.jButtonDuplicarCobrador.addActionListener(new ButtonActionListener(this,"DuplicarCobrador"));
		
		this.jButtonCopiarCobrador.addActionListener(new ButtonActionListener(this,"CopiarCobrador"));
		
		this.jButtonVerFormCobrador.addActionListener(new ButtonActionListener(this,"VerFormCobrador"));
		
		
		this.jButtonNuevoToolBarCobrador.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrador"));
			
		this.jButtonDuplicarToolBarCobrador.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrador"));
			
		this.jMenuItemNuevoCobrador.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrador"));
			
		this.jMenuItemDuplicarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrador"));		
		
		
		this.jButtonNuevoRelacionesCobrador.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrador"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrador.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrador"));
			
		this.jMenuItemNuevoRelacionesCobrador.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrador"));		
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonModificarCobrador.addActionListener(new ButtonActionListener(this,"ModificarCobrador"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonModificarToolBarCobrador.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrador"));
			
			this.jInternalFrameDetalleFormCobrador.jMenuItemModificarCobrador.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrador.jButtonActualizarCobrador.addActionListener (new ButtonActionListener(this,"ActualizarCobrador"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonActualizarToolBarCobrador.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrador"));
				
			this.jInternalFrameDetalleFormCobrador.jMenuItemActualizarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonEliminarCobrador.addActionListener (new ButtonActionListener(this,"EliminarCobrador"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonEliminarToolBarCobrador.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrador"));
						
			this.jInternalFrameDetalleFormCobrador.jMenuItemEliminarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonCancelarCobrador.addActionListener (new ButtonActionListener(this,"CancelarCobrador"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonCancelarToolBarCobrador.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrador"));
			
			this.jInternalFrameDetalleFormCobrador.jMenuItemCancelarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrador"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrador.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrador"));		
		
		
		this.jButtonCerrarCobrador.addActionListener (new ButtonActionListener(this,"CerrarCobrador"));
		
		
		this.jButtonCerrarToolBarCobrador.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrador"));
			
		this.jMenuItemCerrarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrador"));
			
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jMenuItemDetalleCerrarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrador"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrador"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosToolBarCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrador"));
		}
		
		this.jButtonCopiarToolBarCobrador.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrador"));
			
		this.jButtonVerFormToolBarCobrador.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrador"));
		
		this.jMenuItemGuardarCambiosCobrador.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrador"));
			
		this.jMenuItemCopiarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrador"));		
		
		this.jMenuItemVerFormCobrador.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrador"));		
		
		
		this.jButtonGuardarCambiosTablaCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrador"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrador"));
			
		this.jMenuItemGuardarCambiosTablaCobrador.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrador"));		
		
		
		
		this.jButtonRecargarInformacionCobrador.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrador"));
					
		this.jButtonRecargarInformacionToolBarCobrador.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrador"));
		
		this.jMenuItemRecargarInformacionCobrador.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrador"));		
		
		
		
		this.jButtonAnterioresCobrador.addActionListener (new ButtonActionListener(this,"AnterioresCobrador"));
		
		
		this.jButtonAnterioresToolBarCobrador.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrador"));
		
		this.jMenuItemAnterioresCobrador.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrador"));		
		
		
		this.jButtonSiguientesCobrador.addActionListener (new ButtonActionListener(this,"SiguientesCobrador"));
		
		
		this.jButtonSiguientesToolBarCobrador.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrador"));
			
		this.jMenuItemSiguientesCobrador.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrador"));
			
		this.jMenuItemAbrirOrderByCobrador.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrador"));
			
		this.jMenuItemMostrarOcultarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrador"));
			
		this.jMenuItemDetalleAbrirOrderByCobrador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrador"));
			
		this.jMenuItemDetalleMostarOcultarCobrador.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrador"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrador.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrador"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrador.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrador"));
			
		this.jMenuItemNuevoGuardarCambiosCobrador.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrador"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrador.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrador"));

		this.jCheckBoxSeleccionadosCobrador.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrador"));
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrador"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrador.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrador"));
			
		this.jComboBoxTiposAccionesCobrador.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrador"));
					
		this.jComboBoxTiposSeleccionarCobrador.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrador"));
			
		this.jTextFieldValorCampoGeneralCobrador.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrador"));		
		
		
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidCobradorBusqueda.addActionListener(new ButtonActionListener(this,"idCobradorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidentificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonapellidoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonnombreCobradorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtondireccionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"direccionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtontelefonoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobradorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoIdentificacionCobrador.addActionListener(new ButtonActionListener(this,"FK_IdTipoIdentificacionCobrador"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrador!=null) {
				this.jInternalFrameReporteDinamicoCobrador.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrador"));
				this.jInternalFrameReporteDinamicoCobrador.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrador"));
				this.jInternalFrameReporteDinamicoCobrador.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrador"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrador.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrador"));				
			//this.jButtonGenerarReporteDinamicoCobrador.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrador"));
			//this.jButtonGenerarExcelReporteDinamicoCobrador.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrador"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrador!=null) {
				this.jInternalFrameImportacionCobrador.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrador"));
				this.jInternalFrameImportacionCobrador.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrador"));
				this.jInternalFrameImportacionCobrador.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrador"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrador.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrador"));
			
			this.jButtonAbrirOrderByToolBarCobrador.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrador"));			
			
			if(this.jInternalFrameOrderByCobrador!=null) {
				this.jInternalFrameOrderByCobrador.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrador"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrador!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrador.jTabbedPaneRelacionesCobrador.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrador"));
		
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
            		closingInternalFrameCobrador();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrador.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrador = (JInternalFrameBase)event.getSource();
	            	
	            CobradorBeanSwingJInternalFrame jInternalFrameParent=(CobradorBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrador.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobradorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrador.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobradorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrador.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrador.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrador";
		inputMap = this.jButtonNuevoCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobradorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobradorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrador";
		inputMap = this.jButtonNuevoRelacionesCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobradorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrador";
		inputMap = this.jButtonModificarCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrador";
		inputMap = this.jButtonActualizarCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrador";
		inputMap = this.jButtonEliminarCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrador";
		inputMap = this.jButtonCancelarCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrador";
		inputMap = this.jButtonCerrarCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrador";
		inputMap = this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrador.jButtonGuardarCambiosCobrador.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobradorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrador.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobradorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobradorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobradorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrador.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobradorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidCobradorBusqueda.addActionListener(new ButtonActionListener(this,"idCobradorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonid_tipo_identificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonidentificacionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"identificacionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonapellidoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtonnombreCobradorBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtondireccionCobradorBusqueda.addActionListener(new ButtonActionListener(this,"direccionCobradorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrador.jButtontelefonoCobradorBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobradorBusqueda"));
		
		
		this.jButtonFK_IdTipoIdentificacionCobrador.addActionListener(new ButtonActionListener(this,"FK_IdTipoIdentificacionCobrador"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrador.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobradorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobradorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrador.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrador(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
					cobradorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cobrador cobradorAux:cobradors) {
					cobradorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobradorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrador(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
						cobradorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cobrador cobradorAux:cobradors) {
						cobradorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cobrador cobradorAux:cobradors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrador(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrador.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrador.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrador,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobradorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrador(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrador.getSelectedRows();
			
			Cobrador cobradorLocal=new Cobrador();
			
			//this.seleccionarTodosCobrador(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobradorLocal =(Cobrador) this.cobradorLogic.getCobradors().toArray()[this.jTableDatosCobrador.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobradorLocal =(Cobrador) this.cobradors.toArray()[this.jTableDatosCobrador.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobradorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
						cobradorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cobrador cobradorAux:cobradors) {
						cobradorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrador(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrador.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrador.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrador,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobradorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobradorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobradorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrador(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrador.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cobrador cobradorAux:this.cobradorLogic.getCobradors()) {
				
						if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							cobradorAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobradorAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobradorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cobradorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							cobradorAux.settelefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cobrador cobradorAux:cobradors) {
					
						if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							cobradorAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobradorAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobradorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							cobradorAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							cobradorAux.settelefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrador(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobradorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrador(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrador=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrador.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrador) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrador(conSplash);
				
					this.generarReporteCobradorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobradorsSeleccionados();
				//this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobradorsSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobradorsSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrador();
				
				this.exportarCobradorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobradors();
				//this.importarCobradors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrador();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobradorsSeleccionados();
				//this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrador", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrador();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrador)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrador(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
				}	
			} 			
			else if(CobradorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrador) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrador(conSplash);
					
						//this.actualizarParametrosGeneralCobrador();
						
						this.generarReporteProcesoAccionCobradorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobradorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CobradorES SELECCIONADOS?", "MANTENIMIENTO DE Cobrador", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrador();
				
						this.actualizarParametrosGeneralCobrador();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobradorReturnGeneral=cobradorLogic.procesarAccionCobradorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobradorLogic.getCobradors(),this.cobradorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobradorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrador();
					
					CobradorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobradorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrador.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrador.jComboBoxTiposAccionesFormularioCobrador.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrador(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobradorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrador();
			
			if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
			Cobrador cobrador=new Cobrador();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrador(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrador.getSelectedItem();
			
			
			
			
			cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobradorsSeleccionados.size()==1) {
				for(Cobrador cobradorAux:cobradorsSeleccionados) {
					cobrador=cobradorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrador();
			
      		//this.finishProcessCobrador(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobradorReturnGeneral() throws Exception {
		if(this.cobradorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobradorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobradorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobradorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobradorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobradorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrador(false);
		}
		
		if(this.cobradorReturnGeneral.getConRetornoLista() || this.cobradorReturnGeneral.getConRetornoObjeto()) {
			if(this.cobradorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobradorLogic.setCobradors(this.cobradorReturnGeneral.getCobradors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cobradorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobradorLogic.setCobrador(this.cobradorReturnGeneral.getCobrador());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCobrador(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrador() throws Exception {
		
		
	}
	
	public ArrayList<Cobrador> getCobradorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrador) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Cobrador cobradorAux:cobradorLogic.getCobradors()) {
					if(cobradorAux.getIsSelected()) {
						cobradorsSeleccionados.add(cobradorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cobrador cobradorAux:this.cobradors) {
					if(cobradorAux.getIsSelected()) {
						cobradorsSeleccionados.add(cobradorAux);				
					}
				}
			}
			
			if(cobradorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobradorsSeleccionados.addAll(this.cobradorLogic.getCobradors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobradorsSeleccionados.addAll(this.cobradors);				
					}
				}
			}
		} else {
			cobradorsSeleccionados.add(this.cobrador);
		}
		
		return cobradorsSeleccionados;
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
	
	public void generarReporteCobradorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobradorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobradorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobradorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobradorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrador",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobradors("Todos",cobradorsSeleccionados);
		
	}	
	
	public void generarReporteNormalCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobradors("Todos",cobradorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobradorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobradors("Todos",cobradorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrador();
		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrador();
		
		
		//this.generarReporteCobradors("Todos",cobradorsSeleccionados ,cobradorImplementable,cobradorImplementableHome);
	}
	
	public void mostrarImportacionCobradors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrador();
		
		this.abrirFrameImportacionCobrador();		
		
			
		//this.generarReporteCobradors("Todos",cobradorsSeleccionados ,cobradorImplementable,cobradorImplementableHome);
	}
	
	public void importarCobradors() throws Exception {		
	
	}
	
	public void exportarCobradorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobradorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobradorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobradorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrador",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrador(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Cobrador cobradorAux:cobradorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrador(cobradorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobradorAux.setsDetalleGeneralEntityReporte(cobradorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrador(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobradorConstantesFunciones.LABEL_TELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrador(Cobrador cobrador,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrador.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.gettipoidentificacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrador.gettelefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cobradors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrador(row);				
				iRow++;
			}				
			
			for(Cobrador cobradorAux:cobradorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrador(cobradorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobradorsSeleccionados() throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();		
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrador.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobradors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrador");
			//elementRoot.appendChild(element);
		
			for(Cobrador cobradorAux:cobradorsSeleccionados) {
				element = document.createElement("cobrador");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrador(cobradorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrador",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrador(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobradorConstantesFunciones.LABEL_TELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrador(Cobrador cobrador,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.gettipoidentificacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrador.gettelefono());				
	}
	
	public void setFilaDatosExportarXmlCobrador(Cobrador cobrador,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobradorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrador.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobradorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrador.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipoidentificacion_descripcion = document.createElement(CobradorConstantesFunciones.IDTIPOIDENTIFICACION);
		elementtipoidentificacion_descripcion.appendChild(document.createTextNode(cobrador.gettipoidentificacion_descripcion()));
		element.appendChild(elementtipoidentificacion_descripcion);

		Element elementidentificacion = document.createElement(CobradorConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(cobrador.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementapellido = document.createElement(CobradorConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cobrador.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(CobradorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrador.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(CobradorConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(cobrador.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(CobradorConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(cobrador.gettelefono().trim()));
		element.appendChild(elementtelefono);
	}
	
	public void generarReporteGroupGenericoCobradorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Cobrador> cobradorsSeleccionados=new ArrayList<Cobrador>();
		
		cobradorsSeleccionados=this.getCobradorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrador(cobradorsSeleccionados);
		
		this.generarReporteCobradors("Todos",cobradorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrador(ArrayList<Cobrador> cobradorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Cobrador cobradorAux:cobradorsSeleccionados) {
				cobradorAux.setsDetalleGeneralEntityReporte(cobradorAux.toString());
			
				if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.gettipoidentificacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(CobradorConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					cobradorAux.setsDescripcionGeneralEntityReporte1(cobradorAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobradorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrador(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrador=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrador=true;
				this.isVisibilidadCeldaGuardarCambiosCobrador=true;
			}
			
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=true;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=true;
			this.isVisibilidadCeldaEliminarCobrador=true;
			this.isVisibilidadCeldaCancelarCobrador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=true;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrador=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=true;
			this.isVisibilidadCeldaGuardarCambiosCobrador=true;
			this.isVisibilidadCeldaModificarCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
			this.isVisibilidadCeldaModificarCobrador=true;
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
			this.isVisibilidadCeldaCancelarCobrador=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrador=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrador=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobradorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrador=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrador=true;
			this.isVisibilidadCeldaGuardarCambiosCobrador=true;
		} else {
			this.actualizarEstadoPanelsCobrador(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrador=false;
			//this.isVisibilidadCeldaVerFormCobrador=false;
			this.isVisibilidadCeldaDuplicarCobrador=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobradorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrador=false;
			this.isVisibilidadCeldaGuardarCambiosCobrador=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobradorSessionBean.getEsGuardarRelacionado()) {
			if(!cobradorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrador=false;												
			}
			
			this.jButtonCerrarCobrador.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrador=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrador)) {
			this.isVisibilidadCeldaActualizarCobrador=false;
			this.isVisibilidadCeldaEliminarCobrador=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrador() {
	}
	
	public void actualizarEstadoPanelsCobrador(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrador!=null) {
				this.jScrollPanelDatosEdicionCobrador.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrador!=null) {
				this.jScrollPanelDatosCobrador.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrador!=null) {
				this.jPanelPaginacionCobrador.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobradorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrador!=null) {
					this.jTabbedPaneBusquedasCobrador.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobradorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrador!=null) {
				this.jTabbedPaneBusquedasCobrador.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrador!=null) {
				this.jPanelParametrosReportesCobrador.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoIdentificacion(Boolean isParaTipoIdentificacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIdentificacionNegation=!isParaTipoIdentificacion;

			this.isVisibilidadFK_IdTipoIdentificacion=isParaTipoIdentificacion;
			if(!this.isVisibilidadFK_IdTipoIdentificacion) {this.jTabbedPaneBusquedasCobrador.remove(jPanelFK_IdTipoIdentificacionCobrador);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CobradorSessionBean cobradorSessionBean=new CobradorSessionBean();
		
		if(this.cobradorSessionBean==null) {
			this.cobradorSessionBean=new CobradorSessionBean();
		}
		
		this.cobradorSessionBean.setsUltimaBusquedaCobrador(this.getsAccionBusqueda());
		this.cobradorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cobradorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdTipoIdentificacion")) {
			cobradorSessionBean.setid_tipo_identificacion(this.getid_tipo_identificacionFK_IdTipoIdentificacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CobradorSessionBean cobradorSessionBean=new CobradorSessionBean();
		
		if(this.cobradorSessionBean==null) {
			this.cobradorSessionBean=new CobradorSessionBean();
		}
		
		if(this.cobradorSessionBean.getsUltimaBusquedaCobrador()!=null&&!this.cobradorSessionBean.getsUltimaBusquedaCobrador().equals("")) {
			this.setsAccionBusqueda(cobradorSessionBean.getsUltimaBusquedaCobrador());
			this.setiNumeroPaginacion(cobradorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cobradorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdTipoIdentificacion")) {
				this.setid_tipo_identificacionFK_IdTipoIdentificacion(cobradorSessionBean.getid_tipo_identificacion());
				cobradorSessionBean.setid_tipo_identificacion(-1L);
			}
		}
		
		this.cobradorSessionBean.setsUltimaBusquedaCobrador("");
		this.cobradorSessionBean.setiNumeroPaginacion(CobradorConstantesFunciones.INUMEROPAGINACION);
		this.cobradorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCobrador(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrador() {
		this.updateBorderResaltarBusquedasFormularioCobrador();
		this.updateVisibilidadBusquedasFormularioCobrador();
		this.updateHabilitarBusquedasFormularioCobrador();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrador() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrador.getComponents().length>0) {
	

		if(this.cobradorConstantesFunciones.resaltarFK_IdTipoIdentificacionCobrador!=null) {
			index= this.jTabbedPaneBusquedasCobrador.indexOfComponent(this.jPanelFK_IdTipoIdentificacionCobrador);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrador.getComponent(index);
				jPanel.setBorder(this.cobradorConstantesFunciones.resaltarFK_IdTipoIdentificacionCobrador);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrador() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrador.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrador.indexOfComponent(this.jPanelFK_IdTipoIdentificacionCobrador);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrador.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobradorConstantesFunciones.mostrarFK_IdTipoIdentificacionCobrador);
			if(!this.cobradorConstantesFunciones.mostrarFK_IdTipoIdentificacionCobrador && index>-1) {
				this.jTabbedPaneBusquedasCobrador.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrador() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrador.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrador.indexOfComponent(this.jPanelFK_IdTipoIdentificacionCobrador);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrador.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobradorConstantesFunciones.activarFK_IdTipoIdentificacionCobrador);
				this.jTabbedPaneBusquedasCobrador.setEnabledAt(index,this.cobradorConstantesFunciones.activarFK_IdTipoIdentificacionCobrador);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrador(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoIdentificacion")) {
			index= this.jTabbedPaneBusquedasCobrador.indexOfComponent(this.jPanelFK_IdTipoIdentificacionCobrador);

			this.jTabbedPaneBusquedasCobrador.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrador.getComponent(index);

			this.cobradorConstantesFunciones.setResaltarFK_IdTipoIdentificacionCobrador(resaltar);

			jPanel.setBorder(this.cobradorConstantesFunciones.resaltarFK_IdTipoIdentificacionCobrador);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrador.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrador() throws Exception {

		if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrador();
		this.updateVisibilidadResaltarControlesFormularioCobrador();
		this.updateHabilitarResaltarControlesFormularioCobrador();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrador() throws Exception {
		if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobradorConstantesFunciones.resaltaridCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setBorder(this.cobradorConstantesFunciones.resaltaridCobrador);}
		if(this.cobradorConstantesFunciones.resaltarid_tipo_identificacionCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setBorder(this.cobradorConstantesFunciones.resaltarid_tipo_identificacionCobrador);}
		if(this.cobradorConstantesFunciones.resaltaridentificacionCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setBorder(this.cobradorConstantesFunciones.resaltaridentificacionCobrador);}
		if(this.cobradorConstantesFunciones.resaltarapellidoCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setBorder(this.cobradorConstantesFunciones.resaltarapellidoCobrador);}
		if(this.cobradorConstantesFunciones.resaltarnombreCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setBorder(this.cobradorConstantesFunciones.resaltarnombreCobrador);}
		if(this.cobradorConstantesFunciones.resaltardireccionCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setBorder(this.cobradorConstantesFunciones.resaltardireccionCobrador);}
		if(this.cobradorConstantesFunciones.resaltartelefonoCobrador!=null && this.jInternalFrameDetalleFormCobrador!=null) {this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setBorder(this.cobradorConstantesFunciones.resaltartelefonoCobrador);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrador() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
	
		//this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setVisible(this.cobradorConstantesFunciones.mostraridCobrador);
		this.jInternalFrameDetalleFormCobrador.jPanelidCobrador.setVisible(this.cobradorConstantesFunciones.mostraridCobrador);
		//this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setVisible(this.cobradorConstantesFunciones.mostrarid_tipo_identificacionCobrador);
		this.jInternalFrameDetalleFormCobrador.jPanelid_tipo_identificacionCobrador.setVisible(this.cobradorConstantesFunciones.mostrarid_tipo_identificacionCobrador);
		//this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setVisible(this.cobradorConstantesFunciones.mostraridentificacionCobrador);
		this.jInternalFrameDetalleFormCobrador.jPanelidentificacionCobrador.setVisible(this.cobradorConstantesFunciones.mostraridentificacionCobrador);
		//this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setVisible(this.cobradorConstantesFunciones.mostrarapellidoCobrador);
		this.jInternalFrameDetalleFormCobrador.jPanelapellidoCobrador.setVisible(this.cobradorConstantesFunciones.mostrarapellidoCobrador);
		//this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setVisible(this.cobradorConstantesFunciones.mostrarnombreCobrador);
		this.jInternalFrameDetalleFormCobrador.jPanelnombreCobrador.setVisible(this.cobradorConstantesFunciones.mostrarnombreCobrador);
		//this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setVisible(this.cobradorConstantesFunciones.mostrardireccionCobrador);
		this.jInternalFrameDetalleFormCobrador.jPaneldireccionCobrador.setVisible(this.cobradorConstantesFunciones.mostrardireccionCobrador);
		//this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setVisible(this.cobradorConstantesFunciones.mostrartelefonoCobrador);
		this.jInternalFrameDetalleFormCobrador.jPaneltelefonoCobrador.setVisible(this.cobradorConstantesFunciones.mostrartelefonoCobrador);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrador() throws Exception {
		if(this.jInternalFrameDetalleFormCobrador==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrador!=null) {
	
		this.jInternalFrameDetalleFormCobrador.jLabelidCobrador.setEnabled(this.cobradorConstantesFunciones.activaridCobrador);
		this.jInternalFrameDetalleFormCobrador.jComboBoxid_tipo_identificacionCobrador.setEnabled(this.cobradorConstantesFunciones.activarid_tipo_identificacionCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldidentificacionCobrador.setEnabled(this.cobradorConstantesFunciones.activaridentificacionCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldapellidoCobrador.setEnabled(this.cobradorConstantesFunciones.activarapellidoCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldnombreCobrador.setEnabled(this.cobradorConstantesFunciones.activarnombreCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextAreadireccionCobrador.setEnabled(this.cobradorConstantesFunciones.activardireccionCobrador);
		this.jInternalFrameDetalleFormCobrador.jTextFieldtelefonoCobrador.setEnabled(this.cobradorConstantesFunciones.activartelefonoCobrador);
		}
	}
	
		
}